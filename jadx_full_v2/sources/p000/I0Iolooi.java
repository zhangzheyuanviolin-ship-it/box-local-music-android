            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I0Iolooi implements IlliIl1l11O {
                public final int I00iOIl;
                public Function1 I00iiI;
                public String I00iiO;
                public OI10i0Il I00iio;

                public I0Iolooi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 101 */                   String str = this.I00iiO;
/* 103 */                   Function1 function1 = this.I00iiI;
/* 105 */                   OI10i0Il oI10i0Il = this.I00iio;
/* 109 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 115 */                   int iIntValue = ((Integer) obj2).intValue();
/* 131 */                   if (!iloI0lOlll1.I00OIl(1 & iIntValue, (iIntValue & 3) != 2)) {
/* 211 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 141 */                       boolean zI000II = iloI0lOlll1.I000II(str) | iloI0lOlll1.I000II(function1);
/* 142 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 146 */                       if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 152 */                           I0O01OoI1Oi i0O01OoI1Oi = new I0O01OoI1Oi(0);
/* 155 */                           i0O01OoI1Oi.I00iiO = str;
/* 157 */                           i0O01OoI1Oi.I00iiI = function1;
/* 159 */                           i0O01OoI1Oi.I00iio = oI10i0Il;
/* 161 */                           VarHandle.storeStoreFence();
/* 164 */                           iloI0lOlll1.I00iio(i0O01OoI1Oi);
                                    obj3 = i0O01OoI1Oi;
                                }
/* 169 */                       OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 205 */                       iOiO0o0oi.I00000oIO((IllOOo00lI) obj3, null, false, null, IIIi0o0.I00000oIO(((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I0010o, IOOiio0i.I0001Ioi1lo, iloI0lOlll1, 12), null, null, null, i1O1i1.I0010I0i, iloI0lOlll1, 805306368, 494);
                                break;
                            }
                        default:
/* 15 */                    Function1 function12 = this.I00iiI;
/* 17 */                    String str2 = this.I00iiO;
/* 19 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 23 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 29 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 43 */                    if (!iloI0lOlll12.I00OIl(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
/* 97 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 53 */                        boolean zI000II2 = iloI0lOlll12.I000II(function12) | iloI0lOlll12.I000II(str2);
/* 54 */                        Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 58 */                        if (zI000II2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 64 */                            I0O01OoI1Oi i0O01OoI1Oi2 = new I0O01OoI1Oi(2);
/* 67 */                            i0O01OoI1Oi2.I00iiI = function12;
/* 69 */                            i0O01OoI1Oi2.I00iiO = str2;
/* 71 */                            i0O01OoI1Oi2.I00iio = oI10i0Il2;
/* 73 */                            VarHandle.storeStoreFence();
/* 76 */                            iloI0lOlll12.I00iio(i0O01OoI1Oi2);
                                    obj4 = i0O01OoI1Oi2;
                                }
/* 93 */                        iOiO0o0oi.I0000O((IllOOo00lI) obj4, null, false, null, null, null, i1OolO1i0OOI.I000l1, iloI0lOlll12, 805306368, 510);
                                break;
                            }
                    }
/* 100 */           return ooiIlOl1iI;
                }
            }
