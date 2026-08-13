            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class Oii01o1iiOI implements Function1 {
                public final int I00iOIl;
                public Oii01oOII I00iiI;

                public Oii01o1iiOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oii01oOII oii01oOII = this.I00iiI;
/* 7 */             IOIi0iI010o iOIi0iI010o = (IOIi0iI010o) obj;
                    switch (i) {
                        case 0:
/* 59 */                    IOIi0iI010o.I00000oIO(iOIi0iI010o, "type", OlOlllO.I00000oOI);
/* 93 */                    Oii01o1iiOI oii01o1iiOI = new Oii01o1iiOI(1);
/* 96 */                    oii01o1iiOI.I00iiI = oii01oOII;
/* 98 */                    VarHandle.storeStoreFence();
/* 109 */                   IOIi0iI010o.I00000oIO(iOIi0iI010o, "value", lO1o10lllO0I.I00000oOI("kotlinx.serialization.Sealed<" + oii01oOII.I00000oIO.I000oI1ioi() + '>', OilOoo01.I00000oOI, new OilOloI[0], oii01o1iiOI));
/* 114 */                   iOIi0iI010o.I00000oOI = oii01oOII.I00000oOI;
                            break;
                        default:
/* 26 */                    for (Map.Entry entry : oii01oOII.I0000oI00.entrySet()) {
/* 50 */                        IOIi0iI010o.I00000oIO(iOIi0iI010o, (String) entry.getKey(), ((O0O01001OOII) entry.getValue()).I0000O());
                            }
                            break;
                    }
/* 54 */            return ooiIlOl1iI;
                }
            }
