            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OI10llOi implements OIOiOoiIil1I {
                public int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public boolean I00000oIO(int i, int i2) {
/* 12 */            O1ooIoIolOli o1ooIoIolOli = (O1ooIoIolOli) ((OI0oiiIO0) this.I00iio).I000II(this.I00iOIl + i);
/* 25 */            O1ooIoIolOli o1ooIoIolOli2 = (O1ooIoIolOli) ((OI0oiiIO0) this.I00ilI0I1).I000II(this.I00iOIl + i2);
                    return O0000Ioio00.I0000O(o1ooIoIolOli, o1ooIoIolOli2) || o1ooIoIolOli.getClass() == o1ooIoIolOli2.getClass();
                }

                @Override
                public void I00000oOI(Executor executor, OIOiOllolii oIOiOllolii) {
                    OlO1IoO olO1IoO;
                    synchronized (this.I00iiO) {
/* 12 */                OlO1IoO olO1IoO2 = (OlO1IoO) ((HashMap) this.I00ilI0I1).remove(oIOiOllolii);
/* 15 */                if (olO1IoO2 != null) {
/* 19 */                    olO1IoO2.I00iiO.set(false);
/* 26 */                    ((CopyOnWriteArraySet) this.I00ilO0).remove(olO1IoO2);
                        }
/* 33 */                AtomicReference atomicReference = (AtomicReference) this.I00iio;
/* 35 */                olO1IoO = new OlO1IoO();
/* 44 */                olO1IoO.I00iiO = new AtomicBoolean(true);
/* 48 */                olO1IoO.I00ilI0I1 = OlO1IoO.I00ioIO;
/* 51 */                olO1IoO.I00ilO0 = -1;
/* 53 */                olO1IoO.I00io1l = false;
/* 55 */                olO1IoO.I00iio = atomicReference;
/* 57 */                olO1IoO.I00iOIl = executor;
/* 59 */                olO1IoO.I00iiI = oIOiOllolii;
/* 61 */                VarHandle.storeStoreFence();
/* 68 */                ((HashMap) this.I00ilI0I1).put(oIOiOllolii, olO1IoO);
/* 75 */                ((CopyOnWriteArraySet) this.I00ilO0).add(olO1IoO);
                    }
/* 79 */            olO1IoO.I00000oIO(0);
                }

                public void I0000Il00O() {
                    synchronized (this.I00iiO) {
                        try {
/* 6 */                     if (this.I00iiI) {
/* 9 */                         return;
                            }
/* 11 */                    this.I00iiI = true;
/* 15 */                    OlIl0i olIl0i = (OlIl0i) this.I00ilO0;
/* 17 */                    IOoil1iiIilo iOoil1iiIilo = null;
/* 18 */                    if (olIl0i != null) {
/* 20 */                        olIl0i.I000II(null);
                            }
/* 26 */                    this.I00ilO0 = null;
/* 41 */                    iOi1II01i0.I0000O((Ii0110) this.I00iio, null, null, new I1iOI0oo(this, iOoil1iiIilo, 24), 3);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public void I000OOo1O(OIOiOllolii oIOiOllolii) {
                    synchronized (this.I00iiO) {
/* 12 */                OlO1IoO olO1IoO = (OlO1IoO) ((HashMap) this.I00ilI0I1).remove(oIOiOllolii);
/* 14 */                if (olO1IoO != null) {
/* 19 */                    olO1IoO.I00iiO.set(false);
/* 26 */                    ((CopyOnWriteArraySet) this.I00ilO0).remove(olO1IoO);
                        }
                    }
                }
            }
