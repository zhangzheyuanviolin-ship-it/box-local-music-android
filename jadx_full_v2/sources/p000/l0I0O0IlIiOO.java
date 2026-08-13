            package p000;
            
            public final class l0I0O0IlIiOO extends ioOliooOolI1 implements Runnable {
                public final Runnable I00ioIO;

                public l0I0O0IlIiOO(Runnable runnable) {
/* 4 */             runnable.getClass();
/* 7 */             this.I00ioIO = runnable;
                }

                @Override
                public final String I0000O() {
/* 11 */            return IlIi0I0.I000lI("task=[", this.I00ioIO.toString(), "]");
                }

                @Override
                public final void run() {
                    try {
/* 3 */                 this.I00ioIO.run();
                    } catch (Throwable th) {
/* 8 */                 I000OOo1O(th);
/* 20 */                throw th;
                    }
                }
            }
