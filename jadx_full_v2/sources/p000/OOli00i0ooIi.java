            package p000;

            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class OOli00i0ooIi extends Ol1il1o1 {
                public Function1 I0000oI00;
                public int I0001Ioi1lo;

                @Override
                public final void I0000Il00O() {
/* 3 */             if (this.I0000Il00O) {
/* 55 */                return;
                    }
/* 5 */             I000l1();
/* 9 */             this.I0000Il00O = true;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 14 */                I000oI1ioi();
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
                    this.I0001Ioi1lo++;
                }

                @Override
                public final void I000l1() {
                    int i = this.I0001Ioi1lo - 1;
/* 5 */             this.I0001Ioi1lo = i;
/* 7 */             if (i == 0) {
/* 9 */                 I00000oIO();
                    }
                }

                @Override
                public final void I000o00OoI0I(OlO11I0O1l olO11I0O1l) {
/* 1 */             OiioI1Io0o oiioI1Io0o = Ol1l1lI1Ili.I00000oIO;
/* 29 */            throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
                }

                @Override
                public final Ol1il1o1 I001IIilI0O(Function1 function1) {
/* 1 */             Ol1l1lI1Ili.I001IO000(this);
/* 18 */            return new OII1iOOOl(this.I00000oOI, this.I00000oIO, Ol1l1lI1Ili.I000OOo1O(function1, this.I0000oI00, true), this);
                }

                @Override
/* 19 */        public final void I000lI() {
                }
            }
