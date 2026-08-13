            package p000;
            
            public final class O0OiO1O00I extends Io00Io0IO11 {
                private static final O0OiO1O00I DEFAULT_INSTANCE;
                public static final int KEY_INFO_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
                private Iool0o0iOI keyInfo_ = OOiI00liIO.I00iio;
                private int primaryKeyId_;

                static {
/* 3 */             O0OiO1O00I o0OiO1O00I = new O0OiO1O00I();
/* 6 */             DEFAULT_INSTANCE = o0OiO1O00I;
/* 10 */            Io00Io0IO11.I001IO000(O0OiO1O00I.class, o0OiO1O00I);
                }

                public static O0OOoOlO1li I001lIiIIo1O() {
/* 7 */             return (O0OOoOlO1li) DEFAULT_INSTANCE.I000O01llI0();
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
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", O0OiIllIil.class});
                        case 3:
/* 52 */                    return new O0OiO1O00I();
                        case 4:
/* 46 */                    return new O0OOoOlO1li(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0OiO1O00I.class) {
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

                public final void I001iOo1i0O(O0OiIllIil o0OiIllIil) {
/* 1 */             Iool0o0iOI iool0o0iOII000O01llI0 = this.keyInfo_;
/* 8 */             if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 10 */                int size = iool0o0iOII000O01llI0.size();
/* 21 */                iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size == 0 ? 10 : size * 2);
/* 25 */                this.keyInfo_ = iool0o0iOII000O01llI0;
                    }
/* 27 */            iool0o0iOII000O01llI0.add(o0OiIllIil);
                }

                public final O0OiIllIil I001l0I00() {
/* 8 */             return (O0OiIllIil) this.keyInfo_.get(0);
                }

                public final void I001lllioOl(int i) {
/* 1 */             this.primaryKeyId_ = i;
                }
            }
