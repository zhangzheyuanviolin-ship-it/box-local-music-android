            package p000;

            import android.graphics.Bitmap;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class l1Ilol11 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r34v0, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v14, types: [Il0lI1oIiI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v15 */
                public static final void I00000oIO(IO1OoiOlOO iO1OoiOlOO, IlliIl1l11O illiIl1l11O, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ooiI111i o1ooiI111i2;
                    O1ooIo101ll o1ooIo101ll;
                    Iloi111 iloi111;
                    O1ooIo101ll o1ooIo101ll2;
                    int i2;
                    int i3;
                    IOO0o0I1l iOO0o0I1l;
                    IOioOOi0I iOioOOi0I;
                    IOO0o0I1l iOO0o0I1l2;
/* 3 */             IlliIl1l11O illiIl1l11O2 = illiIl1l11O;
/* 7 */             IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilI0I1;
/* 9 */             IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 11 */            IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilO0;
/* 13 */            IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 15 */            List list = iO1OoiOlOO.I000O01llI0;
/* 17 */            List list2 = iO1OoiOlOO.I000II;
/* 22 */            iloI0lOlll1.I00i0O(-353662217);
/* 49 */            int i4 = i | (iloI0lOlll1.I000OOo1O(iO1OoiOlOO) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 32 : 16) | 384;
/* 68 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 147) != 146)) {
/* 70 */                int size = list2.size();
/* 74 */                O1ooIo101ll o1ooIo101ll3 = O1ooIo101ll.I00000oIO;
/* 76 */                IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 78 */                if (size == 1) {
/* 83 */                    iloI0lOlll1.I00i01iIIliI(-396056602);
/* 90 */                    Bitmap bitmap = (Bitmap) list2.get(0);
/* 96 */                    I0oO00o i0oO00o = (I0oO00o) list.get(0);
/* 98 */                    int width = bitmap.getWidth();
/* 102 */                   int height = bitmap.getHeight();
/* 106 */                   int i5 = iO1OoiOlOO.I000OOo1O;
/* 108 */                   if (width >= i5 || height >= i5) {
/* 121 */                       int i6 = width >= height ? i5 : (int) ((i5 / height) * width);
/* 131 */                       height = height >= width ? i5 : (int) ((i5 / width) * height);
/* 132 */                       width = i6;
                            }
/* 136 */                   String strI00000oOI = lOOoli.I00000oOI(R.string.cd_user_image, iloI0lOlll1);
/* 146 */                   O1ooiI111i o1ooiI111iI00100o1O0lo = Ol0iOOO0.I00100o1O0lo(Ol0iOOO0.I000II(o1ooIo101ll3, height), width);
/* 160 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iO1OoiOlOO) | ((i4 & 112) == 32);
/* 161 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            Object obj = objI00O0i0ii;
/* 165 */                   if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l3) {
/* 171 */                       O1l110o o1l110o = new O1l110o(0);
/* 174 */                       o1l110o.I00iiI = illiIl1l11O2;
/* 176 */                       o1l110o.I00iiO = iO1OoiOlOO;
/* 178 */                       VarHandle.storeStoreFence();
/* 181 */                       iloI0lOlll1.I00iio(o1l110o);
                                obj = o1l110o;
                            }
/* 204 */                   ioO0II.I00000oOI(i0oO00o, strI00000oOI, i1Ioo1o0.I00000oOI(o1ooiI111iI00100o1O0lo, false, null, (IllOOo00lI) obj, 15), IOoOIiOl1llI.I00000oOI, iloI0lOlll1, 24576, 232);
/* 207 */                   iloI0lOlll1.I0010I0i(false);
/* 210 */                   o1ooIo101ll = o1ooIo101ll3;
                        } else {
/* 214 */                   O1ooIo101ll o1ooIo101ll4 = o1ooIo101ll3;
/* 218 */                   iloI0lOlll1.I00i01iIIliI(-395092874);
/* 226 */                   int i7 = size == 4 ? 2 : 3;
/* 236 */                   int iCeil = (int) Math.ceil(size / i7);
/* 249 */                   IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(2.0f), i1O01oOIoI0I.I00o101lO, iloI0lOlll1, 54);
/* 253 */                   int i8 = i7;
/* 256 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 260 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 264 */                   int i9 = i8;
/* 266 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll4);
/* 272 */                   IOl0oi0lOl1.I000lI.getClass();
/* 275 */                   iloI0lOlll1.I00i0oil();
/* 278 */                   boolean z = iloI0lOlll1.I00O10llo;
/* 282 */                   Iloi111 iloi1112 = O0iiOioolIi.I01101IOlO;
/* 284 */                   if (z) {
/* 286 */                       iloI0lOlll1.I000l1(iloi1112);
                            } else {
/* 290 */                       iloI0lOlll1.I00io1l();
                            }
/* 293 */                   li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 296 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, oO0lO0l0I000lI);
/* 299 */                   IIl001iO0Io.I001IIilI0O(iHashCode, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 302 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 308 */                   iloI0lOlll1.I00i01iIIliI(1104578994);
/* 311 */                   int i10 = 0;
/* 312 */                   while (i10 < iCeil) {
/* 322 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(2.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 326 */                       IOioOOi0I iOioOOi0I6 = iOioOOi0I2;
/* 330 */                       int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 334 */                       OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 338 */                       O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll4);
/* 344 */                       IOl0oi0lOl1.I000lI.getClass();
/* 347 */                       iloI0lOlll1.I00i0oil();
/* 350 */                       int i11 = iCeil;
/* 354 */                       if (iloI0lOlll1.I00O10llo) {
/* 356 */                           iloI0lOlll1.I000l1(iloi1112);
                                } else {
/* 360 */                           iloI0lOlll1.I00io1l();
                                }
/* 363 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 366 */                       li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, oO0lO0l0I000lI2);
/* 369 */                       IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 372 */                       IOioOOi0I iOioOOi0I7 = iOioOOi0I6;
/* 374 */                       li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 380 */                       iloI0lOlll1.I00i01iIIliI(1654702592);
/* 386 */                       iloI0lOlll1.I00i01iIIliI(191924835);
/* 389 */                       int i12 = i9;
/* 391 */                       int i13 = 0;
                                while (true) {
/* 392 */                           if (i13 >= i12) {
/* 602 */                               iloi111 = iloi1112;
/* 604 */                               o1ooIo101ll2 = o1ooIo101ll4;
/* 606 */                               i2 = i12;
/* 608 */                               i3 = size;
/* 610 */                               iOO0o0I1l = iOO0o0I1l3;
/* 612 */                               iOioOOi0I = iOioOOi0I7;
/* 627 */                               iloI0lOlll1.I0010I0i(false);
/* 630 */                               iloI0lOlll1.I0010I0i(false);
                                        break;
                                    }
/* 396 */                           int i14 = (i10 * i12) + i13;
/* 397 */                           if (i14 >= size) {
/* 400 */                               iloI0lOlll1.I0010I0i(false);
/* 403 */                               iloI0lOlll1.I0010I0i(false);
/* 406 */                               iloi111 = iloi1112;
/* 408 */                               o1ooIo101ll2 = o1ooIo101ll4;
/* 410 */                               i2 = i12;
/* 412 */                               i3 = size;
/* 414 */                               iOO0o0I1l = iOO0o0I1l3;
/* 416 */                               iOioOOi0I = iOioOOi0I7;
                                        break;
                                    }
/* 438 */                           I0oO00o i0oO00o2 = (I0oO00o) list.get(i14);
/* 442 */                           Iloi111 iloi1113 = iloi1112;
/* 448 */                           int i15 = i12;
/* 461 */                           String strI0000Il00O = lOOoli.I0000Il00O(R.string.cd_user_image_in_group, new Object[]{Integer.valueOf(i14 + 1), Integer.valueOf(size)}, iloI0lOlll1);
/* 473 */                           O1ooiI111i o1ooiI111iI00100o1O0lo2 = Ol0iOOO0.I00100o1O0lo(Ol0iOOO0.I000II(o1ooIo101ll4, 100.0f), 100.0f);
/* 498 */                           boolean zI000OOo1O2 = ((i4 & 112) == 32) | iloI0lOlll1.I000OOo1O(iO1OoiOlOO) | iloI0lOlll1.I0000oI00(i14);
/* 500 */                           ?? I00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 504 */                           if (zI000OOo1O2 || I00O0i0ii == iOO0o0I1l3) {
/* 518 */                               I00O0i0ii = new Il0lI1oIiI(2);
/* 521 */                               iOO0o0I1l2 = iOO0o0I1l3;
/* 525 */                               I00O0i0ii.I00iiO = illiIl1l11O;
/* 527 */                               I00O0i0ii.I00iio = iO1OoiOlOO;
/* 529 */                               I00O0i0ii.I00iiI = i14;
/* 531 */                               VarHandle.storeStoreFence();
/* 534 */                               iloI0lOlll1.I00iio(I00O0i0ii);
                                    } else {
/* 509 */                               iOO0o0I1l2 = iOO0o0I1l3;
                                    }
/* 583 */                           ioO0II.I00000oOI(i0oO00o2, strI0000Il00O, i1Ioo1o0.I00000oOI(o1ooiI111iI00100o1O0lo2, false, null, (IllOOo00lI) I00O0i0ii, 15), IOoOIiOl1llI.I00000oIO, iloI0lOlll1, 24576, 232);
/* 586 */                           i13++;
/* 588 */                           o1ooIo101ll4 = o1ooIo101ll4;
/* 590 */                           iOO0o0I1l3 = iOO0o0I1l2;
/* 592 */                           i12 = i15;
/* 594 */                           iloi1112 = iloi1113;
/* 596 */                           iOioOOi0I7 = iOioOOi0I7;
/* 598 */                           size = size;
                                }
