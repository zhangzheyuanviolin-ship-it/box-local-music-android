            package p000;
            
            public final class l0Iloolll {
                public int I00000oIO;
                public int I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof l0Iloolll) {
/* 10 */                l0Iloolll l0iloolll = (l0Iloolll) obj;
/* 16 */                if (this.I00000oIO == l0iloolll.I00000oIO && this.I00000oOI == l0iloolll.I00000oOI && this.I0000Il00O.equals(l0iloolll.I0000Il00O)) {
/* 34 */                    String str = this.I0000O;
/* 36 */                    String str2 = l0iloolll.I0000O;
/* 38 */                    if (str != null ? str.equals(str2) : str2 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((((this.I00000oIO ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O.hashCode();
/* 19 */            String str = this.I0000O;
/* 30 */            return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I00000oOI;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            String str = this.I0000O;
/* 27 */            int length3 = String.valueOf(str).length();
/* 36 */            String str2 = this.I0000Il00O;
/* 50 */            StringBuilder sb = new StringBuilder(str2.length() + length + 37 + length2 + 6 + 10 + length3 + 1);
/* 57 */            IIlIOloOOO.I001l0I00(sb, "CitationSource{startIndex=", i, ", endIndex=", i2);
/* 64 */            IIl001iO0Io.I001lIiIIo1O(sb, ", uri=", str2, ", license=", str);
/* 69 */            sb.append("}");
/* 72 */            return sb.toString();
                }
            }
