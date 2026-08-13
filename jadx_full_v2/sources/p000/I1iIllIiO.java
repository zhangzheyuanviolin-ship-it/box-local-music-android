            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I1iIllIiO implements Function3 {
                public final int I00iOIl;
                public String I00iiI;

                public I1iIllIiO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
/* 3 */             int i = this.I00iOIl;
/* 8 */             Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 16 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 20 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1172 */                  String str = this.I00iiI;
/* 1180 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 1186 */                  int iIntValue = ((Integer) obj3).intValue();
/* 1202 */                  if (!iloI0lOlll1.I00OIl(1 & iIntValue, (iIntValue & 17) != 16)) {
/* 1277 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 1204 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1271 */                      Oo0i1oIIoOO.I00000oOI(str, iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f), ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I001l0I00, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000iOII, iloI0lOlll1, 48, 0, 131064);
                                break;
                            }
                        case 1:
/* 1088 */                  boolean z = false;
/* 1090 */                  String str2 = this.I00iiI;
/* 1098 */                  IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 1104 */                  int iIntValue2 = ((Integer) obj3).intValue();
/* 1110 */                  if ((iIntValue2 & 17) != 16) {
/* 1112 */                      z = true;
                            }
/* 1118 */                  if (!iloI0lOlll12.I00OIl(1 & iIntValue2, z)) {
/* 1166 */                      iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 1160 */                      Oo0i1oIIoOO.I00000oOI(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll12, 0, 0, 262142);
                                break;
                            }
                        case 2:
/* 901 */                   String str3 = this.I00iiI;
/* 909 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 915 */                   ((Integer) obj3).getClass();
/* 920 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 924 */                   OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 946 */                   O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(o1ooiI111iI0000oI00, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oIO.I0010I0i, OiI11O1i1.I00000oOI(8.0f)), 16.0f);
/* 952 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 958 */                   int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 962 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 966 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0001Ioi1lo);
/* 972 */                   IOl0oi0lOl1.I000lI.getClass();
/* 975 */                   iloI0lOlll13.I00i0oil();
/* 980 */                   if (iloI0lOlll13.I00O10llo) {
/* 982 */                       iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 986 */                       iloI0lOlll13.I00io1l();
                            }
/* 991 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 996 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 1005 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 1008 */                  li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 1013 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 1079 */                  Oo0i1oIIoOO.I00000oOI(str3, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oOI.I000iOII, iloI0lOlll13, 0, 0, 131066);
/* 1084 */                  iloI0lOlll13.I0010I0i(true);
                            break;
                        case 3:
/* 756 */                   boolean z2 = false;
/* 758 */                   String str4 = this.I00iiI;
/* 766 */                   IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj2;
/* 772 */                   int iIntValue3 = ((Integer) obj3).intValue();
/* 778 */                   if ((iIntValue3 & 17) != 16) {
/* 780 */                       z2 = true;
                            }
/* 786 */                   if (!iloI0lOlll14.I00OIl(1 & iIntValue3, z2)) {
/* 895 */                       iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 788 */                       OlO1iIi1ol0 olO1iIi1ol03 = O1OoilIO.I00000oOI;
/* 889 */                       Oo0i1oIIoOO.I00000oOI(str4, iO01II.I000OiO(iO01II.I000O01llI0(o1ooIo101ll, 16.0f, 0.0f, 2), 0.0f, 24.0f, 0.0f, 4.0f, 5), ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol03)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol03)).I00000oOI.I000O01llI0, 0L, lOlilO1lOIO.I0000O(13), null, OoOOIOo00OoI.I000OOo1O, 0L, 0L, null, 16777181), iloI0lOlll14, 48, 0, 131064);
                                break;
                            }
                        case 4:
/* 700 */                   String str5 = this.I00iiI;
/* 704 */                   Oi1O00I1 oi1O00I1 = (Oi1O00I1) obj;
/* 708 */                   IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj2;
/* 714 */                   int iIntValue4 = ((Integer) obj3).intValue();
/* 720 */                   if ((iIntValue4 & 6) == 0) {
/* 730 */                       iIntValue4 |= iloI0lOlll15.I000II(oi1O00I1) ? 4 : 2;
                            }
