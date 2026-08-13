            package p000;

            import android.util.Range;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class O0oOi0i1O implements O0oiO0ilooli, IIl10IOlll0 {
                public final O0oiOi I00iiI;
                public final IIoIi00lIii0 I00iiO;
                public final Object I00iOIl = new Object();
                public boolean I00iio = false;
                public IOiOol0 I00ilI0I1 = null;

                public O0oOi0i1O(O0oiOi o0oiOi, IIoIi00lIii0 iIoIi00lIii0, OiI0OoOIi oiI0OoOIi) {
/* 17 */            this.I00iiI = o0oiOi;
/* 19 */            this.I00iiO = iIoIi00lIii0;
/* 35 */            if (o0oiOi.I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iio)) {
/* 37 */                iIoIi00lIii0.I00111O();
                    } else {
/* 41 */                iIoIi00lIii0.I001i1O0Ol();
                    }
/* 48 */            o0oiOi.I000iOII().I00li1OI(this);
                }

                @Override
                public final IIlO1O0lOl I00000oOI() {
/* 5 */             return this.I00iiO.I00iOIl.I00iiO;
                }

                @Override
                public final IIllOioOlolI I0000Il00O() {
/* 5 */             return this.I00iiO.I00iOIl.I00iiI;
                }

                public final void I0000oI00(IOiOol0 iOiOol0) {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00ilI0I1 == null) {
/* 8 */                         this.I00ilI0I1 = iOiOol0;
                            } else {
/* 21 */                        ArrayList arrayList = new ArrayList((List) this.I00ilI0I1.I00ilO0);
/* 28 */                        arrayList.addAll((List) iOiOol0.I00ilO0);
/* 40 */                        this.I00ilI0I1 = new IOiOol0(arrayList, (List) iOiOol0.I00iiI);
                            }
                            synchronized (this.I00iiO.I00li1OI) {
                            }
/* 48 */                    IIoIi00lIii0 iIoIi00lIii0 = this.I00iiO;
/* 52 */                    List list = (List) iOiOol0.I00iiI;
                            synchronized (iIoIi00lIii0.I00li1OI) {
/* 57 */                        iIoIi00lIii0.I00ioIO = list;
                            }
                            synchronized (this.I00iiO.I00li1OI) {
                            }
/* 66 */                    IIoIi00lIii0 iIoIi00lIii02 = this.I00iiO;
/* 70 */                    Range range = (Range) iOiOol0.I00iiO;
                            synchronized (iIoIi00lIii02.I00li1OI) {
/* 75 */                        iIoIi00lIii02.I00l0I0l0lO1 = range;
                            }
/* 84 */                    Oi0Oooi oi0OooiI000lI = o0iOli.I000lI(I0000Il00O(), iOiOol0);
/* 90 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) iOiOol0.I00ioIO;
/* 95 */                    Io11iII11ll io11iII11ll = new Io11iII11ll(4);
/* 98 */                    io11iII11ll.I00iiI = oi0OooiI000lI;
/* 100 */                   io11iII11ll.I00iiO = iOiOol0;
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   scheduledExecutorService.execute(io11iII11ll);
/* 114 */                   this.I00iiO.I0000oI00((List) iOiOol0.I00ilO0, oi0OooiI000lI);
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final O0oiOi I000OiO() {
                    O0oiOi o0oiOi;
                    synchronized (this.I00iOIl) {
/* 4 */                 o0oiOi = this.I00iiI;
                    }
/* 7 */             return o0oiOi;
                }

                public final List I00111O() {
                    List listUnmodifiableList;
                    synchronized (this.I00iOIl) {
/* 10 */                listUnmodifiableList = Collections.unmodifiableList(this.I00iiO.I001lIiIIo1O());
                    }
/* 15 */            return listUnmodifiableList;
                }

                public final void I001IIilI0O() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00iio) {
/* 9 */                         return;
                            }
/* 14 */                    onStop(this.I00iiI);
/* 18 */                    this.I00iio = true;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I001IO000() {
                    synchronized (this.I00iOIl) {
/* 6 */                 List listI001lIiIIo1O = this.I00iiO.I001lIiIIo1O();
/* 15 */                this.I00iiO.I001lloI((ArrayList) listI001lIiIIo1O);
/* 20 */                Iterator it = ((ArrayList) listI001lIiIIo1O).iterator();
/* 28 */                while (it.hasNext()) {
/* 34 */                    Ool10o ool10o = (Ool10o) it.next();
/* 40 */                    if (ool10o.I000lI()) {
                                synchronized (ool10o.I0000O) {
                                }
                            }
                        }
/* 51 */                this.I00ilI0I1 = null;
                    }
                }

                public final void I001i1O0Ol() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00iio) {
/* 13 */                        this.I00iio = false;
/* 31 */                        if (this.I00iiI.I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iio)) {
/* 35 */                            onStart(this.I00iiI);
                                }
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @OIi011o01(O0oOOiI0.ON_DESTROY)
                public void onDestroy(O0oiOi o0oiOi) {
                    synchronized (this.I00iOIl) {
/* 4 */                 IIoIi00lIii0 iIoIi00lIii0 = this.I00iiO;
/* 12 */                iIoIi00lIii0.I001lloI((ArrayList) iIoIi00lIii0.I001lIiIIo1O());
                    }
                }

                @OIi011o01(O0oOOiI0.ON_PAUSE)
                public void onPause(O0oiOi o0oiOi) {
/* 6 */             this.I00iiO.I00iOIl.I000l1(false);
                }

                @OIi011o01(O0oOOiI0.ON_RESUME)
                public void onResume(O0oiOi o0oiOi) {
/* 6 */             this.I00iiO.I00iOIl.I000l1(true);
                }

                @OIi011o01(O0oOOiI0.ON_START)
                public void onStart(O0oiOi o0oiOi) {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (!this.I00iio) {
/* 10 */                        this.I00iiO.I00111O();
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                @OIi011o01(O0oOOiI0.ON_STOP)
                public void onStop(O0oiOi o0oiOi) {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (!this.I00iio) {
/* 10 */                        this.I00iiO.I001i1O0Ol();
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }
            }
