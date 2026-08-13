            package p000;

            import java.util.ArrayList;
            
            public final class Ooo010llO extends Io00Ol1o10O {
                public static final int AVG_FIELD_NUMBER = 4;
                private static final Ooo010llO DEFAULT_INSTANCE;
                public static final int MAX_FIELD_NUMBER = 3;
                public static final int MEDIUM_FIELD_NUMBER = 5;
                public static final int MIN_FIELD_NUMBER = 2;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int PCT25_FIELD_NUMBER = 7;
                public static final int PCT75_FIELD_NUMBER = 8;
                public static final int VALUE_FIELD_NUMBER = 1;
                private double avg_;
                private double max_;
                private double medium_;
                private double min_;
                private double pct25_;
                private double pct75_;
                private int valueMemoizedSerializedSize = -1;
                private IooilIliolo1 value_ = Iiilo1O111.I00ilI0I1;

                static {
/* 3 */             Ooo010llO ooo010llO = new Ooo010llO();
/* 6 */             DEFAULT_INSTANCE = ooo010llO;
/* 10 */            Io00Ol1o10O.I000oI1ioi(Ooo010llO.class, ooo010llO);
                }

                public static Ooo010llO I00111O() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static Ooo010IiioI I001l0I00() {
/* 7 */             return (Ooo010IiioI) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 88 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 81 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001#\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0007\u0000\b\u0000", new Object[]{"value_", "min_", "max_", "avg_", "medium_", "pct25_", "pct75_"});
                        case 3:
/* 55 */                    return new Ooo010llO();
                        case 4:
/* 49 */                    return new Ooo010IiioI(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (Ooo010llO.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 40 */                            throw th;
                                }
                            }
/* 38 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final void I0010I0i(ArrayList arrayList) {
/* 1 */             Iool1IOO1o0i iool1IOO1o0i = this.value_;
/* 6 */             boolean z = ((I01O10iIoo1O) iool1IOO1o0i).I00iOIl;
                    Iool1IOO1o0i iool1IOO1o0i2 = iool1IOO1o0i;
/* 8 */             if (!z) {
/* 18 */                Iiilo1O111 iiilo1O111I0001Ioi1lo = ((Iiilo1O111) iool1IOO1o0i).I000O01llI0(iool1IOO1o0i.size() * 2);
/* 22 */                this.value_ = iiilo1O111I0001Ioi1lo;
                        iool1IOO1o0i2 = iiilo1O111I0001Ioi1lo;
                    }
/* 24 */            IloooliOooIO.I00000oIO(arrayList, iool1IOO1o0i2);
                }

                public final double I0010o() {
/* 1 */             return this.avg_;
                }

                public final double I001IIilI0O() {
/* 1 */             return this.max_;
                }

                public final double I001IO000() {
/* 1 */             return this.medium_;
                }

                public final double I001i1O0Ol() {
/* 1 */             return this.min_;
                }

                public final int I001i1lo1io() {
/* 3 */             return this.value_.size();
                }

                public final IooilIliolo1 I001iOo1i0O() {
/* 1 */             return this.value_;
                }

                public final void I001lIiIIo1O(double d) {
/* 1 */             this.avg_ = d;
                }

                public final void I001lllioOl(double d) {
/* 1 */             this.max_ = d;
                }

                public final void I001lloI(double d) {
/* 1 */             this.medium_ = d;
                }

                public final void I00II0Ol1O0l(double d) {
/* 1 */             this.min_ = d;
                }

                public final void I00II0oii1o(double d) {
/* 1 */             this.pct25_ = d;
                }

                public final void I00IO1(double d) {
/* 1 */             this.pct75_ = d;
                }
            }
