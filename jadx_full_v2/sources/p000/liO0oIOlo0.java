            package p000;
            
            public abstract class liO0oIOlo0 {
                public static void I00000oIO(int i, int i2) {
                    String strI00000oIO;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 54 */                    strI00000oIO = liO10OoIlll.I00000oIO("%s (%s) must not be negative", "index", Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 21 */                        I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 24 */                        return;
                            }
/* 39 */                    strI00000oIO = liO10OoIlll.I00000oIO("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 89 */                throw new IndexOutOfBoundsException(strI00000oIO);
                    }
                }

                public static void I00000oOI(int i, int i2) {
/* 1 */             if (i < 0 || i > i2) {
/* 12 */                I000II.I0010o(I0000O(i, i2, "index"));
                    }
                }

                public static void I0000Il00O(int i, int i2, int i3) {
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 215 */               throw new IndexOutOfBoundsException((i < 0 || i > i3) ? I0000O(i, i3, "start index") : (i2 < 0 || i2 > i3) ? I0000O(i2, i3, "end index") : liO10OoIlll.I00000oIO("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                }

                public static String I0000O(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return liO10OoIlll.I00000oIO("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return liO10OoIlll.I00000oIO("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 45 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 48 */            return null;
                }
            }
