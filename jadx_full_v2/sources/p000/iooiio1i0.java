            package p000;

            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class iooiio1i0 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public iooiio1i0(int i) {
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
                
                    p000.OilOi0I1.I00ilO0.I00000oIO().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.I00iiI), (java.lang.Throwable) r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
                
                    r10.I00iiI = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
                
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
                            synchronized (((OilOi0I1) this.I00iiO).I00iiI) {
/* 11 */                        if (z) {
/* 55 */                            runnable = (Runnable) ((OilOi0I1) this.I00iiO).I00iiI.poll();
/* 57 */                            this.I00iiI = runnable;
/* 59 */                            if (runnable != null) {
                                    }
                                } else {
/* 15 */                            OilOi0I1 oilOi0I1 = (OilOi0I1) this.I00iiO;
/* 20 */                            if (oilOi0I1.I00iiO != 4) {
                                        oilOi0I1.I00iio++;
/* 42 */                                oilOi0I1.I00iiO = 4;
/* 44 */                                z = true;
/* 55 */                                runnable = (Runnable) ((OilOi0I1) this.I00iiO).I00iiI.poll();
/* 57 */                                this.I00iiI = runnable;
/* 59 */                                if (runnable != null) {
/* 65 */                                    ((OilOi0I1) this.I00iiO).I00iiO = 1;
                                        }
                                    }
                                }
                            }
