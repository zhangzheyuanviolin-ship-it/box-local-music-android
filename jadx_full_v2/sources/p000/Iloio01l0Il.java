            package p000;

            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
            public final class Iloio01l0Il implements IlliOIilI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public Iloio01l0Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v29 */
                /* JADX WARN: Type inference failed for: r5v30 */
                /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    Iloio01l0Il iloio01l0Il;
                    Object obj5;
                    boolean z;
                    OI1OloOIO1O oI1OloOIO1OPrevious;
/* 3 */             int i5 = this.I00iOIl;
/* 12 */            IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 17 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 19 */            int i6 = 4;
                    switch (i5) {
                        case 0:
/* 1569 */                  O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 1575 */                  int iIntValue = ((Number) obj2).intValue();
/* 1581 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 1587 */                  int iIntValue2 = ((Number) obj4).intValue();
/* 1593 */                  Function1 function1 = (Function1) this.I00iiO;
/* 1597 */                  if ((iIntValue2 & 6) == 0) {
/* 1606 */                      i = iIntValue2 | (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2);
                            } else {
/* 1609 */                      i = iIntValue2;
                            }
/* 1611 */                  if ((iIntValue2 & 48) == 0) {
/* 1624 */                      i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                            }
/* 1641 */                  if (!iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 1782 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 1651 */                      Conversation conversation = (Conversation) ((List) this.I00iiI).get(iIntValue);
/* 1656 */                      iloI0lOlll1.I00i01iIIliI(87707216);
/* 1663 */                      O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f);
/* 1679 */                      IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IO1oi11O, iloI0lOlll1);
/* 1683 */                      OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(12.0f);
/* 1695 */                      boolean zI000II = iloI0lOlll1.I000II(function1) | iloI0lOlll1.I000II(conversation);
/* 1696 */                      Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj6 = objI00O0i0ii;
/* 1700 */                      if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 1707 */                          Iloil1010lo0 iloil1010lo0 = new Iloil1010lo0(0);
/* 1710 */                          iloil1010lo0.I00iiI = function1;
/* 1712 */                          iloil1010lo0.I00iiO = conversation;
/* 1714 */                          VarHandle.storeStoreFence();
/* 1717 */                          iloI0lOlll1.I00iio(iloil1010lo0);
                                    obj6 = iloil1010lo0;
                                }
/* 1722 */                      IllOOo00lI illOOo00lI = (IllOOo00lI) obj6;
/* 1728 */                      Function1 function12 = (Function1) this.I00iio;
/* 1732 */                      OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 1736 */                      OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilO0;
/* 1739 */                      IloilI011lI iloilI011lI = new IloilI011lI(0);
/* 1742 */                      iloilI011lI.I00iiO = conversation;
/* 1744 */                      iloilI011lI.I00iiI = function12;
/* 1746 */                      iloilI011lI.I00iio = oI10i0Il;
/* 1748 */                      iloilI011lI.I00ilI0I1 = oI10i0Il2;
/* 1750 */                      VarHandle.storeStoreFence();
/* 1771 */                      iOl111l1l.I00000oIO(illOOo00lI, o1ooiI111iI0000oI00, false, oiI111II00000oOI, iO0i0iI00000oIO, null, iiioOl1O.I00000oOI(1149854582, iloilI011lI, iloI0lOlll1), iloI0lOlll1, 100663344, 228);
/* 1777 */                      iloI0lOlll1.I0010I0i(false);
                                break;
                            }
                        case 1:
/* 1365 */                  O0l11l1iOO o0l11l1iOO2 = (O0l11l1iOO) obj;
/* 1371 */                  int iIntValue3 = ((Number) obj2).intValue();
/* 1377 */                  IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj3;
/* 1383 */                  int iIntValue4 = ((Number) obj4).intValue();
/* 1389 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00ilI0I1;
/* 1393 */                  if ((iIntValue4 & 6) == 0) {
/* 1402 */                      i2 = iIntValue4 | (iloI0lOlll12.I000II(o0l11l1iOO2) ? 4 : 2);
                            } else {
/* 1405 */                      i2 = iIntValue4;
                            }
