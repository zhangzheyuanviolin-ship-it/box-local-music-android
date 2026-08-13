            package p000;
            
            public final class Ol0ioI1iI extends Io00Ol1o10O {
                public static final int BUILT_IN_FIELD_NUMBER = 4;
                private static final Ol0ioI1iI DEFAULT_INSTANCE;
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int HOMEPAGE_FIELD_NUMBER = 9;
                public static final int IMPORT_DIR_NAME_FIELD_NUMBER = 6;
                public static final int INSTRUCTIONS_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int REQUIRE_SECRET_DESCRIPTION_FIELD_NUMBER = 10;
                public static final int REQUIRE_SECRET_FIELD_NUMBER = 8;
                public static final int SELECTED_FIELD_NUMBER = 7;
                public static final int SKILL_URL_FIELD_NUMBER = 5;
                private boolean builtIn_;
                private boolean requireSecret_;
                private boolean selected_;
                private String name_ = "";
                private String description_ = "";
                private String instructions_ = "";
                private String skillUrl_ = "";
                private String importDirName_ = "";
                private String requireSecretDescription_ = "";
                private String homepage_ = "";

                static {
/* 3 */             Ol0ioI1iI ol0ioI1iI = new Ol0ioI1iI();
/* 6 */             DEFAULT_INSTANCE = ol0ioI1iI;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ol0ioI1iI.class, ol0ioI1iI);
                }

                public static Ol0ilO I001lllioOl() {
/* 7 */             return (Ol0ilO) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 94 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 87 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007\tȈ\nȈ", new Object[]{"name_", "description_", "instructions_", "builtIn_", "skillUrl_", "importDirName_", "selected_", "requireSecret_", "homepage_", "requireSecretDescription_"});
                        case 3:
/* 55 */                    return new Ol0ioI1iI();
                        case 4:
/* 49 */                    return new Ol0ilO(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ol0ioI1iI.class) {
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

                public final boolean I0010I0i() {
/* 1 */             return this.builtIn_;
                }

                public final String I0010o() {
/* 1 */             return this.description_;
                }

                public final String I00111O() {
/* 1 */             return this.homepage_;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.importDirName_;
                }

                public final String I001IO000() {
/* 1 */             return this.instructions_;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.name_;
                }

                public final boolean I001i1lo1io() {
/* 1 */             return this.requireSecret_;
                }

                public final String I001iOo1i0O() {
/* 1 */             return this.requireSecretDescription_;
                }

                public final boolean I001l0I00() {
/* 1 */             return this.selected_;
                }

                public final String I001lIiIIo1O() {
/* 1 */             return this.skillUrl_;
                }

                public final void I001lloI(boolean z) {
/* 1 */             this.builtIn_ = z;
                }

                public final void I00II0Ol1O0l(String str) {
/* 1 */             this.description_ = str;
                }

                public final void I00II0oii1o(String str) {
/* 1 */             this.homepage_ = str;
                }

                public final void I00IO1(String str) {
/* 1 */             str.getClass();
/* 4 */             this.importDirName_ = str;
                }

                public final void I00IO1oi11O(String str) {
/* 1 */             str.getClass();
/* 4 */             this.instructions_ = str;
                }

                public final void I00IOO(String str) {
/* 1 */             this.name_ = str;
                }

                public final void I00IioO0OiOi(boolean z) {
/* 1 */             this.requireSecret_ = z;
                }

                public final void I00IlilI0i0i(String str) {
/* 1 */             str.getClass();
/* 4 */             this.requireSecretDescription_ = str;
                }

                public final void I00Io1lO(boolean z) {
/* 1 */             this.selected_ = z;
                }

                public final void I00Io1o110i(String str) {
/* 1 */             this.skillUrl_ = str;
                }
            }
