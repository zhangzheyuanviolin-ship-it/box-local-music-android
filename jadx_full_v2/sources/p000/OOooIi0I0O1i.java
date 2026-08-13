            package p000;
            
/* 18 */    public final class OOooIi0I0O1i implements Ii0110, OOooI0ioo1o {
                public static final IIoiil1l0I I00iio = new IIoiil1l0I(0);
                public Ii00l101O I00iOIl;
                public OOooIi0I0O1i I00iiI;
                public volatile Ii00l101O I00iiO;

                @Override
                public final Ii00l101O I00000oIO() {
                    Ii00l101O ii00l101OI00ioIO;
/* 1 */             Ii00l101O ii00l101O = this.I00iiO;
/* 3 */             if (ii00l101O != null && ii00l101O != I00iio) {
/* 116 */               return ii00l101O;
                    }
/* 17 */            IOlIO1I0OloO iOlIO1I0OloO = (IOlIO1I0OloO) this.I00iOIl.I00lli11(IOlIO1I0OloO.I00iiI);
/* 27 */            Ii00l101O oOooIO0O1l1O = iOlIO1I0OloO != null ? new OOooIO0O1l1O(iOlIO1I0OloO, this) : Il00o11.I00iOIl;
                    synchronized (this.I00iiI) {
                        try {
/* 32 */                    Ii00l101O ii00l101O2 = this.I00iiO;
/* 34 */                    if (ii00l101O2 == null) {
/* 36 */                        Ii00l101O ii00l101O3 = this.I00iOIl;
/* 61 */                        ii00l101OI00ioIO = ii00l101O3.I00ioIO(new O010loOOi0Oo((O010OIi) ii00l101O3.I00lli11(Iioi0lilII.I00iio))).I00ioIO(Il00o11.I00iOIl).I00ioIO(oOooIO0O1l1O);
                            } else if (ii00l101O2 == I00iio) {
/* 72 */                        Ii00l101O ii00l101O4 = this.I00iOIl;
/* 84 */                        O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo((O010OIi) ii00l101O4.I00lli11(Iioi0lilII.I00iio));
/* 93 */                        o010loOOi0Oo.I00111O(new Ilill0000ioI(0));
/* 106 */                       ii00l101OI00ioIO = ii00l101O4.I00ioIO(o010loOOi0Oo).I00ioIO(Il00o11.I00iOIl).I00ioIO(oOooIO0O1l1O);
                            } else {
/* 111 */                       ii00l101OI00ioIO = ii00l101O2;
                            }
/* 112 */                   this.I00iiO = ii00l101OI00ioIO;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 115 */           return ii00l101OI00ioIO;
                }

                @Override
                public final void I00000oOI() {
/* 1 */             I0000Il00O();
                }

                public final void I0000Il00O() {
                    synchronized (this.I00iiI) {
                        try {
/* 4 */                     Ii00l101O ii00l101O = this.I00iiO;
/* 6 */                     if (ii00l101O == null) {
/* 10 */                        this.I00iiO = I00iio;
                            } else {
/* 21 */                        l01oO1iOo.I00000oOI(ii00l101O, new Ilill0000ioI(0));
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I0000O() {
/* 1 */             I0000Il00O();
                }

                @Override
/* 19 */        public final void I0000oI00() {
                }
            }
