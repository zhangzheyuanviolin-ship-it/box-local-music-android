package com.boxlocal.music;

import android.content.Context;
import java.io.File;
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
    return BoxMusicEngine.generate(
        context,
        model,
        modelDir,
        prompt,
        durationSeconds,
        42L,
        value -> progress.accept(value));
  }
}
