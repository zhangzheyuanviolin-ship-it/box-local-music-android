package com.boxlocal.music;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class ModelDownload {
  interface Listener {
    void onProgress(long received, long total, String currentFile);

    void onDone();

    void onError(Exception error);
  }

  private final ModelSpec model;
  private final File dir;
  private final Listener listener;

  ModelDownload(ModelSpec model, File dir, Listener listener) {
    this.model = model;
    this.dir = dir;
    this.listener = listener;
  }

  void start() {
    new Thread(this::run).start();
  }

  private void run() {
    try {
      if (!dir.exists() && !dir.mkdirs()) {
        throw new IllegalStateException("Cannot create " + dir.getAbsolutePath());
      }
      long total = 0L;
      for (ModelFileSpec file : model.files) {
        total += file.sizeBytes;
      }
      for (ModelFileSpec file : model.files) {
        downloadFile(file, total);
      }
      listener.onDone();
    } catch (Exception e) {
      listener.onError(e);
    }
  }

  private void downloadFile(ModelFileSpec file, long modelTotal) throws Exception {
    File output = file.localFile(dir);
    if (output.length() == file.sizeBytes) {
      listener.onProgress(totalReceived(), modelTotal, file.outputName);
      return;
    }
    File part = new File(dir, file.outputName + ".part");
    long existing = part.length();
    HttpURLConnection connection = open(file.url, existing);
    int code = connection.getResponseCode();
    if (code == 416) {
      part.delete();
      existing = 0L;
      connection.disconnect();
      connection = open(file.url, 0L);
      code = connection.getResponseCode();
    }
    if (code != 200 && code != 206) {
      throw new IllegalStateException("HTTP " + code + " for " + file.outputName);
    }
    try (InputStream input = connection.getInputStream();
        OutputStream outputStream = new FileOutputStream(part, existing > 0L && code == 206)) {
      byte[] buffer = new byte[1024 * 256];
      int read;
      long lastNotify = 0L;
      while ((read = input.read(buffer)) >= 0) {
        outputStream.write(buffer, 0, read);
        long now = System.currentTimeMillis();
        if (now - lastNotify > 500L) {
          lastNotify = now;
          listener.onProgress(totalReceived(), modelTotal, file.outputName);
        }
      }
    } finally {
      connection.disconnect();
    }
    if (part.length() != file.sizeBytes) {
      throw new IllegalStateException(
          file.outputName + " incomplete: " + part.length() + " expected " + file.sizeBytes);
    }
    if (output.exists() && !output.delete()) {
      throw new IllegalStateException("Cannot replace " + output.getName());
    }
    if (!part.renameTo(output)) {
      copy(part, output);
      if (!part.delete()) {
        throw new IllegalStateException("Cannot remove part file " + part.getName());
      }
    }
    listener.onProgress(totalReceived(), modelTotal, file.outputName);
  }

  private HttpURLConnection open(String url, long offset) throws Exception {
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setConnectTimeout(30000);
    connection.setReadTimeout(60000);
    connection.setInstanceFollowRedirects(true);
    if (offset > 0L) {
      connection.setRequestProperty("Range", "bytes=" + offset + "-");
      connection.setRequestProperty("Accept-Encoding", "identity");
    }
    connection.connect();
    return connection;
  }

  private long totalReceived() {
    long received = 0L;
    for (ModelFileSpec file : model.files) {
      File output = file.localFile(dir);
      File part = new File(dir, file.outputName + ".part");
      received += Math.min(file.sizeBytes, Math.max(output.length(), part.length()));
    }
    return received;
  }

  private static void copy(File source, File target) throws Exception {
    try (InputStream input = new FileInputStream(source);
        OutputStream output = new FileOutputStream(target)) {
      byte[] buffer = new byte[1024 * 256];
      int read;
      while ((read = input.read(buffer)) >= 0) {
        output.write(buffer, 0, read);
      }
    }
  }
}
