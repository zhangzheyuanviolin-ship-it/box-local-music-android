            package p000;
            
            public abstract class iOlI1lIi0 {
                public static void I00000oIO(int i) {
/* 2 */             if (2 > i || i >= 37) {
/* 15 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("radix ", i, " was not in valid range ");
/* 27 */                sbI00100o1O0lo.append(new IooO11l(2, 36, 1));
/* 49 */                throw new IllegalArgumentException(sbI00100o1O0lo.toString());
                    }
                }

                public static final boolean I00000oOI(char c, char c2, boolean z) {
/* 2 */             if (c == c2) {
/* 1 */                 return true;
                    }
/* 6 */             if (!z) {
/* 5 */                 return false;
                    }
/* 9 */             char upperCase = Character.toUpperCase(c);
/* 13 */            char upperCase2 = Character.toUpperCase(c2);
                    return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
                }

                public static boolean I0000Il00O(char c) {
                    return Character.isWhitespace(c) || Character.isSpaceChar(c);
                }
            }
