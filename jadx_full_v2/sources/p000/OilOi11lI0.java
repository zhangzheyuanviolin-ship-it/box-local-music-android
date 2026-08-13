            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.logging.Logger;
            
            public final class OilOi11lI0 implements Executor {
                public static final Logger I00ilO0 = Logger.getLogger(OilOi11lI0.class.getName());
                public Executor I00iOIl;
                public ArrayDeque I00iiI;
                public int I00iiO;
                public long I00iio;
                public iooili01 I00ilI0I1;

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             lII0I0I000I.I000II(runnable);
                    synchronized (this.I00iiI) {
/* 7 */                 int i = this.I00iiO;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.I00iio;
/* 21 */                    OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(2);
/* 24 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 26 */                    VarHandle.storeStoreFence();
/* 31 */                    this.I00iiI.add(oiIi1OlOOI11);
/* 34 */                    this.I00iiO = 2;
                            try {
/* 41 */                        this.I00iOIl.execute(this.I00ilI0I1);
/* 46 */                        if (this.I00iiO != 2) {
/* 99 */                            return;
                                }
                                synchronized (this.I00iiI) {
                                    try {
/* 56 */                                if (this.I00iio == j && this.I00iiO == 2) {
/* 62 */                                    this.I00iiO = 3;
                                        }
                                    } finally {
                                    }
                                }
/* 68 */                        return;
                            } catch (Error | RuntimeException e) {
                                synchronized (this.I00iiI) {
                                    try {
/* 75 */                                int i2 = this.I00iiO;
/* 77 */                                boolean z = true;
/* 78 */                                if ((i2 != 1 && i2 != 2) || !this.I00iiI.removeLastOccurrence(oiIi1OlOOI11)) {
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
/* 109 */               this.I00iiI.add(runnable);
                    }
                }

                public final String toString() {
/* 30 */            return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.I00iOIl + "}";
                }
            }
