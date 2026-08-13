            package p000;
            
            public final class II0Il01oO0i implements I0iol11I1OI {
                public final float I00000oIO;

                public II0Il01oO0i(float f) {
/* 4 */             this.I00000oIO = f;
                }

                @Override
                public final int I00000oIO(int i, int i2, O0iOOoiioO o0iOOoiioO) {
/* 12 */            return Math.round((1.0f + this.I00000oIO) * ((i2 - i) / 2.0f));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof II0Il01oO0i) && Float.compare(this.I00000oIO, ((II0Il01oO0i) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "Horizontal(bias=" + this.I00000oIO + ")";
                }
            }