/* 635 */                       iloI0lOlll1.I0010I0i(true);
/* 638 */                       i10++;
/* 640 */                       o1ooIo101ll4 = o1ooIo101ll2;
/* 642 */                       iOO0o0I1l3 = iOO0o0I1l;
/* 644 */                       iloi1112 = iloi111;
/* 646 */                       iCeil = i11;
/* 648 */                       iOioOOi0I2 = iOioOOi0I;
/* 650 */                       size = i3;
/* 652 */                       i9 = i2;
                            }
/* 656 */                   illiIl1l11O2 = illiIl1l11O;
/* 658 */                   o1ooIo101ll = o1ooIo101ll4;
/* 662 */                   Oi010OO0.I001l0I00(iloI0lOlll1, false, true, false);
                        }
/* 665 */               o1ooiI111i2 = o1ooIo101ll;
                    } else {
/* 668 */               iloI0lOlll1.I00OilO00Il();
/* 671 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 673 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 677 */           if (oOloioIlI001IO000 != null) {
/* 683 */               I01oi1lIIO i01oi1lIIO = new I01oi1lIIO(20);
/* 686 */               i01oi1lIIO.I00iiI = iO1OoiOlOO;
/* 688 */               i01oi1lIIO.I00iiO = illiIl1l11O2;
/* 690 */               i01oi1lIIO.I00iio = o1ooiI111i2;
/* 692 */               VarHandle.storeStoreFence();
/* 695 */               oOloioIlI001IO000.I0000O = i01oi1lIIO;
                    }
                }
            }
