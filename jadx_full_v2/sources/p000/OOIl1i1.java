            package p000;

            import android.R;
            import android.content.SharedPreferences;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.Log;
            import android.view.View;
            import android.view.WindowInsets;
            import android.view.WindowInsetsController;
            import android.view.inputmethod.InputMethodManager;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            import com.google.android.material.sidesheet.SideSheetBehavior;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class OOIl1i1 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;

                public OOIl1i1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [IOoil1iiIilo] */
                /* JADX WARN: Type inference failed for: r5v11 */
                @Override
                public final void run() throws InterruptedException {
                    View viewFindViewById;
                    View viewFindFocus;
/* 1 */             int i = this.I00iOIl;
/* 5 */             int i2 = 8;
/* 9 */             int i3 = 2;
/* 10 */            int i4 = 0;
/* 11 */            Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 774 */                   OOIliOOi010 oOIliOOi010 = (OOIliOOi010) obj;
/* 776 */                   O0oiiOll0O1 o0oiiOll0O1 = oOIliOOi010.I00ilO0;
/* 780 */                   if (oOIliOOi010.I00iiI == 0) {
/* 782 */                       oOIliOOi010.I00iiO = true;
/* 786 */                       o0oiiOll0O1.I010iIIOlo(O0oOOiI0.ON_PAUSE);
                            }
/* 791 */                   if (oOIliOOi010.I00iOIl == 0 && oOIliOOi010.I00iiO) {
/* 799 */                       o0oiiOll0O1.I010iIIOlo(O0oOOiI0.ON_STOP);
/* 802 */                       oOIliOOi010.I00iio = true;
/* 804 */                       return;
                            }
/* 804 */                   return;
                        case 1:
/* 722 */                   OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) obj;
/* 742 */                   l11I11lO.I0000Il00O("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + oOIo1Iiiil.I00000oIO);
/* 745 */                   Oi0Oi10I oi0Oi10I = oOIo1Iiiil.I000II;
/* 747 */                   oi0Oi10I.getClass();
/* 750 */                   lOllIO.I00000oIO();
/* 755 */                   if (oi0Oi10I.I000II) {
/* 773 */                       return;
                            }
/* 760 */                   Executor executor = oi0Oi10I.I00000oIO.I0000Il00O;
/* 764 */                   I0il01i00i i0il01i00i = new I0il01i00i(i3);
/* 767 */                   VarHandle.storeStoreFence();
/* 770 */                   executor.execute(i0il01i00i);
/* 773 */                   return;
                        case 2:
/* 704 */                   RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) obj;
/* 706 */                   String str = RemoteWorkManagerClient.I000OOo1O;
/* 718 */                   ((Handler) remoteWorkManagerClient.I000II.I00iOIl).postDelayed(remoteWorkManagerClient.I000O01llI0, remoteWorkManagerClient.I0001Ioi1lo);
/* 721 */                   return;
                        case 3:
/* 1 */                     Oi1ii0l0.setRippleState$lambda$1((Oi1ii0l0) obj);
/* 703 */                   return;
                        case 4:
/* 655 */                   Oi1oO0Iooi1o oi1oO0Iooi1o = (Oi1oO0Iooi1o) obj;
/* 663 */                   boolean z = oi1oO0Iooi1o.I0000Il00O > 0;
/* 670 */                   if (oi1oO0Iooi1o.I00100l0.compareAndSet(false, true) && z) {
/* 676 */                       IIOlO1ii iIOlO1ii = oi1oO0Iooi1o.I000l1.I00000oIO;
/* 678 */                       if (iIOlO1ii != null) {
/* 687 */                           iOi1II01i0.I0000O(iIOlO1ii, oi1oO0Iooi1o.I0010o, null, new Oi1oO0lIlO(oi1oO0Iooi1o, windowInsetsController, i4), 2);
/* 697 */                           return;
                                } else {
/* 693 */                           O0000Ioio00.I000OOo1O("coroutineScope");
/* 696 */                           throw null;
                                }
                            }
/* 697 */                   return;
                        case 5:
/* 651 */                   ((I0IOIlIOIII) obj).I000O01llI0();
/* 654 */                   return;
                        case 6:
/* 578 */                   I1ii1o0 i1ii1o0 = (I1ii1o0) obj;
                            synchronized (((ArrayDeque) i1ii1o0.I00ilI0I1)) {
/* 589 */                       SharedPreferences.Editor editorEdit = ((SharedPreferences) i1ii1o0.I00iiI).edit();
/* 595 */                       String str2 = (String) i1ii1o0.I00iiO;
/* 599 */                       StringBuilder sb = new StringBuilder();
/* 606 */                       Iterator it = ((ArrayDeque) i1ii1o0.I00ilI0I1).iterator();
/* 614 */                       while (it.hasNext()) {
/* 622 */                           sb.append((String) it.next());
/* 629 */                           sb.append((String) i1ii1o0.I00iio);
                                }
/* 641 */                       editorEdit.putString(str2, sb.toString()).apply();
                            }
