            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class l0001OI0 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public l0001OI0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws ExecutionException, InterruptedException {
                    Throwable thI00000oOI;
                    switch (this.I00iOIl) {
                        case 0:
/* 428 */                   ioooOO1I1 iooooo1i1 = (ioooOO1I1) this.I00iiO;
/* 432 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 436 */                   if ((listenableFuture instanceof ioi01lIi1) && (thI00000oOI = ((ioi01lIi1) listenableFuture).I00000oOI()) != null) {
/* 448 */                       iooooo1i1.zza(thI00000oOI);
/* 473 */                       return;
                            }
                            try {
/* 456 */                       iooooo1i1.zzb(lioo0lo01i.I0000oI00(listenableFuture));
/* 473 */                       return;
                            } catch (ExecutionException e) {
/* 470 */                       iooooo1i1.zza(e.getCause());
/* 473 */                       return;
                            } catch (Throwable th) {
/* 461 */                       iooooo1i1.zza(th);
/* 473 */                       return;
                            }
                        case 1:
/* 399 */                   IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiO;
                            try {
/* 405 */                       ((ListenableFuture) this.I00iiI).get();
/* 425 */                       return;
                            } catch (Exception e2) {
/* 416 */                       if (iIoOoIol0Io0.I0010o() instanceof OIIoiiOIil00) {
/* 422 */                           iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(e2));
/* 425 */                           return;
                                }
/* 425 */                       return;
                            }
                        case 2:
                            try {
/* 355 */                       ((Runnable) this.I00iiO).run();
                                synchronized (((OilOol) this.I00iiI).I00ilI0I1) {
/* 369 */                           ((OilOol) this.I00iiI).I00000oIO();
                                }
/* 373 */                       return;
                            } catch (Throwable th2) {
                                synchronized (((OilOol) this.I00iiI).I00ilI0I1) {
/* 389 */                           ((OilOol) this.I00iiI).I00000oIO();
/* 393 */                           throw th2;
                                }
                            }
                        case 3:
/* 309 */                   i0Iii1o10 i0iii1o10 = (i0Iii1o10) this.I00iiI;
/* 313 */                   Bundle bundle = (Bundle) this.I00iiO;
/* 315 */                   i0O1I1o i0o1i1o = i0iii1o10.I000II;
/* 317 */                   i0o1i1o.getClass();
/* 323 */                   i000IO i000io = new i000IO(2);
/* 326 */                   i000io.I00iiI = i0o1i1o;
/* 328 */                   i000io.I00iiO = bundle;
/* 330 */                   VarHandle.storeStoreFence();
/* 343 */                   if (((Boolean) i0o1i1o.I00000oOI(i000io)).booleanValue()) {
/* 347 */                       i0iii1o10.I000O01llI0.I00000oIO();
/* 350 */                       return;
                            }
/* 350 */                   return;
                        case 4:
/* 266 */                   l1i11I1I0 l1i11i1i0 = (l1i11I1I0) this.I00iiI;
/* 268 */                   l1i11i1i0.I001i1O0Ol();
/* 275 */                   if (lolOiIoiillI.I0001Ioi1lo()) {
/* 281 */                       l1i11i1i0.I00iOIl().I010o0o0oO(this);
/* 306 */                       return;
                            }
/* 287 */                   iOo0iOlili1 ioo0iolili1 = (iOo0iOlili1) this.I00iiO;
/* 295 */                   boolean z = ioo0iolili1.I0000Il00O != 0;
/* 299 */                   ioo0iolili1.I0000Il00O = 0L;
/* 301 */                   if (z) {
/* 303 */                       ioo0iolili1.I00000oIO();
/* 306 */                       return;
                            }
/* 306 */                   return;
                        case 5:
/* 260 */                   ((ii0IiiI) this.I00iiI).zza((iOioO0lIOo) this.I00iiO);
/* 263 */                   return;
                        case 6:
/* 219 */                   Callable callable = (Callable) this.I00iiI;
/* 223 */                   OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iiO;
                            try {
/* 229 */                       oloIlI0ll.I00000oOI(callable.call());
/* 251 */                       return;
                            } catch (O1o01iO0liI0 e3) {
/* 248 */                       oloIlI0ll.I00000oIO(e3);
/* 251 */                       return;
                            } catch (Exception e4) {
/* 243 */                       oloIlI0ll.I00000oIO(new O1o01iO0liI0(13, e4, "Internal error has occurred when executing ML Kit tasks"));
/* 251 */                       return;
                            }
                        case 7:
/* 196 */                   l0IIioiIOIo l0iiioiioio = (l0IIioiIOIo) this.I00iiO;
                            synchronized (l0iiioiioio.I00iiO) {
/* 209 */                       ((OIOolOo) l0iiioiioio.I00iio).onComplete((OloIIoII1oo) this.I00iiI);
                            }
/* 213 */                   return;
                        case 8:
/* 179 */                   l1Oli1l l1oli1l = (l1Oli1l) this.I00iiI;
/* 183 */                   lli10iI lli10ii = (lli10iI) this.I00iiO;
/* 185 */                   lilOOl0 lilool0 = l1oli1l.I000II;
/* 187 */                   lilool0.I00OI1();
/* 190 */                   lilool0.I00iio(lli10ii);
/* 193 */                   return;
                        case 9:
/* 129 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiO;
/* 133 */                   l0olllO1i l0olllo1i = (l0olllO1i) loliolo1io.I00iOIl;
/* 135 */                   iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 137 */                   if (iolll0ill1iVar == null) {
/* 139 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 141 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 148 */                       l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Failed to send app backgrounded");
/* 176 */                       return;
                            }
                            try {
/* 156 */                       iolll0ill1iVar.I00IlilI0i0i((lli10iI) this.I00iiI);
/* 159 */                       loliolo1io.I0110OiO();
/* 176 */                       return;
                            } catch (RemoteException e5) {
/* 164 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 166 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 173 */                       l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send app backgrounded to the service", e5);
/* 176 */                       return;
                            }
                        case 10:
/* 61 */                    lOl001Iii lol001iii = (lOl001Iii) this.I00iiO;
                            synchronized (lol001iii) {
                                try {
/* 64 */                            lol001iii.I00iOIl = false;
/* 66 */                            lOliOlO1Io loliolo1io2 = lol001iii.I00iiO;
/* 72 */                            if (!loliolo1io2.I011IOil()) {
/* 78 */                                l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) loliolo1io2.I00iOIl).I00ilO0;
/* 80 */                                l0olllO1i.I000II(l01o0io1ooo03);
/* 87 */                                l01o0io1ooo03.I00lli11.I00000oOI("Connected to remote service");
/* 92 */                                iolll0ill1i iolll0ill1iVar2 = (iolll0ill1i) this.I00iiI;
/* 94 */                                loliolo1io2.I010II();
/* 97 */                                loliolo1io2.I00iio = iolll0ill1iVar2;
/* 99 */                                loliolo1io2.I0110OiO();
/* 102 */                               loliolo1io2.I0111i();
                                    }
                                } catch (Throwable th3) {
/* 126 */                           throw th3;
                                }
                            }
