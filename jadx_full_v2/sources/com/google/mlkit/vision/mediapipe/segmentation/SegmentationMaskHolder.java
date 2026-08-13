            package com.google.mlkit.vision.mediapipe.segmentation;

            import java.nio.ByteBuffer;
            
            public class SegmentationMaskHolder {
                private final ByteBuffer zza;
                private final int zzb;
                private final int zzc;

                public SegmentationMaskHolder(ByteBuffer byteBuffer, int i, int i2) {
/* 4 */             this.zza = byteBuffer;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
                }

                public ByteBuffer getBuffer() {
/* 1 */             return this.zza;
                }

                public int getHeight() {
/* 1 */             return this.zzc;
                }

                public int getWidth() {
/* 1 */             return this.zzb;
                }
            }
