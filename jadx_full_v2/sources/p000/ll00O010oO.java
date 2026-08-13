            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class ll00O010oO {
                public static Executor I00000oIO(Executor executor, ioo0IOiOoi1 ioo0ioiooi1) {
/* 1 */             executor.getClass();
/* 6 */             if (executor == iollol1ioIi.I00iOIl) {
/* 8 */                 return executor;
                    }
/* 12 */            l011O01 l011o01 = new l011O01(2);
/* 15 */            l011o01.I00iiI = executor;
/* 17 */            l011o01.I00iiO = ioo0ioiooi1;
/* 19 */            VarHandle.storeStoreFence();
/* 37 */            return l011o01;
                }
            }
