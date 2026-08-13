            package p000;
            
            public final class I0O1oloII implements i00O0OOIlOO {
                public i00O0OOIlOO I00000oIO;
                public OIo1i1OOio I00000oOI;

                @Override
                public final int I00000oIO(IiIooOOOI iiIooOOOI) {
/* 13 */            return this.I00000oOI.I00000oIO(iiIooOOOI) + this.I00000oIO.I00000oIO(iiIooOOOI);
                }

                @Override
                public final int I00000oOI(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            return this.I00000oOI.I00000oOI(iiIooOOOI, o0iOOoiioO) + this.I00000oIO.I00000oOI(iiIooOOOI, o0iOOoiioO);
                }

                @Override
                public final int I0000Il00O(IiIooOOOI iiIooOOOI) {
/* 13 */            return this.I00000oOI.I0000Il00O(iiIooOOOI) + this.I00000oIO.I0000Il00O(iiIooOOOI);
                }

                @Override
                public final int I0000O(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            return this.I00000oOI.I0000O(iiIooOOOI, o0iOOoiioO) + this.I00000oIO.I0000O(iiIooOOOI, o0iOOoiioO);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof I0O1oloII)) {
/* 33 */                return false;
                    }
/* 9 */             I0O1oloII i0O1oloII = (I0O1oloII) obj;
                    return O0000Ioio00.I0000O(i0O1oloII.I00000oIO, this.I00000oIO) && i0O1oloII.I00000oOI.equals(this.I00000oOI);
                }

                public final int hashCode() {
/* 17 */            return (this.I00000oOI.I00000oIO.hashCode() * 31) + this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 28 */            return "(" + this.I00000oIO + " + " + this.I00000oOI + ")";
                }
            }
