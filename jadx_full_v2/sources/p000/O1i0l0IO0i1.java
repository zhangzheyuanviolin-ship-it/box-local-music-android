            package p000;
            
            public final class O1i0l0IO0i1 extends Io00Ol1o10O {
                private static final O1i0l0IO0i1 DEFAULT_INSTANCE;
                public static final int NONE_FIELD_NUMBER = 1;
                public static final int OAUTH_FIELD_NUMBER = 3;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int REQUEST_HEADER_FIELD_NUMBER = 2;
                private int authMethodCase_ = 0;
                private Object authMethod_;

                static {
/* 3 */             O1i0l0IO0i1 o1i0l0IO0i1 = new O1i0l0IO0i1();
/* 6 */             DEFAULT_INSTANCE = o1i0l0IO0i1;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O1i0l0IO0i1.class, o1i0l0IO0i1);
                }

                public static O1i0l0IO0i1 I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O1i0i00O1 I001IIilI0O() {
/* 7 */             return (O1i0i00O1) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 81 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 74 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"authMethod_", "authMethodCase_", O1i0iliilI.class, O1i0ii0.class});
                        case 3:
/* 54 */                    return new O1i0l0IO0i1();
                        case 4:
/* 48 */                    return new O1i0i00O1(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (O1i0l0IO0i1.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 39 */                            throw th;
                                }
                            }
/* 37 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final O1i0O00 I0010I0i() {
/* 1 */             int i = this.authMethodCase_;
/* 3 */             if (i == 0) {
/* 25 */                return O1i0O00.I00iio;
                    }
/* 6 */             if (i == 1) {
/* 22 */                return O1i0O00.I00iOIl;
                    }
/* 9 */             if (i == 2) {
/* 19 */                return O1i0O00.I00iiI;
                    }
/* 12 */            if (i != 3) {
/* 14 */                return null;
                    }
/* 16 */            return O1i0O00.I00iiO;
                }

                public final O1i0iliilI I00111O() {
                    return this.authMethodCase_ == 2 ? (O1i0iliilI) this.authMethod_ : O1i0iliilI.I0010I0i();
                }

                public final void I001IO000() {
/* 2 */             this.authMethodCase_ = 1;
/* 6 */             this.authMethod_ = Boolean.TRUE;
                }

                public final void I001i1O0Ol(O1i0ii0 o1i0ii0) {
/* 1 */             o1i0ii0.getClass();
/* 4 */             this.authMethod_ = o1i0ii0;
/* 7 */             this.authMethodCase_ = 3;
                }

                public final void I001i1lo1io(O1i0iliilI o1i0iliilI) {
/* 1 */             this.authMethod_ = o1i0iliilI;
/* 4 */             this.authMethodCase_ = 2;
                }
            }
