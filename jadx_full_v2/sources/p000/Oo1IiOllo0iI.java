            package p000;
            
/* 11 */    public final class Oo1IiOllo0iI {
                public final String I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;

                public Oo1IiOllo0iI(char c, int i) {
/* 8 */             this.I00000oIO = Character.toString(c);
/* 10 */            this.I0000Il00O = i;
                }

                public final int I00000oIO() {
/* 7 */             return (int) Float.parseFloat(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I0000Il00O;
/* 5 */             if (i == 13) {
/* 19 */                return IIl001iO0Io.I000lI(this.I00000oOI.length, " bytes]", new StringBuilder("Token[kind=CHARSTRING, data="));
                    }
/* 28 */            StringBuilder sb = new StringBuilder("Token[kind=");
/* 35 */            sb.append(Oi010OO0.I001lloI(i));
/* 40 */            sb.append(", text=");
/* 47 */            return IIl001iO0Io.I00100l0(sb, this.I00000oIO, "]");
                }

/* 12 */        public Oo1IiOllo0iI(String str, int i) {
/* 14 */            this.I00000oIO = str;
/* 15 */            this.I0000Il00O = i;
                }
            }
