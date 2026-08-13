            package com.google.mlkit.vision.common;

            import p000.IlIi0I0;
            import p000.Oi010OO0;
            
            final class zza extends PointF3D {
                private final float zza;
                private final float zzb;
                private final float zzc;

                public zza(float f, float f2, float f3) {
/* 4 */             this.zza = f;
/* 6 */             this.zzb = f2;
/* 8 */             this.zzc = f3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof PointF3D) {
/* 10 */                PointF3D pointF3D = (PointF3D) obj;
/* 26 */                if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(pointF3D.getZ())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public final float getX() {
/* 1 */             return this.zza;
                }

                @Override
                public final float getY() {
/* 1 */             return this.zzb;
                }

                @Override
                public final float getZ() {
/* 1 */             return this.zzc;
                }

                public final int hashCode() {
/* 26 */            return Float.floatToIntBits(this.zzc) ^ ((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003);
                }

                public final String toString() {
/* 1 */             float f = this.zza;
/* 3 */             float f2 = this.zzb;
/* 19 */            return Oi010OO0.I001i1O0Ol(IlIi0I0.I00100l0("PointF3D{x=", f, ", y=", f2, ", z="), this.zzc, "}");
                }
            }
