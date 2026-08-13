            package p000;
            
            public final class l0iO01l {
                public l00Iil I00000oIO;
                public iolOOiI I00000oOI;
                public ilOiOOII0I0 I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 40 */                return true;
                    }
/* 6 */             if (!(obj instanceof l0iO01l)) {
/* 42 */                return false;
                    }
/* 8 */             l0iO01l l0io01l = (l0iO01l) obj;
                    return this.I00000oIO.equals(l0io01l.I00000oIO) && this.I00000oOI.equals(l0io01l.I00000oOI) && this.I0000Il00O.equals(l0io01l.I0000Il00O);
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode();
/* 26 */            return this.I0000Il00O.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String string2 = this.I00000oOI.toString();
/* 17 */            int length2 = string2.length();
/* 23 */            String string3 = this.I0000Il00O.toString();
/* 41 */            StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + string3.length() + 1);
/* 48 */            IIl001iO0Io.I001lIiIIo1O(sb, "LlmServiceOptions{aiCoreClient=", string, ", downloadCallback=", string2);
/* 55 */            return IIlIOloOOO.I0010I0i(sb, ", feature=", string3, "}");
                }
            }
