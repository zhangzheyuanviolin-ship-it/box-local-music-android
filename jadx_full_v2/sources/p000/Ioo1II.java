            package p000;
            
            public final class Ioo1II implements OIo1Oi1l1lI {
                public i00O0OOIlOO I00000oIO;
                public IiIooOOOI I00000oOI;

                @Override
                public final float I00000oIO() {
/* 1 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 9 */             return iiIooOOOI.I00O0o1oo(this.I00000oIO.I0000Il00O(iiIooOOOI));
                }

                @Override
                public final float I00000oOI(O0iOOoiioO o0iOOoiioO) {
/* 1 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 9 */             return iiIooOOOI.I00O0o1oo(this.I00000oIO.I0000O(iiIooOOOI, o0iOOoiioO));
                }

                @Override
                public final float I0000Il00O(O0iOOoiioO o0iOOoiioO) {
/* 1 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 9 */             return iiIooOOOI.I00O0o1oo(this.I00000oIO.I00000oOI(iiIooOOOI, o0iOOoiioO));
                }

                @Override
                public final float I0000O() {
/* 1 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 9 */             return iiIooOOOI.I00O0o1oo(this.I00000oIO.I00000oIO(iiIooOOOI));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ioo1II)) {
/* 7 */                 return false;
                    }
/* 13 */            Ioo1II ioo1II = (Ioo1II) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioo1II.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioo1II.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "InsetsPaddingValues(insets=" + this.I00000oIO + ", density=" + this.I00000oOI + ")";
                }
            }
