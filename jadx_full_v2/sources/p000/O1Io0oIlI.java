            package p000;
            
            public final class O1Io0oIlI extends O1IoOOii0Ioi {
                public O1IooO I000OOo1O;
                public O1IoOOii0Ioi I000OiO;
                public O1IoOOii0Ioi I000iOII;

                public O1Io0oIlI() {
/* 5 */             super(O1IoiiO0o1.I00o0iI0io1, "");
                }

                @Override
                public final O1IoOOii0Ioi I0000Il00O() throws O1Ooo1IIioo {
/* 1 */             O1Io0oIlI o1Io0oIlII00000oIO = I00000oIO();
/* 5 */             I0000O(o1Io0oIlII00000oIO);
/* 8 */             O1IooO o1IooO = o1Io0oIlII00000oIO.I000OOo1O;
/* 19 */            o1Io0oIlII00000oIO.I000OOo1O = o1IooO != null ? o1IooO.I0000Il00O() : null;
/* 21 */            O1IoOOii0Ioi o1IoOOii0Ioi = o1Io0oIlII00000oIO.I000OiO;
/* 31 */            o1Io0oIlII00000oIO.I000OiO(o1IoOOii0Ioi != null ? o1IoOOii0Ioi.I0000Il00O() : null);
/* 34 */            O1IoOOii0Ioi o1IoOOii0Ioi2 = o1Io0oIlII00000oIO.I000iOII;
/* 42 */            o1Io0oIlII00000oIO.I000iOII(o1IoOOii0Ioi2 != null ? o1IoOOii0Ioi2.I0000Il00O() : null);
/* 113 */           return o1Io0oIlII00000oIO;
                }

                @Override
                public final O1Io0oIlI I00000oIO() throws O1Ooo1IIioo {
/* 3 */             O1Io0oIlI o1Io0oIlI = new O1Io0oIlI();
/* 6 */             I00000oOI(o1Io0oIlI);
/* 9 */             O1IooO o1IooO = this.I000OOo1O;
/* 20 */            o1Io0oIlI.I000OOo1O = o1IooO != null ? o1IooO.I00000oOI() : null;
/* 22 */            O1IoOOii0Ioi o1IoOOii0Ioi = this.I000OiO;
/* 32 */            o1Io0oIlI.I000OiO(o1IoOOii0Ioi != null ? o1IoOOii0Ioi.I00000oIO() : null);
/* 35 */            O1IoOOii0Ioi o1IoOOii0Ioi2 = this.I000iOII;
/* 43 */            o1Io0oIlI.I000iOII(o1IoOOii0Ioi2 != null ? o1IoOOii0Ioi2.I00000oIO() : null);
/* 113 */           return o1Io0oIlI;
                }

                public final void I000OiO(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 1 */             if (o1IoOOii0Ioi == null || o1IoOOii0Ioi.I00000oIO == O1IoiiO0o1.I00oII) {
/* 16 */                this.I000OiO = o1IoOOii0Ioi;
                    } else {
/* 12 */                IoOOl0iOl1io.I001iOo1i0O("Left boundary must be of type KMTMathAtomBoundary ", o1IoOOii0Ioi);
                    }
                }

                public final void I000iOII(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 1 */             if (o1IoOOii0Ioi == null || o1IoOOii0Ioi.I00000oIO == O1IoiiO0o1.I00oII) {
/* 16 */                this.I000iOII = o1IoOOii0Ioi;
                    } else {
/* 12 */                IoOOl0iOl1io.I001iOo1i0O("Right boundary must be of type KMTMathAtomBoundary ", o1IoOOii0Ioi);
                    }
                }
            }
