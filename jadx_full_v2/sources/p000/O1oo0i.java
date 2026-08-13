            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 25 */    public abstract class O1oo0i {
                protected final OloO01111 taskQueue;
                private final AtomicInteger zza;
                private final AtomicBoolean zzb;

                public O1oo0i() {
/* 10 */            this.zza = new AtomicInteger(0);
/* 17 */            this.zzb = new AtomicBoolean(false);
/* 24 */            this.taskQueue = new OloO01111();
                }

                public <T> OloIIoII1oo callAfterLoad(Executor executor, Callable<T> callable, IIoiO1OOl0I iIoiO1OOl0I) {
/* 7 */             int i = 1;
/* 13 */            lII0I0I000I.I000OiO(this.zza.get() > 0);
/* 25 */            if (((iOoIlOOO0) iIoiO1OOl0I).I00000oIO.I000O01llI0()) {
/* 29 */                o0IiOl o0iiol = new o0IiOl();
/* 32 */                o0iiol.I00100l0();
/* 35 */                return o0iiol;
                    }
/* 38 */            IIoiOO0 iIoiOO0 = new IIoiOO0();
/* 45 */            OloIlI0ll oloIlI0ll = new OloIlI0ll(iIoiOO0.I00000oIO);
/* 50 */            I11liO i11liO = new I11liO(i);
/* 53 */            i11liO.I00iiI = executor;
/* 55 */            i11liO.I00iiO = iIoiO1OOl0I;
/* 57 */            i11liO.I00iio = iIoiOO0;
/* 59 */            i11liO.I00ilI0I1 = oloIlI0ll;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            OloO01111 oloO01111 = this.taskQueue;
/* 69 */            iOlO1o iolo1o = new iOlO1o(4);
/* 72 */            iolo1o.I00iiO = this;
/* 74 */            iolo1o.I00iiI = iIoiO1OOl0I;
/* 76 */            iolo1o.I00iio = iIoiOO0;
/* 78 */            iolo1o.I00ilI0I1 = callable;
/* 80 */            iolo1o.I00ilO0 = oloIlI0ll;
/* 82 */            VarHandle.storeStoreFence();
/* 85 */            oloO01111.I00000oIO(iolo1o, i11liO);
/* 88 */            return oloIlI0ll.I00000oIO;
                }

                public boolean isLoaded() {
/* 3 */             return this.zzb.get();
                }

                public abstract void load();

                public void pin() {
/* 3 */             this.zza.incrementAndGet();
                }

                public abstract void release();

                public void unpin(Executor executor) {
/* 1 */             unpinWithTask(executor);
                }

                public OloIIoII1oo unpinWithTask(Executor executor) {
/* 12 */            lII0I0I000I.I000OiO(this.zza.get() > 0);
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 24 */            iooili01 iooili01Var = new iooili01(10);
/* 27 */            iooili01Var.I00iiI = this;
/* 29 */            iooili01Var.I00iiO = oloIlI0ll;
/* 31 */            VarHandle.storeStoreFence();
/* 36 */            this.taskQueue.I00000oIO(iooili01Var, executor);
/* 39 */            return oloIlI0ll.I00000oIO;
                }

                public final void zza(IIoiO1OOl0I iIoiO1OOl0I, IIoiOO0 iIoiOO0, Callable callable, OloIlI0ll oloIlI0ll) {
                    try {
/* 10 */                if (((iOoIlOOO0) iIoiO1OOl0I).I00000oIO.I000O01llI0()) {
/* 12 */                    iIoiOO0.I00000oIO();
/* 15 */                    return;
                        }
                        try {
/* 22 */                    if (!this.zzb.get()) {
/* 24 */                        load();
/* 30 */                        this.zzb.set(true);
                            }
/* 47 */                    if (((iOoIlOOO0) iIoiO1OOl0I).I00000oIO.I000O01llI0()) {
/* 49 */                        iIoiOO0.I00000oIO();
/* 52 */                        return;
                            }
/* 53 */                    Object objCall = callable.call();
/* 66 */                    if (((iOoIlOOO0) iIoiO1OOl0I).I00000oIO.I000O01llI0()) {
/* 68 */                        iIoiOO0.I00000oIO();
                            } else {
/* 72 */                        oloIlI0ll.I00000oOI(objCall);
                            }
                        } catch (RuntimeException e) {
/* 85 */                    throw new O1o01iO0liI0(13, e, "Internal error has occurred when executing ML Kit tasks");
                        }
                    } catch (Exception e2) {
/* 94 */                if (((iOoIlOOO0) iIoiO1OOl0I).I00000oIO.I000O01llI0()) {
/* 96 */                    iIoiOO0.I00000oIO();
                        } else {
/* 100 */                   oloIlI0ll.I00000oIO(e2);
                        }
                    }
                }

                public final void zzb(OloIlI0ll oloIlI0ll) {
/* 3 */             int iDecrementAndGet = this.zza.decrementAndGet();
/* 13 */            lII0I0I000I.I000OiO(iDecrementAndGet >= 0);
/* 16 */            if (iDecrementAndGet == 0) {
/* 18 */                release();
/* 23 */                this.zzb.set(false);
                    }
/* 28 */            llo0iOIIIl.I00iOIl.clear();
/* 33 */            loIIo1.I00000oIO.clear();
/* 37 */            oloIlI0ll.I00000oOI(null);
                }

/* 26 */        public O1oo0i(OloO01111 oloO01111) {
                    this.zza = new AtomicInteger(0);
/* 28 */            this.zzb = new AtomicBoolean(false);
                    this.taskQueue = oloO01111;
                }
            }
