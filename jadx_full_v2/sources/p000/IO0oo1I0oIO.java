            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.reflect.UndeclaredThrowableException;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
/* 82 */    public final class IO0oo1I0oIO extends Illo1O1o implements Runnable {
                public I1Olli1oIi I00iiO;
                public LinkedBlockingQueue I00iio;
                public CountDownLatch I00ilI0I1;
                public ListenableFuture I00ilO0;
                public volatile ListenableFuture I00io1l;

                public static Object I00000oOI(LinkedBlockingQueue linkedBlockingQueue) {
                    Object objTake;
/* 1 */             boolean z = false;
                    while (true) {
                        try {
/* 2 */                     objTake = linkedBlockingQueue.take();
                            break;
                        } catch (InterruptedException unused) {
/* 27 */                    z = true;
                        } catch (Throwable th) {
/* 17 */                    if (z) {
/* 23 */                        Thread.currentThread().interrupt();
                            }
/* 26 */                    throw th;
                        }
                    }
/* 6 */             if (z) {
/* 12 */                Thread.currentThread().interrupt();
                    }
/* 15 */            return objTake;
                }

                @Override
                public final boolean cancel(boolean z) {
/* 7 */             boolean z2 = false;
/* 8 */             if (!this.I00iOIl.cancel(z)) {
/* 7 */                 return false;
                    }
                    while (true) {
                        try {
/* 17 */                    this.I00iio.put(Boolean.valueOf(z));
                            break;
                        } catch (InterruptedException unused) {
/* 55 */                    z2 = true;
                        } catch (Throwable th) {
/* 45 */                    if (z2) {
/* 51 */                        Thread.currentThread().interrupt();
                            }
/* 54 */                    throw th;
                        }
                    }
/* 20 */            if (z2) {
/* 26 */                Thread.currentThread().interrupt();
                    }
/* 29 */            ListenableFuture listenableFuture = this.I00ilO0;
/* 31 */            if (listenableFuture != null) {
/* 33 */                listenableFuture.cancel(z);
                    }
/* 36 */            ListenableFuture listenableFuture2 = this.I00io1l;
/* 38 */            if (listenableFuture2 != null) {
/* 40 */                listenableFuture2.cancel(z);
                    }
/* 16 */            return true;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
/* 7 */             if (!this.I00iOIl.isDone()) {
/* 9 */                 TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
/* 11 */                if (timeUnit != timeUnit2) {
/* 13 */                    j = timeUnit2.convert(j, timeUnit);
/* 17 */                    timeUnit = timeUnit2;
                        }
/* 18 */                ListenableFuture listenableFuture = this.I00ilO0;
/* 22 */                if (listenableFuture != null) {
/* 24 */                    long jNanoTime = System.nanoTime();
/* 28 */                    listenableFuture.get(j, timeUnit);
/* 40 */                    j -= Math.max(0L, System.nanoTime() - jNanoTime);
                        }
/* 41 */                long jNanoTime2 = System.nanoTime();
/* 51 */                if (!this.I00ilI0I1.await(j, timeUnit)) {
/* 76 */                    throw new TimeoutException();
                        }
/* 62 */                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
/* 63 */                ListenableFuture listenableFuture2 = this.I00io1l;
/* 65 */                if (listenableFuture2 != null) {
/* 67 */                    listenableFuture2.get(j, timeUnit);
                        }
                    }
/* 79 */            return this.I00iOIl.get(j, timeUnit);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [IO0oo1I0oIO, Illo1O1o] */
                /* JADX WARN: Type inference failed for: r4v1, types: [IO0oo1I0oIO] */
                /* JADX WARN: Type inference failed for: r4v3, types: [Illo1O1o] */
                /* JADX WARN: Type inference failed for: r4v6, types: [Illo1O1o] */
                /* JADX WARN: Type inference failed for: r4v7, types: [Illo1O1o] */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.util.concurrent.CountDownLatch] */
                @Override
                public final void run() {
                    IO0oo1I0oIO iO0oo1I0oIO;
                    try {
                        try {
                            try {
                                try {
                                    try {
/* 10 */                                ListenableFuture listenableFutureApply = this.I00iiO.apply(iIllIoiiIO.I0000Il00O(this.I00ilO0));
/* 14 */                                this.I00io1l = listenableFutureApply;
/* 22 */                                if (this.I00iOIl.isCancelled()) {
/* 36 */                                    listenableFutureApply.cancel(((Boolean) I00000oOI(this.I00iio)).booleanValue());
/* 39 */                                    this.I00io1l = null;
                                        } else {
/* 68 */                                    listenableFutureApply.addListener(new illioiliioi(this, listenableFutureApply), Iii11l.I00000oIO());
                                        }
                                    } catch (Exception e) {
/* 107 */                               IIiOOI iIiOOI = this.I00iiI;
                                        iO0oo1I0oIO = this;
/* 109 */                               if (iIiOOI != null) {
/* 111 */                                   iIiOOI.I0000O(e);
                                            iO0oo1I0oIO = this;
                                        }
                                    }
                                } catch (Error e2) {
/* 90 */                            IIiOOI iIiOOI2 = this.I00iiI;
                                    iO0oo1I0oIO = this;
/* 92 */                            if (iIiOOI2 != null) {
/* 94 */                                iIiOOI2.I0000O(e2);
                                        iO0oo1I0oIO = this;
                                    }
                                }
                            } finally {
/* 128 */                       this.I00iiO = null;
/* 130 */                       this.I00ilO0 = null;
/* 134 */                       this.I00ilI0I1.countDown();
                            }
                        } catch (CancellationException unused) {
/* 86 */                    cancel(false);
                        } catch (ExecutionException e3) {
/* 73 */                    Throwable cause = e3.getCause();
/* 77 */                    IIiOOI iIiOOI3 = this.I00iiI;
/* 79 */                    if (iIiOOI3 != null) {
/* 81 */                        iIiOOI3.I0000O(cause);
                            }
                        }
                    } catch (UndeclaredThrowableException e4) {
/* 115 */               Throwable cause2 = e4.getCause();
/* 119 */               IIiOOI iIiOOI4 = this.I00iiI;
                        iO0oo1I0oIO = this;
/* 121 */               if (iIiOOI4 != null) {
/* 123 */                   iIiOOI4.I0000O(cause2);
                            iO0oo1I0oIO = this;
                        }
                    }
                }

                @Override
/* 83 */        public final Object get() throws ExecutionException, InterruptedException {
/* 84 */            if (!this.I00iOIl.isDone()) {
/* 85 */                ListenableFuture listenableFuture = this.I00ilO0;
                        if (listenableFuture != null) {
/* 86 */                    listenableFuture.get();
                        }
/* 87 */                this.I00ilI0I1.await();
/* 88 */                ListenableFuture listenableFuture2 = this.I00io1l;
                        if (listenableFuture2 != null) {
/* 89 */                    listenableFuture2.get();
                        }
                    }
/* 90 */            return this.I00iOIl.get();
                }
            }
