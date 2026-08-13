            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class OlllIOI0lolO implements IlliIl1l11O {
                public final int I00iOIl;
                public IOii1l I00iiI;
                public IlliIl1l11O I00iiO;
                public Function3 I00iio;

                public OlllIOI0lolO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 9 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 13 */            int i2 = 1;
                    switch (i) {
                        case 0:
/* 469 */                   IOii1l iOii1l = this.I00iiI;
/* 471 */                   IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 473 */                   Function3 function3 = this.I00iio;
/* 475 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 479 */                   int iIntValue = ((Integer) obj2).intValue();
/* 495 */                   if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 497 */                       O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 514 */                       boolean zI000II = iloI0lOlll1.I000II(iOii1l) | iloI0lOlll1.I000II(illiIl1l11O) | iloI0lOlll1.I000II(function3);
/* 515 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 519 */                       if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 525 */                           OlllIOI0lolO olllIOI0lolO = new OlllIOI0lolO(i2);
/* 528 */                           olllIOI0lolO.I00iiI = iOii1l;
/* 530 */                           olllIOI0lolO.I00iiO = illiIl1l11O;
/* 532 */                           olllIOI0lolO.I00iio = function3;
/* 534 */                           VarHandle.storeStoreFence();
/* 537 */                           iloI0lOlll1.I00iio(olllIOI0lolO);
                                    obj3 = olllIOI0lolO;
                                }
/* 543 */                       Oli1lii10.I00000oIO(o1ooiI111iI0000oI00, (IlliIl1l11O) obj3, iloI0lOlll1, 6, 0);
                            } else {
/* 547 */                       iloI0lOlll1.I00OilO00Il();
                            }
/* 550 */                   return ooiIlOl1iI;
                        case 1:
/* 241 */                   IOii1l iOii1l2 = this.I00iiI;
/* 243 */                   IlliIl1l11O illiIl1l11O2 = this.I00iiO;
/* 245 */                   Function3 function32 = this.I00iio;
/* 247 */                   Oli1oI111 oli1oI111 = (Oli1oI111) obj;
/* 249 */                   IOo0oO11ll1O iOo0oO11ll1O = (IOo0oO11ll1O) obj2;
/* 253 */                   int iI000OiO = IOo0oO11ll1O.I000OiO(iOo0oO11ll1O.I00000oIO);
/* 259 */                   List listI000o00OoI0I = oli1oI111.I000o00OoI0I(iOii1l2, Ollo1l0I.I00iOIl);
/* 263 */                   int size = listI000o00OoI0I.size();
/* 269 */                   OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 272 */                   if (size > 0) {
/* 276 */                       oOo0ll111.I00iOIl = iI000OiO / size;
                            }
/* 278 */                   Integer numValueOf = 0;
/* 283 */                   List list = listI000o00OoI0I;
/* 285 */                   int size2 = list.size();
/* 290 */                   for (int i3 = 0; i3 < size2; i3++) {
/* 312 */                       numValueOf = Integer.valueOf(Math.max(((O1iIo0ll) listI000o00OoI0I.get(i3)).I0000Il00O(oOo0ll111.I00iOIl), numValueOf.intValue()));
                            }
/* 319 */                   int iIntValue2 = numValueOf.intValue();
/* 329 */                   ArrayList arrayList = new ArrayList(listI000o00OoI0I.size());
/* 332 */                   int size3 = list.size();
/* 337 */                   for (int i4 = 0; i4 < size3; i4++) {
/* 343 */                       O1iIo0ll o1iIo0ll = (O1iIo0ll) listI000o00OoI0I.get(i4);
/* 345 */                       int i5 = oOo0ll111.I00iOIl;
/* 355 */                       arrayList.add(o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I00000oOI(i5, i5, iIntValue2, iIntValue2)));
                            }
/* 363 */                   ArrayList arrayList2 = new ArrayList(size);
/* 366 */                   for (int i6 = 0; i6 < size; i6++) {
/* 391 */                       Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(oli1oI111.I00O0o1oo(Math.min(((O1iIo0ll) listI000o00OoI0I.get(i6)).I001iOo1i0O(iIntValue2), oOo0ll111.I00iOIl)) - 32.0f);
/* 397 */                       Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(24.0f);
/* 405 */                       if (iil1010OI00000oIO.compareTo(iil1010OI00000oIO2) < 0) {
/* 408 */                           iil1010OI00000oIO = iil1010OI00000oIO2;
                                }
/* 430 */                       arrayList2.add(new Olll1Oi(oli1oI111.I00O0o1oo(oOo0ll111.I00iOIl) * i6, oli1oI111.I00O0o1oo(oOo0ll111.I00iOIl), iil1010OI00000oIO.I00iOIl));
                            }
