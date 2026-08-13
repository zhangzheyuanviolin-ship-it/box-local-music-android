            package p000;

            import android.content.ClipDescription;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.text.SpannableString;
            import android.text.style.BackgroundColorSpan;
            import android.text.style.ClickableSpan;
            import android.text.style.ScaleXSpan;
            import android.text.style.StrikethroughSpan;
            import android.text.style.StyleSpan;
            import android.text.style.TtsSpan;
            import android.text.style.TypefaceSpan;
            import android.text.style.URLSpan;
            import android.text.style.UnderlineSpan;
            import android.util.Log;
            import android.view.View;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.WeakHashMap;
            
            public final class I0ll0IlI1lo extends IIloOI {
                public I0ll1oo I00ilI0I1;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:306:0x069f  */
                /* JADX WARN: Removed duplicated region for block: B:307:0x06a4  */
                /* JADX WARN: Removed duplicated region for block: B:310:0x06af  */
                /* JADX WARN: Removed duplicated region for block: B:313:0x06bd  */
                /* JADX WARN: Removed duplicated region for block: B:316:0x06c3  */
                /* JADX WARN: Removed duplicated region for block: B:325:0x06de  */
                /* JADX WARN: Removed duplicated region for block: B:328:0x06e6  */
                /* JADX WARN: Removed duplicated region for block: B:356:0x073d  */
                /* JADX WARN: Removed duplicated region for block: B:361:0x075f  */
                /* JADX WARN: Removed duplicated region for block: B:364:0x0771  */
                /* JADX WARN: Removed duplicated region for block: B:390:0x0810  */
                /* JADX WARN: Removed duplicated region for block: B:391:0x0813  */
                /* JADX WARN: Removed duplicated region for block: B:405:0x0865  */
                /* JADX WARN: Removed duplicated region for block: B:415:0x0884  */
                /* JADX WARN: Removed duplicated region for block: B:424:0x08a1  */
                /* JADX WARN: Removed duplicated region for block: B:435:0x08d8  */
                /* JADX WARN: Removed duplicated region for block: B:438:0x08e5  */
                /* JADX WARN: Removed duplicated region for block: B:441:0x0906  */
                /* JADX WARN: Removed duplicated region for block: B:466:0x0961  */
                /* JADX WARN: Removed duplicated region for block: B:474:0x0990  */
                /* JADX WARN: Removed duplicated region for block: B:477:0x0996  */
                /* JADX WARN: Removed duplicated region for block: B:478:0x09a3  */
                /* JADX WARN: Removed duplicated region for block: B:504:0x0a2c  */
                /* JADX WARN: Removed duplicated region for block: B:506:0x0a30  */
                /* JADX WARN: Removed duplicated region for block: B:514:0x0a58  */
                /* JADX WARN: Removed duplicated region for block: B:517:0x0a64  */
                /* JADX WARN: Removed duplicated region for block: B:557:0x0b10  */
                /* JADX WARN: Removed duplicated region for block: B:560:0x0b27  */
                /* JADX WARN: Removed duplicated region for block: B:610:0x0c4a  */
                /* JADX WARN: Removed duplicated region for block: B:619:0x0c6e  */
                /* JADX WARN: Removed duplicated region for block: B:622:0x0c79  */
                /* JADX WARN: Removed duplicated region for block: B:630:0x0c9c  */
                /* JADX WARN: Removed duplicated region for block: B:668:0x0880 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
                /* JADX WARN: Type inference failed for: r4v45, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r4v46, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v53, types: [java.util.ArrayList] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I01oII0IOOO I00OIo(int i) {
                    I01oII0IOOO i01oII0IOOO;
                    AccessibilityManager accessibilityManager;
                    I0ll1oo i0ll1oo;
                    I0lio1O01i01 i0lio1O01i01;
                    OI0l1iIo1 oI0l1iIo1;
                    Oil000 oil000;
                    O0iiOioolIi o0iiOioolIi;
                    Resources resources;
                    OiioiIIlooo oiioiIIlooo;
                    OI10I1IoI0Ol oI10I1IoI0Ol;
                    Oi1o00lo oi1o00lo;
                    SpannableString spannableString;
                    Oi1o00lo oi1o00lo2;
                    int i2;
                    boolean z;
                    int i3;
                    I0ll1oo i0ll1oo2;
                    boolean z2;
                    Object objI000II;
                    O11100o0O o11100o0O;
                    Object objI000II2;
                    I01lOOlO0o i01lOOlO0o;
                    I01lOOlO0o i01lOOlO0o2;
                    I01lOOlO0o i01lOOlO0o3;
                    String strI000oI1ioi;
                    ArrayList arrayList;
                    CharSequence charSequenceI0000O;
                    OOO01oo oOO01oo;
                    Object objI000II3;
                    IOOOoII1O iOOOoII1O;
                    OiOi0l oiOi0l;
                    OiOi0l oiOi0l2;
                    boolean z3;
                    int iI0000O;
                    I0lio1O01i01 i0lio1O01i012;
                    int iI0000O2;
                    String str;
                    Object objI000II4;
                    O0iiOioolIi o0iiOioolIi2;
                    List list;
                    O0iiOioolIi o0iiOioolIiI001IO000;
                    boolean zI0000O;
                    boolean zBooleanValue;
                    ArrayList arrayList2;
                    Resources resources2;
                    int i4;
                    int i5;
                    boolean zI0000O2;
                    Oil000 oil0002;
                    I01oII0IOOO i01oII0IOOO2;
/* 5 */             I0ll1oo i0ll1oo3 = this.I00ilI0I1;
/* 7 */             AccessibilityManager accessibilityManager2 = i0ll1oo3.I00io1l;
/* 9 */             I0lio1O01i01 i0lio1O01i013 = i0ll1oo3.I00iio;
/* 11 */            IOl10lI1 composeViewContext = i0lio1O01i013.getComposeViewContext();
/* 15 */            composeViewContext.I0000oI00();
/* 31 */            if (composeViewContext.I0000O.I000iOII().I00ol1() == O0oOi0I.I00iOIl) {
/* 37 */                if (accessibilityManager2.isEnabled()) {
/* 58 */                    i01oII0IOOO2 = null;
                        } else {
/* 39 */                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
/* 45 */                    i01oII0IOOO2 = new I01oII0IOOO();
/* 48 */                    i01oII0IOOO2.I00000oOI = -1;
/* 50 */                    i01oII0IOOO2.I0000Il00O = -1;
/* 52 */                    i01oII0IOOO2.I00000oIO = accessibilityNodeInfoObtain;
/* 54 */                    VarHandle.storeStoreFence();
                        }
/* 59 */                i3 = i;
/* 60 */                i01oII0IOOO = i01oII0IOOO2;
/* 61 */                i0ll1oo2 = i0ll1oo3;
                    } else {
/* 72 */                Oil00l oil00l = (Oil00l) i0ll1oo3.I000o00OoI0I().I00000oOI(i);
/* 74 */                if (oil00l == null) {
/* 80 */                    if (!accessibilityManager2.isEnabled()) {
/* 82 */                        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
/* 88 */                        i01oII0IOOO2 = new I01oII0IOOO();
/* 91 */                        i01oII0IOOO2.I00000oOI = -1;
/* 93 */                        i01oII0IOOO2.I0000Il00O = -1;
/* 95 */                        i01oII0IOOO2.I00000oIO = accessibilityNodeInfoObtain2;
/* 97 */                        VarHandle.storeStoreFence();
                            }
/* 59 */                    i3 = i;
/* 60 */                    i01oII0IOOO = i01oII0IOOO2;
/* 61 */                    i0ll1oo2 = i0ll1oo3;
                        } else {
/* 101 */                   Oil000 oil0003 = oil00l.I00000oIO;
/* 103 */                   OiioiIIlooo oiioiIIloooI000iOII = oil0003.I000iOII();
/* 107 */                   O0iiOioolIi o0iiOioolIi3 = oil0003.I0000Il00O;
/* 113 */                   Object objI000II5 = oiioiIIloooI000iOII.I00iOIl.I000II(Oil0I1O.I000oI1ioi);
/* 117 */                   if (objI000II5 == null) {
/* 119 */                       objI000II5 = null;
                            }
/* 122 */                   boolean zI0000O3 = O0000Ioio00.I0000O(objI000II5, Boolean.TRUE);
/* 126 */                   if (!zI0000O3 || accessibilityManager2.isRequestFromAccessibilityTool()) {
/* 139 */                       AccessibilityNodeInfo accessibilityNodeInfoObtain3 = AccessibilityNodeInfo.obtain();
/* 145 */                       i01oII0IOOO = new I01oII0IOOO();
/* 148 */                       i01oII0IOOO.I00000oOI = -1;
/* 150 */                       i01oII0IOOO.I0000Il00O = -1;
/* 152 */                       i01oII0IOOO.I00000oIO = accessibilityNodeInfoObtain3;
/* 154 */                       VarHandle.storeStoreFence();
/* 157 */                       accessibilityNodeInfoObtain3.setAccessibilityDataSensitive(zI0000O3);
/* 160 */                       if (i == -1) {
/* 162 */                           Object parentForAccessibility = i0lio1O01i013.getParentForAccessibility();
/* 173 */                           View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
/* 174 */                           i01oII0IOOO.I00000oOI = -1;
/* 176 */                           accessibilityNodeInfoObtain3.setParent(view);
                                } else {
/* 180 */                           Oil000 oil000I000l1 = oil0003.I000l1();
/* 193 */                           Integer numValueOf = oil000I000l1 != null ? Integer.valueOf(oil000I000l1.I0001Ioi1lo) : null;
/* 194 */                           if (numValueOf == null) {
/* 3269 */                              IolioOO1.I0000O("semanticsNode " + i + " has null parent");
/* 3272 */                              IOOlIIilOl0.I0000Il00O();
/* 3275 */                              return null;
                                    }
/* 196 */                           int iIntValue = numValueOf.intValue();
/* 210 */                           if (iIntValue == i0lio1O01i013.getSemanticsOwner().I00000oIO().I0001Ioi1lo) {
/* 212 */                               iIntValue = -1;
                                    }
/* 213 */                           i01oII0IOOO.I00000oOI = iIntValue;
/* 215 */                           accessibilityNodeInfoObtain3.setParent(i0lio1O01i013, iIntValue);
                                }
/* 218 */                       i01oII0IOOO.I0000Il00O = i;
/* 220 */                       accessibilityNodeInfoObtain3.setSource(i0lio1O01i013, i);
/* 227 */                       accessibilityNodeInfoObtain3.setBoundsInScreen(i0ll1oo3.I0001Ioi1lo(oil00l));
/* 230 */                       OI0l1iIo1 oI0l1iIo12 = i0ll1oo3.I010OIo1l;
/* 232 */                       OlIIioolI olIIioolI = i0ll1oo3.I00oII;
/* 238 */                       Resources resources3 = i0lio1O01i013.getContext().getResources();
/* 244 */                       i01oII0IOOO.I0000oI00("android.view.View");
/* 247 */                       OiioiIIlooo oiioiIIlooo2 = oil0003.I0000O;
/* 249 */                       OI10I1IoI0Ol oI10I1IoI0Ol2 = oiioiIIlooo2.I00iOIl;
/* 257 */                       if (oI10I1IoI0Ol2.I0000Il00O(Oil0I1O.I00IO1oi11O)) {
/* 261 */                           i01oII0IOOO.I0000oI00("android.widget.EditText");
                                }
/* 270 */                       if (oI10I1IoI0Ol2.I0000Il00O(Oil0I1O.I001lloI)) {
/* 274 */                           i01oII0IOOO.I0000oI00("android.widget.TextView");
                                }
/* 279 */                       Object objI000II6 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001l0I00);
/* 283 */                       if (objI000II6 == null) {
/* 285 */                           objI000II6 = null;
                                }
/* 286 */                       Oi1o00lo oi1o00lo3 = (Oi1o00lo) objI000II6;
/* 291 */                       if (oi1o00lo3 != null) {
/* 293 */                           int i6 = oi1o00lo3.I00000oIO;
/* 299 */                           if (oil0003.I000o00OoI0I() || oil0003.I000OOo1O((4 & 1) != 0 ? !oil0003.I00000oOI : false, (4 & 2) == 0).isEmpty()) {
/* 311 */                               accessibilityManager = accessibilityManager2;
/* 315 */                               if (i6 == 4) {
/* 328 */                                   accessibilityNodeInfoObtain3.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources3.getString(R.string.tab));
                                        } else if (i6 == 2) {
/* 346 */                                   accessibilityNodeInfoObtain3.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources3.getString(R.string.switch_role));
                                        } else {
/* 350 */                                   String strI0000O = lO1i1O.I0000O(i6);
/* 355 */                                   if (i6 != 5 || iOIl0OoO.I0001Ioi1lo(oil0003) || oiioiIIlooo2.I00iiO) {
/* 367 */                                       i01oII0IOOO.I0000oI00(strI0000O);
                                            }
                                        }
                                    } else {
/* 371 */                               accessibilityManager = accessibilityManager2;
                                    }
/* 381 */                           accessibilityNodeInfoObtain3.setPackageName(i0lio1O01i013.getContext().getPackageName());
/* 388 */                           accessibilityNodeInfoObtain3.setImportantForAccessibility(iO0o00ili.I0001Ioi1lo(oil0003));
/* 391 */                           boolean zIsRequestFromAccessibilityTool = accessibilityManager.isRequestFromAccessibilityTool();
/* 18 */                            List listI000OOo1O = oil0003.I000OOo1O((4 & 1) != 0 ? !oil0003.I00000oOI : false, (4 & 2) == 0);
/* 403 */                           int size = listI000OOo1O.size();
/* 411 */                           int i7 = 0;
/* 412 */                           int i8 = 0;
/* 413 */                           while (i7 < size) {
/* 419 */                               int i9 = i7;
/* 423 */                               Oil000 oil0004 = (Oil000) listI000OOo1O.get(i7);
/* 425 */                               int i10 = size;
/* 427 */                               IooIolI iooIolII000o00OoI0I = i0ll1oo3.I000o00OoI0I();
/* 431 */                               List list2 = listI000OOo1O;
/* 433 */                               int i11 = oil0004.I0001Ioi1lo;
/* 439 */                               if (iooIolII000o00OoI0I.I00000oIO(i11)) {
/* 441 */                                   I10OIIo androidViewsHandler$ui = i0lio1O01i013.getAndroidViewsHandler$ui();
/* 461 */                                   I10I1li0 i10I1li0 = androidViewsHandler$ui != null ? androidViewsHandler$ui.getLayoutNodeToHolder().get(oil0004.I0000Il00O) : null;
/* 464 */                                   if (i11 != -1) {
/* 467 */                                       if (i10I1li0 != null) {
/* 469 */                                           accessibilityNodeInfoObtain3.addChild(i10I1li0);
                                                } else {
/* 481 */                                           Oil00l oil00l2 = (Oil00l) i0ll1oo3.I000o00OoI0I().I00000oOI(i11);
/* 483 */                                           if (oil00l2 == null || (oil0002 = oil00l2.I00000oIO) == null) {
/* 512 */                                               zI0000O2 = false;
                                                    } else {
/* 497 */                                               Object objI000II7 = oil0002.I000iOII().I00iOIl.I000II(Oil0I1O.I000oI1ioi);
/* 501 */                                               if (objI000II7 == null) {
/* 503 */                                                   objI000II7 = null;
                                                        }
/* 507 */                                               zI0000O2 = O0000Ioio00.I0000O(objI000II7, Boolean.TRUE);
                                                    }
/* 513 */                                           if (zIsRequestFromAccessibilityTool || !zI0000O2) {
/* 517 */                                               accessibilityNodeInfoObtain3.addChild(i0lio1O01i013, i11);
                                                    }
                                                }
/* 520 */                                       oI0l1iIo12.I0001Ioi1lo(i11, i8);
/* 523 */                                       i8++;
                                            }
                                        }
/* 525 */                               i7 = i9 + 1;
/* 527 */                               size = i10;
/* 529 */                               listI000OOo1O = list2;
                                    }
/* 532 */                           int i12 = i0ll1oo3.I00li1OI;
/* 534 */                           AccessibilityNodeInfo accessibilityNodeInfo = i01oII0IOOO.I00000oIO;
/* 537 */                           if (i == i12) {
/* 539 */                               accessibilityNodeInfo.setAccessibilityFocused(true);
/* 544 */                               i01oII0IOOO.I00000oIO(I01o0l.I0000oI00);
                                    } else {
/* 549 */                               accessibilityNodeInfo.setAccessibilityFocused(false);
/* 554 */                               i01oII0IOOO.I00000oIO(I01o0l.I0000O);
                                    }
/* 557 */                           I1111OO10i i1111OO10iI0000O = iOIl0OoO.I0000O(oil0003);
/* 561 */                           if (i1111OO10iI0000O != null) {
/* 563 */                               IliO0o11i01 fontFamilyResolver = i0lio1O01i013.getFontFamilyResolver();
/* 567 */                               IiIooOOOI density = i0lio1O01i013.getDensity();
/* 571 */                               OlilOlOiI olilOlOiI = i0ll1oo3.I0100o111I;
/* 577 */                               String str2 = i1111OO10iI0000O.I00iiI;
/* 579 */                               i0lio1O01i01 = i0lio1O01i013;
/* 581 */                               List list3 = i1111OO10iI0000O.I00iOIl;
/* 583 */                               SpannableString spannableString2 = new SpannableString(str2);
/* 588 */                               ArrayList arrayList3 = i1111OO10iI0000O.I00iiO;
/* 590 */                               o0iiOioolIi = o0iiOioolIi3;
/* 592 */                               if (arrayList3 != null) {
/* 594 */                                   int size2 = arrayList3.size();
/* 598 */                                   i0ll1oo = i0ll1oo3;
/* 600 */                                   int i13 = 0;
/* 601 */                                   while (i13 < size2) {
/* 607 */                                       int i14 = i13;
/* 611 */                                       I11110l0o i11110l0o = (I11110l0o) arrayList3.get(i13);
/* 613 */                                       ArrayList arrayList4 = arrayList3;
/* 617 */                                       OlIIi1oIIOlo olIIi1oIIOlo = (OlIIi1oIIOlo) i11110l0o.I00000oIO;
/* 619 */                                       int i15 = size2;
/* 621 */                                       int i16 = i11110l0o.I00000oOI;
/* 623 */                                       int i17 = i11110l0o.I0000Il00O;
/* 625 */                                       OI0l1iIo1 oI0l1iIo13 = oI0l1iIo12;
/* 627 */                                       Oil000 oil0005 = oil0003;
/* 634 */                                       OlIIi1oIIOlo olIIi1oIIOloI00000oIO = OlIIi1oIIOlo.I00000oIO(olIIi1oIIOlo, 0L, 65503);
/* 638 */                                       Oo0OO1I1i oo0OO1I1i = olIIi1oIIOloI00000oIO.I00000oIO;
/* 640 */                                       Oo0OOlO0 oo0OOlO0 = olIIi1oIIOloI00000oIO.I000OiO;
/* 642 */                                       OlooIOI0O olooIOI0O = olIIi1oIIOloI00000oIO.I000lI;
/* 646 */                                       IliO1o11o iliO1o11o = olIIi1oIIOloI00000oIO.I0001Ioi1lo;
/* 648 */                                       OiioiIIlooo oiioiIIlooo3 = oiioiIIlooo2;
/* 650 */                                       Ilil10i ilil10i = olIIi1oIIOloI00000oIO.I0000O;
/* 652 */                                       OI10I1IoI0Ol oI10I1IoI0Ol3 = oI10I1IoI0Ol2;
/* 654 */                                       Oi1o00lo oi1o00lo4 = oi1o00lo3;
/* 660 */                                       lOO1lI1o.I0000Il00O(spannableString2, oo0OO1I1i.I00000oIO(), i16, i17);
/* 667 */                                       SpannableString spannableString3 = spannableString2;
/* 673 */                                       lOO1lI1o.I0000O(spannableString3, olIIi1oIIOloI00000oIO.I00000oOI, density, i16, i17);
/* 682 */                                       IlilIIiIiO ililIIiIiO = olIIi1oIIOloI00000oIO.I0000Il00O;
/* 684 */                                       if (ililIIiIiO == null && ilil10i == null) {
/* 689 */                                           resources2 = resources3;
/* 691 */                                           i4 = 33;
                                                } else {
/* 694 */                                           if (ililIIiIiO == null) {
/* 696 */                                               ililIIiIiO = IlilIIiIiO.I00ioIO;
                                                    }
/* 703 */                                           int i18 = ilil10i != null ? ilil10i.I00000oIO : 0;
/* 706 */                                           resources2 = resources3;
/* 719 */                                           boolean z4 = ililIIiIiO.compareTo(IlilIIiIiO.I00iio) >= 0;
/* 725 */                                           boolean z5 = i18 == 1;
/* 741 */                                           StyleSpan styleSpan = new StyleSpan((z5 && z4) ? 3 : z4 ? 1 : z5 ? 2 : 0);
/* 744 */                                           i4 = 33;
/* 746 */                                           spannableString3.setSpan(styleSpan, i16, i17, 33);
                                                }
/* 749 */                                       if (iliO1o11o == null) {
/* 767 */                                           i5 = i4;
                                                } else if (iliO1o11o instanceof Io010i0) {
/* 764 */                                           spannableString3.setSpan(new TypefaceSpan(((Io010i0) iliO1o11o).I00ilO0), i16, i17, i4);
/* 767 */                                           i5 = i4;
                                                } else {
/* 769 */                                           Ilil10oOo ilil10oOo = olIIi1oIIOloI00000oIO.I0000oI00;
/* 798 */                                           TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) ((IliOI01OIIII) fontFamilyResolver).I00000oOI(iliO1o11o, IlilIIiIiO.I00ioIO, 0, ilil10oOo != null ? ilil10oOo.I00000oIO : 65535).getValue());
/* 801 */                                           i5 = 33;
/* 803 */                                           spannableString3.setSpan(typefaceSpan, i16, i17, 33);
                                                }
/* 806 */                                       if (olooIOI0O != null) {
/* 808 */                                           int i19 = olooIOI0O.I00000oIO;
/* 812 */                                           if ((i19 | 1) == i19) {
/* 819 */                                               spannableString3.setSpan(new UnderlineSpan(), i16, i17, i5);
                                                    }
/* 824 */                                           if ((i19 | 2) == i19) {
/* 831 */                                               spannableString3.setSpan(new StrikethroughSpan(), i16, i17, i5);
                                                    }
                                                }
/* 834 */                                       if (oo0OOlO0 != null) {
/* 843 */                                           spannableString3.setSpan(new ScaleXSpan(oo0OOlO0.I00000oIO), i16, i17, i5);
                                                }
/* 848 */                                       lOO1lI1o.I0000oI00(spannableString3, olIIi1oIIOloI00000oIO.I000iOII, i16, i17);
/* 851 */                                       long j = olIIi1oIIOloI00000oIO.I000l1;
/* 857 */                                       if (j != 16) {
/* 870 */                                           spannableString3.setSpan(new BackgroundColorSpan(iiO01ll11o1l.I000OOo1O(j)), i16, i17, 33);
                                                }
/* 875 */                                       spannableString2 = spannableString3;
/* 873 */                                       i13 = i14 + 1;
/* 877 */                                       resources3 = resources2;
/* 879 */                                       arrayList3 = arrayList4;
/* 881 */                                       size2 = i15;
/* 883 */                                       oil0003 = oil0005;
/* 885 */                                       oI0l1iIo12 = oI0l1iIo13;
/* 887 */                                       oiioiIIlooo2 = oiioiIIlooo3;
/* 889 */                                       oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 891 */                                       oi1o00lo3 = oi1o00lo4;
                                            }
                                        } else {
/* 911 */                                   i0ll1oo = i0ll1oo3;
                                        }
/* 897 */                               oI0l1iIo1 = oI0l1iIo12;
/* 899 */                               oil000 = oil0003;
/* 901 */                               SpannableString spannableString4 = spannableString2;
/* 902 */                               resources = resources3;
/* 904 */                               oiioiIIlooo = oiioiIIlooo2;
/* 906 */                               oI10I1IoI0Ol = oI10I1IoI0Ol2;
/* 908 */                               oi1o00lo = oi1o00lo3;
/* 914 */                               int length = str2.length();
/* 918 */                               Collection arrayList5 = Il01100l.I00iOIl;
/* 920 */                               if (list3 != null) {
/* 928 */                                   arrayList2 = new ArrayList(list3.size());
/* 934 */                                   int size3 = list3.size();
/* 939 */                                   for (int i20 = 0; i20 < size3; i20++) {
/* 941 */                                       Object obj = list3.get(i20);
/* 946 */                                       I11110l0o i11110l0o2 = (I11110l0o) obj;
/* 952 */                                       if ((i11110l0o2.I00000oIO instanceof OooIoo0) && I111IiO.I00000oOI(0, length, i11110l0o2.I00000oOI, i11110l0o2.I0000Il00O)) {
/* 965 */                                           arrayList2.add(obj);
                                                }
                                            }
                                        } else {
/* 971 */                                   arrayList2 = arrayList5;
                                        }
/* 975 */                               int size4 = arrayList2.size();
/* 980 */                               for (int i21 = 0; i21 < size4; i21++) {
/* 986 */                                   I11110l0o i11110l0o3 = (I11110l0o) arrayList2.get(i21);
/* 990 */                                   OooIoo0 oooIoo0 = (OooIoo0) i11110l0o3.I00000oIO;
/* 992 */                                   int i22 = i11110l0o3.I00000oOI;
/* 994 */                                   int i23 = i11110l0o3.I0000Il00O;
/* 998 */                                   if (!(oooIoo0 instanceof OooIoo0)) {
/* 1019 */                                      I000II.I00000oIO();
/* 288 */                                       return null;
                                            }
/* 1013 */                                  spannableString4.setSpan(new TtsSpan.VerbatimBuilder(oooIoo0.I00000oIO).build(), i22, i23, 33);
                                        }
/* 1023 */                              int length2 = str2.length();
/* 1027 */                              if (list3 != null) {
/* 1035 */                                  arrayList5 = new ArrayList(list3.size());
/* 1041 */                                  int size5 = list3.size();
/* 1046 */                                  for (int i24 = 0; i24 < size5; i24++) {
/* 1048 */                                      Object obj2 = list3.get(i24);
/* 1053 */                                      I11110l0o i11110l0o4 = (I11110l0o) obj2;
/* 1059 */                                      if ((i11110l0o4.I00000oIO instanceof Ool101lo1i) && I111IiO.I00000oOI(0, length2, i11110l0o4.I00000oOI, i11110l0o4.I0000Il00O)) {
/* 1072 */                                          arrayList5.add(obj2);
                                                }
                                            }
                                        }
/* 1081 */                              int size6 = arrayList5.size();
/* 1086 */                              for (int i25 = 0; i25 < size6; i25++) {
/* 1092 */                                  I11110l0o i11110l0o5 = (I11110l0o) arrayList5.get(i25);
/* 1096 */                                  Ool101lo1i ool101lo1i = (Ool101lo1i) i11110l0o5.I00000oIO;
/* 1098 */                                  int i26 = i11110l0o5.I00000oOI;
/* 1100 */                                  int i27 = i11110l0o5.I0000Il00O;
/* 1104 */                                  WeakHashMap weakHashMap = (WeakHashMap) olilOlOiI.I00iiI;
/* 1106 */                                  Object uRLSpan = weakHashMap.get(ool101lo1i);
/* 1110 */                                  if (uRLSpan == null) {
/* 1116 */                                      uRLSpan = new URLSpan(ool101lo1i.I00000oIO);
/* 1119 */                                      weakHashMap.put(ool101lo1i, uRLSpan);
                                            }
/* 1126 */                                  spannableString4.setSpan((URLSpan) uRLSpan, i26, i27, 33);
                                        }
/* 1136 */                              List listI00000oIO = i1111OO10iI0000O.I00000oIO(str2.length());
/* 1143 */                              int size7 = listI00000oIO.size();
/* 1148 */                              for (int i28 = 0; i28 < size7; i28++) {
/* 1154 */                                  I11110l0o i11110l0o6 = (I11110l0o) listI00000oIO.get(i28);
/* 1156 */                                  int i29 = i11110l0o6.I00000oOI;
/* 1158 */                                  Object obj3 = i11110l0o6.I00000oIO;
/* 1160 */                                  int i30 = i11110l0o6.I0000Il00O;
/* 1162 */                                  if (i29 != i30) {
/* 1165 */                                      O0ooioI1 o0ooioI1 = (O0ooioI1) obj3;
/* 1169 */                                      if ((o0ooioI1 instanceof O0ooi0ll) && ((O0ooi0ll) o0ooioI1).I0000Il00O == null) {
/* 1180 */                                          O0ooi0ll o0ooi0ll = (O0ooi0ll) obj3;
/* 1182 */                                          I11110l0o i11110l0o7 = new I11110l0o(o0ooi0ll, i29, i30);
/* 1187 */                                          WeakHashMap weakHashMap2 = (WeakHashMap) olilOlOiI.I00iiO;
/* 1189 */                                          Object uRLSpan2 = weakHashMap2.get(i11110l0o7);
/* 1193 */                                          if (uRLSpan2 == null) {
/* 1199 */                                              uRLSpan2 = new URLSpan(o0ooi0ll.I00000oIO);
/* 1202 */                                              weakHashMap2.put(i11110l0o7, uRLSpan2);
                                                    }
/* 1209 */                                          spannableString4.setSpan((URLSpan) uRLSpan2, i29, i30, 33);
                                                } else {
/* 1215 */                                          WeakHashMap weakHashMap3 = (WeakHashMap) olilOlOiI.I00iio;
/* 1217 */                                          Object obj4 = weakHashMap3.get(i11110l0o6);
                                                    Object obj5 = obj4;
/* 1221 */                                          if (obj4 == null) {
/* 1225 */                                              IOioOOliO iOioOOliO = new IOioOOliO();
/* 1228 */                                              iOioOOliO.I00iOIl = o0ooioI1;
/* 1230 */                                              VarHandle.storeStoreFence();
/* 1233 */                                              weakHashMap3.put(i11110l0o6, iOioOOliO);
                                                        obj5 = iOioOOliO;
                                                    }
/* 1240 */                                          spannableString4.setSpan((ClickableSpan) obj5, i29, i30, 33);
                                                }
                                            }
                                        }
/* 1253 */                              spannableString = (SpannableString) I0ll1oo.I00Io1o110i(spannableString4);
                                    } else {
/* 1256 */                              i0ll1oo = i0ll1oo3;
/* 1258 */                              i0lio1O01i01 = i0lio1O01i013;
/* 1260 */                              oI0l1iIo1 = oI0l1iIo12;
/* 1262 */                              oil000 = oil0003;
/* 1264 */                              o0iiOioolIi = o0iiOioolIi3;
/* 1266 */                              resources = resources3;
/* 1268 */                              oiioiIIlooo = oiioiIIlooo2;
/* 1270 */                              oI10I1IoI0Ol = oI10I1IoI0Ol2;
/* 1272 */                              oi1o00lo = oi1o00lo3;
/* 1274 */                              spannableString = null;
                                    }
