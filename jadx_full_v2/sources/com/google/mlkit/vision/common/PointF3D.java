            package com.google.mlkit.vision.common;
            
            public abstract class PointF3D {
                public static PointF3D from(float f, float f2, float f3) {
/* 3 */             return new zza(f, f2, f3);
                }

                public abstract float getX();

                public abstract float getY();

                public abstract float getZ();
            }
