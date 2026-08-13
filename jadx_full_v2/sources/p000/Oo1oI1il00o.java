            package p000;
            
            public final class Oo1oI1il00o {
                public final long I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;

                public Oo1oI1il00o(long j, long j2, long j3, long j4, long j5, long j6) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = j3;
/* 10 */            this.I0000O = j4;
/* 12 */            this.I0000oI00 = j5;
/* 14 */            this.I0001Ioi1lo = j6;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 81 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof Oo1oI1il00o)) {
/* 83 */                return false;
                    }
/* 11 */            Oo1oI1il00o oo1oI1il00o = (Oo1oI1il00o) obj;
/* 13 */            long j = oo1oI1il00o.I00000oIO;
/* 15 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && Ooi0i1.I00000oOI(this.I00000oOI, oo1oI1il00o.I00000oOI) && Ooi0i1.I00000oOI(this.I0000Il00O, oo1oI1il00o.I0000Il00O) && Ooi0i1.I00000oOI(this.I0000O, oo1oI1il00o.I0000O) && Ooi0i1.I00000oOI(this.I0000oI00, oo1oI1il00o.I0000oI00) && Ooi0i1.I00000oOI(this.I0001Ioi1lo, oo1oI1il00o.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 42 */            return Long.hashCode(this.I0001Ioi1lo) + IIlIOloOOO.I0000O(this.I0000oI00, IIlIOloOOO.I0000O(this.I0000O, IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31), 31), 31);
                }
            }
