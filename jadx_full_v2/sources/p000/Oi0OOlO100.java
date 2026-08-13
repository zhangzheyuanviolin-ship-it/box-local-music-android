            package p000;
            
            public final class Oi0OOlO100 implements IIiOOIoi0 {
                public final int I00iOIl;
                public Oi0Oi10I I00iiI;

                public Oi0OOlO100(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oi0Oi10I oi0Oi10I = this.I00iiI;
                    switch (i) {
                        case 0:
/* 13 */                    oi0Oi10I.I0000oI00 = iIiOOI;
/* 15 */                    return "CaptureCompleteFuture";
                        default:
/* 8 */                     oi0Oi10I.I0001Ioi1lo = iIiOOI;
/* 10 */                    return "RequestCompleteFuture";
                    }
                }
            }
