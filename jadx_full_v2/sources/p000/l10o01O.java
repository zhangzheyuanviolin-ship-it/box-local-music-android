            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.locks.LockSupport;
            
            public final class l10o01O extends l0OiIioI1I0 implements RunnableFuture {
                public volatile ii1000i10O I00ioIO;

                public l10o01O(Callable callable) {
/* 9 */             this.I00ioIO = new ii1000i10O(this, callable);
                }

                @Override
                public final String I0000O() {
/* 1 */             ii1000i10O ii1000i10o = this.I00ioIO;
                    return ii1000i10o != null ? IlIi0I0.I000lI("task=[", ii1000i10o.toString(), "]") : super.I0000O();
                }

                @Override
                public final void I0000oI00() {
                    ii1000i10O ii1000i10o;
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if ((obj instanceof l01OOll0II1) && ((l01OOll0II1) obj).I00000oIO && (ii1000i10o = this.I00ioIO) != null) {
/* 17 */                Iioo110oI iioo110oI = ii1000i10O.I00o0iI0io1;
/* 19 */                Iioo110oI iioo110oI2 = ii1000i10O.I00lll10;
/* 25 */                Runnable runnable = (Runnable) ii1000i10o.get();
/* 29 */                if (runnable instanceof Thread) {
/* 33 */                    l0lIl10Io1O l0lil10io1o = new l0lIl10Io1O(ii1000i10o);
/* 1 */                     l0lil10io1o.setExclusiveOwnerThread(Thread.currentThread());
/* 47 */                    if (ii1000i10o.compareAndSet(runnable, l0lil10io1o)) {
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
