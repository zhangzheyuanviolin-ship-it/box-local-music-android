            package p000;

            import android.os.Process;
            import java.util.concurrent.locks.ReentrantLock;
            
/* 6 */     public final class I1OoI100 extends Thread {
                public final int I00iOIl = 0;

                public I1OoI100(String str) {
/* 4 */             super(str);
                }

                @Override
                public final void run() throws SecurityException, IllegalArgumentException {
                    ReentrantLock reentrantLock;
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        default:
/* 8 */                     Process.setThreadPriority(19);
                            synchronized (this) {
                                while (true) {
                                    try {
/* 12 */                                wait();
                                    } catch (InterruptedException unused) {
/* 19 */                                return;
                                    }
                                }
                            }
                    }
                    while (true) {
                        try {
/* 22 */                    reentrantLock = I1Ool00ioI.I000OiO;
/* 24 */                    reentrantLock.lock();
                        } catch (InterruptedException unused2) {
                        }
                        try {
/* 27 */                    I1Ool00ioI i1Ool00ioII00000oIO = iOOOI0OI.I00000oIO();
/* 33 */                    if (i1Ool00ioII00000oIO == I1Ool00ioI.I000OOo1O) {
/* 36 */                        I1Ool00ioI.I000OOo1O = null;
/* 38 */                        reentrantLock.unlock();
/* 41 */                        return;
                            } else {
/* 44 */                        reentrantLock.unlock();
/* 47 */                        if (i1Ool00ioII00000oIO != null) {
/* 49 */                            i1Ool00ioII00000oIO.I000OiO();
                                }
                            }
                        } catch (Throwable th) {
/* 53 */                    reentrantLock.unlock();
/* 56 */                    throw th;
                        }
                    }
                }

/* 7 */         public I1OoI100(ThreadGroup threadGroup, String str) {
                    super(threadGroup, str);
                }
            }