/* 744 */                   if (!iloI0lOlll15.I00OIl(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
/* 752 */                       iloI0lOlll15.I00OilO00Il();
                                break;
                            } else {
/* 748 */                       l1I011i1o1I.I00000oIO(oi1O00I1, str5, null, iloI0lOlll15, iIntValue4 & 14);
                                break;
                            }
                        case 5:
/* 642 */                   String str6 = this.I00iiI;
/* 646 */                   Oi1O00I1 oi1O00I12 = (Oi1O00I1) obj;
/* 650 */                   IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj2;
/* 656 */                   int iIntValue5 = ((Integer) obj3).intValue();
/* 662 */                   if ((iIntValue5 & 6) == 0) {
/* 672 */                       iIntValue5 |= iloI0lOlll16.I000II(oi1O00I12) ? 4 : 2;
                            }
/* 686 */                   if (!iloI0lOlll16.I00OIl(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
/* 694 */                       iloI0lOlll16.I00OilO00Il();
                                break;
                            } else {
/* 690 */                       l1I011i1o1I.I00000oIO(oi1O00I12, str6, null, iloI0lOlll16, iIntValue5 & 14);
                                break;
                            }
                        case 6:
/* 444 */                   String str7 = this.I00iiI;
/* 452 */                   IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj2;
/* 458 */                   ((Integer) obj3).getClass();
/* 461 */                   OlO1iIi1ol0 olO1iIi1ol04 = O1OoilIO.I00000oOI;
/* 471 */                   long j = ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol04)).I00000oIO.I001lllioOl;
/* 485 */                   O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(O1ooIo101ll.I00000oIO, 8.0f, 8.0f, 0.0f, 4.0f, 4);
/* 489 */                   boolean zI0001Ioi1lo = iloI0lOlll17.I0001Ioi1lo(j);
/* 493 */                   Object objI00O0i0ii = iloI0lOlll17.I00O0i0ii();
/* 497 */                   if (!zI0001Ioi1lo) {
                                obj4 = objI00O0i0ii;
/* 501 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 506 */                           I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(7);
/* 509 */                           i0o0iioo0IO.I00iiI = j;
/* 511 */                           VarHandle.storeStoreFence();
/* 514 */                           iloI0lOlll17.I00iio(i0o0iioo0IO);
                                    obj4 = i0o0iioo0IO;
                                }
                            }
/* 533 */                   O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(iIO01l11OlO.I00000oIO(o1ooiI111iI000OiO, (Function1) obj4), 12.0f, 0.0f, 0.0f, 0.0f, 14);
/* 541 */                   IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll17, 0);
/* 547 */                   int iHashCode2 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 551 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll17.I000lI();
/* 555 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooiI111iI000OiO2);
/* 561 */                   IOl0oi0lOl1.I000lI.getClass();
/* 564 */                   iloI0lOlll17.I00i0oil();
/* 569 */                   if (iloI0lOlll17.I00O10llo) {
/* 571 */                       iloI0lOlll17.I000l1(iloi111);
                            } else {
/* 575 */                       iloI0lOlll17.I00io1l();
                            }
/* 580 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll17, iOOlo1O01OI00000oIO);
/* 585 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll17, oO0lO0l0I000lI2);
/* 594 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll17, Integer.valueOf(iHashCode2));
/* 597 */                   li01Ooiio01.I00000oOI(iloI0lOlll17);
/* 602 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll17, o1ooiI111iI0000Il00O2);
/* 631 */                   O1Ol1io1o.I0000oI00(str7, null, true, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol04)).I00000oIO.I0010o, 0L, iloI0lOlll17, 384, 18);
/* 636 */                   iloI0lOlll17.I0010I0i(true);
                            break;
                        case 7:
/* 334 */                   String str8 = this.I00iiI;
/* 342 */                   IloI0lOlll1 iloI0lOlll18 = (IloI0lOlll1) obj2;
/* 348 */                   int iIntValue6 = ((Integer) obj3).intValue();
/* 364 */                   if (!iloI0lOlll18.I00OIl(1 & iIntValue6, (iIntValue6 & 17) != 16)) {
/* 438 */                       iloI0lOlll18.I00OilO00Il();
                                break;
                            } else {
/* 409 */                       Oo0i1oIIoOO.I00000oOI(str8, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll18, 0, 0, 262142);
/* 432 */                       IoOoiI1II00i.I00000oIO(iOOI0Oli1.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll18, 432, 8);
                                break;
                            }
                        case 8:
/* 230 */                   String str9 = this.I00iiI;
/* 234 */                   Oo1lliO oo1lliO = (Oo1lliO) obj;
/* 238 */                   IloI0lOlll1 iloI0lOlll19 = (IloI0lOlll1) obj2;
/* 244 */                   int iIntValue7 = ((Integer) obj3).intValue();
/* 250 */                   if ((iIntValue7 & 6) == 0) {
/* 269 */                       iIntValue7 |= (iIntValue7 & 8) == 0 ? iloI0lOlll19.I000II(oo1lliO) : iloI0lOlll19.I000OOo1O(oo1lliO) ? 4 : 2;
                            }
/* 283 */                   if (!iloI0lOlll19.I00OIl(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
/* 328 */                       iloI0lOlll19.I00OilO00Il();
                                break;
                            } else {
/* 289 */                       I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(15);
/* 292 */                       i0Iooi0i1l0l.I00iiI = str9;
/* 294 */                       VarHandle.storeStoreFence();
/* 322 */                       Oo1li0OO.I00000oOI(oo1lliO, str9, null, 0.0f, null, 0L, 0L, iiioOl1O.I00000oOI(660974002, i0Iooi0i1l0l, iloI0lOlll19), iloI0lOlll19, iIntValue7 & 14);
                                break;
                            }
                        case 9:
/* 133 */                   String str10 = this.I00iiI;
/* 135 */                   boolean z3 = false;
/* 138 */                   Oo1lliO oo1lliO2 = (Oo1lliO) obj;
/* 142 */                   IloI0lOlll1 iloI0lOlll110 = (IloI0lOlll1) obj2;
/* 148 */                   int iIntValue8 = ((Integer) obj3).intValue();
/* 154 */                   if ((iIntValue8 & 6) == 0) {
/* 173 */                       iIntValue8 |= (iIntValue8 & 8) == 0 ? iloI0lOlll110.I000II(oo1lliO2) : iloI0lOlll110.I000OOo1O(oo1lliO2) ? 4 : 2;
                            }
/* 176 */                   if ((iIntValue8 & 19) != 18) {
/* 178 */                       z3 = true;
                            }
/* 185 */                   if (!iloI0lOlll110.I00OIl(iIntValue8 & 1, z3)) {
/* 224 */                       iloI0lOlll110.I00OilO00Il();
                                break;
                            } else {
/* 191 */                       I0Iooi0i1l0l i0Iooi0i1l0l2 = new I0Iooi0i1l0l(19);
/* 194 */                       i0Iooi0i1l0l2.I00iiI = str10;
/* 196 */                       VarHandle.storeStoreFence();
/* 218 */                       Oo1li0OO.I00000oOI(oo1lliO2, str10, null, 0.0f, null, 0L, 0L, iiioOl1O.I00000oOI(-1253910984, i0Iooi0i1l0l2, iloI0lOlll110), iloI0lOlll110, iIntValue8 & 14);
                                break;
                            }
                        default:
/* 27 */                    String str11 = this.I00iiI;
/* 35 */                    IloI0lOlll1 iloI0lOlll111 = (IloI0lOlll1) obj2;
/* 41 */                    int iIntValue9 = ((Integer) obj3).intValue();
/* 55 */                    if (!iloI0lOlll111.I00OIl(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
/* 128 */                       iloI0lOlll111.I00OilO00Il();
                                break;
                            } else {
/* 57 */                        OlO1iIi1ol0 olO1iIi1ol05 = O1OoilIO.I00000oOI;
/* 122 */                       Oo0i1oIIoOO.I00000oOI(str11, iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f), ((O1OoiOIi1ooi) iloI0lOlll111.I000iOII(olO1iIi1ol05)).I00000oIO.I001l0I00, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll111.I000iOII(olO1iIi1ol05)).I00000oOI.I000iOII, iloI0lOlll111, 48, 0, 131064);
                                break;
                            }
                    }
/* 131 */           return ooiIlOl1iI;
                }
            }
