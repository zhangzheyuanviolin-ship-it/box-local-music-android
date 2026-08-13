            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public abstract class iio0IIOOIOI {
                public static final ExecutorService I00000oIO(boolean z) {
/* 3 */             IOlloI0Oo iOlloI0Oo = new IOlloI0Oo();
/* 6 */             iOlloI0Oo.I00000oOI = z;
/* 14 */            iOlloI0Oo.I00000oIO = new AtomicInteger(0);
/* 16 */            VarHandle.storeStoreFence();
/* 39 */            return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), iOlloI0Oo);
                }
            }