/* 1278 */                          i01oII0IOOO.I00000oIO.setText(spannableString);
/* 1281 */                          Oil0IoooOio oil0IoooOio = Oil0I1O.I00IoiI;
/* 1283 */                          OI10I1IoI0Ol oI10I1IoI0Ol4 = oI10I1IoI0Ol;
/* 1289 */                          if (oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio)) {
/* 1292 */                              accessibilityNodeInfoObtain3.setContentInvalid(true);
/* 1295 */                              Object objI000II8 = oI10I1IoI0Ol4.I000II(oil0IoooOio);
/* 1299 */                              if (objI000II8 == null) {
/* 1301 */                                  objI000II8 = null;
                                        }
/* 1305 */                              accessibilityNodeInfoObtain3.setError((CharSequence) objI000II8);
                                    }
/* 1308 */                          Resources resources4 = resources;
/* 1310 */                          Oil000 oil0006 = oil000;
/* 1318 */                          i01oII0IOOO.I00000oIO.setStateDescription(iOIl0OoO.I0000Il00O(oil0006, resources4));
/* 1325 */                          accessibilityNodeInfoObtain3.setCheckable(iOIl0OoO.I00000oOI(oil0006));
/* 1330 */                          Object objI000II9 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00Io1o110i);
/* 1334 */                          if (objI000II9 == null) {
/* 1336 */                              objI000II9 = null;
                                    }
