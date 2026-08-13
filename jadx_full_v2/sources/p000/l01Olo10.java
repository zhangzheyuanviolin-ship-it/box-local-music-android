            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class l01Olo10 {
                public static final l01Olo10 I0000O;
                public Runnable I00000oIO;
                public Executor I00000oOI;
                public l01Olo10 I0000Il00O;

                static {
/* 3 */             l01Olo10 l01olo10 = new l01Olo10();
/* 7 */             l01olo10.I00000oIO = null;
/* 9 */             l01olo10.I00000oOI = null;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000O = l01olo10;
                }
            }
