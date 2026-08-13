            package p000;
            
            public final class i10OoIiI extends i11O1oIl {
                private static final i10OoIiI zbb;
                private int zbd;
                private i10O1o1I0 zbg;
                private byte zbh = 2;
                private String zbe = "InOrderOutputStreamHandler";
                private i11Oi1oO zbf = i11lilI.I00iio;

                static {
/* 3 */             i10OoIiI i10ooiii = new i10OoIiI();
/* 6 */             zbb = i10ooiii;
/* 10 */            i11O1oIl.I0000O(i10OoIiI.class, i10ooiii);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 67 */                return Byte.valueOf(this.zbh);
                    }
/* 6 */             if (i2 == 2) {
/* 61 */                return new i11lilllII(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10OoIiI();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbh = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
