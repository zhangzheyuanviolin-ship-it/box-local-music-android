            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class IOl0OoOIliI1 extends I01loIooI {
                public Ii0110 I0000Il00O;
                public IlliIl1l11O I0000O;
                public IIIII1OI1 I0000oI00;
                public OlIl0i I0001Ioi1lo;
                public boolean I000II;

                @Override
                public final void I0010o() {
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I0000oI00;
/* 3 */             if (iiiii1oi1 != null) {
/* 13 */                iiiii1oi1.I0000Il00O(true, new CancellationException("onBack cancelled"));
                    }
/* 16 */            OlIl0i olIl0i = this.I0001Ioi1lo;
/* 19 */            if (olIl0i != null) {
/* 21 */                olIl0i.I000II(null);
                    }
/* 24 */            this.I0000oI00 = null;
/* 26 */            this.I0001Ioi1lo = null;
/* 29 */            this.I000II = false;
                }

                @Override
                public final void I00111O() {
/* 3 */             if (this.I0000oI00 != null && !this.I000II) {
/* 9 */                 I0010o();
                    }
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 16 */            if (this.I0000oI00 == null) {
/* 18 */                this.I000II = false;
/* 28 */                this.I0000oI00 = iOl1iOi0I.I00000oIO(-2, IIII0i.I00iOIl, null, 4);
/* 44 */                this.I0001Ioi1lo = iOi1II01i0.I0000O(this.I0000Il00O, null, null, new I00oI0i(this, iOoil1iiIilo, 23), 3);
                    }
/* 46 */            IIIII1OI1 iiiii1oi1 = this.I0000oI00;
/* 48 */            if (iiiii1oi1 != null) {
/* 50 */                iiiii1oi1.I0001Ioi1lo(null);
                    }
/* 53 */            this.I000II = false;
                }

                @Override
                public final void I001IIilI0O(I1lloOo i1lloOo) {
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I0000oI00;
/* 3 */             if (iiiii1oi1 != null) {
/* 9 */                 IO10lIoiO.I00000oIO(iiiii1oi1.I000lI(i1lloOo));
                    }
                }

                @Override
                public final void I001IO000() {
/* 1 */             I0010o();
/* 8 */             if (super.I00100l0()) {
/* 11 */                this.I000II = true;
/* 22 */                this.I0000oI00 = iOl1iOi0I.I00000oIO(-2, IIII0i.I00iOIl, null, 4);
/* 38 */                this.I0001Ioi1lo = iOi1II01i0.I0000O(this.I0000Il00O, null, null, new I00oI0i(this, (IOoil1iiIilo) null, 23), 3);
                    }
                }

                public final void I001l0I00(boolean z) {
                    OlIl0i olIl0i;
/* 1 */             if (!z && super.I00100l0() && (olIl0i = this.I0001Ioi1lo) != null && !olIl0i.I0000Il00O()) {
/* 19 */                I0010o();
                    }
/* 26 */            ((I1lo101oIi1) this.I00000oIO).I0000oI00(z);
/* 33 */            ((I1lo0oO1O) this.I00000oOI).I000II(z);
                }
            }
