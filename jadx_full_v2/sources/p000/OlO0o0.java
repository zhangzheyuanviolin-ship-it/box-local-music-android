            package p000;
            
            public final class OlO0o0 extends OlO1Ol0il0i {
                public I01Io11IiiiO I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                public OlO0o0(long j, I01Io11IiiiO i01Io11IiiiO) {
/* 1 */             super(j);
/* 4 */             this.I0000Il00O = i01Io11IiiiO;
                }

                @Override
                public final void I00000oIO(OlO1Ol0il0i olO1Ol0il0i) {
                    synchronized (iO0oloi1IO0.I00000oIO) {
/* 9 */                 this.I0000Il00O = ((OlO0o0) olO1Ol0il0i).I0000Il00O;
/* 16 */                this.I0000O = ((OlO0o0) olO1Ol0il0i).I0000O;
/* 22 */                this.I0000oI00 = ((OlO0o0) olO1Ol0il0i).I0000oI00;
                    }
                }

                @Override
                public final OlO1Ol0il0i I00000oOI(long j) {
/* 5 */             return new OlO0o0(j, this.I0000Il00O);
                }
            }