/* 645 */                   return;
                        case 7:
/* 566 */                   SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((I0IIiO0iI) obj).I00iiI;
/* 568 */                   int i5 = sideSheetBehavior.I0000O;
/* 570 */                   if (i5 != 2 || i5 == 0) {
/* 577 */                       return;
                            }
/* 575 */                   sideSheetBehavior.I0000O = 0;
/* 577 */                   return;
                        case 8:
/* 544 */                   View view = (View) obj;
/* 558 */                   ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
/* 561 */                   return;
                        case 9:
/* 540 */                   ((IoilI00) obj).I00000oIO();
/* 543 */                   return;
                        case 10:
/* 534 */                   ((IiIO1ol1i1o0) obj).I00000oOI();
/* 537 */                   return;
                        case 11:
/* 503 */                   Iio111Ii0 iio111Ii0 = (Iio111Ii0) ((IoIlOo1o0IIl) obj).I00iio;
/* 505 */                   if (iio111Ii0 != null) {
/* 511 */                       Iterator it2 = iio111Ii0.values().iterator();
/* 519 */                       while (it2.hasNext()) {
/* 527 */                           ((OlioOil) it2.next()).I00000oOI();
                                }
/* 531 */                       return;
                            }
/* 531 */                   return;
                        case 12:
/* 495 */                   ((IiI0oIlol0) obj).I00000oIO();
/* 498 */                   return;
                        case 13:
/* 141 */                   Oo0Ooo1Oi oo0Ooo1Oi = (Oo0Ooo1Oi) obj;
/* 143 */                   IoIlOo1o0IIl ioIlOo1o0IIl = oo0Ooo1Oi.I00000oOI;
/* 145 */                   oo0Ooo1Oi.I000o00OoI0I = null;
/* 147 */                   OI110O0 oi110o0 = oo0Ooo1Oi.I000lI;
/* 149 */                   View view2 = oo0Ooo1Oi.I00000oIO;
/* 155 */                   if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
/* 173 */                       oi110o0.I000II();
/* 492 */                       return;
                            }
/* 178 */                   Object[] objArr = oi110o0.I00iOIl;
/* 180 */                   int i6 = oi110o0.I00iiO;
/* 182 */                   Boolean bool = null;
/* 183 */                   Boolean boolValueOf = null;
/* 185 */                   for (int i7 = 0; i7 < i6; i7++) {
/* 189 */                       Oo0OoOo00 oo0OoOo00 = (Oo0OoOo00) objArr[i7];
/* 191 */                       int iOrdinal = oo0OoOo00.ordinal();
/* 195 */                       if (iOrdinal == 0) {
/* 234 */                           bool = Boolean.TRUE;
                                } else if (iOrdinal == 1) {
/* 230 */                           bool = Boolean.FALSE;
                                } else if (iOrdinal != 2 && iOrdinal != 3) {
/* 205 */                           I000II.I00000oIO();
/* 492 */                           return;
                                } else {
/* 216 */                           if (!O0000Ioio00.I0000O(bool, Boolean.FALSE)) {
/* 225 */                               boolValueOf = Boolean.valueOf(oo0OoOo00 == Oo0OoOo00.I00iiO);
                                    }
                                }
/* 232 */                       boolValueOf = bool;
                            }
/* 240 */                   oi110o0.I000II();
/* 249 */                   if (O0000Ioio00.I0000O(bool, Boolean.TRUE)) {
/* 265 */                       ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl.I00iiO).getValue()).restartInput((View) ioIlOo1o0IIl.I00iiI);
                            }
