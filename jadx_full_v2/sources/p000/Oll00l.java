            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Oll00l implements IIiOOIoi0 {
                public final int I00iOIl;
                public AtomicReference I00iiI;
                public String I00iiO;

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
                    switch (this.I00iOIl) {
                        case 0:
/* 34 */                    AtomicReference atomicReference = this.I00iiI;
/* 36 */                    String str = this.I00iiO;
/* 38 */                    atomicReference.set(iIiOOI);
/* 43 */                    return str.concat("-cancellation");
                        case 1:
/* 20 */                    AtomicReference atomicReference2 = this.I00iiI;
/* 22 */                    String str2 = this.I00iiO;
/* 24 */                    atomicReference2.set(iIiOOI);
/* 29 */                    return str2.concat("-status");
                        default:
/* 6 */                     AtomicReference atomicReference3 = this.I00iiI;
/* 8 */                     String str3 = this.I00iiO;
/* 10 */                    atomicReference3.set(iIiOOI);
/* 15 */                    return str3.concat("-Surface");
                    }
                }
            }
