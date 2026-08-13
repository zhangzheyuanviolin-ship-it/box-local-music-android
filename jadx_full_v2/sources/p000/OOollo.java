            package p000;
            
            public final class OOollo extends lOO1IIO11il1 {
                public lOO1IIO11il1 I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OOollo)) {
/* 25 */                return false;
                    }
/* 5 */             OOollo oOollo = (OOollo) obj;
                    return oOollo.I00000oOI.equals(this.I00000oOI) && oOollo.I0000Il00O == this.I0000Il00O;
                }

                public final int hashCode() {
/* 11 */            return this.I00000oOI.hashCode() + (this.I0000Il00O * 31);
                }
            }