/* 268 */                   if (boolValueOf != null) {
/* 270 */                       boolean zBooleanValue = boolValueOf.booleanValue();
/* 276 */                       Oi00IilOloo0 oi00IilOloo0 = (Oi00IilOloo0) ioIlOo1o0IIl.I00iio;
/* 278 */                       if (zBooleanValue) {
/* 282 */                           OlOO1i11110 olOO1i11110 = (OlOO1i11110) oi00IilOloo0.I00iOIl;
/* 286 */                           View view3 = (View) olOO1i11110.I00iiO;
/* 290 */                           WindowInsetsController windowInsetsController = view3 != null ? view3.getWindowInsetsController() : null;
/* 294 */                           if (windowInsetsController != null) {
/* 300 */                               windowInsetsController.show(WindowInsets.Type.ime());
                                    }
/* 305 */                           View view4 = (View) olOO1i11110.I00iiI;
/* 307 */                           if (view4 != null) {
/* 315 */                               if (view4.isInEditMode() || view4.onCheckIsTextEditor()) {
/* 333 */                                   view4.requestFocus();
/* 336 */                                   viewFindViewById = view4;
                                        } else {
/* 328 */                                   viewFindViewById = view4.getRootView().findFocus();
                                        }
/* 337 */                               if (viewFindViewById == null) {
/* 346 */                                   viewFindViewById = view4.getRootView().findViewById(R.id.content);
                                        }
/* 350 */                               if (viewFindViewById != null && viewFindViewById.hasWindowFocus()) {
/* 360 */                                   OOIl1i1 oOIl1i1 = new OOIl1i1(i2);
/* 363 */                                   oOIl1i1.I00iiI = viewFindViewById;
/* 365 */                                   VarHandle.storeStoreFence();
/* 368 */                                   viewFindViewById.post(oOIl1i1);
                                        }
                                    }
                                } else {
/* 374 */                           OlOO1i11110 olOO1i111102 = (OlOO1i11110) oi00IilOloo0.I00iOIl;
/* 380 */                           View view5 = (View) olOO1i111102.I00iiO;
/* 384 */                           windowInsetsController = view5 != null ? view5.getWindowInsetsController() : 0;
/* 388 */                           if (windowInsetsController != 0) {
/* 392 */                               AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 397 */                               OlI000i olI000i = new OlI000i();
/* 400 */                               olI000i.I00000oIO = atomicBoolean;
/* 402 */                               VarHandle.storeStoreFence();
/* 405 */                               windowInsetsController.addOnControllableInsetsChangedListener(olI000i);
/* 412 */                               if (!atomicBoolean.get() && view5 != null) {
/* 430 */                                   ((InputMethodManager) view5.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view5.getWindowToken(), 0);
                                        }
/* 433 */                               windowInsetsController.removeOnControllableInsetsChangedListener(olI000i);
/* 440 */                               windowInsetsController.hide(WindowInsets.Type.ime());
                                    } else {
/* 446 */                               View view6 = (View) olOO1i111102.I00iiI;
/* 448 */                               if (view6 != null) {
/* 464 */                                   ((InputMethodManager) view6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view6.getWindowToken(), 0);
                                        }
                                    }
                                }
                            }
/* 473 */                   if (O0000Ioio00.I0000O(bool, Boolean.FALSE)) {
/* 489 */                       ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl.I00iiO).getValue()).restartInput((View) ioIlOo1o0IIl.I00iiI);
/* 492 */                       return;
                            }
/* 492 */                   return;
                        case 14:
/* 96 */                    ArrayList arrayList = (ArrayList) obj;
/* 98 */                    Iterator it3 = arrayList.iterator();
/* 106 */                   while (it3.hasNext()) {
/* 114 */                       ((ExecutorService) it3.next()).shutdownNow();
                            }
/* 118 */                   Iterator it4 = arrayList.iterator();
/* 126 */                   while (it4.hasNext()) {
/* 136 */                       ((ExecutorService) it4.next()).awaitTermination(1L, TimeUnit.SECONDS);
                            }
/* 140 */                   return;
                        case 15:
/* 85 */                    HandlerThread handlerThread = (HandlerThread) obj;
/* 87 */                    handlerThread.quit();
/* 92 */                    handlerThread.join(1000L);
/* 95 */                    return;
                        case 16:
/* 74 */                    ExecutorService executorService = (ExecutorService) obj;
/* 76 */                    executorService.shutdownNow();
/* 81 */                    executorService.awaitTermination(1L, TimeUnit.SECONDS);
/* 84 */                    return;
                        case 17:
/* 36 */                    i011ol i011olVar = (i011ol) obj;
/* 65 */                    Log.w("FirebaseMessaging", "Service took too long to process intent: " + i011olVar.I00000oIO.getAction() + " finishing.");
/* 70 */                    i011olVar.I00000oOI.I0000O(null);
/* 73 */                    return;
                        default:
/* 16 */                    o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) obj;
/* 20 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) o01l1iooo0.I00iio;
/* 24 */                    Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(i2);
/* 27 */                    olio1i0OI00i.I00iiI = o01l1iooo0;
/* 29 */                    VarHandle.storeStoreFence();
/* 32 */                    oiIIilol0iO.I00100l0(olio1i0OI00i);
/* 35 */                    return;
                    }
                }
            }
