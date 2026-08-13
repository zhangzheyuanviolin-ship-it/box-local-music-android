            package p000;
            
            public final class ii0IIoiIllI extends iIOoOi1oli implements Runnable {
                public final Runnable I00ioIO;

                public ii0IIoiIllI(Runnable runnable) {
/* 4 */             runnable.getClass();
/* 7 */             this.I00ioIO = runnable;
                }

                @Override
                public final String I00000oIO() {
/* 11 */            return IlIi0I0.I000lI("task=[", this.I00ioIO.toString(), "]");
                }

                @Override
                public final void run() {
                    try {
/* 3 */                 this.I00ioIO.run();
                    } catch (Throwable th) {
/* 10 */                iIOlo0O iiolo0o = new iIOlo0O();
/* 13 */                iiolo0o.I00000oIO = th;
/* 22 */                if (iIOoOi1oli.I00ilO0.I0001Ioi1lo(this, null, iiolo0o)) {
/* 24 */                    iIOoOi1oli.I0000oI00(this);
                        }
/* 55 */                throw th;
                    }
                }
            }
