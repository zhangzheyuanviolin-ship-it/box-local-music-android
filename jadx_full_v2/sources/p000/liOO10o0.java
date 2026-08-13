            package p000;
            
            public abstract class liOO10o0 extends liIIo0lO0 {
                public boolean I00iiO;

                public liOO10o0(lilOOl0 lilool0) {
/* 3 */             super(lilool0.I00ll1);
/* 6 */             this.I00iiI = lilool0;
                    lilool0.I00oI0i++;
                }

                public final void I010OIo1l() {
/* 3 */             if (this.I00iiO) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Not initialized");
                }

                public final void I010i10l() {
/* 3 */             if (this.I00iiO) {
/* 21 */                I000II.I001IO000("Can't initialize twice");
/* 55 */                return;
                    }
/* 5 */             I010iIIOlo();
                    this.I00iiI.I00oII++;
/* 16 */            this.I00iiO = true;
                }

                public abstract void I010iIIOlo();
            }
