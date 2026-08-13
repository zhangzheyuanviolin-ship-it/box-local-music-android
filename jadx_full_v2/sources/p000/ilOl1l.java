            package p000;
            
            public final class ilOl1l {
                public int I00000oIO;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
                    return (obj instanceof ilOl1l) && this.I00000oIO == ((ilOl1l) obj).I00000oIO;
                }

                public final int hashCode() {
/* 6 */             return this.I00000oIO ^ 1000003;
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 22 */            return IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 22), "TokenInfo{tokenCount=", i, "}");
                }
            }
