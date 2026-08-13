            package p000;

            import java.util.LinkedHashSet;
            import java.util.List;
            
/* 18 */    public abstract class OII0l01IIOi {
                public OII10lO0 I00000oIO;
                public List I00000oOI;
                public List I0000Il00O;
                public OII1I1oi I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public iOliil I000II;

                public OII0l01IIOi(OII10lO0 oII10lO0, boolean z, int i) {
/* 4 */             this.I00000oIO = oII10lO0;
/* 6 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 8 */             this.I00000oOI = il01100l;
/* 10 */            this.I0000Il00O = il01100l;
/* 14 */            this.I0000O = OII11i1lo0o0.I00000oIO;
/* 16 */            this.I0000oI00 = z;
/* 19 */            this.I0001Ioi1lo = false;
                }

                public abstract void I00000oIO();

                public abstract void I00000oOI();

                public abstract void I0000Il00O(OII0l0 oII0l0);

                public abstract void I0000O(OII0l0 oII0l0);

                public final void I0001Ioi1lo() {
/* 1 */             iOliil ioliil = this.I000II;
/* 3 */             if (ioliil == null || !((LinkedHashSet) ioliil.I00iio).remove(this)) {
/* 110 */               return;
                    }
/* 17 */            OII111OO1 oii111oo1 = (OII111OO1) ioliil.I00iiO;
/* 26 */            if (equals(oii111oo1.I0001Ioi1lo)) {
/* 28 */                int i = oii111oo1.I000II;
/* 31 */                OII11i1lo0o0 oII11i1lo0o0 = OII11i1lo0o0.I00000oIO;
/* 33 */                if (i == -1) {
/* 45 */                    this.I0000O = oII11i1lo0o0;
/* 47 */                    I00000oIO();
                        } else if (i == 1) {
/* 39 */                    this.I0000O = oII11i1lo0o0;
/* 41 */                    I0000oI00();
                        }
/* 50 */                oii111oo1.I0001Ioi1lo = null;
/* 53 */                oii111oo1.I000II = 0;
/* 55 */                oii111oo1.I000O01llI0 = null;
                    }
/* 59 */            oii111oo1.I0000O.remove(this);
/* 64 */            oii111oo1.I0000oI00.remove(this);
/* 67 */            this.I000II = null;
/* 69 */            oii111oo1.I00000oOI();
                }

                public final void I000II(boolean z) {
                    OII111OO1 oii111oo1;
/* 3 */             if (this.I0000oI00 == z) {
/* 29 */                return;
                    }
/* 6 */             this.I0000oI00 = z;
/* 8 */             iOliil ioliil = this.I000II;
/* 10 */            if (ioliil == null || (oii111oo1 = (OII111OO1) ioliil.I00iiO) == null) {
/* 29 */                return;
                    }
/* 18 */            oii111oo1.I00000oOI();
                }

/* 19 */        public void I0000oI00() {
                }
            }
