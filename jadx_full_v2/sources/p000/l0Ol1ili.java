            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public abstract class l0Ol1ili extends l01iOilOl1il {
                public static l0Ol1ili I000o00OoI0I(ListenableFuture listenableFuture) {
/* 3 */             if (listenableFuture instanceof l0Ol1ili) {
/* 5 */                 return (l0Ol1ili) listenableFuture;
                    }
/* 10 */            l0OoIioOl l0ooiiool = new l0OoIioOl();
/* 13 */            listenableFuture.getClass();
/* 16 */            l0ooiiool.I00ioIO = listenableFuture;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return l0ooiiool;
                }
            }
