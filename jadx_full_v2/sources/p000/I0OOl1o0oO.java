            package p000;
            
            public final class I0OOl1o0oO extends Io00Io0IO11 {
                private static final I0OOl1o0oO DEFAULT_INSTANCE;
                private static volatile OO01I1 PARSER = null;
                public static final int TAG_SIZE_FIELD_NUMBER = 1;
                private int tagSize_;

                static {
/* 3 */             I0OOl1o0oO i0OOl1o0oO = new I0OOl1o0oO();
/* 6 */             DEFAULT_INSTANCE = i0OOl1o0oO;
/* 10 */            Io00Io0IO11.I001IO000(I0OOl1o0oO.class, i0OOl1o0oO);
                }

                public static I0OOl1o0oO I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I0OOio00OIo I001lIiIIo1O() {
/* 7 */             return (I0OOio00OIo) DEFAULT_INSTANCE.I000O01llI0();
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
/* 66 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
                        case 3:
/* 52 */                    return new I0OOl1o0oO();
                        case 4:
/* 46 */                    return new I0OOio00OIo(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OOl1o0oO.class) {
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
/* 1 */             return this.tagSize_;
                }

                public final void I001lllioOl() {
/* 3 */             this.tagSize_ = 16;
                }
            }
