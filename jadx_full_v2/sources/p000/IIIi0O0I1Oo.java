            package p000;
            
            public final class IIIi0O0I1Oo {
                public final long I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;

                public IIIi0O0I1Oo(long j, long j2, long j3, long j4) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = j3;
/* 10 */            this.I0000O = j4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof IIIi0O0I1Oo)) {
/* 61 */                return false;
                    }
/* 11 */            IIIi0O0I1Oo iIIi0O0I1Oo = (IIIi0O0I1Oo) obj;
/* 13 */            long j = iIIi0O0I1Oo.I00000oIO;
/* 15 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && Ooi0i1.I00000oOI(this.I00000oOI, iIIi0O0I1Oo.I00000oOI) && Ooi0i1.I00000oOI(this.I0000Il00O, iIIi0O0I1Oo.I0000Il00O) && Ooi0i1.I00000oOI(this.I0000O, iIIi0O0I1Oo.I0000O);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 30 */            return Long.hashCode(this.I0000O) + IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31);
                }
            }