/* 1407 */                  if ((iIntValue4 & 48) == 0) {
/* 1420 */                      i2 |= iloI0lOlll12.I0000oI00(iIntValue3) ? 32 : 16;
                            }
/* 1438 */                  if (!iloI0lOlll12.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 1559 */                      iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 1448 */                      O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) ((List) this.I00iiI).get(iIntValue3);
/* 1453 */                      iloI0lOlll12.I00i01iIIliI(1605937947);
/* 1466 */                      Boolean bool = (Boolean) ol1o1llOII.getOrDefault(o1oIOiI11o0.I00000oIO, Boolean.TRUE);
/* 1468 */                      bool.getClass();
/* 1475 */                      O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00ilO0;
/* 1481 */                      Function1 function13 = (Function1) this.I00iiO;
/* 1487 */                      Function1 function14 = (Function1) this.I00iio;
/* 1498 */                      boolean z2 = o1oIOiI11o0.I00100l0 == RuntimeType.LITERT_LM;
/* 1500 */                      boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(o1oIOiI11o0);
/* 1504 */                      Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj7 = objI00O0i0ii2;
/* 1508 */                      if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 1515 */                          Io0Il1O00OI io0Il1O00OI = new Io0Il1O00OI(0);
/* 1518 */                          io0Il1O00OI.I00iiI = ol1o1llOII;
/* 1520 */                          io0Il1O00OI.I00iiO = o1oIOiI11o0;
/* 1522 */                          VarHandle.storeStoreFence();
/* 1525 */                          iloI0lOlll12.I00iio(io0Il1O00OI);
                                    obj7 = io0Il1O00OI;
                                }
/* 1548 */                      l1OoO11il1Ii.I00000oIO(o1oIOiI11o0, null, o1ol100o0O, function13, function14, null, bool, false, false, z2, (Function1) obj7, iloI0lOlll12, 48, 416);
/* 1554 */                      iloI0lOlll12.I0010I0i(false);
                                break;
                            }
                        case 2:
/* 1129 */                  O0l11l1iOO o0l11l1iOO3 = (O0l11l1iOO) obj;
/* 1135 */                  int iIntValue5 = ((Number) obj2).intValue();
/* 1141 */                  IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj3;
/* 1147 */                  int iIntValue6 = ((Number) obj4).intValue();
/* 1153 */                  O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 1157 */                  if ((iIntValue6 & 6) == 0) {
/* 1166 */                      i3 = iIntValue6 | (iloI0lOlll13.I000II(o0l11l1iOO3) ? 4 : 2);
                            } else {
/* 1169 */                      i3 = iIntValue6;
                            }
/* 1171 */                  if ((iIntValue6 & 48) == 0) {
/* 1184 */                      i3 |= iloI0lOlll13.I0000oI00(iIntValue5) ? 32 : 16;
                            }
/* 1202 */                  if (!iloI0lOlll13.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 1355 */                      iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 1212 */                      O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) ((List) this.I00iiI).get(iIntValue5);
/* 1217 */                      iloI0lOlll13.I00i01iIIliI(-1113820326);
/* 1228 */                      boolean zI000OOo1O2 = iloI0lOlll13.I000OOo1O(o1i1O1I) | iloI0lOlll13.I000OOo1O(o1i1Ooo0ll);
/* 1229 */                      Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                Object obj8 = objI00O0i0ii3;
/* 1233 */                      if (zI000OOo1O2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 1241 */                          I01i01OoI i01i01OoI = new I01i01OoI(19);
/* 1244 */                          i01i01OoI.I00iiI = o1i1O1I;
/* 1246 */                          i01i01OoI.I00iiO = o1i1Ooo0ll;
/* 1248 */                          VarHandle.storeStoreFence();
/* 1251 */                          iloI0lOlll13.I00iio(i01i01OoI);
                                    obj8 = i01i01OoI;
                                }
