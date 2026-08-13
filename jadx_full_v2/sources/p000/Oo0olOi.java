            package p000;

            import android.os.Handler;
            import android.os.HandlerThread;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            public final class Oo0olOi implements IllOOo00lI {
                public final int I00iOIl;
                public Oo0olliOi1 I00iiI;
                public IIo000I0ilI I00iiO;

                public Oo0olOi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 55 */                    Oo0olliOi1 oo0olliOi1 = this.I00iiI;
/* 57 */                    IIo000I0ilI iIo000I0ilI = this.I00iiO;
/* 63 */                    ((IIloIo1I0i) oo0olliOi1.I0001Ioi1lo).getClass();
/* 72 */                    HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", oo0olliOi1.I0000O);
/* 75 */                    handlerThread.start();
/* 78 */                    IIlooO0iI iIlooO0iI = IIlooO0iI.I00iiO;
/* 84 */                    OOIl1i1 oOIl1i1 = new OOIl1i1(15);
/* 87 */                    oOIl1i1.I00iiI = handlerThread;
/* 89 */                    VarHandle.storeStoreFence();
/* 92 */                    iIo000I0ilI.I00000oIO(iIlooO0iI, oOIl1i1);
/* 101 */                   return new Handler(handlerThread.getLooper());
                        default:
/* 6 */                     Oo0olliOi1 oo0olliOi12 = this.I00iiI;
/* 8 */                     IIo000I0ilI iIo000I0ilI2 = this.I00iiO;
/* 14 */                    Executor executor = ((IIloIo1I0i) oo0olliOi12.I0001Ioi1lo).I00000oIO;
/* 16 */                    if (executor != null) {
/* 54 */                        return executor;
                            }
/* 33 */                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, I1010l011o.I00000oOI(I1010l011o.I0000Il00O(I1010l011o.I00000oOI, "CXCP-Camera-E"), oo0olliOi12.I0000O));
/* 37 */                    IIlooO0iI iIlooO0iI2 = IIlooO0iI.I00iiO;
/* 43 */                    OOIl1i1 oOIl1i12 = new OOIl1i1(16);
/* 46 */                    oOIl1i12.I00iiI = executorServiceNewFixedThreadPool;
/* 48 */                    VarHandle.storeStoreFence();
/* 51 */                    iIo000I0ilI2.I00000oIO(iIlooO0iI2, oOIl1i12);
/* 54 */                    return executorServiceNewFixedThreadPool;
                    }
                }
            }