/* 23 */                    if (!zInterrupted) {
/* 71 */                        return;
                            }
                        } finally {
/* 132 */                   if (zInterrupted) {
/* 138 */                       Thread.currentThread().interrupt();
                            }
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:144:0x03f5 A[Catch: all -> 0x03f3, TryCatch #7 {all -> 0x03f3, blocks: (B:130:0x03d5, B:132:0x03d9, B:134:0x03dd, B:139:0x03ea, B:144:0x03f5, B:145:0x0400), top: B:206:0x03d5 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: CancellationException | ExecutionException -> 0x002e, CancellationException | ExecutionException -> 0x002e, TryCatch #2 {CancellationException | ExecutionException -> 0x002e, blocks: (B:5:0x0013, B:7:0x0029, B:18:0x003a, B:18:0x003a, B:20:0x0048, B:20:0x0048, B:22:0x0054, B:22:0x0054, B:28:0x0066, B:28:0x0066, B:30:0x006a, B:30:0x006a, B:12:0x0031, B:33:0x00a6, B:33:0x00a6), top: B:197:0x0013 }] */
                /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r0v89, types: [I00l0OO0IO, com.google.common.util.concurrent.ListenableFuture] */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r10v8 */
                /* JADX WARN: Type inference failed for: r11v11 */
                /* JADX WARN: Type inference failed for: r11v12 */
                /* JADX WARN: Type inference failed for: r11v15 */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v2 */
                /* JADX WARN: Type inference failed for: r6v4 */
                /* JADX WARN: Type inference failed for: r9v0 */
                /* JADX WARN: Type inference failed for: r9v1 */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v37 */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v5 */
                /* JADX WARN: Type inference failed for: r9v6 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws Throwable {
                    Throwable thI00000oOI;
                    ?? r9;
                    ?? r10;
                    IOI0oloi01 iOI0oloi01;
/* 6 */             z = false;
/* 6 */             boolean z = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 1141 */                  iooO1iil iooo1iil = (iooO1iil) this.I00iiO;
/* 1145 */                  ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 1149 */                  if ((listenableFuture instanceof ioOi0ll1) && (thI00000oOI = ((ioOi0ll1) listenableFuture).I00000oOI()) != null) {
/* 1161 */                      iooo1iil.zza(thI00000oOI);
/* 1186 */                      return;
                            }
                            try {
/* 1169 */                      iooo1iil.zzb(lioli1IO.I0000oI00(listenableFuture));
/* 1186 */                      return;
                            } catch (ExecutionException e) {
/* 1183 */                      iooo1iil.zza(e.getCause());
/* 1186 */                      return;
                            } catch (Throwable th) {
/* 1174 */                      iooo1iil.zza(th);
/* 1186 */                      return;
                            }
                        case 1:
/* 1113 */                  ?? r0 = (ArrayList) this.I00iiI;
/* 1117 */                  OlIIlIO1O olIIlIO1O = (OlIIlIO1O) this.I00iiO;
/* 1123 */                  if (r0.contains(olIIlIO1O)) {
/* 1125 */                      r0.remove(olIIlIO1O);
/* 1134 */                      Oi010OO0.I00000oIO(olIIlIO1O.I0000Il00O.I0100i, olIIlIO1O.I00000oIO);
/* 1137 */                      return;
                            }
/* 1137 */                  return;
                        case 2:
                            try {
/* 1088 */                      I00000oIO();
/* 1091 */                      return;
                            } catch (Error e2) {
                                synchronized (((OilOi0I1) this.I00iiO).I00iiI) {
/* 1104 */                          ((OilOi0I1) this.I00iiO).I00iiO = 1;
/* 1107 */                          throw e2;
                                }
                            }
                        case 3:
/* 1051 */                  ListenableFuture listenableFuture2 = (ListenableFuture) this.I00iiI;
/* 1053 */                  boolean zIsCancelled = listenableFuture2.isCancelled();
/* 1059 */                  IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiO;
/* 1061 */                  if (zIsCancelled) {
/* 1063 */                      iIoOoIol0Io0.I0000O(null);
/* 1087 */                      return;
                            }
                            try {
/* 1071 */                      iIoOoIol0Io0.resumeWith(I01Ol1o0.I0001Ioi1lo(listenableFuture2));
/* 1087 */                      return;
                            } catch (ExecutionException e3) {
/* 1084 */                      iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(e3.getCause()));
/* 1087 */                      return;
                            }
                        case 4:
/* 845 */                   IOoi01o iOoi01o = (IOoi01o) this.I00iiI;
/* 849 */                   OIloI11OoI01 oIloI11OoI01 = (OIloI11OoI01) this.I00iiO;
/* 853 */                   O10oo000lo o10oo000lo = (O10oo000lo) iOoi01o.I00000oOI;
/* 855 */                   if (o10oo000lo == null) {
/* 1048 */                      return;
                            }
/* 861 */                   ll1IoiliI ll1ioilii = (ll1IoiliI) o10oo000lo.I00000oIO;
                            try {
/* 863 */                       byte[] bArr = oIloI11OoI01.I00000oIO;
/* 865 */                       i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 867 */                       int i = i1ioiooIiOol.I00000oIO;
/* 871 */                       lio1IiIo lio1iiioI001IIilI0O = lio1IiIo.I001IIilI0O(bArr, i1o0l0i.I00000oOI);
/* 879 */                       Iterator it = ll1ioilii.I00000oOI.I0001Ioi1lo.iterator();
/* 883 */                       ?? r6 = false;
/* 888 */                       while (it.hasNext()) {
/* 894 */                           liOlOi lioloi = (liOlOi) it.next();
/* 896 */                           List listI00111O = lio1iiioI001IIilI0O.I00111O();
/* 900 */                           lioloi.getClass();
/* 903 */                           Oi1ol0llI oi1ol0llI = lili0I0IOO0.I000OOo1O;
/* 905 */                           oi1ol0llI.getClass();
/* 908 */                           if (listI00111O == null || listI00111O.isEmpty()) {
/* 1032 */                              r9 = false;
                                    } else {
/* 918 */                               Iterator it2 = listI00111O.iterator();
/* 922 */                               r9 = false;
/* 927 */                               while (it2.hasNext()) {
/* 943 */                                   liIol1oO liiol1oo = (liIol1oO) ((ConcurrentHashMap) oi1ol0llI.I00iiI).get((String) it2.next());
/* 945 */                                   if (liiol1oo != null) {
/* 947 */                                       lili0I0IOO0 lili0i0ioo0 = liiol1oo.I00000oIO;
/* 951 */                                       if (lili0i0ioo0.I0000oI00) {
/* 955 */                                           IOI0oloi01 iOI0oloi012 = lili0i0ioo0.I00000oIO;
/* 957 */                                           if (iOI0oloi012 != null && (iOI0oloi012.I00000oIO || ((IIOOoI) iOI0oloi012.I0000oI00).I00000oOI == 3 || lili0i0ioo0.I000O01llI0.I0001Ioi1lo())) {
                                                        synchronized (lili0i0ioo0) {
                                                            try {
/* 982 */                                                       IOI0oloi01 iOI0oloi013 = lili0i0ioo0.I00000oIO;
/* 984 */                                                       if (iOI0oloi013 != null) {
/* 988 */                                                           if (iOI0oloi013.I00000oIO) {
/* 1014 */                                                              lili0i0ioo0.I00000oIO = null;
/* 1022 */                                                              ((AtomicInteger) lili0i0ioo0.I000II.I00iiI).incrementAndGet();
                                                                    } else {
/* 1001 */                                                              if ((((IIOOoI) iOI0oloi013.I0000oI00).I00000oOI == 3) != false || lili0i0ioo0.I000O01llI0.I0001Ioi1lo()) {
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
/* 1026 */                                          r10 = false;
                                                } else {
/* 953 */                                           r10 = true;
                                                }
/* 1030 */                                      r9 = (r9 == true ? 1 : 0) | r10;
                                            }
                                        }
                                    }
/* 1033 */                          if (r9 != false && r6 == false) {
/* 1039 */                              ll1ioilii.I00000oIO.zza();
/* 1042 */                              r6 = true;
                                    }
                                }
/* 1048 */                      return;
                            } catch (iI00lI unused) {
/* 1045 */                      ll1ioilii.getClass();
/* 1048 */                      return;
                            }
                        case 5:
/* 839 */                   ((ii01iI1oI1l) this.I00iiI).zza((iOli1OIoI0o) this.I00iiO);
/* 842 */                   return;
                        case 6:
/* 827 */                   ((IIiOOI) this.I00iiI).I0000O(((iliIOlooOio) this.I00iiO).zza());
/* 830 */                   return;
                        case 7:
/* 707 */                   Ii0io10 ii0io10 = (Ii0io10) this.I00iiO;
/* 715 */                   l0olllO1i l0olllo1i = (l0olllO1i) ((i0O1lIi1O0IO) ii0io10.I00iiO).I00iiI;
/* 717 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 719 */                   l0olllO1i.I000II(l0o10ooo0);
/* 722 */                   l0o10ooo0.I010II();
/* 727 */                   Bundle bundle = new Bundle();
/* 736 */                   bundle.putString("package_name", (String) ii0io10.I00iiI);
                            try {
/* 743 */                       iiO0I00 iio0i00 = (iiO0I00) ((iiOIlIl) this.I00iiI);
/* 745 */                       Parcel parcelI00Iooi00oi = iio0i00.I00Iooi00oi();
/* 749 */                       iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, bundle);
/* 752 */                       Parcel parcelI00IoiI = iio0i00.I00IoiI(1, parcelI00Iooi00oi);
/* 762 */                       Bundle bundle2 = (Bundle) iiIIoi1oIO1.I00000oIO(parcelI00IoiI, Bundle.CREATOR);
/* 764 */                       parcelI00IoiI.recycle();
/* 767 */                       if (bundle2 == null) {
/* 769 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 771 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 778 */                           l01o0io1ooo0.I00ilO0.I00000oOI("Install Referrer Service returned a null response");
                                }
                            } catch (Exception e4) {
/* 783 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 785 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 796 */                       l01o0io1ooo02.I00ilO0.I0000Il00O("Exception occurred while retrieving the Install Referrer", e4.getMessage());
                            }
/* 799 */                   l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 801 */                   l0olllO1i.I000II(l0o10ooo02);
/* 804 */                   l0o10ooo02.I010II();
/* 814 */                   throw new IllegalStateException("Unexpected call on client side");
                        case 8:
/* 478 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00iiO).I000II;
/* 480 */                   lilool0.I00OI1();
/* 486 */                   lli10iI lli10ii = (lli10iI) this.I00iiI;
/* 492 */                   if (lilool0.I00oli != null) {
/* 496 */                       ArrayList arrayList = new ArrayList();
/* 499 */                       lilool0.I00oliIiO01i = arrayList;
/* 503 */                       arrayList.addAll(lilool0.I00oli);
                            }
/* 506 */                   iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 508 */                   lilOOl0.I00O0o1oo(iol1loo1io);
/* 513 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io.I00iOIl;
/* 515 */                   String str = lli10ii.I00iOIl;
/* 517 */                   lII0I0I000I.I000II(str);
/* 520 */                   lII0I0I000I.I0000O(str);
/* 523 */                   iol1loo1io.I010II();
/* 526 */                   iol1loo1io.I010OIo1l();
                            try {
/* 529 */                       SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = iol1loo1io.I01Io11IiiiO();
/* 533 */                       String[] strArr = {str};
/* 626 */                       int iDelete = sQLiteDatabaseI01Io11IiiiO.delete("apps", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("events", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("queue", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("upload_queue", "app_id=?", strArr);
/* 643 */                       if (l0olllo1i2.I00iio.I01101IOlO(null, iol1II1ii1i.I010oio1OO0)) {
/* 651 */                           iDelete += sQLiteDatabaseI01Io11IiiiO.delete("no_data_mode_events", "app_id=?", strArr);
                                }
/* 661 */                       int iDelete2 = iDelete + sQLiteDatabaseI01Io11IiiiO.delete("diagnostic_signals", "app_id=?", strArr);
/* 662 */                       if (iDelete2 > 0) {
/* 664 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 666 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 677 */                           l01o0io1ooo03.I00lll10.I0000O(str, "Reset analytics data. app, records", Integer.valueOf(iDelete2));
                                }
                            } catch (SQLiteException e5) {
/* 681 */                       l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 683 */                       l0olllO1i.I000II(l01o0io1ooo04);
/* 694 */                       l01o0io1ooo04.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error resetting analytics data. appId, error", e5);
                            }
/* 699 */                   if (lli10ii.I00ioIO) {
/* 701 */                       lilool0.I00OIo(lli10ii);
/* 704 */                       return;
                            }
/* 704 */                   return;
                        case 9:
/* 335 */                   lIl1O1li lil1o1li = (lIl1O1li) this.I00iiO;
/* 337 */                   lil1o1li.I010II();
/* 340 */                   lil1o1li.I010OIo1l();
/* 345 */                   Bundle bundle3 = (Bundle) this.I00iiI;
/* 349 */                   String string = bundle3.getString("name");
/* 353 */                   lII0I0I000I.I0000O(string);
/* 358 */                   l0olllO1i l0olllo1i3 = (l0olllO1i) lil1o1li.I00iOIl;
/* 364 */                   if (!l0olllo1i3.I00000oIO()) {
/* 366 */                       l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i3.I00ilO0;
/* 368 */                       l0olllO1i.I000II(l01o0io1ooo05);
/* 375 */                       l01o0io1ooo05.I00lll10.I00000oOI("Conditional property not cleared since app measurement is disabled");
/* 473 */                       return;
                            } else {
/* 386 */                       lio0llOI0 lio0lloi0 = new lio0llOI0(0L, null, string, "");
                                try {
/* 389 */                           lioil0ilIOi lioil0ilioi = l0olllo1i3.I00l0I0l0lO1;
/* 391 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 394 */                           bundle3.getString("app_id");
/* 470 */                           l0olllo1i3.I000OOo1O().I011Ol0(new iII000ol000(bundle3.getString("app_id"), "", lio0lloi0, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), lioil0ilioi.I01IO1il(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), 0L, true)));
/* 473 */                           return;
                                } catch (IllegalArgumentException unused2) {
/* 473 */                           return;
                                }
                            }
                        case 10:
/* 299 */                   lIl1O1li lil1o1li2 = ((AppMeasurementDynamiteService) this.I00iiO).I000II.I00lli11;
/* 301 */                   l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 306 */                   OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) this.I00iiI;
/* 308 */                   lil1o1li2.I010II();
/* 311 */                   lil1o1li2.I010OIo1l();
/* 314 */                   OoOlO1O0o ooOlO1O0o2 = lil1o1li2.I00iio;
/* 316 */                   if (ooOlO1O0o != ooOlO1O0o2) {
/* 323 */                       lII0I0I000I.I000OOo1O("EventInterceptor already set.", ooOlO1O0o2 == null);
                            }
/* 326 */                   lil1o1li2.I00iio = ooOlO1O0o;
/* 328 */                   return;
                        case 11:
/* 244 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiO;
/* 249 */                   l0olllO1i l0olllo1i4 = (l0olllO1i) loliolo1io.I00iOIl;
/* 251 */                   iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 253 */                   if (iolll0ill1iVar == null) {
/* 255 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i4.I00ilO0;
/* 257 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 264 */                       l01o0io1ooo06.I00ilO0.I00000oOI("Failed to reset data on the service: not connected to service");
/* 292 */                       return;
                            } else {
                                try {
/* 272 */                           iolll0ill1iVar.I00IOO((lli10iI) this.I00iiI);
                                } catch (RemoteException e6) {
/* 277 */                           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i4.I00ilO0;
/* 279 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 286 */                           l01o0io1ooo07.I00ilO0.I0000Il00O("Failed to reset data on the service: remote exception", e6);
                                }
/* 289 */                       loliolo1io.I0110OiO();
/* 292 */                       return;
                            }
                        case 12:
/* 209 */                   AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.I00iiO;
/* 213 */                   lioil0ilIOi lioil0ilioi2 = appMeasurementDynamiteService.I000II.I00l0I0l0lO1;
/* 215 */                   l0olllO1i.I0000oI00(lioil0ilioi2);
/* 218 */                   l0olllO1i l0olllo1i5 = appMeasurementDynamiteService.I000II;
/* 222 */                   if (l0olllo1i5.I00oli != null && l0olllo1i5.I00oli.booleanValue()) {
/* 232 */                       z = true;
                            }
/* 237 */                   lioil0ilioi2.I01Io11IiiiO((il0IOO) this.I00iiI, z);
/* 240 */                   return;
                        default:
/* 14 */                    lili0I0IOO0 lili0i0ioo02 = (lili0I0IOO0) this.I00iiI;
                            try {
/* 24 */                        llOOiIiIOo llooiiiioo = (llOOiIiIOo) IlloOoiiO.I00000oIO((I01iI0l00O) this.I00iiO);
/* 35 */                        IOI0oloi01 iOI0oloi014 = new IOI0oloi01(llooiiiioo, new IIOOoI(6, 2));
/* 38 */                        boolean z2 = lili0i0ioo02.I0000oI00;
/* 40 */                        if (z2 || (iOI0oloi01 = lili0i0ioo02.I00000oIO) == null) {
                                    synchronized (lili0i0ioo02) {
/* 51 */                                if (!z2) {
/* 53 */                                    iOI0oloi01 = lili0i0ioo02.I00000oIO;
/* 55 */                                    if (iOI0oloi01 != null) {
/* 71 */                                        if (!((OOoli1l) iOI0oloi01.I0000O).equals((OOoli1l) iOI0oloi014.I0000O)) {
/* 81 */                                            llIOoOoIi lliooooii = (llIOoOoIi) lili0i0ioo02.I00000oOI.I0000oI00.get();
/* 83 */                                            if (lliooooii != null) {
/* 85 */                                                lliooooii.zza();
/* 206 */                                               return;
                                                    }
/* 206 */                                           return;
                                                }
                                            }
                                        }
/* 91 */                                lili0i0ioo02.I00000oIO = iOI0oloi014;
/* 99 */                                ((AtomicInteger) lili0i0ioo02.I000II.I00iiI).incrementAndGet();
                                    }
                                } else if (!((OOoli1l) iOI0oloi01.I0000O).equals((OOoli1l) iOI0oloi014.I0000O)) {
                                }
/* 105 */                       if (lili0i0ioo02.I0000oI00) {
/* 107 */                           lIlIo1 lilio1 = lili0i0ioo02.I00000oOI;
/* 115 */                           lOIiI0 loiii0 = (lOIiI0) lilio1.I0000O.get();
/* 117 */                           String strI00111O = llooiiiioo.I00111O();
/* 121 */                           loiii0.getClass();
/* 124 */                           strI00111O.getClass();
/* 133 */                           ?? I00000oOI = lOIiI0.I00000oOI(loiii0.I00000oIO.I0000Il00O(strI00111O));
/* 141 */                           lii0l0 lii0l0Var = new lii0l0(z ? 1 : 0);
/* 144 */                           lii0l0Var.I00iiI = lili0i0ioo02;
/* 146 */                           VarHandle.storeStoreFence();
/* 149 */                           OI011o1 oI011o1I00000oIO = lilio1.I00000oIO();
/* 155 */                           I00li1OI i00li1OI = new I00li1OI(I00000oOI, Throwable.class, lii0l0Var);
/* 162 */                           I00000oOI.addListener(i00li1OI, l1i0oIO0.I00000oOI(oI011o1I00000oIO, i00li1OI));
/* 206 */                           return;
                                }
/* 206 */                       return;
                            } catch (CancellationException | ExecutionException e7) {
/* 174 */                       if (e7.getCause() instanceof SecurityException) {
/* 206 */                           return;
                                }
/* 176 */                       String str2 = lili0i0ioo02.I0000Il00O;
/* 203 */                       Log.w("FlagStore", IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e7);
/* 206 */                       return;
                            }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 91 */                    String simpleName = iooiio1i0.class.getSimpleName();
/* 97 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(23);
/* 102 */                   int i = 22;
/* 104 */                   Oo1ol1ll oo1ol1ll2 = new Oo1ol1ll(i);
/* 107 */                   oo1ol1ll.I00iiO = oo1ol1ll2;
/* 109 */                   oo1ol1ll.I00iio = oo1ol1ll2;
/* 111 */                   oo1ol1ll.I00iiI = simpleName;
/* 113 */                   VarHandle.storeStoreFence();
/* 118 */                   iooO1iil iooo1iil = (iooO1iil) this.I00iiO;
/* 122 */                   Oo1ol1ll oo1ol1ll3 = new Oo1ol1ll(i);
/* 125 */                   oo1ol1ll2.I00iio = oo1ol1ll3;
/* 127 */                   oo1ol1ll.I00iio = oo1ol1ll3;
/* 129 */                   oo1ol1ll3.I00iiO = iooo1iil;
/* 131 */                   return oo1ol1ll.toString();
                        case 1:
                        default:
/* 6 */                     return super.toString();
                        case 2:
/* 13 */                    Runnable runnable = (Runnable) this.I00iiI;
/* 17 */                    if (runnable != null) {
/* 32 */                        return "SequentialExecutorWorker{running=" + runnable + "}";
                            }
/* 41 */                    StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
/* 48 */                    int i2 = ((OilOi0I1) this.I00iiO).I00iiO;
/* 76 */                    sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
/* 79 */                    sb.append("}");
/* 82 */                    return sb.toString();
                    }
                }
            }
