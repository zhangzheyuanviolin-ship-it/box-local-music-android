            package p000;
            
            public final class l1II0OlloloO {
                public String I00000oIO;
                public lOliil I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof l1II0OlloloO)) {
/* 32 */                return false;
                    }
/* 8 */             l1II0OlloloO l1ii0olloloo = (l1II0OlloloO) obj;
                    return this.I00000oIO.equals(l1ii0olloloo.I00000oIO) && this.I00000oOI.equals(l1ii0olloloo.I00000oOI);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oOI.toString();
/* 7 */             int length = string.length();
/* 13 */            String str = this.I00000oIO;
/* 24 */            StringBuilder sb = new StringBuilder(str.length() + 30 + length + 1);
/* 31 */            IIl001iO0Io.I001lIiIIo1O(sb, "WalleFunctionCall{name=", str, ", args=", string);
/* 36 */            sb.append("}");
/* 39 */            return sb.toString();
                }
            }
