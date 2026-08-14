from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

old_dispatch = '''    if ("soundgen_hd_long".equals(model.id)) {
      throw new UnsupportedOperationException(
          "SoundGen HD Long is disabled in 0.4.0 while the short HD path is validated.");
    }
    long seed = 42L;
    if (model.soundGenBlocks == 0) {
      return generateBasic(context, modelDir, prompt, durationSeconds, seed, progress);
    }
    return generateHd(context, model, modelDir, prompt, durationSeconds, seed, progress);
'''
new_dispatch = '''    long seed = 42L;
    if (model.soundGenBlocks == 0) {
      return generateBasic(context, modelDir, prompt, durationSeconds, seed, progress);
    }
    if ("soundgen_hd_long".equals(model.id)) {
      return generateHdLong(context, model, modelDir, prompt, durationSeconds, seed, progress);
    }
    return generateHd(context, model, modelDir, prompt, durationSeconds, seed, progress);
'''
if old_dispatch not in text:
    raise SystemExit('Expected SoundGen HD Long guard not found')
text = text.replace(old_dispatch, new_dispatch, 1)

marker = '''  private static float[] gaussian(long seed, int size) {'''
if marker not in text:
    raise SystemExit('Gaussian marker not found')

long_method = r'''  private static String generateHdLong(
      Context context,
      ModelSpec model,
      File dir,
      String prompt,
      float duration,
      long seed,
      Consumer<Float> progress)
      throws Exception {
    final int blocks = model.soundGenBlocks;
    final int latentSize = blocks * 256;
    final int addCondSize = blocks * 257;
    final int totalSamples = blocks * 4096;
    String stage = "initialization";
    try {
      if (blocks != 2048) {
        throw new IllegalStateException("SoundGen HD Long expects 2048 blocks, got " + blocks);
      }

      stage = "tokenizer parse";
      SentencePiece tokenizer =
          SentencePiece.parse(Files.readAllBytes(new File(dir, "sghd_vocab.spm").toPath()));
      stage = "tokenizer encode";
      int[] ids = tokenizer.encodeBpeLikeBox(prompt);
      long[] tokenIds = new long[256];
      long[] maskLong = new long[256];
      for (int i = 0; i < Math.min(ids.length, 256); i++) {
        tokenIds[i] = ids[i];
        maskLong[i] = 1L;
      }

      stage = "text model load CPU";
      try (LiteRtRunner textModel = LiteRtRunner.open(new File(dir, "sghd_text.litert"), false)) {
        textModel.requireInputs(2, "SoundGen HD Long text");
        textModel.requireOutputs(1, "SoundGen HD Long text");
        stage = "text tensor write";
        textModel.writeLong(0, tokenIds);
        textModel.writeLong(1, maskLong);
        stage = "text inference CPU";
        textModel.run();
        stage = "text output read";
        float[] hidden = textModel.readFloat(0);
        float[] mask = new float[256];
        for (int i = 0; i < 256; i++) {
          mask[i] = maskLong[i] == 0L ? 0.0f : 1.0f;
        }
        progress.accept(0.05f);

        int clamped = Math.max(256, Math.min(blocks, 4096));
        float shift =
            (float) Math.exp(-((((clamped - 256) * 0.65f) / 3840.0f) + 0.5f));
        float[] sigma = new float[9];
        for (int step = 0; step <= 8; step++) {
          float f = 1.0f - (step / 8.0f);
          if (f >= 1.0f) {
            sigma[step] = 1.0f;
          } else if (f <= 0.0f) {
            sigma[step] = 0.0f;
          } else {
            sigma[step] =
                1.0f - (shift / (((1.0f / (1.0f - f)) - 1.0f) + shift));
          }
        }
        sigma[0] = 1.0f;

        stage = "core model load CPU";
        try (LiteRtRunner core = LiteRtRunner.open(new File(dir, "sghd_core.litert"), false)) {
          core.requireInputs(6, "SoundGen HD Long core");
          core.requireOutputs(1, "SoundGen HD Long core");
          stage = "core conditioning tensor write";
          core.writeFloat(2, hidden);
          core.writeFloat(3, mask);
          core.writeFloat(4, new float[] {duration});
          core.writeFloat(5, new float[addCondSize]);

          float[] latent = gaussian(seed, latentSize);
          for (int step = 0; step < 8; step++) {
            stage = "core diffusion step " + (step + 1) + " / 8 tensor write";
            float current = sigma[step];
            float next = sigma[step + 1];
            core.writeFloat(0, latent);
            core.writeFloat(1, new float[] {current});
            stage = "core diffusion step " + (step + 1) + " / 8 inference CPU";
            core.run();
            stage = "core diffusion step " + (step + 1) + " / 8 output read";
            float[] velocity = core.readFloat(0);
            if (velocity.length != latent.length) {
              throw new IllegalStateException(
                  "SoundGen HD Long core output size "
                      + velocity.length
                      + ", expected "
                      + latent.length);
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

          stage = "decoder model load CPU";
          try (LiteRtRunner decoder =
              LiteRtRunner.open(new File(dir, "sghd_decode.litert"), false)) {
            decoder.requireInputs(1, "SoundGen HD Long decoder");
            decoder.requireOutputs(1, "SoundGen HD Long decoder");
            stage = "decoder tensor write";
            decoder.writeFloat(0, latent);
            stage = "decoder inference CPU";
            decoder.run();
            stage = "decoder waveform read";
            float[] waveform = decoder.readFloat(0);
            progress.accept(0.97f);
            if (waveform.length < totalSamples * 2) {
              throw new IllegalStateException(
                  "SoundGen HD Long decoder output size "
                      + waveform.length
                      + ", expected at least "
                      + (totalSamples * 2));
            }
            int frames =
                Math.min(totalSamples, Math.max(1, Math.round(duration * 44100.0f)));
            File outDir = new File(context.getCacheDir(), "soundgenhdlong");
            outDir.mkdirs();
            File out =
                new File(outDir, "soundgenhdlong_" + System.currentTimeMillis() + ".wav");
            stage = "streaming WAV write";
            writeStereoWavStreaming(out, waveform, totalSamples, frames, true);
            progress.accept(1.0f);
            return out.getAbsolutePath();
          }
        }
      }
    } catch (Throwable error) {
      Runtime runtime = Runtime.getRuntime();
      throw new Exception(
          "SoundGen HD Long failed. stage="
              + stage
              + ", accelerator=CPU"
              + ", blocks="
              + blocks
              + ", requestedDuration="
              + duration
              + ", latentFloats="
              + latentSize
              + ", samplesPerChannel="
              + totalSamples
              + ", heapFreeMB="
              + (runtime.freeMemory() / 1048576L)
              + ", heapTotalMB="
              + (runtime.totalMemory() / 1048576L)
              + ", heapMaxMB="
              + (runtime.maxMemory() / 1048576L),
          error);
    }
  }

  private static void writeStereoWavStreaming(
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
    int dataBytes = Math.multiplyExact(frames, 4);
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

      final int chunkFrames = 16384;
      byte[] chunkBytes = new byte[chunkFrames * 4];
      ByteBuffer pcm = ByteBuffer.wrap(chunkBytes).order(ByteOrder.LITTLE_ENDIAN);
      for (int start = 0; start < frames; start += chunkFrames) {
        int count = Math.min(chunkFrames, frames - start);
        pcm.clear();
        for (int i = 0; i < count; i++) {
          int frame = start + i;
          float left = clamp(waveform[frame] * gain);
          float right = clamp(waveform[plane + frame] * gain);
          pcm.putShort((short) Math.round(left * 32767.0f));
          pcm.putShort((short) Math.round(right * 32767.0f));
        }
        raf.write(chunkBytes, 0, count * 4);
      }
    }
  }

'''
text = text.replace(marker, long_method + marker, 1)
engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('Box Local Music 0.4.1', 'Box Local Music 0.4.2')
ui = ui.replace('Version: 0.4.1 (code 6)', 'Version: 0.4.2 (code 7)')
old_status = '    statusView.setText("Loading official Box SoundGen engine...");\n'
new_status = '''    if ("soundgen_hd_long".equals(model.id)) {
      Runtime runtime = Runtime.getRuntime();
      statusView.setText(
          "Loading SoundGen HD Long. Accelerator: CPU. Blocks: 2048. Requested duration: "
              + durationSeconds
              + "s. Heap MB free="
              + (runtime.freeMemory() / 1048576L)
              + ", total="
              + (runtime.totalMemory() / 1048576L)
              + ", max="
              + (runtime.maxMemory() / 1048576L));
    } else {
      statusView.setText("Loading official Box SoundGen engine...");
    }
'''
if old_status not in ui:
    raise SystemExit('Expected generation loading status not found')
ui = ui.replace(old_status, new_status, 1)
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.2 SoundGen HD Long patch')
