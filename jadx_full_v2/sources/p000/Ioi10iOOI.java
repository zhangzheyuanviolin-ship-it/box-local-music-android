            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Executor;
            
            public final class Ioi10iOOI extends Ioi0O0l1Ol {
                public Executor I00oOio10iI1;
                public Object I00ol1;
                public IoiO1IO1I1i I00olI;
                public Ioi0ololOi I00oli;

                @Override
                public final IoiO1IO1I1i I00000oIO(IoiO1ilO ioiO1ilO) {
/* 1 */             return ioiO1ilO.I00000oOI();
                }

                @Override
                public final void I0000O() {
                    synchronized (this.I00ol1) {
                        try {
/* 4 */                     IoiO1IO1I1i ioiO1IO1I1i = this.I00olI;
/* 6 */                     if (ioiO1IO1I1i != null) {
/* 8 */                         ioiO1IO1I1i.close();
/* 12 */                        this.I00olI = null;
                            }
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I0001Ioi1lo(IoiO1IO1I1i ioiO1IO1I1i) {
                    synchronized (this.I00ol1) {
                        try {
/* 6 */                     if (!this.I00oO101o) {
/* 8 */                         ioiO1IO1I1i.close();
/* 12 */                        return;
                            }
/* 17 */                    if (this.I00oli != null) {
/* 41 */                        if (ioiO1IO1I1i.I00i0oil().I0000oI00() <= this.I00oli.I00iiI.I00i0oil().I0000oI00()) {
/* 43 */                            ioiO1IO1I1i.close();
                                } else {
/* 47 */                            IoiO1IO1I1i ioiO1IO1I1i2 = this.I00olI;
/* 49 */                            if (ioiO1IO1I1i2 != null) {
/* 51 */                                ioiO1IO1I1i2.close();
                                    }
/* 54 */                            this.I00olI = ioiO1IO1I1i;
                                }
/* 57 */                        return;
                            }
/* 61 */                    Ioi0ololOi ioi0ololOi = new Ioi0ololOi(ioiO1IO1I1i, 0);
/* 69 */                    ioi0ololOi.I00ilI0I1 = new WeakReference(this);
/* 73 */                    Ioi0oiloI0 ioi0oiloI0 = new Ioi0oiloI0(0);
/* 76 */                    ioi0oiloI0.I00iiI = ioi0ololOi;
/* 78 */                    VarHandle.storeStoreFence();
/* 81 */                    ioi0ololOi.I00000oIO(ioi0oiloI0);
/* 84 */                    VarHandle.storeStoreFence();
/* 87 */                    this.I00oli = ioi0ololOi;
/* 89 */                    ListenableFuture listenableFutureI00000oOI = I00000oOI(ioi0ololOi);
/* 97 */                    O1OIll00i o1OIll00i = new O1OIll00i(13);
/* 100 */                   o1OIll00i.I00iiI = ioi0ololOi;
/* 102 */                   VarHandle.storeStoreFence();
/* 109 */                   iIllIoiiIO.I00000oIO(listenableFutureI00000oOI, o1OIll00i, Iii11l.I00000oIO());
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }
            }
