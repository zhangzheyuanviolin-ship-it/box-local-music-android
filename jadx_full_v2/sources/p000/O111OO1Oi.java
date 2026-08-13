            package p000;
            
            public final class O111OO1Oi extends Io00Ol1o10O {
                public static final int ACCELERATOR_FIELD_NUMBER = 4;
                public static final int APP_VERSION_FIELD_NUMBER = 8;
                public static final int DECODE_TOKENS_FIELD_NUMBER = 6;
                private static final O111OO1Oi DEFAULT_INSTANCE;
                public static final int END_MS_FIELD_NUMBER = 2;
                public static final int MODEL_NAME_FIELD_NUMBER = 3;
                public static final int NUMBER_OF_RUNS_FIELD_NUMBER = 7;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int PREFILL_TOKENS_FIELD_NUMBER = 5;
                public static final int START_MS_FIELD_NUMBER = 1;
                private int decodeTokens_;
                private long endMs_;
                private int numberOfRuns_;
                private int prefillTokens_;
                private long startMs_;
                private String modelName_ = "";
                private String accelerator_ = "";
                private String appVersion_ = "";

                static {
/* 3 */             O111OO1Oi o111OO1Oi = new O111OO1Oi();
/* 6 */             DEFAULT_INSTANCE = o111OO1Oi;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O111OO1Oi.class, o111OO1Oi);
                }

                public static O111OO1Oi I001IIilI0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O111O0IIi I001lIiIIo1O() {
/* 7 */             return (O111O0IIi) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 90 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 83 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007\u0004\bȈ", new Object[]{"startMs_", "endMs_", "modelName_", "accelerator_", "prefillTokens_", "decodeTokens_", "numberOfRuns_", "appVersion_"});
                        case 3:
/* 55 */                    return new O111OO1Oi();
                        case 4:
/* 49 */                    return new O111O0IIi(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (O111OO1Oi.class) {
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

                public final String I0010I0i() {
/* 1 */             return this.accelerator_;
                }

                public final String I0010o() {
/* 1 */             return this.appVersion_;
                }

                public final int I00111O() {
/* 1 */             return this.decodeTokens_;
                }

                public final long I001IO000() {
/* 1 */             return this.endMs_;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.modelName_;
                }

                public final int I001i1lo1io() {
/* 1 */             return this.numberOfRuns_;
                }

                public final int I001iOo1i0O() {
/* 1 */             return this.prefillTokens_;
                }

                public final long I001l0I00() {
/* 1 */             return this.startMs_;
                }

                public final void I001lllioOl(String str) {
/* 1 */             this.accelerator_ = str;
                }

                public final void I001lloI() {
/* 3 */             this.appVersion_ = "3.3.3";
                }

                public final void I00II0Ol1O0l(int i) {
/* 1 */             this.decodeTokens_ = i;
                }

                public final void I00II0oii1o(long j) {
/* 1 */             this.endMs_ = j;
                }

                public final void I00IO1(String str) {
/* 1 */             str.getClass();
/* 4 */             this.modelName_ = str;
                }

                public final void I00IO1oi11O(int i) {
/* 1 */             this.numberOfRuns_ = i;
                }

                public final void I00IOO(int i) {
/* 1 */             this.prefillTokens_ = i;
                }

                public final void I00IioO0OiOi(long j) {
/* 1 */             this.startMs_ = j;
                }
            }
