            package p000;

            import android.os.Process;
            import java.util.concurrent.BlockingQueue;
            
            public final class l0o01iiilI extends Thread {
                public final Object I00iOIl;
                public final BlockingQueue I00iiI;
                public boolean I00iiO = false;
                public final l0o10OoO0 I00iio;

                public l0o01iiilI(l0o10OoO0 l0o10ooo0, String str, BlockingQueue blockingQueue) {
/* 1 */             this.I00iio = l0o10ooo0;
/* 9 */             lII0I0I000I.I000II(blockingQueue);
/* 17 */            this.I00iOIl = new Object();
/* 19 */            this.I00iiI = blockingQueue;
/* 21 */            setName(str);
                }

                public final void I00000oIO() {
/* 1 */             l0o10OoO0 l0o10ooo0 = this.I00iio;
                    synchronized (l0o10ooo0.I00l0I0l0lO1) {
                        try {
/* 8 */                     if (!this.I00iiO) {
/* 12 */                        l0o10ooo0.I00l0OO0IO.release();
/* 17 */                        l0o10ooo0.I00l0I0l0lO1.notifyAll();
/* 23 */                        if (this == l0o10ooo0.I00iiO) {
/* 25 */                            l0o10ooo0.I00iiO = null;
                                } else if (this == l0o10ooo0.I00iio) {
/* 34 */                            l0o10ooo0.I00iio = null;
                                } else {
/* 41 */                            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) l0o10ooo0.I00iOIl).I00ilO0;
/* 43 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 50 */                            l01o0io1ooo0.I00ilO0.I00000oOI("Current scheduler thread is neither worker nor network");
                                }
/* 54 */                        this.I00iiO = true;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                @Override
                public final void run() throws InterruptedException {
/* 1 */             boolean z = false;
/* 3 */             while (!z) {
                        try {
/* 9 */                     this.I00iio.I00l0OO0IO.acquire();
/* 12 */                    z = true;
                        } catch (InterruptedException e) {
/* 21 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iio.I00iOIl).I00ilO0;
/* 23 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */                    l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O(String.valueOf(getName()).concat(" was interrupted"), e);
                        }
                    }
                    try {
/* 50 */                int threadPriority = Process.getThreadPriority(Process.myTid());
                        while (true) {
/* 54 */                    BlockingQueue blockingQueue = this.I00iiI;
/* 60 */                    l0loIioo1Il l0loiioo1il = (l0loIioo1Il) blockingQueue.poll();
/* 62 */                    if (l0loiioo1il != null) {
/* 72 */                        Process.setThreadPriority(true != l0loiioo1il.I00iiI ? 10 : threadPriority);
/* 75 */                        l0loiioo1il.run();
                            } else {
/* 81 */                        Object obj = this.I00iOIl;
                                synchronized (obj) {
/* 88 */                            if (blockingQueue.peek() == null) {
/* 92 */                                this.I00iio.getClass();
                                        try {
/* 97 */                                    obj.wait(30000L);
                                        } catch (InterruptedException e2) {
/* 110 */                                   l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) this.I00iio.I00iOIl).I00ilO0;
/* 112 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 131 */                                   l01o0io1ooo02.I00l0I0l0lO1.I0000Il00O(String.valueOf(getName()).concat(" was interrupted"), e2);
                                        }
                                    }
                                }
                                synchronized (this.I00iio.I00l0I0l0lO1) {
/* 146 */                           if (this.I00iiI.peek() == null) {
/* 148 */                               I00000oIO();
/* 152 */                               I00000oIO();
/* 155 */                               return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 164 */               I00000oIO();
/* 245 */               throw th;
                    }
                }
            }
