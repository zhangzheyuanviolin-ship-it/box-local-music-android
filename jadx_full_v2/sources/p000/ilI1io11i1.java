            package p000;
            
            public final class ilI1io11i1 {
                public String I00000oIO;
                public int I00000oOI;
                public float I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilI1io11i1) {
/* 10 */                ilI1io11i1 ili1io11i1 = (ilI1io11i1) obj;
/* 20 */                if (this.I00000oIO.equals(ili1io11i1.I00000oIO) && this.I00000oOI == ili1io11i1.I00000oOI && Float.floatToIntBits(this.I0000Il00O) == Float.floatToIntBits(ili1io11i1.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            float f = this.I0000Il00O;
/* 22 */            return ((this.I00000oOI ^ (iHashCode * 1000003)) * 1000003) ^ Float.floatToIntBits(f);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Rewrite{text=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", tone=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", score=");
/* 32 */            return Oi010OO0.I001i1O0Ol(sb, this.I0000Il00O, "}");
                }
            }
