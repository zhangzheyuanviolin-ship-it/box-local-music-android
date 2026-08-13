            package p000;

            import java.io.FileInputStream;
            import java.util.Collections;
            import java.util.Map;
            
            public final class Ooli101Iii1 extends Io00Ol1o10O {
                public static final int ACCESS_TOKEN_DATA_FIELD_NUMBER = 1;
                private static final Ooli101Iii1 DEFAULT_INSTANCE;
                public static final int MCP_AUTHS_FIELD_NUMBER = 4;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int SECRETS_FIELD_NUMBER = 2;
                private I01lO1io10 accessTokenData_;
                private int bitField0_;
                private O1OOo11I1O1 mcpAuths_;
                private O1OOo11I1O1 secrets_;

                static {
/* 3 */             Ooli101Iii1 ooli101Iii1 = new Ooli101Iii1();
/* 6 */             DEFAULT_INSTANCE = ooli101Iii1;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ooli101Iii1.class, ooli101Iii1);
                }

                public Ooli101Iii1() {
/* 4 */             O1OOo11I1O1 o1OOo11I1O1 = O1OOo11I1O1.I00iiI;
/* 6 */             this.secrets_ = o1OOo11I1O1;
/* 8 */             this.mcpAuths_ = o1OOo11I1O1;
                }

                public static Ooli101Iii1 I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Ooli101Iii1 I001i1lo1io(FileInputStream fileInputStream) {
/* 7 */             return (Ooli101Iii1) Io00Ol1o10O.I000o00OoI0I(DEFAULT_INSTANCE, fileInputStream);
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 86 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 79 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0002\u0000\u0000\u0001ဉ\u0000\u00022\u00042", new Object[]{"bitField0_", "accessTokenData_", "secrets_", Ooli0ol1Oi0l.I00000oIO, "mcpAuths_", Ooli0i011O.I00000oIO});
                        case 3:
/* 55 */                    return new Ooli101Iii1();
                        case 4:
/* 49 */                    return new Ooli001(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ooli101Iii1.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 40 */                            throw th;
                                }
                            }
/* 38 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final I01lO1io10 I0010I0i() {
/* 1 */             I01lO1io10 i01lO1io10 = this.accessTokenData_;
                    return i01lO1io10 == null ? I01lO1io10.I0010o() : i01lO1io10;
                }

                public final Map I00111O() {
/* 3 */             return Collections.unmodifiableMap(this.mcpAuths_);
                }

                public final Map I001IIilI0O() {
/* 3 */             return Collections.unmodifiableMap(this.secrets_);
                }

                public final O1OOo11I1O1 I001IO000() {
/* 1 */             O1OOo11I1O1 o1OOo11I1O1 = this.mcpAuths_;
/* 5 */             if (o1OOo11I1O1.I00iOIl) {
/* 20 */                return o1OOo11I1O1;
                    }
/* 7 */             O1OOo11I1O1 o1OOo11I1O1I0000Il00O = o1OOo11I1O1.I0000Il00O();
/* 11 */            this.mcpAuths_ = o1OOo11I1O1I0000Il00O;
/* 20 */            return o1OOo11I1O1I0000Il00O;
                }

                public final O1OOo11I1O1 I001i1O0Ol() {
/* 1 */             O1OOo11I1O1 o1OOo11I1O1 = this.secrets_;
/* 5 */             if (o1OOo11I1O1.I00iOIl) {
/* 20 */                return o1OOo11I1O1;
                    }
/* 7 */             O1OOo11I1O1 o1OOo11I1O1I0000Il00O = o1OOo11I1O1.I0000Il00O();
/* 11 */            this.secrets_ = o1OOo11I1O1I0000Il00O;
/* 20 */            return o1OOo11I1O1I0000Il00O;
                }

                public final void I001iOo1i0O(I01lO1io10 i01lO1io10) {
/* 1 */             this.accessTokenData_ = i01lO1io10;
                    this.bitField0_ |= 1;
                }
            }
