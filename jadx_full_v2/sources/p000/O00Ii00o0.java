            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class O00Ii00o0 implements Executor {
                public static volatile O00Ii00o0 I00iiO;
                public final int I00iOIl;
                public ExecutorService I00iiI;

                public O00Ii00o0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static Executor I00000oIO() {
/* 3 */             if (I00iiO != null) {
/* 5 */                 return I00iiO;
                    }
                    synchronized (O00Ii00o0.class) {
                        try {
/* 13 */                    if (I00iiO == null) {
/* 18 */                        O00Ii00o0 o00Ii00o0 = new O00Ii00o0(0);
/* 24 */                        IIlOo10 iIlOo10 = new IIlOo10(2);
/* 32 */                        iIlOo10.I00000oOI = new AtomicInteger(0);
/* 34 */                        VarHandle.storeStoreFence();
/* 41 */                        o00Ii00o0.I00iiI = Executors.newFixedThreadPool(2, iIlOo10);
/* 43 */                        VarHandle.storeStoreFence();
/* 46 */                        I00iiO = o00Ii00o0;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 52 */            return I00iiO;
                }

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    this.I00iiI.execute(runnable);
                            break;
                        default:
/* 6 */                     ExecutorService executorService = this.I00iiI;
/* 11 */                    OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(0);
/* 14 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 16 */                    VarHandle.storeStoreFence();
/* 19 */                    executorService.execute(oiIi1OlOOI11);
                            break;
                    }
                }
            }
