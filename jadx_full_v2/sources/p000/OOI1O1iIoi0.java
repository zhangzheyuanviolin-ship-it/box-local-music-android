            package p000;
            
            public final class OOI1O1iIoi0 extends Io00l0 {
                public static final int BOOLEAN_FIELD_NUMBER = 1;
                public static final int BYTES_FIELD_NUMBER = 8;
                private static final OOI1O1iIoi0 DEFAULT_INSTANCE;
                public static final int DOUBLE_FIELD_NUMBER = 7;
                public static final int FLOAT_FIELD_NUMBER = 2;
                public static final int INTEGER_FIELD_NUMBER = 3;
                public static final int LONG_FIELD_NUMBER = 4;
                private static volatile OO01IIl0i0oI PARSER = null;
                public static final int STRING_FIELD_NUMBER = 5;
                public static final int STRING_SET_FIELD_NUMBER = 6;
                private int valueCase_ = 0;
                private Object value_;

                static {
/* 3 */             OOI1O1iIoi0 oOI1O1iIoi0 = new OOI1O1iIoi0();
/* 6 */             DEFAULT_INSTANCE = oOI1O1iIoi0;
/* 10 */            Io00l0.I000iOII(OOI1O1iIoi0.class, oOI1O1iIoi0);
                }

                public static OOI1O1iIoi0 I000oI1ioi() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static OOI0olOiOoI I001i1O0Ol() {
/* 10 */            return (OOI0olOiOoI) ((Ilooooo) DEFAULT_INSTANCE.I0000Il00O(5));
                }

                @Override
                public final Object I0000Il00O(int i) {
                    OO01IIl0i0oI io000iO;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00l0.I000OOo1O(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", OOI0olOI1i0i.class});
                        case 3:
/* 52 */                    return new OOI1O1iIoi0();
                        case 4:
/* 46 */                    return new OOI0olOiOoI(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIl0i0oI oO01IIl0i0oI = PARSER;
/* 15 */                    if (oO01IIl0i0oI != null) {
/* 38 */                        return oO01IIl0i0oI;
                            }
                            synchronized (OOI1O1iIoi0.class) {
                                try {
/* 20 */                            io000iO = PARSER;
/* 22 */                            if (io000iO == null) {
/* 26 */                                io000iO = new Io000iO();
/* 29 */                                PARSER = io000iO;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                            }
/* 35 */                    return io000iO;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final boolean I000lI() {
/* 4 */             if (this.valueCase_ == 1) {
/* 10 */                return ((Boolean) this.value_).booleanValue();
                    }
/* 15 */            return false;
                }

                public final IIO1ooI I000o00OoI0I() {
                    return this.valueCase_ == 8 ? (IIO1ooI) this.value_ : IIO1ooI.I00iiO;
                }

                public final double I00100l0() {
/* 4 */             if (this.valueCase_ == 7) {
/* 10 */                return ((Double) this.value_).doubleValue();
                    }
/* 15 */            return 0.0d;
                }

                public final float I00100o1O0lo() {
/* 4 */             if (this.valueCase_ == 2) {
/* 10 */                return ((Float) this.value_).floatValue();
                    }
/* 15 */            return 0.0f;
                }

                public final int I0010I0i() {
/* 4 */             if (this.valueCase_ == 3) {
/* 10 */                return ((Integer) this.value_).intValue();
                    }
/* 15 */            return 0;
                }

                public final long I0010o() {
/* 4 */             if (this.valueCase_ == 4) {
/* 10 */                return ((Long) this.value_).longValue();
                    }
/* 15 */            return 0L;
                }

                public final String I00111O() {
                    return this.valueCase_ == 5 ? (String) this.value_ : "";
                }

                public final OOI0olOI1i0i I001IIilI0O() {
                    return this.valueCase_ == 6 ? (OOI0olOI1i0i) this.value_ : OOI0olOI1i0i.I000o00OoI0I();
                }

                public final int I001IO000() {
                    switch (this.valueCase_) {
                        case 0:
/* 25 */                    return 9;
                        case 1:
/* 23 */                    return 1;
                        case 2:
/* 21 */                    return 2;
                        case 3:
/* 19 */                    return 3;
                        case 4:
/* 17 */                    return 4;
                        case 5:
/* 15 */                    return 5;
                        case 6:
/* 13 */                    return 6;
                        case 7:
/* 11 */                    return 7;
                        case 8:
/* 8 */                     return 8;
                        default:
/* 6 */                     return 0;
                    }
                }

                public final void I001i1lo1io(boolean z) {
/* 2 */             this.valueCase_ = 1;
/* 8 */             this.value_ = Boolean.valueOf(z);
                }

                public final void I001iOo1i0O(IIO1ooI iIO1ooI) {
/* 3 */             this.valueCase_ = 8;
/* 5 */             this.value_ = iIO1ooI;
                }

                public final void I001l0I00(double d) {
/* 2 */             this.valueCase_ = 7;
/* 8 */             this.value_ = Double.valueOf(d);
                }

                public final void I001lIiIIo1O(float f) {
/* 2 */             this.valueCase_ = 2;
/* 8 */             this.value_ = Float.valueOf(f);
                }

                public final void I001lllioOl(int i) {
/* 2 */             this.valueCase_ = 3;
/* 8 */             this.value_ = Integer.valueOf(i);
                }

                public final void I001lloI(long j) {
/* 2 */             this.valueCase_ = 4;
/* 8 */             this.value_ = Long.valueOf(j);
                }

                public final void I00II0Ol1O0l(String str) {
/* 2 */             this.valueCase_ = 5;
/* 4 */             this.value_ = str;
                }

                public final void I00II0oii1o(OOI0olOI1i0i oOI0olOI1i0i) {
/* 1 */             this.value_ = oOI0olOI1i0i;
/* 4 */             this.valueCase_ = 6;
                }
            }
