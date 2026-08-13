            package p000;

            import java.util.concurrent.Future;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.locks.LockSupport;
            
            public final class io0Oi10oi extends iliIlI0o00ii implements RunnableFuture, Future {
                public volatile ii1000i10O I00ioIO;

                @Override
                public final String I00000oIO() {
/* 1 */             ii1000i10O ii1000i10o = this.I00ioIO;
                    return ii1000i10o != null ? IlIi0I0.I000lI("task=[", ii1000i10o.toString(), "]") : super.I00000oIO();
                }

                @Override
                public final void I00000oOI() {
                    ii1000i10O ii1000i10o;
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if ((obj instanceof ili10OI0) && ((ili10OI0) obj).I00000oIO && (ii1000i10o = this.I00ioIO) != null) {
/* 17 */                Iioo110oI iioo110oI = ii1000i10O.I00io1l;
/* 19 */                Iioo110oI iioo110oI2 = ii1000i10O.I00ilO0;
/* 25 */                Runnable runnable = (Runnable) ii1000i10o.get();
/* 29 */                if (runnable instanceof Thread) {
/* 33 */                    iloOl0 ilool0 = new iloOl0(ii1000i10o);
/* 1 */                     ilool0.setExclusiveOwnerThread(Thread.currentThread());
/* 47 */                    if (ii1000i10o.compareAndSet(runnable, ilool0)) {
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
