            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class I1Ool1IoO110 {
                public static final AtomicIntegerFieldUpdater I00000oOI = AtomicIntegerFieldUpdater.newUpdater(I1Ool1IoO110.class, "I00000oIO");
                public volatile int I00000oIO;

                public final boolean I00000oIO() {
/* 5 */             return I00000oOI.compareAndSet(this, 0, 1);
                }

                public final boolean I00000oOI() {
                    return this.I00000oIO != 0;
                }

                public final String toString() {
/* 5 */             return String.valueOf(I00000oOI());
                }
            }
