            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Io0IlIIo0 implements IlliOIilI {
                public final int I00iOIl;
                public List I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public Io0IlIIo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 3 */             int i5 = this.I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i5) {
                        case 0:
/* 822 */                   O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 828 */                   int iIntValue = ((Number) obj2).intValue();
/* 834 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 840 */                   int iIntValue2 = ((Number) obj4).intValue();
/* 846 */                   if ((iIntValue2 & 6) == 0) {
/* 855 */                       i = iIntValue2 | (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2);
                            } else {
/* 858 */                       i = iIntValue2;
                            }
/* 861 */                   if ((iIntValue2 & 48) == 0) {
/* 874 */                       i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                            }
/* 888 */                   if (!iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 964 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 896 */                       O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiI.get(iIntValue);
/* 901 */                       iloI0lOlll1.I00i01iIIliI(877064347);
/* 954 */                       l1OoO11il1Ii.I00000oIO(o1oIOiI11o0, null, (O1ol100o0O) this.I00iiO, (Function1) this.I00iio, (Function1) this.I00ilI0I1, null, Boolean.TRUE, false, false, o1oIOiI11o0.I00100l0 == RuntimeType.LITERT_LM, null, iloI0lOlll1, 1572912, 1440);
/* 959 */                       iloI0lOlll1.I0010I0i(false);
                                break;
                            }
                        case 1:
/* 646 */                   O0l11l1iOO o0l11l1iOO2 = (O0l11l1iOO) obj;
/* 652 */                   int iIntValue3 = ((Number) obj2).intValue();
/* 658 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj3;
/* 664 */                   int iIntValue4 = ((Number) obj4).intValue();
/* 670 */                   OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiO;
/* 674 */                   if ((iIntValue4 & 6) == 0) {
/* 683 */                       i2 = iIntValue4 | (iloI0lOlll12.I000II(o0l11l1iOO2) ? 4 : 2);
                            } else {
/* 686 */                       i2 = iIntValue4;
                            }
/* 689 */                   if ((iIntValue4 & 48) == 0) {
/* 702 */                       i2 |= iloI0lOlll12.I0000oI00(iIntValue3) ? 32 : 16;
                            }
/* 716 */                   if (!iloI0lOlll12.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 816 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 724 */                       OOio1iliiii oOio1iliiii = (OOio1iliiii) this.I00iiI.get(iIntValue3);
/* 729 */                       iloI0lOlll12.I00i01iIIliI(1575984452);
/* 740 */                       boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(oOl1OlI0) | iloI0lOlll12.I000II(oOio1iliiii);
/* 741 */                       Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
                                Object obj5 = objI00O0i0ii;
/* 745 */                       if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 753 */                           I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(25);
/* 756 */                           i01illiil1Oo.I00iiO = oOl1OlI0;
/* 758 */                           i01illiil1Oo.I00iiI = oOio1iliiii;
/* 760 */                           VarHandle.storeStoreFence();
/* 763 */                           iloI0lOlll12.I00iio(i01illiil1Oo);
                                    obj5 = i01illiil1Oo;
                                }
/* 766 */                       IllOOo00lI illOOo00lI = (IllOOo00lI) obj5;
/* 768 */                       boolean zI000II = iloI0lOlll12.I000II(oOio1iliiii);
/* 772 */                       Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj6 = objI00O0i0ii2;
/* 776 */                       if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 784 */                           OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 788 */                           OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 792 */                           II01oIlIII iI01oIlIII = new II01oIlIII(9);
/* 795 */                           iI01oIlIII.I00iiO = oOio1iliiii;
/* 797 */                           iI01oIlIII.I00iiI = oI10i0Il;
/* 799 */                           iI01oIlIII.I00iio = oI10i0Il2;
/* 801 */                           VarHandle.storeStoreFence();
/* 804 */                           iloI0lOlll12.I00iio(iI01oIlIII);
                                    obj6 = iI01oIlIII;
                                }
/* 809 */                       iO0iil1loOI0.I00000oIO(oOio1iliiii, illOOo00lI, (IllOOo00lI) obj6, iloI0lOlll12, 0);
/* 812 */                       iloI0lOlll12.I0010I0i(false);
                                break;
                            }
                        case 2:
