            package p000;
            
            public final class IiIi1o00o {
                public Ol0iOll10l I00000oIO;
                public OiO0llO0IO I00000oOI;
                public OoI1IIOl I0000Il00O;
                public OO1o11 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof IiIi1o00o)) {
/* 44 */                return false;
                    }
/* 9 */             IiIi1o00o iiIi1o00o = (IiIi1o00o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iiIi1o00o.I00000oIO) && this.I00000oOI == iiIi1o00o.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, iiIi1o00o.I0000Il00O) && this.I0000O == iiIi1o00o.I0000O;
                }

                public final int hashCode() {
/* 1 */             Ol0iOll10l ol0iOll10l = this.I00000oIO;
/* 12 */            int iHashCode = (ol0iOll10l != null ? ol0iOll10l.hashCode() : 0) * 31;
/* 14 */            OiO0llO0IO oiO0llO0IO = this.I00000oOI;
/* 28 */            int iHashCode2 = (iHashCode + (oiO0llO0IO != null ? oiO0llO0IO.hashCode() : 0)) * 28629151;
/* 29 */            OoI1IIOl ooI1IIOl = this.I0000Il00O;
/* 40 */            int iHashCode3 = (iHashCode2 + (ooI1IIOl != null ? ooI1IIOl.hashCode() : 0)) * 31;
/* 42 */            OO1o11 oO1o11 = this.I0000O;
/* 54 */            return (iHashCode3 + (oO1o11 != null ? oO1o11.hashCode() : 0)) * 887503681;
                }
            }
