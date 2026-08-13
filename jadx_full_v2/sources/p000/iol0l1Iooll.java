            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class iol0l1Iooll extends iolIiIIIOo1 {
                @Override
                public final Object I000oI1ioi(Object obj, Object obj2) {
/* 1 */             iollIi0II1o iollii0ii1o = (iollIi0II1o) obj;
/* 3 */             ListenableFuture listenableFutureZza = iollii0ii1o.zza(obj2);
/* 7 */             if (listenableFutureZza != null) {
/* 9 */                 return listenableFutureZza;
                    }
/* 20 */            IOOlIIilOl0.I000II(lio1l1O0i.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iollii0ii1o));
/* 23 */            return null;
                }

                @Override
                public final void I00100l0(Object obj) {
/* 3 */             I000OiO((ListenableFuture) obj);
                }
            }