/* 1338 */                          Oo1IiOO1IoI oo1IiOO1IoI = (Oo1IiOO1IoI) objI000II9;
/* 1340 */                          if (oo1IiOO1IoI != null) {
/* 1344 */                              if (oo1IiOO1IoI == Oo1IiOO1IoI.I00iOIl) {
/* 1349 */                                  i01oII0IOOO.I00000oIO.setChecked(true);
                                        } else if (oo1IiOO1IoI == Oo1IiOO1IoI.I00iiI) {
/* 1360 */                                  i01oII0IOOO.I00000oIO.setChecked(false);
                                        }
                                    }
/* 1365 */                          Object objI000II10 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00Io1lO);
/* 1369 */                          if (objI000II10 == null) {
/* 1371 */                              objI000II10 = null;
                                    }
/* 1373 */                          Boolean bool = (Boolean) objI000II10;
/* 1375 */                          if (bool != null) {
/* 1377 */                              boolean zBooleanValue2 = bool.booleanValue();
/* 1381 */                              if (oi1o00lo == null) {
/* 1383 */                                  oi1o00lo2 = oi1o00lo;
/* 1385 */                                  i2 = 4;
                                        } else {
/* 1387 */                                  oi1o00lo2 = oi1o00lo;
/* 1391 */                                  i2 = 4;
/* 1392 */                                  if (oi1o00lo2.I00000oIO == 4) {
/* 1394 */                                      accessibilityNodeInfoObtain3.setSelected(zBooleanValue2);
                                            }
                                        }
/* 1400 */                              i01oII0IOOO.I00000oIO.setChecked(zBooleanValue2);
                                    } else {
/* 1406 */                              oi1o00lo2 = oi1o00lo;
/* 1408 */                              i2 = 4;
                                    }
