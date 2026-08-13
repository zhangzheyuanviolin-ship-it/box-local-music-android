            package p000;
            
            public final class O0i1I1i extends Io00Io0IO11 {
                private static final O0i1I1i DEFAULT_INSTANCE;
                public static final int KEY_URI_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER;
                private String keyUri_ = "";

                static {
/* 3 */             O0i1I1i o0i1I1i = new O0i1I1i();
/* 6 */             DEFAULT_INSTANCE = o0i1I1i;
/* 10 */            Io00Io0IO11.I001IO000(O0i1I1i.class, o0i1I1i);
                }

                public static O0i1I1i I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O0i1I1i I001lIiIIo1O(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (O0i1I1i) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 67 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
                        case 3:
/* 53 */                    return new O0i1I1i();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 2);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0i1I1i.class) {
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

                public final String I001l0I00() {
/* 1 */             return this.keyUri_;
                }
            }
