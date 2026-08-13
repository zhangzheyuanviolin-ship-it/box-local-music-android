            package p000;
            
            public final class II0O000iIl {
                public final float I00000oIO;

                public II0O000iIl(float f) {
/* 4 */             this.I00000oIO = f;
                }

                public final int I00000oIO(int i, int i2) {
/* 12 */            return Math.round((1.0f + this.I00000oIO) * ((i2 - i) / 2.0f));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof II0O000iIl) && Float.compare(this.I00000oIO, ((II0O000iIl) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "Vertical(bias=" + this.I00000oIO + ")";
                }
            }
