            package p000;

            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Il11olIIio1i extends AtomicReference implements Executor, Runnable {
                public static final int I00ilI0I1 = 0;
                public IoloOio0I I00iOIl;
                public Executor I00iiI;
                public Runnable I00iiO;
                public Thread I00iio;

                @Override
                public final void execute(Runnable runnable) {
/* 8 */             if (get() == Il11o0l.I00iiI) {
/* 10 */                this.I00iiI = null;
/* 12 */                this.I00iOIl = null;
/* 14 */                return;
                    }
/* 19 */            this.I00iio = Thread.currentThread();
                    try {
/* 21 */                IoloOio0I ioloOio0I = this.I00iOIl;
/* 23 */                Objects.requireNonNull(ioloOio0I);
/* 28 */                IOO000ilo iOO000ilo = (IOO000ilo) ioloOio0I.I00iiO;
/* 36 */                if (((Thread) iOO000ilo.I00iiI) == this.I00iio) {
/* 38 */                    this.I00iOIl = null;
/* 44 */                    if (((Runnable) iOO000ilo.I00iiO) != null) {
/* 65 */                        throw new IllegalStateException();
                            }
/* 46 */                    iOO000ilo.I00iiO = runnable;
/* 48 */                    Executor executor = this.I00iiI;
/* 50 */                    Objects.requireNonNull(executor);
/* 53 */                    iOO000ilo.I00iio = executor;
/* 55 */                    this.I00iiI = null;
                        } else {
/* 66 */                    Executor executor2 = this.I00iiI;
/* 68 */                    Objects.requireNonNull(executor2);
/* 71 */                    this.I00iiI = null;
/* 73 */                    this.I00iiO = runnable;
/* 75 */                    executor2.execute(this);
                        }
/* 78 */                this.I00iio = null;
                    } catch (Throwable th) {
/* 81 */                this.I00iio = null;
/* 168 */               throw th;
                    }
                }

                @Override
                public final void run() {
                    Executor executor;
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 8 */             if (threadCurrentThread != this.I00iio) {
/* 10 */                Runnable runnable = this.I00iiO;
/* 12 */                Objects.requireNonNull(runnable);
/* 17 */                this.I00iiO = null;
/* 19 */                runnable.run();
/* 22 */                return;
                    }
/* 27 */            IOO000ilo iOO000ilo = new IOO000ilo(14);
/* 30 */            iOO000ilo.I00iiI = threadCurrentThread;
/* 32 */            IoloOio0I ioloOio0I = this.I00iOIl;
/* 34 */            Objects.requireNonNull(ioloOio0I);
/* 37 */            ioloOio0I.I00iiO = iOO000ilo;
/* 39 */            this.I00iOIl = null;
                    try {
/* 41 */                Runnable runnable2 = this.I00iiO;
/* 43 */                Objects.requireNonNull(runnable2);
/* 48 */                this.I00iiO = null;
/* 50 */                runnable2.run();
                        while (true) {
/* 55 */                    Runnable runnable3 = (Runnable) iOO000ilo.I00iiO;
/* 57 */                    if (runnable3 == null || (executor = (Executor) iOO000ilo.I00iio) == null) {
                                break;
                            }
/* 65 */                    iOO000ilo.I00iiO = null;
/* 67 */                    iOO000ilo.I00iio = null;
/* 69 */                    executor.execute(runnable3);
                        }
                    } finally {
/* 78 */                iOO000ilo.I00iiI = null;
                    }
                }
            }
