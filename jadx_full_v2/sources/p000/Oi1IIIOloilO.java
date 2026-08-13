            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oi1IIIOloilO extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Oi1IOl I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi1IIIOloilO(Oi1IOl oi1IOl, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oi1IOl;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oi1IOl oi1IOl = this.I00iiI;
                    switch (i) {
                        case 0:
/* 57 */                    return Double.valueOf(oi1IOl.I000o00OoI0I.I0000O(lIiioliIlo.I00000oIO(((Number) obj).doubleValue(), oi1IOl.I0000oI00, oi1IOl.I0001Ioi1lo)));
                        default:
/* 30 */                    return Double.valueOf(lIiioliIlo.I00000oIO(oi1IOl.I000iOII.I0000O(((Number) obj).doubleValue()), oi1IOl.I0000oI00, oi1IOl.I0001Ioi1lo));
                    }
                }
            }
