            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.locks.LockSupport;
            
            public final class ii110O0 extends iIOoOi1oli implements RunnableFuture {
                public volatile ii1000i10O I00ioIO;

                public ii110O0(Callable callable) {
/* 9 */             this.I00ioIO = new ii1000i10O(this, callable);
                }

                @Override
                public final String I00000oIO() {
/* 1 */             ii1000i10O ii1000i10o = this.I00ioIO;
                    return ii1000i10o != null ? IlIi0I0.I000lI("task=[", ii1000i10o.toString(), "]") : super.I00000oIO();
                }

                @Override
                public final void I00000oOI() {
                    ii1000i10O ii1000i10o;
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if ((obj instanceof iIOlili1) && ((iIOlili1) obj).I00000oIO && (ii1000i10o = this.I00ioIO) != null) {
/* 17 */                Iioo110oI iioo110oI = ii1000i10O.I00ilI0I1;
/* 19 */                Iioo110oI iioo110oI2 = ii1000i10O.I00iio;
/* 25 */                Runnable runnable = (Runnable) ii1000i10o.get();
/* 29 */                if (runnable instanceof Thread) {
/* 33 */                    iOl1oI0o iol1oi0o = new iOl1oI0o(ii1000i10o);
/* 1 */                     iol1oi0o.setExclusiveOwnerThread(Thread.currentThread());
/* 47 */                    if (ii1000i10o.compareAndSet(runnable, iol1oi0o)) {
                                try {
/* 50 */                            Thread thread = (Thread) runnable;
/* 52 */                            thread.interrupt();
/* 61 */                            if (((Runnable) ii1000i10o.getAndSet(iioo110oI2)) == iioo110oI) {
/* 63 */                                LockSupport.unpark(thread);
                                    }
                                } catch (Throwable th) {
/* 74 */                            if (((Runnable) ii1000i10o.getAndSet(iioo110oI2)) == iioo110oI) {
/* 79 */                                LockSupport.unpark((Thread) runnable);
                                    }
/* 82 */                            throw th;
                                }
                            }
                        }
                    }
/* 84 */            this.I00ioIO = null;
                }

                @Override
                public final void run() {
/* 1 */             ii1000i10O ii1000i10o = this.I00ioIO;
/* 3 */             if (ii1000i10o != null) {
/* 5 */                 ii1000i10o.run();
                    }
/* 9 */             this.I00ioIO = null;
                }
            }
