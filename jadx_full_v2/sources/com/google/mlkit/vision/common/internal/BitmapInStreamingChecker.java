            package com.google.mlkit.vision.common.internal;

            import android.os.SystemClock;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import java.util.LinkedList;
            import p000.Io0Ool;
            import p000.lII0I0I000I;
            
            public class BitmapInStreamingChecker {
                private static final Io0Ool zza = new Io0Ool("StreamingFormatChecker", "");
                private final LinkedList zzb = new LinkedList();
                private long zzc = -1;

                public void check(InputImage inputImage) {
/* 6 */             if (inputImage.getFormat() != -1) {
/* 186 */               return;
                    }
/* 9 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 19 */            this.zzb.add(Long.valueOf(jElapsedRealtime));
/* 29 */            if (this.zzb.size() > 5) {
/* 33 */                this.zzb.removeFirst();
                    }
/* 42 */            if (this.zzb.size() == 5) {
/* 50 */                Long l = (Long) this.zzb.peekFirst();
/* 52 */                lII0I0I000I.I000II(l);
/* 65 */                if (jElapsedRealtime - l.longValue() < 5000) {
/* 67 */                    long j = this.zzc;
/* 73 */                    if (j == -1 || jElapsedRealtime - j >= 5000) {
/* 82 */                        this.zzc = jElapsedRealtime;
/* 84 */                        Io0Ool io0Ool = zza;
/* 92 */                        if (Log.isLoggable(io0Ool.I00000oIO, 5)) {
/* 102 */                           Log.w("StreamingFormatChecker", io0Ool.I0000O("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                                }
                            }
                        }
                    }
                }
            }
