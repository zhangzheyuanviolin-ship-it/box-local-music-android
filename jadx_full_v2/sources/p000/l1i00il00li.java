            package p000;
            
            public abstract class l1i00il00li extends I01O1lIi {
                public boolean I00iiI;

                public l1i00il00li(l0olllO1i l0olllo1i) {
/* 4 */             this.I00iOIl = l0olllo1i;
                    l0olllo1i.I00oo1iO0ll++;
                }

                public abstract boolean I010OIo1l();

                public final void I010i10l() {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Not initialized");
                }

                public final void I010iIIOlo() {
/* 3 */             if (this.I00iiI) {
/* 26 */                I000II.I001IO000("Can't initialize twice");
                    } else {
/* 9 */                 if (I010OIo1l()) {
/* 23 */                    return;
                        }
/* 17 */                ((l0olllO1i) this.I00iOIl).I00ooiO1I.incrementAndGet();
/* 21 */                this.I00iiI = true;
                    }
                }
            }
