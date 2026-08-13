            package p000;

            import android.content.Context;
            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I0Il0I1o implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I0Il0I1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 7 */             O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 9 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 13 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            int i2 = 1;
                    switch (i) {
                        case 0:
/* 1487 */                  O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 1491 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1495 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 1501 */                  int iIntValue = ((Integer) obj2).intValue();
/* 1517 */                  if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 1599 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            } else if (((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI.length() <= 0) {
/* 1592 */                      iloI0lOlll1.I00i01iIIliI(-1585272598);
/* 1595 */                      iloI0lOlll1.I0010I0i(false);
                                break;
                            } else {
/* 1538 */                      iloI0lOlll1.I00i01iIIliI(-1585600299);
/* 1541 */                      boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1i1O1I);
/* 1545 */                      Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 1549 */                      if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 1556 */                          I01ii1IIl i01ii1IIl = new I01ii1IIl(4);
/* 1559 */                          i01ii1IIl.I00iiI = o1i1O1I;
/* 1561 */                          i01ii1IIl.I00iiO = oI10i0Il;
/* 1563 */                          VarHandle.storeStoreFence();
/* 1566 */                          iloI0lOlll1.I00iio(i01ii1IIl);
                                    obj3 = i01ii1IIl;
                                }
/* 1582 */                      iIo1101O.I00000oIO((IllOOo00lI) obj3, null, false, null, null, i1O11iOo0.I00000oIO, iloI0lOlll1, 1572864, 62);
/* 1585 */                      iloI0lOlll1.I0010I0i(false);
                                break;
                            }
                        case 1:
/* 1445 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiO;
/* 1449 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 1453 */                  String str = (String) obj;
/* 1457 */                  String str2 = (String) obj2;
/* 1463 */                  if (!I0O0l00olII.I00000oOI(oI10i0Il2)) {
/* 1478 */                      oI10i0Il2.setValue(Boolean.valueOf(!O0000Ioio00.I0000O(ol1o1llOII.get(str), str2)));
                            }
/* 1481 */                  ol1o1llOII.put(str, str2);
                            break;
                        case 2:
