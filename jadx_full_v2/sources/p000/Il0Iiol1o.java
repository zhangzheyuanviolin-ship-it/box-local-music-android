            package p000;

            import java.io.ByteArrayInputStream;
            
            public final class Il0Iiol1o extends Io00Io0IO11 {
                private static final Il0Iiol1o DEFAULT_INSTANCE;
                public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
                public static final int KEYSET_INFO_FIELD_NUMBER = 3;
                private static volatile OO01I1 PARSER;
                private IIOI1Ii1I encryptedKeyset_ = IIOI1Ii1I.I00iiI;
                private O0OiO1O00I keysetInfo_;

                static {
/* 3 */             Il0Iiol1o il0Iiol1o = new Il0Iiol1o();
/* 6 */             DEFAULT_INSTANCE = il0Iiol1o;
/* 10 */            Io00Io0IO11.I001IO000(Il0Iiol1o.class, il0Iiol1o);
                }

                public static Il0IiIlOiOi I001l0I00() {
/* 7 */             return (Il0IiIlOiOi) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static Il0Iiol1o I001lIiIIo1O(ByteArrayInputStream byteArrayInputStream, Il1llO11O il1llO11O) {
/* 7 */             return (Il0Iiol1o) Io00Io0IO11.I00111O(DEFAULT_INSTANCE, byteArrayInputStream, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 75 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
                        case 3:
/* 52 */                    return new Il0Iiol1o();
                        case 4:
/* 46 */                    return new Il0IiIlOiOi(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (Il0Iiol1o.class) {
                                try {
/* 20 */                            io000II1liI = PARSER;
/* 22 */                            if (io000II1liI == null) {
/* 26 */                                io000II1liI = new Io000II1liI();
/* 29 */                                PARSER = io000II1liI;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                            }
/* 35 */                    return io000II1liI;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final IIOI1Ii1I I001iOo1i0O() {
/* 1 */             return this.encryptedKeyset_;
                }

                public final void I001lllioOl(IIO1i10I iIO1i10I) {
/* 1 */             this.encryptedKeyset_ = iIO1i10I;
                }

                public final void I001lloI(O0OiO1O00I o0OiO1O00I) {
/* 1 */             this.keysetInfo_ = o0OiO1O00I;
                }
            }
