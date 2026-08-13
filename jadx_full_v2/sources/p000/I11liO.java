            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            
            public final class I11liO implements Executor {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public I11liO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public void I00000oIO() {
                    synchronized (this.I00iiI) {
                        try {
/* 12 */                    Runnable runnable = (Runnable) ((ArrayDeque) this.I00iiO).poll();
/* 14 */                    this.I00ilI0I1 = runnable;
/* 16 */                    if (runnable != null) {
/* 22 */                        ((Iii11l) this.I00iio).execute(runnable);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
                            synchronized (this.I00iiI) {
                                try {
/* 50 */                            ArrayDeque arrayDeque = (ArrayDeque) this.I00iiO;
/* 55 */                            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(4);
/* 58 */                            i0iOo0oioiO.I00iiI = this;
/* 60 */                            i0iOo0oioiO.I00iiO = runnable;
/* 62 */                            VarHandle.storeStoreFence();
/* 65 */                            arrayDeque.add(i0iOo0oioiO);
/* 72 */                            if (((Runnable) this.I00ilI0I1) == null) {
/* 74 */                                I00000oIO();
                                    }
                                } catch (Throwable th) {
/* 83 */                            throw th;
                                }
                            }
/* 81 */                    return;
                        default:
                            try {
/* 10 */                        ((Executor) this.I00iiI).execute(runnable);
/* 13 */                        return;
                            } catch (RuntimeException e) {
/* 27 */                        if (((iOoIlOOO0) ((IIoiO1OOl0I) this.I00iiO)).I00000oIO.I000O01llI0()) {
/* 33 */                            ((IIoiOO0) this.I00iio).I00000oIO();
                                } else {
/* 41 */                            ((OloIlI0ll) this.I00ilI0I1).I00000oIO(e);
                                }
/* 44 */                        throw e;
                            }
                    }
                }
            }
