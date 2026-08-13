            package p000;

            import android.content.Context;
            import android.content.res.AssetManager;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import android.util.Log;
            import android.util.SparseArray;
            import androidx.work.impl.model.WorkSpec;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.play.core.assetpacks.bs;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            
            public final class iooili01 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public iooili01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
                
                    if (r1 == false) goto L51;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
                
                    r1 = r1 | java.lang.Thread.interrupted();
                    r2 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
                
                    ((java.lang.Runnable) r10.I00iiI).run();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
                
                    p000.OilOi11lI0.I00ilO0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.I00iiI), (java.lang.Throwable) r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
                
                    r10.I00iiI = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO() {
                    Runnable runnable;
/* 1 */             boolean z = false;
/* 2 */             boolean zInterrupted = false;
                    while (true) {
                        try {
                            synchronized (((OilOi11lI0) this.I00iiO).I00iiI) {
/* 11 */                        if (z) {
/* 55 */                            runnable = (Runnable) ((OilOi11lI0) this.I00iiO).I00iiI.poll();
/* 57 */                            this.I00iiI = runnable;
/* 59 */                            if (runnable != null) {
                                    }
                                } else {
/* 15 */                            OilOi11lI0 oilOi11lI0 = (OilOi11lI0) this.I00iiO;
/* 20 */                            if (oilOi11lI0.I00iiO != 4) {
                                        oilOi11lI0.I00iio++;
/* 42 */                                oilOi11lI0.I00iiO = 4;
/* 44 */                                z = true;
/* 55 */                                runnable = (Runnable) ((OilOi11lI0) this.I00iiO).I00iiI.poll();
/* 57 */                                this.I00iiI = runnable;
/* 59 */                                if (runnable != null) {
/* 65 */                                    ((OilOi11lI0) this.I00iiO).I00iiO = 1;
                                        }
                                    }
                                }
                            }
/* 23 */                    if (!zInterrupted) {
/* 71 */                        return;
                            }
                        } finally {
/* 128 */                   if (zInterrupted) {
/* 134 */                       Thread.currentThread().interrupt();
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:187:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Throwable thI00000oOI;
                    IoOiO1o1oI loo1iool0;
                    Long lValueOf;
                    switch (this.I00iOIl) {
                        case 0:
/* 971 */                   iooOIOOo1 ioooiooo1 = (iooOIOOo1) this.I00iiO;
/* 975 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 979 */                   if ((listenableFuture instanceof ioOi11iiI) && (thI00000oOI = ((ioOi11iiI) listenableFuture).I00000oOI()) != null) {
/* 991 */                       ioooiooo1.zza(thI00000oOI);
/* 1016 */                      return;
                            }
                            try {
/* 999 */                       ioooiooo1.zzb(liolilo.I0000oI00(listenableFuture));
/* 1016 */                      return;
                            } catch (ExecutionException e) {
/* 1013 */                      ioooiooo1.zza(e.getCause());
/* 1016 */                      return;
                            } catch (Throwable th) {
/* 1004 */                      ioooiooo1.zza(th);
/* 1016 */                      return;
                            }
                        case 1:
/* 942 */                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 946 */                   int i = IiIilii1I.I0000oI00;
/* 950 */                   WorkSpec workSpec = (WorkSpec) this.I00iiI;
/* 952 */                   iIi0oIlI000II.getClass();
/* 965 */                   ((IiIilii1I) this.I00iiO).I00000oIO.I00000oOI(workSpec);
/* 968 */                   return;
                        case 2:
                            try {
/* 919 */                       I00000oIO();
/* 922 */                       return;
                            } catch (Error e2) {
                                synchronized (((OilOi11lI0) this.I00iiO).I00iiI) {
/* 935 */                           ((OilOi11lI0) this.I00iiO).I00iiO = 1;
/* 938 */                           throw e2;
                                }
                            }
                        case 3:
/* 879 */                   i0Iii1o10 i0iii1o10 = (i0Iii1o10) this.I00iiI;
/* 883 */                   bs bsVar = (bs) this.I00iiO;
                            synchronized (i0iii1o10) {
/* 893 */                       Iterator it = new HashSet(i0iii1o10.I0000O).iterator();
/* 901 */                       while (it.hasNext()) {
/* 909 */                           ((OlO1OoIo1l) it.next()).onStateUpdate(bsVar);
                                }
                            }
/* 916 */                   return;
                        case 4:
/* 735 */                   i0Oll0oI110 i0oll0oi110 = (i0Oll0oI110) this.I00iiO;
/* 739 */                   i0i010Oli i0i010oli = (i0i010Oli) this.I00iiI;
/* 741 */                   IOlo10lO1iOl iOlo10lO1iOl = i0i010oli.I00iiI;
/* 745 */                   if (iOlo10lO1iOl.I00iiI == 0) {
/* 747 */                       i0i0iO i0i0io = i0i010oli.I00iiO;
/* 749 */                       lII0I0I000I.I000II(i0i0io);
/* 752 */                       IOlo10lO1iOl iOlo10lO1iOl2 = i0i0io.I00iiO;
/* 756 */                       if (iOlo10lO1iOl2.I00iiI != 0) {
/* 852 */                           Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(iOlo10lO1iOl2)), new Exception());
/* 857 */                           i0oll0oi110.I000o00OoI0I.I00000oIO(iOlo10lO1iOl2);
/* 862 */                           i0oll0oi110.I000lI.I0000Il00O();
/* 876 */                           return;
                                }
/* 758 */                       OIoIIOIioo oIoIIOIioo = i0oll0oi110.I000o00OoI0I;
/* 760 */                       IBinder iBinder = i0i0io.I00iiI;
/* 762 */                       if (iBinder == null) {
/* 764 */                           loo1iool0 = null;
                                } else {
/* 766 */                           int i2 = I0I0Oollll1i.I000O01llI0;
/* 770 */                           IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 783 */                           loo1iool0 = iInterfaceQueryLocalInterface instanceof IoOiO1o1oI ? (IoOiO1o1oI) iInterfaceQueryLocalInterface : new loO1Iool0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 10);
                                }
/* 786 */                       Set set = i0oll0oi110.I000iOII;
/* 788 */                       oIoIIOIioo.getClass();
/* 791 */                       if (loo1iool0 == null || set == null) {
/* 823 */                           Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
/* 831 */                           oIoIIOIioo.I00000oIO(new IOlo10lO1iOl(4, null, null));
                                } else {
/* 796 */                           oIoIIOIioo.I00iio = loo1iool0;
/* 798 */                           oIoIIOIioo.I00ilI0I1 = set;
/* 802 */                           if (oIoIIOIioo.I00iOIl) {
/* 810 */                               ((Io0OoIoOo) oIoIIOIioo.I00iiI).I000OiO(loo1iool0, set);
                                    }
                                }
                            } else {
/* 868 */                       i0oll0oi110.I000o00OoI0I.I00000oIO(iOlo10lO1iOl);
                            }
/* 873 */                   i0oll0oi110.I000lI.I0000Il00O();
/* 876 */                   return;
                        case 5:
/* 729 */                   ((ii0IiOii) this.I00iiI).zza((iOioIII1i) this.I00iiO);
/* 732 */                   return;
                        case 6:
/* 650 */                   il11loI il11loi = (il11loI) this.I00iiO;
/* 652 */                   o0IiOl o0iiol = il11loi.I00iio;
                            try {
/* 664 */                       OloIIoII1oo oloIIoII1oo = (OloIIoII1oo) il11loi.I00iiO.I0000O((OloIIoII1oo) this.I00iiI);
/* 666 */                       if (oloIIoII1oo == null) {
/* 675 */                           il11loi.onFailure(new NullPointerException("Continuation returned null"));
/* 720 */                           return;
                                }
/* 679 */                       Iii11l iii11l = OloIo0oOIO0.I00000oOI;
/* 681 */                       oloIIoII1oo.I0000oI00(iii11l, il11loi);
/* 684 */                       oloIIoII1oo.I0000O(iii11l, il11loi);
/* 687 */                       oloIIoII1oo.I00000oIO(iii11l, il11loi);
/* 720 */                       return;
                            } catch (OiII01 e3) {
/* 705 */                       if (e3.getCause() instanceof Exception) {
/* 713 */                           o0iiol.I000oI1ioi((Exception) e3.getCause());
/* 720 */                           return;
                                } else {
/* 717 */                           o0iiol.I000oI1ioi(e3);
/* 720 */                           return;
                                }
                            } catch (Exception e4) {
/* 695 */                       o0iiol.I000oI1ioi(e4);
/* 720 */                       return;
                            }
                        case 7:
/* 610 */                   lOliOlO1Io loliolo1ioI000OOo1O = ((AppMeasurementDynamiteService) this.I00iiO).I000II.I000OOo1O();
/* 616 */                   il0IOO il0ioo = (il0IOO) this.I00iiI;
/* 618 */                   loliolo1ioI000OOo1O.I010II();
/* 621 */                   loliolo1ioI000OOo1O.I010OIo1l();
/* 624 */                   lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(false);
/* 632 */                   O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(17);
/* 635 */                   o10oO1IiI1.I00iiI = lli10iiI011IO1I11OI;
/* 637 */                   o10oO1IiI1.I00iiO = il0ioo;
/* 639 */                   o10oO1IiI1.I00iio = loliolo1ioI000OOo1O;
/* 641 */                   VarHandle.storeStoreFence();
/* 644 */                   loliolo1ioI000OOo1O.I0110o(o10oO1IiI1);
/* 647 */                   return;
                        case 8:
/* 573 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 575 */                   lilool0.I00OI1();
/* 582 */                   lilool0.I00iOIl().I010II();
/* 585 */                   lilool0.I00iIi0i1o();
/* 590 */                   lli10iI lli10ii = (lli10iI) this.I00iiI;
/* 594 */                   lII0I0I000I.I0000O(lli10ii.I00iOIl);
/* 597 */                   lilool0.I00iiO(lli10ii);
/* 600 */                   lilool0.I00iio(lli10ii);
/* 603 */                   return;
                        case 9:
/* 429 */                   il0IOO il0ioo2 = (il0IOO) this.I00iiI;
/* 433 */                   lIl1O1li lil1o1li = (lIl1O1li) this.I00iiO;
/* 439 */                   li10O1l0 li10o1l0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ioIO;
/* 441 */                   l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 446 */                   l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 448 */                   l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 450 */                   l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 452 */                   l0olllO1i.I0000oI00(l0oi0o);
/* 465 */                   if (l0oi0o.I010l1ol111().I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 481 */                       l0olllO1i.I0000oI00(l0oi0o2);
/* 486 */                       l0olllo1i.I00li1OI.getClass();
/* 497 */                       if (!l0oi0o2.I010o0o0oO(System.currentTimeMillis())) {
/* 499 */                           l0olllO1i.I0000oI00(l0oi0o2);
/* 512 */                           if (l0oi0o2.I00o101lO.I00000oIO() != 0) {
/* 515 */                               l0olllO1i.I0000oI00(l0oi0o2);
/* 524 */                               lValueOf = Long.valueOf(l0oi0o2.I00o101lO.I00000oIO());
                                    }
                                }
/* 528 */                       if (lValueOf == null) {
/* 534 */                           lioil0ilIOi lioil0ilioi = ((l0olllO1i) lil1o1li.I00iOIl).I00l0I0l0lO1;
/* 536 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 543 */                           lioil0ilioi.I01Io000(il0ioo2, lValueOf.longValue());
/* 568 */                           return;
                                } else {
                                    try {
/* 547 */                               il0ioo2.I001i1lo1io(null);
/* 568 */                               return;
                                    } catch (RemoteException e5) {
/* 556 */                               l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 558 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 565 */                               l01o0io1ooo0.I00ilO0.I0000Il00O("getSessionId failed with exception", e5);
/* 568 */                               return;
                                    }
                                }
                            }
/* 467 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 469 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 476 */                   l01o0io1ooo02.I00li1OI.I00000oOI("Analytics storage consent denied; will not get session id");
/* 479 */                   lValueOf = null;
/* 528 */                   if (lValueOf == null) {
                            }
                        case 10:
/* 423 */                   ((O1oo0i) this.I00iiI).zzb((OloIlI0ll) this.I00iiO);
/* 426 */                   return;
                        case 11:
/* 337 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiO;
/* 339 */                   iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 343 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) loliolo1io.I00iOIl;
/* 345 */                   if (iolll0ill1iVar == null) {
/* 347 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 349 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 356 */                       l01o0io1ooo03.I00ilO0.I00000oOI("Discarding data. Failed to send app launch");
/* 414 */                       return;
                            }
                            try {
/* 362 */                       lli10iI lli10ii2 = (lli10iI) this.I00iiI;
/* 364 */                       iIl1iil iil1iil = l0olllo1i2.I00iio;
/* 366 */                       iol01I0001 iol01i0001 = iol1II1ii1i.I010ioo;
/* 372 */                       if (iil1iil.I01101IOlO(null, iol01i0001)) {
/* 374 */                           loliolo1io.I011Io0I1ioi(iolll0ill1iVar, null, lli10ii2);
                                }
/* 380 */                       iolll0ill1iVar.I00100o1O0lo(lli10ii2);
/* 387 */                       l0olllo1i2.I000O01llI0().I010l10O();
/* 392 */                       l0olllo1i2.I00iio.I01101IOlO(null, iol01i0001);
/* 395 */                       loliolo1io.I011Io0I1ioi(iolll0ill1iVar, null, lli10ii2);
/* 398 */                       loliolo1io.I0110OiO();
/* 414 */                       return;
                            } catch (RemoteException e6) {
/* 402 */                       l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 404 */                       l0olllO1i.I000II(l01o0io1ooo04);
/* 411 */                       l01o0io1ooo04.I00ilO0.I0000Il00O("Failed to send app launch to the service", e6);
/* 414 */                       return;
                            }
                        case 12:
/* 258 */                   lli1OiO lli1oio = (lli1OiO) this.I00iiO;
/* 263 */                   liiilOIIl liiiloiil = (liiilOIIl) this.I00iiI;
/* 265 */                   int i3 = lli1oio.I00000oIO;
                            synchronized (liiiloiil) {
/* 268 */                       SparseArray sparseArray = liiiloiil.I00ilI0I1;
/* 274 */                       lli1OiO lli1oio2 = (lli1OiO) sparseArray.get(i3);
/* 276 */                       if (lli1oio2 != null) {
/* 290 */                           StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
/* 295 */                           sb.append("Timing out request: ");
/* 298 */                           sb.append(i3);
/* 307 */                           Log.w("MessengerIpcClient", sb.toString());
/* 310 */                           sparseArray.remove(i3);
/* 322 */                           lli1oio2.I0000Il00O(new I1o1lOlooI1("Timed out waiting for response", null, 13));
/* 325 */                           liiiloiil.I0000O();
                                }
                            }
/* 332 */                   return;
                        default:
/* 16 */                    Context context = ((lIlIo1) this.I00iiI).I00000oOI;
/* 22 */                    OOoli1l oOoli1l = IOO0o0I1l.I00l0I0l0lO1;
/* 24 */                    if (oOoli1l == null) {
                                synchronized (IOO0o0I1l.I00ioIO) {
/* 29 */                            oOoli1l = IOO0o0I1l.I00l0I0l0lO1;
/* 31 */                            if (oOoli1l == null) {
/* 36 */                                I00Ol00 i00Ol00 = new I00Ol00(4, 7);
                                        try {
/* 45 */                                    String[] list = context.getAssets().list("phenotype");
/* 49 */                                    if (list != null) {
/* 52 */                                        for (String str : list) {
/* 62 */                                            if (str.endsWith("_package_metadata.binarypb")) {
                                                        try {
/* 66 */                                                    AssetManager assets = context.getAssets();
/* 77 */                                                    StringBuilder sb2 = new StringBuilder(str.length() + 10);
/* 80 */                                                    sb2.append("phenotype/");
/* 83 */                                                    sb2.append(str);
/* 90 */                                                    InputStream inputStreamOpen = assets.open(sb2.toString());
                                                            try {
/* 96 */                                                        i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 98 */                                                        int i4 = i1ioiooIiOol.I00000oIO;
/* 102 */                                                       liool1o1Oooi liool1o1oooiI001IO000 = liool1o1Oooi.I001IO000(inputStreamOpen, i1o0l0i.I00000oOI);
/* 108 */                                                       IOO0o0I1l iOO0o0I1l = new IOO0o0I1l(8);
/* 126 */                                                       String strI00000oOI = liool1o1oooiI001IO000.I001IIilI0O() ? lIillol1io.I00000oOI(context, liool1o1oooiI001IO000.I00111O()) : liool1o1oooiI001IO000.I00111O();
/* 130 */                                                       VarHandle.storeStoreFence();
/* 133 */                                                       i00Ol00.I0010I0i(strI00000oOI, iOO0o0I1l);
/* 136 */                                                       if (inputStreamOpen != null) {
/* 138 */                                                           inputStreamOpen.close();
                                                                }
                                                            } catch (Throwable th2) {
/* 149 */                                                       if (inputStreamOpen != null) {
                                                                    try {
/* 151 */                                                               inputStreamOpen.close();
                                                                    } catch (Throwable th3) {
/* 156 */                                                               th2.addSuppressed(th3);
                                                                    }
                                                                }
/* 159 */                                                       throw th2;
                                                                break;
                                                            }
                                                        } catch (iI00lI e7) {
/* 170 */                                                   StringBuilder sb3 = new StringBuilder(str.length() + 45);
/* 173 */                                                   sb3.append("Unable to read Phenotype PackageMetadata for ");
/* 176 */                                                   sb3.append(str);
/* 183 */                                                   Log.e("PackageInfo", sb3.toString(), e7);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (IOException e8) {
/* 194 */                                   Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e8);
                                        }
/* 197 */                               OOoli1l oOoli1lI0000Il00O = i00Ol00.I0000Il00O(true);
/* 201 */                               IOO0o0I1l.I00l0I0l0lO1 = oOoli1lI0000Il00O;
/* 203 */                               oOoli1l = oOoli1lI0000Il00O;
                                    }
                                }
                            }
/* 210 */                   String str2 = (String) this.I00iiO;
/* 216 */                   if (oOoli1l.containsKey(str2)) {
/* 255 */                       return;
                            }
/* 230 */                   StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 173);
/* 235 */                   sb4.append("Config package ");
/* 238 */                   sb4.append(str2);
/* 243 */                   sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
/* 252 */                   Log.e("FilePhenotypeFlags", sb4.toString());
/* 255 */                   return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 91 */                    String simpleName = iooili01.class.getSimpleName();
/* 97 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(24);
/* 102 */                   int i = 23;
/* 104 */                   OlilOlOiI olilOlOiI2 = new OlilOlOiI(i);
/* 107 */                   olilOlOiI.I00iiO = olilOlOiI2;
/* 109 */                   olilOlOiI.I00iio = olilOlOiI2;
/* 111 */                   olilOlOiI.I00iiI = simpleName;
/* 113 */                   VarHandle.storeStoreFence();
/* 118 */                   iooOIOOo1 ioooiooo1 = (iooOIOOo1) this.I00iiO;
/* 122 */                   OlilOlOiI olilOlOiI3 = new OlilOlOiI(i);
/* 125 */                   olilOlOiI2.I00iio = olilOlOiI3;
/* 127 */                   olilOlOiI.I00iio = olilOlOiI3;
/* 129 */                   olilOlOiI3.I00iiO = ioooiooo1;
/* 131 */                   return olilOlOiI.toString();
                        case 1:
                        default:
/* 6 */                     return super.toString();
                        case 2:
/* 13 */                    Runnable runnable = (Runnable) this.I00iiI;
/* 17 */                    if (runnable != null) {
/* 32 */                        return "SequentialExecutorWorker{running=" + runnable + "}";
                            }
/* 41 */                    StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
/* 48 */                    int i2 = ((OilOi11lI0) this.I00iiO).I00iiO;
/* 76 */                    sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
/* 79 */                    sb.append("}");
/* 82 */                    return sb.toString();
                    }
                }
            }
