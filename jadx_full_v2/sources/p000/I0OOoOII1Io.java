            package p000;
            
            public final class I0OOoOII1Io extends Io00Io0IO11 {
                public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
                private static final I0OOoOII1Io DEFAULT_INSTANCE;
                public static final int HMAC_KEY_FIELD_NUMBER = 3;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private I0Oioo0l0oO aesCtrKey_;
                private Io1lI0 hmacKey_;
                private int version_;

                static {
/* 3 */             I0OOoOII1Io i0OOoOII1Io = new I0OOoOII1Io();
/* 6 */             DEFAULT_INSTANCE = i0OOoOII1Io;
/* 10 */            Io00Io0IO11.I001IO000(I0OOoOII1Io.class, i0OOoOII1Io);
                }

                public static I0OOoIi I001lllioOl() {
/* 7 */             return (I0OOoIi) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0OOoOII1Io I001lloI(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0OOoOII1Io) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
                        case 3:
/* 52 */                    return new I0OOoOII1Io();
                        case 4:
/* 46 */                    return new I0OOoIi(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OOoOII1Io.class) {
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

                public final I0Oioo0l0oO I001iOo1i0O() {
/* 1 */             I0Oioo0l0oO i0Oioo0l0oO = this.aesCtrKey_;
                    return i0Oioo0l0oO == null ? I0Oioo0l0oO.I001iOo1i0O() : i0Oioo0l0oO;
                }

                public final Io1lI0 I001l0I00() {
/* 1 */             Io1lI0 io1lI0 = this.hmacKey_;
                    return io1lI0 == null ? Io1lI0.I001iOo1i0O() : io1lI0;
                }

                public final int I001lIiIIo1O() {
/* 1 */             return this.version_;
                }

                public final void I00II0Ol1O0l(I0Oioo0l0oO i0Oioo0l0oO) {
/* 1 */             i0Oioo0l0oO.getClass();
/* 4 */             this.aesCtrKey_ = i0Oioo0l0oO;
                }

                public final void I00II0oii1o(Io1lI0 io1lI0) {
/* 1 */             io1lI0.getClass();
/* 4 */             this.hmacKey_ = io1lI0;
                }

                public final void I00IO1() {
/* 2 */             this.version_ = 0;
                }
            }
