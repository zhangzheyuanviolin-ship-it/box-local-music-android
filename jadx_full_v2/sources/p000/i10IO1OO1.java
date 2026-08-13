            package p000;
            
            public final class i10IO1OO1 extends i11O011 {
                private static final i10IO1OO1 zbd;
                private int zbe;
                private boolean zbf;
                private byte zbg = 2;

                static {
/* 3 */             i10IO1OO1 i10io1oo1 = new i10IO1OO1();
/* 6 */             zbd = i10io1oo1;
/* 10 */            i11O1oIl.I0000O(i10IO1OO1.class, i10io1oo1);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return Byte.valueOf(this.zbg);
                    }
/* 6 */             if (i2 == 2) {
/* 57 */                return new i11lilllII(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10IO1OO1();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0i1OIii01i(zbd);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbd;
                    }
/* 22 */            this.zbg = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
