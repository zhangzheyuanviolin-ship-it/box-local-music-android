            package p000;

            import android.os.Trace;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OO0ii1lIiO {
                public IOlIOiI0iiI1 I00000oIO;
                public IOl1ool0 I00000oOI;
                public IloI0lOlll1 I0000Il00O;
                public IlliIl1l11O I0000O;
                public boolean I0000oI00;
                public Ooi1loooOO1 I0001Ioi1lo;
                public Object I000II;
                public AtomicReference I000O01llI0;
                public long I000OOo1O;
                public OI10IIO I000OiO;
                public OOoo1il I000iOII;
                public OOo0101 I000l1;

                public final void I00000oIO() throws Exception {
/* 1 */             AtomicReference atomicReference = this.I000O01llI0;
                    try {
                        switch (((OO0iliOlo0o) atomicReference.get()).ordinal()) {
                            case 0:
/* 100 */                       throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                            case 1:
/* 92 */                        throw new IllegalStateException("The paused composition has been cancelled");
                            case 2:
                            case 3:
                            case 4:
/* 84 */                        throw new IllegalStateException("The paused composition has not completed yet");
                            case 5:
/* 35 */                        I00000oOI();
/* 38 */                        OO0iliOlo0o oO0iliOlo0o = OO0iliOlo0o.I00ilO0;
/* 40 */                        OO0iliOlo0o oO0iliOlo0o2 = OO0iliOlo0o.I00io1l;
/* 46 */                        if (atomicReference.compareAndSet(oO0iliOlo0o, oO0iliOlo0o2)) {
/* 76 */                            return;
                                }
/* 73 */                        OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o + " to: " + oO0iliOlo0o2 + ".");
/* 76 */                        return;
                            case 6:
/* 34 */                        throw new IllegalStateException("The paused composition has already been applied");
                            default:
/* 24 */                        throw new IOiIIo1l(6);
                        }
                    } catch (Exception e) {
/* 103 */               atomicReference.set(OO0iliOlo0o.I00iOIl);
/* 106 */               throw e;
                    }
                }

                public final void I00000oOI() {
/* 3 */             Trace.beginSection("PausedComposition:applyChanges");
                    try {
                        synchronized (this.I000II) {
                            try {
/* 16 */                        this.I000l1.I00000oIO(this.I0001Ioi1lo, this.I000iOII);
/* 21 */                        this.I000iOII.I0000O();
/* 26 */                        this.I000iOII.I0000oI00();
                            } finally {
/* 48 */                        this.I000iOII.I0000Il00O();
/* 53 */                        this.I00000oIO.I00o101lO = null;
                            }
                        }
                    } finally {
/* 59 */                Trace.endSection();
                    }
                }

                public final boolean I0000Il00O() {
                    return ((OO0iliOlo0o) this.I000O01llI0.get()).compareTo(OO0iliOlo0o.I00ilO0) >= 0;
                }

                public final void I0000O() {
/* 1 */             OO0iliOlo0o oO0iliOlo0o = OO0iliOlo0o.I00iio;
/* 3 */             OO0iliOlo0o oO0iliOlo0o2 = OO0iliOlo0o.I00ilO0;
/* 11 */            if (this.I000O01llI0.compareAndSet(oO0iliOlo0o, oO0iliOlo0o2)) {
/* 55 */                return;
                    }
/* 40 */            OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o + " to: " + oO0iliOlo0o2 + ".");
                }

                public final boolean I0000oI00(Ol01IliO ol01IliO) throws Exception {
/* 1 */             IloI0lOlll1 iloI0lOlll1 = this.I0000Il00O;
/* 3 */             boolean z = this.I0000oI00;
/* 5 */             IOlIOiI0iiI1 iOlIOiI0iiI1 = this.I00000oIO;
/* 7 */             IOl1ool0 iOl1ool0 = this.I00000oOI;
/* 9 */             AtomicReference atomicReference = this.I000O01llI0;
                    try {
                        switch (((OO0iliOlo0o) atomicReference.get()).ordinal()) {
                            case 0:
/* 305 */                       throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                            case 1:
/* 297 */                       throw new IllegalStateException("The paused composition has been cancelled");
                            case 2:
/* 202 */                       if (z) {
/* 204 */                           iloI0lOlll1.I001l0I00 = 0;
/* 207 */                           iloI0lOlll1.I001iOo1i0O = true;
                                }
/* 215 */                       this.I000OiO = iOl1ool0.I00000oOI(iOlIOiI0iiI1, ol01IliO, this.I0000O);
/* 217 */                       if (z) {
/* 221 */                           if (iloI0lOlll1.I00IO1 || iloI0lOlll1.I001l0I00 != 0) {
/* 230 */                               OO1oio00IO.I00000oIO("Cannot disable reuse from root if it was caused by other groups");
                                    }
/* 234 */                           iloI0lOlll1.I001l0I00 = -1;
/* 236 */                           iloI0lOlll1.I001iOo1i0O = false;
                                }
/* 238 */                       OO0iliOlo0o oO0iliOlo0o = OO0iliOlo0o.I00iiO;
/* 240 */                       OO0iliOlo0o oO0iliOlo0o2 = OO0iliOlo0o.I00iio;
/* 246 */                       if (!atomicReference.compareAndSet(oO0iliOlo0o, oO0iliOlo0o2)) {
/* 269 */                           OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o + " to: " + oO0iliOlo0o2 + ".");
                                }
/* 278 */                       if (this.I000OiO.I000II()) {
/* 280 */                           I0000O();
                                }
/* 283 */                       return I0000Il00O();
                            case 3:
/* 68 */                        OO0iliOlo0o oO0iliOlo0o3 = OO0iliOlo0o.I00iio;
/* 70 */                        OO0iliOlo0o oO0iliOlo0o4 = OO0iliOlo0o.I00ilI0I1;
/* 76 */                        if (!atomicReference.compareAndSet(oO0iliOlo0o3, oO0iliOlo0o4)) {
/* 99 */                            OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o3 + " to: " + oO0iliOlo0o4 + ".");
                                }
/* 102 */                       long j = this.I000OOo1O;
                                try {
/* 108 */                           this.I000OOo1O = lOllI0.I00000oIO();
/* 116 */                           this.I000OiO = iOl1ool0.I00100o1O0lo(iOlIOiI0iiI1, ol01IliO, this.I000OiO);
/* 118 */                           this.I000OOo1O = j;
/* 124 */                           if (!atomicReference.compareAndSet(oO0iliOlo0o4, oO0iliOlo0o3)) {
/* 147 */                               OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o4 + " to: " + oO0iliOlo0o3 + ".");
                                    }
/* 156 */                           if (this.I000OiO.I000II()) {
/* 158 */                               I0000O();
                                    }
/* 283 */                           return I0000Il00O();
                                } catch (Throwable th) {
/* 164 */                           this.I000OOo1O = j;
/* 166 */                           OO0iliOlo0o oO0iliOlo0o5 = OO0iliOlo0o.I00ilI0I1;
/* 168 */                           OO0iliOlo0o oO0iliOlo0o6 = OO0iliOlo0o.I00iio;
/* 174 */                           if (!atomicReference.compareAndSet(oO0iliOlo0o5, oO0iliOlo0o6)) {
/* 197 */                               OO1oio00IO.I00000oOI("Unexpected state change from: " + oO0iliOlo0o5 + " to: " + oO0iliOlo0o6 + ".");
                                    }
/* 200 */                           throw th;
                                }
                            case 4:
/* 58 */                        IOl1II00.I00000oOI("Recursive call to resume()");
/* 67 */                        throw new IOiIIo1l(5);
                            case 5:
/* 55 */                        throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                            case 6:
/* 47 */                        throw new IllegalStateException("The paused composition has been applied");
                            default:
/* 36 */                        throw new IOiIIo1l(6);
                        }
                    } catch (Exception e) {
/* 308 */               atomicReference.set(OO0iliOlo0o.I00iOIl);
/* 311 */               throw e;
                    }
                }
            }
