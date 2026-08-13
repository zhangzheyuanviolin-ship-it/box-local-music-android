            package p000;
            
            public final class I0Ollli1 extends Io00Io0IO11 {
                private static final I0Ollli1 DEFAULT_INSTANCE;
                public static final int IV_SIZE_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER;
                private int ivSize_;

                static {
/* 3 */             I0Ollli1 i0Ollli1 = new I0Ollli1();
/* 6 */             DEFAULT_INSTANCE = i0Ollli1;
/* 10 */            Io00Io0IO11.I001IO000(I0Ollli1.class, i0Ollli1);
                }

                public static I0Ollli1 I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I0OllOI1OOl I001lIiIIo1O() {
/* 7 */             return (I0OllOI1OOl) DEFAULT_INSTANCE.I000O01llI0();
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 73 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 66 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
                        case 3:
/* 52 */                    return new I0Ollli1();
                        case 4:
/* 46 */                    return new I0OllOI1OOl(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0Ollli1.class) {
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

                public final int I001l0I00() {
/* 1 */             return this.ivSize_;
                }

                public final void I001lllioOl() {
/* 3 */             this.ivSize_ = 16;
                }
            }
