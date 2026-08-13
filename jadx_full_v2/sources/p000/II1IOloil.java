            package p000;
            
            public final class II1IOloil {
                public final float I00000oIO;
                public final OlI00IIlOO I00000oOI;

                public II1IOloil(float f, OlI00IIlOO olI00IIlOO) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = olI00IIlOO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof II1IOloil)) {
/* 32 */                return false;
                    }
/* 9 */             II1IOloil iI1IOloil = (II1IOloil) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, iI1IOloil.I00000oIO) && this.I00000oOI.equals(iI1IOloil.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 32 */            return "BorderStroke(width=" + Iil1010O.I0000O(this.I00000oIO) + ", brush=" + this.I00000oOI + ")";
                }
            }
