            package p000;
            
            public final class Oio0ilI1l implements Iioi1O {
                public final int I00000oIO;
                public final int I00000oOI;

                public Oio0ilI1l(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 12 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(this.I00000oIO, 0, ((I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo).I000lI());
/* 26 */            int iI0000Il00O2 = lIiioliIlo.I0000Il00O(this.I00000oOI, 0, ((I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo).I000lI());
/* 30 */            if (iI0000Il00O < iI0000Il00O2) {
/* 32 */                oo0olliOi1.I0001Ioi1lo(iI0000Il00O, iI0000Il00O2);
                    } else {
/* 36 */                oo0olliOi1.I0001Ioi1lo(iI0000Il00O2, iI0000Il00O);
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oio0ilI1l)) {
/* 7 */                 return false;
                    }
/* 11 */            Oio0ilI1l oio0ilI1l = (Oio0ilI1l) obj;
                    return this.I00000oIO == oio0ilI1l.I00000oIO && this.I00000oOI == oio0ilI1l.I00000oOI;
                }

                public final int hashCode() {
/* 7 */             return (this.I00000oIO * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("SetSelectionCommand(start=", this.I00000oIO, ", end=", this.I00000oOI, ")");
                }
            }
