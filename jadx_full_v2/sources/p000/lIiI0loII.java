            package p000;

            import android.content.Context;
            
            public final class lIiI0loII {
                public Context I00000oIO;
                public OliiillO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof lIiI0loII) {
/* 10 */                lIiI0loII liii0loii = (lIiI0loII) obj;
/* 20 */                if (this.I00000oIO.equals(liii0loii.I00000oIO)) {
/* 22 */                    OliiillO oliiillO = this.I00000oOI;
/* 24 */                    OliiillO oliiillO2 = liii0loii.I00000oOI;
/* 26 */                    if (oliiillO != null ? oliiillO.equals(oliiillO2) : oliiillO2 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            OliiillO oliiillO = this.I00000oOI;
/* 22 */            return (oliiillO == null ? 0 : oliiillO.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String strValueOf = String.valueOf(this.I00000oOI);
/* 28 */            StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
