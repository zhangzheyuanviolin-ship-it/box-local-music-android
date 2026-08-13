            package p000;
            
            public final class O111Oli extends Io00Ol1o10O {
                public static final int BAISC_INFO_FIELD_NUMBER = 2;
                private static final O111Oli DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int STATS_FIELD_NUMBER = 3;
                private O111OO1Oi baiscInfo_;
                private int bitField0_;
                private O111oIiol1 stats_;

                static {
/* 3 */             O111Oli o111Oli = new O111Oli();
/* 6 */             DEFAULT_INSTANCE = o111Oli;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O111Oli.class, o111Oli);
                }

                public static O111Oli I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O111OOIIIi I001IIilI0O() {
/* 7 */             return (O111OOIIIi) DEFAULT_INSTANCE.I0000O();
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
/* 72 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "baiscInfo_", "stats_"});
                        case 3:
/* 54 */                    return new O111Oli();
                        case 4:
/* 48 */                    return new O111OOIIIi(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (O111Oli.class) {
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

                public final O111OO1Oi I0010I0i() {
/* 1 */             O111OO1Oi o111OO1Oi = this.baiscInfo_;
                    return o111OO1Oi == null ? O111OO1Oi.I001IIilI0O() : o111OO1Oi;
                }

                public final O111oIiol1 I00111O() {
/* 1 */             O111oIiol1 o111oIiol1 = this.stats_;
                    return o111oIiol1 == null ? O111oIiol1.I0010o() : o111oIiol1;
                }

                public final void I001IO000(O111OO1Oi o111OO1Oi) {
/* 1 */             this.baiscInfo_ = o111OO1Oi;
                    this.bitField0_ |= 1;
                }

                public final void I001i1O0Ol(O111oIiol1 o111oIiol1) {
/* 1 */             this.stats_ = o111oIiol1;
                    this.bitField0_ |= 2;
                }
            }
