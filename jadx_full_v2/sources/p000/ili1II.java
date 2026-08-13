            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ili1II {
                public static final ili1II I0000O;
                public Runnable I00000oIO;
                public Executor I00000oOI;
                public ili1II I0000Il00O;

                static {
/* 3 */             ili1II ili1ii = new ili1II();
/* 7 */             ili1ii.I00000oIO = null;
/* 9 */             ili1ii.I00000oOI = null;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000O = ili1ii;
                }
            }
