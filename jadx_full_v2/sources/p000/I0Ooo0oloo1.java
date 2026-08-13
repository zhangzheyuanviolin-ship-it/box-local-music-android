            package p000;
            
            public final class I0Ooo0oloo1 extends Io00Io0IO11 {
                private static final I0Ooo0oloo1 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 3;
                private int keySize_;
                private int version_;

                static {
/* 3 */             I0Ooo0oloo1 i0Ooo0oloo1 = new I0Ooo0oloo1();
/* 6 */             DEFAULT_INSTANCE = i0Ooo0oloo1;
/* 10 */            Io00Io0IO11.I001IO000(I0Ooo0oloo1.class, i0Ooo0oloo1);
                }

                public static I0OolOoiI0 I001l0I00() {
/* 7 */             return (I0OolOoiI0) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0Ooo0oloo1 I001lIiIIo1O(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0Ooo0oloo1) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
                        case 3:
/* 52 */                    return new I0Ooo0oloo1();
                        case 4:
/* 46 */                    return new I0OolOoiI0(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0Ooo0oloo1.class) {
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
/* 1 */             return this.keySize_;
                }

                public final void I001lllioOl(int i) {
/* 1 */             this.keySize_ = i;
                }
            }