/* 113 */                   lOliOlO1Io loliolo1io3 = ((lOl001Iii) this.I00iiO).I00iiO;
/* 115 */                   ScheduledExecutorService scheduledExecutorService = loliolo1io3.I00io1l;
/* 117 */                   if (scheduledExecutorService != null) {
/* 119 */                       scheduledExecutorService.shutdownNow();
/* 122 */                       loliolo1io3.I00io1l = null;
/* 124 */                       return;
                            }
/* 124 */                   return;
                        default:
/* 11 */                    OloO01111 oloO01111 = (OloO01111) this.I00iiI;
/* 13 */                    AtomicReference atomicReference = oloO01111.I0000O;
/* 29 */                    lII0I0I000I.I000OiO(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                            try {
/* 36 */                        ((Runnable) this.I00iiO).run();
/* 39 */                        atomicReference.set(null);
/* 42 */                        oloO01111.I00000oOI();
/* 45 */                        return;
                            } catch (Throwable th4) {
                                try {
/* 47 */                            atomicReference.set(null);
/* 50 */                            oloO01111.I00000oOI();
                                } catch (Throwable th5) {
/* 55 */                            th4.addSuppressed(th5);
                                }
/* 58 */                        throw th4;
                            }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    String simpleName = l0001OI0.class.getSimpleName();
/* 21 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(25);
/* 26 */                    int i = 24;
/* 28 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(i);
/* 31 */                    olilOlOiI.I00iiO = oo1ol1ll;
/* 33 */                    olilOlOiI.I00iio = oo1ol1ll;
/* 35 */                    olilOlOiI.I00iiI = simpleName;
/* 37 */                    VarHandle.storeStoreFence();
/* 42 */                    ioooOO1I1 iooooo1i1 = (ioooOO1I1) this.I00iiO;
/* 46 */                    Oo1ol1ll oo1ol1ll2 = new Oo1ol1ll(i);
/* 49 */                    oo1ol1ll.I00iio = oo1ol1ll2;
/* 51 */                    olilOlOiI.I00iio = oo1ol1ll2;
/* 53 */                    oo1ol1ll2.I00iiO = iooooo1i1;
/* 55 */                    return olilOlOiI.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
