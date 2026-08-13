            package p000;
            
            public final class O0OOlOII0l0 extends Io00Io0IO11 {
                private static final O0OOlOII0l0 DEFAULT_INSTANCE;
                public static final int KEY_DATA_FIELD_NUMBER = 1;
                public static final int KEY_ID_FIELD_NUMBER = 3;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
                private static volatile OO01I1 PARSER = null;
                public static final int STATUS_FIELD_NUMBER = 2;
                private O0O1ioi11l0 keyData_;
                private int keyId_;
                private int outputPrefixType_;
                private int status_;

                static {
/* 3 */             O0OOlOII0l0 o0OOlOII0l0 = new O0OOlOII0l0();
/* 6 */             DEFAULT_INSTANCE = o0OOlOII0l0;
/* 10 */            Io00Io0IO11.I001IO000(O0OOlOII0l0.class, o0OOlOII0l0);
                }

                public static O0OOII1o I00II0Ol1O0l() {
/* 7 */             return (O0OOII1o) DEFAULT_INSTANCE.I000O01llI0();
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
/* 72 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new O0OOlOII0l0();
                        case 4:
/* 46 */                    return new O0OOII1o(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0OOlOII0l0.class) {
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

                public final O0O1ioi11l0 I001iOo1i0O() {
/* 1 */             O0O1ioi11l0 o0O1ioi11l0 = this.keyData_;
                    return o0O1ioi11l0 == null ? O0O1ioi11l0.I001iOo1i0O() : o0O1ioi11l0;
                }

                public final int I001l0I00() {
/* 1 */             return this.keyId_;
                }

                public final OIl1lli I001lIiIIo1O() {
/* 3 */             OIl1lli oIl1lliI00000oIO = OIl1lli.I00000oIO(this.outputPrefixType_);
                    return oIl1lliI00000oIO == null ? OIl1lli.UNRECOGNIZED : oIl1lliI00000oIO;
                }

                public final O0OIII11 I001lllioOl() {
/* 1 */             int i = this.status_;
/* 25 */            O0OIII11 o0oiii11 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : O0OIII11.DESTROYED : O0OIII11.DISABLED : O0OIII11.ENABLED : O0OIII11.UNKNOWN_STATUS;
                    return o0oiii11 == null ? O0OIII11.UNRECOGNIZED : o0oiii11;
                }

                public final boolean I001lloI() {
                    return this.keyData_ != null;
                }

                public final void I00II0oii1o(O0O1ioi11l0 o0O1ioi11l0) {
/* 1 */             this.keyData_ = o0O1ioi11l0;
                }

                public final void I00IO1(int i) {
/* 1 */             this.keyId_ = i;
                }

                public final void I00IO1oi11O(OIl1lli oIl1lli) {
/* 5 */             this.outputPrefixType_ = oIl1lli.I00000oOI();
                }

                public final void I00IOO() {
/* 7 */             this.status_ = O0OIII11.ENABLED.I00000oIO();
                }
            }
