            package p000;

            import java.util.Objects;
            
/* 39 */    public final class ilOiooOI0iO extends iloOo1lIio {
                public final int I00ilI0I1;
                public final iioi1o1OO I00ilO0;
                public final io0oIOI1o1i I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilOiooOI0iO(io0oIOI1o1i io0oioi1o1i, iioi1o1OO iioi1o1oo, int i) {
/* 14 */            super(io0oioi1o1i, true);
/* 1 */             this.I00ilI0I1 = i;
                    switch (i) {
                        case 1:
/* 29 */                    this.I00ilO0 = iioi1o1oo;
/* 31 */                    Objects.requireNonNull(io0oioi1o1i);
/* 34 */                    this.I00io1l = io0oioi1o1i;
/* 36 */                    super(io0oioi1o1i, true);
                            break;
                        case 2:
/* 18 */                    this.I00ilO0 = iioi1o1oo;
/* 20 */                    Objects.requireNonNull(io0oioi1o1i);
/* 23 */                    this.I00io1l = io0oioi1o1i;
/* 25 */                    super(io0oioi1o1i, true);
                            break;
                        default:
/* 7 */                     this.I00ilO0 = iioi1o1oo;
/* 9 */                     Objects.requireNonNull(io0oioi1o1i);
/* 12 */                    this.I00io1l = io0oioi1o1i;
                            break;
                    }
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 60 */                    il000illiO il000illio = this.I00io1l.I0000oI00;
/* 62 */                    lII0I0I000I.I000II(il000illio);
/* 67 */                    il000illio.getGmpAppId(this.I00ilO0);
                            break;
                        case 1:
/* 47 */                    il000illiO il000illio2 = this.I00io1l.I0000oI00;
/* 49 */                    lII0I0I000I.I000II(il000illio2);
/* 54 */                    il000illio2.getCachedAppInstanceId(this.I00ilO0);
                            break;
                        case 2:
/* 34 */                    il000illiO il000illio3 = this.I00io1l.I0000oI00;
/* 36 */                    lII0I0I000I.I000II(il000illio3);
/* 41 */                    il000illio3.generateEventId(this.I00ilO0);
                            break;
                        case 3:
/* 21 */                    il000illiO il000illio4 = this.I00io1l.I0000oI00;
/* 23 */                    lII0I0I000I.I000II(il000illio4);
/* 28 */                    il000illio4.getCurrentScreenName(this.I00ilO0);
                            break;
                        default:
/* 8 */                     il000illiO il000illio5 = this.I00io1l.I0000oI00;
/* 10 */                    lII0I0I000I.I000II(il000illio5);
/* 15 */                    il000illio5.getCurrentScreenClass(this.I00ilO0);
                            break;
                    }
                }

                @Override
                public final void I00000oOI() {
/* 1 */             int i = this.I00ilI0I1;
/* 4 */             iioi1o1OO iioi1o1oo = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 25 */                    iioi1o1oo.I001i1lo1io(null);
                            break;
                        case 1:
/* 21 */                    iioi1o1oo.I001i1lo1io(null);
                            break;
                        case 2:
/* 17 */                    iioi1o1oo.I001i1lo1io(null);
                            break;
                        case 3:
/* 13 */                    iioi1o1oo.I001i1lo1io(null);
                            break;
                        default:
/* 9 */                     iioi1o1oo.I001i1lo1io(null);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 40 */        public ilOiooOI0iO(io0oIOI1o1i io0oioi1o1i, iioi1o1OO iioi1o1oo, int i, boolean z) {
                    super(io0oioi1o1i, true);
/* 41 */            this.I00ilI0I1 = i;
                    this.I00ilO0 = iioi1o1oo;
                    this.I00io1l = io0oioi1o1i;
                }
            }
