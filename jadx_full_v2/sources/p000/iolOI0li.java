            package p000;
            
            public abstract class iolOI0li extends io0oi0oO {
                public boolean I00iiI;

                public iolOI0li(l0olllO1i l0olllo1i) {
/* 1 */             super(l0olllo1i);
                    ((l0olllO1i) this.I00iOIl).I00oo1iO0ll++;
                }

                public final void I010OIo1l() {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Not initialized");
                }

                public final void I010i10l() {
/* 3 */             if (this.I00iiI) {
/* 26 */                I000II.I001IO000("Can't initialize twice");
                    } else {
/* 9 */                 if (I010iIIOlo()) {
/* 23 */                    return;
                        }
/* 17 */                ((l0olllO1i) this.I00iOIl).I00ooiO1I.incrementAndGet();
/* 21 */                this.I00iiI = true;
                    }
                }

                public abstract boolean I010iIIOlo();
            }
