            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public abstract class l1IO1i001i {
                public static final void I00000oIO(O1i1O1I o1i1O1I, String str, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
                    IllOOo00lI illOOo00lI2;
                    O1iI1o0lliO o1iI1o0lliO;
                    OOloioIl oOloioIlI001IO000;
                    IloI0lOlll1 iloI0lOlll12;
                    Object next;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    IOO0o0I1l iOO0o0I1l;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
                    IloI0lOlll1 iloI0lOlll14;
/* 1 */             O1i1O1I o1i1O1I2 = o1i1O1I;
/* 3 */             String str2 = str;
/* 7 */             IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 14 */            iloI0lOlll15.I00i0O(-1566027659);
/* 19 */            int i4 = 2;
/* 20 */            if ((i & 6) == 0) {
/* 31 */                i2 = (iloI0lOlll15.I000OOo1O(o1i1O1I2) ? 4 : 2) | i;
                    } else {
/* 33 */                i2 = i;
                    }
/* 36 */            if ((i & 48) == 0) {
/* 49 */                i2 |= iloI0lOlll15.I000II(str2) ? 32 : 16;
                    }
/* 52 */            if ((i & 384) == 0) {
/* 65 */                i2 |= iloI0lOlll15.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 82 */            if (iloI0lOlll15.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 100 */               Iterator it = ((O1i1IIoO1IIl) lOIoiooI1i01.I00000oOI(o1i1O1I2.I0000oI00, iloI0lOlll15).getValue()).I00000oIO.iterator();
                        while (true) {
/* 109 */                   if (!it.hasNext()) {
/* 131 */                       next = null;
                                break;
                            } else {
/* 111 */                       next = it.next();
/* 128 */                       if (O0000Ioio00.I0000O(((O1i1Ooo0ll) next).I00000oIO.I001i1O0Ol(), str2)) {
                                    break;
                                }
                            }
                        }
/* 132 */               O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) next;
/* 134 */               if (o1i1Ooo0ll == null) {
/* 584 */                   oOloioIlI001IO000 = iloI0lOlll15.I001IO000();
/* 588 */                   if (oOloioIlI001IO000 != null) {
/* 592 */                       o1iI1o0lliO = new O1iI1o0lliO(0);
/* 595 */                       o1iI1o0lliO.I00iiI = o1i1O1I2;
/* 599 */                       o1iI1o0lliO.I00iiO = str;
/* 603 */                       o1iI1o0lliO.I00iio = illOOo00lI;
/* 605 */                       i3 = i;
/* 607 */                       o1iI1o0lliO.I00ilI0I1 = i3;
/* 609 */                       VarHandle.storeStoreFence();
/* 612 */                       oOloioIlI001IO000.I0000O = o1iI1o0lliO;
                            }
/* 2230 */                  return;
                        }
/* 136 */               O1i1OolO o1i1OolO = o1i1Ooo0ll.I00000oIO;
/* 139 */               Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll15);
/* 143 */               Object objI00O0i0ii = iloI0lOlll15.I00O0i0ii();
/* 147 */               IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 149 */               if (objI00O0i0ii == iOO0o0I1l2) {
/* 151 */                   objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll15);
/* 155 */                   iloI0lOlll15.I00iio(objI00O0i0ii);
                        }
/* 158 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 160 */               Object objI00O0i0ii2 = iloI0lOlll15.I00O0i0ii();
/* 164 */               if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 166 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 170 */                   iloI0lOlll15.I00iio(objI00O0i0ii2);
                        }
/* 173 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 175 */               Object objI00O0i0ii3 = iloI0lOlll15.I00O0i0ii();
/* 179 */               if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 181 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 185 */                   iloI0lOlll15.I00iio(objI00O0i0ii3);
                        }
/* 188 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 202 */               long j = ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IO1;
/* 206 */               II011lliOioI iI011lliOioI = new II011lliOioI(i4);
/* 209 */               iI011lliOioI.I00iio = o1i1OolO;
/* 211 */               iI011lliOioI.I00ilI0I1 = o1i1O1I2;
/* 213 */               iI011lliOioI.I00ioIO = ii0110;
/* 215 */               iI011lliOioI.I00ilO0 = ol010000lo00I00000oOI;
/* 217 */               iI011lliOioI.I00io1l = illOOo00lI;
/* 219 */               iI011lliOioI.I00iiI = oI10i0Il3;
/* 221 */               iI011lliOioI.I00iiO = oI10i0Il4;
/* 223 */               VarHandle.storeStoreFence();
/* 247 */               int i5 = 0;
/* 283 */               l1OloIOiO01.I00000oIO(illOOo00lI, null, ol010000lo00I00000oOI, 0.0f, false, null, j, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(1634005207, iI011lliOioI, iloI0lOlll15), iloI0lOlll1, (i2 >> 6) & 14, 3072, 8122);
/* 286 */               IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 292 */               O1iI0OiI o1iI0OiI = (O1iI0OiI) oI10i0Il3.getValue();
/* 294 */               if (o1iI0OiI == null) {
/* 299 */                   iloI0lOlll16.I00i01iIIliI(-1589629049);
/* 302 */                   iloI0lOlll16.I0010I0i(false);
/* 305 */                   iOO0o0I1l = iOO0o0I1l2;
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 312 */                   iloI0lOlll16.I00i01iIIliI(-1589629048);
/* 315 */                   Object objI00O0i0ii4 = iloI0lOlll16.I00O0i0ii();
/* 321 */                   if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 327 */                       O0loollioliO o0loollioliO = new O0loollioliO(13);
/* 330 */                       oI10i0Il = oI10i0Il3;
/* 332 */                       o0loollioliO.I00iiI = oI10i0Il;
/* 334 */                       VarHandle.storeStoreFence();
/* 337 */                       iloI0lOlll16.I00iio(o0loollioliO);
                                obj = o0loollioliO;
                            } else {
/* 341 */                       oI10i0Il = oI10i0Il3;
                                obj = objI00O0i0ii4;
                            }
