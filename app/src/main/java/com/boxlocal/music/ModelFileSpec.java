package com.boxlocal.music;

import java.io.File;

final class ModelFileSpec {
  final String outputName;
  final String url;
  final long sizeBytes;

  ModelFileSpec(String outputName, String url, long sizeBytes) {
    this.outputName = outputName;
    this.url = url;
    this.sizeBytes = sizeBytes;
  }

  File localFile(File dir) {
    return new File(dir, outputName);
  }
}
