            package p000;
            
            public final class Io1lOi extends Io00Io0IO11 {
                private static final Io1lOi DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                public static final int PARAMS_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 3;
                private int keySize_;
                private Io1lilII0O1 params_;
                private int version_;

                static {
/* 3 */             Io1lOi io1lOi = new Io1lOi();
/* 6 */             DEFAULT_INSTANCE = io1lOi;
/* 10 */            Io00Io0IO11.I001IO000(Io1lOi.class, io1lOi);
                }

                public static Io1lOi I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Io1lIll1 I001lllioOl() {
/* 7 */             return (Io1lIll1) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static Io1lOi I001lloI(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (Io1lOi) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
                        case 3:
/* 52 */                    return new Io1lOi();
                        case 4:
/* 46 */                    return new Io1lIll1(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (Io1lOi.class) {
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

                public final Io1lilII0O1 I001lIiIIo1O() {
/* 1 */             Io1lilII0O1 io1lilII0O1 = this.params_;
                    return io1lilII0O1 == null ? Io1lilII0O1.I001iOo1i0O() : io1lilII0O1;
                }

                public final void I00II0Ol1O0l(int i) {
/* 1 */             this.keySize_ = i;
                }

                public final void I00II0oii1o(Io1lilII0O1 io1lilII0O1) {
/* 1 */             this.params_ = io1lilII0O1;
                }
            }
