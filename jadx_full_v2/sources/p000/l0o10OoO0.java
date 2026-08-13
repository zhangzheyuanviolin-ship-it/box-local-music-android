            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.PriorityBlockingQueue;
            import java.util.concurrent.Semaphore;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class l0o10OoO0 extends l1i00il00li {
                public static final AtomicLong I00li1OI = new AtomicLong(Long.MIN_VALUE);
                public l0o01iiilI I00iiO;
                public l0o01iiilI I00iio;
                public PriorityBlockingQueue I00ilI0I1;
                public LinkedBlockingQueue I00ilO0;
                public l0liiiiOooo0 I00io1l;
                public l0liiiiOooo0 I00ioIO;
                public Object I00l0I0l0lO1;
                public Semaphore I00l0OO0IO;

                @Override
                public final void I010II() {
/* 7 */             if (Thread.currentThread() == this.I00iiO) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I001IO000("Call expected from worker thread");
                }

                @Override
                public final boolean I010OIo1l() {
/* 1 */             return false;
                }

                public final void I010ioo() {
/* 7 */             if (Thread.currentThread() == this.I00iio) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I001IO000("Call expected from network thread");
                }

                public final void I010l10O() {
/* 7 */             if (Thread.currentThread() != this.I00iiO) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I001IO000("Call not expected from worker thread");
                }

                public final boolean I010l1O() {
                    return Thread.currentThread() == this.I00iiO;
                }

                public final l0loIioo1Il I010l1ol111(Callable callable) {
/* 1 */             I010i10l();
/* 7 */             l0loIioo1Il l0loiioo1il = new l0loIioo1Il(this, callable, false);
/* 16 */            if (Thread.currentThread() != this.I00iiO) {
/* 46 */                I0110OiO(l0loiioo1il);
/* 77 */                return l0loiioo1il;
                    }
/* 24 */            if (!this.I00ilI0I1.isEmpty()) {
/* 30 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 32 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 39 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Callable skipped the worker queue.");
                    }
/* 42 */            l0loiioo1il.run();
/* 45 */            return l0loiioo1il;
                }

                public final l0loIioo1Il I010lI0oi(Callable callable) {
/* 1 */             I010i10l();
/* 7 */             l0loIioo1Il l0loiioo1il = new l0loIioo1Il(this, callable, true);
/* 16 */            if (Thread.currentThread() == this.I00iiO) {
/* 18 */                l0loiioo1il.run();
/* 21 */                return l0loiioo1il;
                    }
/* 22 */            I0110OiO(l0loiioo1il);
/* 29 */            return l0loiioo1il;
                }

                public final void I010o0o0oO(Runnable runnable) {
/* 1 */             I010i10l();
/* 4 */             lII0I0I000I.I000II(runnable);
/* 15 */            I0110OiO(new l0loIioo1Il(this, runnable, false, "Task exception on worker thread"));
                }

                public final Object I010oio1OO0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
                    synchronized (atomicReference) {
/* 8 */                 l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 10 */                l0olllO1i.I000II(l0o10ooo0);
/* 13 */                l0o10ooo0.I010o0o0oO(runnable);
                        try {
/* 16 */                    atomicReference.wait(j);
                        } catch (InterruptedException unused) {
/* 53 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 55 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 58 */                    IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00l0I0l0lO1;
/* 68 */                    StringBuilder sb = new StringBuilder(str.length() + 24);
/* 71 */                    sb.append("Interrupted waiting for ");
/* 74 */                    sb.append(str);
/* 81 */                    iOloiOI1.I00000oOI(sb.toString());
/* 85 */                    return null;
                        }
                    }
/* 20 */            Object obj = atomicReference.get();
/* 24 */            if (obj == null) {
/* 30 */                l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 32 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 43 */                l01o0io1ooo02.I00l0I0l0lO1.I00000oOI("Timed out waiting for ".concat(str));
                    }
/* 46 */            return obj;
                }

                public final void I01101IOlO(Runnable runnable) {
/* 1 */             I010i10l();
/* 12 */            I0110OiO(new l0loIioo1Il(this, runnable, true, "Task exception on worker thread"));
                }

                public final void I01101olii(Runnable runnable) {
/* 1 */             I010i10l();
/* 9 */             l0loIioo1Il l0loiioo1il = new l0loIioo1Il(this, runnable, false, "Task exception on network thread");
                    synchronized (this.I00l0I0l0lO1) {
                        try {
/* 15 */                    LinkedBlockingQueue linkedBlockingQueue = this.I00ilO0;
/* 17 */                    linkedBlockingQueue.add(l0loiioo1il);
/* 20 */                    l0o01iiilI l0o01iiili = this.I00iio;
/* 22 */                    if (l0o01iiili == null) {
/* 28 */                        l0o01iiilI l0o01iiili2 = new l0o01iiilI(this, "Measurement Network", linkedBlockingQueue);
/* 31 */                        this.I00iio = l0o01iiili2;
/* 35 */                        l0o01iiili2.setUncaughtExceptionHandler(this.I00ioIO);
/* 40 */                        this.I00iio.start();
                            } else {
/* 46 */                        Object obj = l0o01iiili.I00iOIl;
                                synchronized (obj) {
/* 49 */                            obj.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I0110OiO(l0loIioo1Il l0loiioo1il) {
                    synchronized (this.I00l0I0l0lO1) {
                        try {
/* 4 */                     PriorityBlockingQueue priorityBlockingQueue = this.I00ilI0I1;
/* 6 */                     priorityBlockingQueue.add(l0loiioo1il);
/* 9 */                     l0o01iiilI l0o01iiili = this.I00iiO;
/* 11 */                    if (l0o01iiili == null) {
/* 17 */                        l0o01iiilI l0o01iiili2 = new l0o01iiilI(this, "Measurement Worker", priorityBlockingQueue);
/* 20 */                        this.I00iiO = l0o01iiili2;
/* 24 */                        l0o01iiili2.setUncaughtExceptionHandler(this.I00io1l);
/* 29 */                        this.I00iiO.start();
                            } else {
/* 35 */                        Object obj = l0o01iiili.I00iOIl;
                                synchronized (obj) {
/* 38 */                            obj.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
