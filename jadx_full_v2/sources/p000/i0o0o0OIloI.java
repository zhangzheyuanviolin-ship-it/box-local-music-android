            package p000;
            
            public final class i0o0o0OIloI extends i11O1oIl {
                private static final i0o0o0OIloI zbb;
                private int zbd;
                private int zbe;
                private int zbf = 2;
                private String zbg = "";

                static {
/* 3 */             i0o0o0OIloI i0o0o0oiloi = new i0o0o0OIloI();
/* 6 */             zbb = i0o0o0oiloi;
/* 10 */            i11O1oIl.I0000O(i0o0o0OIloI.class, i0o0o0oiloi);
                }

                public static i0o0loii I000oI1ioi() {
/* 7 */             return (i0o0loii) zbb.I000iOII();
                }

                public static void I00100l0(i0o0o0OIloI i0o0o0oiloi, int i) {
/* 3 */             i0o0o0oiloi.zbe = i - 1;
                    i0o0o0oiloi.zbd |= 1;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 61 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return new i11lilllII(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", i0i0lo1lo.I001i1lo1io, "zbf", "zbg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new i0o0o0OIloI();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i0o0loii(zbb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zbb;
                }
            }
