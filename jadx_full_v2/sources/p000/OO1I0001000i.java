            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class OO1I0001000i {
                public int I00iOIl;
                public int I00iiI;
                public long I00iiO = 0;
                public long I00iio = OO1I000OIiO.I00000oOI;
                public long I00ilI0I1 = 0;

                public Object I00II0Ol1O0l() {
/* 1 */             return null;
                }

                public abstract int I00OilO00Il(I0iolili01 i0iolili01);

                public int I00Oio() {
/* 9 */             return (int) (this.I00iiO & 4294967295L);
                }

                public int I00Ol10() {
/* 6 */             return (int) (this.I00iiO >> 32);
                }

                public final void I00i01iIIliI() {
/* 23 */            this.I00iOIl = lIiioliIlo.I0000Il00O((int) (this.I00iiO >> 32), IOo0oO11ll1O.I000l1(this.I00iio), IOo0oO11ll1O.I000OiO(this.I00iio));
/* 50 */            this.I00iiI = lIiioliIlo.I0000Il00O((int) (this.I00iiO & 4294967295L), IOo0oO11ll1O.I000iOII(this.I00iio), IOo0oO11ll1O.I000OOo1O(this.I00iio));
/* 52 */            int i = this.I00iOIl;
/* 54 */            long j = this.I00iiO;
/* 74 */            this.I00ilI0I1 = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
                }

                public void I00iIO(long j, float f, Io10IOI io10IOI) {
/* 2 */             I00iIi0i1o(j, f, null);
                }

                public abstract void I00iIi0i1o(long j, float f, Function1 function1);

                public final void I00iOIl(long j) {
/* 7 */             if (IooOl0ol01.I0000Il00O(this.I00iiO, j)) {
/* 29 */                return;
                    }
/* 9 */             this.I00iiO = j;
/* 11 */            I00i01iIIliI();
                }

                public final void I00ilO0(long j) {
/* 7 */             if (IOo0oO11ll1O.I0000O(this.I00iio, j)) {
/* 29 */                return;
                    }
/* 9 */             this.I00iio = j;
/* 11 */            I00i01iIIliI();
                }
            }
