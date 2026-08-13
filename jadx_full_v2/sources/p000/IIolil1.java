            package p000;
            
            public final class IIolil1 {
                public IiIooOOOI I00000oIO;
                public O0iOOoiioO I00000oOI;
                public IIolOo I0000Il00O;
                public long I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof IIolil1)) {
/* 50 */                return false;
                    }
/* 9 */             IIolil1 iIolil1 = (IIolil1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIolil1.I00000oIO) && this.I00000oOI == iIolil1.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, iIolil1.I0000Il00O) && Ol0i1I.I00000oOI(this.I0000O, iIolil1.I0000O);
                }

                public final int hashCode() {
/* 33 */            return Long.hashCode(this.I0000O) + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 52 */            return "DrawParams(density=" + this.I00000oIO + ", layoutDirection=" + this.I00000oOI + ", canvas=" + this.I0000Il00O + ", size=" + Ol0i1I.I000II(this.I0000O) + ")";
                }
            }
