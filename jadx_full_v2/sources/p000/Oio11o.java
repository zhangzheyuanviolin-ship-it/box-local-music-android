            package p000;

            import java.io.FileInputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Map;
            
            public final class Oio11o extends Io00Ol1o10O {
                public static final int ACCESS_TOKEN_DATA_FIELD_NUMBER = 2;
                private static final Oio11o DEFAULT_INSTANCE;
                public static final int FEATURE_FLAGS_FIELD_NUMBER = 9;
                public static final int HAS_RUN_TINY_GARDEN_FIELD_NUMBER = 6;
                public static final int HAS_SEEN_BENCHMARK_COMPARISON_HELP_FIELD_NUMBER = 7;
                public static final int IMPORTED_MODEL_FIELD_NUMBER = 4;
                public static final int IS_GEMMA_TERMS_ACCEPTED_FIELD_NUMBER = 8;
                public static final int IS_TOS_ACCEPTED_FIELD_NUMBER = 5;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int TEXT_INPUT_HISTORY_FIELD_NUMBER = 3;
                public static final int THEME_FIELD_NUMBER = 1;
                public static final int VIEWED_PROMO_ID_FIELD_NUMBER = 10;
                private I01lO1io10 accessTokenData_;
                private int bitField0_;
                private O1OOo11I1O1 featureFlags_ = O1OOo11I1O1.I00iiI;
                private boolean hasRunTinyGarden_;
                private boolean hasSeenBenchmarkComparisonHelp_;
                private Iool1IOO1o0i importedModel_;
                private boolean isGemmaTermsAccepted_;
                private boolean isTosAccepted_;
                private Iool1IOO1o0i textInputHistory_;
                private int theme_;
                private Iool1IOO1o0i viewedPromoId_;

                static {
/* 3 */             Oio11o oio11o = new Oio11o();
/* 6 */             DEFAULT_INSTANCE = oio11o;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Oio11o.class, oio11o);
                }

                public Oio11o() {
/* 8 */             OOiI0I0I oOiI0I0I = OOiI0I0I.I00ilI0I1;
/* 10 */            this.textInputHistory_ = oOiI0I0I;
/* 12 */            this.importedModel_ = oOiI0I0I;
/* 14 */            this.viewedPromoId_ = oOiI0I0I;
                }

                public static Oio11o I001IO000() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Oio11o I00II0oii1o(FileInputStream fileInputStream) {
/* 7 */             return (Oio11o) Io00Ol1o10O.I000o00OoI0I(DEFAULT_INSTANCE, fileInputStream);
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 100 */                   return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 93 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0001\u0003\u0000\u0001\f\u0002ဉ\u0000\u0003Ț\u0004\u001b\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t2\nȚ", new Object[]{"bitField0_", "theme_", "accessTokenData_", "textInputHistory_", "importedModel_", Ioiol1OIol.class, "isTosAccepted_", "hasRunTinyGarden_", "hasSeenBenchmarkComparisonHelp_", "isGemmaTermsAccepted_", "featureFlags_", Oio100l1i1.I00000oIO, "viewedPromoId_"});
                        case 3:
/* 55 */                    return new Oio11o();
                        case 4:
/* 49 */                    return new Oio0ooOi0(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Oio11o.class) {
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

                public final void I0010I0i(ArrayList arrayList) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.importedModel_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.importedModel_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            IloooliOooIO.I00000oIO(arrayList, iool1IOO1o0iI000O01llI0);
                }

                public final void I0010o(Iterable iterable) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.textInputHistory_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.textInputHistory_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            IloooliOooIO.I00000oIO(iterable, iool1IOO1o0iI000O01llI0);
                }

                public final void I00111O() {
/* 3 */             this.importedModel_ = OOiI0I0I.I00ilI0I1;
                }

                public final void I001IIilI0O() {
/* 3 */             this.textInputHistory_ = OOiI0I0I.I00ilI0I1;
                }

                public final Map I001i1O0Ol() {
/* 3 */             return Collections.unmodifiableMap(this.featureFlags_);
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.hasSeenBenchmarkComparisonHelp_;
                }

                public final Iool1IOO1o0i I001iOo1i0O() {
/* 1 */             return this.importedModel_;
                }

                public final boolean I001l0I00() {
/* 1 */             return this.isGemmaTermsAccepted_;
                }

                public final Iool1IOO1o0i I001lIiIIo1O() {
/* 1 */             return this.textInputHistory_;
                }

                public final Oo0oOoIo0ol I001lllioOl() {
/* 1 */             int i = this.theme_;
/* 25 */            Oo0oOoIo0ol oo0oOoIo0ol = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : Oo0oOoIo0ol.THEME_AUTO : Oo0oOoIo0ol.THEME_DARK : Oo0oOoIo0ol.THEME_LIGHT : Oo0oOoIo0ol.THEME_UNSPECIFIED;
                    return oo0oOoIo0ol == null ? Oo0oOoIo0ol.UNRECOGNIZED : oo0oOoIo0ol;
                }

                public final Iool1IOO1o0i I001lloI() {
/* 1 */             return this.viewedPromoId_;
                }

                public final O1OOo11I1O1 I00II0Ol1O0l() {
/* 1 */             O1OOo11I1O1 o1OOo11I1O1 = this.featureFlags_;
/* 5 */             if (o1OOo11I1O1.I00iOIl) {
/* 20 */                return o1OOo11I1O1;
                    }
/* 7 */             O1OOo11I1O1 o1OOo11I1O1I0000Il00O = o1OOo11I1O1.I0000Il00O();
/* 11 */            this.featureFlags_ = o1OOo11I1O1I0000Il00O;
/* 20 */            return o1OOo11I1O1I0000Il00O;
                }

                public final void I00IO1(I01lO1io10 i01lO1io10) {
/* 1 */             i01lO1io10.getClass();
/* 4 */             this.accessTokenData_ = i01lO1io10;
                    this.bitField0_ |= 1;
                }

                public final void I00IO1oi11O() {
/* 2 */             this.hasSeenBenchmarkComparisonHelp_ = true;
                }

                public final void I00IOO() {
/* 2 */             this.isGemmaTermsAccepted_ = true;
                }

                public final void I00IioO0OiOi() {
/* 2 */             this.isTosAccepted_ = true;
                }

                public final void I00IlilI0i0i(Oo0oOoIo0ol oo0oOoIo0ol) {
/* 5 */             this.theme_ = oo0oOoIo0ol.I00000oIO();
                }
            }