/* 1256 */                      Function1 function15 = (Function1) obj8;
/* 1258 */                      boolean zI000OOo1O3 = iloI0lOlll13.I000OOo1O(o1i1Ooo0ll);
/* 1262 */                      Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                Object obj9 = objI00O0i0ii4;
/* 1266 */                      if (zI000OOo1O3 || objI00O0i0ii4 == iOO0o0I1l) {
/* 1274 */                          OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 1278 */                          I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(23);
/* 1281 */                          i01illiil1Oo.I00iiO = o1i1Ooo0ll;
/* 1283 */                          i01illiil1Oo.I00iiI = oI10i0Il3;
/* 1285 */                          VarHandle.storeStoreFence();
/* 1288 */                          iloI0lOlll13.I00iio(i01illiil1Oo);
                                    obj9 = i01illiil1Oo;
                                }
/* 1293 */                      IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj9;
/* 1295 */                      boolean zI000OOo1O4 = iloI0lOlll13.I000OOo1O(o1i1Ooo0ll);
/* 1299 */                      Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                                Object obj10 = objI00O0i0ii5;
/* 1303 */                      if (zI000OOo1O4 || objI00O0i0ii5 == iOO0o0I1l) {
/* 1311 */                          OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilO0;
/* 1315 */                          OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iio;
/* 1319 */                          II01oIlIII iI01oIlIII = new II01oIlIII(8);
/* 1322 */                          iI01oIlIII.I00iiO = o1i1Ooo0ll;
/* 1324 */                          iI01oIlIII.I00iiI = oI10i0Il4;
/* 1326 */                          iI01oIlIII.I00iio = oI10i0Il5;
/* 1328 */                          VarHandle.storeStoreFence();
/* 1331 */                          iloI0lOlll13.I00iio(iI01oIlIII);
                                    obj10 = iI01oIlIII;
                                }
/* 1344 */                      iIoiiil.I0000Il00O(o1i1Ooo0ll, function15, illOOo00lI2, (IllOOo00lI) obj10, iloI0lOlll13, 0);
/* 1350 */                      iloI0lOlll13.I0010I0i(false);
                                break;
                            }
                        case 3:
/* 172 */                   O0l11l1iOO o0l11l1iOO4 = (O0l11l1iOO) obj;
/* 178 */                   int iIntValue7 = ((Number) obj2).intValue();
/* 184 */                   IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj3;
/* 190 */                   int iIntValue8 = ((Number) obj4).intValue();
/* 196 */                   O1i1OolO o1i1OolO = (O1i1OolO) this.I00iio;
/* 200 */                   O1i1O1I o1i1O1I2 = (O1i1O1I) this.I00iiO;
/* 204 */                   if ((iIntValue8 & 6) == 0) {
/* 213 */                       i4 = iIntValue8 | (iloI0lOlll14.I000II(o0l11l1iOO4) ? 4 : 2);
                            } else {
/* 216 */                       i4 = iIntValue8;
                            }
/* 220 */                   if ((iIntValue8 & 48) == 0) {
/* 233 */                       i4 |= iloI0lOlll14.I0000oI00(iIntValue7) ? 32 : 16;
                            }
