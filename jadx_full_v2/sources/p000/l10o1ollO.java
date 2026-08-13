            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.concurrent.ExecutionException;
            
            public abstract class l10o1ollO {
                public static final Object I00000oIO(ListenableFuture listenableFuture, IOoil1iiIilo iOoil1iiIilo) {
                    try {
/* 5 */                 if (listenableFuture.isDone()) {
/* 7 */                     return li010iilO.I00000oIO(listenableFuture);
                        }
/* 19 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 22 */                iIoOoIol0Io0.I00111O();
/* 28 */                illioiliioi illioiliioiVar = new illioiliioi(3);
/* 31 */                illioiliioiVar.I00iiI = listenableFuture;
/* 33 */                illioiliioiVar.I00iiO = iIoOoIol0Io0;
/* 35 */                VarHandle.storeStoreFence();
/* 40 */                listenableFuture.addListener(illioiliioiVar, Iii11Ooi.I00iOIl);
/* 47 */                I00iiI i00iiI = new I00iiI(24);
/* 50 */                i00iiI.I00iiI = listenableFuture;
/* 52 */                VarHandle.storeStoreFence();
/* 55 */                iIoOoIol0Io0.I001IO000(i00iiI);
/* 58 */                Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 62 */                Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 64 */                return objI0010I0i;
                    } catch (ExecutionException e) {
/* 89 */                throw e.getCause();
                    }
                }

                public static O010oO I00000oOI(Ii0110 ii0110, IlliIl1l11O illiIl1l11O) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             Ii01I10 ii01I10 = Ii01I10.I00iOIl;
/* 3 */             Ii01I10 ii01I102 = Ii01I10.I00iOIl;
/* 14 */            O10lo10Io o10lo10Io = new O10lo10Io(iioloOl.I00000oOI(ii0110, Il00o11.I00iOIl), true);
/* 19 */            O010oO o010oO = new O010oO();
/* 22 */            o010oO.I00iOIl = o10lo10Io;
/* 29 */            o010oO.I00iiI = new Oio0llilli();
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            o10lo10Io.I00ilI0I1 = o010oO;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            o10lo10Io.I00iiO(ii01I10, o10lo10Io, illiIl1l11O);
/* 89 */            return o010oO;
                }
            }
