            package p000;
            
            public final class I0OO1o1ooI extends Io00Io0IO11 {
                private static final I0OO1o1ooI DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 1;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER;
                private int keySize_;
                private I0OOl1o0oO params_;

                static {
/* 3 */             I0OO1o1ooI i0OO1o1ooI = new I0OO1o1ooI();
/* 6 */             DEFAULT_INSTANCE = i0OO1o1ooI;
/* 10 */            Io00Io0IO11.I001IO000(I0OO1o1ooI.class, i0OO1o1ooI);
                }

                public static I0OO1lio1i I001lIiIIo1O() {
/* 7 */             return (I0OO1lio1i) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0OO1o1ooI I001lllioOl(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0OO1o1ooI) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 75 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
                        case 3:
/* 52 */                    return new I0OO1o1ooI();
                        case 4:
/* 46 */                    return new I0OO1lio1i(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OO1o1ooI.class) {
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

                public final int I001iOo1i0O() {
/* 1 */             return this.keySize_;
                }

                public final I0OOl1o0oO I001l0I00() {
/* 1 */             I0OOl1o0oO i0OOl1o0oO = this.params_;
                    return i0OOl1o0oO == null ? I0OOl1o0oO.I001iOo1i0O() : i0OOl1o0oO;
                }

                public final void I001lloI() {
/* 3 */             this.keySize_ = 32;
                }

                public final void I00II0Ol1O0l(I0OOl1o0oO i0OOl1o0oO) {
/* 1 */             this.params_ = i0OOl1o0oO;
                }
            }
