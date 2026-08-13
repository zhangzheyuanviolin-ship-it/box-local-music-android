            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class o1I0O0l1o0l extends i1Ii10O {
                public ll1lIIo I00000oOI;
                public ll1lIIo I0000Il00O;
                public int[] I0000O;
                public int I0000oI00;

                @Override
                public final void I00000oIO(OillOo0 oillOo0, o1101OI1l o1101oi1l) {
/* 4 */             for (int i = 0; i < this.I0000oI00; i++) {
/* 8 */                 int i2 = this.I0000O[i];
/* 10 */                int i3 = i2 & 31;
/* 12 */                o0oooliI o0oooliiI0000O = I0000O(i3);
/* 18 */                if (o0oooliiI0000O.I0000Il00O) {
/* 48 */                    iiiiI1o iiiii1o = new iiiiI1o(1);
/* 51 */                    iiiii1o.I00ilI0I1 = this;
/* 53 */                    iiiii1o.I00iio = o0oooliiI0000O;
/* 55 */                    iiiii1o.I00iiI = i3;
/* 60 */                    iiiii1o.I00iiO = i2 >>> (i3 + 5);
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    oillOo0.I001l0I00(o0oooliiI0000O, iiiii1o, o1101oi1l);
                        } else {
/* 20 */                    ll1lIIo ll1liio = this.I00000oOI;
/* 22 */                    int iI00000oIO = ll1liio.I00000oIO();
/* 26 */                    if (i2 >= iI00000oIO) {
/* 28 */                        ll1liio = this.I0000Il00O;
/* 30 */                        i2 -= iI00000oIO;
                            }
/* 41 */                    oillOo0.I001IIilI0O(o0oooliiI0000O, o0oooliiI0000O.I00000oOI.cast(ll1liio.I0000Il00O(i2)), o1101oi1l);
                        }
                    }
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Set I0000Il00O() {
/* 5 */             return new I1IlioI1o1I(this, 11);
                }

                public final o0oooliI I0000O(int i) {
/* 1 */             ll1lIIo ll1liio = this.I00000oOI;
/* 3 */             int iI00000oIO = ll1liio.I00000oIO();
                    return i >= iI00000oIO ? this.I0000Il00O.I00000oOI(i - iI00000oIO) : ll1liio.I00000oOI(i);
                }
            }
