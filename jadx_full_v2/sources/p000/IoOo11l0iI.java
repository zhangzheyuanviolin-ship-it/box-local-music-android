            package p000;
            
            public final class IoOo11l0iI {
                public final long I00000oIO;
                public final long I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;

                public IoOo11l0iI(long j, long j2, long j3, long j4) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = j3;
/* 10 */            this.I0000O = j4;
                }

                public final IoOo11l0iI I00000oIO(long j, long j2, long j3, long j4) {
/* 44 */            return new IoOo11l0iI(j != 16 ? j : this.I00000oIO, j2 != 16 ? j2 : this.I00000oOI, j3 != 16 ? j3 : this.I0000Il00O, j4 != 16 ? j4 : this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof IoOo11l0iI)) {
/* 61 */                return false;
                    }
/* 11 */            IoOo11l0iI ioOo11l0iI = (IoOo11l0iI) obj;
/* 13 */            long j = ioOo11l0iI.I00000oIO;
/* 15 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && Ooi0i1.I00000oOI(this.I00000oOI, ioOo11l0iI.I00000oOI) && Ooi0i1.I00000oOI(this.I0000Il00O, ioOo11l0iI.I0000Il00O) && Ooi0i1.I00000oOI(this.I0000O, ioOo11l0iI.I0000O);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 30 */            return Long.hashCode(this.I0000O) + IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31);
                }
            }
