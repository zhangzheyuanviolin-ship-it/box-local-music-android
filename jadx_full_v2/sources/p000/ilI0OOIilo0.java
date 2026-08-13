            package p000;
            
            public abstract class ilI0OOIilo0 {
                public static final long I00000oIO(long j, Iio1llolooo iio1llolooo) {
                    long j2;
/* 1 */             int iOrdinal = iio1llolooo.ordinal();
/* 10 */            if (iOrdinal == 2) {
/* 45 */                j2 = 1;
                    } else if (iOrdinal == 3) {
/* 42 */                j2 = 1000;
                    } else if (iOrdinal == 4) {
/* 38 */                j2 = 60000;
                    } else if (iOrdinal == 5) {
/* 34 */                j2 = 3600000;
                    } else {
/* 22 */                if (iOrdinal != 6) {
/* 30 */                    IOOlIIilOl0.I000lI("Wrong unit for millisMultiplier: ", iio1llolooo);
/* 6 */                     return 0L;
                        }
/* 24 */                j2 = 86400000;
                    }
/* 48 */            if (j == 0) {
/* 6 */                 return 0L;
                    }
/* 58 */            if (j == 1) {
/* 62 */                if (j2 <= 4611686018427387903L) {
/* 65 */                    return j2;
                        }
                    } else if (j2 != 1) {
/* 86 */                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
/* 89 */                if (iNumberOfLeadingZeros < 63) {
/* 91 */                    return j * j2;
                        }
/* 93 */                if (iNumberOfLeadingZeros <= 63) {
/* 96 */                    long j3 = j * j2;
/* 99 */                    if (j3 <= 4611686018427387903L) {
/* 551 */                       return j3;
                            }
                        }
                    } else if (j <= 4611686018427387903L) {
/* 75 */                return j;
                    }
/* 53 */            return 4611686018427387903L;
                }
            }
