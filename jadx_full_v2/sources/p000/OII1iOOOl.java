            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class OII1iOOOl extends Ol1il1o1 {
                public final Function1 I0000oI00;
                public final Ol1il1o1 I0001Ioi1lo;

                public OII1iOOOl(long j, Ol1l0OoOo ol1l0OoOo, Function1 function1, Ol1il1o1 ol1il1o1) {
/* 1 */             super(j, ol1l0OoOo);
/* 4 */             this.I0000oI00 = function1;
/* 6 */             this.I0001Ioi1lo = ol1il1o1;
/* 8 */             ol1il1o1.I000iOII();
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             Ol1il1o1 ol1il1o1 = this.I0001Ioi1lo;
/* 5 */             if (this.I0000Il00O) {
/* 55 */                return;
                    }
/* 15 */            if (this.I00000oOI != ol1il1o1.I000II()) {
/* 17 */                I00000oIO();
                    }
/* 20 */            ol1il1o1.I000l1();
/* 24 */            this.I0000Il00O = true;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 29 */                I000oI1ioi();
                    }
                }

                @Override
                public final Function1 I0000oI00() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final boolean I0001Ioi1lo() {
/* 1 */             return true;
                }

                @Override
                public final Function1 I000OOo1O() {
/* 1 */             return null;
                }

                @Override
                public final void I000iOII() {
/* 1 */             iO100OlI00o.I00000oIO();
/* 20 */            throw null;
                }

                @Override
                public final void I000l1() {
/* 1 */             iO100OlI00o.I00000oIO();
/* 20 */            throw null;
                }

                @Override
                public final void I000o00OoI0I(OlO11I0O1l olO11I0O1l) {
/* 1 */             OiioI1Io0o oiioI1Io0o = Ol1l1lI1Ili.I00000oIO;
/* 29 */            throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
                }

                @Override
                public final Ol1il1o1 I001IIilI0O(Function1 function1) {
/* 16 */            return new OII1iOOOl(this.I00000oOI, this.I00000oIO, Ol1l1lI1Ili.I000OOo1O(function1, this.I0000oI00, true), this.I0001Ioi1lo);
                }

                @Override
/* 19 */        public final void I000lI() {
                }
            }
