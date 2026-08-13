            package p000;
            
            public final class ilI1o0o1o {
                public String I00000oIO;
                public float I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilI1o0o1o) {
/* 10 */                ilI1o0o1o ili1o0o1o = (ilI1o0o1o) obj;
/* 20 */                if (this.I00000oIO.equals(ili1o0o1o.I00000oIO) && Float.floatToIntBits(this.I00000oOI) == Float.floatToIntBits(ili1o0o1o.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return Float.floatToIntBits(this.I00000oOI) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Summary{text=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", score=");
/* 22 */            return Oi010OO0.I001i1O0Ol(sb, this.I00000oOI, "}");
                }
            }
