            package p000;

            import android.view.Surface;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class OlioOlO1 implements AutoCloseable {
                public OlOO00iI0lI I00iOIl;
                public IiIio01lo I00iiI;
                public IIoI1li1o1l I00iiO;
                public Map I00iio;
                public Object I00ilI0I1;
                public LinkedHashMap I00ilO0;
                public LinkedHashMap I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
                
                    r1 = p000.Il011I1OiO0I.I00iOIl;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
                    Map linkedHashMap;
                    synchronized (this.I00ilI0I1) {
/* 6 */                 linkedHashMap = new LinkedHashMap();
/* 13 */                Iterator it = this.I00iOIl.I00iiO.iterator();
                        loop0: while (true) {
/* 21 */                    if (!it.hasNext()) {
                                break;
                            }
/* 27 */                    OlOIo0 olOIo0 = (OlOIo0) it.next();
/* 31 */                    Iterator it2 = olOIo0.I000l1.iterator();
/* 39 */                    while (it2.hasNext()) {
/* 45 */                        IIo1loI0 iIo1loI0 = (IIo1loI0) it2.next();
/* 59 */                        Surface surface = (Surface) this.I00ilO0.get(OlOO0I1.I00000oIO(iIo1loI0.I00000oIO));
/* 61 */                        if (surface == null) {
/* 70 */                            if (!(olOIo0.I0001Ioi1lo != null)) {
                                        break loop0;
                                    }
                                } else {
/* 84 */                            linkedHashMap.put(OlOO0I1.I00000oIO(iIo1loI0.I00000oIO), surface);
                                }
                            }
                        }
                    }
/* 92 */            if (linkedHashMap.isEmpty()) {
/* 124 */               return;
                    }
/* 101 */           IIioIlI0 iIioIlI0 = (IIioIlI0) this.I00iiI.get();
                    synchronized (iIioIlI0.I000oI1ioi) {
/* 110 */               if (iIioIlI0.I0000Il00O()) {
/* 113 */                   return;
                        }
/* 114 */               iIioIlI0.I001iOo1i0O = linkedHashMap;
/* 116 */               IO0Il0o1OI iO0Il0o1OI = iIioIlI0.I001i1lo1io;
/* 119 */               if (iO0Il0o1OI != null) {
/* 121 */                   iO0Il0o1OI.I0000O(linkedHashMap);
                        }
                    }
                }

                public final void I0000Il00O() {
                    synchronized (this.I00ilI0I1) {
                        try {
/* 6 */                     if (this.I00l0I0l0lO1) {
/* 56 */                        throw new IllegalStateException("Check failed.");
                            }
/* 22 */                    for (Surface surface : this.I00ilO0.values()) {
/* 38 */                        this.I00io1l.put(surface, this.I00iiO.I00000oIO(surface));
                            }
/* 45 */                    this.I00ioIO = true;
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final void I000II() throws Exception {
                    List<AutoCloseable> listI00iIi0i1o;
                    boolean zIsTerminated;
                    synchronized (this.I00ilI0I1) {
/* 5 */                 this.I00ioIO = false;
/* 15 */                listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I00io1l.values());
/* 21 */                this.I00io1l.clear();
                    }
/* 33 */            for (AutoCloseable autoCloseable : listI00iIi0i1o) {
/* 43 */                if (autoCloseable instanceof AutoCloseable) {
/* 45 */                    autoCloseable.close();
                        } else {
/* 51 */                    if (!(autoCloseable instanceof ExecutorService)) {
/* 100 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 103 */                       return;
                            }
/* 53 */                    ExecutorService executorService = (ExecutorService) autoCloseable;
/* 59 */                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 68 */                        executorService.shutdown();
/* 71 */                        boolean z = false;
/* 72 */                        while (!zIsTerminated) {
                                    try {
/* 78 */                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
/* 83 */                                if (!z) {
/* 85 */                                    executorService.shutdownNow();
/* 88 */                                    z = true;
                                        }
                                    }
                                }
/* 90 */                        if (z) {
/* 96 */                            Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                }

                @Override
                public final void close() {
                    boolean zIsTerminated;
                    synchronized (this.I00ilI0I1) {
/* 6 */                 if (this.I00l0I0l0lO1) {
/* 9 */                     return;
                        }
/* 11 */                this.I00l0I0l0lO1 = true;
/* 15 */                this.I00ilO0.clear();
/* 26 */                List<AutoCloseable> listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I00io1l.values());
/* 32 */                this.I00io1l.clear();
/* 44 */                for (AutoCloseable autoCloseable : listI00iIi0i1o) {
/* 54 */                    if (autoCloseable instanceof AutoCloseable) {
/* 56 */                        autoCloseable.close();
                            } else {
/* 62 */                        if (!(autoCloseable instanceof ExecutorService)) {
/* 111 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 114 */                           return;
                                }
/* 64 */                        ExecutorService executorService = (ExecutorService) autoCloseable;
/* 70 */                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 79 */                            executorService.shutdown();
/* 82 */                            boolean z = false;
/* 83 */                            while (!zIsTerminated) {
                                        try {
/* 89 */                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                        } catch (InterruptedException unused) {
/* 94 */                                    if (!z) {
/* 96 */                                        executorService.shutdownNow();
/* 99 */                                        z = true;
                                            }
                                        }
                                    }
/* 101 */                           if (z) {
/* 107 */                               Thread.currentThread().interrupt();
                                    }
                                }
                            }
                        }
                    }
                }
            }