/* 1403 */                          OiioiIIlooo oiioiIIlooo4 = oiioiIIlooo;
/* 1412 */                          if (!oiioiIIlooo4.I00iiO || oil0006.I000OOo1O((4 & 1) != 0 ? !oil0006.I00000oOI : false, (4 & 2) == 0).isEmpty()) {
/* 1426 */                              Object objI000II11 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00000oIO);
/* 1430 */                              if (objI000II11 == null) {
/* 1432 */                                  objI000II11 = null;
                                        }
/* 1434 */                              List list4 = (List) objI000II11;
/* 1447 */                              accessibilityNodeInfoObtain3.setContentDescription(list4 != null ? (String) IOOi0Ool1i.I00II0Ol1O0l(list4) : null);
                                    }
/* 1452 */                          Object objI000II12 = oI10I1IoI0Ol4.I000II(Oil0I1O.I001lIiIIo1O);
/* 1456 */                          if (objI000II12 == null) {
/* 1458 */                              objI000II12 = null;
                                    }
/* 1460 */                          String str3 = (String) objI000II12;
/* 1462 */                          if (str3 != null) {
/* 1464 */                              Oil000 oil000I000l12 = oil0006;
                                        while (true) {
/* 1465 */                                  if (oil000I000l12 == null) {
/* 1495 */                                      zBooleanValue = false;
                                                break;
                                            }
/* 1467 */                                  OiioiIIlooo oiioiIIlooo5 = oil000I000l12.I0000O;
/* 1469 */                                  OI10I1IoI0Ol oI10I1IoI0Ol5 = oiioiIIlooo5.I00iOIl;
/* 1471 */                                  Oil0IoooOio oil0IoooOio2 = iO0o0l0oOo0.I00000oIO;
/* 1477 */                                  if (oI10I1IoI0Ol5.I0000Il00O(oil0IoooOio2)) {
/* 1485 */                                      zBooleanValue = ((Boolean) oiioiIIlooo5.I000OOo1O(oil0IoooOio2)).booleanValue();
                                                break;
                                            }
/* 1490 */                                  oil000I000l12 = oil000I000l12.I000l1();
                                        }
/* 1496 */                              if (zBooleanValue) {
/* 1498 */                                  accessibilityNodeInfoObtain3.setViewIdResourceName(str3);
                                        }
                                    }
