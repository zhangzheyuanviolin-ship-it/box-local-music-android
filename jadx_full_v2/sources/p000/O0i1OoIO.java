            package p000;
            
            public final class O0i1OoIO extends Io00Io0IO11 {
                private static final O0i1OoIO DEFAULT_INSTANCE;
                public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
                public static final int KEK_URI_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER;
                private O0OIIIoOilol dekTemplate_;
                private String kekUri_ = "";

                static {
/* 3 */             O0i1OoIO o0i1OoIO = new O0i1OoIO();
/* 6 */             DEFAULT_INSTANCE = o0i1OoIO;
/* 10 */            Io00Io0IO11.I001IO000(O0i1OoIO.class, o0i1OoIO);
                }

                public static O0i1OoIO I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O0i1OoIO I001lloI(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (O0i1OoIO) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 76 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 69 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
                        case 3:
/* 53 */                    return new O0i1OoIO();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 3);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0i1OoIO.class) {
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

                public final O0OIIIoOilol I001l0I00() {
/* 1 */             O0OIIIoOilol o0OIIIoOilol = this.dekTemplate_;
                    return o0OIIIoOilol == null ? O0OIIIoOilol.I001iOo1i0O() : o0OIIIoOilol;
                }

                public final String I001lIiIIo1O() {
/* 1 */             return this.kekUri_;
                }

                public final boolean I001lllioOl() {
                    return this.dekTemplate_ != null;
                }
            }
