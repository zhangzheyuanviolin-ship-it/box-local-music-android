            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            
            public final class IlloO1 implements Runnable {
                public final int I00iOIl;
                public ListenableFuture I00iiI;

                public IlloO1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    this.I00iiI.cancel(true);
                            break;
                        default:
                            try {
/* 8 */                         IlloOoiiO.I00000oIO(this.I00iiI);
                                break;
                            } catch (ExecutionException e) {
/* 16 */                        lOii1o loii1o = new lOii1o(3);
/* 19 */                        loii1o.I00iiI = e;
/* 21 */                        VarHandle.storeStoreFence();
/* 28 */                        iO1lilOi.I00000oOI().post(loii1o);
                            }
                    }
                }
            }
