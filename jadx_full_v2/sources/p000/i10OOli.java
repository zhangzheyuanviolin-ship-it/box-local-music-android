            package p000;
            
            public final class i10OOli extends i11O1oIl {
                private static final i10OOli zbb;
                private int zbd;
                private i11Oi1oO zbf;
                private i11Oi1oO zbg;
                private i10O1o1I0 zbh;
                private byte zbi = 2;
                private String zbe = "";

                static {
/* 3 */             i10OOli i10ooli = new i10OOli();
/* 6 */             zbb = i10ooli;
/* 10 */            i11O1oIl.I0000O(i10OOli.class, i10ooli);
                }

                public i10OOli() {
/* 11 */            i11lilI i11lili = i11lilI.I00iio;
/* 13 */            this.zbf = i11lili;
/* 15 */            this.zbg = i11lili;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 69 */                return Byte.valueOf(this.zbi);
                    }
/* 6 */             if (i2 == 2) {
/* 63 */                return new i11lilllII(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001Ϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10OOli();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbi = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
