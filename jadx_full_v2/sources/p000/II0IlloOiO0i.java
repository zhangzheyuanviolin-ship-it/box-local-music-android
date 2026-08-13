            package p000;
            
            public final class II0IlloOiO0i implements I0iol11I1OI {
                public final float I00000oIO;

                public II0IlloOiO0i(float f) {
/* 4 */             this.I00000oIO = f;
                }

                @Override
                public final int I00000oIO(int i, int i2, O0iOOoiioO o0iOOoiioO) {
/* 5 */             float f = (i2 - i) / 2.0f;
/* 6 */             O0iOOoiioO o0iOOoiioO2 = O0iOOoiioO.I00iOIl;
/* 8 */             float f2 = this.I00000oIO;
/* 10 */            if (o0iOOoiioO != o0iOOoiioO2) {
/* 15 */                f2 *= -1.0f;
                    }
/* 20 */            return Math.round((1.0f + f2) * f);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof II0IlloOiO0i) && Float.compare(this.I00000oIO, ((II0IlloOiO0i) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "Horizontal(bias=" + this.I00000oIO + ")";
                }
            }
