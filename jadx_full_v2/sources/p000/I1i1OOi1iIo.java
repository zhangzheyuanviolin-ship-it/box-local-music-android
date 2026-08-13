            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I1i1OOi1iIo implements Function1 {
                public final int I00iOIl;
                public OIooO1iiliI I00iiI;

                public I1i1OOi1iIo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OIooO1iiliI oIooO1iiliI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 78 */                    oIooO1iiliI.I000O01llI0(((Number) ((I10i01) obj).I0000O()).floatValue());
                            break;
                        case 1:
/* 62 */                    oIooO1iiliI.I000O01llI0(((Long) obj).longValue() / 1000.0f);
                            break;
                        case 2:
/* 48 */                    oIooO1iiliI.I000O01llI0(((Float) obj).floatValue());
                            break;
                        case 3:
/* 32 */                    float fFloatValue = ((Float) obj).floatValue();
/* 36 */                    List list = O1oOO0O1l0.I00000oIO;
/* 38 */                    oIooO1iiliI.I000O01llI0(fFloatValue);
                            break;
                        default:
/* 10 */                    Iill00 iill00 = (Iill00) obj;
/* 12 */                    IiloiO iiloiO = IiloiO.I00iOIl;
/* 14 */                    OoIoO0I0oOI ooIoO0I0oOI = OII0IoiI.I00000oIO;
/* 20 */                    iill00.I00000oIO(iiloiO, oIooO1iiliI.I000II());
/* 26 */                    iill00.I00000oIO(IiloiO.I00iiI, 0.0f);
                            break;
                    }
/* 29 */            return ooiIlOl1iI;
                }
            }
