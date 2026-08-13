            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowManager;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I0olo0 {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new I01iOOoiOI(10));
                public static final IOlO1IilOlOl I00000oOI = iiliio0o.I0000Il00O(new O0o0Ol0(22));

                /* JADX WARN: Removed duplicated region for block: B:108:0x0366  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x036f  */
                /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OO1ll1 oO1ll1, IllOOo00lI illOOo00lI, OO1loiii oO1loiii, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    IllOOo00lI illOOo00lI2;
                    OOloioIl oOloioIlI001IO000;
                    O0iOOoiioO o0iOOoiioO;
                    Object obj;
                    O0iOOoiioO o0iOOoiioO2;
                    Object obj2;
/* 14 */            iloI0lOlll1.I00i0O(-1772091631);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000II(oO1ll1) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i4 = i2 & 2;
/* 35 */            if (i4 == 0) {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    illOOo00lI2 = illOOo00lI;
/* 59 */                    i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 32 : 16;
                        }
/* 62 */                if ((i & 384) == 0) {
/* 75 */                    i3 |= iloI0lOlll1.I000II(oO1loiii) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 78 */                if ((i & 3072) == 0) {
/* 91 */                    i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 108 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
/* 871 */                   iloI0lOlll1.I00OilO00Il();
                        } else {
/* 110 */                   if (i4 != 0) {
/* 112 */                       illOOo00lI2 = null;
                            }
/* 119 */                   View view = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 127 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 129 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 137 */                   String str = (String) iloI0lOlll1.I000iOII(I00000oIO);
/* 145 */                   O0iOOoiioO o0iOOoiioO3 = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 147 */                   Ilo1oli ilo1oliI0000Il00O = iilI1O0il0.I0000Il00O(iloI0lOlll1);
/* 151 */                   OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(iOii1l, iloI0lOlll1);
/* 155 */                   Object[] objArr = new Object[0];
/* 157 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 161 */                   Object obj3 = IOl11li.I00000oIO;
/* 163 */                   if (objI00O0i0ii == obj3) {
/* 169 */                       objI00O0i0ii = new I01iOOoiOI(11);
/* 172 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 181 */                   UUID uuid = (UUID) lIo1lO.I00000oOI(objArr, (IllOOo00lI) objI00O0i0ii, iloI0lOlll1);
/* 191 */                   boolean zBooleanValue = ((Boolean) iloI0lOlll1.I000iOII(I00000oOI)).booleanValue();
/* 195 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 199 */                   int i5 = 14;
/* 201 */                   if (objI00O0i0ii2 == obj3) {
/* 205 */                       o0iOOoiioO = o0iOOoiioO3;
/* 209 */                       i1O01Ill i1o01ill = new i1O01Ill(i5);
/* 218 */                       OO1lio oO1lio = new OO1lio(view.getContext());
/* 221 */                       oO1lio.I00l0OO0IO = illOOo00lI2;
/* 223 */                       oO1lio.I00li1OI = oO1loiii;
/* 225 */                       oO1lio.I00ll1 = str;
/* 227 */                       oO1lio.I00lli11 = view;
/* 229 */                       oO1lio.I00lll10 = zBooleanValue;
/* 231 */                       oO1lio.I00o0iI0io1 = i1o01ill;
/* 245 */                       oO1lio.I00o0l1o1o0 = (WindowManager) view.getContext().getSystemService("window");
/* 249 */                       WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
/* 255 */                       layoutParams.gravity = 8388659;
/* 257 */                       OO1loiii oO1loiii2 = oO1lio.I00li1OI;
/* 259 */                       boolean zI00000oOI = I00000oOI(view);
/* 265 */                       boolean z = oO1loiii2.I00000oOI;
/* 267 */                       int i6 = oO1loiii2.I00000oIO;
/* 269 */                       if (z && zI00000oOI) {
/* 273 */                           i6 |= 8192;
                                } else if (z && !zI00000oOI) {
/* 280 */                           i6 &= -8193;
                                }
/* 282 */                       layoutParams.flags = i6;
/* 288 */                       layoutParams.type = oO1lio.I00li1OI.I0001Ioi1lo;
/* 294 */                       layoutParams.token = view.getApplicationWindowToken();
/* 297 */                       layoutParams.width = -2;
/* 299 */                       layoutParams.height = -2;
/* 302 */                       layoutParams.format = -3;
/* 319 */                       layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
/* 322 */                       oO1lio.I00o101lO = layoutParams;
/* 324 */                       oO1lio.I00oI0i = oO1ll1;
/* 328 */                       oO1lio.I00oII = O0iOOoiioO.I00iOIl;
/* 334 */                       oO1lio.I00oIiI10 = lOO00IiI0li.I00000oIO(null);
/* 340 */                       oO1lio.I00oO101o = lOO00IiI0li.I00000oIO(null);
/* 345 */                       OIOo1iiI oIOo1iiI = new OIOo1iiI(3);
/* 348 */                       oIOo1iiI.I00iiI = oO1lio;
/* 350 */                       VarHandle.storeStoreFence();
/* 357 */                       oO1lio.I00ol1 = Ol1llolil.I00000oOI(oIOo1iiI);
/* 364 */                       oO1lio.I00olI = new Rect();
/* 371 */                       I0oli1 i0oli1 = new I0oli1(2);
/* 374 */                       i0oli1.I00iiI = oO1lio;
/* 376 */                       VarHandle.storeStoreFence();
/* 382 */                       oO1lio.I00oli = new Ol1olI0o1I01(i0oli1);
/* 387 */                       oO1lio.setId(android.R.id.content);
/* 397 */                       oO1lio.setTag(R.id.view_tree_lifecycle_owner, li1lOloO.I00000oIO(view));
/* 407 */                       oO1lio.setTag(R.id.view_tree_view_model_store_owner, li1li1Ol11Io.I00000oIO(view));
/* 417 */                       oO1lio.setTag(R.id.view_tree_saved_state_registry_owner, li1lOolIO.I00000oIO(view));
/* 437 */                       oO1lio.setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
/* 441 */                       oO1lio.setClipChildren(false);
/* 450 */                       oO1lio.setElevation(iiIooOOOI.I00i0ilIl0i(8.0f));
/* 459 */                       oO1lio.setOutlineProvider(new Iii0oIO(2));
/* 468 */                       oO1lio.I00oo1iO0ll = lOO00IiI0li.I00000oIO(i1OO0Ol.I00000oIO);
/* 472 */                       oO1lio.I00ooiO1I = new int[2];
/* 474 */                       VarHandle.storeStoreFence();
/* 480 */                       I0oli111Ol i0oli111Ol = new I0oli111Ol(0);
/* 483 */                       i0oli111Ol.I00iiI = oO1lio;
/* 485 */                       i0oli111Ol.I00iiO = oI10i0IlI00000oOI;
/* 487 */                       VarHandle.storeStoreFence();
/* 499 */                       oO1lio.I000oI1ioi(ilo1oliI0000Il00O, new IOii1l(-297523940, i0oli111Ol, true));
/* 502 */                       iloI0lOlll1.I00iio(oO1lio);
                                obj = oO1lio;
                            } else {
/* 508 */                       o0iOOoiioO = o0iOOoiioO3;
                                obj = objI00O0i0ii2;
                            }
/* 510 */                   OO1lio oO1lio2 = (OO1lio) obj;
/* 516 */                   int i7 = i3 & 112;
/* 526 */                   int i8 = i3 & 896;
/* 549 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oO1lio2) | (i7 == 32) | (i8 == 256) | iloI0lOlll1.I000II(str) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal());
/* 550 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 554 */                   if (zI000OOo1O || objI00O0i0ii3 == obj3) {
/* 565 */                       I0IO1io0I i0IO1io0I = new I0IO1io0I(3);
/* 568 */                       i0IO1io0I.I00iiO = oO1lio2;
/* 570 */                       i0IO1io0I.I00iio = illOOo00lI2;
/* 572 */                       i0IO1io0I.I00ilO0 = oO1loiii;
/* 574 */                       i0IO1io0I.I00ilI0I1 = str;
/* 576 */                       o0iOOoiioO2 = o0iOOoiioO;
/* 578 */                       i0IO1io0I.I00iiI = o0iOOoiioO2;
/* 580 */                       VarHandle.storeStoreFence();
/* 583 */                       iloI0lOlll1.I00iio(i0IO1io0I);
                                obj2 = i0IO1io0I;
                            } else {
/* 559 */                       o0iOOoiioO2 = o0iOOoiioO;
                                obj2 = objI00O0i0ii3;
                            }
/* 588 */                   iIO0iiOiOl0l.I00000oOI(oO1lio2, (Function1) obj2, iloI0lOlll1);
/* 624 */                   boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oO1lio2) | (i7 == 32) | (i8 == 256) | iloI0lOlll1.I000II(str) | iloI0lOlll1.I0000oI00(o0iOOoiioO2.ordinal());
/* 625 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii4;
/* 629 */                   if (zI000OOo1O2 || objI00O0i0ii4 == obj3) {
/* 636 */                       I0IoOl i0IoOl = new I0IoOl(3);
/* 639 */                       i0IoOl.I00iio = oO1lio2;
/* 641 */                       i0IoOl.I00iiO = illOOo00lI2;
/* 643 */                       i0IoOl.I00iiI = oO1loiii;
/* 645 */                       i0IoOl.I00ilI0I1 = str;
/* 647 */                       i0IoOl.I00ilO0 = o0iOOoiioO2;
/* 649 */                       VarHandle.storeStoreFence();
/* 652 */                       iloI0lOlll1.I00iio(i0IoOl);
                                obj4 = i0IoOl;
                            }
/* 657 */                   iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj4, iloI0lOlll1);
/* 672 */                   boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(oO1lio2) | ((i3 & 14) == 4);
/* 673 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii5;
/* 677 */                   if (zI000OOo1O3 || objI00O0i0ii5 == obj3) {
/* 685 */                       I00o101lO i00o101lO = new I00o101lO(12);
/* 688 */                       i00o101lO.I00iiI = oO1lio2;
/* 690 */                       i00o101lO.I00iiO = oO1ll1;
/* 692 */                       VarHandle.storeStoreFence();
/* 695 */                       iloI0lOlll1.I00iio(i00o101lO);
                                obj5 = i00o101lO;
                            }
/* 700 */                   iIO0iiOiOl0l.I00000oOI(oO1ll1, (Function1) obj5, iloI0lOlll1);
/* 703 */                   boolean zI000OOo1O4 = iloI0lOlll1.I000OOo1O(oO1lio2);
/* 707 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 711 */                   if (zI000OOo1O4 || objI00O0i0ii6 == obj3) {
/* 720 */                       objI00O0i0ii6 = new I00oI0i(oO1lio2, iOoil1iiIilo, 7);
/* 723 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            }
/* 728 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii6, iloI0lOlll1, oO1lio2);
/* 731 */                   boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(oO1lio2);
/* 735 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                            Object obj6 = objI00O0i0ii7;
/* 739 */                   if (zI000OOo1O5 || objI00O0i0ii7 == obj3) {
/* 746 */                       I0oli1 i0oli12 = new I0oli1(1);
/* 749 */                       i0oli12.I00iiI = oO1lio2;
/* 751 */                       VarHandle.storeStoreFence();
/* 754 */                       iloI0lOlll1.I00iio(i0oli12);
                                obj6 = i0oli12;
                            }
/* 761 */                   O1ooiI111i o1ooiI111iI00000oIO = iO010ilOIO.I00000oIO(O1ooIo101ll.I00000oIO, (Function1) obj6);
/* 777 */                   boolean zI000OOo1O6 = iloI0lOlll1.I000OOo1O(oO1lio2) | iloI0lOlll1.I0000oI00(o0iOOoiioO2.ordinal());
/* 778 */                   Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                            Object obj7 = objI00O0i0ii8;
/* 782 */                   if (zI000OOo1O6 || objI00O0i0ii8 == obj3) {
/* 789 */                       I0ollO i0ollO = new I0ollO(0);
/* 792 */                       i0ollO.I00000oOI = oO1lio2;
/* 794 */                       i0ollO.I0000Il00O = o0iOOoiioO2;
/* 796 */                       VarHandle.storeStoreFence();
/* 799 */                       iloI0lOlll1.I00iio(i0ollO);
                                obj7 = i0ollO;
                            }
/* 802 */                   O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj7;
/* 806 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 810 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 814 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 820 */                   IOl0oi0lOl1.I000lI.getClass();
/* 823 */                   iloI0lOlll1.I00i0oil();
/* 828 */                   if (iloI0lOlll1.I00O10llo) {
/* 832 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 836 */                       iloI0lOlll1.I00io1l();
                            }
/* 841 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 846 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 855 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 858 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 863 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 867 */                   iloI0lOlll1.I0010I0i(true);
                        }
/* 874 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 878 */               if (oOloioIlI001IO000 == null) {
/* 883 */                   I0oliIo i0oliIo = new I0oliIo(0);
/* 886 */                   i0oliIo.I00iio = oO1ll1;
/* 888 */                   i0oliIo.I00ilI0I1 = illOOo00lI2;
/* 890 */                   i0oliIo.I00ilO0 = oO1loiii;
/* 894 */                   i0oliIo.I00io1l = iOii1l;
/* 898 */                   i0oliIo.I00iiI = i;
/* 902 */                   i0oliIo.I00iiO = i2;
/* 904 */                   VarHandle.storeStoreFence();
/* 907 */                   oOloioIlI001IO000.I0000O = i0oliIo;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 37 */            i3 |= 48;
/* 39 */            illOOo00lI2 = illOOo00lI;
/* 62 */            if ((i & 384) == 0) {
                    }
/* 78 */            if ((i & 3072) == 0) {
                    }
/* 108 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
                    }
/* 874 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 878 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final boolean I00000oOI(View view) {
/* 5 */             ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
/* 16 */            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                    return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
                }
            }
