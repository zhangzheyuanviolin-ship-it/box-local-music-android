            package p000;
            
            public final class I0OoOO extends Io00Io0IO11 {
                public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
                private static final I0OoOO DEFAULT_INSTANCE;
                public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
                public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
                private static volatile OO01I1 PARSER;
                private int ciphertextSegmentSize_;
                private int derivedKeySize_;
                private int hkdfHashType_;

                static {
/* 3 */             I0OoOO i0OoOO = new I0OoOO();
/* 6 */             DEFAULT_INSTANCE = i0OoOO;
/* 10 */            Io00Io0IO11.I001IO000(I0OoOO.class, i0OoOO);
                }

                public static I0OoOO I001l0I00() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I0OoO0I I001lloI() {
/* 7 */             return (I0OoO0I) DEFAULT_INSTANCE.I000O01llI0();
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
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
                        case 3:
/* 52 */                    return new I0OoOO();
                        case 4:
/* 46 */                    return new I0OoO0I(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OoOO.class) {
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

                public final int I001iOo1i0O() {
/* 1 */             return this.ciphertextSegmentSize_;
                }

                public final int I001lIiIIo1O() {
/* 1 */             return this.derivedKeySize_;
                }

                public final Io1IOo0o10ol I001lllioOl() {
/* 3 */             Io1IOo0o10ol io1IOo0o10olI00000oIO = Io1IOo0o10ol.I00000oIO(this.hkdfHashType_);
                    return io1IOo0o10olI00000oIO == null ? Io1IOo0o10ol.UNRECOGNIZED : io1IOo0o10olI00000oIO;
                }

                public final void I00II0Ol1O0l(int i) {
/* 1 */             this.ciphertextSegmentSize_ = i;
                }

                public final void I00II0oii1o(int i) {
/* 1 */             this.derivedKeySize_ = i;
                }

                public final void I00IO1() {
/* 7 */             this.hkdfHashType_ = Io1IOo0o10ol.SHA256.I00000oOI();
                }
            }
