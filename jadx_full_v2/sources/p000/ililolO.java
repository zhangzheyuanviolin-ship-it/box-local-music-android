            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ThreadFactory;
            
            public final class ililolO implements ThreadFactory {
                public final int I00000oIO;
                public ThreadFactory I00000oOI;

                @Override
                public final Thread newThread(Runnable runnable) {
                    switch (this.I00000oIO) {
                        case 0:
/* 26 */                    Thread threadNewThread = this.I00000oOI.newThread(runnable);
/* 32 */                    threadNewThread.setName("ScionFrontendApi");
/* 35 */                    return threadNewThread;
                        default:
/* 9 */                     OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(6);
/* 12 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 14 */                    VarHandle.storeStoreFence();
/* 19 */                    return this.I00000oOI.newThread(oiIi1OlOOI11);
                    }
                }
            }
