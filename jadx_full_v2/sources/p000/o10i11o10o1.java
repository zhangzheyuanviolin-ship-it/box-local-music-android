            package p000;
            
            public final class o10i11o10o1 implements o0oi11O1 {
                public o0oi11O1 I00000oIO;
                public Object I00000oOI;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof o10i11o10o1)) {
/* 30 */                return false;
                    }
/* 6 */             o10i11o10o1 o10i11o10o1Var = (o10i11o10o1) obj;
                    return this.I00000oIO.equals(o10i11o10o1Var.I00000oIO) && this.I00000oOI.equals(o10i11o10o1Var.I00000oOI);
                }

                public final int hashCode() {
/* 13 */            return this.I00000oIO.hashCode() ^ this.I00000oOI.hashCode();
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String string2 = this.I00000oOI.toString();
/* 28 */            StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
/* 40 */            sb.append("' }");
/* 43 */            return sb.toString();
                }
            }
