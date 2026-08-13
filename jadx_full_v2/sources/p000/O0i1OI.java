            package p000;
            
            public final class O0i1OI extends Io00Io0IO11 {
                private static final O0i1OI DEFAULT_INSTANCE;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private O0i1OoIO params_;
                private int version_;

                static {
/* 3 */             O0i1OI o0i1OI = new O0i1OI();
/* 6 */             DEFAULT_INSTANCE = o0i1OI;
/* 10 */            Io00Io0IO11.I001IO000(O0i1OI.class, o0i1OI);
                }

                public static O0i1O10 I001lIiIIo1O() {
/* 7 */             return (O0i1O10) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static O0i1OI I001lllioOl(IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) {
/* 7 */             return (O0i1OI) Io00Io0IO11.I0010o(DEFAULT_INSTANCE, iIOI1Ii1I, il1llO11O);
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
/* 68 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
                        case 3:
/* 52 */                    return new O0i1OI();
                        case 4:
/* 46 */                    return new O0i1O10(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0i1OI.class) {
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

                public final O0i1OoIO I001iOo1i0O() {
/* 1 */             O0i1OoIO o0i1OoIO = this.params_;
                    return o0i1OoIO == null ? O0i1OoIO.I001iOo1i0O() : o0i1OoIO;
                }

                public final int I001l0I00() {
/* 1 */             return this.version_;
                }

                public final void I001lloI(O0i1OoIO o0i1OoIO) {
/* 1 */             o0i1OoIO.getClass();
/* 4 */             this.params_ = o0i1OoIO;
                }

                public final void I00II0Ol1O0l() {
/* 2 */             this.version_ = 0;
                }
            }
