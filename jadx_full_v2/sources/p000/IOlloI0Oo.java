            package p000;

            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class IOlloI0Oo implements ThreadFactory {
                public AtomicInteger I00000oIO;
                public boolean I00000oOI;

                @Override
                public final Thread newThread(Runnable runnable) {
/* 30 */            return new Thread(runnable, (this.I00000oOI ? "WM.task-" : "androidx.work-") + this.I00000oIO.incrementAndGet());
                }
            }
