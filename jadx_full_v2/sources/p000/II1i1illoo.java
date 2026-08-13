            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II1i1illoo extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final II1i1olilO0I I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1i1illoo(II1i1olilO0I iI1i1olilO0I, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iI1i1olilO0I;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             II1i1olilO0I iI1i1olilO0I = this.I00iiI;
                    switch (i) {
                        case 0:
                            return ((Boolean) obj).booleanValue() == ((Boolean) iI1i1olilO0I.I00000oOI.I0000O.getValue()).booleanValue() ? iI1i1olilO0I.I000OiO : iI1i1olilO0I.I000OOo1O;
                        default:
/* 10 */                    return iI1i1olilO0I.I0001Ioi1lo;
                    }
                }
            }
