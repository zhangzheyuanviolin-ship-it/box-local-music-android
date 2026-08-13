            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class OioIilOIOO1 implements IlliIl1l11O {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public OioIilOIOO1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    String strI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 490 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 496 */                   int iIntValue = ((Integer) obj2).intValue();
/* 510 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 552 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 512 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 516 */                       if (objI00O0i0ii == iOO0o0I1l) {
/* 522 */                           OI1oil oI1oil = new OI1oil(16);
/* 525 */                           oI1oil.I00iiI = oI10i0Il;
/* 527 */                           VarHandle.storeStoreFence();
/* 530 */                           iloI0lOlll1.I00iio(oI1oil);
                                    obj3 = oI1oil;
                                }
/* 548 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj3, null, false, null, null, null, iII11Ii.I000lI, iloI0lOlll1, 805306374, 510);
                                break;
                            }
                        case 1:
/* 422 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 428 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 442 */                   if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 484 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 444 */                       Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 448 */                       if (objI00O0i0ii2 == iOO0o0I1l) {
/* 454 */                           OI1oil oI1oil2 = new OI1oil(20);
/* 457 */                           oI1oil2.I00iiI = oI10i0Il;
/* 459 */                           VarHandle.storeStoreFence();
/* 462 */                           iloI0lOlll12.I00iio(oI1oil2);
                                    obj4 = oI1oil2;
                                }
/* 480 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj4, null, false, null, null, null, iII11Ii.I00100o1O0lo, iloI0lOlll12, 805306374, 510);
                                break;
                            }
                        case 2:
/* 355 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 361 */                   int iIntValue3 = ((Integer) obj2).intValue();
/* 375 */                   if (!iloI0lOlll13.I00OIl(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
/* 416 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 377 */                       Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                Object obj5 = objI00O0i0ii3;
/* 381 */                       if (objI00O0i0ii3 == iOO0o0I1l) {
/* 385 */                           Ol0ioi ol0ioi = new Ol0ioi(1);
/* 388 */                           ol0ioi.I00iiI = oI10i0Il;
/* 390 */                           VarHandle.storeStoreFence();
/* 393 */                           iloI0lOlll13.I00iio(ol0ioi);
                                    obj5 = ol0ioi;
                                }
/* 412 */                       iOiO0o0oi.I0000Il00O((IllOOo00lI) obj5, null, false, null, null, null, null, iII1I0Io0oo.I000OiO, iloI0lOlll13, 805306374, 510);
                                break;
                            }
                        case 3:
/* 241 */                   IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj;
/* 247 */                   int iIntValue4 = ((Integer) obj2).intValue();
/* 263 */                   if (!iloI0lOlll14.I00OIl(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
/* 349 */                       iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 269 */                       if (Ol0lllilO0Ol.I0000oI00(oI10i0Il)) {
/* 274 */                           iloI0lOlll14.I00i01iIIliI(-335394556);
/* 280 */                           strI00000oOI = lOOoli.I00000oOI(R.string.delete_selected_skills_title, iloI0lOlll14);
/* 284 */                           iloI0lOlll14.I0010I0i(false);
                                } else {
/* 292 */                           iloI0lOlll14.I00i01iIIliI(-335392351);
/* 298 */                           strI00000oOI = lOOoli.I00000oOI(R.string.delete_skill_dialog_title, iloI0lOlll14);
/* 302 */                           iloI0lOlll14.I0010I0i(false);
                                }
/* 343 */                       Oo0i1oIIoOO.I00000oOI(strI00000oOI, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll14, 0, 0, 262142);
                                break;
                            }
                        case 4:
/* 134 */                   IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj;
/* 140 */                   int iIntValue5 = ((Integer) obj2).intValue();
/* 156 */                   if (!iloI0lOlll15.I00OIl(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
/* 235 */                       iloI0lOlll15.I00OilO00Il();
                                break;
                            } else if (OlOoOIi0o.I00OIo((String) oI10i0Il.getValue()).toString().length() <= 0) {
/* 228 */                       iloI0lOlll15.I00i01iIIliI(84176165);
/* 231 */                       iloI0lOlll15.I0010I0i(false);
                                break;
                            } else {
/* 181 */                       iloI0lOlll15.I00i01iIIliI(84006068);
/* 184 */                       Object objI00O0i0ii4 = iloI0lOlll15.I00O0i0ii();
                                Object obj6 = objI00O0i0ii4;
/* 188 */                       if (objI00O0i0ii4 == iOO0o0I1l) {
/* 193 */                           Ol0ioi ol0ioi2 = new Ol0ioi(3);
/* 196 */                           ol0ioi2.I00iiI = oI10i0Il;
/* 198 */                           VarHandle.storeStoreFence();
/* 201 */                           iloI0lOlll15.I00iio(ol0ioi2);
                                    obj6 = ol0ioi2;
                                }
/* 218 */                       iIo1101O.I00000oIO((IllOOo00lI) obj6, null, false, null, null, iII1I0Io0oo.I0001Ioi1lo, iloI0lOlll15, 1572870, 62);
/* 221 */                       iloI0lOlll15.I0010I0i(false);
                                break;
                            }
                        case 5:
/* 66 */                    IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj;
/* 72 */                    int iIntValue6 = ((Integer) obj2).intValue();
/* 86 */                    if (!iloI0lOlll16.I00OIl(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
/* 128 */                       iloI0lOlll16.I00OilO00Il();
                                break;
                            } else {
/* 88 */                        Object objI00O0i0ii5 = iloI0lOlll16.I00O0i0ii();
                                Object obj7 = objI00O0i0ii5;
/* 92 */                        if (objI00O0i0ii5 == iOO0o0I1l) {
/* 98 */                            Ol0ioi ol0ioi3 = new Ol0ioi(12);
/* 101 */                           ol0ioi3.I00iiI = oI10i0Il;
/* 103 */                           VarHandle.storeStoreFence();
/* 106 */                           iloI0lOlll16.I00iio(ol0ioi3);
                                    obj7 = ol0ioi3;
                                }
/* 124 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj7, null, false, null, null, null, iIIO1o00ioIO.I0000O, iloI0lOlll16, 805306374, 510);
                                break;
                            }
                        default:
/* 19 */                    IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj;
/* 25 */                    int iIntValue7 = ((Integer) obj2).intValue();
/* 41 */                    if (!iloI0lOlll17.I00OIl(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
/* 60 */                        iloI0lOlll17.I00OilO00Il();
                                break;
                            } else {
/* 56 */                        liIoOiiO1Oi.I00iio.I0000oI00(((Boolean) oI10i0Il.getValue()).booleanValue(), null, iloI0lOlll17, 0);
                                break;
                            }
                    }
/* 63 */            return ooiIlOl1iI;
                }
            }