/* 349 */                   IloIlOOIi iloIlOOIi = new IloIlOOIi(16);
/* 352 */                   iloIlOOIi.I00iiI = oI10i0Il;
/* 354 */                   VarHandle.storeStoreFence();
/* 360 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(888958512, iloIlOOIi, iloI0lOlll16);
/* 366 */                   O1iIOiO1Il0 o1iIOiO1Il0 = new O1iIOiO1Il0(i5);
/* 369 */                   o1iIOiO1Il0.I00iiI = o1iI0OiI;
/* 371 */                   VarHandle.storeStoreFence();
/* 377 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(952232756, o1iIOiO1Il0, iloI0lOlll16);
/* 384 */                   O1iIOiO1Il0 o1iIOiO1Il02 = new O1iIOiO1Il0(1);
/* 387 */                   o1iIOiO1Il02.I00iiI = o1iI0OiI;
/* 389 */                   VarHandle.storeStoreFence();
/* 426 */                   iOO0o0I1l = iOO0o0I1l2;
/* 428 */                   iOIil10l.I00000oIO((IllOOo00lI) obj, iOii1lI00000oOI, null, null, null, iOii1lI00000oOI2, iiioOl1O.I00000oOI(-1179432331, o1iIOiO1Il02, iloI0lOlll16), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1769526, 16284);
/* 431 */                   IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 433 */                   iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll17;
                        }
/* 440 */               O1iI0OiI o1iI0OiI2 = (O1iI0OiI) oI10i0Il4.getValue();
/* 442 */               if (o1iI0OiI2 == null) {
/* 447 */                   iloI0lOlll13.I00i01iIIliI(-1587850796);
/* 450 */                   iloI0lOlll13.I0010I0i(false);
/* 453 */                   o1i1O1I2 = o1i1O1I;
                            iloI0lOlll14 = iloI0lOlll13;
                        } else {
/* 460 */                   iloI0lOlll13.I00i01iIIliI(-1587850795);
/* 463 */                   Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 467 */                   if (objI00O0i0ii5 == iOO0o0I1l) {
/* 473 */                       O0loollioliO o0loollioliO2 = new O0loollioliO(14);
/* 476 */                       oI10i0Il2 = oI10i0Il4;
/* 478 */                       o0loollioliO2.I00iiI = oI10i0Il2;
/* 480 */                       VarHandle.storeStoreFence();
/* 483 */                       iloI0lOlll13.I00iio(o0loollioliO2);
                                obj2 = o0loollioliO2;
                            } else {
/* 487 */                       oI10i0Il2 = oI10i0Il4;
                                obj2 = objI00O0i0ii5;
                            }
/* 495 */                   O11iol o11iol = new O11iol(21);
/* 500 */                   o11iol.I00iiI = o1i1O1I;
/* 504 */                   o11iol.I00iiO = o1i1OolO;
/* 506 */                   o11iol.I00iio = o1iI0OiI2;
/* 508 */                   o11iol.I00ilI0I1 = oI10i0Il2;
/* 510 */                   VarHandle.storeStoreFence();
/* 516 */                   IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(1738960153, o11iol, iloI0lOlll13);
/* 524 */                   IloIlOOIi iloIlOOIi2 = new IloIlOOIi(17);
/* 527 */                   iloIlOOIi2.I00iiI = oI10i0Il2;
/* 529 */                   VarHandle.storeStoreFence();
/* 563 */                   IloI0lOlll1 iloI0lOlll18 = iloI0lOlll13;
/* 566 */                   o1i1O1I2 = o1i1O1I;
/* 568 */                   iOIil10l.I00000oIO((IllOOo00lI) obj2, iOii1lI00000oOI3, null, iiioOl1O.I00000oOI(2077463323, iloIlOOIi2, iloI0lOlll13), null, i1iIOO1.I000II, i1iIOO1.I000O01llI0, null, 0L, 0L, 0L, 0L, null, iloI0lOlll18, 1772598, 16276);
/* 571 */                   IloI0lOlll1 iloI0lOlll19 = iloI0lOlll18;
/* 573 */                   iloI0lOlll19.I0010I0i(false);
                            iloI0lOlll14 = iloI0lOlll19;
                        }
/* 576 */               str2 = str;
/* 578 */               illOOo00lI2 = illOOo00lI;
/* 580 */               i3 = i;
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 615 */               i3 = i;
/* 616 */               illOOo00lI2 = illOOo00lI;
/* 617 */               iloI0lOlll15.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll15;
                    }
/* 620 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 624 */           if (oOloioIlI001IO000 != null) {
/* 629 */               o1iI1o0lliO = new O1iI1o0lliO(1);
/* 632 */               o1iI1o0lliO.I00iiI = o1i1O1I2;
/* 634 */               o1iI1o0lliO.I00iiO = str2;
/* 636 */               o1iI1o0lliO.I00iio = illOOo00lI2;
/* 607 */               o1iI1o0lliO.I00ilI0I1 = i3;
/* 609 */               VarHandle.storeStoreFence();
/* 612 */               oOloioIlI001IO000.I0000O = o1iI1o0lliO;
                    }
                }
            }
