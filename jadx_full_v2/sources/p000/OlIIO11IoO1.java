            package p000;
            
            public final class OlIIO11IoO1 extends IlIIlll {
                public final IoiOloi I00000oIO;
                public final String I00000oOI;
                public final Ii1I1OOilolI I0000Il00O;

                public OlIIO11IoO1(IoiOloi ioiOloi, String str, Ii1I1OOilolI ii1I1OOilolI) {
/* 4 */             this.I00000oIO = ioiOloi;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = ii1I1OOilolI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 36 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlIIO11IoO1)) {
/* 38 */                return false;
                    }
/* 8 */             OlIIO11IoO1 olIIO11IoO1 = (OlIIO11IoO1) obj;
                    return this.I00000oIO.equals(olIIO11IoO1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, olIIO11IoO1.I00000oOI) && this.I0000Il00O == olIIO11IoO1.I0000Il00O;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 28 */            return this.I0000Il00O.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
                }
            }
