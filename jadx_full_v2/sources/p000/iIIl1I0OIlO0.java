            package p000;
            
            public abstract class iIIl1I0OIlO0 {
                public static final int[] I00000oIO = new int[0];
                public static final long[] I00000oOI = new long[0];
                public static final Object[] I0000Il00O = new Object[0];

                public static final int I00000oIO(int i, int i2, int[] iArr) {
                    int i3 = i - 1;
/* 3 */             int i4 = 0;
/* 4 */             while (i4 <= i3) {
/* 8 */                 int i5 = (i4 + i3) >>> 1;
/* 10 */                int i6 = iArr[i5];
/* 12 */                if (i6 < i2) {
/* 14 */                    i4 = i5 + 1;
                        } else {
/* 17 */                    if (i6 <= i2) {
/* 22 */                        return i5;
                            }
                            i3 = i5 - 1;
                        }
                    }
/* 23 */            return ~i4;
                }

                public static final int I00000oOI(long[] jArr, int i, long j) {
                    int i2 = i - 1;
/* 3 */             int i3 = 0;
/* 4 */             while (i3 <= i2) {
/* 8 */                 int i4 = (i3 + i2) >>> 1;
/* 10 */                long j2 = jArr[i4];
/* 14 */                if (j2 < j) {
/* 16 */                    i3 = i4 + 1;
                        } else {
/* 19 */                    if (j2 <= j) {
/* 24 */                        return i4;
                            }
                            i2 = i4 - 1;
                        }
                    }
/* 25 */            return ~i3;
                }
            }
