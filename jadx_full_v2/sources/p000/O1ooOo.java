            package p000;
            
/* 18 */    public abstract class O1ooOo implements IiIill0O0li1 {
                public IIOlO1ii I00iiI;
                public int I00iiO;
                public O1ooOo I00ilI0I1;
                public O1ooOo I00ilO0;
                public OIOili0 I00io1l;
                public OIIlIII0Ili I00ioIO;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public boolean I00li1OI;
                public boolean I00ll1;
                public IO1Io1IOOOIi I00lli11;
                public boolean I00lll10;
                public O1ooOo I00iOIl = this;
                public int I00iio = -1;

                public final Ii0110 I00ooiO1I() {
/* 1 */             IIOlO1ii iIOlO1ii = this.I00iiI;
/* 3 */             if (iIOlO1ii != null) {
/* 55 */                return iIOlO1ii;
                    }
/* 42 */            IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getCoroutineContext().I00ioIO(new O010loOOi0Oo((O010OIi) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getCoroutineContext().I00lli11(Iioi0lilII.I00iio))));
/* 46 */            this.I00iiI = iIOlO1iiI00000oIO;
/* 55 */            return iIOlO1iiI00000oIO;
                }

                public boolean I00oooO() {
/* 3 */             return !(this instanceof I1o01l);
                }

                public void I0100i() {
/* 3 */             if (this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("node attached multiple times");
                    }
/* 12 */            if (this.I00ioIO == null) {
/* 17 */                IolioOO1.I0000Il00O("attach invoked on a node without a coordinator");
                    }
/* 21 */            this.I00lll10 = true;
/* 23 */            this.I00li1OI = true;
                }

                public void I0100o111I() {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("Cannot detach a node that is not attached");
                    }
/* 12 */            if (this.I00li1OI) {
/* 16 */                IolioOO1.I0000Il00O("Must run runAttachLifecycle() before markAsDetached()");
                    }
/* 21 */            if (this.I00ll1) {
/* 25 */                IolioOO1.I0000Il00O("Must run runDetachLifecycle() before markAsDetached()");
                    }
/* 29 */            this.I00lll10 = false;
/* 31 */            IIOlO1ii iIOlO1ii = this.I00iiI;
/* 33 */            if (iIOlO1ii != null) {
/* 43 */                il001oo1.I00000oOI(iIOlO1ii, new O1ooo00oi10("The Modifier.Node was detached", 2));
/* 47 */                this.I00iiI = null;
                    }
                }

                public void I010OIo1l() {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("reset() called on an unattached node");
                    }
/* 10 */            I010II();
                }

                public void I010i10l() {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("Must run markAsAttached() prior to runAttachLifecycle");
                    }
/* 12 */            if (!this.I00li1OI) {
/* 16 */                IolioOO1.I0000Il00O("Must run runAttachLifecycle() only once after markAsAttached()");
                    }
/* 20 */            this.I00li1OI = false;
/* 22 */            I010101Oo1lO();
/* 26 */            this.I00ll1 = true;
                }

                public void I010iIIOlo() {
/* 3 */             if (!this.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("node detached multiple times");
                    }
/* 12 */            if (this.I00ioIO == null) {
/* 17 */                IolioOO1.I0000Il00O("detach invoked on a node without a coordinator");
                    }
/* 22 */            if (!this.I00ll1) {
/* 26 */                IolioOO1.I0000Il00O("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                    }
/* 30 */            this.I00ll1 = false;
/* 32 */            IO1Io1IOOOIi iO1Io1IOOOIi = this.I00lli11;
/* 34 */            if (iO1Io1IOOOIi != null) {
/* 36 */                iO1Io1IOOOIi.invoke();
                    }
/* 39 */            I010I0();
                }

                public void I010ioo(O1ooOo o1ooOo) {
/* 1 */             this.I00iOIl = o1ooOo;
                }

                public void I010l10O(OIIlIII0Ili oIIlIII0Ili) {
/* 1 */             this.I00ioIO = oIIlIII0Ili;
                }

/* 19 */        public void I010101Oo1lO() {
                }

/* 19 */        public void I010I0() {
                }

/* 19 */        public void I010II() {
                }
            }
