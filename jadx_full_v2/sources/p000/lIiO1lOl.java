            package p000;
            
            public abstract class lIiO1lOl {
                public static final void I00000oIO(Io1O0I1i io1O0I1i, String str, int i, int i2, int i3) {
/* 2 */             if (i2 == -1) {
/* 4 */                 int iI0000Il00O = I0000Il00O(i, i3, str);
/* 8 */                 int iI00000oOI = I00000oOI(iI0000Il00O, i3, str);
/* 12 */                if (iI00000oOI > iI0000Il00O) {
/* 20 */                    io1O0I1i.I00OloOo(str.substring(iI0000Il00O, iI00000oOI), Il01100l.I00iOIl);
/* 23 */                    return;
                        }
/* 966 */               return;
                    }
/* 24 */            int iI0000Il00O2 = I0000Il00O(i, i2, str);
/* 28 */            int iI00000oOI2 = I00000oOI(iI0000Il00O2, i2, str);
/* 32 */            if (iI00000oOI2 > iI0000Il00O2) {
/* 34 */                String strSubstring = str.substring(iI0000Il00O2, iI00000oOI2);
/* 40 */                int iI0000Il00O3 = I0000Il00O(i2 + 1, i3, str);
/* 52 */                io1O0I1i.I00ll1(strSubstring, str.substring(iI0000Il00O3, I00000oOI(iI0000Il00O3, i3, str)));
                    }
                }

                public static final int I00000oOI(int i, int i2, String str) {
/* 1 */             while (i2 > i && iOlI1lIi0.I0000Il00O(str.charAt(i2 - 1))) {
                        i2--;
                    }
/* 215 */           return i2;
                }

                public static final int I0000Il00O(int i, int i2, String str) {
/* 1 */             while (i < i2 && iOlI1lIi0.I0000Il00O(str.charAt(i))) {
/* 13 */                i++;
                    }
/* 215 */           return i;
                }
            }
