            package p000;
            
            public abstract class l11O00IiOiOi {
                public static final long I00000oIO(long j) {
/* 5 */             if (j < 0) {
/* 7 */                 IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 9 */                 return Iio1OlIo0.I00iio;
                    }
/* 12 */            IOO0o0I1l iOO0o0I1l2 = Iio1OlIo0.I00iiI;
/* 14 */            return Iio1OlIo0.I00iiO;
                }

                public static final long I00000oOI(long j, long j2) {
/* 1 */             Iio1llolooo iio1llolooo = Iio1llolooo.I00iiI;
/* 3 */             long j3 = j - j2;
/* 15 */            if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
/* 60 */                return ilI0IilIOi.I0000O(j3, iio1llolooo);
                    }
/* 17 */            Iio1llolooo iio1llolooo2 = Iio1llolooo.I00iiO;
/* 23 */            if (iio1llolooo.compareTo(iio1llolooo2) >= 0) {
/* 55 */                return Iio1OlIo0.I000O01llI0(I00000oIO(j3));
                    }
/* 32 */            long j4 = (j / 1000000) - (j2 / 1000000);
/* 35 */            long j5 = (j % 1000000) - (j2 % 1000000);
/* 36 */            IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 46 */            return Iio1OlIo0.I0001Ioi1lo(ilI0IilIOi.I0000O(j4, iio1llolooo2), ilI0IilIOi.I0000O(j5, iio1llolooo));
                }
            }
