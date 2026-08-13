            package p000;
            
            public final class O1OoiOIi1ooi {
                public final IOOl011 I00000oIO;
                public final OoOo1o00Oi00 I00000oOI;
                public final Oiol01ollI I0000Il00O;
                public final OI0I00i I0000O;

                public O1OoiOIi1ooi(IOOl011 iOOl011, OoOo1o00Oi00 ooOo1o00Oi00, Oiol01ollI oiol01ollI, OI0I00i oI0I00i) {
/* 4 */             this.I00000oIO = iOOl011;
/* 6 */             this.I00000oOI = ooOo1o00Oi00;
/* 8 */             this.I0000Il00O = oiol01ollI;
/* 10 */            this.I0000O = oI0I00i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || O1OoiOIi1ooi.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            O1OoiOIi1ooi o1OoiOIi1ooi = (O1OoiOIi1ooi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1OoiOIi1ooi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1OoiOIi1ooi.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1OoiOIi1ooi.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1OoiOIi1ooi.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "Values(colorScheme=" + this.I00000oIO + ", typography=" + this.I00000oOI + ", shapes=" + this.I0000Il00O + ", motionScheme=" + this.I0000O + ")";
                }
            }
