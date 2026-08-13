            package p000;
            
            public final class Ii0lO1O extends Io00Ol1o10O {
                public static final int BORDER_COLOR_FIELD_NUMBER = 4;
                public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
                private static final Ii0lO1O DEFAULT_INSTANCE;
                public static final int DOODLE_STROKE_FIELD_NUMBER = 7;
                public static final int FILL_COLOR_FIELD_NUMBER = 5;
                public static final int FILL_MODE_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int ROTATION_DEGREE_FIELD_NUMBER = 2;
                private int borderColor_;
                private int borderWidth_;
                private int fillColor_;
                private int fillMode_;
                private int rotationDegree_;
                private String id_ = "";
                private Iool1IOO1o0i doodleStroke_ = OOiI0I0I.I00ilI0I1;

                static {
/* 3 */             Ii0lO1O ii0lO1O = new Ii0lO1O();
/* 6 */             DEFAULT_INSTANCE = ii0lO1O;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ii0lO1O.class, ii0lO1O);
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 90 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 83 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\f\u0007\u001b", new Object[]{"id_", "rotationDegree_", "borderWidth_", "borderColor_", "fillColor_", "fillMode_", "doodleStroke_", Oli000lO.class});
                        case 3:
/* 55 */                    return new Ii0lO1O();
                        case 4:
/* 49 */                    return new Ii0lIoI10lI(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ii0lO1O.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 40 */                            throw th;
                                }
                            }
/* 38 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }
            }
