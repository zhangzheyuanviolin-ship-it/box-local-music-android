            package p000;
            
            public final class i01OiOoi {
                public static long I00000oIO(boolean z, int i, I1o1O1Ii1l0l i1o1O1Ii1l0l, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
/* 8 */             if (j6 != Long.MAX_VALUE && z2) {
/* 12 */                if (i2 != 0) {
/* 18 */                    long j7 = j2 + 900000;
/* 21 */                    if (j6 < j7) {
/* 23 */                        return j7;
                            }
                        }
/* 24 */                return j6;
                    }
/* 25 */            if (z) {
/* 41 */                long jScalb = i1o1O1Ii1l0l == I1o1O1Ii1l0l.I00iiI ? j * i : (long) Math.scalb(j, i - 1);
/* 47 */                if (jScalb > 18000000) {
/* 49 */                    jScalb = 18000000;
                        }
/* 50 */                return j2 + jScalb;
                    }
/* 52 */            if (z2) {
/* 58 */                long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
                        return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
                    }
/* 75 */            if (j2 == -1) {
/* 1 */                 return Long.MAX_VALUE;
                    }
/* 78 */            return j2 + j3;
                }
            }
