            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class l0IlooI extends l0O11I1ll {
                @Override
                public final Object I000oI1ioi(Object obj, Object obj2) {
/* 1 */             l0OI000IIIi l0oi000iiii = (l0OI000IIIi) obj;
/* 3 */             ListenableFuture listenableFutureZza = l0oi000iiii.zza(obj2);
/* 7 */             if (listenableFutureZza != null) {
/* 9 */                 return listenableFutureZza;
                    }
/* 20 */            IOOlIIilOl0.I000II(lio011oio0.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", l0oi000iiii));
/* 23 */            return null;
                }

                @Override
                public final void I00100l0(Object obj) {
/* 3 */             I000OiO((ListenableFuture) obj);
                }
            }
