            package p000;
            
            public final class i01o1oIO extends Io00Io0IO11 {
                private static final i01o1oIO DEFAULT_INSTANCE;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private int version_;

                static {
/* 3 */             i01o1oIO i01o1oio = new i01o1oIO();
/* 6 */             DEFAULT_INSTANCE = i01o1oio;
/* 10 */            Io00Io0IO11.I001IO000(i01o1oIO.class, i01o1oio);
                }

                public static i01o1oIO I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static i01o1oIO I001l0I00(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (i01o1oIO) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 74 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 67 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
                        case 3:
/* 53 */                    return new i01o1oIO();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 5);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (i01o1oIO.class) {
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
