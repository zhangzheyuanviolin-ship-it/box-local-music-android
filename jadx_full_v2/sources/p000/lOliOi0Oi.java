            package p000;
            
            public abstract class lOliOi0Oi {
                public static final long I00000oIO(int i, int i2) {
/* 1 */             if (i < 0 || i2 < 0) {
/* 33 */                Ioliol.I00000oIO("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
                    }
/* 47 */            long j = (i2 & 4294967295L) | (i << 32);
/* 48 */            int i3 = Oo0lI00l.I0000Il00O;
/* 106 */           return j;
                }

                public static final long I00000oOI(int i, long j) {
/* 1 */             int i2 = Oo0lI00l.I0000Il00O;
/* 7 */             int i3 = (int) (j >> 32);
/* 13 */            int i4 = i3 < 0 ? 0 : i3;
/* 14 */            if (i4 > i) {
/* 16 */                i4 = i;
                    }
/* 23 */            int i5 = (int) (4294967295L & j);
/* 24 */            int i6 = i5 >= 0 ? i5 : 0;
/* 28 */            if (i6 <= i) {
/* 31 */                i = i6;
                    }
                    return (i4 == i3 && i == i5) ? j : I00000oIO(i4, i);
                }
            }
