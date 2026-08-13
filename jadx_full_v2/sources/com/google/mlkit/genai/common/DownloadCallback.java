            package com.google.mlkit.genai.common;
            
/* 27 */    public interface DownloadCallback {
/* 28 */        default void onDownloadCompleted() {
                }

/* 48 */        default void onDownloadFailed(GenAiException genAiException) {
                }

/* 48 */        default void onDownloadProgress(long j) {
                }

/* 48 */        default void onDownloadStarted(long j) {
                }
            }