/* 1432 */                  ((Integer) obj2).getClass();
/* 1439 */                  ((I0iOIl) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 3:
/* 1381 */                  Oil000oIIO oil000oIIO = (Oil000oIIO) this.I00iiO;
/* 1385 */                  I0lo1oIo i0lo1oIo = (I0lo1oIo) this.I00iiI;
/* 1391 */                  int iIntValue2 = ((Integer) obj).intValue();
/* 1397 */                  Oil000 oil000 = (Oil000) obj2;
/* 1407 */                  if (!oil000oIIO.I00000oOI.I0000Il00O(oil000.I0001Ioi1lo)) {
/* 1409 */                      i0lo1oIo.I000O01llI0(iIntValue2, oil000);
/* 1414 */                      i0lo1oIo.I00ioIO.I000lI(ooiIlOl1iI);
                                break;
                            }
                            break;
                        case 4:
/* 1368 */                  ((Integer) obj2).getClass();
/* 1375 */                  i01IoIoO00oO.I0000Il00O((String) this.I00iiO, (Float) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 5:
/* 1341 */                  ((Integer) obj2).getClass();
/* 1348 */                  i01IoIoO00oO.I0000O((Map) this.I00iiO, (IlliIl1l11O) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 6:
/* 1314 */                  ((Integer) obj2).getClass();
/* 1321 */                  i01IoIoO00oO.I00000oIO((O1ol100o0O) this.I00iiO, (I1iOI11ioi1) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 7:
/* 1287 */                  ((Integer) obj2).getClass();
/* 1294 */                  ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 8:
/* 1262 */                  ((Integer) obj2).getClass();
/* 1269 */                  ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 9:
/* 1104 */                  String str3 = (String) this.I00iiO;
/* 1108 */                  IOii1l iOii1l = (IOii1l) this.I00iiI;
/* 1112 */                  IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 1118 */                  int iIntValue3 = ((Integer) obj2).intValue();
/* 1134 */                  if (!iloI0lOlll12.I00OIl(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
/* 1244 */                      iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 1136 */                      boolean zI000II = iloI0lOlll12.I000II(str3);
/* 1140 */                      Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 1144 */                      if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 1150 */                          I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(i2);
/* 1153 */                          i0ioO0Oio0ll.I00iiI = str3;
/* 1155 */                          VarHandle.storeStoreFence();
/* 1158 */                          iloI0lOlll12.I00iio(i0ioO0Oio0ll);
                                    obj4 = i0ioO0Oio0ll;
                                }
/* 1163 */                      O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooIo101ll, false, (Function1) obj4);
/* 1169 */                      O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 1175 */                      int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 1179 */                      OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 1183 */                      O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oOI);
/* 1189 */                      IOl0oi0lOl1.I000lI.getClass();
/* 1192 */                      iloI0lOlll12.I00i0oil();
/* 1197 */                      if (iloI0lOlll12.I00O10llo) {
/* 1199 */                          iloI0lOlll12.I000l1(iloi111);
                                } else {
/* 1203 */                          iloI0lOlll12.I00io1l();
                                }
/* 1208 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 1213 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 1222 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 1225 */                      li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 1230 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 1237 */                      iOii1l.invoke(iloI0lOlll12, 0);
/* 1240 */                      iloI0lOlll12.I0010I0i(true);
                                break;
                            }
                        case 10:
/* 883 */                   List list = (List) this.I00iiO;
/* 887 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 891 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 897 */                   int iIntValue4 = ((Integer) obj2).intValue();
/* 911 */                   if (!iloI0lOlll13.I00OIl(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
/* 1098 */                      iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 919 */                       IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll13, 48);
/* 925 */                       int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 929 */                       OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 933 */                       O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 939 */                       IOl0oi0lOl1.I000lI.getClass();
/* 942 */                       iloI0lOlll13.I00i0oil();
/* 947 */                       if (iloI0lOlll13.I00O10llo) {
/* 949 */                           iloI0lOlll13.I000l1(iloi111);
                                } else {
/* 953 */                           iloI0lOlll13.I00io1l();
                                }
/* 958 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 963 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI2);
/* 972 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode2));
/* 975 */                       li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 980 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 986 */                       String strI00000oOI = lOOoli.I00000oOI(R.string.benchmark_model, iloI0lOlll13);
/* 990 */                       OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1050 */                      Oo0i1oIIoOO.I00000oOI(strI00000oOI, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oOI.I000O01llI0, iloI0lOlll13, 0, 0, 131066);
/* 1060 */                      String str4 = (String) oI10i0Il3.getValue();
/* 1062 */                      Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                Object obj5 = objI00O0i0ii3;
/* 1066 */                      if (objI00O0i0ii3 == iOO0o0I1l) {
/* 1072 */                          I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(21);
/* 1075 */                          i0Il0IoIIOll.I00iiI = oI10i0Il3;
/* 1077 */                          VarHandle.storeStoreFence();
/* 1080 */                          iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                    obj5 = i0Il0IoIIOll;
                                }
/* 1091 */                      iOOoI1iiIl.I00000oIO(str4, list, R.string.select_downloaded_model, (Function1) obj5, iloI0lOlll13, 3072);
/* 1094 */                      iloI0lOlll13.I0010I0i(true);
                                break;
                            }
                        case 11:
/* 869 */                   ((Integer) obj2).getClass();
/* 876 */                   i1IiolOOl.I00000oIO((O1ol100o0O) this.I00iiO, (II10oli) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 12:
/* 842 */                   ((Integer) obj2).getClass();
/* 849 */                   ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 13:
/* 817 */                   ((Integer) obj2).getClass();
/* 824 */                   i1IlIoiI10OI.I00000oIO((O1ol100o0O) this.I00iiO, (II1o0111IO0) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 14:
/* 790 */                   ((Integer) obj2).getClass();
/* 797 */                   ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 15:
/* 715 */                   O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) this.I00iiO;
/* 719 */                   IOii1l iOii1l2 = (IOii1l) this.I00iiI;
/* 723 */                   Oli1oI111 oli1oI111 = (Oli1oI111) obj;
/* 727 */                   IOo0oO11ll1O iOo0oO11ll1O = (IOo0oO11ll1O) obj2;
/* 731 */                   long j = iOo0oO11ll1O.I00000oIO;
/* 733 */                   II1olOOOiIO iI1olOOOiIO = new II1olOOOiIO();
/* 736 */                   iI1olOOOiIO.I00000oIO = oli1oI111;
/* 738 */                   iI1olOOOiIO.I00000oOI = j;
/* 740 */                   VarHandle.storeStoreFence();
/* 747 */                   I0Il0I1o i0Il0I1o = new I0Il0I1o(16);
/* 750 */                   i0Il0I1o.I00iiO = iOii1l2;
/* 752 */                   i0Il0I1o.I00iiI = iI1olOOOiIO;
/* 754 */                   VarHandle.storeStoreFence();
                            break;
                        case 16:
/* 669 */                   IOii1l iOii1l3 = (IOii1l) this.I00iiO;
/* 673 */                   II1olOOOiIO iI1olOOOiIO2 = (II1olOOOiIO) this.I00iiI;
/* 677 */                   IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj;
/* 683 */                   int iIntValue5 = ((Integer) obj2).intValue();
/* 699 */                   if (!iloI0lOlll14.I00OIl(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
/* 709 */                       iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 705 */                       iOii1l3.invoke(iI1olOOOiIO2, iloI0lOlll14, 0);
                                break;
                            }
                        case 17:
/* 577 */                   I10i01 i10i01 = (I10i01) this.I00iiO;
/* 581 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 585 */                   IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj;
/* 591 */                   int iIntValue6 = ((Integer) obj2).intValue();
/* 606 */                   if (!iloI0lOlll15.I00OIl(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
/* 663 */                       iloI0lOlll15.I00OilO00Il();
                                break;
                            } else {
/* 613 */                       String str5 = (String) oI10i0Il4.getValue();
/* 615 */                       boolean zI000OOo1O2 = iloI0lOlll15.I000OOo1O(i10i01);
/* 619 */                       Object objI00O0i0ii4 = iloI0lOlll15.I00O0i0ii();
                                Object obj6 = objI00O0i0ii4;
/* 623 */                       if (zI000OOo1O2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 629 */                           IIIIO0l iIIIO0l = new IIIIO0l(1);
/* 632 */                           iIIIO0l.I00iiI = i10i01;
/* 634 */                           VarHandle.storeStoreFence();
/* 637 */                           iloI0lOlll15.I00iio(iIIIO0l);
                                    obj6 = iIIIO0l;
                                }
/* 657 */                       O1Ol1io1o.I0000oI00(str5, iIlll1lo.I00000oIO(o1ooIo101ll, (Function1) obj6), false, 0L, 0L, iloI0lOlll15, 0, 28);
                                break;
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 442 */                   OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) this.I00iiO;
/* 446 */                   Function3 function3 = (Function3) this.I00iiI;
/* 450 */                   IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj;
/* 456 */                   int iIntValue7 = ((Integer) obj2).intValue();
/* 471 */                   if (!iloI0lOlll16.I00OIl(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
/* 571 */                       iloI0lOlll16.I00OilO00Il();
                                break;
                            } else {
/* 483 */                       O1ooiI111i o1ooiI111iI0000oI00 = iO01II.I0000oI00(Ol0iOOO0.I00000oIO(o1ooIo101ll, IIIi0o0.I0000Il00O, IIIi0o0.I0000Il00O()), oIo1Oi1l1lI);
/* 493 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00, i1O01oOIoI0I.I00lli11, iloI0lOlll16, 54);
/* 499 */                       int iHashCode3 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 503 */                       OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll16.I000lI();
/* 507 */                       O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI0000oI00);
/* 513 */                       IOl0oi0lOl1.I000lI.getClass();
/* 516 */                       iloI0lOlll16.I00i0oil();
/* 521 */                       if (iloI0lOlll16.I00O10llo) {
/* 523 */                           iloI0lOlll16.I000l1(iloi111);
                                } else {
/* 527 */                           iloI0lOlll16.I00io1l();
                                }
/* 532 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll16, oiI1iiIl1Oi0I00000oIO);
/* 537 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll16, oO0lO0l0I000lI3);
/* 546 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll16, Integer.valueOf(iHashCode3));
/* 549 */                       li01Ooiio01.I00000oOI(iloI0lOlll16);
/* 554 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll16, o1ooiI111iI0000Il00O3);
/* 564 */                       function3.invoke(OiI1l0.I00000oIO, iloI0lOlll16, 6);
/* 567 */                       iloI0lOlll16.I0010I0i(true);
                                break;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 406 */                   IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iiO;
/* 411 */                   Context context = (Context) this.I00iiI;
/* 421 */                   IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 425 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 436 */                   iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i((Conversation) obj, (List) obj2, iO1OIo01l1, context, (IOoil1iiIilo) null), 2);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 318 */                   IO1OIo01l1 iO1OIo01l12 = (IO1OIo01l1) this.I00iiO;
/* 322 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 326 */                   IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj;
/* 332 */                   int iIntValue8 = ((Integer) obj2).intValue();
/* 348 */                   if (!iloI0lOlll17.I00OIl(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
/* 399 */                       iloI0lOlll17.I00OilO00Il();
                                break;
                            } else {
/* 350 */                       boolean zI000OOo1O3 = iloI0lOlll17.I000OOo1O(iO1OIo01l12);
/* 354 */                       Object objI00O0i0ii5 = iloI0lOlll17.I00O0i0ii();
                                Object obj7 = objI00O0i0ii5;
/* 358 */                       if (zI000OOo1O3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 364 */                           IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(false ? 1 : 0);
/* 367 */                           iO1Io1IOOOIi.I00iiI = iO1OIo01l12;
/* 369 */                           iO1Io1IOOOIi.I00iiO = oI10i0Il5;
/* 371 */                           VarHandle.storeStoreFence();
/* 374 */                           iloI0lOlll17.I00iio(iO1Io1IOOOIi);
                                    obj7 = iO1Io1IOOOIi;
                                }
/* 393 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj7, null, false, null, null, null, i1OiooO.I000O01llI0, iloI0lOlll17, 805306368, 510);
                                break;
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 305 */                   ((Integer) obj2).getClass();
/* 312 */                   ((IOoiI000) this.I00iiO).I00000oIO((IOoi1llO0Oo) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 207 */                   Olol1IOOol0 olol1IOOol0 = (Olol1IOOol0) this.I00iiO;
/* 211 */                   Oloo01 oloo01 = (Oloo01) this.I00iiI;
/* 215 */                   IloI0lOlll1 iloI0lOlll18 = (IloI0lOlll1) obj;
/* 221 */                   int iIntValue9 = ((Integer) obj2).intValue();
/* 237 */                   if (!iloI0lOlll18.I00OIl(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
/* 285 */                       iloI0lOlll18.I00OilO00Il();
                                break;
                            } else {
/* 239 */                       boolean zI000II2 = iloI0lOlll18.I000II(olol1IOOol0);
/* 243 */                       Object objI00O0i0ii6 = iloI0lOlll18.I00O0i0ii();
/* 247 */                       if (zI000II2 || objI00O0i0ii6 == iOO0o0I1l) {
/* 266 */                           objI00O0i0ii6 = Ol1llolil.I00000oOI(new I0lii0I00(0, olol1IOOol0, Olol1IOOol0.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 3));
/* 270 */                           iloI0lOlll18.I00iio(objI00O0i0ii6);
                                }
/* 281 */                       IiII11OIl.I00000oIO(oloo01, (Olol0I1o1IO) ((OlO01l1oOil) objI00O0i0ii6).getValue(), iloI0lOlll18, 0);
                                break;
                            }
                        case PoseLandmark.LEFT_HIP:
/* 193 */                   ((Integer) obj2).getClass();
/* 200 */                   IiII11OIl.I00000oIO((Oloo01) this.I00iiO, (Olol0I1o1IO) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 166 */                   ((Integer) obj2).getClass();
/* 173 */                   il1OO11i1O1.I00000oOI((List) this.I00iiO, (Collection) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 139 */                   ((Integer) obj2).getClass();
/* 146 */                   iIO1ioiI.I000OiO((IlI10IO) this.I00iiO, (IllOOo00lI) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 112 */                   ((Integer) obj2).getClass();
/* 119 */                   iIO1ioiI.I0000oI00((O1ol100o0O) this.I00iiO, (IlI1loI1lO1) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 27:
/* 85 */                    ((Integer) obj2).getClass();
/* 92 */                    ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 60 */                    ((Integer) obj2).getClass();
/* 67 */                    iIlilIl011l.I00000oIO((O1ol100o0O) this.I00iiO, (Ili0IOilll10) this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        default:
/* 33 */                    ((Integer) obj2).getClass();
/* 40 */                    ((I1iO1OOoOiOO) this.I00iiO).I00000oIO(this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                    }
/* 43 */            return ooiIlOl1iI;
                }
            }
