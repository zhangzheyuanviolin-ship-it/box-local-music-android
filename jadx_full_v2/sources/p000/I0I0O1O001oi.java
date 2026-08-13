            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class I0I0O1O001oi implements Function3 {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;

                public I0I0O1O001oi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 93 */                    boolean z = this.I00iiI;
/* 97 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiO;
/* 102 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 108 */                   ((Integer) obj3).intValue();
/* 112 */                   if (z) {
/* 117 */                       iloI0lOlll1.I00i01iIIliI(1224252100);
/* 124 */                       illiIl1l11O.invoke(iloI0lOlll1, 0);
/* 127 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 134 */                       iloI0lOlll1.I00i01iIIliI(1224292462);
/* 137 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 140 */                   return ooiIlOl1iI;
                        case 1:
/* 48 */                    OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iiO;
/* 50 */                    boolean z2 = this.I00iiI;
/* 63 */                    OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) obj2).I001lllioOl(((IOo0oO11ll1O) obj3).I00000oIO);
/* 67 */                    int i2 = oO1I0001000iI001lllioOl.I00iOIl;
/* 69 */                    int i3 = oO1I0001000iI001lllioOl.I00iiI;
/* 74 */                    Iii0IOio iii0IOio = new Iii0IOio(2);
/* 77 */                    iii0IOio.I00iiO = olO01l1oOil;
/* 79 */                    iii0IOio.I00iiI = z2;
/* 81 */                    iii0IOio.I00iio = oO1I0001000iI001lllioOl;
/* 83 */                    VarHandle.storeStoreFence();
/* 88 */                    return ((O1iOIoOiO0) obj).I001i1lo1io(i2, i3, Il011I1OiO0I.I00iOIl, iii0IOio);
                        default:
/* 25 */                    int iIntValue = ((Integer) obj3).intValue();
/* 29 */                    Ol10Oo ol10Oo = Ol10Oo.I00000oIO;
/* 42 */                    ol10Oo.I0000Il00O((Ol111o0) obj, null, this.I00iiI, (Ol0ooOiloO1) this.I00iiO, null, null, 0.0f, 0.0f, (IloI0lOlll1) obj2, (iIntValue & 14) | 100663296);
/* 45 */                    return ooiIlOl1iI;
                    }
                }
            }
