            package p000;

            import java.util.concurrent.ThreadFactory;
            
            public final class I10101lool implements ThreadFactory {
                public ThreadFactory I00000oIO;
                public String I00000oOI;
                public I1OollilIo I0000Il00O;

                @Override
                public final Thread newThread(Runnable runnable) {
/* 1 */             ThreadFactory threadFactory = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             I1OollilIo i1OollilIo = this.I0000Il00O;
/* 7 */             Thread threadNewThread = threadFactory.newThread(runnable);
/* 38 */            threadNewThread.setName(str + OlOoOIi0o.I00IO1(2, String.valueOf(I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo))));
/* 77 */            return threadNewThread;
                }
            }