/* 1503 */                          Object objI000II13 = oI10I1IoI0Ol4.I000II(Oil0I1O.I000O01llI0);
/* 1507 */                          if (objI000II13 == null) {
/* 1509 */                              objI000II13 = null;
                                    }
/* 1513 */                          if (((OoiIlOl1iI) objI000II13) != null) {
/* 1517 */                              z = true;
/* 1518 */                              i01oII0IOOO.I00000oIO.setHeading(true);
                                    } else {
/* 1522 */                              z = true;
                                    }
/* 1525 */                          Object objI000II14 = oI10I1IoI0Ol4.I000II(Oil0I1O.I000OOo1O);
/* 1529 */                          if (objI000II14 == null) {
/* 1531 */                              objI000II14 = null;
                                    }
/* 1535 */                          if (((OoiIlOl1iI) objI000II14) != null) {
/* 1537 */                              accessibilityNodeInfoObtain3.setTextEntryKey(z);
                                    }
/* 1540 */                          i3 = i;
/* 1543 */                          if (i3 != -1) {
/* 1549 */                              int iI0000O3 = oI0l1iIo1.I0000O(oil0006.I0001Ioi1lo);
/* 1553 */                              if (iI0000O3 != -1) {
/* 1555 */                                  accessibilityNodeInfoObtain3.setDrawingOrder(iI0000O3);
                                        } else {
/* 1563 */                                  Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
/* 1572 */                          accessibilityNodeInfoObtain3.setPassword(oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I00IoO0));
/* 1577 */                          Object objI000II15 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00O0i0ii);
/* 1581 */                          if (objI000II15 == null) {
/* 1583 */                              objI000II15 = null;
                                    }
/* 1585 */                          Boolean bool2 = Boolean.TRUE;
/* 1591 */                          accessibilityNodeInfoObtain3.setEditable(O0000Ioio00.I0000O(objI000II15, bool2));
/* 1596 */                          Object objI000II16 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00O0o1oo);
/* 1600 */                          if (objI000II16 == null) {
/* 1602 */                              objI000II16 = null;
                                    }
/* 1604 */                          Integer num = (Integer) objI000II16;
/* 1614 */                          accessibilityNodeInfoObtain3.setMaxTextLength(num != null ? num.intValue() : -1);
/* 1621 */                          accessibilityNodeInfoObtain3.setEnabled(iOIl0OoO.I00000oIO(oil0006));
/* 1624 */                          Oil0IoooOio oil0IoooOio3 = Oil0I1O.I000l1;
/* 1630 */                          accessibilityNodeInfoObtain3.setFocusable(oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio3));
/* 1637 */                          if (accessibilityNodeInfoObtain3.isFocusable()) {
/* 1649 */                              accessibilityNodeInfoObtain3.setFocused(((Boolean) oiioiIIlooo4.I000OOo1O(oil0IoooOio3)).booleanValue());
/* 1652 */                              boolean zIsFocused = accessibilityNodeInfoObtain3.isFocused();
/* 1656 */                              AccessibilityNodeInfo accessibilityNodeInfo2 = i01oII0IOOO.I00000oIO;
/* 1658 */                              if (zIsFocused) {
/* 1661 */                                  accessibilityNodeInfo2.addAction(2);
/* 1664 */                                  i0ll1oo2 = i0ll1oo;
/* 1666 */                                  i0ll1oo2.I00ll1 = i3;
                                        } else {
/* 1670 */                                  i0ll1oo2 = i0ll1oo;
/* 1672 */                                  z2 = true;
/* 1673 */                                  accessibilityNodeInfo2.addAction(1);
/* 1687 */                                  i01oII0IOOO.I00000oIO.setVisibleToUser(iO0o00ili.I0000oI00(oil0006) ^ z2);
/* 1710 */                                  if ((!oil0006.I000o00OoI0I() ? oil0006.I000l1() : oil0006).I000lI().I000II()) {
/* 1715 */                                      i01oII0IOOO.I00000oIO.setVisibleToUser(false);
                                            }
/* 1720 */                                  objI000II = oI10I1IoI0Ol4.I000II(Oil0I1O.I000iOII);
/* 1724 */                                  if (objI000II == null) {
/* 1726 */                                      objI000II = null;
                                            }
/* 1728 */                                  o11100o0O = (O11100o0O) objI000II;
/* 1730 */                                  if (o11100o0O != null) {
/* 1732 */                                      int i31 = o11100o0O.I00000oIO;
/* 1742 */                                      accessibilityNodeInfoObtain3.setLiveRegion((i31 != 0 && i31 == 1) ? 2 : 1);
                                            }
/* 1748 */                                  i01oII0IOOO.I00000oIO.setClickable(false);
/* 1753 */                                  objI000II2 = oI10I1IoI0Ol4.I000II(Oiioi1IoIIli.I00000oOI);
/* 1757 */                                  if (objI000II2 == null) {
/* 1759 */                                      objI000II2 = null;
                                            }
/* 1761 */                                  i01lOOlO0o = (I01lOOlO0o) objI000II2;
/* 1765 */                                  if (i01lOOlO0o != null) {
/* 1769 */                                      Object objI000II17 = oI10I1IoI0Ol4.I000II(Oil0I1O.I00Io1lO);
/* 1773 */                                      if (objI000II17 == null) {
/* 1775 */                                          objI000II17 = null;
                                                }
/* 1777 */                                      boolean zI0000O4 = O0000Ioio00.I0000O(objI000II17, bool2);
/* 1800 */                                      boolean z6 = (oi1o00lo2 != null && oi1o00lo2.I00000oIO == 4) || (oi1o00lo2 != null && oi1o00lo2.I00000oIO == 3);
/* 1813 */                                      i01oII0IOOO.I00000oIO.setClickable(!z6 || (z6 && !zI0000O4));
/* 1820 */                                      if (iOIl0OoO.I00000oIO(oil0006) && accessibilityNodeInfoObtain3.isClickable()) {
/* 1835 */                                          i01oII0IOOO.I00000oIO(new I01o0l(16, i01lOOlO0o.I00000oIO));
                                                }
                                            }
/* 1841 */                                  i01oII0IOOO.I00000oIO.setLongClickable(false);
/* 1850 */                                  i01lOOlO0o2 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0000Il00O);
/* 1852 */                                  if (i01lOOlO0o2 != null) {
/* 1857 */                                      i01oII0IOOO.I00000oIO.setLongClickable(true);
/* 1864 */                                      if (iOIl0OoO.I00000oIO(oil0006)) {
/* 1875 */                                          i01oII0IOOO.I00000oIO(new I01o0l(32, i01lOOlO0o2.I00000oIO));
                                                }
                                            }
/* 1884 */                                  i01lOOlO0o3 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I00100o1O0lo);
/* 1886 */                                  if (i01lOOlO0o3 != null) {
/* 1897 */                                      i01oII0IOOO.I00000oIO(new I01o0l(16384, i01lOOlO0o3.I00000oIO));
                                            }
/* 1904 */                                  if (iOIl0OoO.I00000oIO(oil0006)) {
/* 1912 */                                      I01lOOlO0o i01lOOlO0o4 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I000iOII);
/* 1914 */                                      if (i01lOOlO0o4 != null) {
/* 1925 */                                          i01oII0IOOO.I00000oIO(new I01o0l(2097152, i01lOOlO0o4.I00000oIO));
                                                }
/* 1934 */                                      I01lOOlO0o i01lOOlO0o5 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I00100l0);
/* 1936 */                                      if (i01lOOlO0o5 != null) {
/* 1948 */                                          i01oII0IOOO.I00000oIO(new I01o0l(android.R.id.accessibilityActionImeEnter, i01lOOlO0o5.I00000oIO));
                                                }
/* 1957 */                                      I01lOOlO0o i01lOOlO0o6 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0010I0i);
/* 1959 */                                      if (i01lOOlO0o6 != null) {
/* 1970 */                                          i01oII0IOOO.I00000oIO(new I01o0l(65536, i01lOOlO0o6.I00000oIO));
                                                }
/* 1979 */                                      I01lOOlO0o i01lOOlO0o7 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0010o);
/* 1981 */                                      if (i01lOOlO0o7 != null && accessibilityNodeInfoObtain3.isFocused()) {
/* 1999 */                                          ClipDescription primaryClipDescription = ((I0lOl0I0) i0lio1O01i01.getClipboardManager()).I00000oIO().getPrimaryClipDescription();
/* 2013 */                                          if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
/* 2025 */                                              i01oII0IOOO.I00000oIO(new I01o0l(32768, i01lOOlO0o7.I00000oIO));
                                                    }
                                                }
                                            }
