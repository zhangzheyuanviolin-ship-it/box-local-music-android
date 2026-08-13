            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            
            public final class OilOol implements Executor {
                public final int I00iOIl;
                public Executor I00iiI;
                public ArrayDeque I00iiO;
                public Runnable I00iio;
                public Object I00ilI0I1;

                public OilOol(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public final void I00000oIO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 40 */                    Runnable runnable = (Runnable) this.I00iiO.poll();
/* 42 */                    this.I00iio = runnable;
/* 44 */                    if (runnable != null) {
/* 48 */                        this.I00iiI.execute(runnable);
/* 51 */                        return;
                            }
/* 51 */                    return;
                        default:
                            synchronized (this.I00ilI0I1) {
/* 11 */                        Object objPoll = this.I00iiO.poll();
/* 16 */                        Runnable runnable2 = (Runnable) objPoll;
/* 18 */                        this.I00iio = runnable2;
/* 20 */                        if (objPoll != null) {
/* 24 */                            this.I00iiI.execute(runnable2);
                                }
                            }
/* 31 */                    return;
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this.I00ilI0I1) {
                                try {
/* 45 */                            ArrayDeque arrayDeque = this.I00iiO;
/* 50 */                            l0001OI0 l0001oi0 = new l0001OI0(2);
/* 53 */                            l0001oi0.I00iiI = this;
/* 55 */                            l0001oi0.I00iiO = runnable;
/* 57 */                            VarHandle.storeStoreFence();
/* 60 */                            arrayDeque.add(l0001oi0);
/* 65 */                            if (this.I00iio == null) {
/* 67 */                                I00000oIO();
                                    }
                                } catch (Throwable th) {
/* 76 */                            throw th;
                                }
                            }
/* 74 */                    return;
                        default:
                            synchronized (this.I00ilI0I1) {
/* 9 */                         ArrayDeque arrayDeque2 = this.I00iiO;
/* 15 */                        Io11iII11ll io11iII11ll = new Io11iII11ll(25);
/* 18 */                        io11iII11ll.I00iiI = runnable;
/* 20 */                        io11iII11ll.I00iiO = this;
/* 22 */                        VarHandle.storeStoreFence();
/* 25 */                        arrayDeque2.offer(io11iII11ll);
/* 30 */                        if (this.I00iio == null) {
/* 32 */                            I00000oIO();
                                }
                            }
/* 39 */                    return;
                    }
                }
            }
