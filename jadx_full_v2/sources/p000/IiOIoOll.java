            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiOIoOll implements IllOOo00lI {
                public final int I00iOIl;
                public final IiOO0Il I00iiI;

                public IiOIoOll(IiOO0Il iiOO0Il, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iiOO0Il;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiOO0Il iiOO0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 15 */                    IiOO0I1o iiOO0I1o = new IiOO0I1o();
/* 18 */                    iiOO0I1o.I00li1OI = iiOO0Il;
/* 20 */                    VarHandle.storeStoreFence();
/* 23 */                    return iiOO0I1o;
                        default:
/* 8 */                     return iiOO0Il.I00IO1oi11O();
                    }
                }
            }
