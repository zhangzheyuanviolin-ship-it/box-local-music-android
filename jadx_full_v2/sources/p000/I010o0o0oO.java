            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class I010o0o0oO {
                public static final I010o0o0oO I0000O;
                public Runnable I00000oIO;
                public Executor I00000oOI;
                public I010o0o0oO I0000Il00O;

                static {
/* 3 */             I010o0o0oO i010o0o0oO = new I010o0o0oO();
/* 7 */             i010o0o0oO.I00000oIO = null;
/* 9 */             i010o0o0oO.I00000oOI = null;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            I0000O = i010o0o0oO;
                }
            }