/* 2028 */                                  strI000oI1ioi = I0ll1oo.I000oI1ioi(oil0006);
/* 2032 */                                  if (strI000oI1ioi != null && strI000oI1ioi.length() != 0) {
/* 2050 */                                      accessibilityNodeInfoObtain3.setTextSelection(i0ll1oo2.I000lI(oil0006), i0ll1oo2.I000l1(oil0006));
/* 2059 */                                      I01lOOlO0o i01lOOlO0o8 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I000OiO);
/* 2075 */                                      i01oII0IOOO.I00000oIO(new I01o0l(131072, i01lOOlO0o8 == null ? i01lOOlO0o8.I00000oIO : null));
/* 2082 */                                      i01oII0IOOO.I00000oIO.addAction(Barcode.FORMAT_QR_CODE);
/* 2089 */                                      i01oII0IOOO.I00000oIO.addAction(Barcode.FORMAT_UPC_A);
/* 2096 */                                      i01oII0IOOO.I00000oIO.setMovementGranularities(11);
/* 2105 */                                      list = (List) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I00000oIO);
/* 2109 */                                      if ((list != null || list.isEmpty()) && oI10I1IoI0Ol4.I0000Il00O(Oiioi1IoIIli.I00000oIO) && (!oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I00IO1oi11O) || O0000Ioio00.I0000O(lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, oil0IoooOio3), bool2))) {
/* 2144 */                                          o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
                                                    while (true) {
/* 2148 */                                              if (o0iiOioolIiI001IO000 == null) {
/* 2177 */                                                  o0iiOioolIiI001IO000 = null;
                                                            break;
                                                        }
/* 2150 */                                              OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIiI001IO000.I001i1lo1io();
/* 2154 */                                              if (oiioiIIloooI001i1lo1io != null && oiioiIIloooI001i1lo1io.I00iiO) {
/* 2169 */                                                  if (oiioiIIloooI001i1lo1io.I00iOIl.I0000Il00O(Oil0I1O.I00IO1oi11O)) {
                                                                break;
                                                            }
                                                        }
/* 2172 */                                              o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                                                    }
/* 2179 */                                          if (o0iiOioolIiI001IO000 == null) {
/* 2218 */                                              i01oII0IOOO.I00000oIO.setMovementGranularities(accessibilityNodeInfoObtain3.getMovementGranularities() | 20);
                                                    } else {
/* 2181 */                                              OiioiIIlooo oiioiIIloooI001i1lo1io2 = o0iiOioolIiI001IO000.I001i1lo1io();
/* 2185 */                                              if (oiioiIIloooI001i1lo1io2 != null) {
/* 2191 */                                                  Object objI000II18 = oiioiIIloooI001i1lo1io2.I00iOIl.I000II(Oil0I1O.I000l1);
/* 2195 */                                                  if (objI000II18 == null) {
/* 2197 */                                                      objI000II18 = null;
                                                            }
/* 2201 */                                                  zI0000O = O0000Ioio00.I0000O(objI000II18, Boolean.TRUE);
                                                        } else {
/* 2206 */                                                  zI0000O = false;
                                                        }
/* 2207 */                                              if (zI0000O) {
                                                        }
                                                    }
                                                }
                                            }
/* 2223 */                                  arrayList = new ArrayList();
/* 2228 */                                  arrayList.add("androidx.compose.ui.semantics.id");
/* 2231 */                                  charSequenceI0000O = i01oII0IOOO.I0000O();
/* 2235 */                                  if (charSequenceI0000O != null && charSequenceI0000O.length() != 0 && oI10I1IoI0Ol4.I0000Il00O(Oiioi1IoIIli.I00000oIO)) {
/* 2254 */                                      arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
/* 2263 */                                  if (oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I001lIiIIo1O)) {
/* 2267 */                                      arrayList.add("androidx.compose.ui.semantics.testTag");
                                            }
/* 2276 */                                  if (oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I00O10llo)) {
/* 2280 */                                      arrayList.add("androidx.compose.ui.semantics.shapeType");
/* 2285 */                                      arrayList.add("androidx.compose.ui.semantics.shapeRect");
/* 2290 */                                      arrayList.add("androidx.compose.ui.semantics.shapeCorners");
/* 2295 */                                      arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
/* 2298 */                                  accessibilityNodeInfoObtain3.setAvailableExtraData(arrayList);
/* 2307 */                                  oOO01oo = (OOO01oo) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I0000Il00O);
/* 2309 */                                  if (oOO01oo != null) {
/* 2311 */                                      float f = oOO01oo.I00000oIO;
/* 2313 */                                      IOO1O00oI iOO1O00oI = oOO01oo.I00000oOI;
/* 2315 */                                      Oil0IoooOio oil0IoooOio4 = Oiioi1IoIIli.I000OOo1O;
/* 2321 */                                      if (oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio4)) {
/* 2325 */                                          i01oII0IOOO.I0000oI00("android.widget.SeekBar");
                                                } else {
/* 2331 */                                          i01oII0IOOO.I0000oI00("android.widget.ProgressBar");
                                                }
/* 2336 */                                      if (oOO01oo != OOO01oo.I0000O) {
/* 2347 */                                          accessibilityNodeInfoObtain3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, iOO1O00oI.I00000oIO, iOO1O00oI.I00000oOI, f));
                                                }
/* 2354 */                                      if (oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio4) && iOIl0OoO.I00000oIO(oil0006)) {
/* 2362 */                                          float f2 = iOO1O00oI.I00000oOI;
/* 2364 */                                          float f3 = iOO1O00oI.I00000oIO;
/* 2368 */                                          if (f2 < f3) {
/* 2370 */                                              f2 = f3;
                                                    }
/* 2373 */                                          if (f < f2) {
/* 2377 */                                              i01oII0IOOO.I00000oIO(I01o0l.I0001Ioi1lo);
                                                    }
/* 2380 */                                          float f4 = iOO1O00oI.I00000oOI;
/* 2384 */                                          if (f3 > f4) {
/* 2386 */                                              f3 = f4;
                                                    }
/* 2389 */                                          if (f > f3) {
/* 2393 */                                              i01oII0IOOO.I00000oIO(I01o0l.I000II);
                                                    }
                                                }
                                            }
/* 2400 */                                  if (iOIl0OoO.I00000oIO(oil0006)) {
/* 2408 */                                      Object objI000II19 = oil0006.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I000OOo1O);
/* 2412 */                                      if (objI000II19 == null) {
/* 2414 */                                          objI000II19 = null;
                                                }
/* 2416 */                                      I01lOOlO0o i01lOOlO0o9 = (I01lOOlO0o) objI000II19;
/* 2418 */                                      if (i01lOOlO0o9 != null) {
/* 2430 */                                          i01oII0IOOO.I00000oIO(new I01o0l(android.R.id.accessibilityActionSetProgress, i01lOOlO0o9.I00000oIO));
                                                }
                                            }
/* 2433 */                                  AccessibilityNodeInfo accessibilityNodeInfo3 = i01oII0IOOO.I00000oIO;
/* 2443 */                                  objI000II3 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 2447 */                                  if (objI000II3 == null) {
/* 2449 */                                      objI000II3 = null;
                                            }
/* 2451 */                                  iOOOoII1O = (IOOOoII1O) objI000II3;
/* 2453 */                                  if (iOOOoII1O == null) {
/* 2464 */                                      accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iOOOoII1O.I00000oIO, iOOOoII1O.I00000oOI, false, 0));
                                            } else {
/* 2470 */                                      ArrayList arrayList6 = new ArrayList();
/* 2481 */                                      Object objI000II20 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0000oI00);
/* 2485 */                                      if (objI000II20 == null) {
/* 2487 */                                          objI000II20 = null;
                                                }
/* 2489 */                                      if (objI000II20 != null) {
/* 18 */                                            List listI000OOo1O2 = oil0006.I000OOo1O((4 & 1) != 0 ? !oil0006.I00000oOI : false, (4 & 2) == 0);
/* 2499 */                                          int size8 = listI000OOo1O2.size();
/* 2504 */                                          for (int i32 = 0; i32 < size8; i32++) {
/* 2510 */                                              Oil000 oil0007 = (Oil000) listI000OOo1O2.get(i32);
/* 2524 */                                              if (oil0007.I000iOII().I00iOIl.I0000Il00O(Oil0I1O.I00Io1lO)) {
/* 2526 */                                                  arrayList6.add(oil0007);
                                                        }
                                                    }
                                                }
/* 2536 */                                      if (!arrayList6.isEmpty()) {
/* 2538 */                                          boolean zI00000oIO = iiI1i11O.I00000oIO(arrayList6);
/* 2564 */                                          accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zI00000oIO ? 1 : arrayList6.size(), zI00000oIO ? arrayList6.size() : 1, false, 0));
                                                }
                                            }
/* 2567 */                                  iiI1i11O.I00000oOI(i01oII0IOOO, oil0006);
/* 2576 */                                  oiOi0l = (OiOi0l) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I001IO000);
/* 2584 */                                  I01lOOlO0o i01lOOlO0o10 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0000O);
/* 2587 */                                  if (oiOi0l != null && i01lOOlO0o10 != null) {
/* 2599 */                                      objI000II4 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 2603 */                                      if (objI000II4 == null) {
/* 2605 */                                          objI000II4 = null;
                                                }
/* 2607 */                                      if (objI000II4 == null) {
/* 2617 */                                          Object objI000II21 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0000oI00);
/* 2621 */                                          if (objI000II21 == null) {
/* 2623 */                                              objI000II21 = null;
                                                    }
/* 2625 */                                          if (objI000II21 == null) {
/* 2630 */                                              i01oII0IOOO.I0000oI00("android.widget.HorizontalScrollView");
                                                    }
                                                }
