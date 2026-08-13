            package p000;
            
            public final class I0Ol0ll0Il extends Io00Io0IO11 {
                private static final I0Ol0ll0Il DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                public static final int PARAMS_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER;
                private int keySize_;
                private I0OlI00 params_;

                static {
/* 3 */             I0Ol0ll0Il i0Ol0ll0Il = new I0Ol0ll0Il();
/* 6 */             DEFAULT_INSTANCE = i0Ol0ll0Il;
/* 10 */            Io00Io0IO11.I001IO000(I0Ol0ll0Il.class, i0Ol0ll0Il);
                }

                public static I0Ol0ll0Il I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I0Ol0Il I001lllioOl() {
/* 7 */             return (I0Ol0Il) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0Ol0ll0Il I001lloI(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0Ol0ll0Il) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
                        case 3:
/* 52 */                    return new I0Ol0ll0Il();
                        case 4:
/* 46 */                    return new I0Ol0Il(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0Ol0ll0Il.class) {
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
/* 1 */             return this.keySize_;
                }

                public final I0OlI00 I001lIiIIo1O() {
/* 1 */             I0OlI00 i0OlI00 = this.params_;
                    return i0OlI00 == null ? I0OlI00.I001iOo1i0O() : i0OlI00;
                }

                public final void I00II0Ol1O0l(int i) {
/* 1 */             this.keySize_ = i;
                }

                public final void I00II0oii1o(I0OlI00 i0OlI00) {
/* 1 */             this.params_ = i0OlI00;
                }
            }
