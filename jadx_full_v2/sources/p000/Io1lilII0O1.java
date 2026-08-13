            package p000;
            
            public final class Io1lilII0O1 extends Io00Io0IO11 {
                private static final Io1lilII0O1 DEFAULT_INSTANCE;
                public static final int HASH_FIELD_NUMBER = 1;
                private static volatile OO01I1 PARSER = null;
                public static final int TAG_SIZE_FIELD_NUMBER = 2;
                private int hash_;
                private int tagSize_;

                static {
/* 3 */             Io1lilII0O1 io1lilII0O1 = new Io1lilII0O1();
/* 6 */             DEFAULT_INSTANCE = io1lilII0O1;
/* 10 */            Io00Io0IO11.I001IO000(Io1lilII0O1.class, io1lilII0O1);
                }

                public static Io1lilII0O1 I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Io1li1i011O I001lllioOl() {
/* 7 */             return (Io1li1i011O) DEFAULT_INSTANCE.I000O01llI0();
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
                        case 3:
/* 52 */                    return new Io1lilII0O1();
                        case 4:
/* 46 */                    return new Io1li1i011O(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (Io1lilII0O1.class) {
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

                public final Io1IOo0o10ol I001l0I00() {
/* 3 */             Io1IOo0o10ol io1IOo0o10olI00000oIO = Io1IOo0o10ol.I00000oIO(this.hash_);
                    return io1IOo0o10olI00000oIO == null ? Io1IOo0o10ol.UNRECOGNIZED : io1IOo0o10olI00000oIO;
                }

                public final int I001lIiIIo1O() {
/* 1 */             return this.tagSize_;
                }

                public final void I001lloI(Io1IOo0o10ol io1IOo0o10ol) {
/* 5 */             this.hash_ = io1IOo0o10ol.I00000oOI();
                }

                public final void I00II0Ol1O0l(int i) {
/* 1 */             this.tagSize_ = i;
                }
            }
