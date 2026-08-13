            package p000;
            
/* 10 */    public final class I0OIOIi1 {
                public final int I00000oIO;
                public boolean I00000oOI;
                public String I0000Il00O;

                public I0OIOIi1(String str, boolean z) {
/* 2 */             this.I00000oIO = 1;
/* 7 */             this.I00000oOI = z;
/* 9 */             this.I0000Il00O = str;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 0:
/* 11 */                    String str = this.I0000Il00O;
/* 13 */                    boolean z = this.I00000oOI;
/* 27 */                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
/* 32 */                    sb.append("{");
/* 35 */                    sb.append(str);
/* 40 */                    sb.append("}");
/* 43 */                    sb.append(z);
/* 46 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
