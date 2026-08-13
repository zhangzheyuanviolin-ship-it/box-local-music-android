            package p000;
            
            public final class II0oIl extends IOOil0 {
                public long I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof II0oIl)) {
/* 32 */                return false;
                    }
/* 9 */             long j = this.I00000oOI;
/* 11 */            II0oIl iI0oIl = (II0oIl) obj;
/* 13 */            long j2 = iI0oIl.I00000oOI;
/* 15 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && this.I0000Il00O == iI0oIl.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oOI;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 17 */            return Integer.hashCode(this.I0000Il00O) + (Long.hashCode(j) * 31);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("BlendModeColorFilter(color=", IOOiio0i.I000OOo1O(this.I00000oOI), ", blendMode=", iOOolo0i0.I00000oIO(this.I0000Il00O), ")");
                }
            }
