            package p000;
            
            public abstract class liill1Iil1 {
                public static int I00000oIO(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 23 */                I000II.I000O01llI0("cannot store more than MAX_VALUE elements");
/* 26 */                return 0;
                    }
/* 6 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 8 */             if (iI0000Il00O < i2) {
/* 11 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 15 */            if (iI0000Il00O < 0) {
/* 17 */                return Integer.MAX_VALUE;
                    }
/* 20 */            return iI0000Il00O;
                }
            }
