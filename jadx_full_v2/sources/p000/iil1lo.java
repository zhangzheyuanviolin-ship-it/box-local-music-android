            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class iil1lo extends iilOlo01ooO {
                public lilI1ii I00000oOI;
                public lilI1ii I0000Il00O;
                public int[] I0000O;
                public int I0000oI00;

                @Override
                public final int I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Set I00000oOI() {
/* 4 */             return new I1IlioI1o1I(this, 7);
                }

                @Override
                public final void I0000Il00O(ii1llo1liOl0 ii1llo1liol0, iOoO1O iooo1o) {
/* 5 */             for (int i = 0; i < this.I0000oI00; i++) {
/* 9 */                 int i2 = this.I0000O[i];
/* 11 */                int i3 = i2 & 31;
/* 13 */                iIIoI1 iiioi1I0000O = I0000O(i3);
/* 19 */                if (iiioi1I0000O.I0000Il00O) {
/* 48 */                    iiiiI1o iiiii1o = new iiiiI1o(0);
/* 51 */                    iiiii1o.I00ilI0I1 = this;
/* 53 */                    iiiii1o.I00iio = iiioi1I0000O;
/* 55 */                    iiiii1o.I00iiI = i3;
/* 60 */                    iiiii1o.I00iiO = i2 >>> (i3 + 5);
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    ii1llo1liol0.I00000oOI(iiioi1I0000O, iiiii1o, iooo1o);
                        } else {
/* 21 */                    lilI1ii lili1ii = this.I00000oOI;
/* 23 */                    int iI00000oIO = lili1ii.I00000oIO();
/* 27 */                    if (i2 >= iI00000oIO) {
/* 29 */                        lili1ii = this.I0000Il00O;
/* 31 */                        i2 -= iI00000oIO;
                            }
/* 42 */                    ii1llo1liol0.I00000oIO(iiioi1I0000O, iiioi1I0000O.I00000oOI.cast(lili1ii.I0000O(i2)), iooo1o);
                        }
                    }
                }

                public final iIIoI1 I0000O(int i) {
/* 1 */             lilI1ii lili1ii = this.I00000oOI;
/* 3 */             int iI00000oIO = lili1ii.I00000oIO();
                    return i >= iI00000oIO ? this.I0000Il00O.I00000oOI(i - iI00000oIO) : lili1ii.I00000oOI(i);
                }
            }
