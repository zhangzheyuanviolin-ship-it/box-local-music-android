            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOioi0 {
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, boolean z, Io1o01Ol0i01 io1o01Ol0i01, Function1 function1, Function1 function12, O1ooiI111i o1ooiI111i, long j, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    boolean z2;
                    Function1 function13;
                    Function1 function14;
                    Io1o01Ol0i01 io1o01Ol0i012;
                    OloIl1l1oOii oloIl1l1oOii2;
                    int i3;
                    IloI0lOlll1 iloI0lOlll12;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    O1ooiI111i o1ooiI111iI00000oOI;
                    IoiOolO1iOo ioiOolO1iOoI0000O;
/* 15 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 22 */            iloI0lOlll13.I00i0O(2064262808);
/* 27 */            if ((i & 6) == 0) {
/* 38 */                i2 = (iloI0lOlll13.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | i;
                    } else {
/* 40 */                i2 = i;
                    }
/* 43 */            if ((i & 48) == 0) {
/* 56 */                i2 |= iloI0lOlll13.I000O01llI0(z) ? 32 : 16;
                    }
/* 59 */            if ((i & 384) == 0) {
/* 72 */                i2 |= iloI0lOlll13.I000OOo1O(io1o01Ol0i01) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 75 */            if ((i & 3072) == 0) {
/* 88 */                i2 |= iloI0lOlll13.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 91 */            if ((i & 24576) == 0) {
/* 104 */               i2 |= iloI0lOlll13.I000OOo1O(function12) ? 16384 : 8192;
                    }
/* 108 */           if ((196608 & i) == 0) {
/* 121 */               i2 |= iloI0lOlll13.I000II(o1ooiI111i) ? 131072 : 65536;
                    }
/* 125 */           if ((1572864 & i) == 0) {
/* 138 */               i2 |= iloI0lOlll13.I0001Ioi1lo(j) ? 1048576 : 524288;
                    }
/* 141 */           int i4 = i2 | 12582912;
/* 160 */           if (iloI0lOlll13.I00OIl(i4 & 1, (4793491 & i4) != 4793490)) {
/* 172 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll13, 54);
/* 178 */               int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 182 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 188 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111i);
/* 194 */               IOl0oi0lOl1.I000lI.getClass();
/* 197 */               iloI0lOlll13.I00i0oil();
/* 200 */               boolean z3 = iloI0lOlll13.I00O10llo;
/* 202 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 204 */               if (z3) {
/* 206 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 210 */                   iloI0lOlll13.I00io1l();
                        }
/* 213 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 215 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 218 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 220 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI);
/* 223 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 227 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 229 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, numValueOf);
/* 232 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 235 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 237 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 240 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 246 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 248 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 254 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(false);
/* 258 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 261 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii;
/* 263 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 267 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 271 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO("");
/* 275 */                   iloI0lOlll13.I00iio(objI00O0i0ii2);
                        }
/* 278 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii2;
/* 280 */               Long lValueOf = Long.valueOf(j);
/* 284 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 289 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 294 */                   objI00O0i0ii3 = new IO1l1I0IiiOo(oI10i0Il4, null, 1);
/* 297 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        }
/* 304 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll13, lValueOf);
/* 307 */               OiI111I oiI111I = OiI11O1i1.I00000oIO;
/* 309 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 311 */               O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(o1ooIo101ll, oiI111I);
/* 315 */               if (z) {
/* 365 */                   oI10i0Il = oI10i0Il4;
/* 367 */                   oI10i0Il2 = oI10i0Il3;
/* 374 */                   iloI0lOlll13.I00i01iIIliI(-907987552);
/* 377 */                   iloI0lOlll13.I0010I0i(false);
/* 380 */                   o1ooiI111iI00000oOI = o1ooIo101ll;
                        } else {
/* 320 */                   iloI0lOlll13.I00i01iIIliI(-908135949);
/* 323 */                   Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                            Object obj = objI00O0i0ii4;
/* 327 */                   if (objI00O0i0ii4 == iOO0o0I1l) {
/* 333 */                       I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(24);
/* 336 */                       i0IlOO10Ii1.I00iiI = oI10i0Il4;
/* 338 */                       i0IlOO10Ii1.I00iiO = oI10i0Il3;
/* 340 */                       VarHandle.storeStoreFence();
/* 343 */                       iloI0lOlll13.I00iio(i0IlOO10Ii1);
                                obj = i0IlOO10Ii1;
                            }
/* 350 */                   oI10i0Il = oI10i0Il4;
/* 352 */                   oI10i0Il2 = oI10i0Il3;
/* 357 */                   o1ooiI111iI00000oOI = i1Ioo1o0.I00000oOI(o1ooIo101ll, false, null, (IllOOo00lI) obj, 15);
/* 361 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 381 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111iI00000oIO.I0000O(o1ooiI111iI00000oOI);
/* 393 */               boolean z4 = (i4 & 112) == 32;
/* 394 */               Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
                        Object obj2 = objI00O0i0ii5;
/* 398 */               if (z4 || objI00O0i0ii5 == iOO0o0I1l) {
/* 405 */                   II1ilOO1OIi iI1ilOO1OIi = new II1ilOO1OIi(6);
/* 408 */                   iI1ilOO1OIi.I00iiI = z;
/* 410 */                   VarHandle.storeStoreFence();
/* 413 */                   iloI0lOlll13.I00iio(iI1ilOO1OIi);
                            obj2 = iI1ilOO1OIi;
                        }
/* 418 */               O1ooiI111i o1ooiI111iI00000oIO2 = iIlll1lo.I00000oIO(o1ooiI111iI0000O, (Function1) obj2);
/* 422 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 458 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(iOi0OiI.I00000oIO(i0I1I0.I00000oOI(o1ooiI111iI00000oIO2, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00IioO0OiOi, iO0ioilo.I00000oIO), 1.0f, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I001lllioOl, oiI111I), 48.0f);
/* 465 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 471 */               int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 475 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 479 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000lI);
/* 483 */               iloI0lOlll13.I00i0oil();
/* 488 */               if (iloI0lOlll13.I00O10llo) {
/* 490 */                   iloI0lOlll13.I000l1(iloi111);
                        } else {
/* 494 */                   iloI0lOlll13.I00io1l();
                        }
/* 497 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 500 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 503 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 506 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 519 */               if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 521 */                   ioiOolO1iOoI0000O = l1Oi1iIOOo01.I00000oIO();
                        } else {
/* 528 */                   ioiOolO1iOoI0000O = l0lIooIoI0I.I00000oIO;
/* 530 */                   if (ioiOolO1iOoI0000O == null) {
/* 553 */                       IoiOo1iI ioiOo1iI = new IoiOo1iI("Outlined.KeyboardAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 558 */                       int i5 = Ooo1iOO.I00000oIO;
/* 564 */                       OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 569 */                       OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 576 */                       oO0Ii1.I000OiO(21.0f, 4.0f);
/* 581 */                       oO0Ii1.I0001Ioi1lo(3.0f);
/* 600 */                       oO0Ii1.I0000O(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
/* 605 */                       oO0Ii1.I000oI1ioi(13.0f);
/* 622 */                       oO0Ii1.I0000oI00(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
/* 627 */                       oO0Ii1.I000II(18.0f);
/* 642 */                       oO0Ii1.I0000oI00(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
/* 647 */                       oO0Ii1.I000o00OoI0I(6.0f);
/* 664 */                       oO0Ii1.I0000O(23.0f, 4.9f, 22.1f, 4.0f, 21.0f, 4.0f);
/* 667 */                       oO0Ii1.I0000Il00O();
/* 672 */                       oO0Ii1.I000OiO(21.0f, 19.0f);
/* 675 */                       oO0Ii1.I0001Ioi1lo(3.0f);
/* 678 */                       oO0Ii1.I000o00OoI0I(6.0f);
/* 681 */                       oO0Ii1.I000II(18.0f);
/* 684 */                       oO0Ii1.I000o00OoI0I(19.0f);
/* 687 */                       oO0Ii1.I0000Il00O();
/* 694 */                       oO0Ii1.I000OiO(9.0f, 8.0f);
/* 699 */                       oO0Ii1.I000II(2.0f);
/* 702 */                       oO0Ii1.I000oI1ioi(2.0f);
/* 705 */                       oO0Ii1.I0001Ioi1lo(9.0f);
/* 708 */                       oO0Ii1.I000o00OoI0I(8.0f);
/* 711 */                       oO0Ii1.I0000Il00O();
/* 716 */                       IIlIOloOOO.I001i1O0Ol(oO0Ii1, 5.0f, 8.0f, 2.0f, 2.0f);
/* 719 */                       oO0Ii1.I0001Ioi1lo(5.0f);
/* 722 */                       oO0Ii1.I000o00OoI0I(8.0f);
/* 725 */                       oO0Ii1.I0000Il00O();
/* 730 */                       oO0Ii1.I000OiO(8.0f, 16.0f);
/* 733 */                       oO0Ii1.I000II(8.0f);
/* 736 */                       oO0Ii1.I000oI1ioi(1.0f);
/* 739 */                       oO0Ii1.I0001Ioi1lo(8.0f);
/* 742 */                       oO0Ii1.I000o00OoI0I(16.0f);
/* 745 */                       oO0Ii1.I0000Il00O();
/* 748 */                       IIlIOloOOO.I001i1O0Ol(oO0Ii1, 13.0f, 8.0f, 2.0f, 2.0f);
/* 753 */                       oO0Ii1.I000II(-2.0f);
/* 756 */                       oO0Ii1.I000o00OoI0I(8.0f);
/* 759 */                       oO0Ii1.I0000Il00O();
/* 764 */                       oO0Ii1.I000OiO(9.0f, 12.0f);
/* 767 */                       oO0Ii1.I000II(2.0f);
/* 770 */                       oO0Ii1.I000oI1ioi(2.0f);
/* 773 */                       oO0Ii1.I0001Ioi1lo(9.0f);
/* 776 */                       oO0Ii1.I000o00OoI0I(12.0f);
/* 779 */                       oO0Ii1.I0000Il00O();
/* 782 */                       IIlIOloOOO.I001i1O0Ol(oO0Ii1, 5.0f, 12.0f, 2.0f, 2.0f);
/* 785 */                       oO0Ii1.I0001Ioi1lo(5.0f);
/* 788 */                       oO0Ii1.I000o00OoI0I(12.0f);
/* 791 */                       oO0Ii1.I0000Il00O();
/* 794 */                       oO0Ii1.I000OiO(13.0f, 12.0f);
/* 797 */                       oO0Ii1.I000II(2.0f);
/* 800 */                       oO0Ii1.I000oI1ioi(2.0f);
/* 803 */                       oO0Ii1.I000II(-2.0f);
/* 806 */                       oO0Ii1.I000o00OoI0I(12.0f);
/* 809 */                       oO0Ii1.I0000Il00O();
/* 816 */                       IIlIOloOOO.I001i1O0Ol(oO0Ii1, 17.0f, 8.0f, 2.0f, 2.0f);
/* 819 */                       oO0Ii1.I000II(-2.0f);
/* 822 */                       oO0Ii1.I000o00OoI0I(8.0f);
/* 825 */                       oO0Ii1.I0000Il00O();
/* 828 */                       oO0Ii1.I000OiO(17.0f, 12.0f);
/* 831 */                       oO0Ii1.I000II(2.0f);
/* 834 */                       oO0Ii1.I000oI1ioi(2.0f);
/* 837 */                       oO0Ii1.I000II(-2.0f);
/* 840 */                       oO0Ii1.I000o00OoI0I(12.0f);
/* 843 */                       oO0Ii1.I0000Il00O();
/* 849 */                       IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1.I00000oIO, 0, olI00IIlOO);
/* 852 */                       ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 856 */                       l0lIooIoI0I.I00000oIO = ioiOolO1iOoI0000O;
                            }
                        }
/* 525 */               IoiOolO1iOo ioiOolO1iOo = ioiOolO1iOoI0000O;
/* 895 */               i3 = i;
/* 898 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOo, lOOoli.I00000oOI(((Boolean) oI10i0Il2.getValue()).booleanValue() ? R.string.cd_switch_to_voice : R.string.cd_switch_to_keyboard, iloI0lOlll13), Ol0iOOO0.I000lI(o1ooIo101ll, 24.0f), 0L, iloI0lOlll13, 384, 8);
/* 901 */               iloI0lOlll13.I0010I0i(true);
/* 909 */               Boolean bool = (Boolean) oI10i0Il2.getValue();
/* 911 */               bool.getClass();
/* 916 */               OloOiI oloOiI = new OloOiI();
/* 919 */               oloIl1l1oOii2 = oloIl1l1oOii;
/* 921 */               oloOiI.I00iOIl = oloIl1l1oOii2;
/* 923 */               io1o01Ol0i012 = io1o01Ol0i01;
/* 925 */               oloOiI.I00iiI = io1o01Ol0i012;
/* 927 */               function13 = function1;
/* 929 */               oloOiI.I00iiO = function13;
/* 931 */               function14 = function12;
/* 933 */               oloOiI.I00iio = function14;
/* 935 */               z2 = z;
/* 937 */               oloOiI.I00ilI0I1 = z2;
/* 941 */               oloOiI.I00ilO0 = oI10i0Il;
/* 943 */               VarHandle.storeStoreFence();
/* 964 */               O1OIIoio0i1.I00000oOI(bool, null, null, null, null, null, iiioOl1O.I00000oOI(1586295679, oloOiI, iloI0lOlll13), iloI0lOlll1, 1572864, 62);
/* 967 */               IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 968 */               iloI0lOlll14.I0010I0i(true);
                        iloI0lOlll12 = iloI0lOlll14;
                    } else {
/* 972 */               z2 = z;
/* 973 */               function13 = function1;
/* 974 */               function14 = function12;
/* 975 */               io1o01Ol0i012 = io1o01Ol0i01;
/* 976 */               oloIl1l1oOii2 = oloIl1l1oOii;
/* 977 */               i3 = i;
/* 978 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 981 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 985 */           if (oOloioIlI001IO000 != null) {
/* 989 */               OloOilolill oloOilolill = new OloOilolill();
/* 992 */               oloOilolill.I00iOIl = oloIl1l1oOii2;
/* 994 */               oloOilolill.I00iiI = z2;
/* 996 */               oloOilolill.I00iiO = io1o01Ol0i012;
/* 998 */               oloOilolill.I00iio = function13;
/* 1000 */              oloOilolill.I00ilI0I1 = function14;
/* 1004 */              oloOilolill.I00ilO0 = o1ooiI111i;
/* 1008 */              oloOilolill.I00io1l = j;
/* 1010 */              oloOilolill.I00ioIO = i3;
/* 1012 */              VarHandle.storeStoreFence();
/* 1015 */              oOloioIlI001IO000.I0000O = oloOilolill;
                    }
                }
            }
