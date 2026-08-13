            package p000;
            
            public final class O0OIoi1i1O extends Io00Io0IO11 {
                public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
                private static final O0OIoi1i1O DEFAULT_INSTANCE;
                public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
                public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
                private static volatile OO01I1 PARSER = null;
                public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
                public static final int TYPE_URL_FIELD_NUMBER = 2;
                private int keyManagerVersion_;
                private boolean newKeyAllowed_;
                private String primitiveName_ = "";
                private String typeUrl_ = "";
                private String catalogueName_ = "";

                static {
/* 3 */             O0OIoi1i1O o0OIoi1i1O = new O0OIoi1i1O();
/* 6 */             DEFAULT_INSTANCE = o0OIoi1i1O;
/* 10 */            Io00Io0IO11.I001IO000(O0OIoi1i1O.class, o0OIoi1i1O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 81 */                    return (byte) 1;
                        case 1:
/* 6 */                     return null;
                        case 2:
/* 75 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
                        case 3:
/* 53 */                    return new O0OIoi1i1O();
                        case 4:
/* 47 */                    return new IO0o1I00(DEFAULT_INSTANCE, 1);
                        case 5:
/* 40 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 14 */                    OO01I1 oo01i1 = PARSER;
/* 16 */                    if (oo01i1 != null) {
/* 39 */                        return oo01i1;
                            }
                            synchronized (O0OIoi1i1O.class) {
                                try {
/* 21 */                            io000II1liI = PARSER;
/* 23 */                            if (io000II1liI == null) {
/* 27 */                                io000II1liI = new Io000II1liI();
/* 30 */                                PARSER = io000II1liI;
                                    }
                                } catch (Throwable th) {
/* 38 */                            throw th;
                                }
                            }
/* 36 */                    return io000II1liI;
                        default:
/* 10 */                    OIiilo1Ool0o.I000lI();
/* 6 */                     return null;
                    }
                }
            }
