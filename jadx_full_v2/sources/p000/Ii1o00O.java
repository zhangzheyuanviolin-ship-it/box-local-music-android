            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.locks.LockSupport;
            import sun.misc.Unsafe;
            
            public final class Ii1o00O extends Il10o00 implements Runnable {
                public static final Ii1o00O I00l0I0l0lO1;
                public static final long I00l0OO0IO;
                private static volatile Thread _thread;
                private static volatile int debugStatus;

                static {
                    Long l;
/* 3 */             Ii1o00O ii1o00O = new Ii1o00O();
/* 6 */             I00l0I0l0lO1 = ii1o00O;
/* 9 */             ii1o00O.I010II(false);
                    try {
/* 16 */                l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
                    } catch (SecurityException unused) {
/* 21 */                l = 1000L;
                    }
/* 35 */            I00l0OO0IO = TimeUnit.MILLISECONDS.toNanos(l.longValue());
                }

                @Override
                public final IiiOlIiio I00000oIO(long j, Runnable runnable, Ii00l101O ii00l101O) {
/* 26 */            long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
/* 34 */            if (j2 >= 4611686018427387903L) {
/* 55 */                return OIIo00iiOi.I00iOIl;
                    }
/* 36 */            long jNanoTime = System.nanoTime();
/* 43 */            Il10lI00iO il10lI00iO = new Il10lI00iO(j2 + jNanoTime);
/* 46 */            il10lI00iO.I00iiO = runnable;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            I010l10O(jNanoTime, il10lI00iO);
/* 54 */            return il10lI00iO;
                }

                @Override
                public final void I0100i(Runnable runnable) {
/* 4 */             if (debugStatus == 4) {
/* 49 */                throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
                    }
/* 6 */             super.I0100i(runnable);
                }

                @Override
                public final Thread I010I0() {
                    Thread thread;
/* 1 */             Thread thread2 = _thread;
/* 3 */             if (thread2 != null) {
/* 113 */               return thread2;
                    }
                    synchronized (this) {
/* 6 */                 thread = _thread;
/* 8 */                 if (thread == null) {
/* 14 */                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
/* 17 */                    _thread = thread;
/* 25 */                    thread.setContextClassLoader(Ii1o00O.class.getClassLoader());
/* 29 */                    thread.setDaemon(true);
/* 32 */                    thread.start();
                        }
                    }
/* 39 */            return thread;
                }

                @Override
                public final void I010ioo(long j, Il10lO il10lO) {
/* 89 */            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
                }

                public final synchronized void I010l1O() {
/* 2 */             int i = debugStatus;
/* 14 */            if (i == 2 || i == 3) {
/* 18 */                debugStatus = 3;
/* 20 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 25 */                unsafe.putObjectVolatile(this, Il10o00.I00io1l, (Object) null);
/* 30 */                unsafe.putObjectVolatile(this, Il10o00.I00ilI0I1, (Object) null);
/* 33 */                notifyAll();
                    }
                }

                @Override
                public final void run() {
                    boolean zI010OIo1l;
/* 5 */             Oo100i0OO.I00000oIO.set(this);
                    try {
                        synchronized (this) {
/* 10 */                    int i = debugStatus;
/* 24 */                    if (i == 2 || i == 3) {
/* 36 */                        if (zI010OIo1l) {
/* 139 */                           return;
                                } else {
/* 41 */                            return;
                                }
                            }
/* 42 */                    debugStatus = 1;
/* 44 */                    notifyAll();
/* 53 */                    long j = Long.MAX_VALUE;
                            while (true) {
/* 54 */                        Thread.interrupted();
/* 57 */                        long jI010i10l = I010i10l();
/* 65 */                        if (jI010i10l == Long.MAX_VALUE) {
/* 67 */                            long jNanoTime = System.nanoTime();
/* 73 */                            if (j == Long.MAX_VALUE) {
/* 77 */                                j = I00l0OO0IO + jNanoTime;
                                    }
/* 81 */                            long j2 = j - jNanoTime;
/* 85 */                            if (j2 <= 0) {
/* 87 */                                _thread = null;
/* 89 */                                I010l1O();
/* 96 */                                if (I010OIo1l()) {
/* 139 */                                   return;
                                        }
/* 98 */                                I010I0();
/* 101 */                               return;
                                    }
/* 104 */                           if (jI010i10l > j2) {
/* 106 */                               jI010i10l = j2;
                                    }
                                } else {
/* 108 */                           j = Long.MAX_VALUE;
                                }
/* 111 */                       if (jI010i10l > 0) {
/* 113 */                           int i2 = debugStatus;
/* 123 */                           if (i2 == 2 || i2 == 3) {
/* 125 */                               _thread = null;
/* 127 */                               I010l1O();
/* 134 */                               if (I010OIo1l()) {
/* 139 */                                   return;
                                        }
/* 136 */                               I010I0();
/* 139 */                               return;
                                    }
/* 140 */                           LockSupport.parkNanos(this, jI010i10l);
                                }
                            }
                        }
                    } finally {
/* 147 */               _thread = null;
/* 149 */               I010l1O();
/* 156 */               if (!I010OIo1l()) {
/* 158 */                   I010I0();
                        }
                    }
                }

                @Override
                public final void shutdown() {
/* 2 */             debugStatus = 4;
/* 4 */             super.shutdown();
                }

                @Override
                public final String toString() {
/* 1 */             return "DefaultExecutor";
                }
            }
