            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public abstract class liIOoOi1Ii1 extends li10iIlI1O {
                public static liIOoOi1Ii1 I000o00OoI0I(ListenableFuture listenableFuture) {
/* 3 */             if (listenableFuture instanceof liIOoOi1Ii1) {
/* 5 */                 return (liIOoOi1Ii1) listenableFuture;
                    }
/* 10 */            liIioooO0 liiioooo0 = new liIioooO0();
/* 13 */            listenableFuture.getClass();
/* 16 */            liiioooo0.I00ioIO = listenableFuture;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return liiioooo0;
                }
            }
