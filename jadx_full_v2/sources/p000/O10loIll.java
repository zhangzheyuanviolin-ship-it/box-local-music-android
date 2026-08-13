            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class O10loIll implements Runnable {
                public final int I00iOIl;
                public AtomicBoolean I00iiI;

                @Override
                public final void run() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             AtomicBoolean atomicBoolean = this.I00iiI;
                    switch (i) {
                        case 0:
/* 13 */                    atomicBoolean.set(true);
                            break;
                        default:
/* 9 */                     atomicBoolean.set(true);
                            break;
                    }
                }
            }
