package com.boxlocal.music;

import android.content.Context;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;

final class OfficialSoundGenEngine {
  private OfficialSoundGenEngine() {}

  static String generate(
      Context context,
      ModelSpec model,
      File modelDir,
      String prompt,
      float durationSeconds,
      Consumer<Float> progress)
      throws Exception {
    if (!model.isReady(modelDir)) {
      throw new IllegalStateException("Model files are not fully downloaded.");
    }
    if (prompt == null || prompt.trim().isEmpty()) {
      throw new IllegalArgumentException("Prompt is empty.");
    }
    if ("soundgen_hd_long".equals(model.id)) {
      throw new UnsupportedOperationException(
          "SoundGen HD Long is disabled in 0.4.0 while the short HD path is validated.");
    }
    long seed = 42L;
    if (model.soundGenBlocks == 0) {
      return generateBasic(context, modelDir, prompt, durationSeconds, seed, progress);
    }
    return generateHd(context, model, modelDir, prompt, durationSeconds, seed, progress);
  }

  private static String generateBasic(
      Context context,
      File dir,
      String prompt,
      float duration,
      long seed,
      Consumer<Float> progress)
      throws Exception {
    SentencePiece tokenizer = SentencePiece.parse(Files.readAllBytes(new File(dir, "sg_vocab.spm").toPath()));
    int[] ids = tokenizer.encodeUnigramLikeBox(prompt);
    long[] tokenIds = new long[128];
    long[] mask = new long[128];
    for (int i = 0; i < Math.min(ids.length, 128); i++) {
      tokenIds[i] = ids[i];
      mask[i] = 1L;
    }

    try (LiteRtRunner text = LiteRtRunner.open(new File(dir, "sg_text.litert"), true)) {
      text.requireInputs(3, "SoundGen text");
      text.requireOutputs(3, "SoundGen text");
      text.writeLong(0, tokenIds);
      text.writeLong(1, mask);
      text.writeFloat(2, new float[] {duration});
      text.run();
      float[] cond0 = text.readFloat(0);
      float[] cond2 = text.readFloat(2);
      progress.accept(0.10f);

      try (LiteRtRunner core = LiteRtRunner.open(new File(dir, "sg_core.litert"), true)) {
        core.requireInputs(4, "SoundGen core");
        core.requireOutputs(1, "SoundGen core");
        core.writeFloat(0, cond0);
        core.writeFloat(1, cond2);

        float[] sigma = new float[9];
        for (int i = 0; i <= 8; i++) {
          sigma[i] = (float) (1.0 / (Math.exp(-6.0 + i) + 1.0));
        }
        sigma[0] = 1.0f;
        sigma[8] = 0.0f;

        float[] latent = gaussian(seed, 16384);
        for (int step = 0; step < 8; step++) {
          float current = sigma[step];
          float next = sigma[step + 1];
          core.writeFloat(2, latent);
          core.writeFloat(3, new float[] {current});
          core.run();
          float[] velocity = core.readFloat(0);
          if (velocity.length != latent.length) {
            throw new IllegalStateException(
                "SoundGen core output size " + velocity.length + ", expected " + latent.length);
          }
          float[] noise = gaussian(seed + step + 4564L, latent.length);
          float[] updated = new float[latent.length];
          for (int i = 0; i < latent.length; i++) {
            float denoised = latent[i] - velocity[i] * current;
            updated[i] = noise[i] * next + (1.0f - next) * denoised;
          }
          latent = updated;
          progress.accept(0.10f + ((step + 1) * 0.8f / 8.0f));
        }

        try (LiteRtRunner decoder = LiteRtRunner.open(new File(dir, "sg_decode.litert"), true)) {
          decoder.requireInputs(1, "SoundGen decoder");
          decoder.requireOutputs(1, "SoundGen decoder");
          decoder.writeFloat(0, latent);
          decoder.run();
          float[] waveform = decoder.readFloat(0);
          progress.accept(0.95f);
          int plane = 524288;
          if (waveform.length < plane * 2) {
            throw new IllegalStateException(
                "SoundGen decoder output size " + waveform.length + ", expected at least " + (plane * 2));
          }
          int frames = Math.min(plane, Math.max(1, Math.round(duration * 44100.0f)));
          File outDir = new File(context.getCacheDir(), "soundgen");
          outDir.mkdirs();
          File out = new File(outDir, "soundgen_" + System.currentTimeMillis() + ".wav");
          writeStereoWav(out, waveform, plane, frames, false);
          progress.accept(1.0f);
          return out.getAbsolutePath();
        }
      }
    }
  }

