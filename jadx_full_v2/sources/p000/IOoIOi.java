            package p000;
            
            public final class IOoIOi {
                public final int I00000oIO;
                public final long I00000oOI;
                public final IOoIiIOliiO1 I0000Il00O;
                public final IIloOI I0000O;

                public IOoIOi(int i, long j, IOoIiIOliiO1 iOoIiIOliiO1, IIloOI iIloOI) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = iOoIiIOliiO1;
/* 10 */            this.I0000O = iIloOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 46 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOoIOi)) {
/* 44 */                return false;
                    }
/* 9 */             IOoIOi iOoIOi = (IOoIOi) obj;
                    return this.I00000oIO == iOoIOi.I00000oIO && this.I00000oOI == iOoIOi.I00000oOI && this.I0000Il00O == iOoIOi.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, iOoIOi.I0000O);
                }

                public final int hashCode() {
/* 23 */            int iHashCode = (this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31)) * 31;
/* 24 */            IIloOI iIloOI = this.I0000O;
/* 34 */            return iHashCode + (iIloOI == null ? 0 : iIloOI.hashCode());
                }

                public final String toString() {
/* 48 */            return "ContentCaptureEvent(id=" + this.I00000oIO + ", timestamp=" + this.I00000oOI + ", type=" + this.I0000Il00O + ", structureCompat=" + this.I0000O + ")";
                }
            }
