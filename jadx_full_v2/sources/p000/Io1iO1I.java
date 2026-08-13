            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ThreadFactory;
            
            public final class Io1iO1I implements ThreadFactory {
                public static final Io1iO1I I00000oOI = new Io1iO1I(4);
                public final int I00000oIO;

                public Io1iO1I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Thread newThread(Runnable runnable) {
                    switch (this.I00000oIO) {
                        case 0:
/* 49 */                    Thread thread = new Thread(runnable);
/* 52 */                    thread.setPriority(10);
/* 57 */                    thread.setName("CameraX-camerax_high_priority");
/* 60 */                    return thread;
                        case 1:
/* 38 */                    Oi01ollI oi01ollI = new Oi01ollI(runnable, "fonts-androidx");
/* 41 */                    oi01ollI.I00iOIl = 10;
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    return oi01ollI;
                        case 2:
/* 30 */                    return new Thread(runnable, "UpdateListenerExecutor");
                        case 3:
/* 22 */                    return new Thread(runnable, "AssetPackBackgroundExecutor");
                        default:
/* 8 */                     Object obj = lIlIo1.I000OiO;
/* 14 */                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                    }
                }
            }
