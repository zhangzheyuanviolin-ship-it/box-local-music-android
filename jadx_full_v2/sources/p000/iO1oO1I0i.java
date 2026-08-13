            package p000;
            
            public abstract class iO1oO1I0i {
                public static final int I00000oIO(OiiIIoi oiiIIoi, int i) {
                    int i2;
/* 1 */             int[] iArr = oiiIIoi.I00ilO0;
/* 3 */             int i3 = i + 1;
                    int length = oiiIIoi.I00ilI0I1.length - 1;
/* 10 */            int i4 = 0;
                    while (true) {
/* 11 */                if (i4 <= length) {
/* 15 */                    i2 = (i4 + length) >>> 1;
/* 17 */                    int i5 = iArr[i2];
/* 19 */                    if (i5 >= i3) {
/* 24 */                        if (i5 <= i3) {
                                    break;
                                }
                                length = i2 - 1;
                            } else {
/* 21 */                        i4 = i2 + 1;
                            }
                        } else {
                            i2 = (-i4) - 1;
                            break;
                        }
                    }
                    return i2 >= 0 ? i2 : ~i2;
                }
            }
