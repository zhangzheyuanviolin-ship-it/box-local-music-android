            package p000;
            
/* 18 */    public abstract class O110ioill {
                public final OIOilII0IlO I00iOIl;
                public boolean I00iiI;
                public int I00iiO = -1;
                public final O110lI I00iio;

                public O110ioill(O110lI o110lI, OIOilII0IlO oIOilII0IlO) {
/* 4 */             this.I00iio = o110lI;
/* 9 */             this.I00iOIl = oIOilII0IlO;
                }

                public final void I00000oIO(boolean z) {
/* 3 */             if (z == this.I00iiI) {
/* 71 */                return;
                    }
/* 6 */             this.I00iiI = z;
/* 13 */            int i = z ? 1 : -1;
/* 14 */            O110lI o110lI = this.I00iio;
/* 16 */            int i2 = o110lI.I0000Il00O;
/* 19 */            o110lI.I0000Il00O = i + i2;
/* 23 */            if (!o110lI.I0000O) {
/* 26 */                o110lI.I0000O = true;
                        while (true) {
                            try {
/* 29 */                        int i3 = o110lI.I0000Il00O;
/* 31 */                        if (i2 == i3) {
                                    break;
                                }
/* 39 */                        boolean z2 = i2 == 0 && i3 > 0;
/* 46 */                        boolean z3 = i2 > 0 && i3 == 0;
/* 47 */                        if (z2) {
/* 49 */                            o110lI.I000II();
                                } else if (z3) {
/* 57 */                            o110lI.I000O01llI0();
                                }
/* 60 */                        i2 = i3;
                            } catch (Throwable th) {
/* 72 */                        o110lI.I0000O = false;
/* 77 */                        throw th;
                            }
                        }
/* 62 */                o110lI.I0000O = false;
                    }
/* 66 */            if (this.I00iiI) {
/* 68 */                o110lI.I0000Il00O(this);
                    }
                }

                public boolean I0000Il00O(O0oiOi o0oiOi) {
/* 1 */             return false;
                }

                public abstract boolean I0000O();

/* 19 */        public void I00000oOI() {
                }
            }
