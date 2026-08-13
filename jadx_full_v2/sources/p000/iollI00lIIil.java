            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public abstract class iollI00lIIil extends ioOI0i0o11I {
                public static iollI00lIIil I000o00OoI0I(ListenableFuture listenableFuture) {
/* 3 */             if (listenableFuture instanceof iollI00lIIil) {
/* 5 */                 return (iollI00lIIil) listenableFuture;
                    }
/* 10 */            iolloOOi00 iolloooi00 = new iolloOOi00();
/* 13 */            listenableFuture.getClass();
/* 16 */            iolloooi00.I00ioIO = listenableFuture;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return iolloooi00;
                }
            }
