            package p000;
            
            public final class Oiloo1i01 implements Iioi1O {
                public final int I00000oIO;
                public final int I00000oOI;

                public Oiloo1i01(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 9 */             boolean z = oo0olliOi1.I0000O != -1;
/* 12 */            I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo;
/* 14 */            if (z) {
/* 16 */                oo0olliOi1.I0000O = -1;
/* 18 */                oo0olliOi1.I0000oI00 = -1;
                    }
/* 26 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(this.I00000oIO, 0, i1I1OO00o1o.I000lI());
/* 36 */            int iI0000Il00O2 = lIiioliIlo.I0000Il00O(this.I00000oOI, 0, i1I1OO00o1o.I000lI());
/* 40 */            if (iI0000Il00O != iI0000Il00O2) {
/* 42 */                if (iI0000Il00O < iI0000Il00O2) {
/* 44 */                    oo0olliOi1.I0000oI00(iI0000Il00O, iI0000Il00O2);
                        } else {
/* 48 */                    oo0olliOi1.I0000oI00(iI0000Il00O2, iI0000Il00O);
                        }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oiloo1i01)) {
/* 7 */                 return false;
                    }
/* 11 */            Oiloo1i01 oiloo1i01 = (Oiloo1i01) obj;
                    return this.I00000oIO == oiloo1i01.I00000oIO && this.I00000oOI == oiloo1i01.I00000oOI;
                }

                public final int hashCode() {
/* 7 */             return (this.I00000oIO * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("SetComposingRegionCommand(start=", this.I00000oIO, ", end=", this.I00000oOI, ")");
                }
            }
