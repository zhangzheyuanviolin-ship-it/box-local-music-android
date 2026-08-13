            package p000;

            import android.view.ContextThemeWrapper;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowManager;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOIlI11IO {
                /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x025b  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
                /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, Iii0io0OooO iii0io0OooO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    Iii0io0OooO iii0io0OooO2;
                    OOloioIl oOloioIlI001IO000;
                    int i4;
                    View view;
                    Object obj;
                    boolean z;
                    Object obj2;
/* 12 */            iloI0lOlll1.I00i0O(826668973);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 30 */                i3 = i;
                    }
/* 31 */            int i5 = i2 & 2;
/* 33 */            if (i5 == 0) {
/* 42 */                if ((i & 48) == 0) {
/* 44 */                    iii0io0OooO2 = iii0io0OooO;
/* 57 */                    i3 |= iloI0lOlll1.I000II(iii0io0OooO2) ? 32 : 16;
                        }
/* 60 */                if ((i & 384) == 0) {
/* 73 */                    i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 90 */                if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) == 146)) {
/* 604 */                   iloI0lOlll1.I00OilO00Il();
                        } else {
/* 92 */                    if (i5 != 0) {
/* 97 */                        iii0io0OooO2 = new Iii0io0OooO(7);
                            }
/* 107 */                   View view2 = (View) iloI0lOlll1.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 115 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 123 */                   O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 125 */                   Ilo1oli ilo1oliI0000Il00O = iilI1O0il0.I0000Il00O(iloI0lOlll1);
/* 129 */                   OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(iOii1l, iloI0lOlll1);
/* 133 */                   Object[] objArr = new Object[0];
/* 135 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 139 */                   Object obj3 = IOl11li.I00000oIO;
/* 141 */                   if (objI00O0i0ii == obj3) {
/* 147 */                       objI00O0i0ii = new I01iOOoiOI(9);
/* 150 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 159 */                   UUID uuid = (UUID) lIo1lO.I00000oOI(objArr, (IllOOo00lI) objI00O0i0ii, iloI0lOlll1);
/* 161 */                   iii0io0OooO2.getClass();
/* 185 */                   boolean zI000II = iloI0lOlll1.I000II(view2) | iloI0lOlll1.I000II(iiIooOOOI) | iloI0lOlll1.I0000oI00(2) | iloI0lOlll1.I000II(null);
/* 187 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 191 */                   if (zI000II || objI00O0i0ii2 == obj3) {
/* 204 */                       i4 = i3;
/* 217 */                       Iii0oiil iii0oiil = new Iii0oiil(new ContextThemeWrapper(view2.getContext(), R.style.DialogWindowTheme), 0);
/* 220 */                       iii0oiil.I00ilI0I1 = illOOo00lI;
/* 222 */                       iii0oiil.I00ilO0 = iii0io0OooO2;
/* 224 */                       iii0oiil.I00io1l = view2;
/* 226 */                       Window window = iii0oiil.getWindow();
/* 230 */                       if (window == null) {
/* 600 */                           I000II.I001IO000("Dialog has no window");
/* 603 */                           return;
                                }
/* 232 */                       Iii0io0OooO iii0io0OooO3 = iii0oiil.I00ilO0;
/* 234 */                       Window window2 = iii0oiil.getWindow();
/* 238 */                       if (window2 != null) {
/* 242 */                           WindowManager.LayoutParams attributes = window2.getAttributes();
/* 246 */                           iii0io0OooO3.getClass();
/* 249 */                           view = view2;
/* 252 */                           attributes.type = 2;
/* 254 */                           window2.setAttributes(attributes);
                                } else {
/* 259 */                           view = view2;
                                }
/* 262 */                       window.requestFeature(1);
/* 268 */                       window.setBackgroundDrawableResource(android.R.color.transparent);
/* 273 */                       iii0oiil.I00ilO0.getClass();
/* 276 */                       liIIO0.I00000oIO(window, true);
/* 281 */                       window.setGravity(17);
/* 286 */                       iii0oiil.I00ilO0.getClass();
/* 295 */                       Iii0OO1IIiO iii0OO1IIiO = new Iii0OO1IIiO(iii0oiil.getContext());
/* 298 */                       iii0OO1IIiO.I00l0OO0IO = window;
/* 302 */                       OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(i1OIli1.I00000oIO);
/* 306 */                       iii0OO1IIiO.I00li1OI = oIooliIO0I00000oIO;
/* 308 */                       WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 310 */                       OooiIOIoi.I00000oOI(iii0OO1IIiO, iii0OO1IIiO);
/* 321 */                       IIOOoll.I00i0ilIl0i(iii0OO1IIiO, new I10I0ll0oOl(iii0OO1IIiO, 1));
/* 324 */                       VarHandle.storeStoreFence();
/* 329 */                       iii0oiil.I00ilO0.getClass();
/* 334 */                       iii0oiil.setTitle("");
/* 354 */                       iii0OO1IIiO.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
/* 358 */                       iii0OO1IIiO.setClipChildren(false);
/* 367 */                       iii0OO1IIiO.setElevation(iiIooOOOI.I00i0ilIl0i(8.0f));
/* 375 */                       iii0OO1IIiO.setOutlineProvider(new Iii0oIO(0));
/* 378 */                       iii0oiil.I00ioIO = iii0OO1IIiO;
/* 380 */                       View decorView = window.getDecorView();
/* 391 */                       ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
/* 392 */                       if (viewGroup != null) {
/* 394 */                           Iii0oiil.I0001Ioi1lo(viewGroup);
                                }
/* 397 */                       iii0oiil.setContentView(iii0OO1IIiO);
/* 407 */                       iii0OO1IIiO.setTag(R.id.view_tree_lifecycle_owner, li1lOloO.I00000oIO(view));
/* 417 */                       iii0OO1IIiO.setTag(R.id.view_tree_view_model_store_owner, li1li1Ol11Io.I00000oIO(view));
/* 427 */                       iii0OO1IIiO.setTag(R.id.view_tree_saved_state_registry_owner, li1lOolIO.I00000oIO(view));
/* 434 */                       iii0oiil.I000II(iii0oiil.I00ilI0I1, iii0oiil.I00ilO0, o0iOOoiioO);
/* 437 */                       OIOoO1IOIo oIOoO1IOIoI00000oOI = iii0oiil.I00000oOI();
/* 444 */                       I0o0o0 i0o0o0 = new I0o0o0(1);
/* 447 */                       i0o0o0.I00iiI = iii0oiil;
/* 449 */                       VarHandle.storeStoreFence();
/* 457 */                       oIOoO1IOIoI00000oOI.I00000oIO(new I1lo101oIi1(i0o0o0), iii0oiil);
/* 460 */                       VarHandle.storeStoreFence();
/* 467 */                       I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(14);
/* 470 */                       i0Il1IoilolI.I00iiI = oI10i0IlI00000oOI;
/* 472 */                       VarHandle.storeStoreFence();
/* 481 */                       IOii1l iOii1l2 = new IOii1l(-1338939603, i0Il1IoilolI, true);
/* 484 */                       iii0OO1IIiO.setParentCompositionContext(ilo1oliI0000Il00O);
/* 487 */                       oIooliIO0I00000oIO.setValue(iOii1l2);
/* 490 */                       iii0OO1IIiO.I00o0iI0io1 = true;
/* 492 */                       iii0OO1IIiO.I0000O();
/* 495 */                       iloI0lOlll1.I00iio(iii0oiil);
                                obj = iii0oiil;
                            } else {
/* 196 */                       i4 = i3;
                                obj = objI00O0i0ii2;
                            }
/* 498 */                   Iii0oiil iii0oiil2 = (Iii0oiil) obj;
/* 500 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iii0oiil2);
/* 504 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 508 */                   if (zI000OOo1O || objI00O0i0ii3 == obj3) {
/* 517 */                       z = false;
/* 518 */                       I0o0o0 i0o0o02 = new I0o0o0(0);
/* 521 */                       i0o0o02.I00iiI = iii0oiil2;
/* 523 */                       VarHandle.storeStoreFence();
/* 526 */                       iloI0lOlll1.I00iio(i0o0o02);
                                obj2 = i0o0o02;
                            } else {
/* 513 */                       z = false;
                                obj2 = objI00O0i0ii3;
                            }
/* 531 */                   iIO0iiOiOl0l.I00000oOI(iii0oiil2, (Function1) obj2, iloI0lOlll1);
/* 546 */                   boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(iii0oiil2) | ((i4 & 14) == 4 ? true : z);
/* 551 */                   if ((i4 & 112) == 32) {
/* 553 */                       z = true;
                            }
/* 563 */                   boolean zI0000oI00 = z | zI000OOo1O2 | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal());
/* 564 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii4;
/* 568 */                   if (zI0000oI00 || objI00O0i0ii4 == obj3) {
/* 575 */                       I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(4);
/* 578 */                       i0IoO01lIoO.I00iiI = iii0oiil2;
/* 580 */                       i0IoO01lIoO.I00ilI0I1 = illOOo00lI;
/* 582 */                       i0IoO01lIoO.I00iiO = iii0io0OooO2;
/* 584 */                       i0IoO01lIoO.I00iio = o0iOOoiioO;
/* 586 */                       VarHandle.storeStoreFence();
/* 589 */                       iloI0lOlll1.I00iio(i0IoO01lIoO);
                                obj4 = i0IoO01lIoO;
                            }
/* 594 */                   iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj4, iloI0lOlll1);
                        }
