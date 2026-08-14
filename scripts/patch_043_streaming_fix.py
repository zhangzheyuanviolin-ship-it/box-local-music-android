from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
text = engine.read_text(encoding='utf-8')

if '  private static void writeStereoWavStreaming(' in text:
    print('Streaming WAV writer already present')
    raise SystemExit(0)

marker = '  private static float[] gaussian('
if marker not in text:
    raise SystemExit('Gaussian marker not found')

method = r'''  private static void writeStereoWavStreaming(
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

engine.write_text(text.replace(marker, method + marker, 1), encoding='utf-8')
print('Restored 0.4.3 Long streaming WAV writer')
