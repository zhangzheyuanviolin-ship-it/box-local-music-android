            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IOlio1Ili implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public Ol1o1llOII I00iiO;
                public OIOOoO1O1oO I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 65 */                    Ol1o1llOII ol1o1llOII = this.I00iiO;
/* 67 */                    OIOOoO1O1oO oIOOoO1O1oO = this.I00iio;
/* 69 */                    OI10i0Il oI10i0Il = this.I00iiI;
/* 71 */                    Float f = (Float) obj;
/* 73 */                    float fFloatValue = f.floatValue();
/* 81 */                    ol1o1llOII.put(oIOOoO1O1oO.I0000Il00O.I00000oOI, f);
/* 90 */                    oI10i0Il.setValue(IOll1OIIi0O1.I000II(oIOOoO1O1oO.I000II, fFloatValue));
                            break;
                        default:
/* 8 */                     OI10i0Il oI10i0Il2 = this.I00iiI;
/* 10 */                    Ol1o1llOII ol1o1llOII2 = this.I00iiO;
/* 12 */                    OIOOoO1O1oO oIOOoO1O1oO2 = this.I00iio;
/* 14 */                    String str = (String) obj;
/* 16 */                    oI10i0Il2.setValue(str);
/* 34 */                    Float fValueOf = OlOoll1I0.I0000oI00(str) ? Float.valueOf(Float.parseFloat(str)) : null;
/* 35 */                    if (fValueOf != null) {
/* 61 */                        ol1o1llOII2.put(oIOOoO1O1oO2.I0000Il00O.I00000oOI, Float.valueOf(Math.min(Math.max(fValueOf.floatValue(), oIOOoO1O1oO2.I0000O), oIOOoO1O1oO2.I0000oI00)));
                                break;
                            }
                            break;
                    }
/* 64 */            return ooiIlOl1iI;
                }
            }