/* 247 */                   if (!iloI0lOlll14.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 1119 */                      iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 257 */                       O1iI0OiI o1iI0OiI = (O1iI0OiI) ((Iool1IOO1o0i) this.I00iiI).get(iIntValue7);
/* 262 */                       iloI0lOlll14.I00i01iIIliI(-1565873795);
/* 265 */                       O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 277 */                       O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), OiI11O1i1.I00000oOI(20.0f));
/* 281 */                       OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 305 */                       O1ooiI111i o1ooiI111iI000II = iO01II.I000II(i0I1I0.I00000oOI(o1ooiI111iI00000oIO, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I00IlilI0i0i, iO0ioilo.I00000oIO), 16.0f, 12.0f);
/* 309 */                       II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 311 */                       I1IiOI0 i1IiOI0 = I1IiooiI1IlO.I00000oIO;
/* 313 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll14, 48);
/* 319 */                       int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 323 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 327 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI000II);
/* 333 */                       IOl0oi0lOl1.I000lI.getClass();
/* 336 */                       iloI0lOlll14.I00i0oil();
/* 339 */                       boolean z3 = iloI0lOlll14.I00O10llo;
/* 341 */                       Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 343 */                       if (z3) {
/* 345 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 349 */                           iloI0lOlll14.I00io1l();
                                }
/* 352 */                       IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 354 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO);
/* 357 */                       IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 359 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI);
/* 362 */                       Integer numValueOf = Integer.valueOf(iHashCode);
/* 366 */                       IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 368 */                       li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll14, numValueOf);
/* 371 */                       li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 374 */                       IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 376 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 392 */                       if (1.0f <= 0.0d) {
/* 395 */                           IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                }
/* 416 */                       O0io1O o0io1O = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 419 */                       II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 424 */                       IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, iI0IlloOiO0i, iloI0lOlll14, 0);
/* 433 */                       int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 437 */                       OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 441 */                       O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o0io1O);
/* 445 */                       iloI0lOlll14.I00i0oil();
/* 452 */                       if (iloI0lOlll14.I00O10llo) {
/* 454 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 458 */                           iloI0lOlll14.I00io1l();
                                }
/* 461 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO);
/* 464 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI2);
/* 467 */                       IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 470 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O2);
/* 473 */                       II0O000iIl iI0O000iIl2 = i1O01oOIoI0I.I00ll1;
/* 477 */                       O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 485 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, iI0O000iIl2, iloI0lOlll14, 54);
/* 491 */                       int iHashCode3 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 495 */                       OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll14.I000lI();
/* 499 */                       O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI002);
/* 503 */                       iloI0lOlll14.I00i0oil();
/* 508 */                       if (iloI0lOlll14.I00O10llo) {
/* 510 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 514 */                           iloI0lOlll14.I00io1l();
                                }
/* 517 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO2);
/* 520 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI3);
/* 523 */                       IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 526 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O3);
/* 534 */                       if (1.0f <= 0.0d) {
/* 537 */                           IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                }
/* 570 */                       O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
/* 583 */                       IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(4.0f), iI0IlloOiO0i, iloI0lOlll14, 6);
/* 589 */                       int iHashCode4 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 593 */                       OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll14.I000lI();
/* 597 */                       O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI000OiO);
/* 601 */                       iloI0lOlll14.I00i0oil();
/* 606 */                       if (iloI0lOlll14.I00O10llo) {
/* 608 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 612 */                           iloI0lOlll14.I00io1l();
                                }
/* 615 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, iOOlo1O01OI00000oIO2);
/* 618 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI4);
/* 621 */                       IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 624 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O4);
/* 698 */                       Oo0i1oIIoOO.I00000oOI(o1iI0OiI.I001IO000(), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oOI.I000iOII, 0L, 0L, IlilIIiIiO.I00l0I0l0lO1, null, 0L, 0L, null, 16777211), iloI0lOlll14, 0, 0, 131070);
/* 711 */                       if (o1iI0OiI.I0010o().length() > 0) {
/* 716 */                           iloI0lOlll14.I00i01iIIliI(-417614354);
/* 784 */                           Oo0i1oIIoOO.I00000oOI(o1iI0OiI.I0010o(), null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll14, 0, 24960, 110586);
/* 788 */                           iloI0lOlll14.I0010I0i(false);
                                } else {
/* 797 */                           iloI0lOlll14.I00i01iIIliI(-417300448);
/* 800 */                           iloI0lOlll14.I0010I0i(false);
                                }
