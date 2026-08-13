            package p000;

            import android.content.ComponentName;
            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            
/* 10 */    public final class illioiliioi implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public illioiliioi(IO0oo1I0oIO iO0oo1I0oIO, ListenableFuture listenableFuture) {
/* 2 */             this.I00iOIl = 1;
/* 7 */             this.I00iiO = iO0oo1I0oIO;
/* 9 */             this.I00iiI = listenableFuture;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v30, types: [o0l1Ii] */
                /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.ListenableFuture] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v21 */
                /* JADX WARN: Type inference failed for: r4v22 */
                @Override
                public final void run() throws NumberFormatException {
                    IoOiO1o1oI ioOiO1o1oI;
/* 6 */             int i = 1;
/* 7 */             ?? r4 = 0;
/* 7 */             r4 = 0;
                    try {
                        switch (this.I00iOIl) {
                            case 0:
/* 746 */                       io0Oi10oi io0oi10oi = (io0Oi10oi) this.I00iiI;
/* 748 */                       if (io0oi10oi != null) {
/* 750 */                           Object obj = io0oi10oi.I00iOIl;
/* 754 */                           if (obj instanceof ili1I1o00I0) {
/* 758 */                               r4 = ((ili1I1o00I0) obj).I00000oIO;
                                    }
                                } else {
/* 761 */                           io0oi10oi.getClass();
                                }
/* 764 */                       if (r4 != 0) {
/* 910 */                           ((o0l1Ii) this.I00iiO).I00000oIO(r4);
/* 913 */                           return;
                                }
                                try {
/* 768 */                           io0Oi10oi io0oi10oi2 = (io0Oi10oi) this.I00iiI;
/* 776 */                           if (!io0oi10oi2.isDone()) {
/* 885 */                               throw new IllegalStateException(lil0ooil1i.I00000oIO("Future was expected to be done: %s", io0oi10oi2));
                                    }
/* 778 */                           boolean z = false;
                                    while (true) {
                                        try {
/* 779 */                                   Object obj2 = io0oi10oi2.get();
/* 783 */                                   if (z) {
/* 789 */                                       Thread.currentThread().interrupt();
                                            }
/* 799 */                                   o0l1Ii o0l1ii = (o0l1Ii) this.I00iiO;
/* 801 */                                   o0l1ii.getClass();
/* 804 */                                   Float f = (Float) obj2;
/* 814 */                                   if (f.floatValue() >= 1.0f) {
/* 816 */                                       o0l1o1ooIoo o0l1o1ooioo = o0l1ii.I0000oI00;
/* 818 */                                       float fFloatValue = f.floatValue();
                                                synchronized (o0l1o1ooioo.I0000Il00O) {
/* 825 */                                           o0l1o1ooioo.I000OiO = fFloatValue;
/* 827 */                                           o0l1o1ooioo.I0000oI00(false);
                                                }
/* 843 */                                       o0l1ii.I0000oI00.I0000O(o0l1ii.I00000oIO, o0l1ii.I00000oOI, f.floatValue(), o0l1ii.I0000Il00O);
                                            }
/* 854 */                                   o0l1ii.I0000oI00.I00000oOI.set(false);
/* 913 */                                   return;
                                        } catch (InterruptedException unused) {
/* 870 */                                   z = true;
                                        } catch (Throwable th) {
/* 859 */                                   if (z) {
/* 866 */                                       Thread.currentThread().interrupt();
                                            }
/* 869 */                                   throw th;
                                        }
                                    }
                                } catch (ExecutionException e) {
/* 902 */                           ((o0l1Ii) this.I00iiO).I00000oIO(e.getCause());
/* 913 */                           return;
                                } catch (Throwable th2) {
/* 890 */                           ((o0l1Ii) this.I00iiO).I00000oIO(th2);
/* 913 */                           return;
                                }
                            case 1:
                                try {
/* 685 */                           IO0oo1I0oIO iO0oo1I0oIO = (IO0oo1I0oIO) this.I00iiO;
/* 691 */                           Object objI0000Il00O = iIllIoiiIO.I0000Il00O((ListenableFuture) this.I00iiI);
/* 695 */                           IIiOOI iIiOOI = iO0oo1I0oIO.I00iiI;
/* 697 */                           if (iIiOOI != null) {
/* 699 */                               iIiOOI.I00000oOI(objI0000Il00O);
                                    }
                                } catch (CancellationException unused2) {
/* 732 */                           ((IO0oo1I0oIO) this.I00iiO).cancel(false);
                                } catch (ExecutionException e2) {
/* 714 */                           IO0oo1I0oIO iO0oo1I0oIO2 = (IO0oo1I0oIO) this.I00iiO;
/* 716 */                           Throwable cause = e2.getCause();
/* 720 */                           IIiOOI iIiOOI2 = iO0oo1I0oIO2.I00iiI;
/* 722 */                           if (iIiOOI2 != null) {
/* 724 */                               iIiOOI2.I0000O(cause);
                                    }
                                }
/* 736 */                       return;
                            case 2:
/* 679 */                       ((IIoOoIol0Io0) this.I00iiO).I001lloI((Il11ooO1o) this.I00iiI, OoiIlOl1iI.I00000oIO);
/* 682 */                       return;
                            case 3:
/* 632 */                       ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 634 */                       boolean zIsCancelled = listenableFuture.isCancelled();
/* 640 */                       IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiO;
/* 642 */                       if (zIsCancelled) {
/* 644 */                           iIoOoIol0Io0.I0000O(null);
/* 668 */                           return;
                                }
                                try {
/* 652 */                           iIoOoIol0Io0.resumeWith(li010iilO.I00000oIO(listenableFuture));
/* 668 */                           return;
                                } catch (ExecutionException e3) {
/* 665 */                           iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(e3.getCause()));
/* 668 */                           return;
                                }
                            case 4:
/* 521 */                       IOlo10lO1iOl iOlo10lO1iOl = (IOlo10lO1iOl) this.I00iiI;
/* 525 */                       OIoIIOIioo oIoIIOIioo = (OIoIIOIioo) this.I00iiO;
/* 529 */                       Io0iOoo io0iOoo = (Io0iOoo) oIoIIOIioo.I00ilO0;
/* 533 */                       Io0OoIoOo io0OoIoOo = (Io0OoIoOo) oIoIIOIioo.I00iiI;
/* 545 */                       i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) io0iOoo.I00l0OO0IO.get((I11Oil) oIoIIOIioo.I00iiO);
/* 547 */                       if (i0ol1ool00 == null) {
/* 629 */                           return;
                                }
/* 552 */                       if (iOlo10lO1iOl.I00iiI != 0) {
/* 626 */                           i0ol1ool00.I000oI1ioi(iOlo10lO1iOl, null);
/* 629 */                           return;
                                }
/* 554 */                       oIoIIOIioo.I00iOIl = true;
/* 560 */                       if (io0OoIoOo.I0010I0i()) {
/* 608 */                           if (!oIoIIOIioo.I00iOIl || (ioOiO1o1oI = (IoOiO1o1oI) oIoIIOIioo.I00iio) == null) {
/* 629 */                               return;
                                    }
/* 622 */                           io0OoIoOo.I000OiO(ioOiO1o1oI, (Set) oIoIIOIioo.I00ilI0I1);
/* 629 */                           return;
                                }
                                try {
/* 576 */                           io0OoIoOo.I000OiO(null, io0OoIoOo.I0010I0i() ? io0OoIoOo.I001l0I00 : Collections.EMPTY_SET);
/* 629 */                           return;
                                } catch (SecurityException e4) {
/* 585 */                           Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
/* 592 */                           io0OoIoOo.I0000O("Failed to get service from broker.");
/* 602 */                           i0ol1ool00.I000oI1ioi(new IOlo10lO1iOl(10, null, null), null);
/* 629 */                           return;
                                }
                            case 5:
/* 515 */                       ((ii0IiiI) this.I00iiI).zza((iOioO0lIOo) this.I00iiO);
/* 518 */                       return;
                            case 6:
/* 503 */                       ((iOlloil01Ilo) this.I00iiI).zza((iOIoil) this.I00iiO);
/* 506 */                       return;
                            case 7:
/* 483 */                       lIOlOoIoo liolooioo = (lIOlOoIoo) this.I00iiI;
/* 491 */                       liolooioo.I00000oIO(liolooioo.I000OiO, (ArrayList) this.I00iiO);
/* 494 */                       return;
                            case 8:
/* 453 */                       lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 455 */                       lilool0.I00OI1();
/* 462 */                       lilool0.I00iOIl().I010II();
/* 465 */                       lilool0.I00iIi0i1o();
/* 470 */                       lli10iI lli10ii = (lli10iI) this.I00iiI;
/* 474 */                       lII0I0I000I.I0000O(lli10ii.I00iOIl);
/* 477 */                       lilool0.I00Ol00(lli10ii);
/* 480 */                       return;
                            case 9:
/* 240 */                       lIl1O1li lil1o1li = (lIl1O1li) this.I00iiO;
/* 242 */                       lil1o1li.I010II();
/* 245 */                       lil1o1li.I010OIo1l();
/* 250 */                       Bundle bundle = (Bundle) this.I00iiI;
/* 256 */                       String string = bundle.getString("name");
/* 260 */                       String string2 = bundle.getString("origin");
/* 264 */                       lII0I0I000I.I0000O(string);
/* 267 */                       lII0I0I000I.I0000O(string2);
/* 276 */                       lII0I0I000I.I000II(bundle.get("value"));
/* 281 */                       l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 287 */                       if (!l0olllo1i.I00000oIO()) {
/* 289 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 291 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 298 */                           l01o0io1ooo0.I00lll10.I00000oOI("Conditional property not set since app measurement is disabled");
/* 448 */                           return;
                                }
/* 316 */                       lio0llOI0 lio0lloi0 = new lio0llOI0(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                                try {
/* 319 */                           lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 321 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 324 */                           bundle.getString("app_id");
/* 345 */                           ii0oooi0IO0l ii0oooi0io0lI01IO1il = lioil0ilioi.I01IO1il(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
/* 349 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 352 */                           bundle.getString("app_id");
/* 373 */                           ii0oooi0IO0l ii0oooi0io0lI01IO1il2 = lioil0ilioi.I01IO1il(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
/* 377 */                           bundle.getString("app_id");
/* 445 */                           l0olllo1i.I000OOo1O().I011Ol0(new iII000ol000(bundle.getString("app_id"), string2, lio0lloi0, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ii0oooi0io0lI01IO1il2, bundle.getLong("trigger_timeout"), ii0oooi0io0lI01IO1il, bundle.getLong("time_to_live"), lioil0ilioi.I01IO1il(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
/* 448 */                           return;
                                } catch (IllegalArgumentException unused3) {
/* 448 */                           return;
                                }
                            case 10:
/* 110 */                       l0olllO1i l0olllo1i2 = (l0olllO1i) ((lIl1O1li) this.I00iiO).I00iOIl;
/* 112 */                       l0Oi0o l0oi0o = l0olllo1i2.I00ilI0I1;
/* 114 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i2.I00ilO0;
/* 116 */                       l0olllO1i.I0000oI00(l0oi0o);
/* 119 */                       l0oi0o.I010II();
/* 122 */                       l0oi0o.I010II();
/* 135 */                       iOoOIi0i ioooii0iI00000oOI = iOoOIi0i.I00000oOI(l0oi0o.I010ioo().getString("dma_consent_settings", null));
/* 141 */                       iOoOIi0i ioooii0i = (iOoOIi0i) this.I00iiI;
/* 143 */                       int i2 = ioooii0i.I00000oIO;
/* 151 */                       if (!l1ioIO011Oo.I000l1(i2, ioooii0iI00000oOI.I00000oIO)) {
/* 221 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 232 */                           l01o0io1ooo02.I00ll1.I0000Il00O("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
/* 235 */                           return;
                                }
/* 157 */                       SharedPreferences.Editor editorEdit = l0oi0o.I010ioo().edit();
/* 163 */                       editorEdit.putString("dma_consent_settings", ioooii0i.I00000oOI);
/* 166 */                       editorEdit.apply();
/* 169 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 176 */                       l01o0io1ooo02.I00lll10.I0000Il00O("Setting DMA consent(FE)", ioooii0i);
/* 187 */                       if (!l0olllo1i2.I000OOo1O().I010oio1OO0()) {
/* 217 */                           l0olllo1i2.I000OOo1O().I011Ill();
/* 235 */                           return;
                                }
/* 189 */                       lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i2.I000OOo1O();
/* 193 */                       loliolo1ioI000OOo1O.I010II();
/* 196 */                       loliolo1ioI000OOo1O.I010OIo1l();
/* 201 */                       lOilIOO loilioo = new lOilIOO(i);
/* 204 */                       loilioo.I00iiI = loliolo1ioI000OOo1O;
/* 206 */                       VarHandle.storeStoreFence();
/* 209 */                       loliolo1ioI000OOo1O.I0110o(loilioo);
/* 235 */                       return;
                            case 11:
/* 75 */                        l0IIioiIOIo l0iiioiioio = (l0IIioiIOIo) this.I00iiO;
                                synchronized (l0iiioiioio.I00iiO) {
                                    try {
/* 82 */                                OIi0Oi1lOoo oIi0Oi1lOoo = (OIi0Oi1lOoo) l0iiioiioio.I00iio;
/* 84 */                                if (oIi0Oi1lOoo != null) {
/* 94 */                                    oIi0Oi1lOoo.I0001Ioi1lo(((OloIIoII1oo) this.I00iiI).I000II());
                                        }
                                    } finally {
                                    }
                                }
/* 101 */                       return;
                            case 12:
/* 69 */                        ((lOl001Iii) this.I00iiO).I00iiO.I01101IOlO((ComponentName) this.I00iiI);
/* 72 */                        return;
                            default:
/* 14 */                        lili0I0IOO0 lili0i0ioo0 = (lili0I0IOO0) this.I00iiI;
/* 18 */                        I01iI0l00O i01iI0l00O = (I01iI0l00O) this.I00iiO;
/* 20 */                        lili0i0ioo0.getClass();
                                try {
/* 23 */                            IlloOoiiO.I00000oIO(i01iI0l00O);
/* 58 */                            return;
                                } catch (Exception e5) {
/* 28 */                            String str = lili0i0ioo0.I0000Il00O;
/* 55 */                            Log.w("FlagStore", IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 73), "Failed to store account on flag read for: ", str, " which may lead to stale flags."), e5);
/* 58 */                            return;
                                }
                        }
                    } finally {
/* 741 */               ((IO0oo1I0oIO) this.I00iiO).I00io1l = null;
                    }
/* 741 */           ((IO0oo1I0oIO) this.I00iiO).I00io1l = null;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    String simpleName = illioiliioi.class.getSimpleName();
/* 20 */                    i000IO i000io = new i000IO(6);
/* 25 */                    int i = 8;
/* 27 */                    OoIOol ooIOol = new OoIOol(i);
/* 30 */                    i000io.I00iiO = ooIOol;
/* 32 */                    i000io.I00iiI = simpleName;
/* 34 */                    VarHandle.storeStoreFence();
/* 39 */                    o0l1Ii o0l1ii = (o0l1Ii) this.I00iiO;
/* 43 */                    OoIOol ooIOol2 = new OoIOol(i);
/* 46 */                    ooIOol.I00iiO = ooIOol2;
/* 48 */                    ooIOol2.I00iiI = o0l1ii;
/* 50 */                    return i000io.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 11 */        public illioiliioi(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