/* 607 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 611 */               if (oOloioIlI001IO000 == null) {
/* 616 */                   I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(1);
/* 619 */                   i0O0Ol1O0O.I00iiI = illOOo00lI;
/* 621 */                   i0O0Ol1O0O.I00ilI0I1 = iii0io0OooO2;
/* 623 */                   i0O0Ol1O0O.I00ilO0 = iOii1l;
/* 625 */                   i0O0Ol1O0O.I00iiO = i;
/* 629 */                   i0O0Ol1O0O.I00iio = i2;
/* 631 */                   VarHandle.storeStoreFence();
/* 634 */                   oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
/* 685 */                   return;
                        }
/* 685 */               return;
                    }
/* 35 */            i3 |= 48;
/* 37 */            iii0io0OooO2 = iii0io0OooO;
/* 60 */            if ((i & 384) == 0) {
                    }
/* 90 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) == 146)) {
                    }
/* 607 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 611 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1090521195);
/* 28 */            int i2 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16);
/* 33 */            int i3 = 0;
/* 46 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 48 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 54 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 56 */                    objI00O0i0ii = I0o0oo1oOOlO.I00000oOI;
/* 58 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 61 */                O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) objI00O0i0ii;
/* 76 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 80 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 84 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 90 */                IOl0oi0lOl1.I000lI.getClass();
/* 97 */                int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
/* 99 */                iloI0lOlll1.I00i0oil();
/* 104 */               if (iloI0lOlll1.I00O10llo) {
/* 108 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 112 */                   iloI0lOlll1.I00io1l();
                        }
/* 117 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 122 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 131 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 134 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 139 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 150 */               illiIl1l11O.invoke(iloI0lOlll1, Integer.valueOf((i4 >> 6) & 14));
/* 153 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 157 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 160 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 164 */           if (oOloioIlI001IO000 != null) {
/* 168 */               I0o0o0Io0o i0o0o0Io0o = new I0o0o0Io0o(i3);
/* 171 */               i0o0o0Io0o.I00iiI = o1ooiI111i;
/* 173 */               i0o0o0Io0o.I00iiO = illiIl1l11O;
/* 175 */               VarHandle.storeStoreFence();
/* 178 */               oOloioIlI001IO000.I0000O = i0o0o0Io0o;
                    }
                }
            }
