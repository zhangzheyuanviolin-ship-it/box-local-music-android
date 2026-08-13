            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class I1OollilIo {
                public static final AtomicIntegerFieldUpdater I00000oOI = AtomicIntegerFieldUpdater.newUpdater(I1OollilIo.class, "I00000oIO");
                public volatile int I00000oIO;

                public final int I00000oIO() {
/* 3 */             return I00000oOI.decrementAndGet(this);
                }

                public final String toString() {
/* 3 */             return String.valueOf(this.I00000oIO);
                }
            }
