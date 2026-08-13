            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class OilOiO10IO implements Executor {
                public ArrayDeque I00iOIl;
                public Executor I00iiI;
                public I0lil01 I00iiO;
                public int I00iio;
                public long I00ilI0I1;

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
                    synchronized (this.I00iOIl) {
/* 7 */                 int i = this.I00iio;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.I00ilI0I1;
/* 20 */                    OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(3);
/* 23 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 25 */                    VarHandle.storeStoreFence();
/* 30 */                    this.I00iOIl.add(oiIi1OlOOI11);
/* 34 */                    this.I00iio = 2;
                            try {
/* 41 */                        this.I00iiI.execute(this.I00iiO);
/* 46 */                        if (this.I00iio != 2) {
/* 99 */                            return;
                                }
                                synchronized (this.I00iOIl) {
                                    try {
/* 56 */                                if (this.I00ilI0I1 == j && this.I00iio == 2) {
/* 62 */                                    this.I00iio = 3;
                                        }
                                    } finally {
                                    }
                                }
/* 68 */                        return;
                            } catch (Error | RuntimeException e) {
                                synchronized (this.I00iOIl) {
                                    try {
/* 75 */                                int i2 = this.I00iio;
/* 77 */                                boolean z = true;
/* 78 */                                if ((i2 != 1 && i2 != 2) || !this.I00iOIl.removeLastOccurrence(oiIi1OlOOI11)) {
/* 91 */                                    z = false;
                                        }
/* 94 */                                if (!(e instanceof RejectedExecutionException) || z) {
/* 102 */                                   throw e;
                                        }
/* 99 */                                return;
                                    } finally {
                                    }
                                }
                            }
                        }
/* 109 */               this.I00iOIl.add(runnable);
                    }
                }
            }
