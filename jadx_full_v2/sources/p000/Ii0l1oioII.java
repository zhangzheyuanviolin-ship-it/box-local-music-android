            package p000;

            import android.os.StrictMode;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class Ii0l1oioII implements ThreadFactory {
                public static final ThreadFactory I0000oI00 = Executors.defaultThreadFactory();
                public final AtomicLong I00000oIO = new AtomicLong();
                public final String I00000oOI;
                public final int I0000Il00O;
                public final StrictMode.ThreadPolicy I0000O;

                public Ii0l1oioII(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
/* 11 */            this.I00000oOI = str;
/* 13 */            this.I0000Il00O = i;
/* 15 */            this.I0000O = threadPolicy;
                }

                @Override
                public final Thread newThread(Runnable runnable) {
/* 5 */             I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(22);
/* 8 */             i0iOo0oioiO.I00iiI = this;
/* 10 */            i0iOo0oioiO.I00iiO = runnable;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            Thread threadNewThread = I0000oI00.newThread(i0iOo0oioiO);
/* 21 */            Locale locale = Locale.ROOT;
/* 48 */            threadNewThread.setName(this.I00000oOI + " Thread #" + this.I00000oIO.getAndIncrement());
/* 77 */            return threadNewThread;
                }
            }
