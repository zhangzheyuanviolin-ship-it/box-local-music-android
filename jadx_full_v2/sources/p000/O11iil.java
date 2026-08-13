            package p000;
            
            public final class O11iil extends Io00Ol1o10O {
                public static final int COMPATIBLE_ACCELERATORS_FIELD_NUMBER = 1;
                private static final O11iil DEFAULT_INSTANCE;
                public static final int DEFAULT_MAX_TOKENS_FIELD_NUMBER = 2;
                public static final int DEFAULT_TEMPERATURE_FIELD_NUMBER = 5;
                public static final int DEFAULT_TOPK_FIELD_NUMBER = 3;
                public static final int DEFAULT_TOPP_FIELD_NUMBER = 4;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int SUPPORT_AUDIO_FIELD_NUMBER = 7;
                public static final int SUPPORT_IMAGE_FIELD_NUMBER = 6;
                public static final int SUPPORT_MOBILE_ACTIONS_FIELD_NUMBER = 9;
                public static final int SUPPORT_SPECULATIVE_DECODING_FIELD_NUMBER = 11;
                public static final int SUPPORT_THINKING_FIELD_NUMBER = 10;
                public static final int SUPPORT_TINY_GARDEN_FIELD_NUMBER = 8;
                private Iool1IOO1o0i compatibleAccelerators_ = OOiI0I0I.I00ilI0I1;
                private int defaultMaxTokens_;
                private float defaultTemperature_;
                private int defaultTopk_;
                private float defaultTopp_;
                private boolean supportAudio_;
                private boolean supportImage_;
                private boolean supportMobileActions_;
                private boolean supportSpeculativeDecoding_;
                private boolean supportThinking_;
                private boolean supportTinyGarden_;

                static {
/* 3 */             O11iil o11iil = new O11iil();
/* 6 */             DEFAULT_INSTANCE = o11iil;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O11iil.class, o11iil);
                }

                public static O11iil I00111O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static O11iO1i I00II0oii1o() {
/* 7 */             return (O11iO1i) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 96 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 89 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001Ț\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007", new Object[]{"compatibleAccelerators_", "defaultMaxTokens_", "defaultTopk_", "defaultTopp_", "defaultTemperature_", "supportImage_", "supportAudio_", "supportTinyGarden_", "supportMobileActions_", "supportThinking_", "supportSpeculativeDecoding_"});
                        case 3:
/* 55 */                    return new O11iil();
                        case 4:
/* 49 */                    return new O11iO1i(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (O11iil.class) {
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

                public final void I0010I0i(Iterable iterable) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.compatibleAccelerators_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.compatibleAccelerators_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            IloooliOooIO.I00000oIO(iterable, iool1IOO1o0iI000O01llI0);
                }

                public final Iool1IOO1o0i I0010o() {
/* 1 */             return this.compatibleAccelerators_;
                }

                public final int I001IIilI0O() {
/* 1 */             return this.defaultMaxTokens_;
                }

                public final float I001IO000() {
/* 1 */             return this.defaultTemperature_;
                }

                public final int I001i1O0Ol() {
/* 1 */             return this.defaultTopk_;
                }

                public final float I001i1lo1io() {
/* 1 */             return this.defaultTopp_;
                }

                public final boolean I001iOo1i0O() {
/* 1 */             return this.supportAudio_;
                }

                public final boolean I001l0I00() {
/* 1 */             return this.supportImage_;
                }

                public final boolean I001lIiIIo1O() {
/* 1 */             return this.supportMobileActions_;
                }

                public final boolean I001lllioOl() {
/* 1 */             return this.supportSpeculativeDecoding_;
                }

                public final boolean I001lloI() {
/* 1 */             return this.supportThinking_;
                }

                public final boolean I00II0Ol1O0l() {
/* 1 */             return this.supportTinyGarden_;
                }

                public final void I00IO1(int i) {
/* 1 */             this.defaultMaxTokens_ = i;
                }

                public final void I00IO1oi11O(float f) {
/* 1 */             this.defaultTemperature_ = f;
                }

                public final void I00IOO(int i) {
/* 1 */             this.defaultTopk_ = i;
                }

                public final void I00IioO0OiOi(float f) {
/* 1 */             this.defaultTopp_ = f;
                }

                public final void I00IlilI0i0i(boolean z) {
/* 1 */             this.supportAudio_ = z;
                }

                public final void I00Io1lO(boolean z) {
/* 1 */             this.supportImage_ = z;
                }

                public final void I00Io1o110i(boolean z) {
/* 1 */             this.supportMobileActions_ = z;
                }

                public final void I00IoIO0lI(boolean z) {
/* 1 */             this.supportSpeculativeDecoding_ = z;
                }

                public final void I00IoO0(boolean z) {
/* 1 */             this.supportThinking_ = z;
                }
            }
