            package p000;

            import android.content.Context;
            import android.view.View;
            import android.view.accessibility.AccessibilityManager;
            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class i1IlIoiI10OI {
                /* JADX WARN: Removed duplicated region for block: B:103:0x0457  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x048d  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0495  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0510  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x055f  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0350  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x03bc  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1ol100o0O o1ol100o0O, II1o0111IO0 iI1o0111IO0, IloI0lOlll1 iloI0lOlll1, int i) {
                    II1o0111IO0 iI1o0111IO02;
                    IloI0lOlll1 iloI0lOlll12;
                    II1o0111IO0 iI1o0111IO03;
                    II1o0111IO0 iI1o0111IO04;
                    Context context;
                    OoiIlOl1iI ooiIlOl1iI;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    OI10i0Il oI10i0Il;
                    IllOOo00lI illOOo00lI;
                    IOioOOi0I iOioOOi0I3;
                    IlIl1Io0lii1 ilIl1Io0lii1;
                    Object obj;
                    IOioOOi0I iOioOOi0I4;
                    O1ooIo101ll o1ooIo101ll;
                    II1oili iI1oili;
                    int i2;
                    Object obj2;
                    boolean z;
                    II1o0111IO0 iI1o0111IO05;
                    IloI0lOlll1 iloI0lOlll13;
                    Object obj3;
                    Object obj4;
                    boolean zI000OOo1O;
                    int i3;
                    Object obj5;
                    OI10i0Il oI10i0Il2;
                    boolean zI000II;
                    Object obj6;
                    boolean z2;
                    boolean zI000O01llI0;
                    boolean z3;
                    Object obj7;
                    O1ooIo101ll o1ooIo101ll2;
/* 3 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 8 */             iloI0lOlll14.I00i0O(1687876429);
/* 23 */            int i4 = i | (iloI0lOlll14.I000OOo1O(o1ol100o0O) ? 4 : 2) | 16;
/* 41 */            if (iloI0lOlll14.I00OIl(i4 & 1, (i4 & 19) != 18)) {
/* 43 */                iloI0lOlll14.I00Ol00();
/* 48 */                if ((i & 1) == 0 || iloI0lOlll14.I001lloI()) {
/* 63 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll14);
/* 67 */                    if (oool1Ii0II00000oIO == null) {
/* 1467 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1470 */                      return;
                            }
/* 93 */                    iI1o0111IO03 = (II1o0111IO0) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(II1o0111IO0.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll14), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll14);
                        } else {
/* 57 */                    iloI0lOlll14.I00OilO00Il();
/* 60 */                    iI1o0111IO03 = iI1o0111IO0;
                        }
/* 96 */                iloI0lOlll14.I0010o();
/* 101 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(iI1o0111IO03.I0000O, iloI0lOlll14);
/* 112 */               Context context2 = (Context) iloI0lOlll14.I000iOII(I0lloOI0oio.I00000oOI);
/* 114 */               boolean zI000II2 = iloI0lOlll14.I000II(context2);
/* 118 */               Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 122 */               Object obj8 = IOl11li.I00000oIO;
/* 124 */               if (zI000II2 || objI00O0i0ii == obj8) {
/* 130 */                   Object systemService = context2.getSystemService("accessibility");
/* 141 */                   AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
/* 153 */                   objI00O0i0ii = Boolean.valueOf(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled());
/* 157 */                   iloI0lOlll14.I00iio(objI00O0i0ii);
                        }
/* 162 */               boolean zBooleanValue = ((Boolean) objI00O0i0ii).booleanValue();
/* 166 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 170 */               if (objI00O0i0ii2 == obj8) {
/* 187 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.valueOf(iOI10i0I11.I00000oIO(context2, "android.permission.CAMERA") == 0));
/* 191 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 195 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 199 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(4);
/* 202 */               boolean zI000OOo1O2 = iloI0lOlll14.I000OOo1O(context2);
/* 206 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
                        Object obj9 = objI00O0i0ii3;
/* 210 */               if (zI000OOo1O2 || objI00O0i0ii3 == obj8) {
/* 216 */                   II1iO011I iI1iO011I = new II1iO011I(0);
/* 219 */                   iI1iO011I.I00iiI = context2;
/* 221 */                   iI1iO011I.I00iiO = oI10i0Il3;
/* 223 */                   VarHandle.storeStoreFence();
/* 226 */                   iloI0lOlll14.I00iio(iI1iO011I);
                            obj9 = iI1iO011I;
                        }
/* 231 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj9, iloI0lOlll14, 0);
/* 248 */               boolean zI000OOo1O3 = iloI0lOlll14.I000OOo1O(iI1o0111IO03) | iloI0lOlll14.I000OOo1O(context2) | iloI0lOlll14.I000OOo1O(o1OIi1I00000oIO);
/* 249 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 253 */               if (zI000OOo1O3 || objI00O0i0ii4 == obj8) {
/* 264 */                   objI00O0i0ii4 = new II01IloII(iI1o0111IO03, o1OIi1I00000oIO, context2, oI10i0Il3, (IOoil1iiIilo) null);
/* 267 */                   iI1o0111IO04 = iI1o0111IO03;
/* 268 */                   context = context2;
/* 269 */                   iloI0lOlll14.I00iio(objI00O0i0ii4);
                        } else {
/* 258 */                   iI1o0111IO04 = iI1o0111IO03;
/* 259 */                   context = context2;
                        }
/* 274 */               OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 276 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii4, iloI0lOlll14, ooiIlOl1iI2);
/* 285 */               View view = (View) iloI0lOlll14.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 287 */               boolean zI000OOo1O4 = iloI0lOlll14.I000OOo1O(view);
/* 291 */               Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                        Object obj10 = objI00O0i0ii5;
/* 295 */               if (zI000OOo1O4 || objI00O0i0ii5 == obj8) {
/* 301 */                   II1iO0iiI iI1iO0iiI = new II1iO0iiI(0);
/* 304 */                   iI1iO0iiI.I00iiI = view;
/* 306 */                   VarHandle.storeStoreFence();
/* 309 */                   iloI0lOlll14.I00iio(iI1iO0iiI);
                            obj10 = iI1iO0iiI;
                        }
/* 314 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI2, (Function1) obj10, iloI0lOlll14);
/* 330 */               boolean zI000OOo1O5 = iloI0lOlll14.I000OOo1O(iI1o0111IO04) | iloI0lOlll14.I000OOo1O(context) | iloI0lOlll14.I000OOo1O(o1ol100o0O);
/* 331 */               Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
                        Object obj11 = objI00O0i0ii6;
/* 335 */               if (zI000OOo1O5 || objI00O0i0ii6 == obj8) {
/* 341 */                   II1iOOOOOl01 iI1iOOOOOl01 = new II1iOOOOOl01(0);
/* 344 */                   iI1iOOOOOl01.I00iiI = iI1o0111IO04;
/* 346 */                   iI1iOOOOOl01.I00iiO = context;
/* 348 */                   iI1iOOOOOl01.I00iio = o1ol100o0O;
/* 350 */                   VarHandle.storeStoreFence();
/* 353 */                   iloI0lOlll14.I00iio(iI1iOOOOOl01);
                            obj11 = iI1iOOOOOl01;
                        }
/* 358 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI2, (Function1) obj11, iloI0lOlll14);
/* 361 */               IlIl1Io0lii1 ilIl1Io0lii12 = Ol0iOOO0.I0000Il00O;
/* 365 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 371 */               int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 375 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 379 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii12);
/* 385 */               IOl0oi0lOl1.I000lI.getClass();
/* 388 */               iloI0lOlll14.I00i0oil();
/* 391 */               boolean z4 = iloI0lOlll14.I00O10llo;
/* 395 */               IllOOo00lI illOOo00lI2 = O0iiOioolIi.I01101IOlO;
/* 397 */               if (z4) {
/* 399 */                   iloI0lOlll14.I000l1(illOOo00lI2);
                        } else {
/* 405 */                   iloI0lOlll14.I00io1l();
                        }
/* 409 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 411 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, o1iOIl0o10I0000Il00O);
/* 414 */               IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilO0;
/* 416 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll14, oO0lO0l0I000lI);
/* 419 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 423 */               IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ioIO;
/* 425 */               li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll14, numValueOf);
/* 428 */               li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 431 */               IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ilI0I1;
/* 433 */               li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 442 */               boolean zBooleanValue2 = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 450 */               O1ooIo101ll o1ooIo101ll3 = O1ooIo101ll.I00000oIO;
/* 454 */               II1oili iI1oili2 = II1oili.I00000oIO;
/* 456 */               if (zBooleanValue2) {
/* 461 */                   iloI0lOlll14.I00i01iIIliI(896286582);
/* 465 */                   IIo0l1 iIo0l1 = IIo0l1.I0000Il00O;
/* 467 */                   boolean zI000OOo1O6 = iloI0lOlll14.I000OOo1O(iI1o0111IO04);
/* 471 */                   Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
                            Object obj12 = objI00O0i0ii7;
/* 475 */                   if (zI000OOo1O6 || objI00O0i0ii7 == obj8) {
/* 483 */                       I00oooO i00oooO = new I00oooO(8);
/* 486 */                       i00oooO.I00iiI = iI1o0111IO04;
/* 488 */                       VarHandle.storeStoreFence();
/* 491 */                       iloI0lOlll14.I00iio(i00oooO);
                                obj12 = i00oooO;
                            }
/* 494 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj12;
/* 496 */                   boolean zI000OOo1O7 = iloI0lOlll14.I000OOo1O(iI1o0111IO04);
/* 502 */                   Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
                            Object obj13 = objI00O0i0ii8;
/* 506 */                   if (zI000OOo1O7 || objI00O0i0ii8 == obj8) {
/* 513 */                       II1iiO1I iI1iiO1I = new II1iiO1I(0);
/* 516 */                       iI1iiO1I.I00iiI = iI1o0111IO04;
/* 518 */                       VarHandle.storeStoreFence();
/* 521 */                       iloI0lOlll14.I00iio(iI1iiO1I);
                                obj13 = iI1iiO1I;
                            }
/* 524 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj13;
/* 526 */                   boolean zI000OOo1O8 = iloI0lOlll14.I000OOo1O(iI1o0111IO04);
/* 532 */                   Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
                            Object obj14 = objI00O0i0ii9;
/* 536 */                   if (zI000OOo1O8 || objI00O0i0ii9 == obj8) {
/* 543 */                       II1iil iI1iil = new II1iil(0);
/* 546 */                       iI1iil.I00iiI = iI1o0111IO04;
/* 548 */                       VarHandle.storeStoreFence();
/* 551 */                       iloI0lOlll14.I00iio(iI1iil);
                                obj14 = iI1iil;
                            }
/* 576 */                   iOioOOi0I2 = iOioOOi0I7;
/* 580 */                   iOioOOi0I = iOioOOi0I8;
/* 582 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 589 */                   iIoOlloI.I00000oIO(illiIl1l11O, ilIl1Io0lii12, Barcode.FORMAT_UPC_E, 0, true, iIo0l1, illOOo00lI3, (Function1) obj14, iloI0lOlll14, 25008, 8);
/* 593 */                   iloI0lOlll14.I0010I0i(false);
/* 596 */                   illOOo00lI = illOOo00lI2;
/* 598 */                   iOioOOi0I3 = iOioOOi0I5;
/* 600 */                   i2 = 0;
/* 601 */                   ilIl1Io0lii1 = ilIl1Io0lii12;
/* 603 */                   o1ooIo101ll = o1ooIo101ll3;
/* 605 */                   iOioOOi0I4 = iOioOOi0I6;
/* 607 */                   iI1oili = iI1oili2;
/* 609 */                   oI10i0Il = oI10i0IlI00000oOI;
/* 611 */                   obj2 = obj8;
/* 613 */                   z = zBooleanValue;
/* 615 */                   iI1o0111IO05 = iI1o0111IO04;
/* 617 */                   obj = context;
                            iloI0lOlll13 = iloI0lOlll14;
                        } else {
/* 628 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 630 */                   iOioOOi0I = iOioOOi0I8;
/* 632 */                   iOioOOi0I2 = iOioOOi0I7;
/* 643 */                   iloI0lOlll14.I00i01iIIliI(897521498);
/* 724 */                   oI10i0Il = oI10i0IlI00000oOI;
/* 744 */                   illOOo00lI = illOOo00lI2;
/* 746 */                   iOioOOi0I3 = iOioOOi0I5;
/* 748 */                   ilIl1Io0lii1 = ilIl1Io0lii12;
/* 750 */                   obj = context;
/* 752 */                   iOioOOi0I4 = iOioOOi0I6;
/* 754 */                   o1ooIo101ll = o1ooIo101ll3;
/* 756 */                   iI1oili = iI1oili2;
/* 758 */                   i2 = 0;
/* 760 */                   obj2 = obj8;
/* 762 */                   z = zBooleanValue;
/* 766 */                   Oo0i1oIIoOO.I00000oOI("Box Assist needs the camera. Please grant camera permission.", iO01II.I0001Ioi1lo(Ol0iOOO0.I0000oI00(iI1oili2.I00000oOI(o1ooIo101ll3, i1O01oOIoI0I.I00io1l), 1.0f), 32.0f), IOOiio0i.I0001Ioi1lo, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000O01llI0, iloI0lOlll1, 390, 0, 130040);
/* 769 */                   IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 771 */                   iloI0lOlll15.I0010I0i(false);
/* 774 */                   iI1o0111IO05 = iI1o0111IO04;
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 780 */               Object obj15 = obj;
/* 793 */               boolean zI000OOo1O9 = iloI0lOlll13.I000OOo1O(iI1o0111IO05) | iloI0lOlll13.I000OOo1O(obj15) | iloI0lOlll13.I000OOo1O(o1ol100o0O);
/* 794 */               Object objI00O0i0ii10 = iloI0lOlll13.I00O0i0ii();
/* 798 */               if (zI000OOo1O9) {
/* 805 */                   obj3 = obj2;
                        } else {
/* 800 */                   obj3 = obj2;
                            obj4 = objI00O0i0ii10;
/* 802 */                   if (objI00O0i0ii10 == obj3) {
                            }
/* 826 */                   OoiIlOl1iI ooiIlOl1iI3 = ooiIlOl1iI;
/* 830 */                   O1ooiI111i o1ooiI111iI00000oIO = Oll10I.I00000oIO(ilIl1Io0lii1, ooiIlOl1iI3, (PointerInputEventHandler) obj4);
/* 834 */                   zI000OOo1O = iloI0lOlll13.I000OOo1O(iI1o0111IO05);
/* 838 */                   Object objI00O0i0ii11 = iloI0lOlll13.I00O0i0ii();
/* 842 */                   if (!zI000OOo1O || objI00O0i0ii11 == obj3) {
/* 851 */                       i3 = 1;
/* 852 */                       I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(1);
/* 855 */                       i0o1Oi0IO1.I00000oOI = iI1o0111IO05;
/* 857 */                       VarHandle.storeStoreFence();
/* 860 */                       iloI0lOlll13.I00iio(i0o1Oi0IO1);
                                obj5 = i0o1Oi0IO1;
                            } else {
/* 847 */                       i3 = 1;
                                obj5 = objI00O0i0ii11;
                            }
/* 869 */                   II1oOI10.I00000oIO(Oll10I.I00000oIO(o1ooiI111iI00000oIO, ooiIlOl1iI3, (PointerInputEventHandler) obj5), iloI0lOlll13, i2);
/* 880 */                   String str = ((II1l1O1oi01) oI10i0Il.getValue()).I00000oIO.I00iOIl;
/* 882 */                   OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 892 */                   Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(oOiIOoiOO)).I00000oOI.I0000oI00;
/* 894 */                   IlilIIiIiO ililIIiIiO = IlilIIiIiO.I00li1OI;
/* 896 */                   II1o0111IO0 iI1o0111IO06 = iI1o0111IO05;
/* 899 */                   long j = IOOiio0i.I0001Ioi1lo;
/* 903 */                   O1ooIo101ll o1ooIo101ll4 = o1ooIo101ll;
/* 905 */                   II1oili iI1oili3 = iI1oili;
/* 913 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(iI1oili3.I00000oOI(o1ooIo101ll4, i1O01oOIoI0I.I00iio), 1.0f);
/* 917 */                   long j2 = IOOiio0i.I00000oOI;
/* 926 */                   long jI0000Il00O = IOOiio0i.I0000Il00O(0.55f, j2);
/* 930 */                   IOIIoiI1oi1 iOIIoiI1oi1 = iO0ioilo.I00000oIO;
/* 939 */                   O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(i0I1I0.I00000oOI(o1ooiI111iI0000oI00, jI0000Il00O, iOIIoiI1oi1), 0.0f, 16.0f, i3);
/* 943 */                   oI10i0Il2 = oI10i0Il;
/* 945 */                   zI000II = iloI0lOlll13.I000II(oI10i0Il2);
/* 949 */                   Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
                            obj6 = objI00O0i0ii12;
/* 953 */                   if (!zI000II || objI00O0i0ii12 == obj3) {
/* 961 */                       I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(22);
/* 964 */                       i0Il0IoIIOll.I00iiI = oI10i0Il2;
/* 966 */                       VarHandle.storeStoreFence();
/* 969 */                       iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                obj6 = i0Il0IoIIOll;
                            }
/* 1038 */                  Object obj16 = obj3;
/* 1053 */                  Oo0i1oIIoOO.I00000oOI(str, OiioloIlOlIi.I00000oOI(o1ooiI111iI000O01llI0, false, (Function1) obj6), j, null, 0L, null, ililIIiIiO, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, 1573248, 0, 129976);
/* 1089 */                  O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(Ol0iOOO0.I0000oI00(iI1oili3.I00000oOI(o1ooIo101ll4, i1O01oOIoI0I.I00l0OO0IO), 1.0f), IOOiio0i.I0000Il00O(0.55f, j2), iOIIoiI1oi1), 20.0f);
/* 1093 */                  z2 = z;
/* 1095 */                  zI000O01llI0 = iloI0lOlll1.I000O01llI0(z2);
/* 1099 */                  Object objI00O0i0ii13 = iloI0lOlll1.I00O0i0ii();
/* 1103 */                  if (!zI000O01llI0 || objI00O0i0ii13 == obj16) {
/* 1114 */                      z3 = false;
/* 1115 */                      II1ilOO1OIi iI1ilOO1OIi = new II1ilOO1OIi(0);
/* 1118 */                      iI1ilOO1OIi.I00iiI = z2;
/* 1120 */                      VarHandle.storeStoreFence();
/* 1123 */                      iloI0lOlll1.I00iio(iI1ilOO1OIi);
                                obj7 = iI1ilOO1OIi;
                            } else {
/* 1110 */                      z3 = false;
                                obj7 = objI00O0i0ii13;
                            }
/* 1128 */                  O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI0001Ioi1lo, z3, (Function1) obj7);
/* 1141 */                  IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 6);
/* 1147 */                  int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 1151 */                  OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 1155 */                  O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI);
/* 1159 */                  iloI0lOlll1.I00i0oil();
/* 1164 */                  if (iloI0lOlll1.I00O10llo) {
/* 1174 */                      iloI0lOlll1.I00io1l();
                            } else {
/* 1168 */                      iloI0lOlll1.I000l1(illOOo00lI);
                            }
/* 1178 */                  li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 1183 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, oO0lO0l0I000lI2);
/* 1188 */                  IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I2, iloI0lOlll1);
/* 1193 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 1278 */                  Oo0i1oIIoOO.I00000oOI(((II1l1O1oi01) oI10i0Il2.getValue()).I0000Il00O, Ol0iOOO0.I0000oI00(o1ooIo101ll4, 1.0f), j, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oOI.I000O01llI0, iloI0lOlll1, 432, 0, 130040);
/* 1281 */                  IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 1295 */                  if (((II1l1O1oi01) oI10i0Il2.getValue()).I0000O.length() <= 0) {
/* 1300 */                      iloI0lOlll16.I00i01iIIliI(400232954);
/* 1364 */                      o1ooIo101ll2 = o1ooIo101ll4;
/* 1366 */                      Oo0i1oIIoOO.I00000oOI(((II1l1O1oi01) oI10i0Il2.getValue()).I0000O, Ol0iOOO0.I0000oI00(o1ooIo101ll4, 1.0f), j, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(oOiIOoiOO)).I00000oOI.I000OiO, iloI0lOlll1, 432, 0, 130040);
/* 1369 */                      iloI0lOlll16 = iloI0lOlll1;
/* 1372 */                      iloI0lOlll16.I0010I0i(false);
                            } else {
/* 1376 */                      o1ooIo101ll2 = o1ooIo101ll4;
/* 1382 */                      iloI0lOlll16.I00i01iIIliI(400522649);
/* 1385 */                      iloI0lOlll16.I0010I0i(false);
                            }
/* 1450 */                  Oo0i1oIIoOO.I00000oOI("Tap: act  •  Double-tap: ask  •  Hold: repeat  •  Swipe: mode  •  Vol-down: act  •  Vol-up: mode", Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f), IOOiio0i.I0000Il00O(0.8f, j), null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(oOiIOoiOO)).I00000oOI.I000l1, iloI0lOlll1, 438, 0, 130040);
/* 1453 */                  IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 1456 */                  iloI0lOlll17.I0010I0i(true);
/* 1459 */                  iloI0lOlll17.I0010I0i(true);
/* 1462 */                  iI1o0111IO02 = iI1o0111IO06;
                            iloI0lOlll12 = iloI0lOlll17;
                        }
/* 809 */               II1ilOl1I iI1ilOl1I = new II1ilOl1I(i2);
/* 812 */               iI1ilOl1I.I00000oOI = iI1o0111IO05;
/* 814 */               iI1ilOl1I.I0000Il00O = obj15;
/* 816 */               iI1ilOl1I.I0000O = o1ol100o0O;
/* 818 */               VarHandle.storeStoreFence();
/* 821 */               iloI0lOlll13.I00iio(iI1ilOl1I);
                        obj4 = iI1ilOl1I;
/* 826 */               OoiIlOl1iI ooiIlOl1iI32 = ooiIlOl1iI;
/* 830 */               O1ooiI111i o1ooiI111iI00000oIO2 = Oll10I.I00000oIO(ilIl1Io0lii1, ooiIlOl1iI32, (PointerInputEventHandler) obj4);
/* 834 */               zI000OOo1O = iloI0lOlll13.I000OOo1O(iI1o0111IO05);
/* 838 */               Object objI00O0i0ii112 = iloI0lOlll13.I00O0i0ii();
/* 842 */               if (zI000OOo1O) {
/* 851 */                   i3 = 1;
/* 852 */                   I0o1Oi0IO1 i0o1Oi0IO12 = new I0o1Oi0IO1(1);
/* 855 */                   i0o1Oi0IO12.I00000oOI = iI1o0111IO05;
/* 857 */                   VarHandle.storeStoreFence();
/* 860 */                   iloI0lOlll13.I00iio(i0o1Oi0IO12);
                            obj5 = i0o1Oi0IO12;
/* 869 */                   II1oOI10.I00000oIO(Oll10I.I00000oIO(o1ooiI111iI00000oIO2, ooiIlOl1iI32, (PointerInputEventHandler) obj5), iloI0lOlll13, i2);
/* 880 */                   String str2 = ((II1l1O1oi01) oI10i0Il.getValue()).I00000oIO.I00iOIl;
/* 882 */                   OOiIOoiOO oOiIOoiOO2 = O1OoilIO.I00000oOI;
/* 892 */                   Oo0lloOiiIOI oo0lloOiiIOI2 = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(oOiIOoiOO2)).I00000oOI.I0000oI00;
/* 894 */                   IlilIIiIiO ililIIiIiO2 = IlilIIiIiO.I00li1OI;
/* 896 */                   II1o0111IO0 iI1o0111IO062 = iI1o0111IO05;
/* 899 */                   long j3 = IOOiio0i.I0001Ioi1lo;
/* 903 */                   O1ooIo101ll o1ooIo101ll42 = o1ooIo101ll;
/* 905 */                   II1oili iI1oili32 = iI1oili;
/* 913 */                   O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(iI1oili32.I00000oOI(o1ooIo101ll42, i1O01oOIoI0I.I00iio), 1.0f);
/* 917 */                   long j22 = IOOiio0i.I00000oOI;
/* 926 */                   long jI0000Il00O2 = IOOiio0i.I0000Il00O(0.55f, j22);
/* 930 */                   IOIIoiI1oi1 iOIIoiI1oi12 = iO0ioilo.I00000oIO;
/* 939 */                   O1ooiI111i o1ooiI111iI000O01llI02 = iO01II.I000O01llI0(i0I1I0.I00000oOI(o1ooiI111iI0000oI002, jI0000Il00O2, iOIIoiI1oi12), 0.0f, 16.0f, i3);
/* 943 */                   oI10i0Il2 = oI10i0Il;
/* 945 */                   zI000II = iloI0lOlll13.I000II(oI10i0Il2);
/* 949 */                   Object objI00O0i0ii122 = iloI0lOlll13.I00O0i0ii();
                            obj6 = objI00O0i0ii122;
/* 953 */                   if (!zI000II) {
/* 961 */                       I0Il0IoIIOll i0Il0IoIIOll2 = new I0Il0IoIIOll(22);
/* 964 */                       i0Il0IoIIOll2.I00iiI = oI10i0Il2;
/* 966 */                       VarHandle.storeStoreFence();
/* 969 */                       iloI0lOlll13.I00iio(i0Il0IoIIOll2);
                                obj6 = i0Il0IoIIOll2;
/* 1038 */                      Object obj162 = obj3;
/* 1053 */                      Oo0i1oIIoOO.I00000oOI(str2, OiioloIlOlIi.I00000oOI(o1ooiI111iI000O01llI02, false, (Function1) obj6), j3, null, 0L, null, ililIIiIiO2, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, oo0lloOiiIOI2, iloI0lOlll1, 1573248, 0, 129976);
/* 1089 */                      O1ooiI111i o1ooiI111iI0001Ioi1lo2 = iO01II.I0001Ioi1lo(i0I1I0.I00000oOI(Ol0iOOO0.I0000oI00(iI1oili32.I00000oOI(o1ooIo101ll42, i1O01oOIoI0I.I00l0OO0IO), 1.0f), IOOiio0i.I0000Il00O(0.55f, j22), iOIIoiI1oi12), 20.0f);
/* 1093 */                      z2 = z;
/* 1095 */                      zI000O01llI0 = iloI0lOlll1.I000O01llI0(z2);
/* 1099 */                      Object objI00O0i0ii132 = iloI0lOlll1.I00O0i0ii();
/* 1103 */                      if (zI000O01llI0) {
/* 1114 */                          z3 = false;
/* 1115 */                          II1ilOO1OIi iI1ilOO1OIi2 = new II1ilOO1OIi(0);
/* 1118 */                          iI1ilOO1OIi2.I00iiI = z2;
/* 1120 */                          VarHandle.storeStoreFence();
/* 1123 */                          iloI0lOlll1.I00iio(iI1ilOO1OIi2);
                                    obj7 = iI1ilOO1OIi2;
/* 1128 */                          O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI0001Ioi1lo2, z3, (Function1) obj7);
/* 1141 */                          IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 6);
/* 1147 */                          int iHashCode22 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 1151 */                          OO0lO0l0 oO0lO0l0I000lI22 = iloI0lOlll1.I000lI();
/* 1155 */                          O1ooiI111i o1ooiI111iI0000Il00O22 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 1159 */                          iloI0lOlll1.I00i0oil();
/* 1164 */                          if (iloI0lOlll1.I00O10llo) {
                                    }
/* 1178 */                          li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, iOOlo1O01OI00000oIO2);
/* 1183 */                          li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, oO0lO0l0I000lI22);
/* 1188 */                          IIl001iO0Io.I001IIilI0O(iHashCode22, iloI0lOlll1, iOioOOi0I2, iloI0lOlll1);
/* 1193 */                          li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1ooiI111iI0000Il00O22);
/* 1278 */                          Oo0i1oIIoOO.I00000oOI(((II1l1O1oi01) oI10i0Il2.getValue()).I0000Il00O, Ol0iOOO0.I0000oI00(o1ooIo101ll42, 1.0f), j3, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO2)).I00000oOI.I000O01llI0, iloI0lOlll1, 432, 0, 130040);
/* 1281 */                          IloI0lOlll1 iloI0lOlll162 = iloI0lOlll1;
/* 1295 */                          if (((II1l1O1oi01) oI10i0Il2.getValue()).I0000O.length() <= 0) {
                                    }
/* 1450 */                          Oo0i1oIIoOO.I00000oOI("Tap: act  •  Double-tap: ask  •  Hold: repeat  •  Swipe: mode  •  Vol-down: act  •  Vol-up: mode", Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f), IOOiio0i.I0000Il00O(0.8f, j3), null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll162.I000iOII(oOiIOoiOO2)).I00000oOI.I000l1, iloI0lOlll1, 438, 0, 130040);
/* 1453 */                          IloI0lOlll1 iloI0lOlll172 = iloI0lOlll1;
/* 1456 */                          iloI0lOlll172.I0010I0i(true);
/* 1459 */                          iloI0lOlll172.I0010I0i(true);
/* 1462 */                          iI1o0111IO02 = iI1o0111IO062;
                                    iloI0lOlll12 = iloI0lOlll172;
                                }
                            }
                        }
                    } else {
/* 1471 */              iloI0lOlll14.I00OilO00Il();
/* 1474 */              iI1o0111IO02 = iI1o0111IO0;
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 1476 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1480 */          if (oOloioIlI001IO000 != null) {
/* 1486 */              I0Il0I1o i0Il0I1o = new I0Il0I1o(13);
/* 1491 */              i0Il0I1o.I00iiO = o1ol100o0O;
/* 1493 */              i0Il0I1o.I00iiI = iI1o0111IO02;
/* 1495 */              VarHandle.storeStoreFence();
/* 1498 */              oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }
            }
