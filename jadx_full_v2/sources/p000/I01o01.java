            package p000;
            
            public final class I01o01 extends I01loIooI {
                public static I01o01 I0000Il00O;

                @Override
                public final int[] I000iOII(int i) {
/* 5 */             int length = I000oI1ioi().length();
/* 9 */             if (length <= 0 || i >= length) {
/* 62 */                return null;
                    }
/* 15 */            if (i < 0) {
/* 17 */                i = 0;
                    }
/* 18 */            while (i < length && I000oI1ioi().charAt(i) == '\n' && (I000oI1ioi().charAt(i) == '\n' || (i != 0 && I000oI1ioi().charAt(i - 1) != '\n'))) {
/* 57 */                i++;
                    }
/* 60 */            if (i >= length) {
/* 62 */                return null;
                    }
/* 64 */            int i2 = i + 1;
/* 66 */            while (i2 < length && !I001l0I00(i2)) {
/* 74 */                i2++;
                    }
/* 77 */            return I000o00OoI0I(i, i2);
                }

                @Override
                public final int[] I001i1lo1io(int i) {
/* 5 */             int length = I000oI1ioi().length();
/* 9 */             if (length <= 0 || i <= 0) {
/* 45 */                return null;
                    }
/* 15 */            if (i > length) {
/* 17 */                i = length;
                    }
/* 20 */            while (i > 0 && I000oI1ioi().charAt(i - 1) == '\n' && !I001l0I00(i)) {
                        i--;
                    }
/* 43 */            if (i <= 0) {
/* 45 */                return null;
                    }
                    int i2 = i - 1;
/* 49 */            while (i2 > 0 && (I000oI1ioi().charAt(i2) == '\n' || (i2 != 0 && I000oI1ioi().charAt(i2 - 1) != '\n'))) {
                        i2--;
                    }
/* 79 */            return I000o00OoI0I(i2, i);
                }

                public final boolean I001l0I00(int i) {
/* 1 */             if (i <= 0 || I000oI1ioi().charAt(i - 1) == '\n') {
/* 39 */                return false;
                    }
                    return i == I000oI1ioi().length() || I000oI1ioi().charAt(i) == '\n';
                }
            }
