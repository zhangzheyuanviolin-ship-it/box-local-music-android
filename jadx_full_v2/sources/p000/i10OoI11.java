            package p000;
            
            public final class i10OoI11 extends i11O1oIl {
                private static final i10OoI11 zbb;
                private int zbd;
                private i10O1o1I0 zbf;
                private byte zbg = 2;
                private String zbe = "DefaultInputStreamHandler";

                static {
/* 3 */             i10OoI11 i10ooi11 = new i10OoI11();
/* 6 */             zbb = i10ooi11;
/* 10 */            i11O1oIl.I0000O(i10OoI11.class, i10ooi11);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 65 */                return Byte.valueOf(this.zbg);
                    }
/* 6 */             if (i2 == 2) {
/* 59 */                return new i11lilllII(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10OoI11();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbg = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
