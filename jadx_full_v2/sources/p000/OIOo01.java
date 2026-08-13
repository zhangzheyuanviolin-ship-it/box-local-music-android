            package p000;

            import android.window.BackEvent;
            import android.window.OnBackAnimationCallback;
            
            public final class OIOo01 implements OnBackAnimationCallback {
                public OIOo00o I00000oIO;

                @Override
                public final void onBackCancelled() {
/* 1 */             OIOo00o oIOo00o = this.I00000oIO;
/* 3 */             iOliil ioliil = oIOo00o.I00000oIO;
/* 5 */             if (ioliil == null) {
/* 70 */                I000II.I001IO000("This input is not added to any dispatcher.");
/* 110 */               return;
                    }
/* 10 */            if (!oIOo00o.I00000oOI) {
/* 12 */                ioliil.I00100o1O0lo(oIOo00o, null);
                    }
/* 17 */            OII111OO1 oii111oo1 = (OII111OO1) ioliil.I00iiO;
/* 26 */            if (oIOo00o.equals(oii111oo1.I000O01llI0) && -1 == oii111oo1.I000II) {
/* 34 */                OII0l01IIOi oII0l01IIOiI0000Il00O = oii111oo1.I0001Ioi1lo;
/* 36 */                if (oII0l01IIOiI0000Il00O == null) {
/* 38 */                    oII0l01IIOiI0000Il00O = oii111oo1.I0000Il00O(-1);
                        }
/* 42 */                oii111oo1.I0001Ioi1lo = null;
/* 44 */                oii111oo1.I000II = 0;
/* 46 */                oii111oo1.I000O01llI0 = null;
/* 48 */                OII11i1lo0o0 oII11i1lo0o0 = OII11i1lo0o0.I00000oIO;
/* 50 */                if (oII0l01IIOiI0000Il00O != null) {
/* 52 */                    oII0l01IIOiI0000Il00O.I0000O = oII11i1lo0o0;
/* 54 */                    oII0l01IIOiI0000Il00O.I00000oIO();
                        }
/* 57 */                OlO0OIIl1 olO0OIIl1 = oii111oo1.I00000oIO;
/* 59 */                olO0OIIl1.getClass();
/* 62 */                olO0OIIl1.I000lI(null, oII11i1lo0o0);
                    }
/* 65 */            oIOo00o.I00000oOI = false;
                }

                @Override
                public final void onBackInvoked() {
/* 3 */             this.I00000oIO.I00000oIO();
                }

                @Override
                public final void onBackProgressed(BackEvent backEvent) {
/* 1 */             OIOo00o oIOo00o = this.I00000oIO;
/* 3 */             OII0l0 oII0l0I00000oIO = l1iOo1iI.I00000oIO(backEvent);
/* 7 */             iOliil ioliil = oIOo00o.I00000oIO;
/* 9 */             if (ioliil == null) {
/* 70 */                I000II.I001IO000("This input is not added to any dispatcher.");
/* 77 */                return;
                    }
/* 13 */            if (oIOo00o.I00000oOI) {
/* 17 */                OII111OO1 oii111oo1 = (OII111OO1) ioliil.I00iiO;
/* 25 */                if (oIOo00o.equals(oii111oo1.I000O01llI0) && -1 == oii111oo1.I000II) {
/* 33 */                    OII0l01IIOi oII0l01IIOiI0000Il00O = oii111oo1.I0001Ioi1lo;
/* 35 */                    if (oII0l01IIOiI0000Il00O == null) {
/* 37 */                        oII0l01IIOiI0000Il00O = oii111oo1.I0000Il00O(-1);
                            }
/* 41 */                    if (oII0l01IIOiI0000Il00O != null) {
/* 48 */                        oII0l01IIOiI0000Il00O.I0000O = new OII11iIO(oII0l0I00000oIO, -1);
/* 50 */                        oII0l01IIOiI0000Il00O.I0000Il00O(oII0l0I00000oIO);
                            }
/* 53 */                    OlO0OIIl1 olO0OIIl1 = oii111oo1.I00000oIO;
/* 57 */                    OII11iIO oII11iIO = new OII11iIO(oII0l0I00000oIO, -1);
/* 60 */                    olO0OIIl1.getClass();
/* 64 */                    olO0OIIl1.I000lI(null, oII11iIO);
                        }
                    }
                }

                @Override
                public final void onBackStarted(BackEvent backEvent) {
/* 1 */             OIOo00o oIOo00o = this.I00000oIO;
/* 3 */             OII0l0 oII0l0I00000oIO = l1iOo1iI.I00000oIO(backEvent);
/* 7 */             iOliil ioliil = oIOo00o.I00000oIO;
/* 9 */             if (ioliil == null) {
/* 24 */                I000II.I001IO000("This input is not added to any dispatcher.");
                    } else {
/* 13 */                if (oIOo00o.I00000oOI) {
/* 21 */                    return;
                        }
/* 15 */                ioliil.I00100o1O0lo(oIOo00o, oII0l0I00000oIO);
/* 19 */                oIOo00o.I00000oOI = true;
                    }
                }
            }
