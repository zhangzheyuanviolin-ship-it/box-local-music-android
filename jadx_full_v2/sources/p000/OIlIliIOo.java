            package p000;
            
            public final class OIlIliIOo {
                public long I00000oIO;
                public OIo1i1 I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 18 */            if (!OIlIliIOo.class.equals(obj != null ? obj.getClass() : null)) {
/* 46 */                return false;
                    }
/* 21 */            OIlIliIOo oIlIliIOo = (OIlIliIOo) obj;
/* 23 */            long j = this.I00000oIO;
/* 25 */            long j2 = oIlIliIOo.I00000oIO;
/* 27 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && this.I00000oOI.equals(oIlIliIOo.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 17 */            return this.I00000oOI.hashCode() + (Long.hashCode(j) * 31);
                }

                public final String toString() {
/* 32 */            return "OverscrollConfiguration(glowColor=" + IOOiio0i.I000OOo1O(this.I00000oIO) + ", drawPadding=" + this.I00000oOI + ")";
                }
            }
