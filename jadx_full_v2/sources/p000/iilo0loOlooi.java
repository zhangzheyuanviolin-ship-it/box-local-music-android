            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.LinkedBlockingDeque;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public abstract class iilo0loOlooi {
                public static ThreadPoolExecutor I00000oIO(String str) {
/* 3 */             IOlOII iOlOII = new IOlOII();
/* 6 */             iOlOII.I00000oIO = str;
/* 8 */             VarHandle.storeStoreFence();
/* 24 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), iOlOII);
/* 28 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 77 */            return threadPoolExecutor;
                }
            }
