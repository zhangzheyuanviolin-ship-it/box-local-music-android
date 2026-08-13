            package p000;
            
            public final class i1I1OO extends i11O011 {
                private static final i1I1OO zbd;
                private int zbe;
                private double zbf;
                private int zbg;
                private int zbh;
                private double zbi;
                private double zbj;
                private byte zbk = 2;

                static {
/* 3 */             i1I1OO i1i1oo = new i1I1OO();
/* 6 */             zbd = i1i1oo;
/* 10 */            i11O1oIl.I0000O(i1I1OO.class, i1i1oo);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 71 */                return Byte.valueOf(this.zbk);
                    }
/* 6 */             if (i2 == 2) {
/* 65 */                return new i11lilllII(zbd, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i1I1OO();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0i1OIii01i(zbd);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbd;
                    }
/* 22 */            this.zbk = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
