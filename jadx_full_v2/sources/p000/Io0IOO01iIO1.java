            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Io0IOO01iIO1 implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 59 */                    OI10i0Il oI10i0Il = this.I00iiI;
/* 61 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 63 */                    OI10i0Il oI10i0Il3 = this.I00iio;
/* 67 */                    oI10i0Il.setValue((Ioiol1OIol) obj);
/* 72 */                    oI10i0Il2.setValue(Boolean.FALSE);
/* 77 */                    oI10i0Il3.setValue(Boolean.TRUE);
                            break;
                        case 1:
/* 39 */                    OI10i0Il oI10i0Il4 = this.I00iiI;
/* 41 */                    OI10i0Il oI10i0Il5 = this.I00iiO;
/* 43 */                    OI10i0Il oI10i0Il6 = this.I00iio;
/* 47 */                    Boolean bool = Boolean.TRUE;
/* 49 */                    oI10i0Il4.setValue(bool);
/* 52 */                    oI10i0Il5.setValue((String) obj);
/* 55 */                    oI10i0Il6.setValue(bool);
                            break;
                        default:
/* 8 */                     OI10i0Il oI10i0Il7 = this.I00iiI;
/* 10 */                    OI10i0Il oI10i0Il8 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il9 = this.I00iio;
/* 16 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 22 */                    oI10i0Il7.setValue("");
/* 25 */                    if (!zBooleanValue) {
/* 35 */                        oI10i0Il9.setValue(Boolean.TRUE);
                                break;
                            } else {
/* 29 */                        oI10i0Il8.setValue(Boolean.TRUE);
                                break;
                            }
                    }
/* 38 */            return ooiIlOl1iI;
                }
            }
