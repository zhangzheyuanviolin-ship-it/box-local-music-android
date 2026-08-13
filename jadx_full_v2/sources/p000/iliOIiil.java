            package p000;

            import android.os.Bundle;
            
/* 17 */    public final class iliOIiil extends iloOo1lIio {
                public final int I00ilI0I1 = 1;
                public final String I00ilO0;
                public final String I00io1l;
                public final boolean I00ioIO;
                public final io0oIOI1o1i I00l0I0l0lO1;
                public final Object I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iliOIiil(io0oIOI1o1i io0oioi1o1i, String str, String str2, boolean z, iioi1o1OO iioi1o1oo) {
/* 15 */            super(io0oioi1o1i, true);
/* 4 */             this.I00ilO0 = str;
/* 6 */             this.I00io1l = str2;
/* 8 */             this.I00ioIO = z;
/* 10 */            this.I00l0OO0IO = iioi1o1oo;
/* 12 */            this.I00l0I0l0lO1 = io0oioi1o1i;
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 35 */                    il000illiO il000illio = this.I00l0I0l0lO1.I0000oI00;
/* 37 */                    lII0I0I000I.I000II(il000illio);
/* 50 */                    il000illio.getUserProperties(this.I00ilO0, this.I00io1l, this.I00ioIO, (iioi1o1OO) this.I00l0OO0IO);
                            break;
                        default:
/* 6 */                     long j = this.I00iOIl;
/* 8 */                     long j2 = this.I00iiI;
/* 12 */                    il000illiO il000illio2 = this.I00l0I0l0lO1.I0000oI00;
/* 14 */                    lII0I0I000I.I000II(il000illio2);
/* 29 */                    il000illio2.logEventWithElapsedTime(this.I00ilO0, this.I00io1l, (Bundle) this.I00l0OO0IO, this.I00ioIO, true, j, j2);
                            break;
                    }
                }

                @Override
                public void I00000oOI() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 12 */                    ((iioi1o1OO) this.I00l0OO0IO).I001i1lo1io(null);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public iliOIiil(io0oIOI1o1i io0oioi1o1i, String str, String str2, Bundle bundle, boolean z) {
/* 20 */            super(io0oioi1o1i, true);
/* 19 */            this.I00ilO0 = str;
                    this.I00io1l = str2;
                    this.I00l0OO0IO = bundle;
                    this.I00ioIO = z;
                    this.I00l0I0l0lO1 = io0oioi1o1i;
                }
            }
