            package p000;
            
            public final class i10o1I extends i11O1oIl {
                private static final i10o1I zbb;
                private int zbd;
                private float zbe;
                private int zbf;
                private byte zbg = 2;

                static {
/* 3 */             i10o1I i10o1i = new i10o1I();
/* 6 */             zbb = i10o1i;
/* 10 */            i11O1oIl.I0000O(i10o1I.class, i10o1i);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 65 */                return Byte.valueOf(this.zbg);
                    }
/* 6 */             if (i2 == 2) {
/* 59 */                return new i11lilllII(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i10o1I();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i10OOIoio011(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbg = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
