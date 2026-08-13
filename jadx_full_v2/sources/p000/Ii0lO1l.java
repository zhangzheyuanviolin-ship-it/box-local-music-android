            package p000;

            import java.io.FileInputStream;
            
            public final class Ii0lO1l extends Io00Ol1o10O {
                public static final int CUTOUT_FIELD_NUMBER = 1;
                private static final Ii0lO1l DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER;
                private Iool1IOO1o0i cutout_ = OOiI0I0I.I00ilI0I1;

                static {
/* 3 */             Ii0lO1l ii0lO1l = new Ii0lO1l();
/* 6 */             DEFAULT_INSTANCE = ii0lO1l;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ii0lO1l.class, ii0lO1l);
                }

                public static Ii0lO1l I0010I0i() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Ii0lO1l I0010o(FileInputStream fileInputStream) {
/* 7 */             return (Ii0lO1l) Io00Ol1o10O.I000o00OoI0I(DEFAULT_INSTANCE, fileInputStream);
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
/* 70 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"cutout_", Ii0lO1O.class});
                        case 3:
/* 54 */                    return new Ii0lO1l();
                        case 4:
/* 48 */                    return new Ii0lIoI10lI(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ii0lO1l.class) {
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
