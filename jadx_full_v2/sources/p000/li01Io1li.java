            package p000;
            
            public abstract class li01Io1li {
                public static final double I00000oIO(long j) {
/* 13 */            return ((j >>> 11) * 2048.0d) + (j & 2047);
                }

                public static final String I00000oOI(int i, long j) {
/* 5 */             if (j >= 0) {
/* 7 */                 iOlI1lIi0.I00000oIO(i);
/* 10 */                return Long.toString(j, i);
                    }
                    long j2 = i;
/* 20 */            long j3 = ((j >>> 1) / j2) << 1;
/* 24 */            long j4 = j - (j3 * j2);
/* 27 */            if (j4 >= j2) {
/* 29 */                j4 -= j2;
/* 32 */                j3++;
                    }
/* 33 */            iOlI1lIi0.I00000oIO(i);
/* 36 */            String string = Long.toString(j3, i);
/* 40 */            iOlI1lIi0.I00000oIO(i);
/* 47 */            return string.concat(Long.toString(j4, i));
                }
            }
