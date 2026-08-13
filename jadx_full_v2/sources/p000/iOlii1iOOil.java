            package p000;
            
            public final class iOlii1iOOil {
                public final String I00000oIO;

                public iOlii1iOOil(String str) {
/* 6 */             lII0I0I000I.I000O01llI0("Null FID", str);
/* 9 */             int length = str.length();
/* 28 */            lII0I0I000I.I00000oIO("Invalid FID: must be exactly 22 characters: ".concat(str), length == 22);
/* 31 */            char cCharAt = str.charAt(0);
/* 52 */            lII0I0I000I.I00000oIO("Invalid FID: must start with [c-f]: ".concat(str), cCharAt >= 'c' && cCharAt <= 'f');
/* 56 */            for (int i = 0; i < length; i++) {
/* 58 */                char cCharAt2 = str.charAt(i);
/* 105 */               lII0I0I000I.I00000oIO("Invalid FID: must contain only URL-safe base-64 characters: ".concat(str), (cCharAt2 >= '0' && cCharAt2 <= '9') || (cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || cCharAt2 == '-' || cCharAt2 == '_'));
                    }
/* 111 */           this.I00000oIO = str;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof iOlii1iOOil)) {
/* 5 */                 return false;
                    }
/* 13 */            return this.I00000oIO.equals(((iOlii1iOOil) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }
