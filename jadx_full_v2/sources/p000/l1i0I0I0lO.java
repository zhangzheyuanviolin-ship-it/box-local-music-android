            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1i0I0I0lO {
                public static final void I00000oIO(boolean z, OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IloI0lOlll1 iloI0lOlll12;
                    int i3;
                    OI10i0Il oI10i0Il;
/* 3 */             OloIl1l1oOii oloIl1l1oOii2 = oloIl1l1oOii;
/* 7 */             O1ol100o0O o1ol100o0O2 = o1ol100o0O;
/* 9 */             IlliIl1l11O illiIl1l11O2 = illiIl1l11O;
/* 11 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 13 */            String str = o1oIOiI11o0.I00000oIO;
/* 18 */            iloI0lOlll13.I00i0O(1305213162);
/* 80 */            int i4 = i | (iloI0lOlll13.I000O01llI0(z) ? 4 : 2) | (iloI0lOlll13.I000OOo1O(oloIl1l1oOii2) ? 32 : 16) | (iloI0lOlll13.I000OOo1O(o1oIOiI11o0) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll13.I000OOo1O(o1ol100o0O2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll13.I000OOo1O(illiIl1l11O2) ? 16384 : 8192);
/* 97 */            if (iloI0lOlll13.I00OIl(i4 & 1, (i4 & 9363) != 9362)) {
/* 99 */                Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 103 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 105 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 109 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 113 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 117 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii;
/* 119 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 126 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 128 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 132 */                   iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 135 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 139 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O2.I000OOo1O, iloI0lOlll13);
/* 144 */               Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll13);
/* 154 */               IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 162 */               i00Ii11100lo i00ii11100lo = (i00Ii11100lo) iloI0lOlll13.I000iOII(IOlO0o100i1i.I001IIilI0O);
/* 164 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 168 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 172 */                   long jI00000oIO = ((O0oI1IIioO0) i00ii11100lo).I00000oIO();
/* 176 */                   i3 = i4;
/* 177 */                   oI10i0Il = oI10i0IlI00000oOI;
/* 186 */                   objI00O0i0ii3 = Iil1010O.I00000oIO(iiIooOOOI.I00O0o1oo((int) (jI00000oIO >> 32)));
/* 190 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        } else {
/* 194 */                   i3 = i4;
/* 195 */                   oI10i0Il = oI10i0IlI00000oOI;
                        }
/* 199 */               float f = ((Iil1010O) objI00O0i0ii3).I00iOIl;
/* 213 */               O1oOil o1oOil = (O1oOil) ((O1oiOloOo) oI10i0Il.getValue()).I0000O.get(str);
/* 217 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 219 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 223 */               II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00io1l;
/* 227 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 235 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 239 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 243 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000oI00);
/* 249 */               IOl0oi0lOl1.I000lI.getClass();
/* 252 */               iloI0lOlll13.I00i0oil();
/* 255 */               int i5 = i3;
/* 257 */               boolean z2 = iloI0lOlll13.I00O10llo;
/* 261 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 263 */               if (z2) {
/* 265 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 271 */                   iloI0lOlll13.I00io1l();
                        }
/* 275 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 277 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 280 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 282 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI);
/* 285 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 289 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 291 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, numValueOf);
/* 294 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 297 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 299 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 302 */               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 314 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(2.0f), iI0O000iIl, iloI0lOlll13, 54);
/* 322 */               int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 326 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 332 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 336 */               iloI0lOlll13.I00i0oil();
/* 343 */               if (iloI0lOlll13.I00O10llo) {
/* 345 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 349 */                   iloI0lOlll13.I00io1l();
                        }
/* 352 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 357 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 360 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 363 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 366 */               String str2 = o1oIOiI11o0.I00000oOI;
/* 377 */               String str3 = str2.length() == 0 ? str : str2;
/* 385 */               String strI0000Il00O = lOOoli.I0000Il00O(R.string.cd_change_model, new Object[]{str3}, iloI0lOlll13);
/* 389 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(2.0f);
/* 395 */               O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(o1ooIo101ll, OiI11O1i1.I00000oIO);
/* 399 */               String str4 = str3;
/* 401 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 423 */               O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(o1ooiI111iI00000oIO, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1oi11O, iO0ioilo.I00000oIO);
/* 427 */               boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(o1oIOiI11o0);
/* 431 */               Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                        Object obj = objI00O0i0ii4;
/* 435 */               if (zI000OOo1O || objI00O0i0ii4 == iOO0o0I1l) {
/* 442 */                   O1oiilO o1oiilO = new O1oiilO(2);
/* 445 */                   o1oiilO.I00iiI = o1oIOiI11o0;
/* 447 */                   o1oiilO.I00iiO = oI10i0Il3;
/* 449 */                   o1oiilO.I00iio = oI10i0Il2;
/* 451 */                   VarHandle.storeStoreFence();
/* 454 */                   iloI0lOlll13.I00iio(o1oiilO);
                            obj = o1oiilO;
                        }
/* 482 */               O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(iO01II.I000OiO(i1Ioo1o0.I00000oOI(o1ooiI111iI00000oOI, z, null, (IllOOo00lI) obj, 14), 8.0f, 0.0f, 2.0f, 0.0f, 10), 0.0f, 4.0f, 1);
/* 493 */               boolean z3 = (i5 & 14) == 4;
/* 494 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 500 */               int i6 = 3;
                        Object obj2 = objI00O0i0ii5;
/* 501 */               if (z3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 507 */                   II1ilOO1OIi iI1ilOO1OIi = new II1ilOO1OIi(3);
/* 510 */                   iI1ilOO1OIi.I00iiI = z;
/* 512 */                   VarHandle.storeStoreFence();
/* 515 */                   iloI0lOlll13.I00iio(iI1ilOO1OIi);
                            obj2 = iI1ilOO1OIi;
                        }
/* 520 */               O1ooiI111i o1ooiI111iI00000oIO2 = iIlll1lo.I00000oIO(o1ooiI111iI000O01llI0, (Function1) obj2);
/* 524 */               boolean zI000II = iloI0lOlll13.I000II(strI0000Il00O);
/* 528 */               Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
                        Object obj3 = objI00O0i0ii6;
/* 532 */               if (zI000II || objI00O0i0ii6 == iOO0o0I1l) {
/* 540 */                   I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(24);
/* 543 */                   i0ioO0Oio0ll.I00iiI = strI0000Il00O;
/* 545 */                   VarHandle.storeStoreFence();
/* 548 */                   iloI0lOlll13.I00iio(i0ioO0Oio0ll);
                            obj3 = i0ioO0Oio0ll;
                        }
/* 554 */               O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO2, false, (Function1) obj3);
/* 562 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll13, 54);
/* 568 */               int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 572 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 576 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI2);
/* 580 */               iloI0lOlll13.I00i0oil();
/* 585 */               if (iloI0lOlll13.I00O10llo) {
/* 587 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 591 */                   iloI0lOlll13.I00io1l();
                        }
/* 594 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO2);
/* 597 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI3);
/* 602 */               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 605 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 612 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, 21.0f);
/* 619 */               O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 625 */               int iHashCode4 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 629 */               OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll13.I000lI();
/* 633 */               O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000lI);
/* 637 */               iloI0lOlll13.I00i0oil();
/* 644 */               if (iloI0lOlll13.I00O10llo) {
/* 646 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 650 */                   iloI0lOlll13.I00io1l();
                        }
/* 653 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O2);
/* 656 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI4);
/* 659 */               IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 662 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O4);
/* 696 */               OI10i0Il oI10i0Il4 = oI10i0Il;
/* 700 */               oloIl1l1oOii2 = oloIl1l1oOii;
/* 702 */               lOOiIi110l.I00000oIO(oloIl1l1oOii2, o1oIOiI11o0, (O1oIo0iI00) ((O1oiOloOo) oI10i0Il.getValue()).I0000Il00O.get(str), null, iloI0lOlll13, (i5 >> 3) & 126, 8);
/* 750 */               i2 = 1;
/* 765 */               O1OooO0IlOo.I00000oOI((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiI, null, Il0iiiII11.I000II(null, 0.0f, 7).I00000oIO(Il0iiiII11.I0000oI00(null, 3)), Il0iiiII11.I000O01llI0(7, 0.0f).I00000oIO(Il0iiiII11.I0001Ioi1lo(null, 3)), null, i1l0O1oO.I00000oIO, iloI0lOlll1, 1600518);
/* 770 */               iloI0lOlll1.I0010I0i(true);
/* 783 */               Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000lI;
/* 806 */               O1ooiI111i o1ooiI111iI0010I0i = Ol0iOOO0.I0010I0i(iO01II.I000OiO(o1ooIo101ll, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, f - 250.0f);
/* 810 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 814 */               if (objI00O0i0ii7 == iOO0o0I1l) {
/* 820 */                   objI00O0i0ii7 = new I10I0o1ii10(27);
/* 823 */                   iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 874 */               Oo0i1oIIoOO.I00000oOI(str4, OiioloIlOlIi.I00000oIO(o1ooiI111iI0010I0i, (Function1) objI00O0i0ii7), 0L, null, 0L, null, null, null, 0L, null, 0L, 5, false, 1, 0, null, oo0lloOiiIOI, iloI0lOlll1, 0, 24960, 110588);
/* 894 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 896 */               IoOoiI1II00i.I00000oIO(iOOI0ol111Ol.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 20.0f), 0L, iloI0lOlll14, 432, 8);
/* 899 */               iloI0lOlll14.I0010I0i(true);
/* 902 */               iloI0lOlll14.I0010I0i(true);
/* 905 */               iloI0lOlll14.I0010I0i(true);
/* 912 */               O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) oI10i0Il3.getValue();
/* 924 */               if (!((Boolean) oI10i0Il2.getValue()).booleanValue() || o1oIOiI11o02 == null) {
/* 1023 */                  o1ol100o0O2 = o1ol100o0O;
/* 1025 */                  illiIl1l11O2 = illiIl1l11O;
/* 1031 */                  iloI0lOlll14.I00i01iIIliI(1269918904);
/* 1034 */                  iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 931 */                   iloI0lOlll14.I00i01iIIliI(1269507596);
/* 934 */                   Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
                            Object obj4 = objI00O0i0ii8;
/* 938 */                   if (objI00O0i0ii8 == iOO0o0I1l) {
/* 944 */                       O0loollioliO o0loollioliO = new O0loollioliO(29);
/* 947 */                       o0loollioliO.I00iiI = oI10i0Il2;
/* 949 */                       VarHandle.storeStoreFence();
/* 952 */                       iloI0lOlll14.I00iio(o0loollioliO);
                                obj4 = o0loollioliO;
                            }
/* 956 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) obj4;
/* 960 */                   IO1Io01OlliI iO1Io01OlliI = new IO1Io01OlliI(i6);
/* 963 */                   iO1Io01OlliI.I00ilI0I1 = oloIl1l1oOii2;
/* 965 */                   o1ol100o0O2 = o1ol100o0O;
/* 967 */                   iO1Io01OlliI.I00ilO0 = o1ol100o0O2;
/* 969 */                   iO1Io01OlliI.I00iiI = oI10i0Il4;
/* 971 */                   illiIl1l11O2 = illiIl1l11O;
/* 973 */                   iO1Io01OlliI.I00iio = illiIl1l11O2;
/* 975 */                   iO1Io01OlliI.I00iiO = oI10i0Il2;
/* 977 */                   VarHandle.storeStoreFence();
/* 1013 */                  l1OloIOiO01.I00000oIO(illOOo00lI, null, ol010000lo00I00000oOI, 0.0f, false, null, 0L, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(385172625, iO1Io01OlliI, iloI0lOlll14), iloI0lOlll1, 6, 3072, 8186);
/* 1016 */                  IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 1019 */                  iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll15;
                        }
                    } else {
/* 1038 */              i2 = 1;
/* 1039 */              iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 1042 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1046 */          if (oOloioIlI001IO000 != null) {
/* 1050 */              O11I0O0i o11I0O0i = new O11I0O0i(i2);
/* 1053 */              o11I0O0i.I00iiI = z;
/* 1055 */              o11I0O0i.I00iiO = oloIl1l1oOii2;
/* 1057 */              o11I0O0i.I00ilI0I1 = o1oIOiI11o0;
/* 1059 */              o11I0O0i.I00iio = o1ol100o0O2;
/* 1061 */              o11I0O0i.I00ilO0 = illiIl1l11O2;
/* 1063 */              VarHandle.storeStoreFence();
/* 1066 */              oOloioIlI001IO000.I0000O = o11I0O0i;
                    }
                }
            }
