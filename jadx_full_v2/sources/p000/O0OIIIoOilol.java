            package p000;
            
            public final class O0OIIIoOilol extends Io00Io0IO11 {
                private static final O0OIIIoOilol DEFAULT_INSTANCE;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
                private static volatile OO01I1 PARSER = null;
                public static final int TYPE_URL_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int outputPrefixType_;
                private String typeUrl_ = "";
                private IIOI1Ii1I value_ = IIOI1Ii1I.I00iiI;

                static {
/* 3 */             O0OIIIoOilol o0OIIIoOilol = new O0OIIIoOilol();
/* 6 */             DEFAULT_INSTANCE = o0OIIIoOilol;
/* 10 */            Io00Io0IO11.I001IO000(O0OIIIoOilol.class, o0OIIIoOilol);
                }

                public static O0OIIIoOilol I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O0OIIIio01 I001lloI() {
/* 7 */             return (O0OIIIio01) DEFAULT_INSTANCE.I000O01llI0();
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
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new O0OIIIoOilol();
                        case 4:
/* 46 */                    return new O0OIIIio01(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0OIIIoOilol.class) {
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

                public final OIl1lli I001l0I00() {
/* 3 */             OIl1lli oIl1lliI00000oIO = OIl1lli.I00000oIO(this.outputPrefixType_);
                    return oIl1lliI00000oIO == null ? OIl1lli.UNRECOGNIZED : oIl1lliI00000oIO;
                }

                public final String I001lIiIIo1O() {
/* 1 */             return this.typeUrl_;
                }

                public final IIOI1Ii1I I001lllioOl() {
/* 1 */             return this.value_;
                }

                public final void I00II0Ol1O0l(OIl1lli oIl1lli) {
/* 5 */             this.outputPrefixType_ = oIl1lli.I00000oOI();
                }

                public final void I00II0oii1o(String str) {
/* 1 */             str.getClass();
/* 4 */             this.typeUrl_ = str;
                }

                public final void I00IO1(IIO1i10I iIO1i10I) {
/* 1 */             this.value_ = iIO1i10I;
                }
            }
