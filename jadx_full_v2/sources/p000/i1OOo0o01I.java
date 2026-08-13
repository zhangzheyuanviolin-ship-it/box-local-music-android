            package p000;
            
            public final class i1OOo0o01I extends i1Ol0iIil {
                public int I00iio;

                @Override
                public final byte I00000oOI(int i) {
/* 1 */             int i2 = this.I00iio;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 38 */                return this.I00iiI[i];
                    }
/* 10 */            if (i < 0) {
/* 18 */                OoOil11Ol1o.I0010I0i(Oi010OO0.I000oI1ioi(i, "Index < 0: "));
/* 21 */                return (byte) 0;
                    }
/* 31 */            OoOil11Ol1o.I0010I0i(IIl001iO0Io.I000l1(i, i2, "Index > length: ", ", "));
/* 34 */            return (byte) 0;
                }

                @Override
                public final byte I0000O(int i) {
/* 3 */             return this.I00iiI[i];
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return this.I00iio;
                }
            }
