            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
/* 18 */    public final class I1lo101oIi1 {
                public final ArrayList I00000oIO;
                public boolean I00000oOI;
                public final CopyOnWriteArrayList I0000Il00O;
                public final int I0000O;
                public final Object I0000oI00;

                public I1lo101oIi1(boolean z) {
/* 9 */             this.I00000oIO = new ArrayList();
/* 11 */            this.I00000oOI = z;
/* 18 */            this.I0000Il00O = new CopyOnWriteArrayList();
                }

                public final void I0000O() throws Exception {
                    boolean zIsTerminated;
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I0000Il00O;
/* 3 */             Iterator it = copyOnWriteArrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                AutoCloseable autoCloseable = (AutoCloseable) it.next();
/* 21 */                if (autoCloseable instanceof AutoCloseable) {
/* 23 */                    autoCloseable.close();
                        } else {
/* 29 */                    if (!(autoCloseable instanceof ExecutorService)) {
/* 78 */                        OIiilo1Ool0o.I00100o1O0lo();
/* 81 */                        return;
                            }
/* 31 */                    ExecutorService executorService = (ExecutorService) autoCloseable;
/* 37 */                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 46 */                        executorService.shutdown();
/* 49 */                        boolean z = false;
/* 50 */                        while (!zIsTerminated) {
                                    try {
/* 56 */                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
/* 61 */                                if (!z) {
/* 63 */                                    executorService.shutdownNow();
/* 66 */                                    z = true;
                                        }
                                    }
                                }
/* 68 */                        if (z) {
/* 74 */                            Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
/* 82 */            copyOnWriteArrayList.clear();
/* 85 */            ArrayList arrayList = this.I00000oIO;
/* 87 */            Iterator it2 = arrayList.iterator();
/* 95 */            while (it2.hasNext()) {
/* 103 */               ((OIOo01iloo) it2.next()).I0001Ioi1lo();
                    }
/* 107 */           arrayList.clear();
                }

                public final void I0000oI00(boolean z) {
/* 1 */             this.I00000oOI = z;
/* 5 */             Iterator it = this.I00000oIO.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                OIOo01iloo oIOo01iloo = (OIOo01iloo) it.next();
/* 30 */                oIOo01iloo.I000II(oIOo01iloo.I000OOo1O && z);
                    }
                }

/* 19 */        public final void I00000oIO() {
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 20 */        public I1lo101oIi1(Object obj, int i) {
                    this(false);
/* 21 */            this.I0000O = i;
                    this.I0000oI00 = obj;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 21 */        public I1lo101oIi1(I0o0o0 i0o0o0) {
/* 22 */            this(true);
                    this.I0000O = 3;
                    this.I0000oI00 = i0o0o0;
                }

/* 28 */        public final void I00000oOI(I1lloOo i1lloOo) {
                }

/* 28 */        public final void I0000Il00O(I1lloOo i1lloOo) {
                }
            }
