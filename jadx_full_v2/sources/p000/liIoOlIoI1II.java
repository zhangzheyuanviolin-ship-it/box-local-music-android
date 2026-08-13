            package p000;
            
            public abstract class liIoOlIoI1II {
                public static boolean I00000oIO(int i) {
                    return i == 2 || i == 7 || i == 3;
                }

                public static boolean I00000oOI(int i, int i2) {
/* 3 */             if (i == 5) {
/* 5 */                 if (i2 != 5) {
/* 1 */                     return true;
                        }
/* 7 */                 i = 5;
                    }
/* 11 */            if (i == 6) {
/* 13 */                if (i2 != 6 && i2 != 5) {
/* 1 */                     return true;
                        }
/* 17 */                i = 6;
                    }
/* 21 */            if (i == 4 && i2 != 4) {
/* 1 */                 return true;
                    }
/* 31 */            if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
/* 1 */                 return true;
                    }
/* 44 */            if (i == 2) {
                        return i2 == 1 || i2 == 8;
                    }
/* 51 */            return false;
                }
            }
