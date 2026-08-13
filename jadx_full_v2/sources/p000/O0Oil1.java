            package p000;
            
            public final class O0Oil1 extends O0OoI01Oo000 {
                public String I00000oIO;
                public int I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0Oil1)) {
/* 28 */                return false;
                    }
/* 9 */             O0Oil1 o0Oil1 = (O0Oil1) obj;
                    return this.I00000oIO.equals(o0Oil1.I00000oIO) && this.I00000oOI == o0Oil1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 1 */             return this.I0000Il00O;
                }
            }
