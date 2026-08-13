            package p000;
            
            public final class I0OiiOoi extends Io00Io0IO11 {
                public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
                private static final I0OiiOoi DEFAULT_INSTANCE;
                public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
                public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
                public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
                private static volatile OO01I1 PARSER;
                private int ciphertextSegmentSize_;
                private int derivedKeySize_;
                private int hkdfHashType_;
                private Io1lilII0O1 hmacParams_;

                static {
/* 3 */             I0OiiOoi i0OiiOoi = new I0OiiOoi();
/* 6 */             DEFAULT_INSTANCE = i0OiiOoi;
/* 10 */            Io00Io0IO11.I001IO000(I0OiiOoi.class, i0OiiOoi);
                }

                public static I0OiiOoi I001l0I00() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static I0OiiI0ilI I00II0Ol1O0l() {
/* 7 */             return (I0OiiI0ilI) DEFAULT_INSTANCE.I000O01llI0();
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 79 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 72 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
                        case 3:
/* 52 */                    return new I0OiiOoi();
                        case 4:
/* 46 */                    return new I0OiiI0ilI(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OiiOoi.class) {
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

                public final Io1lilII0O1 I001lloI() {
/* 1 */             Io1lilII0O1 io1lilII0O1 = this.hmacParams_;
                    return io1lilII0O1 == null ? Io1lilII0O1.I001iOo1i0O() : io1lilII0O1;
                }

                public final void I00II0oii1o(int i) {
/* 1 */             this.ciphertextSegmentSize_ = i;
                }

                public final void I00IO1(int i) {
/* 1 */             this.derivedKeySize_ = i;
                }

                public final void I00IO1oi11O() {
/* 7 */             this.hkdfHashType_ = Io1IOo0o10ol.SHA256.I00000oOI();
                }

                public final void I00IOO(Io1lilII0O1 io1lilII0O1) {
/* 1 */             this.hmacParams_ = io1lilII0O1;
                }
            }
