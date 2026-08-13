            package p000;
            
            public final class O1iI0OiI extends Io00Ol1o10O {
                public static final int ALWAYS_ALLOW_FIELD_NUMBER = 5;
                private static final O1iI0OiI DEFAULT_INSTANCE;
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int ENABLED_FIELD_NUMBER = 4;
                public static final int INPUT_SCHEMA_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile OO01IIIl0oO PARSER;
                private boolean alwaysAllow_;
                private boolean enabled_;
                private String name_ = "";
                private String description_ = "";
                private String inputSchema_ = "";

                static {
/* 3 */             O1iI0OiI o1iI0OiI = new O1iI0OiI();
/* 6 */             DEFAULT_INSTANCE = o1iI0OiI;
/* 10 */            Io00Ol1o10O.I000oI1ioi(O1iI0OiI.class, o1iI0OiI);
                }

                public static O1i1oiOO0O I001i1O0Ol() {
/* 7 */             return (O1i1oiOO0O) DEFAULT_INSTANCE.I0000O();
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
/* 76 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0007", new Object[]{"name_", "description_", "inputSchema_", "enabled_", "alwaysAllow_"});
                        case 3:
/* 54 */                    return new O1iI0OiI();
                        case 4:
/* 48 */                    return new O1i1oiOO0O(DEFAULT_INSTANCE);
                        case 5:
/* 41 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 40 */                        return oO01IIIl0oO;
                            }
                            synchronized (O1iI0OiI.class) {
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

                public final boolean I0010I0i() {
/* 1 */             return this.alwaysAllow_;
                }

                public final String I0010o() {
/* 1 */             return this.description_;
                }

                public final boolean I00111O() {
/* 1 */             return this.enabled_;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.inputSchema_;
                }

                public final String I001IO000() {
/* 1 */             return this.name_;
                }

                public final void I001i1lo1io(boolean z) {
/* 1 */             this.alwaysAllow_ = z;
                }

                public final void I001iOo1i0O(String str) {
/* 1 */             this.description_ = str;
                }

                public final void I001l0I00(boolean z) {
/* 1 */             this.enabled_ = z;
                }

                public final void I001lIiIIo1O(String str) {
/* 1 */             this.inputSchema_ = str;
                }

                public final void I001lllioOl(String str) {
/* 1 */             str.getClass();
/* 4 */             this.name_ = str;
                }
            }
