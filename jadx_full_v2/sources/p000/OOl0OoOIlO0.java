            package p000;
            
            public final class OOl0OoOIlO0 implements OOl0llI {
                public int I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOl0OoOIlO0)) {
/* 7 */                 return false;
                    }
/* 11 */            OOl0OoOIlO0 oOl0OoOIlO0 = (OOl0OoOIlO0) obj;
                    return this.I00000oIO == oOl0OoOIlO0.I00000oIO && this.I00000oOI == oOl0OoOIlO0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("Embedding(done=", this.I00000oIO, ", total=", this.I00000oOI, ")");
                }
            }
