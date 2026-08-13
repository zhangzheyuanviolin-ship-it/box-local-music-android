            package p000;

            import java.util.concurrent.ThreadFactory;
            
            public final class IOlOII implements ThreadFactory {
                public String I00000oIO;

                @Override
                public final Thread newThread(Runnable runnable) {
/* 5 */             Thread thread = new Thread(runnable, this.I00000oIO);
/* 10 */            thread.setPriority(10);
/* 29 */            return thread;
                }
            }
