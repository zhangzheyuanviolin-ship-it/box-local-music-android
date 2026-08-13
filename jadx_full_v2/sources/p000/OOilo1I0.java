            package p000;
            
            public final class OOilo1I0 {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public long I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 59 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof OOilo1I0)) {
/* 61 */                return false;
                    }
/* 11 */            long j = this.I00000oIO;
/* 13 */            OOilo1I0 oOilo1I0 = (OOilo1I0) obj;
/* 15 */            long j2 = oOilo1I0.I00000oIO;
/* 17 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && Ooi0i1.I00000oOI(this.I00000oOI, oOilo1I0.I00000oOI) && Ooi0i1.I00000oOI(this.I0000Il00O, oOilo1I0.I0000Il00O) && Ooi0i1.I00000oOI(this.I0000O, oOilo1I0.I0000O);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 30 */            return Long.hashCode(this.I0000O) + IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(j) * 31, 31), 31);
                }
            }
