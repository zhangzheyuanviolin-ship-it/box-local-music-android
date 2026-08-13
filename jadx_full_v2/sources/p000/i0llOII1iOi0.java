            package p000;
            
            public final class i0llOII1iOi0 extends i11O011 {
                private static final i0llOII1iOi0 zbd;
                private byte zbe = 2;

                static {
/* 3 */             i0llOII1iOi0 i0lloii1ioi0 = new i0llOII1iOi0();
/* 6 */             zbd = i0lloii1ioi0;
/* 10 */            i11O1oIl.I0000O(i0llOII1iOi0.class, i0lloii1ioi0);
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return Byte.valueOf(this.zbe);
                    }
/* 7 */             if (i2 == 2) {
/* 49 */                return new i11lilllII(zbd, "\u0001\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 39 */                return new i0llOII1iOi0();
                    }
/* 13 */            if (i2 == 4) {
/* 33 */                return new i0i1OIii01i(zbd);
                    }
/* 16 */            if (i2 == 5) {
/* 26 */                return zbd;
                    }
/* 23 */            this.zbe = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 6 */             return null;
                }
            }
