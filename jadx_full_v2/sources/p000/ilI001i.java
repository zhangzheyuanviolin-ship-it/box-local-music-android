            package p000;

            import android.os.Bundle;
            import java.util.Objects;
            
/* 14 */    public final class ilI001i extends iloOo1lIio {
                public final int I00ilI0I1;
                public final io0oIOI1o1i I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilI001i(io0oIOI1o1i io0oioi1o1i, String str) {
/* 12 */            super(io0oioi1o1i, true);
/* 2 */             this.I00ilI0I1 = 0;
/* 4 */             this.I00io1l = str;
/* 6 */             Objects.requireNonNull(io0oioi1o1i);
/* 9 */             this.I00ilO0 = io0oioi1o1i;
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 76 */                    il000illiO il000illio = this.I00ilO0.I0000oI00;
/* 78 */                    lII0I0I000I.I000II(il000illio);
/* 94 */                    il000illio.setUserProperty("fcm", "_ln", OIOiOlIO01.I00O10llo(this.I00io1l), true, this.I00iOIl);
                            break;
                        case 1:
/* 59 */                    il000illiO il000illio2 = this.I00ilO0.I0000oI00;
/* 61 */                    lII0I0I000I.I000II(il000illio2);
/* 70 */                    il000illio2.setConditionalUserProperty((Bundle) this.I00io1l, this.I00iOIl);
                            break;
                        case 2:
/* 39 */                    il000illiO il000illio3 = this.I00ilO0.I0000oI00;
/* 41 */                    lII0I0I000I.I000II(il000illio3);
/* 53 */                    il000illio3.retrieveAndUploadBatches(new ilOOoIl(this, (IlloOIoilIl) this.I00io1l));
                            break;
                        default:
/* 8 */                     il000illiO il000illio4 = this.I00ilO0.I0000oI00;
/* 10 */                    lII0I0I000I.I000II(il000illio4);
/* 33 */                    il000illio4.logHealthData(5, "Error with data collection. Data lost.", OIOiOlIO01.I00O10llo((Exception) this.I00io1l), OIOiOlIO01.I00O10llo(null), OIOiOlIO01.I00O10llo(null));
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public ilI001i(io0oIOI1o1i io0oioi1o1i, Exception exc) {
                    super(io0oioi1o1i, false);
                    this.I00ilI0I1 = 3;
/* 16 */            this.I00io1l = exc;
                    this.I00ilO0 = io0oioi1o1i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public ilI001i(io0oIOI1o1i io0oioi1o1i, Object obj, int i) {
                    super(io0oioi1o1i, true);
/* 17 */            this.I00ilI0I1 = i;
                    this.I00io1l = obj;
                    this.I00ilO0 = io0oioi1o1i;
                }
            }
