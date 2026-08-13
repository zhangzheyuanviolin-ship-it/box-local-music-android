            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I10il0oO extends O0iO10011II implements Function3 {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10il0oO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
/* 12 */            super(3);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
/* 7 */             this.I00iio = obj3;
/* 9 */             this.I00ilI0I1 = obj4;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    Object obj5;
                    boolean z;
                    OoI1Oi0l1I0o ooI1Oi0l1I0oI0000oI00;
                    IloI0lOlll1 iloI0lOlll1;
                    boolean z2;
                    Boolean bool;
                    Object obj6;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj7 = this.I00ilI0I1;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             Object obj8 = IOl11li.I00000oIO;
/* 11 */            Object obj9 = this.I00iio;
/* 13 */            Object obj10 = this.I00iiI;
/* 15 */            Object obj11 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 767 */                   I10oo1iO0lIl i10oo1iO0lIl = (I10oo1iO0lIl) obj;
/* 771 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 777 */                   int iIntValue = ((Number) obj3).intValue();
/* 781 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) obj11;
/* 783 */                   I10llI0II11l i10llI0II11l = (I10llI0II11l) obj9;
/* 787 */                   if ((iIntValue & 6) == 0) {
/* 805 */                       iIntValue |= (iIntValue & 8) == 0 ? iloI0lOlll12.I000II(i10oo1iO0lIl) : iloI0lOlll12.I000OOo1O(i10oo1iO0lIl) ? 4 : 2;
                            }
/* 822 */                   if (iloI0lOlll12.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 837 */                       boolean zI000II = iloI0lOlll12.I000II(ol1o0O0O0) | iloI0lOlll12.I000OOo1O(obj10) | iloI0lOlll12.I000OOo1O(i10llI0II11l);
/* 838 */                       Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 842 */                       if (zI000II || objI00O0i0ii == obj8) {
/* 849 */                           objI00O0i0ii = new I10iiiO1l0lo(ol1o0O0O0, obj10, i10llI0II11l, 0);
/* 852 */                           iloI0lOlll12.I00iio(objI00O0i0ii);
                                }
/* 857 */                       iIO0iiOiOl0l.I00000oIO(i10oo1iO0lIl, obj10, (Function1) objI00O0i0ii, iloI0lOlll12);
/* 867 */                       i10llI0II11l.I0000oI00.I000lI(obj10, ((I10ooOlo) i10oo1iO0lIl).I00000oOI);
/* 870 */                       Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj12 = objI00O0i0ii2;
/* 874 */                       if (objI00O0i0ii2 == obj8) {
/* 878 */                           I10l11ioI i10l11ioI = new I10l11ioI();
/* 881 */                           i10l11ioI.I00000oIO = i10oo1iO0lIl;
/* 883 */                           VarHandle.storeStoreFence();
/* 886 */                           iloI0lOlll12.I00iio(i10l11ioI);
                                    obj12 = i10l11ioI;
                                }
/* 901 */                       ((IOii1l) obj7).I000l1((I10l11ioI) obj12, obj10, iloI0lOlll12, 0);
                            } else {
/* 905 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 908 */                   return ooiIlOl1iI;
                        default:
/* 23 */                    O1ooiI111i o1ooiI111i = (O1ooiI111i) obj;
/* 27 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 33 */                    ((Number) obj3).intValue();
/* 36 */                    I10i1IOOol i10i1IOOol = I10i1IOOol.I00oII;
/* 38 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) obj11;
/* 43 */                    iloI0lOlll13.I00i01iIIliI(-1539505585);
/* 46 */                    OiooioIilliO oiooioIilliO = (OiooioIilliO) obj10;
/* 48 */                    Object obj13 = oiooioIilliO.I00000oIO;
/* 53 */                    iloI0lOlll13.I00Ol1ll1(-1996110647, obj13);
/* 56 */                    Oiool011li oiool011li = (Oiool011li) obj9;
/* 58 */                    Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 63 */                    if (objI00O0i0ii3 == obj8) {
/* 65 */                        Ol1o1llOII ol1o1llOII = oiool011li.I00l0I0l0lO1;
/* 67 */                        Object obj14 = ol1o1llOII.get(obj13);
/* 71 */                        if (obj14 == null) {
/* 75 */                            OiolI10I1oOO oiolI10I1oOO = new OiolI10I1oOO();
/* 78 */                            oiolI10I1oOO.I00000oIO = obj13;
/* 80 */                            oiolI10I1oOO.I00000oOI = oiool011li;
/* 84 */                            Ol001oOi1 ol001oOi1 = new Ol001oOi1();
/* 87 */                            ol001oOi1.I00000oIO = oiolI10I1oOO;
/* 95 */                            ol001oOi1.I00000oOI = lOO00IiI0li.I00000oIO(OIIl0lOlI.I00000oIO);
/* 102 */                           ol001oOi1.I0000O = new OIooi1iOiOol(0);
/* 106 */                           ol001oOi1.I0000oI00 = OlO01oiI.I00iOIl;
/* 113 */                           ol001oOi1.I000II = new OIooi1iOiOol(0);
/* 115 */                           VarHandle.storeStoreFence();
/* 118 */                           oiolI10I1oOO.I0000Il00O = ol001oOi1;
/* 120 */                           Il01100l il01100l = Il01100l.I00iOIl;
/* 126 */                           oiolI10I1oOO.I0000O = lOO00IiI0li.I00000oIO(il01100l);
/* 132 */                           oiolI10I1oOO.I0000oI00 = lOO00IiI0li.I00000oIO(il01100l);
/* 144 */                           obj4 = obj7;
/* 151 */                           oiolI10I1oOO.I0001Ioi1lo = new I10i01(OIOlIiiioi.I00000oIO(0L), Ooo0ii.I0001Ioi1lo, null, 12);
/* 159 */                           oiolI10I1oOO.I000O01llI0 = new Oiol1oilllO(oiolI10I1oOO, 0);
/* 167 */                           oiolI10I1oOO.I000OOo1O = new Oiol1oilllO(oiolI10I1oOO, 1);
/* 169 */                           VarHandle.storeStoreFence();
/* 172 */                           ol1o1llOII.put(obj13, oiolI10I1oOO);
                                    obj6 = oiolI10I1oOO;
                                } else {
/* 176 */                           obj4 = obj7;
                                    obj6 = obj14;
                                }
/* 179 */                       objI00O0i0ii3 = (OiolI10I1oOO) obj6;
/* 181 */                       iloI0lOlll13.I00iio(objI00O0i0ii3);
                            } else {
/* 185 */                       obj4 = obj7;
                            }
/* 188 */                   OiolI10I1oOO oiolI10I1oOO2 = (OiolI10I1oOO) objI00O0i0ii3;
/* 193 */                   iloI0lOlll13.I00Ol1ll1(-1996106866, ooI1Oi0l1I0o);
/* 196 */                   if (ooI1Oi0l1I0o != null) {
/* 198 */                       I01O1lIi i01O1lIi = ooI1Oi0l1I0o.I00000oIO;
/* 203 */                       iloI0lOlll13.I00i01iIIliI(-1749734647);
/* 206 */                       String string = obj13.toString();
/* 210 */                       boolean zI000II2 = iloI0lOlll13.I000II(ooI1Oi0l1I0o);
/* 214 */                       Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 218 */                       if (zI000II2 || objI00O0i0ii4 == obj8) {
/* 222 */                           objI00O0i0ii4 = i01O1lIi.I00olI();
/* 226 */                           iloI0lOlll13.I00iio(objI00O0i0ii4);
                                }
/* 233 */                       if (ooI1Oi0l1I0o.I000OOo1O()) {
/* 235 */                           objI00O0i0ii4 = i01O1lIi.I00olI();
                                }
/* 242 */                       iloI0lOlll13.I00i01iIIliI(1498260051);
/* 250 */                       Boolean bool2 = (Boolean) i10i1IOOol.invoke(objI00O0i0ii4);
/* 253 */                       iloI0lOlll13.I0010I0i(false);
/* 258 */                       Object value = ooI1Oi0l1I0o.I0000O.getValue();
/* 262 */                       iloI0lOlll13.I00i01iIIliI(1498260051);
/* 270 */                       Boolean bool3 = (Boolean) i10i1IOOol.invoke(value);
/* 272 */                       iloI0lOlll13.I0010I0i(false);
/* 279 */                       obj5 = null;
/* 284 */                       ooI1Oi0l1I0oI0000oI00 = iO1IIloiOoiO.I00000oOI(ooI1Oi0l1I0o, bool2, bool3, string, iloI0lOlll13, 0);
/* 288 */                       IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 293 */                       if (ooI1Oi0l1I0o.I000OOo1O()) {
/* 351 */                           z2 = false;
/* 355 */                           iloI0lOlll14.I00i01iIIliI(782538635);
/* 358 */                           iloI0lOlll14.I0010I0i(false);
                                } else {
/* 298 */                           iloI0lOlll14.I00i01iIIliI(782386797);
/* 303 */                           Object value2 = ooI1Oi0l1I0o.I0000oI00.getValue();
/* 307 */                           if (value2 == null) {
/* 312 */                               iloI0lOlll14.I00i01iIIliI(782437481);
/* 315 */                               z2 = false;
/* 316 */                               iloI0lOlll14.I0010I0i(false);
/* 319 */                               bool = null;
                                    } else {
/* 321 */                               z2 = false;
/* 325 */                               iloI0lOlll14.I00i01iIIliI(782437482);
/* 328 */                               iloI0lOlll14.I00i01iIIliI(1498260051);
/* 336 */                               bool = (Boolean) i10i1IOOol.invoke(value2);
/* 338 */                               iloI0lOlll14.I0010I0i(false);
/* 341 */                               iloI0lOlll14.I0010I0i(false);
                                    }
/* 344 */                           ooI1Oi0l1I0oI0000oI00.I0010o(bool);
/* 347 */                           iloI0lOlll14.I0010I0i(z2);
                                }
/* 361 */                       iloI0lOlll14.I0010I0i(z2);
/* 364 */                       z = z2;
                                iloI0lOlll1 = iloI0lOlll14;
                            } else {
/* 368 */                       obj5 = null;
/* 372 */                       iloI0lOlll13.I00i01iIIliI(-1749482679);
/* 376 */                       OoOOI1100oI0.I0000Il00O(1, i10i1IOOol);
/* 383 */                       Boolean bool4 = (Boolean) i10i1IOOol.invoke(ooiIlOl1iI);
/* 385 */                       boolean zBooleanValue = bool4.booleanValue();
/* 389 */                       Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 393 */                       if (objI00O0i0ii5 == obj8) {
/* 403 */                           if (!oiolI10I1oOO2.I0000Il00O().isEmpty()) {
/* 410 */                               zBooleanValue = !zBooleanValue;
                                    }
/* 417 */                           objI00O0i0ii5 = new OI10ooOi(Boolean.valueOf(zBooleanValue));
/* 420 */                           iloI0lOlll13.I00iio(objI00O0i0ii5);
                                }
/* 423 */                       OI10ooOi oI10ooOi = (OI10ooOi) objI00O0i0ii5;
/* 427 */                       oI10ooOi.I00iiO.setValue(bool4);
/* 430 */                       z = false;
/* 432 */                       ooI1Oi0l1I0oI0000oI00 = iO1IIloiOoiO.I0000oI00(oI10ooOi, null, iloI0lOlll13, 0, 2);
/* 436 */                       iloI0lOlll13.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll13;
                            }
/* 365 */                   OoI1Oi0l1I0o ooI1Oi0l1I0o2 = ooI1Oi0l1I0oI0000oI00;
/* 451 */                   iloI0lOlll1.I00Ol1ll1(-1996043323, Boolean.valueOf(oiool011li.I00000oIO()));
/* 459 */                   OoI1I1i1 ooI1I1i1I0000Il00O = iO1IIloiOoiO.I0000Il00O(ooI1Oi0l1I0o2, Ooo0ii.I000OOo1O, null, iloI0lOlll1, 0, 2);
/* 463 */                   iloI0lOlll1.I0010I0i(z);
/* 466 */                   boolean zI000II3 = iloI0lOlll1.I000II(ooI1Oi0l1I0o2);
/* 470 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 474 */                   Oiol0ll oiol0ll = iO0oO0Io0O1.I00000oIO;
                            Object obj15 = objI00O0i0ii6;
/* 476 */                   if (zI000II3 || objI00O0i0ii6 == obj8) {
/* 482 */                       Oiol1oilllO oiol1oilllO = oiolI10I1oOO2.I000O01llI0;
/* 484 */                       II1i1olilO0I iI1i1olilO0I = new II1i1olilO0I();
/* 487 */                       iI1i1olilO0I.I00000oIO = oiool011li;
/* 489 */                       iI1i1olilO0I.I00000oOI = ooI1Oi0l1I0o2;
/* 491 */                       iI1i1olilO0I.I0000Il00O = oiol1oilllO;
/* 497 */                       iI1i1olilO0I.I0000O = lOO00IiI0li.I00000oIO(ooI1I1i1I0000Il00O);
/* 503 */                       iI1i1olilO0I.I0000oI00 = lOO00IiI0li.I00000oIO(oiol0ll);
/* 507 */                       iI1i1olilO0I.I0001Ioi1lo = II1iI0ol.I00000oIO;
/* 515 */                       iI1i1olilO0I.I000II = new II1i1illoo(iI1i1olilO0I, 1);
/* 521 */                       iI1i1olilO0I.I000O01llI0 = lOO00IiI0li.I00000oIO(obj5);
/* 529 */                       iI1i1olilO0I.I000iOII = new II1i1illoo(iI1i1olilO0I, 0);
/* 531 */                       VarHandle.storeStoreFence();
/* 534 */                       iloI0lOlll1.I00iio(iI1i1olilO0I);
                                obj15 = iI1i1olilO0I;
                            }
/* 537 */                   II1i1olilO0I iI1i1olilO0I2 = (II1i1olilO0I) obj15;
/* 551 */                   if (!O0000Ioio00.I0000O((OoI1I1i1) iI1i1olilO0I2.I0000O.getValue(), ooI1I1i1I0000Il00O)) {
/* 555 */                       iI1i1olilO0I2.I0000O.setValue(ooI1I1i1I0000Il00O);
/* 560 */                       iI1i1olilO0I2.I000O01llI0.setValue(obj5);
/* 565 */                       iI1i1olilO0I2.I0001Ioi1lo = II1iI0ol.I00000oIO;
                            }
/* 569 */                   iI1i1olilO0I2.I0000oI00.setValue(oiol0ll);
/* 573 */                   iloI0lOlll1.I0010I0i(false);
/* 578 */                   Oiool1 oiool1 = (Oiool1) obj4;
/* 580 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 584 */                   OiooiOilIO0 oiooiOilIO0 = OiooiOilIO0.I00000oOI;
                            Object obj16 = objI00O0i0ii7;
/* 587 */                   if (objI00O0i0ii7 == obj8) {
/* 591 */                       OiolIO0Il oiolIO0Il = new OiolIO0Il();
/* 600 */                       oiolIO0Il.I00iOIl = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 607 */                       oiolIO0Il.I00iiI = new OIooO1iiliI(0.0f);
/* 609 */                       Boolean bool5 = Boolean.TRUE;
/* 615 */                       oiolIO0Il.I00iiO = lOO00IiI0li.I00000oIO(bool5);
/* 621 */                       oiolIO0Il.I00iio = lOO00IiI0li.I00000oIO(oiolI10I1oOO2);
/* 627 */                       oiolIO0Il.I00ilI0I1 = lOO00IiI0li.I00000oIO(iI1i1olilO0I2);
/* 633 */                       oiolIO0Il.I00ilO0 = lOO00IiI0li.I00000oIO(oiooiOilIO0);
/* 639 */                       oiolIO0Il.I00io1l = lOO00IiI0li.I00000oIO(bool5);
/* 645 */                       oiolIO0Il.I00ioIO = lOO00IiI0li.I00000oIO(oiool1);
/* 651 */                       oiolIO0Il.I00l0I0l0lO1 = lOO00IiI0li.I00000oIO(oiooioIilliO);
/* 657 */                       oiolIO0Il.I00lll10 = lOO00IiI0li.I00000oIO(obj5);
/* 659 */                       VarHandle.storeStoreFence();
/* 662 */                       iloI0lOlll1.I00iio(oiolIO0Il);
                                obj16 = oiolIO0Il;
                            }
/* 665 */                   OiolIO0Il oiolIO0Il2 = (OiolIO0Il) obj16;
/* 669 */                   oiooioIilliO.I0000Il00O.setValue(oiolIO0Il2);
/* 674 */                   oiolIO0Il2.I00iio.setValue(oiolI10I1oOO2);
/* 677 */                   OIooliIO0 oIooliIO0 = oiolIO0Il2.I00io1l;
/* 679 */                   Boolean bool6 = Boolean.TRUE;
/* 681 */                   oIooliIO0.setValue(bool6);
/* 686 */                   oiolIO0Il2.I00ilI0I1.setValue(iI1i1olilO0I2);
/* 691 */                   oiolIO0Il2.I00ilO0.setValue(oiooiOilIO0);
/* 696 */                   oiolIO0Il2.I00ioIO.setValue(oiool1);
/* 699 */                   OIooO1iiliI oIooO1iiliI = oiolIO0Il2.I00iiI;
/* 707 */                   if (oIooO1iiliI.I000II() != 0.0f) {
/* 710 */                       oIooO1iiliI.I000O01llI0(0.0f);
/* 719 */                       OIooi1iOiOol oIooi1iOiOol = oiolIO0Il2.I0001Ioi1lo().I00000oOI.I00io1l;
/* 727 */                       oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                            }
/* 732 */                   oiolIO0Il2.I00iiO.setValue(bool6);
/* 737 */                   oiolIO0Il2.I00l0I0l0lO1.setValue(oiooioIilliO);
/* 741 */                   iloI0lOlll1.I0010I0i(false);
/* 746 */                   Oiol1l oiol1l = new Oiol1l();
/* 749 */                   oiol1l.I00000oIO = oiolIO0Il2;
/* 751 */                   VarHandle.storeStoreFence();
/* 754 */                   O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(oiol1l);
/* 758 */                   iloI0lOlll1.I0010I0i(false);
/* 761 */                   return o1ooiI111iI0000O;
                    }
                }
            }