  private static String generateHd(
      Context context,
      ModelSpec model,
      File dir,
      String prompt,
      float duration,
      long seed,
      Consumer<Float> progress)
      throws Exception {
    int blocks = model.soundGenBlocks;
    int latentSize = blocks * 256;
    int addCondSize = blocks * 257;
    int totalSamples = blocks * 4096;
    SentencePiece tokenizer = SentencePiece.parse(Files.readAllBytes(new File(dir, "sghd_vocab.spm").toPath()));
    int[] ids = tokenizer.encodeBpeLikeBox(prompt);
    long[] tokenIds = new long[256];
    long[] maskLong = new long[256];
    for (int i = 0; i < Math.min(ids.length, 256); i++) {
      tokenIds[i] = ids[i];
      maskLong[i] = 1L;
    }

    try (LiteRtRunner text = LiteRtRunner.open(new File(dir, "sghd_text.litert"), false)) {
      text.requireInputs(2, "SoundGen HD text");
      text.requireOutputs(1, "SoundGen HD text");
      text.writeLong(0, tokenIds);
      text.writeLong(1, maskLong);
      text.run();
      float[] hidden = text.readFloat(0);
      float[] mask = new float[256];
      for (int i = 0; i < 256; i++) {
        mask[i] = maskLong[i] == 0L ? 0.0f : 1.0f;
      }
      progress.accept(0.05f);

      int clamped = Math.max(256, Math.min(blocks, 4096));
      float shift =
          (float)
              Math.exp(-((((clamped - 256) * 0.65f) / 3840.0f) + 0.5f));
      float[] sigma = new float[9];
      for (int step = 0; step <= 8; step++) {
        float f = 1.0f - (step / 8.0f);
        if (f >= 1.0f) {
          sigma[step] = 1.0f;
        } else if (f <= 0.0f) {
          sigma[step] = 0.0f;
        } else {
          sigma[step] = 1.0f - (shift / (((1.0f / (1.0f - f)) - 1.0f) + shift));
        }
      }
      sigma[0] = 1.0f;

      try (LiteRtRunner core = LiteRtRunner.open(new File(dir, "sghd_core.litert"), false)) {
        core.requireInputs(6, "SoundGen HD core");
        core.requireOutputs(1, "SoundGen HD core");
        core.writeFloat(2, hidden);
        core.writeFloat(3, mask);
        core.writeFloat(4, new float[] {duration});
        core.writeFloat(5, new float[addCondSize]);

        float[] latent = gaussian(seed, latentSize);
        for (int step = 0; step < 8; step++) {
          float current = sigma[step];
          float next = sigma[step + 1];
          core.writeFloat(0, latent);
          core.writeFloat(1, new float[] {current});
          core.run();
          float[] velocity = core.readFloat(0);
          if (velocity.length != latent.length) {
            throw new IllegalStateException(
                "SoundGen HD core output size " + velocity.length + ", expected " + latent.length);
          }
          float[] noise = step < 7 ? gaussian(seed + step + 1L, latent.length) : null;
          float[] updated = new float[latent.length];
          for (int i = 0; i < latent.length; i++) {
            float denoised = latent[i] - velocity[i] * current;
            if (noise != null) {
              denoised = noise[i] * next + (1.0f - next) * denoised;
            }
            updated[i] = denoised;
          }
          latent = updated;
          progress.accept(0.05f + ((step + 1) * 0.8f / 8.0f));
        }

        try (LiteRtRunner decoder = LiteRtRunner.open(new File(dir, "sghd_decode.litert"), false)) {
          decoder.requireInputs(1, "SoundGen HD decoder");
          decoder.requireOutputs(1, "SoundGen HD decoder");
          decoder.writeFloat(0, latent);
          decoder.run();
          float[] waveform = decoder.readFloat(0);
          progress.accept(0.97f);
          if (waveform.length < totalSamples * 2) {
            throw new IllegalStateException(
                "SoundGen HD decoder output size " + waveform.length + ", expected at least " + (totalSamples * 2));
          }
          int frames = Math.min(totalSamples, Math.max(1, Math.round(duration * 44100.0f)));
          File outDir = new File(context.getCacheDir(), "soundgenhd");
          outDir.mkdirs();
          File out = new File(outDir, "soundgenhd_" + System.currentTimeMillis() + ".wav");
          writeStereoWav(out, waveform, totalSamples, frames, true);
          progress.accept(1.0f);
          return out.getAbsolutePath();
        }
      }
    }
  }

