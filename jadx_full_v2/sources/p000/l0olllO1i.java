            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.PriorityBlockingQueue;
            import java.util.concurrent.Semaphore;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class l0olllO1i implements l1i11I1I0 {
                public static volatile l0olllO1i I0100o111I;
                public final Context I00iOIl;
                public final boolean I00iiI;
                public final lolOiIoiillI I00iiO;
                public final iIl1iil I00iio;
                public final l0Oi0o I00ilI0I1;
                public final l01O0IO1ooO0 I00ilO0;
                public final l0o10OoO0 I00io1l;
                public final li10O1l0 I00ioIO;
                public final lioil0ilIOi I00l0I0l0lO1;
                public final l00i1l00OlIO I00l0OO0IO;
                public final Iioi0lilII I00li1OI;
                public final lO0liIO0 I00ll1;
                public final lIl1O1li I00lli11;
                public final il11ll0i I00lll10;
                public final lIloiI I00o0iI0io1;
                public final String I00o0l1o1o0;
                public l00Ii0II I00o101lO;
                public lOliOlO1Io I00oI0i;
                public iOolIl0IIo I00oII;
                public iooloO1iOil I00oIiI10;
                public lIo1Iil I00oO101o;
                public Boolean I00ol1;
                public long I00olI;
                public volatile Boolean I00oli;
                public volatile boolean I00oliIiO01i;
                public int I00oo1iO0ll;
                public int I00ooIo0;
                public final long I00oooO;
                public final long I0100i;
                public boolean I00oOio10iI1 = false;
                public final AtomicInteger I00ooiO1I = new AtomicInteger(0);

                /* JADX WARN: Multi-variable type inference failed */
                public l0olllO1i(l1llIli l1llili) {
                    Context applicationContext;
                    long jCurrentTimeMillis;
                    long jElapsedRealtime;
/* 4 */             Object[] objArr = 0;
/* 4 */             Object[] objArr2 = 0;
/* 14 */            Context context = l1llili.I00000oIO;
/* 20 */            lolOiIoiillI loloiioiilli = new lolOiIoiillI(18);
/* 23 */            this.I00iiO = loloiioiilli;
/* 25 */            lioiiOOOIlIo.I00000oIO = loloiioiilli;
/* 27 */            this.I00iOIl = context;
/* 31 */            this.I00iiI = l1llili.I0000oI00;
/* 35 */            this.I00oli = l1llili.I00000oOI;
/* 39 */            this.I00o0l1o1o0 = l1llili.I000O01llI0;
/* 42 */            this.I00oliIiO01i = true;
/* 47 */            if (lO00Oo.I00000oOI == null) {
/* 49 */                Object obj = lO00Oo.I00000oIO;
                        synchronized (obj) {
                            try {
/* 54 */                        if (lO00Oo.I00000oOI == null) {
                                    synchronized (obj) {
/* 57 */                                lIiI0loII liii0loii = lO00Oo.I00000oOI;
/* 59 */                                Context applicationContext2 = context.getApplicationContext();
/* 63 */                                if (applicationContext2 == null) {
/* 66 */                                    applicationContext2 = context;
                                        }
/* 67 */                                if (liii0loii == null || liii0loii.I00000oIO != applicationContext2) {
/* 76 */                                    if (liii0loii != null) {
/* 84 */                                        Iterator it = lIiOIi.I00000oIO.values().iterator();
/* 92 */                                        if (it.hasNext()) {
/* 102 */                                           if (it.next() != null) {
/* 110 */                                               throw new ClassCastException();
                                                    }
/* 104 */                                           throw null;
                                                }
/* 94 */                                        lO0l1I.I00000oIO();
                                            }
/* 113 */                                   IioloOoI iioloOoI = new IioloOoI();
/* 116 */                                   iioloOoI.I00iOIl = applicationContext2;
/* 118 */                                   VarHandle.storeStoreFence();
/* 121 */                                   OliiillO oliiillOI00000oIO = lOiIlo.I00000oIO(iioloOoI);
/* 127 */                                   lIiI0loII liii0loii2 = new lIiI0loII();
/* 130 */                                   liii0loii2.I00000oIO = applicationContext2;
/* 132 */                                   liii0loii2.I00000oOI = oliiillOI00000oIO;
/* 134 */                                   VarHandle.storeStoreFence();
/* 137 */                                   lO00Oo.I00000oOI = liii0loii2;
/* 141 */                                   lO00Oo.I0000Il00O.incrementAndGet();
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 147 */                       throw th;
                            } finally {
                            }
                        }
                    }
/* 156 */           this.I00li1OI = Iioi0lilII.I00iiO;
/* 166 */           lI1i1OI1O0l li1i1oi1o0l = new lI1i1OI1O0l(context, l1oIOl1IIl1o.I00000oIO, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
/* 181 */           String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
/* 185 */           IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 191 */           IIOilloI0l0o iIOilloI0l0o = new IIOilloI0l0o(1);
/* 194 */           iIOilloI0l0o.I00iiI = strConcat;
/* 196 */           iIOilloI0l0o.I00iiO = new String[0];
/* 198 */           VarHandle.storeStoreFence();
/* 201 */           iolIIo0o0IioI0000Il00O.I0000Il00O = iIOilloI0l0o;
/* 207 */           li1i1oi1o0l.I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO());
/* 210 */           AtomicReference atomicReference = lIlIo1.I000iOII;
/* 216 */           if (atomicReference.get() == null) {
                        try {
/* 219 */                   applicationContext = context.getApplicationContext();
                        } catch (NullPointerException unused) {
/* 224 */                   lIlIo1.I00000oOI();
/* 241 */                   ll0ii0IllI.I00000oIO(Level.WARNING, (Executor) lIlIo1.I000lI.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
/* 244 */                   applicationContext = null;
                        }
/* 245 */               if (applicationContext != null) {
/* 247 */                   atomicReference.compareAndSet(null, applicationContext);
                        }
                    }
/* 250 */           Long l = l1llili.I0001Ioi1lo;
/* 252 */           if (l != null) {
/* 254 */               jCurrentTimeMillis = l.longValue();
                    } else {
/* 261 */               this.I00li1OI.getClass();
/* 264 */               jCurrentTimeMillis = System.currentTimeMillis();
                    }
/* 268 */           this.I00oooO = jCurrentTimeMillis;
/* 270 */           Long l2 = l1llili.I000II;
/* 272 */           if (l2 != null) {
/* 274 */               jElapsedRealtime = l2.longValue();
                    } else {
/* 281 */               this.I00li1OI.getClass();
/* 284 */               jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
/* 288 */           this.I0100i = jElapsedRealtime;
/* 292 */           iIl1iil iil1iil = new iIl1iil();
/* 295 */           iil1iil.I00iOIl = this;
/* 299 */           iil1iil.I00iio = IIIOlol.I00ll1;
/* 301 */           this.I00iio = iil1iil;
/* 305 */           l0Oi0o l0oi0o = new l0Oi0o(this);
/* 318 */           l0oi0o.I00li1OI = new l0O0o010I(l0oi0o, "session_timeout", 1800000L);
/* 327 */           l0oi0o.I00ll1 = new l0IllIiO(l0oi0o, "start_new_session", true);
/* 338 */           l0oi0o.I00o0l1o1o0 = new l0O0o010I(l0oi0o, "last_pause_time", 0L);
/* 347 */           l0oi0o.I00o101lO = new l0O0o010I(l0oi0o, "session_id", 0L);
/* 356 */           l0oi0o.I00lli11 = new I1ii1l10IO(l0oi0o, "non_personalized_ads");
/* 365 */           l0oi0o.I00lll10 = new o01l1ioOo0(l0oi0o, "last_received_uri_timestamps_by_source");
/* 374 */           l0oi0o.I00o0iI0io1 = new l0IllIiO(l0oi0o, "allow_remote_dynamite", false);
/* 383 */           l0oi0o.I00ilO0 = new l0O0o010I(l0oi0o, "first_open_time", 0L);
/* 387 */           lII0I0I000I.I0000O("app_install_time");
/* 397 */           l0oi0o.I00io1l = new I1ii1l10IO(l0oi0o, "app_instance_id");
/* 406 */           l0oi0o.I00oII = new l0IllIiO(l0oi0o, "app_backgrounded", false);
/* 415 */           l0oi0o.I00oIiI10 = new l0IllIiO(l0oi0o, "deep_link_retrieval_complete", false);
/* 424 */           l0oi0o.I00oO101o = new l0O0o010I(l0oi0o, "deep_link_retrieval_attempts", 0L);
/* 433 */           l0oi0o.I00oOio10iI1 = new I1ii1l10IO(l0oi0o, "firebase_feature_rollouts");
/* 442 */           l0oi0o.I00ol1 = new I1ii1l10IO(l0oi0o, "deferred_attribution_cache");
/* 451 */           l0oi0o.I00olI = new l0O0o010I(l0oi0o, "deferred_attribution_cache_timestamp", 0L);
/* 460 */           l0oi0o.I00oli = new o01l1ioOo0(l0oi0o, "default_event_parameters");
/* 462 */           VarHandle.storeStoreFence();
/* 465 */           l0oi0o.I010iIIOlo();
/* 468 */           this.I00ilI0I1 = l0oi0o;
/* 472 */           l01O0IO1ooO0 l01o0io1ooo0 = new l01O0IO1ooO0(this);
/* 475 */           l01o0io1ooo0.I00iiO = (char) 0;
/* 479 */           l01o0io1ooo0.I00iio = -1L;
/* 487 */           l01o0io1ooo0.I00ilO0 = new IOloiOI1(l01o0io1ooo0, 6, false, false);
/* 494 */           l01o0io1ooo0.I00io1l = new IOloiOI1(l01o0io1ooo0, 6, true, false);
/* 501 */           l01o0io1ooo0.I00ioIO = new IOloiOI1(l01o0io1ooo0, 6, false, true);
/* 506 */           IOloiOI1 iOloiOI1 = new IOloiOI1(l01o0io1ooo0, 5, false, false);
/* 509 */           l01o0io1ooo0.I00l0I0l0lO1 = iOloiOI1;
/* 516 */           l01o0io1ooo0.I00l0OO0IO = new IOloiOI1(l01o0io1ooo0, 5, true, false);
/* 523 */           l01o0io1ooo0.I00li1OI = new IOloiOI1(l01o0io1ooo0, 5, false, true);
/* 531 */           l01o0io1ooo0.I00ll1 = new IOloiOI1(l01o0io1ooo0, 4, false, false);
/* 539 */           l01o0io1ooo0.I00lli11 = new IOloiOI1(l01o0io1ooo0, 3, false, false);
/* 543 */           int i = 2;
/* 547 */           l01o0io1ooo0.I00lll10 = new IOloiOI1(l01o0io1ooo0, 2, false, false);
/* 549 */           VarHandle.storeStoreFence();
/* 552 */           l01o0io1ooo0.I010iIIOlo();
/* 555 */           this.I00ilO0 = l01o0io1ooo0;
/* 559 */           lioil0ilIOi lioil0ilioi = new lioil0ilIOi(this);
/* 562 */           lioil0ilioi.I00ioIO = null;
/* 569 */           lioil0ilioi.I00iio = new AtomicLong(0L);
/* 571 */           VarHandle.storeStoreFence();
/* 574 */           lioil0ilioi.I010iIIOlo();
/* 577 */           this.I00l0I0l0lO1 = lioil0ilioi;
/* 583 */           Oi1ol0llI oi1ol0llI = new Oi1ol0llI(26, (boolean) (objArr2 == true ? 1 : 0));
/* 586 */           oi1ol0llI.I00iiI = this;
/* 588 */           VarHandle.storeStoreFence();
/* 593 */           l00i1l00OlIO l00i1l00olio = new l00i1l00OlIO();
/* 596 */           l00i1l00olio.I00000oIO = oi1ol0llI;
/* 598 */           VarHandle.storeStoreFence();
/* 601 */           this.I00l0OO0IO = l00i1l00olio;
/* 605 */           il11ll0i il11ll0iVar = new il11ll0i();
/* 608 */           il11ll0iVar.I00iOIl = this;
/* 615 */           il11ll0iVar.I00iiO = new I1Io0i0II(0);
/* 622 */           il11ll0iVar.I00iiI = new I1Io0i0II(0);
/* 624 */           VarHandle.storeStoreFence();
/* 627 */           this.I00lll10 = il11ll0iVar;
/* 631 */           lO0liIO0 lo0liio0 = new lO0liIO0(this);
/* 639 */           lo0liio0.I00ll1 = new Object();
/* 646 */           lo0liio0.I00ilO0 = new ConcurrentHashMap();
/* 648 */           VarHandle.storeStoreFence();
/* 651 */           lo0liio0.I010i10l();
/* 654 */           this.I00ll1 = lo0liio0;
/* 658 */           lIl1O1li lil1o1li = new lIl1O1li(this);
/* 666 */           lil1o1li.I00ilI0I1 = new CopyOnWriteArraySet();
/* 673 */           lil1o1li.I00ioIO = new Object();
/* 675 */           lil1o1li.I00l0I0l0lO1 = false;
/* 677 */           lil1o1li.I00l0OO0IO = 1;
/* 679 */           lil1o1li.I00oI0i = true;
/* 683 */           int i2 = 7;
/* 684 */           i1Il01 i1il01 = new i1Il01(i2);
/* 687 */           i1il01.I00iiI = lil1o1li;
/* 689 */           VarHandle.storeStoreFence();
/* 692 */           lil1o1li.I00oOio10iI1 = i1il01;
/* 699 */           lil1o1li.I00io1l = new AtomicReference();
/* 703 */           lil1o1li.I00lll10 = l1ioIO011Oo.I0000Il00O;
/* 705 */           lil1o1li.I00o0l1o1o0 = -1L;
/* 712 */           lil1o1li.I00o0iI0io1 = new AtomicLong(0L);
/* 716 */           iili011O1 iili011o1 = new iili011O1(i2);
/* 719 */           iili011o1.I00iiI = this;
/* 721 */           VarHandle.storeStoreFence();
/* 724 */           lil1o1li.I00o101lO = iili011o1;
/* 726 */           VarHandle.storeStoreFence();
/* 729 */           lil1o1li.I010i10l();
/* 732 */           this.I00lli11 = lil1o1li;
/* 736 */           li10O1l0 li10o1l0 = new li10O1l0(this);
/* 739 */           li10o1l0.I00iio = true;
/* 743 */           iii1IIii iii1iiii = new iii1IIii(4);
/* 746 */           iii1iiii.I00iiI = li10o1l0;
/* 748 */           VarHandle.storeStoreFence();
/* 751 */           li10o1l0.I00ilI0I1 = iii1iiii;
/* 755 */           OooI11loO0I oooI11loO0I = new OooI11loO0I();
/* 758 */           oooI11loO0I.I00iio = li10o1l0;
/* 764 */           l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 769 */           oooI11loO0I.I00iiO = new li0O100iO01(oooI11loO0I, l0olllo1i, objArr == true ? 1 : 0);
/* 773 */           l0olllo1i.I00li1OI.getClass();
/* 776 */           long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 780 */           oooI11loO0I.I00iOIl = jElapsedRealtime2;
/* 782 */           oooI11loO0I.I00iiI = jElapsedRealtime2;
/* 784 */           VarHandle.storeStoreFence();
/* 787 */           li10o1l0.I00ilO0 = oooI11loO0I;
/* 793 */           OoIOol ooIOol = new OoIOol(15);
/* 796 */           ooIOol.I00iiO = li10o1l0;
/* 798 */           VarHandle.storeStoreFence();
/* 801 */           li10o1l0.I00io1l = ooIOol;
/* 803 */           VarHandle.storeStoreFence();
/* 806 */           li10o1l0.I010i10l();
/* 809 */           this.I00ioIO = li10o1l0;
/* 813 */           lIloiI liloii = new lIloiI();
/* 816 */           liloii.I00iOIl = this;
                    this.I00oo1iO0ll++;
/* 823 */           liloii.I010iIIOlo();
/* 826 */           this.I00o0iI0io1 = liloii;
/* 830 */           l0o10OoO0 l0o10ooo0 = new l0o10OoO0(this);
/* 838 */           l0o10ooo0.I00l0I0l0lO1 = new Object();
/* 845 */           l0o10ooo0.I00l0OO0IO = new Semaphore(2);
/* 852 */           l0o10ooo0.I00ilI0I1 = new PriorityBlockingQueue();
/* 859 */           l0o10ooo0.I00ilO0 = new LinkedBlockingQueue();
/* 865 */           l0liiiiOooo0 l0liiiioooo0 = new l0liiiiOooo0();
/* 868 */           l0liiiioooo0.I00000oOI = l0o10ooo0;
/* 870 */           l0liiiioooo0.I00000oIO = "Thread death: Uncaught exception on worker thread";
/* 872 */           VarHandle.storeStoreFence();
/* 875 */           l0o10ooo0.I00io1l = l0liiiioooo0;
/* 881 */           l0liiiiOooo0 l0liiiioooo02 = new l0liiiiOooo0();
/* 884 */           l0liiiioooo02.I00000oOI = l0o10ooo0;
/* 886 */           l0liiiioooo02.I00000oIO = "Thread death: Uncaught exception on network thread";
/* 888 */           VarHandle.storeStoreFence();
/* 891 */           l0o10ooo0.I00ioIO = l0liiiioooo02;
/* 893 */           VarHandle.storeStoreFence();
/* 896 */           l0o10ooo0.I010iIIOlo();
/* 899 */           this.I00io1l = l0o10ooo0;
/* 901 */           il1i11oOloil il1i11ooloil = l1llili.I0000O;
/* 903 */           char c = (il1i11ooloil == null || il1i11ooloil.I00iiI == 0) ? (char) 1 : (char) 0;
/* 921 */           if (this.I00iOIl.getApplicationContext() instanceof Application) {
/* 923 */               I0001Ioi1lo(lil1o1li);
/* 938 */               if (((l0olllO1i) lil1o1li.I00iOIl).I00iOIl.getApplicationContext() instanceof Application) {
/* 950 */                   Application application = (Application) ((l0olllO1i) lil1o1li.I00iOIl).I00iOIl.getApplicationContext();
/* 952 */                   IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 954 */                   if (ilIII0O1il == null) {
/* 958 */                       ilIII0O1il = new IlIII0O1il(i);
/* 961 */                       ilIII0O1il.I00iiI = lil1o1li;
/* 963 */                       VarHandle.storeStoreFence();
/* 966 */                       lil1o1li.I00iiO = ilIII0O1il;
                            }
/* 968 */                   if (c != 0) {
/* 970 */                       application.unregisterActivityLifecycleCallbacks(ilIII0O1il);
/* 975 */                       application.registerActivityLifecycleCallbacks(lil1o1li.I00iiO);
/* 982 */                       l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 984 */                       I000II(l01o0io1ooo02);
/* 991 */                       l01o0io1ooo02.I00lll10.I00000oOI("Registered activity lifecycle callback");
                            }
                        }
                    } else {
/* 995 */               I000II(l01o0io1ooo0);
/* 1000 */              iOloiOI1.I00000oOI("Application context is not an Application");
                    }
/* 1005 */          l0iOoII1Il l0iooii1il = new l0iOoII1Il(i2);
/* 1008 */          l0iooii1il.I00iiI = l1llili;
/* 1010 */          l0iooii1il.I00iiO = this;
/* 1012 */          VarHandle.storeStoreFence();
/* 1015 */          l0o10ooo0.I010o0o0oO(l0iooii1il);
                }

                public static final void I0000O(io0oi0oO io0oi0oo) {
/* 1 */             if (io0oi0oo != null) {
/* 3 */                 return;
                    }
/* 6 */             I000II.I001IO000("Component not created");
                }

                public static final void I0000oI00(I01O1lIi i01O1lIi) {
/* 1 */             if (i01O1lIi != null) {
/* 3 */                 return;
                    }
/* 6 */             I000II.I001IO000("Component not created");
                }

                public static final void I0001Ioi1lo(iolOI0li ioloi0li) {
/* 1 */             if (ioloi0li == null) {
/* 28 */                I000II.I001IO000("Component not created");
                    } else {
/* 5 */                 if (ioloi0li.I00iiI) {
/* 7 */                     return;
                        }
/* 22 */                I000II.I001IO000("Component not initialized: ".concat(String.valueOf(ioloi0li.getClass())));
                    }
                }

                public static final void I000II(l1i00il00li l1i00il00liVar) {
/* 1 */             if (l1i00il00liVar == null) {
/* 28 */                I000II.I001IO000("Component not created");
                    } else {
/* 5 */                 if (l1i00il00liVar.I00iiI) {
/* 7 */                     return;
                        }
/* 22 */                I000II.I001IO000("Component not initialized: ".concat(String.valueOf(l1i00il00liVar.getClass())));
                    }
                }

                public static l0olllO1i I000l1(Context context, il1i11oOloil il1i11ooloil, Long l, Long l2) {
                    Bundle bundle;
/* 1 */             if (il1i11ooloil != null) {
/* 3 */                 Bundle bundle2 = il1i11ooloil.I00iio;
/* 14 */                il1i11ooloil = new il1i11oOloil(il1i11ooloil.I00iOIl, il1i11ooloil.I00iiI, il1i11ooloil.I00iiO, bundle2, null);
                    }
/* 18 */            lII0I0I000I.I000II(context);
/* 25 */            lII0I0I000I.I000II(context.getApplicationContext());
/* 30 */            if (I0100o111I == null) {
                        synchronized (l0olllO1i.class) {
                            try {
/* 37 */                        if (I0100o111I == null) {
/* 49 */                            I0100o111I = new l0olllO1i(new l1llIli(context, il1i11ooloil, l, l2));
                                }
                            } finally {
                            }
                        }
                    } else if (il1i11ooloil != null && (bundle = il1i11ooloil.I00iio) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
/* 75 */                lII0I0I000I.I000II(I0100o111I);
/* 90 */                I0100o111I.I00oli = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
                    }
/* 94 */            lII0I0I000I.I000II(I0100o111I);
/* 97 */            return I0100o111I;
                }

                public final boolean I00000oIO() {
                    return I00000oOI() == 0;
                }

                public final int I00000oOI() {
/* 1 */             l0o10OoO0 l0o10ooo0 = this.I00io1l;
/* 3 */             I000II(l0o10ooo0);
/* 6 */             l0o10ooo0.I010II();
/* 9 */             iIl1iil iil1iil = this.I00iio;
/* 16 */            if (iil1iil.I0110o()) {
/* 15 */                return 1;
                    }
/* 18 */            I000II(l0o10ooo0);
/* 21 */            l0o10ooo0.I010II();
/* 26 */            if (!this.I00oliIiO01i) {
/* 113 */               return 8;
                    }
/* 28 */            l0Oi0o l0oi0o = this.I00ilI0I1;
/* 30 */            I0000oI00(l0oi0o);
/* 33 */            l0oi0o.I010II();
/* 61 */            Boolean boolValueOf = l0oi0o.I010ioo().contains("measurement_enabled") ? Boolean.valueOf(l0oi0o.I010ioo().getBoolean("measurement_enabled", true)) : null;
/* 62 */            if (boolValueOf != null) {
                        return boolValueOf.booleanValue() ? 0 : 3;
                    }
/* 77 */            lolOiIoiillI loloiioiilli = ((l0olllO1i) iil1iil.I00iOIl).I00iiO;
/* 81 */            Boolean boolI0110OiO = iil1iil.I0110OiO("firebase_analytics_collection_enabled");
                    return boolI0110OiO != null ? boolI0110OiO.booleanValue() ? 0 : 4 : (this.I00oli == null || this.I00oli.booleanValue()) ? 0 : 7;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000Il00O() {
/* 3 */             boolean z = false;
/* 4 */             if (!this.I00oOio10iI1) {
/* 153 */               I000II.I001IO000("AppMeasurement is not initialized");
/* 3 */                 return false;
                    }
/* 6 */             l0o10OoO0 l0o10ooo0 = this.I00io1l;
/* 8 */             I000II(l0o10ooo0);
/* 11 */            l0o10ooo0.I010II();
/* 14 */            Boolean bool = this.I00ol1;
/* 16 */            Iioi0lilII iioi0lilII = this.I00li1OI;
/* 18 */            if (bool == null || this.I00olI == 0) {
/* 54 */                iioi0lilII.getClass();
/* 61 */                this.I00olI = SystemClock.elapsedRealtime();
/* 63 */                lioil0ilIOi lioil0ilioi = this.I00l0I0l0lO1;
/* 65 */                I0000oI00(lioil0ilioi);
/* 74 */                if (lioil0ilioi.I01I0Iioooo0("android.permission.INTERNET") && lioil0ilioi.I01I0Iioooo0("android.permission.ACCESS_NETWORK_STATE")) {
/* 84 */                    Context context = this.I00iOIl;
/* 95 */                    if (i01l1OO001.I00000oIO(context).I0000oI00() || this.I00iio.I010iIIOlo() || (lioil0ilIOi.I01O10iIoo1O(context) && lioil0ilIOi.I011iIOio(context))) {
/* 117 */                       z = true;
                            }
                        }
/* 122 */               this.I00ol1 = Boolean.valueOf(z);
/* 124 */               if (z) {
/* 142 */                   this.I00ol1 = Boolean.valueOf(lioil0ilioi.I010l1O(I000iOII().I010l1ol111()));
                        }
                    } else if (!bool.booleanValue()) {
/* 34 */                iioi0lilII.getClass();
/* 52 */                if (Math.abs(SystemClock.elapsedRealtime() - this.I00olI) > 1000) {
                        }
                    }
/* 146 */           return this.I00ol1.booleanValue();
                }

                public final l00Ii0II I000O01llI0() {
/* 3 */             I0001Ioi1lo(this.I00o101lO);
/* 6 */             return this.I00o101lO;
                }

                public final lOliOlO1Io I000OOo1O() {
/* 3 */             I0001Ioi1lo(this.I00oI0i);
/* 6 */             return this.I00oI0i;
                }

                public final iOolIl0IIo I000OiO() {
/* 3 */             I000II(this.I00oII);
/* 6 */             return this.I00oII;
                }

                public final iooloO1iOil I000iOII() {
/* 3 */             I0001Ioi1lo(this.I00oIiI10);
/* 6 */             return this.I00oIiI10;
                }

                @Override
                public final lolOiIoiillI I001i1O0Ol() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final l01O0IO1ooO0 I00II0oii1o() {
/* 1 */             l01O0IO1ooO0 l01o0io1ooo0 = this.I00ilO0;
/* 3 */             I000II(l01o0io1ooo0);
/* 20 */            return l01o0io1ooo0;
                }

                @Override
                public final Iioi0lilII I00IoO0() {
/* 1 */             return this.I00li1OI;
                }

                @Override
                public final l0o10OoO0 I00iOIl() {
/* 1 */             l0o10OoO0 l0o10ooo0 = this.I00io1l;
/* 3 */             I000II(l0o10ooo0);
/* 20 */            return l0o10ooo0;
                }

                @Override
                public final Context I00iiI() {
/* 1 */             return this.I00iOIl;
                }
            }
