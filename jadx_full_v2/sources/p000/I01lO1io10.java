            package p000;
            
            public final class I01lO1io10 extends Io00Ol1o10O {
                public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
                private static final I01lO1io10 DEFAULT_INSTANCE;
                public static final int EXPIRES_AT_MS_FIELD_NUMBER = 3;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int REFRESH_TOKEN_FIELD_NUMBER = 2;
                private long expiresAtMs_;
                private String accessToken_ = "";
                private String refreshToken_ = "";

                static {
/* 3 */             I01lO1io10 i01lO1io10 = new I01lO1io10();
/* 6 */             DEFAULT_INSTANCE = i01lO1io10;
/* 10 */            Io00Ol1o10O.I000oI1ioi(I01lO1io10.class, i01lO1io10);
                }

                public static I01lO1io10 I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I01lIi I001IIilI0O() {
/* 7 */             return (I01lIi) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 79 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 72 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", new Object[]{"accessToken_", "refreshToken_", "expiresAtMs_"});
                        case 3:
/* 54 */                    return new I01lO1io10();
                        case 4:
/* 48 */                    return new I01lIi(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (I01lO1io10.class) {
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

                public final String I0010I0i() {
/* 1 */             return this.accessToken_;
                }

                public final long I00111O() {
/* 1 */             return this.expiresAtMs_;
                }

                public final void I001IO000(String str) {
/* 1 */             str.getClass();
/* 4 */             this.accessToken_ = str;
                }

                public final void I001i1O0Ol(long j) {
/* 1 */             this.expiresAtMs_ = j;
                }

                public final void I001i1lo1io(String str) {
/* 1 */             str.getClass();
/* 4 */             this.refreshToken_ = str;
                }
            }
