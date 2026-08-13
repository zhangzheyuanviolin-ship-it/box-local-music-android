            package com.google.mlkit.vision.segmentation.subject;

            import android.graphics.Bitmap;
            import java.nio.FloatBuffer;
            import java.util.List;
            
            public class SubjectSegmentationResult {
                private final List zza;
                private final FloatBuffer zzb;
                private final Bitmap zzc;

                public SubjectSegmentationResult(List list, FloatBuffer floatBuffer, Bitmap bitmap) {
/* 4 */             this.zza = list;
/* 6 */             this.zzb = floatBuffer;
/* 8 */             this.zzc = bitmap;
                }

                public Bitmap getForegroundBitmap() {
/* 1 */             return this.zzc;
                }

                public FloatBuffer getForegroundConfidenceMask() {
/* 1 */             return this.zzb;
                }

                public List<Subject> getSubjects() {
/* 1 */             return this.zza;
                }
            }
