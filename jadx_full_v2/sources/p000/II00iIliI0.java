            package p000;

            import java.io.FileInputStream;
            
            public final class II00iIliI0 extends Io00Ol1o10O {
                private static final II00iIliI0 DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int RESULT_FIELD_NUMBER = 1;
                private Iool1IOO1o0i result_ = OOiI0I0I.I00ilI0I1;

                static {
/* 3 */             II00iIliI0 iI00iIliI0 = new II00iIliI0();
/* 6 */             DEFAULT_INSTANCE = iI00iIliI0;
/* 10 */            Io00Ol1o10O.I000oI1ioi(II00iIliI0.class, iI00iIliI0);
                }

                public static II00iIliI0 I0010o() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static II00iIliI0 I001IIilI0O(FileInputStream fileInputStream) {
/* 7 */             return (II00iIliI0) Io00Ol1o10O.I000o00OoI0I(DEFAULT_INSTANCE, fileInputStream);
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
/* 70 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"result_", II00OOlli.class});
                        case 3:
/* 54 */                    return new II00iIliI0();
                        case 4:
/* 48 */                    return new II00i0I1io(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (II00iIliI0.class) {
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

                public final void I0010I0i(II00OOlli iI00OOlli) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.result_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.result_ = iool1IOO1o0iI000O01llI0;
                    }
/* 23 */            iool1IOO1o0iI000O01llI0.add(0, iI00OOlli);
                }

                public final Iool1IOO1o0i I00111O() {
/* 1 */             return this.result_;
                }

                public final void I001IO000(int i) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.result_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.result_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            iool1IOO1o0iI000O01llI0.remove(i);
                }
            }
