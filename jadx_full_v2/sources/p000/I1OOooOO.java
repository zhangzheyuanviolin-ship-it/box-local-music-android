            package p000;
            
            public final class I1OOooOO extends I1OIOiil {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1OOooOO)) {
/* 43 */                return false;
                    }
/* 9 */             I1OOooOO i1OOooOO = (I1OOooOO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1OOooOO.I00000oIO) && this.I00000oOI.equals(i1OOooOO.I00000oOI) && this.I0000Il00O.equals(i1OOooOO.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 19 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("AstLinkReferenceDefinition(label=", str, ", destination=", str2, ", title="), this.I0000Il00O, ")");
                }
            }
