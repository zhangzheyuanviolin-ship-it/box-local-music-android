            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiOOoiOOo implements Ioi11lOIIO0O {
                public Ioi11lOIIO0O I00000oIO;
                public Object I00000oOI;
                public boolean I0000Il00O;
                public I0IOIlIOIII I0000O;

                @Override
                public final void I00000oIO(long j, I0IOIlIOIII i0IOIlIOIII) {
                    synchronized (this.I00000oOI) {
/* 5 */                 this.I0000Il00O = true;
/* 7 */                 this.I0000O = i0IOIlIOIII;
                    }
/* 10 */            Ioi11lOIIO0O ioi11lOIIO0O = this.I00000oIO;
/* 12 */            if (ioi11lOIIO0O == null) {
/* 34 */                l11I11lO.I00000oIO("ScreenFlashWrapper", "apply: screenFlash is null!");
/* 37 */                I0000Il00O();
                    } else {
/* 18 */                I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(26);
/* 21 */                i0IOIlIOIII2.I00iiI = this;
/* 23 */                VarHandle.storeStoreFence();
/* 26 */                ioi11lOIIO0O.I00000oIO(j, i0IOIlIOIII2);
                    }
                }

                public final void I00000oOI() {
                    synchronized (this.I00000oOI) {
                        try {
/* 6 */                     if (this.I0000Il00O) {
/* 8 */                         Ioi11lOIIO0O ioi11lOIIO0O = this.I00000oIO;
/* 10 */                        if (ioi11lOIIO0O != null) {
/* 12 */                            ioi11lOIIO0O.clear();
                                } else {
/* 22 */                            l11I11lO.I00000oIO("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                                }
                            } else {
/* 30 */                        l11I11lO.I0000oI00("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                            }
/* 34 */                    this.I0000Il00O = false;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final void I0000Il00O() {
                    synchronized (this.I00000oOI) {
                        try {
/* 4 */                     I0IOIlIOIII i0IOIlIOIII = this.I0000O;
/* 6 */                     if (i0IOIlIOIII != null) {
/* 8 */                         i0IOIlIOIII.I000O01llI0();
                            }
/* 15 */                    this.I0000O = null;
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
                }
            }