/* 2647 */                                      if (((Number) oiOi0l.I00000oOI.invoke()).floatValue() > 0.0f) {
/* 2652 */                                          i01oII0IOOO.I00000oIO.setScrollable(true);
                                                }
/* 2659 */                                      if (iOIl0OoO.I00000oIO(oil0006)) {
/* 2665 */                                          if (I0ll1oo.I001IIilI0O(oiOi0l)) {
/* 2669 */                                              i01oII0IOOO.I00000oIO(I01o0l.I0001Ioi1lo);
/* 2672 */                                              o0iiOioolIi2 = o0iiOioolIi;
/* 2685 */                                              i01oII0IOOO.I00000oIO(o0iiOioolIi2.I00oo1iO0ll == O0iOOoiioO.I00iiI ? I01o0l.I000OOo1O : I01o0l.I000iOII);
                                                    } else {
/* 2689 */                                              o0iiOioolIi2 = o0iiOioolIi;
                                                    }
/* 2695 */                                          if (I0ll1oo.I00111O(oiOi0l)) {
/* 2699 */                                              i01oII0IOOO.I00000oIO(I01o0l.I000II);
/* 2713 */                                              i01oII0IOOO.I00000oIO(o0iiOioolIi2.I00oo1iO0ll == O0iOOoiioO.I00iiI ? I01o0l.I000iOII : I01o0l.I000OOo1O);
                                                    }
                                                }
                                            }
/* 2722 */                                  oiOi0l2 = (OiOi0l) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I001i1O0Ol);
/* 2724 */                                  if (oiOi0l2 != null || i01lOOlO0o10 == null) {
/* 2833 */                                      z3 = true;
                                            } else {
/* 2736 */                                      Object objI000II22 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 2740 */                                      if (objI000II22 == null) {
/* 2742 */                                          objI000II22 = null;
                                                }
/* 2744 */                                      if (objI000II22 == null) {
/* 2754 */                                          Object objI000II23 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0000oI00);
/* 2758 */                                          if (objI000II23 == null) {
/* 2760 */                                              objI000II23 = null;
                                                    }
/* 2762 */                                          if (objI000II23 == null) {
/* 2767 */                                              i01oII0IOOO.I0000oI00("android.widget.ScrollView");
                                                    }
                                                }
/* 2784 */                                      if (((Number) oiOi0l2.I00000oOI.invoke()).floatValue() > 0.0f) {
/* 2788 */                                          z3 = true;
/* 2789 */                                          i01oII0IOOO.I00000oIO.setScrollable(true);
                                                } else {
/* 2793 */                                          z3 = true;
                                                }
/* 2798 */                                      if (iOIl0OoO.I00000oIO(oil0006)) {
/* 2804 */                                          if (I0ll1oo.I001IIilI0O(oiOi0l2)) {
/* 2808 */                                              i01oII0IOOO.I00000oIO(I01o0l.I0001Ioi1lo);
/* 2813 */                                              i01oII0IOOO.I00000oIO(I01o0l.I000OiO);
                                                    }
/* 2820 */                                          if (I0ll1oo.I00111O(oiOi0l2)) {
/* 2824 */                                              i01oII0IOOO.I00000oIO(I01o0l.I000II);
/* 2829 */                                              i01oII0IOOO.I00000oIO(I01o0l.I000O01llI0);
                                                    }
                                                }
                                            }
/* 2834 */                                  iOIl0OIOIi1.I00000oIO(i01oII0IOOO, oil0006);
/* 2847 */                                  i01oII0IOOO.I00000oIO.setPaneTitle((CharSequence) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I0000O));
/* 2854 */                                  if (iOIl0OoO.I00000oIO(oil0006)) {
/* 2862 */                                      I01lOOlO0o i01lOOlO0o11 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I00111O);
/* 2864 */                                      if (i01lOOlO0o11 != null) {
/* 2875 */                                          i01oII0IOOO.I00000oIO(new I01o0l(262144, i01lOOlO0o11.I00000oIO));
                                                }
/* 2884 */                                      I01lOOlO0o i01lOOlO0o12 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I001IIilI0O);
/* 2886 */                                      if (i01lOOlO0o12 != null) {
/* 2897 */                                          i01oII0IOOO.I00000oIO(new I01o0l(524288, i01lOOlO0o12.I00000oIO));
                                                }
/* 2906 */                                      I01lOOlO0o i01lOOlO0o13 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I001IO000);
/* 2908 */                                      if (i01lOOlO0o13 != null) {
/* 2919 */                                          i01oII0IOOO.I00000oIO(new I01o0l(1048576, i01lOOlO0o13.I00000oIO));
                                                }
/* 2922 */                                      Oil0IoooOio oil0IoooOio5 = Oiioi1IoIIli.I001i1lo1io;
/* 2928 */                                      if (oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio5)) {
/* 2934 */                                          List list5 = (List) oiioiIIlooo4.I000OOo1O(oil0IoooOio5);
/* 2936 */                                          int size9 = list5.size();
/* 2940 */                                          OI0l1iiooO oI0l1iiooO = I0ll1oo.I010l10O;
/* 2942 */                                          int i33 = oI0l1iiooO.I00000oOI;
/* 2944 */                                          if (size9 >= i33) {
/* 3125 */                                              I000II.I001IO000(IIlIOloOOO.I00100l0("Can't have more than ", i33, " custom actions for one widget"));
/* 288 */                                               return null;
                                                    }
/* 2949 */                                          OlIIioolI olIIioolI2 = new OlIIioolI(0);
/* 2952 */                                          OI0o11I1 oI0o11I1I00000oIO = OIOi1iO01.I00000oIO();
/* 2960 */                                          if (olIIioolI.I00iOIl) {
/* 2962 */                                              iO10Oii01l.I00000oOI(olIIioolI);
                                                    }
/* 2973 */                                          if (iIIl1I0OIlO0.I00000oIO(olIIioolI.I00iio, i3, olIIioolI.I00iiI) < 0) {
/* 2976 */                                              z3 = false;
                                                    }
/* 2977 */                                          if (z3) {
/* 2987 */                                              int[] iArr = oI0l1iiooO.I00000oIO;
/* 2989 */                                              int i34 = oI0l1iiooO.I00000oOI;
/* 2985 */                                              int[] iArrCopyOf = new int[16];
/* 2992 */                                              int i35 = 0;
/* 2993 */                                              int i36 = 0;
/* 2994 */                                              while (i35 < i34) {
/* 2996 */                                                  int i37 = iArr[i35];
/* 2998 */                                                  int i38 = i34;
/* 3000 */                                                  int i39 = i36 + 1;
/* 3002 */                                                  int i40 = i35;
/* 3005 */                                                  if (iArrCopyOf.length < i39) {
/* 3020 */                                                      iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i39, (iArrCopyOf.length * 3) / 2));
                                                            }
/* 3030 */                                                  iArrCopyOf[i36] = i37;
/* 3032 */                                                  i35 = i40 + 1;
/* 3034 */                                                  i36 = i39;
/* 3035 */                                                  i34 = i38;
                                                        }
/* 3040 */                                              ArrayList arrayList7 = new ArrayList();
/* 3050 */                                              if (list5.size() > 0) {
/* 3083 */                                                  IIlIOloOOO.I001i1lo1io(list5.get(0));
/* 3086 */                                                  throw null;
                                                        }
/* 3056 */                                              if (arrayList7.size() > 0) {
/* 3064 */                                                  IIlIOloOOO.I001i1lo1io(arrayList7.get(0));
/* 3067 */                                                  if (i36 > 0) {
/* 3069 */                                                      int i41 = iArrCopyOf[0];
/* 3071 */                                                      throw null;
                                                            }
/* 3074 */                                                  lO00l0o.I00000oOI("Index must be between 0 and size");
/* 3077 */                                                  throw null;
                                                        }
                                                    } else if (list5.size() > 0) {
/* 3110 */                                              IIlIOloOOO.I001i1lo1io(list5.get(0));
/* 3113 */                                              oI0l1iiooO.I0000Il00O(0);
/* 3116 */                                              throw null;
                                                    }
/* 3099 */                                          i0ll1oo2.I00oI0i.I0000Il00O(i3, olIIioolI2);
/* 3102 */                                          olIIioolI.I0000Il00O(i3, oI0o11I1I00000oIO);
                                                }
                                            }
/* 3135 */                                  i01oII0IOOO.I00000oIO.setScreenReaderFocusable(iOIl0OoO.I0000oI00(oil0006, resources4));
/* 3140 */                                  iI0000O = i0ll1oo2.I00ooIo0.I0000O(i3);
/* 3145 */                                  if (iI0000O == -1) {
/* 3147 */                                      I10OIIo androidViewsHandler$ui2 = i0lio1O01i01.getAndroidViewsHandler$ui();
/* 3158 */                                      I10I1li0 i10I1li0I0000Il00O = androidViewsHandler$ui2 != null ? lO1i1O.I0000Il00O(androidViewsHandler$ui2, iI0000O) : null;
/* 3160 */                                      AccessibilityNodeInfo accessibilityNodeInfo4 = i01oII0IOOO.I00000oIO;
/* 3162 */                                      if (i10I1li0I0000Il00O != null) {
/* 3164 */                                          accessibilityNodeInfo4.setTraversalBefore(i10I1li0I0000Il00O);
/* 3167 */                                          i0lio1O01i012 = i0lio1O01i01;
                                                } else {
/* 3170 */                                          i0lio1O01i012 = i0lio1O01i01;
/* 3172 */                                          accessibilityNodeInfo4.setTraversalBefore(i0lio1O01i012, iI0000O);
                                                }
/* 3179 */                                      i0ll1oo2.I0000oI00(i3, i01oII0IOOO, i0ll1oo2.I00oooO, null);
                                            } else {
/* 3183 */                                      i0lio1O01i012 = i0lio1O01i01;
                                            }
