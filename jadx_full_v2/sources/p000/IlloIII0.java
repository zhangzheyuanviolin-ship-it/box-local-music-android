            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class IlloIII0 implements IIiOOIoi0, I1Olli1oIi {
                public final int I00iOIl;
                public ListenableFuture I00iiI;

                @Override
                public ListenableFuture apply(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             ListenableFuture listenableFuture = this.I00iiI;
                    switch (i) {
                        case 1:
/* 29 */                    return ((IIlI0I) listenableFuture.get()).I00000oIO();
                        default:
/* 16 */                    return ((IIlI0I) listenableFuture.get()).I00000oOI();
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             ListenableFuture listenableFuture = this.I00iiI;
/* 8 */             iIllIoiiIO.I0001Ioi1lo(false, listenableFuture, iIiOOI, Iii11l.I00000oIO());
/* 26 */            return "nonCancellationPropagating[" + listenableFuture + "]";
                }
            }
