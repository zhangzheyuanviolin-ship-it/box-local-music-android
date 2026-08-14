from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')
start = text.find('  private static String generateHdLong(')
end = text.find('  private static float[] gaussian(', start)
if start < 0 or end < 0:
    raise SystemExit('Expected 0.4.2 generateHdLong block not found')

replacement = r'''  private static String generateHdLong(
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
    writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
    try {
      if (blocks != 2048) {
        throw new IllegalStateException("SoundGen HD Long expects 2048 blocks, got " + blocks);
      }

      stage = "tokenizer parse";
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
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
      float[] mask = new float[256];
      for (int i = 0; i < 256; i++) {
        mask[i] = maskLong[i] == 0L ? 0.0f : 1.0f;
      }

      float[] hidden;
      stage = "text model load CPU";
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
      try (LiteRtRunner textModel = LiteRtRunner.open(new File(dir, "sghd_text.litert"), false)) {
        textModel.requireInputs(2, "SoundGen HD Long text");
        textModel.requireOutputs(1, "SoundGen HD Long text");
        stage = "text tensor write";
        textModel.writeLong(0, tokenIds);
        textModel.writeLong(1, maskLong);
        stage = "text inference CPU";
        writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
        textModel.run();
        stage = "text output read";
        hidden = textModel.readFloat(0);
      }
      tokenIds = null;
      maskLong = null;
      ids = null;
      tokenizer = null;
      stage = "text resources closed";
      System.gc();
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
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

      float[] latent = gaussian(seed, latentSize);
      stage = "core model load CPU";
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
      try (LiteRtRunner core = LiteRtRunner.open(new File(dir, "sghd_core.litert"), false)) {
        core.requireInputs(6, "SoundGen HD Long core");
        core.requireOutputs(1, "SoundGen HD Long core");
        stage = "core conditioning tensor write";
        core.writeFloat(2, hidden);
        core.writeFloat(3, mask);
        core.writeFloat(4, new float[] {duration});
        float[] addCond = new float[addCondSize];
        core.writeFloat(5, addCond);
        addCond = null;
        hidden = null;
        mask = null;

        for (int step = 0; step < 8; step++) {
          stage = "core diffusion step " + (step + 1) + " / 8 tensor write";
          float current = sigma[step];
          float next = sigma[step + 1];
          core.writeFloat(0, latent);
          core.writeFloat(1, new float[] {current});
          stage = "core diffusion step " + (step + 1) + " / 8 inference CPU";
          writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
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
          float[] updated = new float[latent.length];
          if (step < 7) {
            Random noise = new Random(seed + step + 1L);
            for (int i = 0; i < latent.length; i++) {
              float denoised = latent[i] - velocity[i] * current;
              updated[i] =
                  ((float) noise.nextGaussian()) * next + (1.0f - next) * denoised;
            }
          } else {
            for (int i = 0; i < latent.length; i++) {
              updated[i] = latent[i] - velocity[i] * current;
            }
          }
          velocity = null;
          latent = updated;
          progress.accept(0.05f + ((step + 1) * 0.8f / 8.0f));
        }
      }
      sigma = null;
      stage = "core resources closed";
      System.gc();
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);

      float[] waveform;
      stage = "decoder model load CPU";
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
      try (LiteRtRunner decoder =
          LiteRtRunner.open(new File(dir, "sghd_decode.litert"), false)) {
        decoder.requireInputs(1, "SoundGen HD Long decoder");
        decoder.requireOutputs(1, "SoundGen HD Long decoder");
        stage = "decoder tensor write";
        decoder.writeFloat(0, latent);
        latent = null;
        System.gc();
        writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
        stage = "decoder inference CPU";
        writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
        decoder.run();
        stage = "decoder waveform read";
        writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
        waveform = decoder.readFloat(0);
      }
      stage = "decoder resources closed";
      System.gc();
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
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
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, null);
      writeStereoWavStreaming(out, waveform, totalSamples, frames, true);
      waveform = null;
      System.gc();
      progress.accept(1.0f);
      writeLongDiagnostic(context, "COMPLETED", "success", blocks, duration, null);
      return out.getAbsolutePath();
    } catch (Throwable error) {
      try {
        writeLongDiagnostic(context, "FAILED_JAVA", stage, blocks, duration, error);
      } catch (Throwable ignored) {
      }
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
              + ", pssKB="
              + android.os.Debug.getPss()
              + ", heapFreeMB="
              + (runtime.freeMemory() / 1048576L)
              + ", heapTotalMB="
              + (runtime.totalMemory() / 1048576L)
              + ", heapMaxMB="
              + (runtime.maxMemory() / 1048576L),
          error);
    }
  }

  static String previousLongDiagnostic(Context context) {
    try {
      File file = new File(context.getFilesDir(), "soundgen_hd_long_last_run.txt");
      if (!file.isFile()) return "";
      String value = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
      if (value.contains("state=COMPLETED")) return "";
      return value;
    } catch (Throwable ignored) {
      return "";
    }
  }

  private static void writeLongDiagnostic(
      Context context,
      String state,
      String stage,
      int blocks,
      float duration,
      Throwable error)
      throws Exception {
    Runtime runtime = Runtime.getRuntime();
    String proc = "";
    try {
      proc = new String(
          Files.readAllBytes(new File("/proc/self/status").toPath()), StandardCharsets.UTF_8);
    } catch (Throwable ignored) {
    }
    StringBuilder out = new StringBuilder();
    out.append("BOX LOCAL MUSIC LONG DIAGNOSTIC\n");
    out.append("Version: 0.4.3 (code 8)\n");
    out.append("state=").append(state).append('\n');
    out.append("stage=").append(stage).append('\n');
    out.append("timestampMs=").append(System.currentTimeMillis()).append('\n');
    out.append("blocks=").append(blocks).append('\n');
    out.append("requestedDuration=").append(duration).append('\n');
    out.append("accelerator=CPU\n");
    out.append("pssKB=").append(android.os.Debug.getPss()).append('\n');
    out.append("heapFreeMB=").append(runtime.freeMemory() / 1048576L).append('\n');
    out.append("heapTotalMB=").append(runtime.totalMemory() / 1048576L).append('\n');
    out.append("heapMaxMB=").append(runtime.maxMemory() / 1048576L).append('\n');
    out.append("VmPeak=").append(procMetric(proc, "VmPeak:")).append('\n');
    out.append("VmHWM=").append(procMetric(proc, "VmHWM:")).append('\n');
    out.append("VmRSS=").append(procMetric(proc, "VmRSS:")).append('\n');
    out.append("RssAnon=").append(procMetric(proc, "RssAnon:")).append('\n');
    out.append("RssFile=").append(procMetric(proc, "RssFile:")).append('\n');
    out.append("VmSwap=").append(procMetric(proc, "VmSwap:")).append('\n');
    if (error != null) {
      out.append("error=")
          .append(error.getClass().getName())
          .append(": ")
          .append(error.getMessage())
          .append('\n');
    }
    Files.write(
        new File(context.getFilesDir(), "soundgen_hd_long_last_run.txt").toPath(),
        out.toString().getBytes(StandardCharsets.UTF_8));
  }

  private static String procMetric(String proc, String key) {
    if (proc == null || proc.isEmpty()) return "unavailable";
    for (String line : proc.split("\\n")) {
      if (line.startsWith(key)) return line.substring(key.length()).trim();
    }
    return "unavailable";
  }

'''

text = text[:start] + replacement + text[end:]
engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('Box Local Music 0.4.2', 'Box Local Music 0.4.3')
ui = ui.replace('Version: 0.4.2 (code 7)', 'Version: 0.4.3 (code 8)')
ready = '    statusView = addText("Ready");\n'
if ready not in ui:
    raise SystemExit('Expected Ready status line not found')
ui = ui.replace(
    ready,
    '''    statusView = addText("Ready");\n    String previousLongDiagnostic = OfficialSoundGenEngine.previousLongDiagnostic(this);\n    if (!previousLongDiagnostic.isEmpty()) {\n      statusView.setText(\n          "Previous SoundGen HD Long run did not complete. Last persisted checkpoint:\\n"\n              + previousLongDiagnostic);\n    }\n''',
    1)
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.3 SoundGen HD Long staged-memory patch')
