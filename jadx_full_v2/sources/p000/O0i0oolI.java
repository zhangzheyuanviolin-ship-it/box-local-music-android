            package p000;
            
            public final class O0i0oolI {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0i0oolI)) {
/* 7 */                 return false;
                    }
/* 11 */            O0i0oolI o0i0oolI = (O0i0oolI) obj;
                    return this.I00000oIO == o0i0oolI.I00000oIO && this.I00000oOI == o0i0oolI.I00000oOI && this.I0000Il00O == o0i0oolI.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00000oIO);
/* 13 */            sb.append('.');
/* 18 */            sb.append(this.I00000oOI);
/* 21 */            sb.append('.');
/* 26 */            sb.append(this.I0000Il00O);
/* 29 */            return sb.toString();
                }
            }
