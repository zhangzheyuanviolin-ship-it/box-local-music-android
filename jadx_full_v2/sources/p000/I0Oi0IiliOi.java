            package p000;
            
            public final class I0Oi0IiliOi extends Io00Io0IO11 {
                public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
                private static final I0Oi0IiliOi DEFAULT_INSTANCE;
                public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER;
                private I0Ol0ll0Il aesCtrKeyFormat_;
                private Io1lOi hmacKeyFormat_;

                static {
/* 3 */             I0Oi0IiliOi i0Oi0IiliOi = new I0Oi0IiliOi();
/* 6 */             DEFAULT_INSTANCE = i0Oi0IiliOi;
/* 10 */            Io00Io0IO11.I001IO000(I0Oi0IiliOi.class, i0Oi0IiliOi);
                }

                public static I0Oi0II1il I001lIiIIo1O() {
/* 7 */             return (I0Oi0II1il) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0Oi0IiliOi I001lllioOl(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0Oi0IiliOi) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
                        case 3:
/* 52 */                    return new I0Oi0IiliOi();
                        case 4:
/* 46 */                    return new I0Oi0II1il(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0Oi0IiliOi.class) {
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

                public final I0Ol0ll0Il I001iOo1i0O() {
/* 1 */             I0Ol0ll0Il i0Ol0ll0Il = this.aesCtrKeyFormat_;
                    return i0Ol0ll0Il == null ? I0Ol0ll0Il.I001iOo1i0O() : i0Ol0ll0Il;
                }

                public final Io1lOi I001l0I00() {
/* 1 */             Io1lOi io1lOi = this.hmacKeyFormat_;
                    return io1lOi == null ? Io1lOi.I001iOo1i0O() : io1lOi;
                }

                public final void I001lloI(I0Ol0ll0Il i0Ol0ll0Il) {
/* 1 */             this.aesCtrKeyFormat_ = i0Ol0ll0Il;
                }

                public final void I00II0Ol1O0l(Io1lOi io1lOi) {
/* 1 */             this.hmacKeyFormat_ = io1lOi;
                }
            }
