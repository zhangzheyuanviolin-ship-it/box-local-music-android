            package p000;
            
            public final class O111oIiol1 extends Io00Ol1o10O {
                public static final int DECODE_SPEED_FIELD_NUMBER = 2;
                private static final O111oIiol1 DEFAULT_INSTANCE;
                public static final int FIRST_INIT_TIME_MS_FIELD_NUMBER = 4;
                public static final int NON_FIRST_INIT_TIME_MS_FIELD_NUMBER = 5;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int PREFILL_SPEED_FIELD_NUMBER = 1;
                public static final int TIME_TO_FIRST_TOKEN_FIELD_NUMBER = 3;
                private int bitField0_;
                private Ooo010llO decodeSpeed_;
                private double firstInitTimeMs_;
                private Ooo010llO nonFirstInitTimeMs_;
                private Ooo010llO prefillSpeed_;
                private Ooo010llO timeToFirstToken_;

                static {
/* 3 */             O111oIiol1 o111oIiol1 = new O111oIiol1();
/* 6 */             DEFAULT_INSTANCE = o111oIiol1;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O111oIiol1.class, o111oIiol1);
                }

                public static O111oIiol1 I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O111iiO11l I001i1lo1io() {
/* 7 */             return (O111iiO11l) DEFAULT_INSTANCE.I0000O();
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
/* 79 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0000\u0005ဉ\u0003", new Object[]{"bitField0_", "prefillSpeed_", "decodeSpeed_", "timeToFirstToken_", "firstInitTimeMs_", "nonFirstInitTimeMs_"});
                        case 3:
/* 55 */                    return new O111oIiol1();
                        case 4:
/* 49 */                    return new O111iiO11l(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (O111oIiol1.class) {
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

                public final Ooo010llO I0010I0i() {
/* 1 */             Ooo010llO ooo010llO = this.decodeSpeed_;
                    return ooo010llO == null ? Ooo010llO.I00111O() : ooo010llO;
                }

                public final double I00111O() {
/* 1 */             return this.firstInitTimeMs_;
                }

                public final Ooo010llO I001IIilI0O() {
/* 1 */             Ooo010llO ooo010llO = this.nonFirstInitTimeMs_;
                    return ooo010llO == null ? Ooo010llO.I00111O() : ooo010llO;
                }

                public final Ooo010llO I001IO000() {
/* 1 */             Ooo010llO ooo010llO = this.prefillSpeed_;
                    return ooo010llO == null ? Ooo010llO.I00111O() : ooo010llO;
                }

                public final Ooo010llO I001i1O0Ol() {
/* 1 */             Ooo010llO ooo010llO = this.timeToFirstToken_;
                    return ooo010llO == null ? Ooo010llO.I00111O() : ooo010llO;
                }

                public final void I001iOo1i0O(Ooo010llO ooo010llO) {
/* 1 */             this.decodeSpeed_ = ooo010llO;
                    this.bitField0_ |= 2;
                }

                public final void I001l0I00(double d) {
/* 1 */             this.firstInitTimeMs_ = d;
                }

                public final void I001lIiIIo1O(Ooo010llO ooo010llO) {
/* 1 */             this.nonFirstInitTimeMs_ = ooo010llO;
                    this.bitField0_ |= 8;
                }

                public final void I001lllioOl(Ooo010llO ooo010llO) {
/* 1 */             this.prefillSpeed_ = ooo010llO;
                    this.bitField0_ |= 1;
                }

                public final void I001lloI(Ooo010llO ooo010llO) {
/* 1 */             this.timeToFirstToken_ = ooo010llO;
                    this.bitField0_ |= 4;
                }
            }
