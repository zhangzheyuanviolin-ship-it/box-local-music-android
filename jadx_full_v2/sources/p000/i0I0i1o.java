            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i0I0i1o implements IllOOo00lI {
                public final int I00iOIl;
                public i0I0io000 I00iiI;

                public i0I0i1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i0I0io000 i0i0io000 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 24 */                    float f = i0i0io000.I00000oOI;
/* 26 */                    float f2 = i0i0io000.I0000Il00O;
/* 28 */                    i0I0liI i0i0lii = new i0I0liI();
/* 31 */                    i0i0lii.I00000oIO = f;
/* 33 */                    i0i0lii.I00000oOI = f2;
/* 35 */                    VarHandle.storeStoreFence();
/* 38 */                    return i0i0lii;
                        default:
/* 18 */                    return new OI0lOii0I((i0I0liI) i0i0io000.I0000O.getValue());
                    }
                }
            }
