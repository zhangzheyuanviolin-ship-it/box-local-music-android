            package p000;
            
            public final class I0OoI1oo101 extends Io00Io0IO11 {
                private static final I0OoI1oo101 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private IIOI1Ii1I keyValue_ = IIOI1Ii1I.I00iiI;
                private I0OoOO params_;
                private int version_;

                static {
/* 3 */             I0OoI1oo101 i0OoI1oo101 = new I0OoI1oo101();
/* 6 */             DEFAULT_INSTANCE = i0OoI1oo101;
/* 10 */            Io00Io0IO11.I001IO000(I0OoI1oo101.class, i0OoI1oo101);
                }

                public static I0OoI11loll I001lllioOl() {
/* 7 */             return (I0OoI11loll) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static I0OoI1oo101 I001lloI(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (I0OoI1oo101) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 52 */                    return new I0OoI1oo101();
                        case 4:
/* 46 */                    return new I0OoI11loll(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (I0OoI1oo101.class) {
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

                public final I0OoOO I001l0I00() {
/* 1 */             I0OoOO i0OoOO = this.params_;
                    return i0OoOO == null ? I0OoOO.I001l0I00() : i0OoOO;
                }

                public final int I001lIiIIo1O() {
/* 1 */             return this.version_;
                }

                public final void I00II0Ol1O0l(IIO1i10I iIO1i10I) {
/* 1 */             this.keyValue_ = iIO1i10I;
                }

                public final void I00II0oii1o(I0OoOO i0OoOO) {
/* 1 */             i0OoOO.getClass();
/* 4 */             this.params_ = i0OoOO;
                }

                public final void I00IO1() {
/* 2 */             this.version_ = 0;
                }
            }
