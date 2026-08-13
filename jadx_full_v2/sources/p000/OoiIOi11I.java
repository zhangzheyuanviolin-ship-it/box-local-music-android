            package p000;
            
            public final class OoiIOi11I implements i00O0OOIlOO {
                public i00O0OOIlOO I00000oIO;
                public i00O0OOIlOO I00000oOI;

                @Override
                public final int I00000oIO(IiIooOOOI iiIooOOOI) {
/* 13 */            return Math.max(this.I00000oIO.I00000oIO(iiIooOOOI), this.I00000oOI.I00000oIO(iiIooOOOI));
                }

                @Override
                public final int I00000oOI(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            return Math.max(this.I00000oIO.I00000oOI(iiIooOOOI, o0iOOoiioO), this.I00000oOI.I00000oOI(iiIooOOOI, o0iOOoiioO));
                }

                @Override
                public final int I0000Il00O(IiIooOOOI iiIooOOOI) {
/* 13 */            return Math.max(this.I00000oIO.I0000Il00O(iiIooOOOI), this.I00000oOI.I0000Il00O(iiIooOOOI));
                }

                @Override
                public final int I0000O(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            return Math.max(this.I00000oIO.I0000O(iiIooOOOI, o0iOOoiioO), this.I00000oOI.I0000O(iiIooOOOI, o0iOOoiioO));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoiIOi11I)) {
/* 7 */                 return false;
                    }
/* 11 */            OoiIOi11I ooiIOi11I = (OoiIOi11I) obj;
                    return O0000Ioio00.I0000O(ooiIOi11I.I00000oIO, this.I00000oIO) && O0000Ioio00.I0000O(ooiIOi11I.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return (this.I00000oOI.hashCode() * 31) + this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 28 */            return "(" + this.I00000oIO + " ∪ " + this.I00000oOI + ")";
                }
            }
