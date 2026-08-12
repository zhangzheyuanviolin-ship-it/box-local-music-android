package com.boxlocal.music;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class ModelSpec {
  final String id;
  final String name;
  final String description;
  final int minDurationSec;
  final int maxDurationSec;
  final int defaultDurationSec;
  final int soundGenBlocks;
  final List<ModelFileSpec> files;

  private ModelSpec(
      String id,
      String name,
      String description,
      int minDurationSec,
      int maxDurationSec,
      int defaultDurationSec,
      int soundGenBlocks,
      List<ModelFileSpec> files) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.minDurationSec = minDurationSec;
    this.maxDurationSec = maxDurationSec;
    this.defaultDurationSec = defaultDurationSec;
    this.soundGenBlocks = soundGenBlocks;
    this.files = Collections.unmodifiableList(files);
  }

  static List<ModelSpec> officialBoxModels() {
    List<ModelSpec> models = new ArrayList<>();
    models.add(
        new ModelSpec(
            "soundgen",
            "SoundGen",
            "Official Box SoundGen model. On-device text-to-audio, fully offline after download. Downloads about 1.1GB on first use.",
            1,
            12,
            8,
            0,
            list(
                file("sg_core.litert", "https://huggingface.co/jegly/audio/resolve/main/dit_model.tflite", 344293232L),
                file("sg_text.litert", "https://huggingface.co/jegly/audio/resolve/main/conditioners_float32.tflite", 440190572L),
                file("sg_decode.litert", "https://huggingface.co/jegly/audio/resolve/main/autoencoder_model.tflite", 312588244L),
                file("sg_vocab.spm", "https://huggingface.co/jegly/audio/resolve/main/spiece.model", 791656L))));
    models.add(
        new ModelSpec(
            "soundgen_hd",
            "SoundGen HD",
            "Official Box SoundGen HD model. Higher quality on-device text-to-audio, up to about 24 seconds. Downloads about 2.1GB on first use.",
            1,
            24,
            12,
            256,
            list(
                file("sghd_core.litert", "https://huggingface.co/jegly/noise/resolve/main/dit_L256_int8.tflite", 1468553968L),
                file("sghd_decode.litert", "https://huggingface.co/jegly/noise/resolve/main/ae_dec_L256_int8.tflite", 434121120L),
                file("sghd_text.litert", "https://huggingface.co/jegly/noise/resolve/main/t5gemma_enc_int8.tflite", 286972704L),
                file("sghd_vocab.spm", "https://huggingface.co/jegly/noise/resolve/main/tokenizer.model", 4241003L))));
    models.add(
        new ModelSpec(
            "soundgen_hd_long",
            "SoundGen HD Long",
            "Official Box SoundGen HD Long model. Same HD text and tokenizer, long-form core and decoder, up to about 3 minutes.",
            1,
            180,
            60,
            2048,
            list(
                file("sghd_core.litert", "https://huggingface.co/jegly/noise/resolve/main/dit_L2048_int8.tflite", 1469012720L),
                file("sghd_decode.litert", "https://huggingface.co/jegly/noise/resolve/main/ae_dec_L2048_int8.tflite", 447063056L),
                file("sghd_text.litert", "https://huggingface.co/jegly/noise/resolve/main/t5gemma_enc_int8.tflite", 286972704L),
                file("sghd_vocab.spm", "https://huggingface.co/jegly/noise/resolve/main/tokenizer.model", 4241003L))));
    return Collections.unmodifiableList(models);
  }

  boolean isReady(File dir) {
    for (ModelFileSpec file : files) {
      if (file.localFile(dir).length() != file.sizeBytes) {
        return false;
      }
    }
    return true;
  }

  double localProgress(File dir) {
    long total = 0L;
    long have = 0L;
    for (ModelFileSpec file : files) {
      total += file.sizeBytes;
      long length = file.localFile(dir).length();
      long part = new File(dir, file.outputName + ".part").length();
      have += Math.min(file.sizeBytes, Math.max(length, part));
    }
    return total <= 0L ? 0.0 : Math.min(1.0, have / (double) total);
  }

  String localStatusText(File dir) {
    StringBuilder builder = new StringBuilder();
    for (ModelFileSpec file : files) {
      long length = file.localFile(dir).length();
      long part = new File(dir, file.outputName + ".part").length();
      builder
          .append(file.outputName)
          .append(": ")
          .append(length == file.sizeBytes ? "ready" : bytes(Math.max(length, part)) + " / " + bytes(file.sizeBytes))
          .append('\n');
    }
    return builder.toString().trim();
  }

  String totalBytesText() {
    long total = 0L;
    for (ModelFileSpec file : files) {
      total += file.sizeBytes;
    }
    return bytes(total);
  }

  static String bytes(long value) {
    if (value >= 1024L * 1024L * 1024L) {
      return String.format(Locale.US, "%.2fGB", value / 1073741824.0);
    }
    if (value >= 1024L * 1024L) {
      return String.format(Locale.US, "%.1fMB", value / 1048576.0);
    }
    return value + "B";
  }

  private static ModelFileSpec file(String outputName, String url, long sizeBytes) {
    return new ModelFileSpec(outputName, url, sizeBytes);
  }

  private static List<ModelFileSpec> list(ModelFileSpec... files) {
    List<ModelFileSpec> list = new ArrayList<>();
    Collections.addAll(list, files);
    return list;
  }
}
