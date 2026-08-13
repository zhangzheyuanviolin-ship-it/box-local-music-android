            package p000;
            
            public final class Oloi0i01o1i extends Oloi1i10 {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oloi0i01o1i)) {
/* 32 */                return false;
                    }
/* 9 */             Oloi0i01o1i oloi0i01o1i = (Oloi0i01o1i) obj;
                    return this.I00000oIO.equals(oloi0i01o1i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oloi0i01o1i.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 19 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("Code(content=", this.I00000oIO, ", language=", this.I00000oOI, ")");
                }
            }
