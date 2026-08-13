            package p000;

            import java.util.List;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class O1Iioo1 implements Ool1II0ii {
                public OlO01I1 I00000oIO;
                public OolOi0i I00000oOI;
                public Ool1lo I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public OI0lOii0I I0001Ioi1lo;
                public AtomicInteger I000II;
                public IOi10loi I000O01llI0;
                public IiIOI1ol0o I000OOo1O;

                public final void I00000oIO(List list) {
/* 3 */             if (this.I0000O) {
/* 10 */                if (list.isEmpty()) {
/* 18 */                    this.I000OOo1O = iiiO1IOliI0.I00000oIO(Boolean.FALSE);
                        } else {
/* 37 */                    this.I000OOo1O = iOi1II01i0.I00000oOI(this.I00000oOI.I0000oI00, null, new O00lOIIO(this, list, null, 7), 3);
                        }
                    }
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0000Il00O = ool1lo;
/* 5 */             if (this.I0000oI00) {
/* 8 */                 if (ool1lo != null) {
/* 11 */                    I0000O(true, false);
                        } else {
/* 17 */                    I0000Il00O(this.I0001Ioi1lo, 0);
                        }
                    }
                }

                public final void I0000Il00O(OI0lOii0I oI0lOii0I, int i) {
/* 7 */             if (this.I000II.getAndSet(i) != i) {
/* 13 */                if (lOllIO.I00000oOI()) {
/* 19 */                    oI0lOii0I.I000iOII(Integer.valueOf(i));
                        } else {
/* 27 */                    oI0lOii0I.I000OOo1O(Integer.valueOf(i));
                        }
                    }
                }

                public final IOi10loi I0000O(boolean z, boolean z2) {
/* 4 */             l11I11lO.I0000O(3, "CXCP");
/* 9 */             IOi10loi iOi10loi = new IOi10loi();
/* 14 */            if (this.I0000O) {
/* 41 */                iOi1II01i0.I0000O(this.I00000oOI.I0000oI00, null, null, new II1loOl(null, this, iOi10loi, z, z2), 3);
/* 106 */               return iOi10loi;
                    }
/* 23 */            iOi10loi.I00iIO(new IllegalStateException("Low Light Boost is not supported!"));
/* 26 */            return iOi10loi;
                }

                @Override
                public final void reset() {
/* 1 */             IOi10loi iOi10loi = this.I000O01llI0;
/* 3 */             if (iOi10loi != null) {
/* 7 */                 IIl001iO0Io.I001l0I00("There is a new enableLowLightBoost being set", iOi10loi);
                    }
/* 11 */            this.I000O01llI0 = null;
/* 15 */            I0000O(false, true);
                }
            }
