            package p000;
            
            public final class O1i1OolO extends Io00Ol1o10O {
                private static final O1i1OolO DEFAULT_INSTANCE;
                public static final int DESCRIPTION_FIELD_NUMBER = 6;
                public static final int ENABLED_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 4;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int TOOLS_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                public static final int VERSION_FIELD_NUMBER = 5;
                private boolean enabled_;
                private String url_ = "";
                private Iool1IOO1o0i tools_ = OOiI0I0I.I00ilI0I1;
                private String name_ = "";
                private String version_ = "";
                private String description_ = "";

                static {
/* 3 */             O1i1OolO o1i1OolO = new O1i1OolO();
/* 6 */             DEFAULT_INSTANCE = o1i1OolO;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O1i1OolO.class, o1i1OolO);
                }

                public static O1i1OO0O10Io I001iOo1i0O() {
/* 7 */             return (O1i1OO0O10Io) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 88 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 81 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"url_", "tools_", O1iI0OiI.class, "enabled_", "name_", "version_", "description_"});
                        case 3:
/* 55 */                    return new O1i1OolO();
                        case 4:
/* 49 */                    return new O1i1OO0O10Io(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (O1i1OolO.class) {
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
/* 1 */             Iool1IOO1o0i iool1IOO1o0iI000O01llI0 = this.tools_;
/* 8 */             if (!((I01O10iIoo1O) iool1IOO1o0iI000O01llI0).I00iOIl) {
/* 16 */                iool1IOO1o0iI000O01llI0 = iool1IOO1o0iI000O01llI0.I000O01llI0(iool1IOO1o0iI000O01llI0.size() * 2);
/* 20 */                this.tools_ = iool1IOO1o0iI000O01llI0;
                    }
/* 22 */            IloooliOooIO.I00000oIO(iterable, iool1IOO1o0iI000O01llI0);
                }

                public final void I0010o() {
/* 3 */             this.tools_ = OOiI0I0I.I00ilI0I1;
                }

                public final boolean I00111O() {
/* 1 */             return this.enabled_;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.name_;
                }

                public final Iool1IOO1o0i I001IO000() {
/* 1 */             return this.tools_;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.url_;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.version_;
                }

                public final void I001l0I00(String str) {
/* 1 */             this.description_ = str;
                }

                public final void I001lIiIIo1O(boolean z) {
/* 1 */             this.enabled_ = z;
                }

                public final void I001lllioOl(String str) {
/* 1 */             str.getClass();
/* 4 */             this.name_ = str;
                }

                public final void I001lloI(String str) {
/* 1 */             str.getClass();
/* 4 */             this.url_ = str;
                }

                public final void I00II0Ol1O0l(String str) {
/* 1 */             str.getClass();
/* 4 */             this.version_ = str;
                }
            }
