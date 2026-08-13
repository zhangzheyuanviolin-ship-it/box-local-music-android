            package p000;

            import java.util.concurrent.locks.AbstractOwnableSynchronizer;
            
/* 27 */    public final class Iooo0io0iI extends AbstractOwnableSynchronizer implements Runnable {
                public final Iooo1i1iili I00iOIl;

                public Iooo0io0iI(Iooo1i1iili iooo1i1iili) {
/* 4 */             this.I00iOIl = iooo1i1iili;
                }

                public final void I00000oIO(Thread thread) {
/* 1 */             setExclusiveOwnerThread(thread);
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
/* 28 */        public final void run() {
                }
            }
