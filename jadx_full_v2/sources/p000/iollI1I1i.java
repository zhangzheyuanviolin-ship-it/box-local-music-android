            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public abstract class iollI1I1i extends ioOI0o10I {
                public static iollI1I1i I000o00OoI0I(ListenableFuture listenableFuture) {
/* 3 */             if (listenableFuture instanceof iollI1I1i) {
/* 5 */                 return (iollI1I1i) listenableFuture;
                    }
/* 10 */            iolloi0 iolloi0Var = new iolloi0();
/* 13 */            listenableFuture.getClass();
/* 16 */            iolloi0Var.I00ioIO = listenableFuture;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return iolloi0Var;
                }
            }
