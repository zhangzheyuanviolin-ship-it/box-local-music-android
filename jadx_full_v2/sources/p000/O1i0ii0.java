            package p000;
            
            public final class O1i0ii0 extends Io00Ol1o10O {
                private static final O1i0ii0 DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER;

                static {
/* 3 */             O1i0ii0 o1i0ii0 = new O1i0ii0();
/* 6 */             DEFAULT_INSTANCE = o1i0ii0;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O1i0ii0.class, o1i0ii0);
                }

                public static O1i0ii0 I0010I0i() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 69 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 62 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0000", null);
                        case 3:
/* 54 */                    return new O1i0ii0();
                        case 4:
/* 48 */                    return new Ii0lIoI10lI(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (O1i0ii0.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 39 */                            throw th;
                                }
                            }
/* 37 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }
            }
