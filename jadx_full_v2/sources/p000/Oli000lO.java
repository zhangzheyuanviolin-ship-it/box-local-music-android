            package p000;
            
            public final class Oli000lO extends Io00Ol1o10O {
                public static final int BLUR_TYPE_FIELD_NUMBER = 5;
                public static final int BRUSH_COLOR_FIELD_NUMBER = 2;
                public static final int BRUSH_SIZE_FIELD_NUMBER = 3;
                public static final int BRUSH_SOFTNESS_FIELD_NUMBER = 4;
                private static final Oli000lO DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int POINT_FIELD_NUMBER = 1;
                private int blurType_;
                private int brushColor_;
                private float brushSize_;
                private float brushSoftness_;
                private Iool1IOO1o0i point_ = OOiI0I0I.I00ilI0I1;

                static {
/* 3 */             Oli000lO oli000lO = new Oli000lO();
/* 6 */             DEFAULT_INSTANCE = oli000lO;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Oli000lO.class, oli000lO);
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 86 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 79 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003\u0001\u0004\u0001\u0005\u0004", new Object[]{"point_", OO1Oloii0l.class, "brushColor_", "brushSize_", "brushSoftness_", "blurType_"});
                        case 3:
/* 55 */                    return new Oli000lO();
                        case 4:
/* 49 */                    return new Ii0lIoI10lI(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Oli000lO.class) {
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
