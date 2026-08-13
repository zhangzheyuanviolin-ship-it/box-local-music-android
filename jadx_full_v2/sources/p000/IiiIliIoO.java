            package p000;

            import android.hardware.display.DisplayManager;
            import android.view.Display;
            
/* 27 */    public final class IiiIliIoO implements DisplayManager.DisplayListener {
                public final int I00000oIO;
                public Object I00000oOI;

                @Override
                public final void onDisplayAdded(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     IiiIlilOO iiiIlilOO = (IiiIlilOO) this.I00000oOI;
                            synchronized (iiiIlilOO.I0000Il00O) {
/* 15 */                        iiiIlilOO.I0000O = null;
/* 17 */                        iiiIlilOO.I0001Ioi1lo = null;
                            }
/* 20 */                    return;
                        default:
/* 6 */                     return;
                    }
                }

                @Override
                public final void onDisplayChanged(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 28 */                    IiiIlilOO iiiIlilOO = (IiiIlilOO) this.I00000oOI;
                            synchronized (iiiIlilOO.I0000Il00O) {
/* 34 */                        iiiIlilOO.I0000O = null;
/* 36 */                        iiiIlilOO.I0001Ioi1lo = null;
                            }
/* 39 */                    return;
                        default:
/* 8 */                     OOIIooi oOIIooi = (OOIIooi) this.I00000oOI;
/* 10 */                    Display defaultDisplay = oOIIooi.getDefaultDisplay();
/* 14 */                    if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
/* 25 */                        return;
                            }
/* 22 */                    oOIIooi.I00000oIO();
/* 25 */                    return;
                    }
                }

                @Override
                public final void onDisplayRemoved(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 9 */                     IiiIlilOO iiiIlilOO = (IiiIlilOO) this.I00000oOI;
                            synchronized (iiiIlilOO.I0000Il00O) {
/* 15 */                        iiiIlilOO.I0000O = null;
/* 17 */                        iiiIlilOO.I0001Ioi1lo = null;
                            }
/* 20 */                    return;
                        default:
/* 6 */                     return;
                    }
                }

/* 28 */        private final void I00000oIO(int i) {
                }

/* 28 */        private final void I00000oOI(int i) {
                }
            }
