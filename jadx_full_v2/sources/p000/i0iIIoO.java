            package p000;
            
            public final class i0iIIoO extends i11O1oIl {
                private static final i0iIIoO zbb;
                private int zbd;
                private byte zbg = 2;
                private String zbe = "";
                private float zbf = 1.0f;

                static {
/* 3 */             i0iIIoO i0iiioo = new i0iIIoO();
/* 6 */             zbb = i0iiioo;
/* 10 */            i11O1oIl.I0000O(i0iIIoO.class, i0iiioo);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 65 */                return Byte.valueOf(this.zbg);
                    }
/* 6 */             if (i2 == 2) {
/* 59 */                return new i11lilllII(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i0iIIoO();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0i1OOilO(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbg = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final float I000oI1ioi() {
/* 1 */             return this.zbf;
                }

                public final String I00100l0() {
/* 1 */             return this.zbe;
                }
            }
