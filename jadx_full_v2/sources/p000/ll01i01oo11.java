            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class ll01i01oo11 {
                public static Executor I00000oIO(Executor executor, l0OiIioI1I0 l0oiiioi1i0) {
/* 1 */             executor.getClass();
/* 6 */             if (executor == l0OO1i.I00iOIl) {
/* 8 */                 return executor;
                    }
/* 12 */            l011O01 l011o01 = new l011O01(3);
/* 15 */            l011o01.I00iiI = executor;
/* 17 */            l011o01.I00iiO = l0oiiioi1i0;
/* 19 */            VarHandle.storeStoreFence();
/* 37 */            return l011o01;
                }
            }
