            package p000;
            
            public final class I1lIioOOIIl {
                public Integer I00000oIO;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1lIioOOIIl)) {
/* 7 */                 return false;
                    }
/* 12 */            Integer num = this.I00000oIO;
/* 14 */            Integer num2 = ((I1lIioOOIIl) obj).I00000oIO;
                    return num == null ? num2 == null : num.equals(num2);
                }

                public final int hashCode() {
/* 1 */             Integer num = this.I00000oIO;
/* 14 */            return (num == null ? 0 : num.hashCode()) ^ 1000003;
                }

                public final String toString() {
/* 18 */            return "ProductData{productId=" + this.I00000oIO + "}";
                }
            }
