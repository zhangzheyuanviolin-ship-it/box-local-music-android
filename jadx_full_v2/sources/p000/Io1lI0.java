            package p000;
            
            public final class Io1lI0 extends Io00Io0IO11 {
                private static final Io1lI0 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private IIOI1Ii1I keyValue_ = IIOI1Ii1I.I00iiI;
                private Io1lilII0O1 params_;
                private int version_;

                static {
/* 3 */             Io1lI0 io1lI0 = new Io1lI0();
/* 6 */             DEFAULT_INSTANCE = io1lI0;
/* 10 */            Io00Io0IO11.I001IO000(Io1lI0.class, io1lI0);
                }

                public static Io1lI0 I001iOo1i0O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Io1l0o I001lloI() {
/* 7 */             return (Io1l0o) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static Io1lI0 I00II0Ol1O0l(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (Io1lI0) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
                        case 3:
/* 52 */                    return new Io1lI0();
                        case 4:
/* 46 */                    return new Io1l0o(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (Io1lI0.class) {
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

                public final IIOI1Ii1I I001l0I00() {
/* 1 */             return this.keyValue_;
                }

                public final Io1lilII0O1 I001lIiIIo1O() {
/* 1 */             Io1lilII0O1 io1lilII0O1 = this.params_;
                    return io1lilII0O1 == null ? Io1lilII0O1.I001iOo1i0O() : io1lilII0O1;
                }

                public final int I001lllioOl() {
/* 1 */             return this.version_;
                }

                public final void I00II0oii1o(IIO1i10I iIO1i10I) {
/* 1 */             this.keyValue_ = iIO1i10I;
                }

                public final void I00IO1(Io1lilII0O1 io1lilII0O1) {
/* 1 */             io1lilII0O1.getClass();
/* 4 */             this.params_ = io1lilII0O1;
                }

                public final void I00IO1oi11O() {
/* 2 */             this.version_ = 0;
                }
            }
