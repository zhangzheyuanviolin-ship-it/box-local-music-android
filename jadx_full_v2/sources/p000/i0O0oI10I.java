            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class i0O0oI10I {
                public static final OlOilIlol1 I000iOII = new OlOilIlol1("ExtractorLooper");
                public i0O1I1o I00000oIO;
                public i0O0I111OoII I00000oOI;
                public i0OIlO I0000Il00O;
                public i0O1l1o1O I0000O;
                public i0O1oI1l0l I0000oI00;
                public i0OIIIll I0001Ioi1lo;
                public i0OIOOi00 I000II;
                public i0O1O1I I000O01llI0;
                public AtomicBoolean I000OOo1O;
                public i0IOo0i0 I000OiO;

                public final void I00000oIO() {
                    IOOOI0 ioooi0I00000oIO;
/* 1 */             i0IOo0i0 i0ioo0i0 = this.I000OiO;
/* 6 */             OlOilIlol1 olOilIlol1 = I000iOII;
/* 10 */            olOilIlol1.I00000oIO("Run extractor loop", new Object[0]);
/* 13 */            AtomicBoolean atomicBoolean = this.I000OOo1O;
/* 20 */            if (!atomicBoolean.compareAndSet(false, true)) {
/* 201 */               olOilIlol1.I0000oI00("runLoop already looping; return", new Object[0]);
/* 541 */               return;
                    }
                    while (true) {
                        try {
/* 24 */                    ioooi0I00000oIO = this.I000O01llI0.I00000oIO();
                        } catch (i0O0lI1oiO e) {
/* 40 */                    olOilIlol1.I00000oOI("Error while getting next extraction task: %s", e.getMessage());
/* 44 */                    int i = e.I00iOIl;
/* 46 */                    if (i >= 0) {
/* 54 */                        ((i0OiOI1) i0ioo0i0.I0000Il00O()).I00000oOI(i);
/* 57 */                        I00000oOI(i, e);
                            }
/* 60 */                    ioooi0I00000oIO = null;
                        }
/* 61 */                if (ioooi0I00000oIO == null) {
/* 193 */                   atomicBoolean.set(false);
/* 196 */                   return;
                        }
                        try {
/* 65 */                    if (ioooi0I00000oIO instanceof i0O01I) {
/* 72 */                        this.I00000oOI.I00000oIO((i0O01I) ioooi0I00000oIO);
                            } else if (ioooi0I00000oIO instanceof i0OIl0l0000O) {
/* 87 */                        this.I0000Il00O.I00000oIO((i0OIl0l0000O) ioooi0I00000oIO);
                            } else if (ioooi0I00000oIO instanceof i0O1ilIi0) {
/* 100 */                       this.I0000O.I00000oIO((i0O1ilIi0) ioooi0I00000oIO);
                            } else if (ioooi0I00000oIO instanceof i0O1o10oo) {
/* 113 */                       this.I0000oI00.I00000oIO((i0O1o10oo) ioooi0I00000oIO);
                            } else if (ioooi0I00000oIO instanceof i0OI1oo1) {
/* 126 */                       this.I0001Ioi1lo.I00000oIO((i0OI1oo1) ioooi0I00000oIO);
                            } else if (ioooi0I00000oIO instanceof i0OIIl) {
/* 139 */                       this.I000II.I00000oIO((i0OIIl) ioooi0I00000oIO);
                            } else {
/* 157 */                       olOilIlol1.I00000oOI("Unknown task type: %s", ioooi0I00000oIO.getClass().getName());
                            }
                        } catch (Exception e2) {
/* 172 */                   olOilIlol1.I00000oOI("Error during extraction task: %s", e2.getMessage());
/* 183 */                   ((i0OiOI1) i0ioo0i0.I0000Il00O()).I00000oOI(ioooi0I00000oIO.I00000oIO);
/* 188 */                   I00000oOI(ioooi0I00000oIO.I00000oIO, e2);
                        }
                    }
                }

                public final void I00000oOI(int i, Exception exc) {
/* 1 */             i0O1I1o i0o1i1o = this.I00000oIO;
                    try {
/* 3 */                 ReentrantLock reentrantLock = i0o1i1o.I0000O;
                        try {
/* 5 */                     reentrantLock.lock();
/* 15 */                    i0o1i1o.I00000oIO(i).I0000Il00O.I0000Il00O = 5;
/* 17 */                    reentrantLock.unlock();
/* 25 */                    O1I1OO o1i1oo = new O1I1OO(16, (byte) 0);
/* 28 */                    o1i1oo.I00iiO = i0o1i1o;
/* 30 */                    o1i1oo.I00iiI = i;
/* 32 */                    VarHandle.storeStoreFence();
/* 35 */                    i0o1i1o.I00000oOI(o1i1oo);
                        } catch (Throwable th) {
/* 40 */                    reentrantLock.unlock();
/* 43 */                    throw th;
                        }
                    } catch (i0O0lI1oiO unused) {
/* 56 */                I000iOII.I00000oOI("Error during error handling: %s", exc.getMessage());
                    }
                }
            }
