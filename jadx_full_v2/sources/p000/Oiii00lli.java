            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oiii00lli implements IlliIl1l11O {
                public final int I00iOIl;
                public Oiio1oll000 I00iiI;
                public IOii1l I00iiO;
                public Oiill0lI1il1 I00iio;

                public Oiii00lli(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 72 */                    Oiill0lI1il1 oiill0lI1il1 = this.I00iio;
/* 74 */                    Oiio1oll000 oiio1oll000 = this.I00iiI;
/* 76 */                    IOii1l iOii1l = this.I00iiO;
/* 78 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 82 */                    int iIntValue = ((Integer) obj2).intValue();
/* 96 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 125 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 100 */                       Oiii00lli oiii00lli = new Oiii00lli(i2);
/* 103 */                       oiii00lli.I00iiI = oiio1oll000;
/* 105 */                       oiii00lli.I00iiO = iOii1l;
/* 107 */                       oiii00lli.I00iio = oiill0lI1il1;
/* 109 */                       VarHandle.storeStoreFence();
/* 121 */                       iioO1o.I00000oIO(oiill0lI1il1, iiioOl1O.I00000oOI(201187952, oiii00lli, iloI0lOlll1), iloI0lOlll1, 48);
                                break;
                            }
                        default:
/* 11 */                    Oiio1oll000 oiio1oll0002 = this.I00iiI;
/* 13 */                    IOii1l iOii1l2 = this.I00iiO;
/* 15 */                    Oiill0lI1il1 oiill0lI1il12 = this.I00iio;
/* 17 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 21 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 35 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 68 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 39 */                        OOiIo1lll oOiIo1lllI00000oIO = OiioI1I0i0.I00000oIO.I00000oIO(oiio1oll0002);
/* 45 */                        IOi0i1lli1oo iOi0i1lli1oo = new IOi0i1lli1oo(2);
/* 48 */                        iOi0i1lli1oo.I00iiO = iOii1l2;
/* 50 */                        iOi0i1lli1oo.I00iiI = oiill0lI1il12;
/* 52 */                        VarHandle.storeStoreFence();
/* 64 */                        iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(1199015344, iOi0i1lli1oo, iloI0lOlll12), iloI0lOlll12, 56);
                                break;
                            }
                    }
/* 71 */            return ooiIlOl1iI;
                }
            }
