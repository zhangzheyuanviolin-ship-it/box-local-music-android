            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public final class li1ii1 extends li1o00OoI0 {
                @Override
                public final void I000oI1ioi(Object obj) {
/* 3 */             I000OiO((ListenableFuture) obj);
                }

                @Override
                public final Object I00100l0(Object obj, Object obj2) {
/* 1 */             liI0OilOI1I1 lii0oiloi1i1 = (liI0OilOI1I1) obj;
/* 3 */             ListenableFuture listenableFutureZza = lii0oiloi1i1.zza(obj2);
/* 7 */             if (listenableFutureZza != null) {
/* 9 */                 return listenableFutureZza;
                    }
/* 20 */            IOOlIIilOl0.I000II(ll0Oo10I10.I00000oIO("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", lii0oiloi1i1));
/* 23 */            return null;
                }
            }
