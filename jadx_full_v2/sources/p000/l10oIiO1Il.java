            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            
            public abstract class l10oIiO1Il {
                public static final Object I00000oIO(ListenableFuture listenableFuture, IOoilo iOoilo) {
                    try {
/* 5 */                 if (listenableFuture.isDone()) {
/* 7 */                     return I01Ol1o0.I0001Ioi1lo(listenableFuture);
                        }
/* 19 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoilo));
/* 22 */                iIoOoIol0Io0.I00111O();
/* 28 */                iooiio1i0 iooiio1i0Var = new iooiio1i0(3);
/* 31 */                iooiio1i0Var.I00iiI = listenableFuture;
/* 33 */                iooiio1i0Var.I00iiO = iIoOoIol0Io0;
/* 35 */                VarHandle.storeStoreFence();
/* 40 */                listenableFuture.addListener(iooiio1i0Var, Iii10o1oiO1.I00iOIl);
/* 49 */                iIoOoIol0Io0.I001IO000(new I10iOo0il1(listenableFuture, 5));
/* 52 */                Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 56 */                Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 58 */                return objI0010I0i;
                    } catch (ExecutionException e) {
/* 106 */               throw e.getCause();
                    }
                }
            }
