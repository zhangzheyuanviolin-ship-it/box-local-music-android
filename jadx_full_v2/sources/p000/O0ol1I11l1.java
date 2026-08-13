            package p000;
            
            public final class O0ol1I11l1 extends IOOil0 {
                public long I00000oOI;
                public long I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 36 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0ol1I11l1)) {
/* 34 */                return false;
                    }
/* 9 */             long j = this.I00000oOI;
/* 11 */            O0ol1I11l1 o0ol1I11l1 = (O0ol1I11l1) obj;
/* 13 */            long j2 = o0ol1I11l1.I00000oOI;
/* 15 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && Ooi0i1.I00000oOI(this.I0000Il00O, o0ol1I11l1.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oOI;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 17 */            return Long.hashCode(this.I0000Il00O) + (Long.hashCode(j) * 31);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("LightingColorFilter(multiply=", IOOiio0i.I000OOo1O(this.I00000oOI), ", add=", IOOiio0i.I000OOo1O(this.I0000Il00O), ")");
                }
            }
