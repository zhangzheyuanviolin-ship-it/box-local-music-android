            package p000;
            
            public final class OOI00IlO0 {
                public final String I00000oIO;
                public final float I00000oOI;

                public OOI00IlO0(String str, float f) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = f;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOI00IlO0)) {
/* 32 */                return false;
                    }
/* 9 */             OOI00IlO0 oOI00IlO0 = (OOI00IlO0) obj;
                    return this.I00000oIO.equals(oOI00IlO0.I00000oIO) && Float.compare(this.I00000oOI, oOI00IlO0.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Prediction(label=" + this.I00000oIO + ", confidence=" + this.I00000oOI + ")";
                }
            }
