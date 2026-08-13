            package p000;
            
            public final class O0OiIllIil extends Io00Io0IO11 {
                private static final O0OiIllIil DEFAULT_INSTANCE;
                public static final int KEY_ID_FIELD_NUMBER = 3;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
                private static volatile OO01I1 PARSER = null;
                public static final int STATUS_FIELD_NUMBER = 2;
                public static final int TYPE_URL_FIELD_NUMBER = 1;
                private int keyId_;
                private int outputPrefixType_;
                private int status_;
                private String typeUrl_ = "";

                static {
/* 3 */             O0OiIllIil o0OiIllIil = new O0OiIllIil();
/* 6 */             DEFAULT_INSTANCE = o0OiIllIil;
/* 10 */            Io00Io0IO11.I001IO000(O0OiIllIil.class, o0OiIllIil);
                }

                public static O0OOoOo1i1Oi I001l0I00() {
/* 7 */             return (O0OOoOo1i1Oi) DEFAULT_INSTANCE.I000O01llI0();
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 79 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 72 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new O0OiIllIil();
                        case 4:
/* 46 */                    return new O0OOoOo1i1Oi(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0OiIllIil.class) {
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
/* 1 */             return this.keyId_;
                }

                public final void I001lIiIIo1O(int i) {
/* 1 */             this.keyId_ = i;
                }

                public final void I001lllioOl(OIl1lli oIl1lli) {
/* 5 */             this.outputPrefixType_ = oIl1lli.I00000oOI();
                }

                public final void I001lloI(O0OIII11 o0oiii11) {
/* 5 */             this.status_ = o0oiii11.I00000oIO();
                }

                public final void I00II0Ol1O0l(String str) {
/* 1 */             str.getClass();
/* 4 */             this.typeUrl_ = str;
                }
            }
