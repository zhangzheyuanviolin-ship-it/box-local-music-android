            package p000;

            import android.content.res.Configuration;
            import android.view.KeyEvent;
            import android.view.View;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ilIoOii1l {
                /* JADX WARN: Removed duplicated region for block: B:117:0x02b9  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02c3  */
                /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(boolean z, Function1 function1, O1ooiI111i o1ooiI111i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    IOii1l iOii1l2;
                    OOloioIl oOloioIlI001IO000;
                    OI10i0Il oI10i0Il;
                    OIooi1iOiOol oIooi1iOiOol;
                    Object obj;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
                    int i4;
                    Object obj3;
/* 14 */            iloI0lOlll1.I00i0O(1597265892);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 35 */            if ((i & 48) == 0) {
/* 48 */                i3 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 49 */            int i5 = i2 & 4;
/* 51 */            if (i5 == 0) {
/* 60 */                if ((i & 384) == 0) {
/* 62 */                    o1ooiI111i2 = o1ooiI111i;
/* 75 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 78 */                if ((i & 3072) == 0) {
/* 91 */                    i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 108 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
/* 698 */                   iOii1l2 = iOii1l;
/* 699 */                   iloI0lOlll1.I00OilO00Il();
                        } else {
/* 110 */                   if (i5 != 0) {
/* 112 */                       o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                            }
/* 121 */                   Object obj4 = (Configuration) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oIO);
/* 129 */                   View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 139 */                   boolean zI000II = iloI0lOlll1.I000II(obj4) | iloI0lOlll1.I000II(view);
/* 140 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 144 */                   Object obj5 = IOl11li.I00000oIO;
                            Object obj6 = objI00O0i0ii;
/* 146 */                   if (zI000II || objI00O0i0ii == obj5) {
/* 152 */                       i00I1l11OlI i00i1l11oli = new i00I1l11OlI();
/* 155 */                       i00i1l11oli.I00000oIO = view;
/* 157 */                       VarHandle.storeStoreFence();
/* 160 */                       iloI0lOlll1.I00iio(i00i1l11oli);
                                obj6 = i00i1l11oli;
                            }
/* 163 */                   Object obj7 = (i00I1l11OlI) obj6;
/* 171 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 173 */                   int i6 = O1ioliIli0o.I00000oIO;
/* 177 */                   int iI00l0OO0IO = iiIooOOOI.I00l0OO0IO(48.0f);
/* 181 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 185 */                   if (objI00O0i0ii2 == obj5) {
/* 188 */                       objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 192 */                       iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 195 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 197 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 201 */                   if (objI00O0i0ii3 == obj5) {
/* 205 */                       objI00O0i0ii3 = new OIooi1iOiOol(0);
/* 208 */                       iloI0lOlll1.I00iio(objI00O0i0ii3);
                            }
/* 211 */                   OIooi1iOiOol oIooi1iOiOol2 = (OIooi1iOiOol) objI00O0i0ii3;
/* 213 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 217 */                   if (objI00O0i0ii4 == obj5) {
/* 221 */                       objI00O0i0ii4 = new OIooi1iOiOol(0);
/* 224 */                       iloI0lOlll1.I00iio(objI00O0i0ii4);
                            }
/* 227 */                   OIooi1iOiOol oIooi1iOiOol3 = (OIooi1iOiOol) objI00O0i0ii4;
/* 229 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 233 */                   if (objI00O0i0ii5 == obj5) {
/* 237 */                       objI00O0i0ii5 = new Ili1lII();
/* 240 */                       iloI0lOlll1.I00iio(objI00O0i0ii5);
                            }
/* 243 */                   Ili1lII ili1lII = (Ili1lII) objI00O0i0ii5;
/* 245 */                   int i7 = i3;
/* 253 */                   Ol1oolo ol1oolo = (Ol1oolo) iloI0lOlll1.I000iOII(IOlO0o100i1i.I00100o1O0lo);
/* 258 */                   String strI00000oIO = lOi10Ol.I00000oIO(R.string.m3c_dropdown_menu_expanded, iloI0lOlll1);
/* 265 */                   String strI00000oIO2 = lOi10Ol.I00000oIO(R.string.m3c_dropdown_menu_collapsed, iloI0lOlll1);
/* 272 */                   String strI00000oIO3 = lOi10Ol.I00000oIO(R.string.m3c_dropdown_menu_toggle, iloI0lOlll1);
/* 276 */                   O1ooiI111i o1ooiI111i3 = o1ooiI111i2;
/* 278 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 282 */                   if (objI00O0i0ii6 == obj5) {
/* 286 */                       Il1Oio0I il1Oio0I = new Il1Oio0I();
/* 289 */                       oI10i0Il = oI10i0Il3;
/* 293 */                       il1Oio0I.I00000oIO = "PrimaryNotEditable";
/* 295 */                       VarHandle.storeStoreFence();
/* 298 */                       objI00O0i0ii6 = lOO00IiI0li.I00000oIO(il1Oio0I);
/* 302 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            } else {
/* 306 */                       oI10i0Il = oI10i0Il3;
                            }
/* 308 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii6;
/* 310 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 314 */                   if (objI00O0i0ii7 == obj5) {
/* 318 */                       objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 322 */                       iloI0lOlll1.I00iio(objI00O0i0ii7);
                            }
/* 325 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii7;
/* 329 */                   int i8 = i7 & 14;
/* 341 */                   int i9 = i7 & 112;
/* 364 */                   boolean zI000II2 = iloI0lOlll1.I000II(iiIooOOOI) | (i8 == 4) | (i9 == 32) | iloI0lOlll1.I000II(obj7);
/* 365 */                   Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 369 */                   if (zI000II2 || objI00O0i0ii8 == obj5) {
/* 379 */                       Il1ii01 il1ii01 = new Il1ii01();
/* 382 */                       il1ii01.I00000oIO = ili1lII;
/* 384 */                       il1ii01.I00000oOI = z;
/* 386 */                       il1ii01.I0000Il00O = oI10i0Il5;
/* 388 */                       il1ii01.I0000O = strI00000oIO;
/* 390 */                       il1ii01.I0000oI00 = strI00000oIO2;
/* 392 */                       il1ii01.I0001Ioi1lo = strI00000oIO3;
/* 394 */                       il1ii01.I000II = ol1oolo;
/* 396 */                       il1ii01.I000O01llI0 = oI10i0Il4;
/* 398 */                       il1ii01.I000OOo1O = function1;
/* 400 */                       il1ii01.I000OiO = oIooi1iOiOol2;
/* 402 */                       oIooi1iOiOol = oIooi1iOiOol3;
/* 404 */                       il1ii01.I000iOII = oIooi1iOiOol;
/* 406 */                       VarHandle.storeStoreFence();
/* 409 */                       iloI0lOlll1.I00iio(il1ii01);
                                obj = il1ii01;
                            } else {
/* 374 */                       oIooi1iOiOol = oIooi1iOiOol3;
                                obj = objI00O0i0ii8;
                            }
/* 412 */                   Il1ii01 il1ii012 = (Il1ii01) obj;
/* 424 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj7) | iloI0lOlll1.I0000oI00(iI00l0OO0IO);
/* 425 */                   Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 429 */                   if (zI000OOo1O || objI00O0i0ii9 == obj5) {
/* 440 */                       IOOllI0o iOOllI0o = new IOOllI0o(1);
/* 443 */                       iOOllI0o.I00iiO = obj7;
/* 445 */                       iOOllI0o.I00iiI = iI00l0OO0IO;
/* 447 */                       oI10i0Il2 = oI10i0Il;
/* 449 */                       iOOllI0o.I00iio = oI10i0Il2;
/* 451 */                       iOOllI0o.I00ilI0I1 = oIooi1iOiOol2;
/* 453 */                       iOOllI0o.I00ilO0 = oIooi1iOiOol;
/* 455 */                       VarHandle.storeStoreFence();
/* 458 */                       iloI0lOlll1.I00iio(iOOllI0o);
                                obj2 = iOOllI0o;
                            } else {
/* 434 */                       oI10i0Il2 = oI10i0Il;
                                obj2 = objI00O0i0ii9;
                            }
/* 463 */                   o1ooiI111i2 = o1ooiI111i3;
/* 465 */                   O1ooiI111i o1ooiI111iI00000oIO = iO010ilOIO.I00000oIO(o1ooiI111i2, (Function1) obj2);
/* 472 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 478 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 482 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 486 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 492 */                   IOl0oi0lOl1.I000lI.getClass();
/* 495 */                   iloI0lOlll1.I00i0oil();
/* 502 */                   if (iloI0lOlll1.I00O10llo) {
/* 506 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 510 */                       iloI0lOlll1.I00io1l();
                            }
/* 515 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 520 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 529 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 532 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 537 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 548 */                   iOii1l2 = iOii1l;
/* 550 */                   iOii1l2.invoke(il1ii012, iloI0lOlll1, Integer.valueOf((i7 >> 6) & 112));
/* 554 */                   iloI0lOlll1.I0010I0i(true);
/* 557 */                   if (z) {
/* 562 */                       iloI0lOlll1.I00i01iIIliI(209925475);
/* 573 */                       boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(obj7) | iloI0lOlll1.I0000oI00(iI00l0OO0IO);
/* 574 */                       Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                                Object obj8 = objI00O0i0ii10;
/* 578 */                       if (zI000OOo1O2 || objI00O0i0ii10 == obj5) {
/* 585 */                           Oio1o1iIliO oio1o1iIliO = new Oio1o1iIliO(3);
/* 588 */                           oio1o1iIliO.I00ilI0I1 = obj7;
/* 590 */                           oio1o1iIliO.I00iiO = iI00l0OO0IO;
/* 592 */                           oio1o1iIliO.I00iiI = oI10i0Il2;
/* 594 */                           oio1o1iIliO.I00iio = oIooi1iOiOol;
/* 596 */                           VarHandle.storeStoreFence();
/* 599 */                           iloI0lOlll1.I00iio(oio1o1iIliO);
                                    obj8 = oio1o1iIliO;
                                }
/* 605 */                       ilO000l.I00000oIO((IllOOo00lI) obj8, iloI0lOlll1, 0);
/* 608 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 619 */                       iloI0lOlll1.I00i01iIIliI(210258942);
/* 622 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 630 */                   boolean z2 = i8 == 4;
/* 631 */                   Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
/* 635 */                   if (z2 || objI00O0i0ii11 == obj5) {
/* 644 */                       i4 = 1;
/* 645 */                       IOool10Il0 iOool10Il0 = new IOool10Il0(i4);
/* 648 */                       iOool10Il0.I00iiI = z;
/* 650 */                       iOool10Il0.I00iiO = ili1lII;
/* 652 */                       VarHandle.storeStoreFence();
/* 655 */                       iloI0lOlll1.I00iio(iOool10Il0);
                                obj3 = iOool10Il0;
                            } else {
/* 640 */                       i4 = 1;
                                obj3 = objI00O0i0ii11;
                            }
/* 660 */                   iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj3, iloI0lOlll1);
/* 669 */                   int i10 = i9 == 32 ? i4 : 0;
/* 670 */                   Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                            Object obj9 = objI00O0i0ii12;
/* 674 */                   if (i10 != 0 || objI00O0i0ii12 == obj5) {
/* 681 */                       Il1iIiI il1iIiI = new Il1iIiI(0);
/* 684 */                       il1iIiI.I00iiI = function1;
/* 686 */                       VarHandle.storeStoreFence();
/* 689 */                       iloI0lOlll1.I00iio(il1iIiI);
                                obj9 = il1iIiI;
                            }
/* 694 */                   iOOloioiO.I00000oIO(z, (IllOOo00lI) obj9, iloI0lOlll1, i8);
                        }
/* 702 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 706 */               if (oOloioIlI001IO000 == null) {
/* 710 */                   Il1iO1l1O il1iO1l1O = new Il1iO1l1O();
/* 713 */                   il1iO1l1O.I00iOIl = z;
/* 715 */                   il1iO1l1O.I00iiI = function1;
/* 717 */                   il1iO1l1O.I00iiO = o1ooiI111i2;
/* 719 */                   il1iO1l1O.I00iio = iOii1l2;
/* 723 */                   il1iO1l1O.I00ilI0I1 = i;
/* 727 */                   il1iO1l1O.I00ilO0 = i2;
/* 729 */                   VarHandle.storeStoreFence();
/* 732 */                   oOloioIlI001IO000.I0000O = il1iO1l1O;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 53 */            i3 |= 384;
/* 55 */            o1ooiI111i2 = o1ooiI111i;
/* 78 */            if ((i & 3072) == 0) {
                    }
/* 108 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
                    }
/* 702 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 706 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final boolean I00000oOI(KeyEvent keyEvent) {
/* 1 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 5 */             int i = O0O11OI0i.I00IoiI;
                    return O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I000O01llI0) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0010I0i) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0oii1o);
                }
            }
