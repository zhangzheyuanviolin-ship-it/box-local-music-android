            package p000;
            
            public final class OI011io10o0O extends I0110o implements Runnable {
                public final Runnable I00ioIO;

                public OI011io10o0O(Runnable runnable) {
/* 4 */             runnable.getClass();
/* 7 */             this.I00ioIO = runnable;
                }

                @Override
                public final String I000iOII() {
/* 18 */            return "task=[" + this.I00ioIO + "]";
                }

                @Override
                public final void run() {
                    try {
/* 3 */                 this.I00ioIO.run();
                    } catch (Throwable th) {
/* 8 */                 I000lI(th);
/* 29 */                throw th;
                    }
                }
            }
