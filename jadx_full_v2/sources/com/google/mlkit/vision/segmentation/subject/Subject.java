            package com.google.mlkit.vision.segmentation.subject;

            import android.graphics.Bitmap;
            import java.nio.FloatBuffer;
            
            public class Subject {
                private final FloatBuffer zza;
                private final Bitmap zzb;
                private final int zzc;
                private final int zzd;
                private final int zze;
                private final int zzf;

                public Subject(FloatBuffer floatBuffer, Bitmap bitmap, int i, int i2, int i3, int i4) {
/* 4 */             this.zza = floatBuffer;
/* 6 */             this.zzb = bitmap;
/* 8 */             this.zzc = i;
/* 10 */            this.zzd = i2;
/* 12 */            this.zze = i3;
/* 14 */            this.zzf = i4;
                }

                public Bitmap getBitmap() {
/* 1 */             return this.zzb;
                }

                public FloatBuffer getConfidenceMask() {
/* 1 */             return this.zza;
                }

                public int getHeight() {
/* 1 */             return this.zzd;
                }

                public int getStartX() {
/* 1 */             return this.zze;
                }

                public int getStartY() {
/* 1 */             return this.zzf;
                }

                public int getWidth() {
/* 1 */             return this.zzc;
                }
            }
