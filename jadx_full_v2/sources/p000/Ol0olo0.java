            package p000;

            import java.io.FileInputStream;
            
            public final class Ol0olo0 extends Io00Ol1o10O {
                private static final Ol0olo0 DEFAULT_INSTANCE;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int SKILL_FIELD_NUMBER = 1;
                private Iool1IOO1o0i skill_ = OOiI0I0I.I00ilI0I1;

                static {
/* 3 */             Ol0olo0 ol0olo0 = new Ol0olo0();
/* 6 */             DEFAULT_INSTANCE = ol0olo0;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ol0olo0.class, ol0olo0);
                }

                public static Ol0olo0 I00111O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Ol0olO I001IO000() {
/* 7 */             return (Ol0olO) DEFAULT_INSTANCE.I0000O();
                }

                public static Ol0olo0 I001i1O0Ol(FileInputStream fileInputStream) {
/* 7 */             return (Ol0olo0) Io00Ol1o10O.I000o00OoI0I(DEFAULT_INSTANCE, fileInputStream);
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
/* 70 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"skill_", Ol0ioI1iI.class});
                        case 3:
/* 54 */                    return new Ol0olo0();
                        case 4:
/* 48 */                    return new Ol0olO(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ol0olo0.class) {
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

                public final void I0010I0i(Iterable iterable) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.skill_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.skill_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            IloooliOooIO.I00000oIO(iterable, iool1IOO1o0iI000O01llI0);
                }

                public final void I0010o() {
/* 3 */             this.skill_ = OOiI0I0I.I00ilI0I1;
                }

                public final Iool1IOO1o0i I001IIilI0O() {
/* 1 */             return this.skill_;
                }
            }
