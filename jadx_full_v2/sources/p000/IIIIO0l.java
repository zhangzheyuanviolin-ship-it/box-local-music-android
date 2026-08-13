            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IIIIO0l implements Function1 {
                public final int I00iOIl;
                public I10i01 I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             I10i01 i10i01 = this.I00iiI;
/* 7 */             Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
                    switch (i) {
                        case 0:
/* 39 */                    oi11lOiIoi.I0000Il00O(((Number) i10i01.I0000O()).floatValue());
/* 46 */                    if (oi11lOiIoi.I00ol1 != 12) {
                                oi11lOiIoi.I00iOIl |= 524288;
/* 56 */                        oi11lOiIoi.I00ol1 = 12;
                                break;
                            }
                            break;
                        default:
/* 25 */                    oi11lOiIoi.I0000Il00O(1.0f - ((Number) i10i01.I0000O()).floatValue());
                            break;
                    }
/* 28 */            return ooiIlOl1iI;
                }
            }
