            package p000;

            import android.content.Context;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.Executor;
            
/* 36 */    public final class OOlli1l1lOlI implements IoiO1ilO {
                public int I00iOIl;
                public boolean I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public Object I00ilO0;
                public final Object I00io1l;

                public OOlli1l1lOlI(IoiO1ilO ioiO1ilO) {
/* 9 */             this.I00iiO = new Object();
/* 12 */            this.I00iOIl = 0;
/* 14 */            this.I00iiI = false;
/* 19 */            Ioi0oiloI0 ioi0oiloI0 = new Ioi0oiloI0(1);
/* 22 */            ioi0oiloI0.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I00io1l = ioi0oiloI0;
/* 29 */            this.I00iio = ioiO1ilO;
/* 35 */            this.I00ilI0I1 = ioiO1ilO.getSurface();
                }

                public void I00000oIO(IoiOl011o ioiOl011o, Il0OiIi il0OiIi) {
/* 1 */             Context context = ioiOl011o.I00000oIO;
/* 5 */             IoiOl011o ioiOl011o2 = (IoiOl011o) this.I00iiO;
/* 11 */            if (context != ioiOl011o2.I00000oIO) {
/* 64 */                IOOlIIilOl0.I0001Ioi1lo(il0OiIi, "Interceptor '", "' cannot modify the request's context.");
/* 106 */               return;
                    }
/* 17 */            if (ioiOl011o.I00000oOI == iOloo0O0O.I00ilO0) {
/* 58 */                IOOlIIilOl0.I0001Ioi1lo(il0OiIi, "Interceptor '", "' cannot set the request's data to null.");
/* 61 */                return;
                    }
/* 23 */            if (ioiOl011o.I0000Il00O != ioiOl011o2.I0000Il00O) {
/* 52 */                IOOlIIilOl0.I0001Ioi1lo(il0OiIi, "Interceptor '", "' cannot modify the request's target.");
                    } else if (ioiOl011o.I001IIilI0O != ioiOl011o2.I001IIilI0O) {
/* 46 */                IOOlIIilOl0.I0001Ioi1lo(il0OiIi, "Interceptor '", "' cannot modify the request's lifecycle.");
                    } else {
/* 35 */                if (ioiOl011o.I001IO000 == ioiOl011o2.I001IO000) {
/* 37 */                    return;
                        }
/* 40 */                IOOlIIilOl0.I0001Ioi1lo(il0OiIi, "Interceptor '", "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
                    }
                }

                @Override
                public IoiO1IO1I1i I00000oOI() {
                    Ioi0ololOi ioi0ololOi;
                    synchronized (this.I00iiO) {
/* 8 */                 IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ((IoiO1ilO) this.I00iio).I00000oOI();
/* 12 */                if (ioiO1IO1I1iI00000oOI != null) {
                            this.I00iOIl++;
/* 22 */                    ioi0ololOi = new Ioi0ololOi(ioiO1IO1I1iI00000oOI, 1);
/* 29 */                    ioi0ololOi.I00000oIO((Ioi0oiloI0) this.I00io1l);
                        } else {
/* 33 */                    ioi0ololOi = null;
                        }
                    }
/* 35 */            return ioi0ololOi;
                }

                @Override
                public int I0000Il00O() {
                    int iI0000Il00O;
                    synchronized (this.I00iiO) {
/* 8 */                 iI0000Il00O = ((IoiO1ilO) this.I00iio).I0000Il00O();
                    }
/* 13 */            return iI0000Il00O;
                }

                @Override
                public int I0000O() {
                    int iI0000O;
                    synchronized (this.I00iiO) {
/* 8 */                 iI0000O = ((IoiO1ilO) this.I00iio).I0000O();
                    }
/* 13 */            return iI0000O;
                }

                @Override
                public void I0000oI00() {
                    synchronized (this.I00iiO) {
/* 8 */                 ((IoiO1ilO) this.I00iio).I0000oI00();
                    }
                }

                @Override
                public int I0001Ioi1lo() {
                    int iI0001Ioi1lo;
                    synchronized (this.I00iiO) {
/* 8 */                 iI0001Ioi1lo = ((IoiO1ilO) this.I00iio).I0001Ioi1lo();
                    }
/* 13 */            return iI0001Ioi1lo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000II(IoiOl011o ioiOl011o, IOoilo iOoilo) throws Throwable {
                    OOllOl0oo1o0 oOllOl0oo1o0;
                    IoiOl011o ioiOl011o2;
                    Il0OiIi il0OiIi;
                    Object objI0000O;
/* 1 */             OOlli1l1lOlI oOlli1l1lOlI = this;
/* 5 */             Object obj = oOlli1l1lOlI.I00ilI0I1;
/* 8 */             List list = (List) obj;
/* 10 */            int i = oOlli1l1lOlI.I00iOIl;
/* 14 */            if (iOoilo instanceof OOllOl0oo1o0) {
/* 17 */                oOllOl0oo1o0 = (OOllOl0oo1o0) iOoilo;
/* 19 */                int i2 = oOllOl0oo1o0.I00ilI0I1;
/* 25 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 28 */                    oOllOl0oo1o0.I00ilI0I1 = i2 - Integer.MIN_VALUE;
                        } else {
/* 33 */                    oOllOl0oo1o0 = new OOllOl0oo1o0(oOlli1l1lOlI, iOoilo);
                        }
                    }
/* 36 */            Object obj2 = oOllOl0oo1o0.I00iiO;
/* 38 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 40 */            int i3 = oOllOl0oo1o0.I00ilI0I1;
/* 43 */            if (i3 == 0) {
/* 68 */                lIoii1l01l0i.I00000oOI(obj2);
/* 71 */                if (i > 0) {
/* 81 */                    ioiOl011o2 = ioiOl011o;
/* 83 */                    oOlli1l1lOlI.I00000oIO(ioiOl011o2, (Il0OiIi) list.get(i - 1));
                        } else {
/* 87 */                    ioiOl011o2 = ioiOl011o;
                        }
/* 93 */                il0OiIi = (Il0OiIi) list.get(i);
/* 121 */               OOlli1l1lOlI oOlli1l1lOlI2 = new OOlli1l1lOlI((IoiOl011o) oOlli1l1lOlI.I00iiO, (List) obj, i + 1, ioiOl011o2, (Ol0i11lo1l1I) oOlli1l1lOlI.I00ilO0, (Il10il1) oOlli1l1lOlI.I00io1l, oOlli1l1lOlI.I00iiI);
/* 124 */               oOllOl0oo1o0.I00iOIl = oOlli1l1lOlI;
/* 126 */               oOllOl0oo1o0.I00iiI = il0OiIi;
/* 128 */               oOllOl0oo1o0.I00ilI0I1 = 1;
/* 130 */               objI0000O = il0OiIi.I0000O(oOlli1l1lOlI2, oOllOl0oo1o0);
/* 134 */               if (objI0000O == ii0111o) {
/* 136 */                   return ii0111o;
                        }
                    } else {
/* 45 */                if (i3 != 1) {
/* 63 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 66 */                    return null;
                        }
/* 47 */                Il0OiIi il0OiIi2 = oOllOl0oo1o0.I00iiI;
/* 49 */                OOlli1l1lOlI oOlli1l1lOlI3 = oOllOl0oo1o0.I00iOIl;
/* 51 */                lIoii1l01l0i.I00000oOI(obj2);
/* 56 */                il0OiIi = il0OiIi2;
/* 57 */                oOlli1l1lOlI = oOlli1l1lOlI3;
/* 58 */                objI0000O = obj2;
                    }
/* 137 */           IoiOl01IilO ioiOl01IilO = (IoiOl01IilO) objI0000O;
/* 143 */           oOlli1l1lOlI.I00000oIO(ioiOl01IilO.I00000oOI(), il0OiIi);
/* 332 */           return ioiOl01IilO;
                }

                public void I000O01llI0() {
                    synchronized (this.I00iiO) {
                        try {
/* 5 */                     this.I00iiI = true;
/* 11 */                    ((IoiO1ilO) this.I00iio).I0000oI00();
/* 16 */                    if (this.I00iOIl == 0) {
/* 18 */                        close();
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public void I000lI(IoiO1iOOil11 ioiO1iOOil11, Executor executor) {
                    synchronized (this.I00iiO) {
/* 6 */                 IoiO1ilO ioiO1ilO = (IoiO1ilO) this.I00iio;
/* 12 */                IIoIil iIoIil = new IIoIil(17);
/* 15 */                iIoIil.I00iiI = this;
/* 17 */                iIoIil.I00iiO = ioiO1iOOil11;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                ioiO1ilO.I000lI(iIoIil, executor);
                    }
                }

                @Override
                public int I000oI1ioi() {
                    int iI000oI1ioi;
                    synchronized (this.I00iiO) {
/* 8 */                 iI000oI1ioi = ((IoiO1ilO) this.I00iio).I000oI1ioi();
                    }
/* 13 */            return iI000oI1ioi;
                }

                @Override
                public IoiO1IO1I1i I00100l0() {
                    Ioi0ololOi ioi0ololOi;
                    synchronized (this.I00iiO) {
/* 8 */                 IoiO1IO1I1i ioiO1IO1I1iI00100l0 = ((IoiO1ilO) this.I00iio).I00100l0();
/* 12 */                if (ioiO1IO1I1iI00100l0 != null) {
                            this.I00iOIl++;
/* 22 */                    ioi0ololOi = new Ioi0ololOi(ioiO1IO1I1iI00100l0, 1);
/* 29 */                    ioi0ololOi.I00000oIO((Ioi0oiloI0) this.I00io1l);
                        } else {
/* 33 */                    ioi0ololOi = null;
                        }
                    }
/* 35 */            return ioi0ololOi;
                }

                @Override
                public void close() {
                    synchronized (this.I00iiO) {
                        try {
/* 6 */                     Surface surface = (Surface) this.I00ilI0I1;
/* 8 */                     if (surface != null) {
/* 10 */                        surface.release();
                            }
/* 20 */                    ((IoiO1ilO) this.I00iio).close();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public Surface getSurface() {
                    Surface surface;
                    synchronized (this.I00iiO) {
/* 8 */                 surface = ((IoiO1ilO) this.I00iio).getSurface();
                    }
/* 13 */            return surface;
                }

/* 37 */        public OOlli1l1lOlI(IoiOl011o ioiOl011o, List list, int i, IoiOl011o ioiOl011o2, Ol0i11lo1l1I ol0i11lo1l1I, Il10il1 il10il1, boolean z) {
/* 39 */            this.I00iiO = ioiOl011o;
/* 40 */            this.I00ilI0I1 = list;
/* 41 */            this.I00iOIl = i;
/* 42 */            this.I00iio = ioiOl011o2;
/* 43 */            this.I00ilO0 = ol0i11lo1l1I;
/* 44 */            this.I00io1l = il10il1;
/* 45 */            this.I00iiI = z;
                }
            }
