            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OloO01111 {
                public boolean I00000oOI;
                public final Object I00000oIO = new Object();
                public final ArrayDeque I0000Il00O = new ArrayDeque();
                public final AtomicReference I0000O = new AtomicReference();

                public final void I00000oIO(Runnable runnable, Executor executor) {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     if (!this.I00000oOI) {
/* 30 */                        this.I00000oOI = true;
/* 33 */                        I0000Il00O(runnable, executor);
/* 36 */                        return;
                            }
/* 8 */                     ArrayDeque arrayDeque = this.I0000Il00O;
/* 12 */                    o00iI1l00I1 o00ii1l00i1 = new o00iI1l00I1();
/* 15 */                    o00ii1l00i1.I00000oIO = executor;
/* 17 */                    o00ii1l00i1.I00000oOI = runnable;
/* 19 */                    VarHandle.storeStoreFence();
/* 22 */                    arrayDeque.add(o00ii1l00i1);
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
                }

                public final void I00000oOI() {
                    synchronized (this.I00000oIO) {
                        try {
/* 10 */                    if (this.I0000Il00O.isEmpty()) {
/* 13 */                        this.I00000oOI = false;
/* 16 */                        return;
                            }
/* 25 */                    o00iI1l00I1 o00ii1l00i1 = (o00iI1l00I1) this.I0000Il00O.remove();
/* 32 */                    I0000Il00O(o00ii1l00i1.I00000oOI, o00ii1l00i1.I00000oIO);
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                public final void I0000Il00O(Runnable runnable, Executor executor) {
/* 5 */             l0001OI0 l0001oi0 = new l0001OI0(11);
/* 8 */             l0001oi0.I00iiI = this;
/* 10 */            l0001oi0.I00iiO = runnable;
/* 12 */            VarHandle.storeStoreFence();
                    try {
/* 15 */                executor.execute(l0001oi0);
                    } catch (RejectedExecutionException unused) {
/* 19 */                I00000oOI();
                    }
                }
            }
