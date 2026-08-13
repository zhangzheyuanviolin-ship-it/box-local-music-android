            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.locks.LockSupport;
            
            public final class lio1llilO extends liIIoo1oo implements RunnableFuture {
                public volatile ii1000i10O I00ioIO;

                public lio1llilO(Callable callable) {
/* 9 */             this.I00ioIO = new ii1000i10O(this, callable);
                }

                @Override
                public final void I0000O() {
                    ii1000i10O ii1000i10o;
/* 1 */             Object obj = this.I00iOIl;
/* 5 */             if ((obj instanceof li0olooIo) && ((li0olooIo) obj).I00000oIO && (ii1000i10o = this.I00ioIO) != null) {
/* 17 */                Iioo110oI iioo110oI = ii1000i10O.I00o101lO;
/* 19 */                Iioo110oI iioo110oI2 = ii1000i10O.I00o0l1o1o0;
/* 25 */                Runnable runnable = (Runnable) ii1000i10o.get();
/* 29 */                if (runnable instanceof Thread) {
/* 33 */                    liiI1iloloIO liii1iloloio = new liiI1iloloIO(ii1000i10o);
/* 40 */                    liii1iloloio.I00000oIO(Thread.currentThread());
/* 47 */                    if (ii1000i10o.compareAndSet(runnable, liii1iloloio)) {
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
                public final String I0000oI00() {
/* 1 */             ii1000i10O ii1000i10o = this.I00ioIO;
/* 3 */             if (ii1000i10o == null) {
/* 29 */                return super.I0000oI00();
                    }
/* 5 */             String string = ii1000i10o.toString();
/* 24 */            return IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 7), "task=[", string, "]");
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
