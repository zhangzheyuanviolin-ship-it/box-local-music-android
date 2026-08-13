            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class I0Iol0loO implements IlliIl1l11O {
                public final int I00iOIl;
                public Map I00iiI;
                public OI10i0Il I00iiO;

                public I0Iol0loO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 140 */                   Map map = this.I00iiI;
/* 142 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 146 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 152 */                   int iIntValue = ((Integer) obj2).intValue();
/* 167 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 272 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 173 */                       String str = (String) oI10i0Il.getValue();
/* 181 */                       boolean zContainsKey = map.containsKey((String) oI10i0Il.getValue());
/* 185 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 191 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 197 */                           I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(8);
/* 200 */                           i0Il0IoIIOll.I00iiI = oI10i0Il;
/* 202 */                           VarHandle.storeStoreFence();
/* 205 */                           iloI0lOlll1.I00iio(i0Il0IoIIOll);
                                    obj3 = i0Il0IoIIOll;
                                }
/* 209 */                       Function1 function1 = (Function1) obj3;
/* 213 */                       I0Iol0loO i0Iol0loO = new I0Iol0loO(i2);
/* 216 */                       i0Iol0loO.I00iiI = map;
/* 218 */                       i0Iol0loO.I00iiO = oI10i0Il;
/* 220 */                       VarHandle.storeStoreFence();
/* 266 */                       l1liIOil0i1o.I00000oOI(str, function1, null, false, false, null, i1O1i1.I00100o1O0lo, null, null, null, iiioOl1O.I00000oOI(1163087872, i0Iol0loO, iloI0lOlll1), zContainsKey, null, null, null, false, 0, 0, null, null, iloI0lOlll1, 1572912, 384, 8376252);
                                break;
                            }
                        default:
/* 13 */                    Map map2 = this.I00iiI;
/* 15 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 19 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 25 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 41 */                    if (!iloI0lOlll12.I00OIl(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
/* 136 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else if (!map2.containsKey((String) oI10i0Il2.getValue())) {
/* 128 */                       iloI0lOlll12.I00i01iIIliI(2049850050);
/* 131 */                       iloI0lOlll12.I0010I0i(false);
                                break;
                            } else {
/* 58 */                        iloI0lOlll12.I00i01iIIliI(2049683797);
/* 115 */                       Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.duplicated_script_name, iloI0lOlll12), null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll12, 0, 0, 262138);
/* 120 */                       iloI0lOlll12.I0010I0i(false);
                                break;
                            }
                    }
/* 139 */           return ooiIlOl1iI;
                }
            }
