            package p000;
            
            public final class i0l0I1Ilo extends i11O1oIl {
                private static final i0l0I1Ilo zbb;
                private int zbd;
                private int zbe;
                private int zbf;
                private int zbg;
                private int zbh;
                private byte zbi = 2;

                static {
/* 3 */             i0l0I1Ilo i0l0i1ilo = new i0l0I1Ilo();
/* 6 */             zbb = i0l0i1ilo;
/* 10 */            i11O1oIl.I0000O(i0l0I1Ilo.class, i0l0i1ilo);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 69 */                return Byte.valueOf(this.zbi);
                    }
/* 6 */             if (i2 == 2) {
/* 63 */                return new i11lilllII(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i0l0I1Ilo();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0l0I00I0(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbi = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
