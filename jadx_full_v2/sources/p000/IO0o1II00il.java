            package p000;
            
            public final class IO0o1II00il extends Io00Io0IO11 {
                private static final IO0o1II00il DEFAULT_INSTANCE;
                private static volatile OO01I1 PARSER;

                static {
/* 3 */             IO0o1II00il iO0o1II00il = new IO0o1II00il();
/* 6 */             DEFAULT_INSTANCE = iO0o1II00il;
/* 10 */            Io00Io0IO11.I001IO000(IO0o1II00il.class, iO0o1II00il);
                }

                public static IO0o1II00il I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static IO0o1II00il I001l0I00(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (IO0o1II00il) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 68 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 61 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                        case 3:
/* 53 */                    return new IO0o1II00il();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 0);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (IO0o1II00il.class) {
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
