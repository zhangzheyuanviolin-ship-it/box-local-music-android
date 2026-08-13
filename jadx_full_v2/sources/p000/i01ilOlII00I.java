            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            
            public abstract class i01ilOlII00I {
                public static final String I00000oIO = IIi0oIl.I000OiO("WorkerWrapper");

                public static final Object I00000oIO(ListenableFuture listenableFuture, O10oIiIi0OI0 o10oIiIi0OI0, Oll0io oll0io) {
                    Object obj;
                    try {
/* 5 */                 int i = 1;
/* 6 */                 if (listenableFuture.isDone()) {
/* 8 */                     boolean z = false;
                            while (true) {
                                try {
/* 9 */                             obj = listenableFuture.get();
                                    break;
                                } catch (InterruptedException unused) {
/* 34 */                            z = true;
                                } catch (Throwable th) {
/* 24 */                            if (z) {
/* 30 */                                Thread.currentThread().interrupt();
                                    }
/* 33 */                            throw th;
                                }
                            }
/* 13 */                    if (z) {
/* 19 */                        Thread.currentThread().interrupt();
                            }
/* 22 */                    return obj;
                        }
/* 42 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oll0io));
/* 45 */                iIoOoIol0Io0.I00111O();
/* 51 */                IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(3);
/* 54 */                illoOi1I1OO.I00iiI = listenableFuture;
/* 56 */                illoOi1I1OO.I00iiO = iIoOoIol0Io0;
/* 58 */                VarHandle.storeStoreFence();
/* 63 */                listenableFuture.addListener(illoOi1I1OO, Iii1101i100I.I00iOIl);
/* 68 */                o0iIOlIoo00 o0iiolioo00 = new o0iIOlIoo00(i);
/* 71 */                o0iiolioo00.I00iiI = o10oIiIi0OI0;
/* 73 */                o0iiolioo00.I00iiO = listenableFuture;
/* 75 */                VarHandle.storeStoreFence();
/* 78 */                iIoOoIol0Io0.I001IO000(o0iiolioo00);
/* 81 */                Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 85 */                Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 87 */                return objI0010I0i;
                    } catch (ExecutionException e) {
/* 98 */                throw e.getCause();
                    }
                }
            }
