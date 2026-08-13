            package p000;
            
            public final class IiIO1I1I1 implements IIiOOIoi0 {
                public final int I00iOIl;
                public IiIO1ol1i1o0 I00iiI;

                public IiIO1I1I1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiIO1ol1i1o0 iiIO1ol1i1o0 = this.I00iiI;
                    switch (i) {
                        case 0:
                            synchronized (iiIO1ol1i1o0.I00000oIO) {
/* 40 */                        iiIO1ol1i1o0.I0000O = iIiOOI;
                            }
/* 58 */                    return "DeferrableSurface-termination(" + iiIO1ol1i1o0 + ")";
                        default:
                            synchronized (iiIO1ol1i1o0.I00000oIO) {
/* 11 */                        iiIO1ol1i1o0.I0001Ioi1lo = iIiOOI;
                            }
/* 29 */                    return "DeferrableSurface-close(" + iiIO1ol1i1o0 + ")";
                    }
                }
            }
