            package p000;
            
            public final class IO0loooo0O0 extends Io00Io0IO11 {
                private static final IO0loooo0O0 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private IIOI1Ii1I keyValue_ = IIOI1Ii1I.I00iiI;
                private int version_;

                static {
/* 3 */             IO0loooo0O0 iO0loooo0O0 = new IO0loooo0O0();
/* 6 */             DEFAULT_INSTANCE = iO0loooo0O0;
/* 10 */            Io00Io0IO11.I001IO000(IO0loooo0O0.class, iO0loooo0O0);
                }

                public static IO0lo11ol I001lIiIIo1O() {
/* 7 */             return (IO0lo11ol) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static IO0loooo0O0 I001lllioOl(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (IO0loooo0O0) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                        case 3:
/* 52 */                    return new IO0loooo0O0();
                        case 4:
/* 46 */                    return new IO0lo11ol(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (IO0loooo0O0.class) {
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
/* 1 */             return this.keyValue_;
                }

                public final int I001l0I00() {
/* 1 */             return this.version_;
                }

                public final void I001lloI(IIO1i10I iIO1i10I) {
/* 1 */             this.keyValue_ = iIO1i10I;
                }

                public final void I00II0Ol1O0l() {
/* 2 */             this.version_ = 0;
                }
            }
