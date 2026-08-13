            package p000;
            
            public final class OO1Oloii0l extends Io00Ol1o10O {
                private static final OO1Oloii0l DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int X_FIELD_NUMBER = 1;
                public static final int Y_FIELD_NUMBER = 2;
                private float x_;
                private float y_;

                static {
/* 3 */             OO1Oloii0l oO1Oloii0l = new OO1Oloii0l();
/* 6 */             DEFAULT_INSTANCE = oO1Oloii0l;
/* 10 */            Io00Ol1o10O.I000oI1ioi(OO1Oloii0l.class, oO1Oloii0l);
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
                        case 3:
/* 54 */                    return new OO1Oloii0l();
                        case 4:
/* 48 */                    return new Ii0lIoI10lI(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (OO1Oloii0l.class) {
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
