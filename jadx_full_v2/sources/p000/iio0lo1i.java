            package p000;
            
            public abstract class iio0lo1i {
                public static long I00000oIO(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = 262142;
/* 4 */             int iMin = Math.min(i3, 262142);
/* 15 */            int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
/* 23 */            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
/* 26 */            if (i6 >= 8191) {
/* 31 */                if (i6 < 32767) {
/* 33 */                    i5 = 65534;
                        } else if (i6 < 65535) {
/* 42 */                    i5 = 32766;
                        } else {
/* 48 */                    if (i6 >= 262143) {
/* 68 */                        IOo0olo.I000l1(i6);
/* 71 */                        IOOlIIilOl0.I0000Il00O();
/* 74 */                        return 0L;
                            }
/* 50 */                    i5 = 8190;
                        }
                    }
/* 63 */            return IOo0olo.I00000oIO(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
                }

                public static long I00000oOI(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = 262142;
/* 4 */             int iMin = Math.min(i, 262142);
/* 15 */            int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
/* 23 */            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
/* 26 */            if (i6 >= 8191) {
/* 31 */                if (i6 < 32767) {
/* 33 */                    i5 = 65534;
                        } else if (i6 < 65535) {
/* 42 */                    i5 = 32766;
                        } else {
/* 48 */                    if (i6 >= 262143) {
/* 68 */                        IOo0olo.I000l1(i6);
/* 71 */                        IOOlIIilOl0.I0000Il00O();
/* 74 */                        return 0L;
                            }
/* 50 */                    i5 = 8190;
                        }
                    }
/* 63 */            return IOo0olo.I00000oIO(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
                }
            }