/* 804 */                       iloI0lOlll14.I0010I0i(true);
/* 807 */                       boolean zI00111O = o1iI0OiI.I00111O();
/* 824 */                       boolean zI000OOo1O5 = iloI0lOlll14.I000OOo1O(o1i1O1I2) | iloI0lOlll14.I000II(o1i1OolO) | iloI0lOlll14.I000II(o1iI0OiI);
/* 825 */                       Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
                                Object obj11 = objI00O0i0ii6;
/* 831 */                       if (zI000OOo1O5 || objI00O0i0ii6 == iOO0o0I1l) {
/* 838 */                           I1ooIoloo0 i1ooIoloo0 = new I1ooIoloo0(4);
/* 841 */                           i1ooIoloo0.I00iiI = o1i1O1I2;
/* 843 */                           i1ooIoloo0.I00iiO = o1i1OolO;
/* 845 */                           i1ooIoloo0.I00iio = o1iI0OiI;
/* 847 */                           VarHandle.storeStoreFence();
/* 850 */                           iloI0lOlll14.I00iio(i1ooIoloo0);
                                    obj11 = i1ooIoloo0;
                                }
/* 875 */                       OllI1oooIo1o.I00000oIO(zI00111O, (Function1) obj11, iO0100loIol.I0000Il00O(o1ooIo101ll, 0.0f, -4.0f, 1), false, null, iloI0lOlll14, 384, 120);
/* 878 */                       iloI0lOlll14.I0010I0i(true);
/* 893 */                       O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(o1ooIo101ll, 0.0f, 8.0f, 0.0f, 0.0f, 13);
/* 907 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO3 = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll14, 54);
/* 913 */                       int iHashCode5 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 917 */                       OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll14.I000lI();
/* 921 */                       O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI000OiO2);
/* 925 */                       iloI0lOlll14.I00i0oil();
/* 930 */                       if (iloI0lOlll14.I00O10llo) {
/* 932 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 936 */                           iloI0lOlll14.I00io1l();
                                }
/* 939 */                       li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO3);
/* 942 */                       li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI5);
/* 945 */                       IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 948 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O5);
/* 951 */                       boolean zI000II2 = iloI0lOlll14.I000II(o1iI0OiI);
/* 955 */                       Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
/* 959 */                       if (zI000II2 || objI00O0i0ii7 == iOO0o0I1l) {
/* 969 */                           iloio01l0Il = this;
/* 973 */                           OI10i0Il oI10i0Il6 = (OI10i0Il) iloio01l0Il.I00ilI0I1;
/* 976 */                           O1iIiOo o1iIiOo = new O1iIiOo(0);
/* 979 */                           o1iIiOo.I00iiI = o1iI0OiI;
/* 981 */                           o1iIiOo.I00iiO = oI10i0Il6;
/* 983 */                           VarHandle.storeStoreFence();
/* 986 */                           iloI0lOlll14.I00iio(o1iIiOo);
                                    obj5 = o1iIiOo;
                                } else {
/* 964 */                           iloio01l0Il = this;
                                    obj5 = objI00O0i0ii7;
                                }
