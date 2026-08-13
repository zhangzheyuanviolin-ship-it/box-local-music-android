            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OlI11I0 implements Function1 {
                public final int I00iOIl;
                public OlI1IliO0I I00iiI;

                public OlI11I0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             OlI1IliO0I olI1IliO0I = this.I00iiI;
/* 8 */             Float f = (Float) obj;
                    switch (i) {
                        case 0:
/* 45 */                    int iFloatValue = (int) f.floatValue();
/* 46 */                    OlO0OIIl1 olO0OIIl1 = olI1IliO0I.I00000oOI;
/* 73 */                    olO0OIIl1.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl1.getValue(), null, lIiioliIlo.I0000Il00O(iFloatValue, 1, 200), false, 0.0f, null, null, 61));
                            break;
                        default:
/* 13 */                    float fFloatValue = f.floatValue();
/* 17 */                    OlO0OIIl1 olO0OIIl12 = olI1IliO0I.I00000oOI;
/* 37 */                    olO0OIIl12.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl12.getValue(), null, 0, false, fFloatValue, null, null, 55));
                            break;
                    }
/* 40 */            return ooiIlOl1iI;
                }
            }
