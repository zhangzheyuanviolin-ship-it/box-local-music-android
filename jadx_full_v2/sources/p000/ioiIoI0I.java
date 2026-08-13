            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class ioiIoI0I extends ioili1lI1l {
                @Override
                public final Object I000oI1ioi(Object obj, Object obj2) {
/* 1 */             iol0ioiIO1iI iol0ioiio1ii = (iol0ioiIO1iI) obj;
/* 3 */             ListenableFuture listenableFutureZza = iol0ioiio1ii.zza(obj2);
/* 7 */             if (listenableFutureZza != null) {
/* 9 */                 return listenableFutureZza;
                    }
/* 20 */            IOOlIIilOl0.I000II(lio1IOlIiiO.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iol0ioiio1ii));
/* 23 */            return null;
                }

                @Override
                public final void I00100l0(Object obj) {
/* 3 */             I000OiO((ListenableFuture) obj);
                }
            }
