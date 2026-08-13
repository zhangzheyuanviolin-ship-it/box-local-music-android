            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.LockSupport;
            
            public abstract class Iooo1i1iili extends AtomicReference implements Runnable {
                public static final Iioo110oI I00iOIl;
                public static final Iioo110oI I00iiI;

                static {
/* 3 */             int i = 1;
/* 7 */             I00iOIl = new Iioo110oI(i);
/* 14 */            I00iiI = new Iioo110oI(i);
                }

                public abstract void I00000oIO(Throwable th);

                public abstract void I00000oOI(Object obj);

                public final void I0000Il00O() {
/* 1 */             Iioo110oI iioo110oI = I00iiI;
/* 3 */             Iioo110oI iioo110oI2 = I00iOIl;
/* 9 */             Runnable runnable = (Runnable) get();
/* 13 */            if (runnable instanceof Thread) {
/* 17 */                Iooo0io0iI iooo0io0iI = new Iooo0io0iI(this);
/* 24 */                iooo0io0iI.I00000oIO(Thread.currentThread());
/* 31 */                if (compareAndSet(runnable, iooo0io0iI)) {
                            try {
/* 36 */                        ((Thread) runnable).interrupt();
                            } finally {
/* 60 */                        if (((Runnable) getAndSet(iioo110oI2)) == iioo110oI) {
/* 64 */                            LockSupport.unpark((Thread) runnable);
                                }
                            }
                        }
                    }
                }

                public abstract boolean I0000O();

                public abstract Object I0000oI00();

                public abstract String I0001Ioi1lo();

                public final void I000II(Thread thread) {
/* 5 */             Runnable runnable = (Runnable) get();
/* 8 */             Iooo0io0iI iooo0io0iI = null;
/* 9 */             boolean z = false;
/* 10 */            int i = 0;
                    while (true) {
/* 11 */                boolean z2 = runnable instanceof Iooo0io0iI;
/* 13 */                Iioo110oI iioo110oI = I00iiI;
/* 15 */                if (!z2 && runnable != iioo110oI) {
                            break;
                        }
/* 26 */                if (z2) {
/* 29 */                    iooo0io0iI = (Iooo0io0iI) runnable;
                        }
/* 32 */                i++;
/* 35 */                if (i <= 1000) {
/* 61 */                    Thread.yield();
                        } else if (runnable == iioo110oI || compareAndSet(runnable, iioo110oI)) {
/* 56 */                    z = Thread.interrupted() || z;
/* 57 */                    LockSupport.park(iooo0io0iI);
                        }
/* 68 */                runnable = (Runnable) get();
                    }
/* 20 */            if (z) {
/* 22 */                thread.interrupt();
                    }
                }

                @Override
                public final void run() {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 5 */             Object objI0000oI00 = null;
/* 10 */            if (compareAndSet(null, threadCurrentThread)) {
/* 13 */                boolean zI0000O = I0000O();
/* 17 */                Iioo110oI iioo110oI = I00iOIl;
/* 19 */                if (!zI0000O) {
                            try {
/* 21 */                        objI0000oI00 = I0000oI00();
                            } catch (Throwable th) {
                                try {
/* 29 */                            if (th instanceof InterruptedException) {
/* 35 */                                Thread.currentThread().interrupt();
                                    }
/* 42 */                            if (!compareAndSet(threadCurrentThread, iioo110oI)) {
/* 44 */                                I000II(threadCurrentThread);
                                    }
/* 47 */                            if (zI0000O) {
/* 113 */                               return;
                                    }
/* 49 */                            I00000oIO(th);
/* 113 */                           return;
                                } finally {
/* 58 */                            if (!compareAndSet(threadCurrentThread, iioo110oI)) {
/* 60 */                                I000II(threadCurrentThread);
                                    }
/* 63 */                            if (!zI0000O) {
/* 65 */                                I00000oOI(null);
                                    }
                                }
                            }
                        }
                    }
                }

                @Override
                public final String toString() {
                    String str;
/* 5 */             Runnable runnable = (Runnable) get();
/* 9 */             if (runnable == I00iOIl) {
/* 11 */                str = "running=[DONE]";
                    } else if (runnable instanceof Iooo0io0iI) {
/* 18 */                str = "running=[INTERRUPTED]";
                    } else if (runnable instanceof Thread) {
/* 46 */                str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                    } else {
/* 51 */                str = "running=[NOT STARTED YET]";
                    }
/* 70 */            return str + ", " + I0001Ioi1lo();
                }
            }
