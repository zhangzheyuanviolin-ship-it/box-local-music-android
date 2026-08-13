            package p000;
            
            public final class lilOl1Ii extends li10Io11 implements Runnable {
                public final Runnable I00ioIO;

                public lilOl1Ii(Runnable runnable) {
/* 4 */             runnable.getClass();
/* 7 */             this.I00ioIO = runnable;
                }

                @Override
                public final String I0000oI00() {
/* 3 */             String string = this.I00ioIO.toString();
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 7), "task=[", string, "]");
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