/* 208 */                   O0l11l1iOO o0l11l1iOO3 = (O0l11l1iOO) obj;
/* 214 */                   int iIntValue5 = ((Number) obj2).intValue();
/* 220 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj3;
/* 226 */                   int iIntValue6 = ((Number) obj4).intValue();
/* 232 */                   Function1 function1 = (Function1) this.I00ilI0I1;
/* 236 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 240 */                   Function1 function12 = (Function1) this.I00iio;
/* 244 */                   if ((iIntValue6 & 6) == 0) {
/* 253 */                       i3 = iIntValue6 | (iloI0lOlll13.I000II(o0l11l1iOO3) ? 4 : 2);
                            } else {
/* 256 */                       i3 = iIntValue6;
                            }
/* 259 */                   if ((iIntValue6 & 48) == 0) {
/* 272 */                       i3 |= iloI0lOlll13.I0000oI00(iIntValue5) ? 32 : 16;
                            }
/* 286 */                   if (!iloI0lOlll13.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 640 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 294 */                       String str = (String) this.I00iiI.get(iIntValue5);
/* 299 */                       iloI0lOlll13.I00i01iIIliI(-655650115);
/* 302 */                       O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 342 */                       O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(iO01II.I000II(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 8.0f, 2.0f), OiI11O1i1.I00000oOI(24.0f)), ((Ii0iOlI) iloI0lOlll13.I000iOII(Oo0oi1olI.I00000oOI)).I000OiO, iO0ioilo.I00000oIO);
/* 354 */                       boolean zI000II2 = iloI0lOlll13.I000II(function12) | iloI0lOlll13.I000II(str);
/* 355 */                       Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                Object obj7 = objI00O0i0ii3;
/* 359 */                       if (zI000II2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 367 */                           I01illiil1Oo i01illiil1Oo2 = new I01illiil1Oo(26);
/* 370 */                           i01illiil1Oo2.I00iiO = function12;
/* 372 */                           i01illiil1Oo2.I00iiI = str;
/* 374 */                           VarHandle.storeStoreFence();
/* 377 */                           iloI0lOlll13.I00iio(i01illiil1Oo2);
                                    obj7 = i01illiil1Oo2;
                                }
/* 385 */                       O1ooiI111i o1ooiI111iI00000oOI2 = i1Ioo1o0.I00000oOI(o1ooiI111iI00000oOI, false, null, (IllOOo00lI) obj7, 15);
/* 397 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll13, 54);
/* 403 */                       int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 407 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 411 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI2);
/* 417 */                       IOl0oi0lOl1.I000lI.getClass();
/* 420 */                       iloI0lOlll13.I00i0oil();
/* 425 */                       if (iloI0lOlll13.I00O10llo) {
/* 429 */                           iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 433 */                           iloI0lOlll13.I00io1l();
                                }
/* 438 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 443 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 452 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 455 */                       li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 460 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 546 */                       Oo0i1oIIoOO.I00000oOI(str, iO01II.I000OiO(iO01II.I000O01llI0(o1ooIo101ll, 0.0f, 16.0f, 1), 16.0f, 0.0f, 0.0f, 0.0f, 14).I0000O(new O0io1O(1.0f, true)), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000iOII, iloI0lOlll13, 0, 24960, 110588);
/* 565 */                       O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll, 0.0f, 0.0f, 8.0f, 0.0f, 11);
/* 582 */                       boolean zI000OOo1O2 = iloI0lOlll13.I000OOo1O(ii0110) | iloI0lOlll13.I000II(function1) | iloI0lOlll13.I000II(str);
/* 583 */                       Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                Object obj8 = objI00O0i0ii4;
/* 587 */                       if (zI000OOo1O2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 595 */                           II01oIlIII iI01oIlIII2 = new II01oIlIII(11);
/* 598 */                           iI01oIlIII2.I00iiO = ii0110;
/* 600 */                           iI01oIlIII2.I00iiI = function1;
/* 602 */                           iI01oIlIII2.I00iio = str;
/* 604 */                           VarHandle.storeStoreFence();
/* 607 */                           iloI0lOlll13.I00iio(iI01oIlIII2);
                                    obj8 = iI01oIlIII2;
                                }
