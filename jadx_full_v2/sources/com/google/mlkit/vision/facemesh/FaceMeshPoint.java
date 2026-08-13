            package com.google.mlkit.vision.facemesh;

            import com.google.mlkit.vision.common.PointF3D;
            
            public class FaceMeshPoint {
                private final int zza;
                private final PointF3D zzb;

                public FaceMeshPoint(int i, PointF3D pointF3D) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = pointF3D;
                }

                public int getIndex() {
/* 1 */             return this.zza;
                }

                public PointF3D getPosition() {
/* 1 */             return this.zzb;
                }
            }
