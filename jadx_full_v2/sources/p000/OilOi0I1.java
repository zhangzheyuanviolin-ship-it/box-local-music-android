            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class OilOi0I1 implements Executor {
                public static final O0o0ill01o0 I00ilO0 = new O0o0ill01o0(0, OilOi0I1.class);
                public Executor I00iOIl;
                public ArrayDeque I00iiI;
                public int I00iiO;
                public long I00iio;
                public iooiio1i0 I00ilI0I1;

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
                    synchronized (this.I00iiI) {
/* 7 */                 int i = this.I00iiO;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.I00iio;
/* 20 */                    boolean z = true;
/* 21 */                    OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(1);
/* 24 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 26 */                    VarHandle.storeStoreFence();
/* 31 */                    this.I00iiI.add(oiIi1OlOOI11);
/* 35 */                    this.I00iiO = 2;
                            try {
/* 42 */                        this.I00iOIl.execute(this.I00ilI0I1);
/* 47 */                        if (this.I00iiO != 2) {
/* 99 */                            return;
                                }
                                synchronized (this.I00iiI) {
                                    try {
/* 57 */                                if (this.I00iio == j && this.I00iiO == 2) {
/* 63 */                                    this.I00iiO = 3;
                                        }
                                    } finally {
                                    }
                                }
/* 69 */                        return;
                            } catch (Throwable th) {
                                synchronized (this.I00iiI) {
                                    try {
/* 76 */                                int i2 = this.I00iiO;
/* 78 */                                if ((i2 != 1 && i2 != 2) || !this.I00iiI.removeLastOccurrence(oiIi1OlOOI11)) {
/* 91 */                                    z = false;
                                        }
/* 94 */                                if (!(th instanceof RejectedExecutionException) || z) {
/* 102 */                                   throw th;
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
