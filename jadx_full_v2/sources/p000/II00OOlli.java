            package p000;
            
            public final class II00OOlli extends Io00Ol1o10O {
                private static final II00OOlli DEFAULT_INSTANCE;
                public static final int LLM_RESULT_FIELD_NUMBER = 2;
                private static volatile OO01IIIl0oO PARSER;
                private int resultCase_ = 0;
                private Object result_;

                static {
/* 3 */             II00OOlli iI00OOlli = new II00OOlli();
/* 6 */             DEFAULT_INSTANCE = iI00OOlli;
/* 10 */            Io00Ol1o10O.I000oI1ioi(II00OOlli.class, iI00OOlli);
                }

                public static II00OIO I0010o() {
/* 7 */             return (II00OIO) DEFAULT_INSTANCE.I0000O();
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
/* 72 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", O111Oli.class});
                        case 3:
/* 54 */                    return new II00OOlli();
                        case 4:
/* 48 */                    return new II00OIO(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (II00OOlli.class) {
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

                public final O111Oli I0010I0i() {
                    return this.resultCase_ == 2 ? (O111Oli) this.result_ : O111Oli.I0010o();
                }

                public final void I00111O(O111Oli o111Oli) {
/* 1 */             this.result_ = o111Oli;
/* 4 */             this.resultCase_ = 2;
                }
            }
