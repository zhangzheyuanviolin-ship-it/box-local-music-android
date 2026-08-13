            package p000;
            
            public final class OlI1IiII1 {
                public String I00000oIO;
                public float I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlI1IiII1)) {
/* 39 */                return false;
                    }
/* 9 */             OlI1IiII1 olI1IiII1 = (OlI1IiII1) obj;
                    return this.I00000oIO.equals(olI1IiII1.I00000oIO) && Float.compare(this.I00000oOI, olI1IiII1.I00000oOI) == 0 && this.I0000Il00O == olI1IiII1.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             float f = this.I00000oOI;
/* 5 */             int i = this.I0000Il00O;
/* 11 */            StringBuilder sb = new StringBuilder("Piece(piece=");
/* 14 */            sb.append(str);
/* 19 */            sb.append(", score=");
/* 22 */            sb.append(f);
/* 27 */            sb.append(", type=");
/* 32 */            return IIl001iO0Io.I000lI(i, ")", sb);
                }
            }
