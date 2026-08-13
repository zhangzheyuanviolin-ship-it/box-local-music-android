            package p000;
            
            public final class OOoiooI1Iio extends Io00Io0IO11 {
                public static final int CONFIG_NAME_FIELD_NUMBER = 1;
                private static final OOoiooI1Iio DEFAULT_INSTANCE;
                public static final int ENTRY_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER;
                private String configName_ = "";
                private Iool0o0iOI entry_ = OOiI00liIO.I00iio;

                static {
/* 3 */             OOoiooI1Iio oOoiooI1Iio = new OOoiooI1Iio();
/* 6 */             DEFAULT_INSTANCE = oOoiooI1Iio;
/* 10 */            Io00Io0IO11.I001IO000(OOoiooI1Iio.class, oOoiooI1Iio);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 78 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 71 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", O0OIoi1i1O.class});
                        case 3:
/* 53 */                    return new OOoiooI1Iio();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 4);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (OOoiooI1Iio.class) {
                                try {
/* 20 */                            io000II1liI = PARSER;
/* 22 */                            if (io000II1liI == null) {
/* 26 */                                io000II1liI = new Io000II1liI();
/* 29 */                                PARSER = io000II1liI;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                            }
/* 35 */                    return io000II1liI;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }
            }
