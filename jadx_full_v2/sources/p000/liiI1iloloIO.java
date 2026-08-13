            package p000;

            import java.util.concurrent.locks.AbstractOwnableSynchronizer;
            
/* 18 */    public final class liiI1iloloIO extends AbstractOwnableSynchronizer implements Runnable {
                public final ii1000i10O I00iOIl;

                public liiI1iloloIO(ii1000i10O ii1000i10o) {
/* 4 */             this.I00iOIl = ii1000i10o;
                }

                public final void I00000oIO(Thread thread) {
/* 1 */             setExclusiveOwnerThread(thread);
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
/* 19 */        public final void run() {
                }
            }
