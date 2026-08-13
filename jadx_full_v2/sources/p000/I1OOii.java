            package p000;
            
            public final class I1OOii extends I1OOiOlIl {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1OOii)) {
/* 32 */                return false;
                    }
/* 9 */             I1OOii i1OOii = (I1OOii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1OOii.I00000oIO) && this.I00000oOI.equals(i1OOii.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("AstLink(destination=", this.I00000oIO, ", title=", this.I00000oOI, ")");
                }
            }
