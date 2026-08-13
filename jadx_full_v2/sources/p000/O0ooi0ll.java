            package p000;
            
            public final class O0ooi0ll extends O0ooioI1 {
                public final String I00000oIO;
                public final Oo0io0OO1 I00000oOI;
                public final IOIli1iI1 I0000Il00O;

                public O0ooi0ll(String str, Oo0io0OO1 oo0io0OO1, IOIli1iI1 iOIli1iI1) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = oo0io0OO1;
/* 8 */             this.I0000Il00O = iOIli1iI1;
                }

                @Override
                public final IOIli1iI1 I00000oIO() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final Oo0io0OO1 I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0ooi0ll)) {
/* 7 */                 return false;
                    }
/* 11 */            O0ooi0ll o0ooi0ll = (O0ooi0ll) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o0ooi0ll.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o0ooi0ll.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o0ooi0ll.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            Oo0io0OO1 oo0io0OO1 = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (oo0io0OO1 != null ? oo0io0OO1.hashCode() : 0)) * 31;
/* 23 */            IOIli1iI1 iOIli1iI1 = this.I0000Il00O;
/* 31 */            return iHashCode2 + (iOIli1iI1 != null ? iOIli1iI1.hashCode() : 0);
                }

                public final String toString() {
/* 7 */             return IlIi0I0.I000lI("LinkAnnotation.Url(url=", this.I00000oIO, ")");
                }
            }
