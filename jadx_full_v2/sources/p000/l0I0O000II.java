            package p000;
            
            public final class l0I0O000II {
                public String I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof l0I0O000II) {
/* 15 */                return this.I00000oIO.equals(((l0I0O000II) obj).I00000oIO);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 3 */             String str = this.I00000oIO;
/* 18 */            return IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + 35), "LegionResultMetadata{modelVersion=", str, "}");
                }
            }
