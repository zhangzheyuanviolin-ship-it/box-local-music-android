            package p000;
            
            public final class I1OO11iI extends I1OOiOlIl {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1OO11iI)) {
/* 32 */                return false;
                    }
/* 9 */             I1OO11iI i1OO11iI = (I1OO11iI) obj;
                    return this.I00000oIO.equals(i1OO11iI.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i1OO11iI.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("AstImage(title=", this.I00000oIO, ", destination=", this.I00000oOI, ")");
                }
            }
