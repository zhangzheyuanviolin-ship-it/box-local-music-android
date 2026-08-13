            package p000;
            
            public final class Ioiol1OIol extends Io00Ol1o10O {
                private static final Ioiol1OIol DEFAULT_INSTANCE;
                public static final int FILE_NAME_FIELD_NUMBER = 1;
                public static final int FILE_SIZE_FIELD_NUMBER = 2;
                public static final int LLM_CONFIG_FIELD_NUMBER = 3;
                private static volatile OO01IIIl0oO PARSER;
                private Object config_;
                private long fileSize_;
                private int configCase_ = 0;
                private String fileName_ = "";

                static {
/* 3 */             Ioiol1OIol ioiol1OIol = new Ioiol1OIol();
/* 6 */             DEFAULT_INSTANCE = ioiol1OIol;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ioiol1OIol.class, ioiol1OIol);
                }

                public static IoioiiIi1 I001IIilI0O() {
/* 7 */             return (IoioiiIi1) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 83 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 76 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000", new Object[]{"config_", "configCase_", "fileName_", "fileSize_", O11iil.class});
                        case 3:
/* 54 */                    return new Ioiol1OIol();
                        case 4:
/* 48 */                    return new IoioiiIi1(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ioiol1OIol.class) {
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
/* 1 */             return this.fileName_;
                }

                public final long I0010o() {
/* 1 */             return this.fileSize_;
                }

                public final O11iil I00111O() {
                    return this.configCase_ == 3 ? (O11iil) this.config_ : O11iil.I00111O();
                }

                public final void I001IO000(String str) {
/* 1 */             str.getClass();
/* 4 */             this.fileName_ = str;
                }

                public final void I001i1O0Ol(long j) {
/* 1 */             this.fileSize_ = j;
                }

                public final void I001i1lo1io(O11iil o11iil) {
/* 1 */             this.config_ = o11iil;
/* 4 */             this.configCase_ = 3;
                }
            }
