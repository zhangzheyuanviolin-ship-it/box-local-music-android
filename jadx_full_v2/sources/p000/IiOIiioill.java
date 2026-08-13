            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiOIiioill implements IllOOo00lI {
                public final int I00iOIl;
                public final IiOIl1III0l I00iiI;

                public IiOIiioill(IiOIl1III0l iiOIl1III0l, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iiOIl1III0l;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiOIl1III0l iiOIl1III0l = this.I00iiI;
                    switch (i) {
                        case 0:
/* 15 */                    IiOIl0o iiOIl0o = new IiOIl0o();
/* 18 */                    iiOIl0o.I00li1OI = iiOIl1III0l;
/* 20 */                    VarHandle.storeStoreFence();
/* 23 */                    return iiOIl0o;
                        default:
/* 8 */                     return iiOIl1III0l.I00IO1oi11O();
                    }
                }
            }
