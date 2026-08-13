            package p000;
            
            public final class i0llli0IlII extends i11O1oIl {
                private static final i0llli0IlII zbb;
                private int zbA;
                private boolean zbB;
                private i0lllO0iOlOO zbC;
                private int zbd;
                private boolean zbg;
                private i10lO1lO0 zbh;
                private boolean zbi;
                private int zbj;
                private int zbk;
                private boolean zbl;
                private boolean zbm;
                private float zbn;
                private float zbo;
                private boolean zbp;
                private boolean zbq;
                private boolean zbt;
                private int zbu;
                private boolean zbv;
                private boolean zbx;
                private i10loOi1iO zby;
                private boolean zbz;
                private String zbe = "";
                private String zbf = "";
                private boolean zbr = true;
                private boolean zbs = true;
                private float zbw = 0.75f;

                static {
/* 3 */             i0llli0IlII i0llli0ilii = new i0llli0IlII();
/* 6 */             zbb = i0llli0ilii;
/* 10 */            i11O1oIl.I0000O(i0llli0IlII.class, i0llli0ilii);
                }

                public static i0lli0l I000oI1ioi() {
/* 7 */             return (i0lli0l) zbb.I000iOII();
                }

                public static void I00100l0(i0llli0IlII i0llli0ilii, String str) {
                    i0llli0ilii.zbd |= 1;
/* 7 */             i0llli0ilii.zbe = str;
                }

                public static void I00100o1O0lo(i0llli0IlII i0llli0ilii, String str) {
                    i0llli0ilii.zbd |= 2;
/* 7 */             i0llli0ilii.zbf = str;
                }

                public static void I0010I0i(i0llli0IlII i0llli0ilii) {
                    i0llli0ilii.zbd |= 4;
/* 8 */             i0llli0ilii.zbg = true;
                }

                public static void I0010o(i0llli0IlII i0llli0ilii, i10lO1lO0 i10lo1lo0) {
/* 1 */             i0llli0ilii.zbh = i10lo1lo0;
                    i0llli0ilii.zbd |= 8;
                }

                public static void I00111O(i0llli0IlII i0llli0ilii) {
                    i0llli0ilii.zbd |= 16;
/* 8 */             i0llli0ilii.zbi = true;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 103 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return new i11lilllII(zbb, "\u0001\u0019\u0000\u0001\u0001\u001b\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\t\u0004ဇ\u0007\u0005ခ\n\u0006ဇ\b\bင\u0016\tင\u0006\nဇ\u000b\u000bဇ\f\fဇ\r\rဇ\u000e\u000eဇ\u000f\u000fင\u0010\u0010ဇ\u0011\u0011ခ\u0012\u0012ဇ\u0013\u0013ဉ\u0014\u0014ဇ\u0002\u0015ဉ\u0018\u0016ဇ\u0017\u0017ဉ\u0003\u0018ဇ\u0004\u0019ဇ\u0015\u001bင\u0005", new Object[]{"zbd", "zbe", "zbf", "zbn", "zbl", "zbo", "zbm", "zbA", "zbk", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbg", "zbC", "zbB", "zbh", "zbi", "zbz", "zbj"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new i0llli0IlII();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new i0lli0l(zbb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zbb;
                }
            }
