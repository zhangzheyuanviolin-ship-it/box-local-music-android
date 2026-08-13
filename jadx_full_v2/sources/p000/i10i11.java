            package p000;
            
            public final class i10i11 extends i11O1oIl {
                private static final i10i11 zbb;
                private int zbd;
                private float zbe;
                private float zbf;
                private float zbg;
                private float zbh;
                private float zbi;
                private long zbj;
                private byte zbk = 2;

                static {
/* 3 */             i10i11 i10i11Var = new i10i11();
/* 6 */             zbb = i10i11Var;
/* 10 */            i11O1oIl.I0000O(i10i11.class, i10i11Var);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 73 */                return Byte.valueOf(this.zbk);
                    }
/* 6 */             if (i2 == 2) {
/* 67 */                return new i11lilllII(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10i11();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbk = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
