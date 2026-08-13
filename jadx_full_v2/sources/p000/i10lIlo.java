            package p000;
            
            public final class i10lIlo extends i11O1oIl {
                private static final i10lIlo zbb;
                private int zbd;
                private int zbe;
                private int zbf;
                private int zbg;
                private int zbh;
                private float zbi;
                private byte zbj = 2;

                static {
/* 3 */             i10lIlo i10lilo = new i10lIlo();
/* 6 */             zbb = i10lilo;
/* 10 */            i11O1oIl.I0000O(i10lIlo.class, i10lilo);
                }

                public static i10lIlo I00111O() {
/* 1 */             return zbb;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 71 */                return Byte.valueOf(this.zbj);
                    }
/* 6 */             if (i2 == 2) {
/* 65 */                return new i11lilllII(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10lIlo();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbj = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final float I000oI1ioi() {
/* 1 */             return this.zbi;
                }

                public final int I00100l0() {
/* 1 */             return this.zbh;
                }

                public final int I00100o1O0lo() {
/* 1 */             return this.zbe;
                }

                public final int I0010I0i() {
/* 1 */             return this.zbf;
                }

                public final int I0010o() {
/* 1 */             return this.zbg;
                }
            }
