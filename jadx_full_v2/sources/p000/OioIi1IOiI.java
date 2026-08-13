            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class OioIi1IOiI implements IlliIl1l11O {
                public final int I00iOIl;
                public Context I00iiI;
                public OI10i0Il I00iiO;

                public OioIi1IOiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 93 */                    Context context = this.I00iiI;
/* 95 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 99 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 105 */                   int iIntValue = ((Integer) obj2).intValue();
/* 119 */                   if (!iloI0lOlll1.I00OIl(1 & iIntValue, (iIntValue & 3) != 2)) {
/* 166 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 121 */                       boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(context);
/* 125 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 129 */                       if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 135 */                           I1iO01O1oOo i1iO01O1oOo = new I1iO01O1oOo(2);
/* 138 */                           i1iO01O1oOo.I00iiI = context;
/* 140 */                           i1iO01O1oOo.I00iiO = oI10i0Il;
/* 142 */                           VarHandle.storeStoreFence();
/* 145 */                           iloI0lOlll1.I00iio(i1iO01O1oOo);
                                    obj3 = i1iO01O1oOo;
                                }
/* 162 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj3, null, false, null, null, null, iII11Ii.I000l1, iloI0lOlll1, 805306368, 510);
                                break;
                            }
                        default:
/* 15 */                    Context context2 = this.I00iiI;
/* 17 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 21 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 27 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 42 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 89 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 44 */                        boolean zI000OOo1O2 = iloI0lOlll12.I000OOo1O(context2);
/* 48 */                        Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 52 */                        if (zI000OOo1O2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 58 */                            I1iO01O1oOo i1iO01O1oOo2 = new I1iO01O1oOo(1);
/* 61 */                            i1iO01O1oOo2.I00iiI = context2;
/* 63 */                            i1iO01O1oOo2.I00iiO = oI10i0Il2;
/* 65 */                            VarHandle.storeStoreFence();
/* 68 */                            iloI0lOlll12.I00iio(i1iO01O1oOo2);
                                    obj4 = i1iO01O1oOo2;
                                }
/* 85 */                        iOiO0o0oi.I0000O((IllOOo00lI) obj4, null, false, null, null, null, iII11Ii.I00100l0, iloI0lOlll12, 805306368, 510);
                                break;
                            }
                    }
/* 92 */            return ooiIlOl1iI;
                }
            }
