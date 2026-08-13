            package p000;
            
            public final class ilI0OO extends Number {
                public final String I00iOIl;

                public ilI0OO(String str) {
/* 4 */             this.I00iOIl = str;
                }

                @Override
                public final double doubleValue() {
/* 3 */             return Double.parseDouble(this.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ilI0OO) {
/* 15 */                return this.I00iOIl.equals(((ilI0OO) obj).I00iOIl);
                    }
/* 20 */            return false;
                }

                @Override
                public final float floatValue() {
/* 3 */             return Float.parseFloat(this.I00iOIl);
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final int intValue() {
/* 1 */             String str = this.I00iOIl;
                    try {
                        try {
/* 3 */                     return Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
/* 12 */                    return (int) Long.parseLong(str);
                        }
                    } catch (NumberFormatException unused2) {
/* 18 */                return liloi1.I00000oIO(str).intValue();
                    }
                }

                @Override
                public final long longValue() {
/* 1 */             String str = this.I00iOIl;
                    try {
/* 3 */                 return Long.parseLong(str);
                    } catch (NumberFormatException unused) {
/* 12 */                return liloi1.I00000oIO(str).longValue();
                    }
                }

                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
