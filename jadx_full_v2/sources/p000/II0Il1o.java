            package p000;
            
            public final class II0Il1o implements I0iolI1I11l1 {
                public final float I00000oIO;

                public II0Il1o(float f) {
/* 4 */             this.I00000oIO = f;
                }

                @Override
                public final long I00000oIO(long j, long j2, O0iOOoiioO o0iOOoiioO) {
/* 24 */            long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
/* 41 */            float f = (1.0f + this.I00000oIO) * (((int) (j3 >> 32)) / 2.0f);
/* 43 */            float f2 = 0.0f * (((int) (j3 & 4294967295L)) / 2.0f);
/* 56 */            return (Math.round(f) << 32) | (Math.round(f2) & 4294967295L);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
                    return (obj instanceof II0Il1o) && Float.compare(this.I00000oIO, ((II0Il1o) obj).I00000oIO) == 0 && Float.compare(-1.0f, -1.0f) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(-1.0f) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 18 */            return "BiasAbsoluteAlignment(horizontalBias=" + this.I00000oIO + ", verticalBias=-1.0)";
                }
            }