/* 438 */                   OlllOiII olllOiII = new OlllOiII();
/* 441 */                   olllOiII.I00iOIl = arrayList;
/* 443 */                   olllOiII.I00iiI = oli1oI111;
/* 445 */                   olllOiII.I00iiO = illiIl1l11O2;
/* 447 */                   olllOiII.I00iio = oOo0ll111;
/* 449 */                   olllOiII.I00ilI0I1 = iOo0oO11ll1O;
/* 451 */                   olllOiII.I00ilO0 = iIntValue2;
/* 453 */                   olllOiII.I00io1l = function32;
/* 455 */                   olllOiII.I00ioIO = arrayList2;
/* 457 */                   olllOiII.I00l0I0l0lO1 = iI000OiO;
/* 459 */                   VarHandle.storeStoreFence();
/* 464 */                   return oli1oI111.I001i1lo1io(iI000OiO, iIntValue2, Il011I1OiO0I.I00iOIl, olllOiII);
                        default:
/* 17 */                    IOii1l iOii1l3 = this.I00iiI;
/* 19 */                    IlliIl1l11O illiIl1l11O3 = this.I00iiO;
/* 21 */                    Function3 function33 = this.I00iio;
/* 23 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 27 */                    int iIntValue3 = ((Integer) obj2).intValue();
/* 43 */                    if (iloI0lOlll12.I00OIl(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
/* 47 */                        IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iOIl, iloI0lOlll12);
/* 51 */                        Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 55 */                        if (objI00O0i0ii2 == iOO0o0I1l) {
/* 59 */                            Ollo10o1IO ollo10o1IO = new Ollo10o1IO();
/* 62 */                            ollo10o1IO.I00000oOI = ilIoO1ilo1I00000oOI;
/* 70 */                            ollo10o1IO.I00000oIO = lOO00IiI0li.I00000oIO(Il01100l.I00iOIl);
/* 72 */                            VarHandle.storeStoreFence();
/* 75 */                            iloI0lOlll12.I00iio(ollo10o1IO);
                                    obj4 = ollo10o1IO;
                                }
/* 78 */                        Ollo10o1IO ollo10o1IO2 = (Ollo10o1IO) obj4;
/* 80 */                        O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 88 */                        O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(28);
/* 91 */                        o1oiiIIo111o.I00iiI = function33;
/* 93 */                        o1oiiIIo111o.I00iiO = ollo10o1IO2;
/* 95 */                        VarHandle.storeStoreFence();
/* 114 */                       List listI000O01llI0 = IOOi1I.I000O01llI0(iOii1l3, illiIl1l11O3, iiioOl1O.I00000oOI(-1333331860, o1oiiIIo111o, iloI0lOlll12));
/* 118 */                       Object objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
                                Object obj5 = objI00O0i0ii3;
/* 122 */                       if (objI00O0i0ii3 == iOO0o0I1l) {
/* 126 */                           Ollo0lo ollo0lo = new Ollo0lo();
/* 129 */                           ollo0lo.I00000oIO = ollo10o1IO2;
/* 131 */                           VarHandle.storeStoreFence();
/* 134 */                           iloI0lOlll12.I00iio(ollo0lo);
                                    obj5 = ollo0lo;
                                }
/* 137 */                       OI0Iolo0lIiI oI0Iolo0lIiI = (OI0Iolo0lIiI) obj5;
/* 139 */                       IOii1l iOii1lI00000oIO = l0o0Oioio1ol.I00000oIO(listI000O01llI0);
/* 143 */                       Object objI00O0i0ii4 = iloI0lOlll12.I00O0i0ii();
                                Object obj6 = objI00O0i0ii4;
/* 147 */                       if (objI00O0i0ii4 == iOO0o0I1l) {
/* 151 */                           OI0O0o01II10 oI0O0o01II10 = new OI0O0o01II10();
/* 154 */                           oI0O0o01II10.I00000oIO = oI0Iolo0lIiI;
/* 156 */                           VarHandle.storeStoreFence();
/* 159 */                           iloI0lOlll12.I00iio(oI0O0o01II10);
                                    obj6 = oI0O0o01II10;
                                }
/* 162 */                       O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj6;
/* 166 */                       int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 170 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 174 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000oI002);
/* 180 */                       IOl0oi0lOl1.I000lI.getClass();
/* 183 */                       iloI0lOlll12.I00i0oil();
/* 188 */                       if (iloI0lOlll12.I00O10llo) {
/* 192 */                           iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 196 */                           iloI0lOlll12.I00io1l();
                                }
/* 201 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, o1iOIl0o10);
/* 206 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 215 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 218 */                       li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 223 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 230 */                       iOii1lI00000oIO.invoke(iloI0lOlll12, 0);
/* 233 */                       iloI0lOlll12.I0010I0i(true);
                            } else {
/* 237 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 240 */                   return ooiIlOl1iI;
                    }
                }
            }
