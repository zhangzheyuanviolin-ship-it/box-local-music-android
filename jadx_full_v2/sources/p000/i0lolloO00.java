            package p000;
            
            public final class i0lolloO00 extends i11O1oIl {
                private static final i0lolloO00 zbb;
                private int zbd;
                private Object zbf;
                private i0oIIlI zbg;
                private boolean zbh;
                private i0oo10oI1 zbi;
                private i0olII0I11oi zbj;
                private i0o11Ilo0lOI zbk;
                private int zbl;
                private int zbe = 0;
                private byte zbm = 2;

                static {
/* 3 */             i0lolloO00 i0lolloo00 = new i0lolloO00();
/* 6 */             zbb = i0lolloo00;
/* 10 */            i11O1oIl.I0000O(i0lolloO00.class, i0lolloo00);
                }

                public static i0loOil1I I00100l0() {
/* 7 */             return (i0loOil1I) zbb.I000iOII();
                }

                public static void I00100o1O0lo(i0lolloO00 i0lolloo00, i0olII0I11oi i0olii0i11oi) {
/* 1 */             i0lolloo00.zbj = i0olii0i11oi;
                    i0lolloo00.zbd |= 8;
                }

                public static void I0010I0i(i0lolloO00 i0lolloo00, i0oIIlI i0oiili) {
/* 1 */             i0lolloo00.zbg = i0oiili;
                    i0lolloo00.zbd |= 1;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 77 */                return Byte.valueOf(this.zbm);
                    }
/* 6 */             if (i2 == 2) {
/* 71 */                return new i11lilllII(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i0lolloO00();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0loOil1I(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbm = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final int I000oI1ioi() {
/* 1 */             return this.zbl;
                }

                public final boolean I0010o() {
/* 4 */             if (this.zbe == 6) {
/* 10 */                return ((Boolean) this.zbf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final boolean I00111O() {
/* 4 */             if (this.zbe == 5) {
/* 10 */                return ((Boolean) this.zbf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final boolean I001IIilI0O() {
                    return (this.zbd & 32) != 0;
                }
            }
