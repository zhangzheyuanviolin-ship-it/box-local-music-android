            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            
            public final class o0IiOl extends OloIIoII1oo {
                public final Object I00000oIO = new Object();
                public final I0oO0iO1l0lo I00000oOI;
                public boolean I0000Il00O;
                public volatile boolean I0000O;
                public Object I0000oI00;
                public Exception I0001Ioi1lo;

                public o0IiOl() {
/* 14 */            I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(6);
/* 22 */            i0oO0iO1l0lo.I00iio = new Object();
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I00000oOI = i0oO0iO1l0lo;
                }

                @Override
                public final o0IiOl I00000oIO(Executor executor, OIOol0 oIOol0) {
/* 4 */             l0IIioiIOIo l0iiioiioio = new l0IIioiIOIo(0);
/* 12 */            l0iiioiioio.I00iiO = new Object();
/* 14 */            l0iiioiioio.I00iiI = executor;
/* 16 */            l0iiioiioio.I00iio = oIOol0;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            this.I00000oOI.I000l1(l0iiioiioio);
/* 26 */            I0010I0i();
/* 37 */            return this;
                }

                @Override
                public final o0IiOl I00000oOI(Executor executor, OIOolOo oIOolOo) {
/* 8 */             this.I00000oOI.I000l1(new l0IIioiIOIo(executor, oIOolOo));
/* 11 */            I0010I0i();
/* 37 */            return this;
                }

                @Override
                public final o0IiOl I0000Il00O(OIi0011o oIi0011o) {
/* 3 */             I0000O(OloIo0oOIO0.I00000oIO, oIi0011o);
/* 29 */            return this;
                }

                @Override
                public final o0IiOl I0000O(Executor executor, OIi0011o oIi0011o) {
/* 4 */             l0IIioiIOIo l0iiioiioio = new l0IIioiIOIo(2);
/* 12 */            l0iiioiioio.I00iiO = new Object();
/* 14 */            l0iiioiioio.I00iiI = executor;
/* 16 */            l0iiioiioio.I00iio = oIi0011o;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            this.I00000oOI.I000l1(l0iiioiioio);
/* 26 */            I0010I0i();
/* 37 */            return this;
                }

                @Override
                public final o0IiOl I0000oI00(Executor executor, OIi0Oi1lOoo oIi0Oi1lOoo) {
/* 4 */             l0IIioiIOIo l0iiioiioio = new l0IIioiIOIo(3);
/* 12 */            l0iiioiioio.I00iiO = new Object();
/* 14 */            l0iiioiioio.I00iiI = executor;
/* 16 */            l0iiioiioio.I00iio = oIi0Oi1lOoo;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            this.I00000oOI.I000l1(l0iiioiioio);
/* 26 */            I0010I0i();
/* 37 */            return this;
                }

                @Override
                public final Exception I0001Ioi1lo() {
                    Exception exc;
                    synchronized (this.I00000oIO) {
/* 4 */                 exc = this.I0001Ioi1lo;
                    }
/* 7 */             return exc;
                }

                @Override
                public final Object I000II() {
                    Object obj;
                    synchronized (this.I00000oIO) {
                        try {
/* 8 */                     lII0I0I000I.I000OOo1O("Task is not yet complete", this.I0000Il00O);
/* 13 */                    if (this.I0000O) {
/* 38 */                        throw new CancellationException("Task is already canceled.");
                            }
/* 15 */                    Exception exc = this.I0001Ioi1lo;
/* 17 */                    if (exc != null) {
/* 30 */                        throw new OiII01(exc);
                            }
/* 19 */                    obj = this.I0000oI00;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 22 */            return obj;
                }

                @Override
                public final boolean I000O01llI0() {
                    boolean z;
                    synchronized (this.I00000oIO) {
/* 4 */                 z = this.I0000Il00O;
                    }
/* 7 */             return z;
                }

                @Override
                public final boolean I000OOo1O() {
                    boolean z;
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     z = false;
/* 7 */                     if (this.I0000Il00O && !this.I0000O && this.I0001Ioi1lo == null) {
/* 17 */                        z = true;
                            }
                        } finally {
                        }
                    }
/* 22 */            return z;
                }

                public final o0IiOl I000OiO(OIOolOo oIOolOo) {
/* 10 */            this.I00000oOI.I000l1(new l0IIioiIOIo(OloIo0oOIO0.I00000oIO, oIOolOo));
/* 13 */            I0010I0i();
/* 29 */            return this;
                }

                public final o0IiOl I000iOII(Executor executor, IOoillilli iOoillilli) {
/* 3 */             o0IiOl o0iiol = new o0IiOl();
/* 9 */             il11loI il11loi = new il11loI(0);
/* 12 */            il11loi.I00iiI = executor;
/* 14 */            il11loi.I00iiO = iOoillilli;
/* 16 */            il11loi.I00iio = o0iiol;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            this.I00000oOI.I000l1(il11loi);
/* 26 */            I0010I0i();
/* 37 */            return o0iiol;
                }

                public final o0IiOl I000l1(Executor executor, IOoillilli iOoillilli) {
/* 3 */             o0IiOl o0iiol = new o0IiOl();
/* 9 */             il11loI il11loi = new il11loI(1);
/* 12 */            il11loi.I00iiI = executor;
/* 14 */            il11loi.I00iiO = iOoillilli;
/* 16 */            il11loi.I00iio = o0iiol;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            this.I00000oOI.I000l1(il11loi);
/* 26 */            I0010I0i();
/* 37 */            return o0iiol;
                }

                public final void I000lI(Object obj) {
                    synchronized (this.I00000oIO) {
/* 4 */                 I00100o1O0lo();
/* 8 */                 this.I0000Il00O = true;
/* 10 */                this.I0000oI00 = obj;
                    }
/* 15 */            this.I00000oOI.I000o00OoI0I(this);
                }

                public final boolean I000o00OoI0I(Object obj) {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     if (this.I0000Il00O) {
/* 9 */                         return false;
                            }
/* 14 */                    this.I0000Il00O = true;
/* 16 */                    this.I0000oI00 = obj;
/* 21 */                    this.I00000oOI.I000o00OoI0I(this);
/* 13 */                    return true;
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                public final void I000oI1ioi(Exception exc) {
/* 3 */             lII0I0I000I.I000O01llI0("Exception must not be null", exc);
                    synchronized (this.I00000oIO) {
/* 9 */                 I00100o1O0lo();
/* 13 */                this.I0000Il00O = true;
/* 15 */                this.I0001Ioi1lo = exc;
                    }
/* 20 */            this.I00000oOI.I000o00OoI0I(this);
                }

                public final void I00100l0() {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     if (this.I0000Il00O) {
/* 9 */                         return;
                            }
/* 13 */                    this.I0000Il00O = true;
/* 15 */                    this.I0000O = true;
/* 20 */                    this.I00000oOI.I000o00OoI0I(this);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I00100o1O0lo() {
/* 3 */             if (this.I0000Il00O) {
/* 9 */                 if (!I000O01llI0()) {
/* 70 */                    throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
                        }
/* 11 */                Exception excI0001Ioi1lo = I0001Ioi1lo();
                    }
                }

                public final void I0010I0i() {
                    synchronized (this.I00000oIO) {
                        try {
/* 6 */                     if (this.I0000Il00O) {
/* 15 */                        this.I00000oOI.I000o00OoI0I(this);
                            }
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }
            }
