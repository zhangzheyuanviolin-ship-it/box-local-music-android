            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class OlOO00iI0lI implements AutoCloseable {
                public static final I1OollilIo I00l0I0l0lO1 = iOOOIOoiIlII.I00000oOI(0);
                public static final I1OollilIo I00l0OO0IO = iOOOIOoiIlII.I00000oOI(0);
                public static final I1OollilIo I00li1OI = iOOOIOoiIlII.I00000oOI(0);
                public static final I1OollilIo I00ll1 = iOOOIOoiIlII.I00000oOI(0);
                public static final I1OollilIo I00lli11 = iOOOIOoiIlII.I00000oOI(0);
                public static final List I00lll10 = IOOi1I.I000O01llI0(l1I0oI.I00io1l, l1I0oI.I00ioIO);
                public static final OiOIlO1OII0 I00o0iI0io1 = new OiOIlO1OII0(3);
                public static final List I00o0l1o1o0 = IOOi1I.I000O01llI0(OlOIOoII1i.I00000oIO(0), OlOIOoII1i.I00000oIO(34));
                public static final OiOIlO1OII0 I00o101lO = new OiOIlO1OII0(4);
                public IIliIi1O0OiO I00iOIl;
                public LinkedHashMap I00iiI;
                public List I00iiO;
                public LinkedHashMap I00iio;
                public O1OOII I00ilI0I1;
                public List I00ilO0;
                public ArrayList I00io1l;
                public ArrayList I00ioIO;

                public final IIo1loI0 I00000oIO(int i) {
                    Object next;
/* 3 */             Iterator it = this.I00io1l.iterator();
                    while (true) {
/* 11 */                if (!it.hasNext()) {
/* 25 */                    next = null;
                            break;
                        }
/* 13 */                next = it.next();
/* 22 */                if (((IIo1loI0) next).I00000oIO == i) {
                            break;
                        }
                    }
/* 26 */            return (IIo1loI0) next;
                }

                public final IIo1lioOolol I0000Il00O(int i) {
                    Object next;
/* 9 */             Iterator it = this.I00iiI.entrySet().iterator();
                    while (true) {
/* 18 */                if (!it.hasNext()) {
/* 38 */                    next = null;
                            break;
                        }
/* 20 */                next = it.next();
/* 35 */                if (((IIo1loI0) ((Map.Entry) next).getValue()).I00000oIO == i) {
                            break;
                        }
                    }
/* 39 */            Map.Entry entry = (Map.Entry) next;
/* 41 */            if (entry != null) {
/* 47 */                return (IIo1lioOolol) entry.getKey();
                    }
/* 17 */            return null;
                }

                @Override
                public final void close() {
                    boolean zIsTerminated;
/* 9 */             Iterator it = ((IO0ioo1i0oo) this.I00ilI0I1.values()).iterator();
/* 17 */            while (it.hasNext()) {
/* 23 */                AutoCloseable autoCloseable = (IoiO1O1) it.next();
/* 27 */                if (autoCloseable instanceof AutoCloseable) {
/* 29 */                    autoCloseable.close();
                        } else {
/* 35 */                    if (!(autoCloseable instanceof ExecutorService)) {
/* 84 */                        OIiilo1Ool0o.I00100o1O0lo();
/* 110 */                       return;
                            }
/* 37 */                    ExecutorService executorService = (ExecutorService) autoCloseable;
/* 43 */                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 52 */                        executorService.shutdown();
/* 55 */                        boolean z = false;
/* 56 */                        while (!zIsTerminated) {
                                    try {
/* 62 */                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
/* 67 */                                if (!z) {
/* 69 */                                    executorService.shutdownNow();
/* 72 */                                    z = true;
                                        }
                                    }
                                }
/* 74 */                        if (z) {
/* 80 */                            Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                }

                public final String toString() {
/* 18 */            return "StreamGraph(" + this.I00iiI + ')';
                }
            }
