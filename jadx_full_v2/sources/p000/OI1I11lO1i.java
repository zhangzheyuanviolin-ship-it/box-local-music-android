            package p000;
            
/* 14 */    public final class OI1I11lO1i {
                public final int I00000oIO;
                public I1Ool1IoO110 I00000oOI;
                public Object I0000Il00O;

                public OI1I11lO1i(OI11ol oI11ol) {
/* 2 */             this.I00000oIO = 0;
/* 7 */             this.I0000Il00O = oI11ol;
/* 13 */            this.I00000oOI = iOOOIOoiIlII.I00000oIO(false);
                }

                public final boolean I00000oIO() {
                    switch (this.I00000oIO) {
                    }
/* 8 */             return this.I00000oOI.I00000oOI();
                }

                public final boolean I00000oOI() {
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 68 */                    if (!this.I00000oOI.I00000oIO()) {
/* 5 */                         return false;
                            }
/* 74 */                    ((OI11ol) this.I0000Il00O).I00000oOI(null);
/* 4 */                     return true;
                        default:
/* 15 */                    if (!this.I00000oOI.I00000oIO()) {
/* 5 */                         return false;
                            }
/* 19 */                    OI10llOi oI10llOi = (OI10llOi) this.I0000Il00O;
                            synchronized (oI10llOi.I00iiO) {
/* 26 */                        int i = oI10llOi.I00iOIl - 1;
/* 27 */                        oI10llOi.I00iOIl = i;
/* 29 */                        if (i == 0 && !oI10llOi.I00iiI) {
/* 51 */                            oI10llOi.I00ilO0 = iOi1II01i0.I0000O((Ii0110) oI10llOi.I00iio, null, null, new O1iOlO(oI10llOi, iOoil1iiIilo, 17), 3);
                                }
                            }
/* 4 */                     return true;
                    }
                }

/* 15 */        public OI1I11lO1i() {
/* 16 */            this.I00000oIO = 1;
                }
            }
