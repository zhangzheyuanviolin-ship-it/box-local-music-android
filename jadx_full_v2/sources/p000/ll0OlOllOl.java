            package p000;
            
            public abstract class ll0OlOllOl {
                public static void I00000oIO(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I000iOII(str);
                }

                public static void I00000oOI(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static void I0000Il00O(int i, int i2) {
                    String strI00000oIO;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 69 */                    strI00000oIO = ll0Oo10I10.I00000oIO("%s (%s) must not be negative", "index", Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 36 */                        I000II.I000iOII(Oi010OO0.I00100l0(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
/* 39 */                        return;
                            }
/* 54 */                    strI00000oIO = ll0Oo10I10.I00000oIO("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 106 */               throw new IndexOutOfBoundsException(strI00000oIO);
                    }
                }

                public static void I0000O(int i, int i2) {
/* 1 */             if (i < 0 || i > i2) {
/* 12 */                I000II.I0010o(I0001Ioi1lo(i, i2, "index"));
                    }
                }

                public static void I0000oI00(int i, int i2, int i3) {
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 98 */                throw new IndexOutOfBoundsException((i < 0 || i > i3) ? I0001Ioi1lo(i, i3, "start index") : (i2 < 0 || i2 > i3) ? I0001Ioi1lo(i2, i3, "end index") : ll0Oo10I10.I00000oIO("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                }

                public static String I0001Ioi1lo(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return ll0Oo10I10.I00000oIO("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return ll0Oo10I10.I00000oIO("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 60 */            I000II.I000iOII(Oi010OO0.I00100l0(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
/* 63 */            return null;
                }
            }