/* 3187 */                                  iI0000O2 = i0ll1oo2.I00ooiO1I.I0000O(i3);
/* 3192 */                                  if (iI0000O2 != -1) {
/* 3194 */                                      I10OIIo androidViewsHandler$ui3 = i0lio1O01i012.getAndroidViewsHandler$ui();
/* 3205 */                                      I10I1li0 i10I1li0I0000Il00O2 = androidViewsHandler$ui3 != null ? lO1i1O.I0000Il00O(androidViewsHandler$ui3, iI0000O2) : null;
/* 3206 */                                      if (i10I1li0I0000Il00O2 != null) {
/* 3210 */                                          i01oII0IOOO.I00000oIO.setTraversalAfter(i10I1li0I0000Il00O2);
/* 3216 */                                          i0ll1oo2.I0000oI00(i3, i01oII0IOOO, i0ll1oo2.I0100i, null);
                                                }
                                            }
/* 3225 */                                  str = (String) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, iO0o0l0oOo0.I00000oOI);
/* 3227 */                                  if (str != null) {
/* 3229 */                                      i01oII0IOOO.I0000oI00(str);
                                            }
                                        }
                                    } else {
/* 1677 */                              i0ll1oo2 = i0ll1oo;
                                    }
/* 1668 */                          z2 = true;
/* 1687 */                          i01oII0IOOO.I00000oIO.setVisibleToUser(iO0o00ili.I0000oI00(oil0006) ^ z2);
/* 1710 */                          if ((!oil0006.I000o00OoI0I() ? oil0006.I000l1() : oil0006).I000lI().I000II()) {
                                    }
/* 1720 */                          objI000II = oI10I1IoI0Ol4.I000II(Oil0I1O.I000iOII);
/* 1724 */                          if (objI000II == null) {
                                    }
/* 1728 */                          o11100o0O = (O11100o0O) objI000II;
/* 1730 */                          if (o11100o0O != null) {
                                    }
/* 1748 */                          i01oII0IOOO.I00000oIO.setClickable(false);
/* 1753 */                          objI000II2 = oI10I1IoI0Ol4.I000II(Oiioi1IoIIli.I00000oOI);
/* 1757 */                          if (objI000II2 == null) {
                                    }
/* 1761 */                          i01lOOlO0o = (I01lOOlO0o) objI000II2;
/* 1765 */                          if (i01lOOlO0o != null) {
                                    }
/* 1841 */                          i01oII0IOOO.I00000oIO.setLongClickable(false);
/* 1850 */                          i01lOOlO0o2 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0000Il00O);
/* 1852 */                          if (i01lOOlO0o2 != null) {
                                    }
/* 1884 */                          i01lOOlO0o3 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I00100o1O0lo);
/* 1886 */                          if (i01lOOlO0o3 != null) {
                                    }
/* 1904 */                          if (iOIl0OoO.I00000oIO(oil0006)) {
                                    }
/* 2028 */                          strI000oI1ioi = I0ll1oo.I000oI1ioi(oil0006);
/* 2032 */                          if (strI000oI1ioi != null) {
/* 2050 */                              accessibilityNodeInfoObtain3.setTextSelection(i0ll1oo2.I000lI(oil0006), i0ll1oo2.I000l1(oil0006));
/* 2059 */                              I01lOOlO0o i01lOOlO0o82 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I000OiO);
/* 2075 */                              i01oII0IOOO.I00000oIO(new I01o0l(131072, i01lOOlO0o82 == null ? i01lOOlO0o82.I00000oIO : null));
/* 2082 */                              i01oII0IOOO.I00000oIO.addAction(Barcode.FORMAT_QR_CODE);
/* 2089 */                              i01oII0IOOO.I00000oIO.addAction(Barcode.FORMAT_UPC_A);
/* 2096 */                              i01oII0IOOO.I00000oIO.setMovementGranularities(11);
/* 2105 */                              list = (List) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I00000oIO);
/* 2109 */                              if (list != null) {
/* 2144 */                                  o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
                                            while (true) {
/* 2148 */                                      if (o0iiOioolIiI001IO000 == null) {
                                                }
/* 2172 */                                      o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                                            }
/* 2179 */                                  if (o0iiOioolIiI001IO000 == null) {
                                            }
                                        } else {
/* 2144 */                                  o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
                                            while (true) {
/* 2148 */                                      if (o0iiOioolIiI001IO000 == null) {
                                                }
/* 2172 */                                      o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                                            }
/* 2179 */                                  if (o0iiOioolIiI001IO000 == null) {
                                            }
                                        }
                                    }
/* 2223 */                          arrayList = new ArrayList();
/* 2228 */                          arrayList.add("androidx.compose.ui.semantics.id");
/* 2231 */                          charSequenceI0000O = i01oII0IOOO.I0000O();
/* 2235 */                          if (charSequenceI0000O != null) {
/* 2254 */                              arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
/* 2263 */                          if (oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I001lIiIIo1O)) {
                                    }
/* 2276 */                          if (oI10I1IoI0Ol4.I0000Il00O(Oil0I1O.I00O10llo)) {
                                    }
/* 2298 */                          accessibilityNodeInfoObtain3.setAvailableExtraData(arrayList);
/* 2307 */                          oOO01oo = (OOO01oo) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I0000Il00O);
/* 2309 */                          if (oOO01oo != null) {
                                    }
/* 2400 */                          if (iOIl0OoO.I00000oIO(oil0006)) {
                                    }
/* 2433 */                          AccessibilityNodeInfo accessibilityNodeInfo32 = i01oII0IOOO.I00000oIO;
/* 2443 */                          objI000II3 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 2447 */                          if (objI000II3 == null) {
                                    }
/* 2451 */                          iOOOoII1O = (IOOOoII1O) objI000II3;
/* 2453 */                          if (iOOOoII1O == null) {
                                    }
/* 2567 */                          iiI1i11O.I00000oOI(i01oII0IOOO, oil0006);
/* 2576 */                          oiOi0l = (OiOi0l) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I001IO000);
/* 2584 */                          I01lOOlO0o i01lOOlO0o102 = (I01lOOlO0o) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oiioi1IoIIli.I0000O);
/* 2587 */                          if (oiOi0l != null) {
/* 2599 */                              objI000II4 = oil0006.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 2603 */                              if (objI000II4 == null) {
                                        }
/* 2607 */                              if (objI000II4 == null) {
                                        }
/* 2647 */                              if (((Number) oiOi0l.I00000oOI.invoke()).floatValue() > 0.0f) {
                                        }
/* 2659 */                              if (iOIl0OoO.I00000oIO(oil0006)) {
                                        }
                                    }
/* 2722 */                          oiOi0l2 = (OiOi0l) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I001i1O0Ol);
/* 2724 */                          if (oiOi0l2 != null) {
/* 2833 */                              z3 = true;
/* 2834 */                              iOIl0OIOIi1.I00000oIO(i01oII0IOOO, oil0006);
/* 2847 */                              i01oII0IOOO.I00000oIO.setPaneTitle((CharSequence) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, Oil0I1O.I0000O));
/* 2854 */                              if (iOIl0OoO.I00000oIO(oil0006)) {
                                        }
/* 3135 */                              i01oII0IOOO.I00000oIO.setScreenReaderFocusable(iOIl0OoO.I0000oI00(oil0006, resources4));
/* 3140 */                              iI0000O = i0ll1oo2.I00ooIo0.I0000O(i3);
/* 3145 */                              if (iI0000O == -1) {
                                        }
/* 3187 */                              iI0000O2 = i0ll1oo2.I00ooiO1I.I0000O(i3);
/* 3192 */                              if (iI0000O2 != -1) {
                                        }
/* 3225 */                              str = (String) lO1OIil0o0oo.I00000oIO(oiioiIIlooo4, iO0o0l0oOo0.I00000oOI);
/* 3227 */                              if (str != null) {
                                        }
                                    }
                                }
                            } else {
/* 134 */                       i0ll1oo2 = i0ll1oo3;
/* 135 */                       i3 = i;
/* 136 */                       i01oII0IOOO = null;
                            }
                        }
                    }
/* 3234 */          if (i0ll1oo2.I00o0iI0io1) {
/* 3238 */              if (i3 == i0ll1oo2.I00li1OI) {
/* 3240 */                  i0ll1oo2.I00lli11 = i01oII0IOOO;
                        }
/* 3244 */              if (i3 == i0ll1oo2.I00ll1) {
/* 3246 */                  i0ll1oo2.I00lll10 = i01oII0IOOO;
                        }
                    }
/* 3248 */          return i01oII0IOOO;
                }
            }
