            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.k2fsa.sherpa.onnx.OfflineTts;
            import com.k2fsa.sherpa.onnx.OfflineTtsConfig;
            import com.k2fsa.sherpa.onnx.OfflineTtsModelConfig;
            import com.k2fsa.sherpa.onnx.TtsKt;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
            public final class II1olI {
                public volatile OfflineTts I00000oIO;
                public int I00000oOI = 24000;

                public static void I00000oIO(Context context, String str, File file) throws IOException {
                    try {
/* 5 */                 String[] list = context.getAssets().list(str);
/* 9 */                 if (list == null) {
/* 93 */                    return;
                        }
/* 13 */                if (list.length == 0) {
/* 24 */                    I00000oOI(context, str, new File(file.getParentFile(), str));
/* 27 */                    return;
                        }
/* 30 */                file.mkdirs();
/* 35 */                for (String str2 : list) {
/* 55 */                    String str3 = str + "/" + str2;
/* 63 */                    String[] list2 = context.getAssets().list(str3);
/* 67 */                    if (list2 == null || list2.length == 0) {
/* 87 */                        I00000oOI(context, str3, new File(file, str2));
                            } else {
/* 78 */                        I00000oIO(context, str3, new File(file, str2));
                            }
                        }
                    } catch (IOException e) {
/* 102 */               Log.e("BoxTtsEngine", "copyAssetDir failed for ".concat(str), e);
                    }
                }

                public static void I00000oOI(Context context, String str, File file) throws IOException {
/* 5 */             if (file.exists()) {
/* 7 */                 return;
                    }
/* 8 */             File parentFile = file.getParentFile();
/* 12 */            if (parentFile != null) {
/* 14 */                parentFile.mkdirs();
                    }
/* 21 */            InputStream inputStreamOpen = context.getAssets().open(str);
                    try {
/* 27 */                FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
/* 30 */                    iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 33 */                    fileOutputStream.close();
/* 36 */                    inputStreamOpen.close();
                        } finally {
                        }
                    } finally {
                    }
                }

                public final boolean I0000Il00O(Context context, String str, String str2, String str3) {
                    File[] fileArrListFiles;
                    try {
/* 5 */                 OfflineTts offlineTts = this.I00000oIO;
/* 7 */                 if (offlineTts != null) {
/* 9 */                     offlineTts.release();
                        }
                    } catch (Throwable unused) {
                    }
                    try {
/* 13 */                this.I00000oIO = null;
/* 23 */                File file = new File(context.getExternalFilesDir(null), "espeak-ng-data");
/* 30 */                if (!file.exists() || ((fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length == 0)) {
/* 41 */                    file.mkdirs();
/* 44 */                    I00000oIO(context, "espeak-ng-data", file);
                        }
/* 40 */                OfflineTtsConfig offlineTtsConfig = TtsKt.getOfflineTtsConfig(str, str2, "", "", str3, "", file.getAbsolutePath(), "", "", "", (3072 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3072 & Barcode.FORMAT_PDF417) != 0 ? false : false);
/* 121 */               this.I00000oIO = new OfflineTts(null, OfflineTtsConfig.copy$default(offlineTtsConfig, OfflineTtsModelConfig.copy$default(offlineTtsConfig.getModel(), null, null, null, null, null, null, null, 0, false, null, 767, null), null, null, 0, 0.0f, 30, null));
/* 123 */               OfflineTts offlineTts2 = this.I00000oIO;
/* 136 */               this.I00000oOI = offlineTts2 != null ? offlineTts2.sampleRate() : 24000;
/* 138 */               return true;
                    } catch (Throwable th) {
/* 150 */               Log.e("BoxTtsEngine", "Failed to load TTS model from ".concat(str), th);
/* 153 */               return false;
                    }
                }
            }
