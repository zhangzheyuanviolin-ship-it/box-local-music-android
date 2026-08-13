            package p000;
            
            public final class i10l1oioI extends i11O1oIl {
                private static final i10l1oioI zbb;
                private int zbd;
                private i10l1i0O zbe;
                private double zbf;
                private boolean zbg;
                private i10lIlo zbh;
                private byte zbi = 2;

                static {
/* 3 */             i10l1oioI i10l1oioi = new i10l1oioI();
/* 6 */             zbb = i10l1oioi;
/* 10 */            i11O1oIl.I0000O(i10l1oioI.class, i10l1oioi);
                }

                public static i10l1oioI I000oI1ioi() {
/* 1 */             return zbb;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 69 */                return Byte.valueOf(this.zbi);
                    }
/* 6 */             if (i2 == 2) {
/* 63 */                return new i11lilllII(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10l1oioI();
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

                public final i10lIlo I00100l0() {
/* 1 */             i10lIlo i10lilo = this.zbh;
                    return i10lilo == null ? i10lIlo.I00111O() : i10lilo;
                }
            }