/* 1011 */                      Ol11ooI.I00000oIO((IllOOo00lI) obj5, R.string.view, lIoIo0oIlo.I00000oIO(), 0.0f, null, false, iloI0lOlll14, 0, 120);
/* 1018 */                      if (o1iI0OiI.I0010I0i()) {
/* 1023 */                          iloI0lOlll14.I00i01iIIliI(2124762810);
/* 1030 */                          lOO1OIO00.I00000oIO(iloI0lOlll14, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 1033 */                          boolean zI000II3 = iloI0lOlll14.I000II(o1iI0OiI);
/* 1037 */                          Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
                                    Object obj12 = objI00O0i0ii8;
/* 1041 */                          if (zI000II3 || objI00O0i0ii8 == iOO0o0I1l) {
/* 1049 */                              OI10i0Il oI10i0Il7 = (OI10i0Il) iloio01l0Il.I00ilO0;
/* 1052 */                              O1iIiOo o1iIiOo2 = new O1iIiOo(1);
/* 1055 */                              o1iIiOo2.I00iiI = o1iI0OiI;
/* 1057 */                              o1iIiOo2.I00iiO = oI10i0Il7;
/* 1059 */                              VarHandle.storeStoreFence();
/* 1062 */                              iloI0lOlll14.I00iio(o1iIiOo2);
                                        obj12 = o1iIiOo2;
                                    }
/* 1083 */                          Ol1Ii0I.I00000oIO((IllOOo00lI) obj12, R.string.mcp_tool_revoke_permission, null, 0.0f, false, iloI0lOlll14, 0, 124);
/* 1086 */                          z = false;
/* 1087 */                          iloI0lOlll14.I0010I0i(false);
                                } else {
/* 1092 */                          z = false;
/* 1096 */                          iloI0lOlll14.I00i01iIIliI(2125013631);
/* 1099 */                          iloI0lOlll14.I0010I0i(false);
                                }
/* 1103 */                      iloI0lOlll14.I0010I0i(true);
/* 1106 */                      iloI0lOlll14.I0010I0i(true);
/* 1109 */                      iloI0lOlll14.I0010I0i(true);
/* 1112 */                      iloI0lOlll14.I0010I0i(z);
                                break;
                            }
                        default:
/* 26 */                    I10l11ioI i10l11ioI = (I10l11ioI) obj;
/* 30 */                    OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) obj2;
/* 34 */                    IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj3;
/* 40 */                    ((Number) obj4).intValue();
/* 57 */                    boolean zI0000O = O0000Ioio00.I0000O(((Oii110oOoO) this.I00iiI).I00iiO.getValue(), (OI1OloOIO1O) this.I00iiO);
/* 75 */                    if (!((Boolean) ((OI10i0Il) this.I00ilI0I1).getValue()).booleanValue() && !zI0000O) {
/* 88 */                        List list = (List) ((OlO01l1oOil) this.I00ilO0).getValue();
/* 94 */                        ListIterator listIterator = list.listIterator(list.size());
                                while (true) {
/* 102 */                           if (listIterator.hasPrevious()) {
/* 104 */                               oI1OloOIO1OPrevious = listIterator.previous();
/* 115 */                               if (O0000Ioio00.I0000O(oI1OloOIO1O, (OI1OloOIO1O) oI1OloOIO1OPrevious)) {
                                        }
                                    } else {
/* 118 */                               oI1OloOIO1OPrevious = 0;
                                    }
                                }
/* 120 */                       oI1OloOIO1O = oI1OloOIO1OPrevious;
                            }
/* 122 */                   if (oI1OloOIO1O == null) {
/* 127 */                       iloI0lOlll15.I00i01iIIliI(105930796);
                            } else {
/* 137 */                       iloI0lOlll15.I00i01iIIliI(-1520603531);
/* 142 */                       OiIii0 oiIii0 = (OiIii0) this.I00iio;
/* 146 */                       II01l1Oii iI01l1Oii = new II01l1Oii(i6);
/* 149 */                       iI01l1Oii.I00iiI = oI1OloOIO1O;
/* 151 */                       iI01l1Oii.I00iiO = i10l11ioI;
/* 153 */                       VarHandle.storeStoreFence();
/* 165 */                       l1iIi10.I00000oIO(oI1OloOIO1O, oiIii0, iiioOl1O.I00000oOI(-1263531443, iI01l1Oii, iloI0lOlll15), iloI0lOlll15, 384);
                            }
/* 130 */                   iloI0lOlll15.I0010I0i(false);
                            break;
                    }
/* 169 */           return ooiIlOl1iI;
                }
            }