  private static float[] gaussian(long seed, int size) {
    Random random = new Random(seed);
    float[] values = new float[size];
    for (int i = 0; i < size; i++) {
      values[i] = (float) random.nextGaussian();
    }
    return values;
  }

  private static void writeStereoWav(
      File file, float[] waveform, int plane, int frames, boolean normalize) throws Exception {
    float gain = 1.0f;
    if (normalize) {
      float peak = 0.0f;
      for (float value : waveform) {
        peak = Math.max(peak, Math.abs(value));
      }
      if (peak > 1.0e-6f) {
        gain = 1.0f / peak;
      }
    }
    int dataBytes = frames * 4;
    try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
      raf.setLength(0L);
      ByteBuffer header = ByteBuffer.allocate(44).order(ByteOrder.LITTLE_ENDIAN);
      header.put("RIFF".getBytes(StandardCharsets.US_ASCII));
      header.putInt(dataBytes + 36);
      header.put("WAVE".getBytes(StandardCharsets.US_ASCII));
      header.put("fmt ".getBytes(StandardCharsets.US_ASCII));
      header.putInt(16);
      header.putShort((short) 1);
      header.putShort((short) 2);
      header.putInt(44100);
      header.putInt(176400);
      header.putShort((short) 4);
      header.putShort((short) 16);
      header.put("data".getBytes(StandardCharsets.US_ASCII));
      header.putInt(dataBytes);
      raf.write(header.array());
      ByteBuffer pcm = ByteBuffer.allocate(dataBytes).order(ByteOrder.LITTLE_ENDIAN);
      for (int i = 0; i < frames; i++) {
        float left = clamp(waveform[i] * gain);
        float right = clamp(waveform[plane + i] * gain);
        pcm.putShort((short) Math.round(left * 32767.0f));
        pcm.putShort((short) Math.round(right * 32767.0f));
      }
      raf.write(pcm.array());
    }
  }

  private static float clamp(float value) {
    return value > 1.0f ? 1.0f : value < -1.0f ? -1.0f : value;
  }

  private static final class LiteRtRunner implements AutoCloseable {
    private final Object model;
    private final List<?> inputs;
    private final List<?> outputs;

    private LiteRtRunner(Object model, List<?> inputs, List<?> outputs) {
      this.model = model;
      this.inputs = inputs;
      this.outputs = outputs;
    }

    static LiteRtRunner open(File file, boolean allowGpu) throws Exception {
      if (!file.isFile()) {
        throw new IllegalStateException("Missing model file: " + file.getAbsolutePath());
      }
      if (allowGpu) {
        try {
          return create(file, new String[] {"GPU", "CPU"});
        } catch (Throwable ignored) {
          return create(file, new String[] {"CPU"});
        }
      }
      return create(file, new String[] {"CPU"});
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static LiteRtRunner create(File file, String[] accelerators) throws Exception {
      Class<?> compiled = Class.forName("com.google.ai.edge.litert.CompiledModel");
      Class<?> accelerator = Class.forName("com.google.ai.edge.litert.Accelerator");
      Class<?> options = Class.forName("com.google.ai.edge.litert.CompiledModel$Options");
      Object array = Array.newInstance(accelerator, accelerators.length);
      for (int i = 0; i < accelerators.length; i++) {
        Array.set(array, i, Enum.valueOf((Class<? extends Enum>) accelerator, accelerators[i]));
      }
      Constructor<?> optionsCtor = options.getConstructor(array.getClass());
      Object optionValue = optionsCtor.newInstance(array);
      Object model = createCompiledModel(compiled, file.getAbsolutePath(), optionValue);
      List<?> inputs = createBuffers(compiled, model, true);
      List<?> outputs = createBuffers(compiled, model, false);
      return new LiteRtRunner(model, inputs, outputs);
    }

    private static Object createCompiledModel(Class<?> compiled, String path, Object options)
        throws Exception {
      for (Method method : compiled.getMethods()) {
        if (!method.getName().equals("create") || !Modifier.isStatic(method.getModifiers())) {
          continue;
        }
        Class<?>[] p = method.getParameterTypes();
        if (p.length >= 2 && p[0] == String.class && p[1].isInstance(options)) {
          Object[] args = new Object[p.length];
          args[0] = path;
          args[1] = options;
          for (int i = 2; i < p.length; i++) args[i] = null;
          return method.invoke(null, args);
        }
      }
      Object companion = compiled.getField("INSTANCE").get(null);
      for (Method method : companion.getClass().getMethods()) {
        if (!method.getName().equals("create")) continue;
        Class<?>[] p = method.getParameterTypes();
        if (p.length >= 2 && p[0] == String.class && p[1].isInstance(options)) {
          Object[] args = new Object[p.length];
          args[0] = path;
          args[1] = options;
          for (int i = 2; i < p.length; i++) args[i] = null;
          return method.invoke(companion, args);
        }
      }
      throw new NoSuchMethodException("LiteRT CompiledModel.create(String, Options, ...) not found");
    }

    private static List<?> createBuffers(Class<?> compiled, Object model, boolean input)
        throws Exception {
      String name = input ? "createInputBuffers" : "createOutputBuffers";
      try {
        Method zero = model.getClass().getMethod(name);
        return (List<?>) zero.invoke(model);
      } catch (NoSuchMethodException ignored) {
      }
      String defaultName = name + "$default";
      for (Method method : compiled.getMethods()) {
        if (!method.getName().equals(defaultName) || !Modifier.isStatic(method.getModifiers())) continue;
        Class<?>[] p = method.getParameterTypes();
        Object[] args = new Object[p.length];
        args[0] = model;
        for (int i = 1; i < p.length; i++) {
          if (p[i] == int.class) args[i] = i == 1 ? 0 : 1;
          else args[i] = null;
        }
        return (List<?>) method.invoke(null, args);
      }
      try {
        Method withIndex = model.getClass().getMethod(name, int.class);
        return (List<?>) withIndex.invoke(model, 0);
      } catch (NoSuchMethodException ignored) {
      }
      throw new NoSuchMethodException("LiteRT " + name + " not found");
    }

    void requireInputs(int count, String name) {
      if (inputs.size() < count) {
        throw new IllegalStateException(
            name + " exposes " + inputs.size() + " inputs; Box v3.3.3 expects at least " + count);
      }
    }

    void requireOutputs(int count, String name) {
      if (outputs.size() < count) {
        throw new IllegalStateException(
            name + " exposes " + outputs.size() + " outputs; Box v3.3.3 expects at least " + count);
      }
    }

    void writeLong(int index, long[] values) throws Exception {
      invokeTensor(inputs.get(index), "writeLong", long[].class, values);
    }

    void writeFloat(int index, float[] values) throws Exception {
      invokeTensor(inputs.get(index), "writeFloat", float[].class, values);
    }

    float[] readFloat(int index) throws Exception {
      return (float[]) outputs.get(index).getClass().getMethod("readFloat").invoke(outputs.get(index));
    }

    void run() throws Exception {
      for (Method method : model.getClass().getMethods()) {
        if (!method.getName().equals("run") || method.getParameterCount() != 2) continue;
        method.invoke(model, inputs, outputs);
        return;
      }
      Class<?> compiled = model.getClass();
      for (Method method : compiled.getMethods()) {
        if (!method.getName().equals("run$default") || !Modifier.isStatic(method.getModifiers())) continue;
        Class<?>[] p = method.getParameterTypes();
        Object[] args = new Object[p.length];
        args[0] = model;
        args[1] = inputs;
        args[2] = outputs;
        for (int i = 3; i < p.length; i++) {
          if (p[i] == int.class) args[i] = i == 3 ? 0 : 4;
          else args[i] = null;
        }
        method.invoke(null, args);
        return;
      }
      throw new NoSuchMethodException("LiteRT run(inputs, outputs) not found");
    }

    private static void invokeTensor(Object tensor, String name, Class<?> type, Object value)
        throws Exception {
      tensor.getClass().getMethod(name, type).invoke(tensor, value);
    }

    @Override
    public void close() {
      closeAll(inputs);
      closeAll(outputs);
      try {
        model.getClass().getMethod("close").invoke(model);
      } catch (Throwable ignored) {
      }
    }

    private static void closeAll(List<?> list) {
      for (Object value : list) {
        try {
          value.getClass().getMethod("close").invoke(value);
        } catch (Throwable ignored) {
        }
      }
    }
  }

  private static final class SentencePiece {
    private final List<Piece> pieces;
    private final Map<String, Integer> vocab;
    private final float[] scores;
    private final int maxPieceLength;
    private final int unknownId;
    private final int[] byteIds;
    private final float unknownPenalty;

    private SentencePiece(
        List<Piece> pieces,
        Map<String, Integer> vocab,
        float[] scores,
        int maxPieceLength,
        int unknownId,
        int[] byteIds,
        float unknownPenalty) {
      this.pieces = pieces;
      this.vocab = vocab;
      this.scores = scores;
      this.maxPieceLength = maxPieceLength;
      this.unknownId = unknownId;
      this.byteIds = byteIds;
      this.unknownPenalty = unknownPenalty;
    }

    static SentencePiece parse(byte[] bytes) {
      ProtoReader reader = new ProtoReader(bytes, 0, bytes.length);
      List<Piece> pieces = new ArrayList<>();
      while (!reader.eof()) {
        long tag = reader.varint();
        int field = (int) (tag >>> 3);
        int wire = (int) (tag & 7);
        if (field == 1 && wire == 2) {
          ProtoReader sub = reader.subReader();
          String text = "";
          float score = 0.0f;
          int type = 1;
          while (!sub.eof()) {
            long inner = sub.varint();
            int innerField = (int) (inner >>> 3);
            int innerWire = (int) (inner & 7);
            if (innerField == 1 && innerWire == 2) text = sub.string();
            else if (innerField == 2 && innerWire == 5) score = Float.intBitsToFloat(sub.fixed32());
            else if (innerField == 3 && innerWire == 0) type = (int) sub.varint();
            else sub.skip(innerWire);
          }
          pieces.add(new Piece(text, score, type, pieces.size()));
        } else {
          reader.skip(wire);
        }
      }
      if (pieces.isEmpty()) throw new IllegalStateException("SentencePiece model contains no pieces.");
      float[] scores = new float[pieces.size()];
      Map<String, Integer> vocab = new HashMap<>(pieces.size() * 2);
      int[] byteIds = new int[256];
      Arrays.fill(byteIds, -1);
      int unknownId = 2;
      int maxLen = 1;
      float minNormal = 0.0f;
      for (Piece piece : pieces) {
        scores[piece.id] = piece.score;
        if (piece.type == 2) unknownId = piece.id;
        if (piece.type == 6
            && piece.text.length() == 6
            && piece.text.startsWith("<0x")
            && piece.text.endsWith(">")) {
          try {
            int value = Integer.parseInt(piece.text.substring(3, 5), 16);
            if (value >= 0 && value < 256) byteIds[value] = piece.id;
          } catch (NumberFormatException ignored) {
          }
        } else if (piece.type != 2 && !piece.text.isEmpty()) {
          vocab.put(piece.text, piece.id);
        }
        if ((piece.type == 1 || piece.type == 4) && !piece.text.isEmpty()) {
          maxLen = Math.max(maxLen, piece.text.length());
          minNormal = Math.min(minNormal, piece.score);
        }
      }
      return new SentencePiece(pieces, vocab, scores, maxLen, unknownId, byteIds, minNormal - 10.0f);
    }

    int[] encodeUnigramLikeBox(String input) {
      String cleaned = Normalizer.normalize(input, Normalizer.Form.NFKC).trim().replaceAll("\\s+", " ");
      String text = "▁" + cleaned.replace(' ', '▁');
      if (text.isEmpty()) return new int[] {1};
      float[] best = new float[text.length() + 1];
      Arrays.fill(best, -1.0e30f);
      int[] prev = new int[text.length() + 1];
      int[] token = new int[text.length() + 1];
      Arrays.fill(prev, -1);
      Arrays.fill(token, 2);
      best[0] = 0.0f;
      for (int pos = 0; pos < text.length(); pos++) {
        if (best[pos] <= -1.0e29f) continue;
        int maxLen = Math.min(maxPieceLength, text.length() - pos);
        for (int len = 1; len <= maxLen; len++) {
          Integer id = vocab.get(text.substring(pos, pos + len));
          if (id == null) continue;
          float score = best[pos] + scores[id];
          if (score > best[pos + len]) {
            best[pos + len] = score;
            prev[pos + len] = pos;
            token[pos + len] = id;
          }
        }
        int next = pos + 1;
        float fallback = best[pos] + unknownPenalty;
        if (fallback > best[next]) {
          best[next] = fallback;
          prev[next] = pos;
          token[next] = 2;
        }
      }
      List<Integer> out = new ArrayList<>();
      int p = text.length();
      while (p > 0 && prev[p] >= 0) {
        out.add(token[p]);
        p = prev[p];
      }
      Collections.reverse(out);
      out.add(1);
      return toIntArray(out);
    }

    int[] encodeBpeLikeBox(String input) {
      String replaced = input.replace(' ', '▁');
      List<String> units = new ArrayList<>();
      for (int offset = 0; offset < replaced.length(); ) {
        int cp = replaced.codePointAt(offset);
        int next = offset + Character.charCount(cp);
        units.add(replaced.substring(offset, next));
        offset = next;
      }
      while (units.size() > 1) {
        float bestScore = Float.NEGATIVE_INFINITY;
        int bestIndex = -1;
        for (int i = 0; i < units.size() - 1; i++) {
          Integer id = vocab.get(units.get(i) + units.get(i + 1));
          if (id == null) continue;
          float score = scores[id];
          if (score > bestScore) {
            bestScore = score;
            bestIndex = i;
          }
        }
        if (bestIndex < 0) break;
        units.set(bestIndex, units.get(bestIndex) + units.get(bestIndex + 1));
        units.remove(bestIndex + 1);
      }
      List<Integer> out = new ArrayList<>();
      for (String unit : units) {
        Integer id = vocab.get(unit);
        if (id != null) {
          out.add(id);
          continue;
        }
        for (byte value : unit.getBytes(StandardCharsets.UTF_8)) {
          int byteId = byteIds[value & 255];
          out.add(byteId >= 0 ? byteId : unknownId);
        }
      }
      return toIntArray(out);
    }

    private static int[] toIntArray(List<Integer> values) {
      int[] result = new int[values.size()];
      for (int i = 0; i < values.size(); i++) result[i] = values.get(i);
      return result;
    }
  }

  private static final class Piece {
    final String text;
    final float score;
    final int type;
    final int id;

    Piece(String text, float score, int type, int id) {
      this.text = text;
      this.score = score;
      this.type = type;
      this.id = id;
    }
  }

  private static final class ProtoReader {
    private final byte[] data;
    private int pos;
    private final int end;

    ProtoReader(byte[] data, int pos, int end) {
      this.data = data;
      this.pos = pos;
      this.end = end;
    }

    boolean eof() {
      return pos >= end;
    }

    long varint() {
      int shift = 0;
      long value = 0L;
      while (shift < 64) {
        if (pos >= end) throw new IllegalStateException("Truncated protobuf varint.");
        int b = data[pos++] & 255;
        value |= ((long) (b & 127)) << shift;
        if ((b & 128) == 0) return value;
        shift += 7;
      }
      throw new IllegalStateException("Malformed protobuf varint.");
    }

    int fixed32() {
      if (pos + 4 > end) throw new IllegalStateException("Truncated protobuf fixed32.");
      int value =
          (data[pos] & 255)
              | ((data[pos + 1] & 255) << 8)
              | ((data[pos + 2] & 255) << 16)
              | ((data[pos + 3] & 255) << 24);
      pos += 4;
      return value;
    }

    String string() {
      int length = (int) varint();
      if (length < 0 || pos + length > end) throw new IllegalStateException("Truncated protobuf string.");
      String value = new String(data, pos, length, StandardCharsets.UTF_8);
      pos += length;
      return value;
    }

    ProtoReader subReader() {
      int length = (int) varint();
      if (length < 0 || pos + length > end) throw new IllegalStateException("Truncated protobuf message.");
      ProtoReader sub = new ProtoReader(data, pos, pos + length);
      pos += length;
      return sub;
    }

    void skip(int wire) {
      if (wire == 0) {
        varint();
      } else if (wire == 1) {
        ensure(8);
        pos += 8;
      } else if (wire == 2) {
        int n = (int) varint();
        ensure(n);
        pos += n;
      } else if (wire == 5) {
        ensure(4);
        pos += 4;
      } else {
        throw new IllegalStateException("Unsupported protobuf wire type " + wire);
      }
    }

    private void ensure(int n) {
      if (n < 0 || pos + n > end) throw new IllegalStateException("Truncated protobuf field.");
    }
  }
}
