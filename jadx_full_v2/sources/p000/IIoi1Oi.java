            package p000;
            
            public final class IIoi1Oi {
                public boolean I00000oIO;
                public IIoi0lIOo I00000oOI;
                public boolean I0000Il00O;

                public final void I00000oIO() {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.I00000oIO) {
/* 7 */                         return;
                            }
/* 11 */                    this.I00000oIO = true;
/* 13 */                    this.I0000Il00O = true;
/* 15 */                    IIoi0lIOo iIoi0lIOo = this.I00000oOI;
/* 19 */                    if (iIoi0lIOo != null) {
                                try {
/* 21 */                            iIoi0lIOo.onCancel();
                                } catch (Throwable th) {
                                    synchronized (this) {
/* 27 */                                this.I0000Il00O = false;
/* 29 */                                notifyAll();
/* 33 */                                throw th;
                                    }
                                }
                            }
                            synchronized (this) {
/* 38 */                        this.I0000Il00O = false;
/* 40 */                        notifyAll();
                            }
                        } catch (Throwable th2) {
/* 55 */                    throw th2;
                        }
                    }
                }

                public final void I00000oOI(IIoi0lIOo iIoi0lIOo) {
                    synchronized (this) {
/* 4 */                 while (this.I0000Il00O) {
                            try {
                                try {
/* 6 */                             wait();
                                } catch (InterruptedException unused) {
                                }
                            } finally {
                            }
                        }
/* 12 */                if (this.I00000oOI == iIoi0lIOo) {
/* 30 */                    return;
                        }
/* 18 */                this.I00000oOI = iIoi0lIOo;
/* 22 */                if (this.I00000oIO) {
/* 25 */                    iIoi0lIOo.onCancel();
                        }
                    }
                }
            }
