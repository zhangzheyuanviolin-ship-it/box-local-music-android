            package p000;
            
            public final class i10lO1lO0 extends i11O1oIl {
                private static final i10lO1lO0 zbb;
                private int zbd;
                private i10llI0i1 zbe;
                private double zbf;
                private double zbg;

                static {
/* 3 */             i10lO1lO0 i10lo1lo0 = new i10lO1lO0();
/* 6 */             zbb = i10lo1lo0;
/* 10 */            i11O1oIl.I0000O(i10lO1lO0.class, i10lo1lo0);
                }

                public static i10lIo1Ol I000oI1ioi() {
/* 7 */             return (i10lIo1Ol) zbb.I000iOII();
                }

                public static void I00100l0(i10lO1lO0 i10lo1lo0, i10llI0i1 i10lli0i1) {
/* 1 */             i10lo1lo0.zbe = i10lli0i1;
                    i10lo1lo0.zbd |= 1;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new i11lilllII(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new i10lO1lO0();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i10lIo1Ol(zbb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zbb;
                }
            }
