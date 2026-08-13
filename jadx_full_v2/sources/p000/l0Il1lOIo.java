            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.locks.LockSupport;
            
            public final class l0Il1lOIo extends iolIIiIlOo implements RunnableFuture {
                public volatile ii1000i10O I00ioIO;

                public l0Il1lOIo(Callable callable) {
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
/* 5 */             if ((obj instanceof ioO0o00) && ((ioO0o00) obj).I00000oIO && (ii1000i10o = this.I00ioIO) != null) {
/* 17 */                Iioo110oI iioo110oI = ii1000i10O.I00l0I0l0lO1;
/* 19 */                Iioo110oI iioo110oI2 = ii1000i10O.I00ioIO;
/* 25 */                Runnable runnable = (Runnable) ii1000i10o.get();
/* 29 */                if (runnable instanceof Thread) {
/* 33 */                    l00OiI l00oii = new l00OiI(ii1000i10o);
/* 1 */                     l00oii.setExclusiveOwnerThread(Thread.currentThread());
/* 47 */                    if (ii1000i10o.compareAndSet(runnable, l00oii)) {
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
