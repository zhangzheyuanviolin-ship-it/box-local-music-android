            package p000;
            
            public final class i0i1oI1l0 extends i11O1oIl {
                private static final i0i1oI1l0 zbb;
                private Object zbe;
                private int zbd = 0;
                private byte zbf = 2;

                static {
/* 3 */             i0i1oI1l0 i0i1oi1l0 = new i0i1oI1l0();
/* 6 */             zbb = i0i1oi1l0;
/* 10 */            i11O1oIl.I0000O(i0i1oI1l0.class, i0i1oi1l0);
                }

                public static i0i1oI1l0 I0010o() {
/* 1 */             return zbb;
                }

                @Override
                public final Object I000OOo1O(int i, i11O1oIl i11o1oil) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 69 */                return Byte.valueOf(this.zbf);
                    }
/* 6 */             if (i2 == 2) {
/* 63 */                return new i11lilllII(zbb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"zbe", "zbd", i0i1ioOI1O.class, i10lIlo.class, i10l1oioI.class});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new i0i1oI1l0();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new i0i1OOilO(zbb);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zbb;
                    }
/* 22 */            this.zbf = i11o1oil == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }

                public final boolean I000oI1ioi() {
                    return this.zbd == 1;
                }

                public final i10l1oioI I00100l0() {
                    return this.zbd == 3 ? (i10l1oioI) this.zbe : i10l1oioI.I000oI1ioi();
                }

                public final i10lIlo I00100o1O0lo() {
                    return this.zbd == 2 ? (i10lIlo) this.zbe : i10lIlo.I00111O();
                }

                public final i0i1ioOI1O I0010I0i() {
                    return this.zbd == 1 ? (i0i1ioOI1O) this.zbe : i0i1ioOI1O.I00100l0();
                }

                public final boolean I00111O() {
                    return this.zbd == 3;
                }
            }
