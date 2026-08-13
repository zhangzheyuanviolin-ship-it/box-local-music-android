            package p000;

            import android.os.Bundle;
            import java.util.Objects;
            
/* 18 */    public final class ilI11O0l1 extends iloOo1lIio {
                public final int I00ilI0I1;
                public final String I00ilO0;
                public final String I00io1l;
                public final io0oIOI1o1i I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilI11O0l1(io0oIOI1o1i io0oioi1o1i, il1l0io1O il1l0io1o, String str, String str2) {
/* 16 */            super(io0oioi1o1i, true);
/* 2 */             this.I00ilI0I1 = 2;
/* 4 */             this.I00l0I0l0lO1 = il1l0io1o;
/* 6 */             this.I00ilO0 = str;
/* 8 */             this.I00io1l = str2;
/* 10 */            Objects.requireNonNull(io0oioi1o1i);
/* 13 */            this.I00ioIO = io0oioi1o1i;
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 49 */                    il000illiO il000illio = this.I00ioIO.I0000oI00;
/* 51 */                    lII0I0I000I.I000II(il000illio);
/* 62 */                    il000illio.clearConditionalUserProperty(this.I00ilO0, this.I00io1l, (Bundle) this.I00l0I0l0lO1);
                            break;
                        case 1:
/* 30 */                    il000illiO il000illio2 = this.I00ioIO.I0000oI00;
/* 32 */                    lII0I0I000I.I000II(il000illio2);
/* 43 */                    il000illio2.getConditionalUserProperties(this.I00ilO0, this.I00io1l, (iioi1o1OO) this.I00l0I0l0lO1);
                            break;
                        default:
/* 8 */                     il000illiO il000illio3 = this.I00ioIO.I0000oI00;
/* 10 */                    lII0I0I000I.I000II(il000illio3);
/* 24 */                    il000illio3.setCurrentScreenByScionActivityInfo((il1l0io1O) this.I00l0I0l0lO1, this.I00ilO0, this.I00io1l, this.I00iOIl);
                            break;
                    }
                }

                @Override
                public void I00000oOI() {
                    switch (this.I00ilI0I1) {
                        case 1:
/* 12 */                    ((iioi1o1OO) this.I00l0I0l0lO1).I001i1lo1io(null);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public ilI11O0l1(io0oIOI1o1i io0oioi1o1i, String str, String str2, Object obj, int i) {
                    super(io0oioi1o1i, true);
/* 20 */            this.I00ilI0I1 = i;
                    this.I00ilO0 = str;
                    this.I00io1l = str2;
                    this.I00l0I0l0lO1 = obj;
                    this.I00ioIO = io0oioi1o1i;
                }
            }
