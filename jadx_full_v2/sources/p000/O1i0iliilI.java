            package p000;
            
            public final class O1i0iliilI extends Io00Ol1o10O {
                private static final O1i0iliilI DEFAULT_INSTANCE;
                public static final int HEADER_NAME_FIELD_NUMBER = 1;
                public static final int HEADER_VALUE_FIELD_NUMBER = 2;
                private static volatile OO01IIIl0oO PARSER;
                private String headerName_ = "";
                private String headerValue_ = "";

                static {
/* 3 */             O1i0iliilI o1i0iliilI = new O1i0iliilI();
/* 6 */             DEFAULT_INSTANCE = o1i0iliilI;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O1i0iliilI.class, o1i0iliilI);
                }

                public static O1i0iliilI I0010I0i() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O1i0ii0i0 I001IIilI0O() {
/* 7 */             return (O1i0ii0i0) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"headerName_", "headerValue_"});
                        case 3:
/* 54 */                    return new O1i0iliilI();
                        case 4:
/* 48 */                    return new O1i0ii0i0(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (O1i0iliilI.class) {
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

                public final String I0010o() {
/* 1 */             return this.headerName_;
                }

                public final String I00111O() {
/* 1 */             return this.headerValue_;
                }

                public final void I001IO000(String str) {
/* 1 */             str.getClass();
/* 4 */             this.headerName_ = str;
                }

                public final void I001i1O0Ol(String str) {
/* 1 */             str.getClass();
/* 4 */             this.headerValue_ = str;
                }
            }
