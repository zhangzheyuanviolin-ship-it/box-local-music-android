            package p000;
            
            public final class II0O01li0 implements I0iolI1I11l1 {
                public final float I00000oIO;
                public final float I00000oOI;

                public II0O01li0(float f, float f2) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
                }

                @Override
                public final long I00000oIO(long j, long j2, O0iOOoiioO o0iOOoiioO) {
/* 13 */            float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
/* 25 */            float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
/* 26 */            O0iOOoiioO o0iOOoiioO2 = O0iOOoiioO.I00iOIl;
/* 28 */            float f3 = this.I00000oIO;
/* 30 */            if (o0iOOoiioO != o0iOOoiioO2) {
/* 35 */                f3 *= -1.0f;
                    }
/* 43 */            float f4 = (1.0f + this.I00000oOI) * f2;
/* 44 */            int iRound = Math.round((f3 + 1.0f) * f);
/* 56 */            return (Math.round(f4) & 4294967295L) | (iRound << 32);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof II0O01li0)) {
/* 7 */                 return false;
                    }
/* 11 */            II0O01li0 iI0O01li0 = (II0O01li0) obj;
                    return Float.compare(this.I00000oIO, iI0O01li0.I00000oIO) == 0 && Float.compare(this.I00000oOI, iI0O01li0.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "BiasAlignment(horizontalBias=" + this.I00000oIO + ", verticalBias=" + this.I00000oOI + ")";
                }
            }
