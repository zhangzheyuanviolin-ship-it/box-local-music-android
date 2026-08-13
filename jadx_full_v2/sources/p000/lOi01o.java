            package p000;
            
            public abstract class lOi01o {
                public static int I00000oIO(int i) {
                    int i2 = i - 1;
/* 5 */             int i3 = i2 | (i2 >>> 1);
/* 8 */             int i4 = i3 | (i3 >>> 2);
/* 11 */            int i5 = i4 | (i4 >>> 4);
/* 14 */            int i6 = i5 | (i5 >>> 8);
/* 17 */            int i7 = i6 | (i6 >>> 16);
/* 19 */            if (i7 < 4) {
/* 18 */                return 4;
                    }
/* 22 */            return i7 + 1;
                }
            }
