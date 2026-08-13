            package p000;
            
            public final class Ol1o0ioII01 extends OlO1Ol0il0i {
                public OO0lili I0000Il00O;
                public int I0000O;

                public Ol1o0ioII01(long j, OO0lili oO0lili) {
/* 1 */             super(j);
/* 4 */             this.I0000Il00O = oO0lili;
                }

                @Override
                public final void I00000oIO(OlO1Ol0il0i olO1Ol0il0i) {
/* 1 */             Ol1o0ioII01 ol1o0ioII01 = (Ol1o0ioII01) olO1Ol0il0i;
                    synchronized (iO100OlI00o.I00000oIO) {
/* 8 */                 this.I0000Il00O = ol1o0ioII01.I0000Il00O;
/* 12 */                this.I0000O = ol1o0ioII01.I0000O;
                    }
                }

                @Override
                public final OlO1Ol0il0i I00000oOI(long j) {
/* 5 */             return new Ol1o0ioII01(j, this.I0000Il00O);
                }
            }
