            package p000;

            import android.util.Log;
            
            public final class OoooIIOo10 {
                public String I00000oIO;
                public Io0oi0 I00000oOI;
                public Ii0110 I0000Il00O;
                public int I0000O;
                public Object I0000oI00;
                public boolean I0001Ioi1lo;
                public OooloiI0 I000II;
                public Oiolio I000O01llI0;
                public IlOil1ii I000OOo1O;
                public IIo0l10O01O0 I000OiO;
                public OlIl0i I000iOII;
                public OI1I11lO1i I000l1;

                public final void I00000oIO(IIlOloloOil iIlOloloOil) {
                    IIo0l10O01O0 iIo0l10O01O0;
                    synchronized (this.I0000oI00) {
                        try {
/* 8 */                     if (this.I0001Ioi1lo) {
/* 11 */                        return;
                            }
/* 13 */                    this.I0001Ioi1lo = true;
/* 29 */                    Log.i("CXCP", "Disconnecting " + this);
/* 32 */                    OooloiI0 oooloiI0 = this.I000II;
/* 34 */                    if (oooloiI0 != null) {
                                synchronized (oooloiI0.I00iiI) {
/* 39 */                            oooloiI0.I00iiO = true;
                                }
                            }
/* 47 */                    OlIl0i olIl0i = this.I000iOII;
/* 50 */                    if (olIl0i != null) {
/* 52 */                        olIl0i.I000II(null);
                            }
/* 59 */                    OI1I11lO1i oI1I11lO1i = this.I000l1;
/* 61 */                    if (oI1I11lO1i != null) {
/* 63 */                        oI1I11lO1i.I00000oOI();
                            }
                            synchronized (this.I0000oI00) {
/* 69 */                        iIo0l10O01O0 = this.I000OiO;
                            }
/* 74 */                    if (!(iIo0l10O01O0 instanceof IIo0oOi01o1)) {
/* 78 */                        if (!(iIo0l10O01O0 instanceof IIo0oOllO)) {
/* 85 */                            I00000oOI(new IIo0oOllO(null));
                                }
/* 104 */                       I00000oOI(new IIo0oOi01o1(this.I00000oIO, IOO1iloOl.I00iiI, null, null, null, null, null, null, iIlOloloOil));
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I00000oOI(IIo0l10O01O0 iIo0l10O01O0) {
/* 1 */             this.I000OiO = iIo0l10O01O0;
/* 9 */             if (this.I000O01llI0.I0001Ioi1lo(iIo0l10O01O0)) {
/* 11 */                return;
                    }
/* 16 */            IoOOl0iOl1io.I001IO000("Failed to emit ", iIo0l10O01O0, " in ", this);
                }

                public final String toString() {
/* 13 */            return "VirtualCamera-" + this.I0000O;
                }
            }
