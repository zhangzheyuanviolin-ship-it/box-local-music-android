            package p000;

            import java.util.Objects;
            
            public final class ilO1oIo0o0ii extends iloOo1lIio {
                public final int I00ilI0I1;
                public final String I00ilO0;
                public final io0oIOI1o1i I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilO1oIo0o0ii(io0oIOI1o1i io0oioi1o1i, String str, int i) {
/* 14 */            super(io0oioi1o1i, true);
/* 1 */             this.I00ilI0I1 = i;
                    switch (i) {
                        case 1:
/* 18 */                    this.I00ilO0 = str;
/* 20 */                    Objects.requireNonNull(io0oioi1o1i);
/* 23 */                    this.I00io1l = io0oioi1o1i;
/* 25 */                    super(io0oioi1o1i, true);
                            break;
                        default:
/* 7 */                     this.I00ilO0 = str;
/* 9 */                     Objects.requireNonNull(io0oioi1o1i);
/* 12 */                    this.I00io1l = io0oioi1o1i;
                            break;
                    }
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 23 */                    il000illiO il000illio = this.I00io1l.I0000oI00;
/* 25 */                    lII0I0I000I.I000II(il000illio);
/* 32 */                    il000illio.beginAdUnitExposure(this.I00ilO0, this.I00iiI);
                            break;
                        default:
/* 8 */                     il000illiO il000illio2 = this.I00io1l.I0000oI00;
/* 10 */                    lII0I0I000I.I000II(il000illio2);
/* 17 */                    il000illio2.endAdUnitExposure(this.I00ilO0, this.I00iiI);
                            break;
                    }
                }
            }
