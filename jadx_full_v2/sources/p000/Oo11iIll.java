            package p000;
            
            public final class Oo11iIll implements Oi110Iil1i0 {
                public final long I00000oOI;
                public final Oi110Iil1i0 I0000Il00O;

                public Oo11iIll(long j, Oi110Iil1i0 oi110Iil1i0) {
/* 15 */            lII1OI11o1I.I00000oIO("Timeout must be non-negative.", j >= 0);
/* 18 */            this.I00000oOI = j;
/* 20 */            this.I0000Il00O = oi110Iil1i0;
                }

                @Override
                public final long I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Oi110I I00000oOI(IIo0IiiO iIo0IiiO) {
/* 3 */             Oi110I oi110II00000oOI = this.I0000Il00O.I00000oOI(iIo0IiiO);
/* 9 */             long j = this.I00000oOI;
                    return (j <= 0 || iIo0IiiO.I00000oOI < j - oi110II00000oOI.I00000oIO) ? oi110II00000oOI : Oi110I.I0000O;
                }
            }