/* 629 */                       iIo1101O.I00000oIO((IllOOo00lI) obj8, o1ooiI111iI000OiO, false, null, null, iIIO1o00ioIO.I00000oOI, iloI0lOlll13, 1572912, 60);
/* 632 */                       iloI0lOlll13.I0010I0i(true);
/* 635 */                       iloI0lOlll13.I0010I0i(false);
                                break;
                            }
                        default:
/* 22 */                    O0l11l1iOO o0l11l1iOO4 = (O0l11l1iOO) obj;
/* 28 */                    int iIntValue7 = ((Number) obj2).intValue();
/* 34 */                    IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj3;
/* 40 */                    int iIntValue8 = ((Number) obj4).intValue();
/* 46 */                    Context context = (Context) this.I00ilI0I1;
/* 50 */                    IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) this.I00iio;
/* 54 */                    OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iiO;
/* 58 */                    if ((iIntValue8 & 6) == 0) {
/* 67 */                        i4 = iIntValue8 | (iloI0lOlll14.I000II(o0l11l1iOO4) ? 4 : 2);
                            } else {
/* 70 */                        i4 = iIntValue8;
                            }
/* 73 */                    if ((iIntValue8 & 48) == 0) {
/* 86 */                        i4 |= iloI0lOlll14.I0000oI00(iIntValue7) ? 32 : 16;
                            }
/* 100 */                   if (!iloI0lOlll14.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 202 */                       iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 108 */                       OoIIliIIII0 ooIIliIIII0 = (OoIIliIIII0) this.I00iiI.get(iIntValue7);
/* 113 */                       iloI0lOlll14.I00i01iIIliI(1428670056);
/* 124 */                       boolean zI000OOo1O3 = iloI0lOlll14.I000OOo1O(ooIO11oiiiil) | iloI0lOlll14.I000II(ooIIliIIII0);
/* 125 */                       Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                                Object obj9 = objI00O0i0ii5;
/* 129 */                       if (zI000OOo1O3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 137 */                           I01illiil1Oo i01illiil1Oo3 = new I01illiil1Oo(27);
/* 140 */                           i01illiil1Oo3.I00iiO = ooIO11oiiiil;
/* 142 */                           i01illiil1Oo3.I00iiI = ooIIliIIII0;
/* 144 */                           VarHandle.storeStoreFence();
/* 147 */                           iloI0lOlll14.I00iio(i01illiil1Oo3);
                                    obj9 = i01illiil1Oo3;
                                }
/* 150 */                       IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj9;
/* 165 */                       boolean zI000OOo1O4 = iloI0lOlll14.I000OOo1O(iOO0i0o1O0l) | iloI0lOlll14.I000II(ooIIliIIII0) | iloI0lOlll14.I000OOo1O(context);
/* 166 */                       Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
                                Object obj10 = objI00O0i0ii6;
/* 170 */                       if (zI000OOo1O4 || objI00O0i0ii6 == iOO0o0I1l) {
/* 178 */                           II01oIlIII iI01oIlIII3 = new II01oIlIII(12);
/* 181 */                           iI01oIlIII3.I00iiO = iOO0i0o1O0l;
/* 183 */                           iI01oIlIII3.I00iiI = ooIIliIIII0;
/* 185 */                           iI01oIlIII3.I00iio = context;
/* 187 */                           VarHandle.storeStoreFence();
/* 190 */                           iloI0lOlll14.I00iio(iI01oIlIII3);
                                    obj10 = iI01oIlIII3;
                                }
/* 195 */                       iO1IOIoilO.I0000O(ooIIliIIII0, illOOo00lI2, (IllOOo00lI) obj10, iloI0lOlll14, 0);
/* 198 */                       iloI0lOlll14.I0010I0i(false);
                                break;
                            }
                    }
/* 205 */           return ooiIlOl1iI;
                }
            }
