            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class I00l0OO0IO extends I00ll1 {
                @Override
                public final Object I00100l0(Object obj, Throwable th) {
/* 1 */             I1Oll0OOO i1Oll0OOO = (I1Oll0OOO) obj;
/* 3 */             ListenableFuture listenableFutureApply = i1Oll0OOO.apply(th);
/* 9 */             lII0I0I01I1l.I0000oI00(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", i1Oll0OOO);
/* 37 */            return listenableFutureApply;
                }

                @Override
                public final void I00100o1O0lo(Object obj) {
/* 3 */             I000o00OoI0I((ListenableFuture) obj);
                }
            }
