            package p000;
            
            public final class Il11OI1 implements i00O0OOIlOO {
                public i00O0OOIlOO I00000oIO;
                public i00O0OOIlOO I00000oOI;

                @Override
                public final int I00000oIO(IiIooOOOI iiIooOOOI) {
/* 13 */            int iI00000oIO = this.I00000oIO.I00000oIO(iiIooOOOI) - this.I00000oOI.I00000oIO(iiIooOOOI);
/* 14 */            if (iI00000oIO < 0) {
/* 16 */                return 0;
                    }
/* 29 */            return iI00000oIO;
                }

                @Override
                public final int I00000oOI(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            int iI00000oOI = this.I00000oIO.I00000oOI(iiIooOOOI, o0iOOoiioO) - this.I00000oOI.I00000oOI(iiIooOOOI, o0iOOoiioO);
/* 14 */            if (iI00000oOI < 0) {
/* 16 */                return 0;
                    }
/* 37 */            return iI00000oOI;
                }

                @Override
                public final int I0000Il00O(IiIooOOOI iiIooOOOI) {
/* 13 */            int iI0000Il00O = this.I00000oIO.I0000Il00O(iiIooOOOI) - this.I00000oOI.I0000Il00O(iiIooOOOI);
/* 14 */            if (iI0000Il00O < 0) {
/* 16 */                return 0;
                    }
/* 29 */            return iI0000Il00O;
                }

                @Override
                public final int I0000O(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 13 */            int iI0000O = this.I00000oIO.I0000O(iiIooOOOI, o0iOOoiioO) - this.I00000oOI.I0000O(iiIooOOOI, o0iOOoiioO);
/* 14 */            if (iI0000O < 0) {
/* 16 */                return 0;
                    }
/* 37 */            return iI0000O;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Il11OI1)) {
/* 7 */                 return false;
                    }
/* 11 */            Il11OI1 il11OI1 = (Il11OI1) obj;
                    return O0000Ioio00.I0000O(il11OI1.I00000oIO, this.I00000oIO) && O0000Ioio00.I0000O(il11OI1.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "(" + this.I00000oIO + " - " + this.I00000oOI + ")";
                }
            }
