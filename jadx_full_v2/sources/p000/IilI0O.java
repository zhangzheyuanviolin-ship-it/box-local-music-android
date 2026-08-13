            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IilI0O extends O1ooOo implements OoIOloiIii, O0iOIlio1O {
                public i1i0olI I00o0iI0io1;
                public IilI0O I00o0l1o1o0;
                public IilI0O I00o101lO;
                public long I00oI0i;

                @Override
                public final void I00000oOI(long j) {
/* 1 */             this.I00oI0i = j;
                }

                @Override
                public final Object I000l1() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00o101lO = null;
/* 4 */             this.I00o0l1o1o0 = null;
                }

                public final boolean I010l1O() {
/* 1 */             IilI0O iilI0O = this.I00o0l1o1o0;
/* 3 */             if (iilI0O != null) {
/* 16 */                return iilI0O.I010l1O();
                    }
/* 5 */             IilI0O iilI0O2 = this.I00o101lO;
/* 7 */             if (iilI0O2 != null) {
/* 9 */                 return iilI0O2.I010l1O();
                    }
/* 14 */            return false;
                }

                public final void I010l1ol111() {
/* 1 */             IilI0O iilI0O = this.I00o101lO;
/* 3 */             if (iilI0O != null) {
/* 13 */                iilI0O.I010l1ol111();
/* 20 */                return;
                    }
/* 5 */             IilI0O iilI0O2 = this.I00o0l1o1o0;
/* 7 */             if (iilI0O2 != null) {
/* 9 */                 iilI0O2.I010l1ol111();
                    }
                }

                public final void I010lI0oi() {
/* 1 */             IilI0O iilI0O = this.I00o101lO;
/* 3 */             if (iilI0O != null) {
/* 5 */                 iilI0O.I010lI0oi();
                    }
/* 8 */             IilI0O iilI0O2 = this.I00o0l1o1o0;
/* 10 */            if (iilI0O2 != null) {
/* 12 */                iilI0O2.I010lI0oi();
                    }
/* 16 */            this.I00o0l1o1o0 = null;
                }

                public final void I010o0o0oO(I0IIiO0iI i0IIiO0iI) {
                    OoIOloiIii ooIOloiIii;
                    IilI0O iilI0O;
/* 1 */             IilI0O iilI0O2 = this.I00o0l1o1o0;
/* 3 */             if (iilI0O2 == null || !il1llll.I00000oIO(iilI0O2, il1loioIiio.I00000oIO(i0IIiO0iI))) {
/* 22 */                if (this.I00iOIl.I00lll10) {
/* 28 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 34 */                    I1ooIoloo0 i1ooIoloo0 = new I1ooIoloo0(2);
/* 37 */                    i1ooIoloo0.I00iiI = oOo0ooi;
/* 39 */                    i1ooIoloo0.I00iiO = this;
/* 41 */                    i1ooIoloo0.I00iio = i0IIiO0iI;
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    lOo1ii0o1.I0000oI00(this, i1ooIoloo0);
/* 51 */                    ooIOloiIii = (OoIOloiIii) oOo0ooi.I00iOIl;
                        } else {
/* 24 */                    ooIOloiIii = null;
                        }
/* 53 */                iilI0O = (IilI0O) ooIOloiIii;
                    } else {
/* 16 */                iilI0O = iilI0O2;
                    }
/* 55 */            if (iilI0O != null && iilI0O2 == null) {
/* 59 */                iilI0O.I010l1ol111();
/* 62 */                iilI0O.I010o0o0oO(i0IIiO0iI);
/* 65 */                IilI0O iilI0O3 = this.I00o101lO;
/* 67 */                if (iilI0O3 != null) {
/* 69 */                    iilI0O3.I010lI0oi();
                        }
                    } else if (iilI0O == null && iilI0O2 != null) {
/* 77 */                IilI0O iilI0O4 = this.I00o101lO;
/* 79 */                if (iilI0O4 != null) {
/* 81 */                    iilI0O4.I010l1ol111();
/* 84 */                    iilI0O4.I010o0o0oO(i0IIiO0iI);
                        }
/* 87 */                iilI0O2.I010lI0oi();
                    } else if (!O0000Ioio00.I0000O(iilI0O, iilI0O2)) {
/* 97 */                if (iilI0O != null) {
/* 99 */                    iilI0O.I010l1ol111();
/* 102 */                   iilI0O.I010o0o0oO(i0IIiO0iI);
                        }
/* 105 */               if (iilI0O2 != null) {
/* 107 */                   iilI0O2.I010lI0oi();
                        }
                    } else if (iilI0O != null) {
/* 113 */               iilI0O.I010o0o0oO(i0IIiO0iI);
                    } else {
/* 117 */               IilI0O iilI0O5 = this.I00o101lO;
/* 119 */               if (iilI0O5 != null) {
/* 121 */                   iilI0O5.I010o0o0oO(i0IIiO0iI);
                        }
                    }
/* 124 */           this.I00o0l1o1o0 = iilI0O;
                }

                public final void I010oio1OO0() {
/* 1 */             IilI0O iilI0O = this.I00o101lO;
/* 3 */             if (iilI0O != null) {
/* 13 */                iilI0O.I010oio1OO0();
/* 20 */                return;
                    }
/* 5 */             IilI0O iilI0O2 = this.I00o0l1o1o0;
/* 7 */             if (iilI0O2 != null) {
/* 9 */                 iilI0O2.I010oio1OO0();
                    }
                }
            }
