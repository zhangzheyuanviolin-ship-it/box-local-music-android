package com.boxlocal.music;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Random;

final class ProceduralMusic {
  private static final int SAMPLE_RATE = 44100;
  private static final int CHANNELS = 2;
  private static final int BYTES_PER_SAMPLE = 2;
  private static final int[] MAJOR = {0, 2, 4, 5, 7, 9, 11, 12};
  private static final int[] MINOR = {0, 2, 3, 5, 7, 8, 10, 12};

  private ProceduralMusic() {}

  static void writeWav(File file, String prompt, int seconds) throws Exception {
    try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
      writeWav(out, prompt, seconds);
    }
  }

  static void writeWav(OutputStream outputStream, String prompt, int seconds) throws Exception {
    int samples = seconds * SAMPLE_RATE;
    int dataBytes = samples * CHANNELS * BYTES_PER_SAMPLE;
    int[] scale = pickScale(prompt);
    int root = 48 + Math.floorMod(prompt.hashCode(), 12);
    Random random = new Random(seed(prompt));
    double bpm = 78 + Math.floorMod(prompt.hashCode(), 52);
    double beatSeconds = 60.0 / bpm;
    double stepSeconds = beatSeconds / 2.0;
    double[] melody = melody(root, scale, random, Math.max(16, (int) Math.ceil(seconds / stepSeconds) + 4));
    double[] bass = bass(root, scale, melody.length);

    BufferedOutputStream out = new BufferedOutputStream(outputStream);
      writeHeader(out, dataBytes);
      for (int i = 0; i < samples; i++) {
        double t = i / (double) SAMPLE_RATE;
        int step = Math.min(melody.length - 1, (int) (t / stepSeconds));
        double local = t - (step * stepSeconds);
        double lead = voice(melody[step], local, stepSeconds, 0.48, 0.995);
        double pad = 0.0;
        int chordRoot = (step / 4) * 4;
        for (int c = 0; c < 3; c++) {
          double note = melody[Math.min(melody.length - 1, chordRoot)] + (c == 0 ? -12 : c == 1 ? -5 : 0);
          pad += voice(note, t % (beatSeconds * 4), beatSeconds * 4, 0.12, 0.9995);
        }
        double low = voice(bass[step], local, stepSeconds, 0.25, 0.998);
        double drum = percussion(t, beatSeconds);
        double value = softClip((lead * 0.55) + (pad * 0.28) + (low * 0.26) + drum);
        short pcm = (short) Math.max(Short.MIN_VALUE, Math.min(Short.MAX_VALUE, value * 30000.0));
        writeShort(out, pcm);
        writeShort(out, pcm);
      }
    out.flush();
  }

  private static int[] pickScale(String prompt) {
    String lower = prompt.toLowerCase();
    if (lower.contains("sad") || lower.contains("dark") || lower.contains("minor")) {
      return MINOR;
    }
    return MAJOR;
  }

  private static long seed(String prompt) throws Exception {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] bytes = digest.digest(prompt.getBytes("UTF-8"));
    return ByteBuffer.wrap(bytes, 0, 8).getLong();
  }

  private static double[] melody(int root, int[] scale, Random random, int count) {
    double[] notes = new double[count];
    int degree = 0;
    for (int i = 0; i < count; i++) {
      if (i % 8 == 0) {
        degree = 0;
      } else {
        degree = Math.max(0, Math.min(scale.length - 1, degree + random.nextInt(5) - 2));
      }
      notes[i] = root + 12 + scale[degree];
    }
    return notes;
  }

  private static double[] bass(int root, int[] scale, int count) {
    double[] notes = new double[count];
    int[] pattern = {0, 4, 5, 3};
    for (int i = 0; i < count; i++) {
      notes[i] = root - 12 + scale[pattern[(i / 8) % pattern.length]];
    }
    return notes;
  }

  private static double voice(double midi, double time, double duration, double attack, double decay) {
    double frequency = 440.0 * Math.pow(2.0, (midi - 69.0) / 12.0);
    double envelope = Math.min(1.0, time / Math.max(0.01, duration * attack));
    envelope *= Math.pow(decay, time * SAMPLE_RATE / 512.0);
    double s1 = Math.sin(2.0 * Math.PI * frequency * time);
    double s2 = Math.sin(2.0 * Math.PI * frequency * 2.0 * time) * 0.32;
    double s3 = Math.sin(2.0 * Math.PI * frequency * 3.0 * time) * 0.12;
    return (s1 + s2 + s3) * envelope;
  }

  private static double percussion(double time, double beatSeconds) {
    double beat = time % beatSeconds;
    double kick = Math.exp(-beat * 36.0) * Math.sin(2.0 * Math.PI * 58.0 * beat);
    double hatPhase = time % (beatSeconds / 2.0);
    double hat = (Math.random() - 0.5) * Math.exp(-hatPhase * 90.0) * 0.05;
    return (kick * 0.18) + hat;
  }

  private static double softClip(double value) {
    return Math.tanh(value * 1.2) * 0.85;
  }

  private static void writeHeader(BufferedOutputStream out, int dataBytes) throws IOException {
    out.write(new byte[] {'R', 'I', 'F', 'F'});
    writeInt(out, 36 + dataBytes);
    out.write(new byte[] {'W', 'A', 'V', 'E', 'f', 'm', 't', ' '});
    writeInt(out, 16);
    writeShort(out, (short) 1);
    writeShort(out, (short) CHANNELS);
    writeInt(out, SAMPLE_RATE);
    writeInt(out, SAMPLE_RATE * CHANNELS * BYTES_PER_SAMPLE);
    writeShort(out, (short) (CHANNELS * BYTES_PER_SAMPLE));
    writeShort(out, (short) 16);
    out.write(new byte[] {'d', 'a', 't', 'a'});
    writeInt(out, dataBytes);
  }

  private static void writeInt(BufferedOutputStream out, int value) throws IOException {
    out.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(value).array());
  }

  private static void writeShort(BufferedOutputStream out, short value) throws IOException {
    out.write(ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort(value).array());
  }
}
