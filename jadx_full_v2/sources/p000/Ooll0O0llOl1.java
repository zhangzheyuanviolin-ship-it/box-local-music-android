            package p000;

            import java.util.concurrent.ThreadFactory;
            
            public final class Ooll0O0llOl1 implements ThreadFactory {
                public String I00000oIO;
                public boolean I00000oOI;

                @Override
                public final Thread newThread(Runnable runnable) {
/* 1 */             String str = this.I00000oIO;
/* 3 */             boolean z = this.I00000oOI;
/* 7 */             Thread thread = new Thread(runnable, str);
/* 10 */            thread.setDaemon(z);
/* 49 */            return thread;
                }
            }
