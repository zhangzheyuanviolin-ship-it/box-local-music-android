            package p000;
            
            public abstract class lOIo0Iioi {
                public static final int I00000oIO(long j, long[] jArr) {
                    int length = jArr.length - 1;
/* 4 */             int i = 0;
/* 5 */             while (i <= length) {
/* 9 */                 int i2 = (i + length) >>> 1;
/* 11 */                long j2 = jArr[i2];
/* 15 */                if (j > j2) {
/* 17 */                    i = i2 + 1;
                        } else {
/* 20 */                    if (j >= j2) {
/* 25 */                        return i2;
                            }
                            length = i2 - 1;
                        }
                    }
/* 28 */            return -(i + 1);
                }
            }
