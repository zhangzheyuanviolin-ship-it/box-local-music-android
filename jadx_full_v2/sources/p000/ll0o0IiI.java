            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class ll0o0IiI {
                public static Executor I00000oIO(Executor executor, liIIoo1oo liiioo1oo) {
/* 1 */             executor.getClass();
/* 6 */             if (executor == liI1iIi1IllO.I00iOIl) {
/* 8 */                 return executor;
                    }
/* 12 */            l011O01 l011o01 = new l011O01(4);
/* 15 */            l011o01.I00iiI = executor;
/* 17 */            l011o01.I00iiO = liiioo1oo;
/* 19 */            VarHandle.storeStoreFence();
/* 37 */            return l011o01;
                }
            }
