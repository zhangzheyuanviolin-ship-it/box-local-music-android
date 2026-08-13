            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iollol1ioIi implements Executor {
                public static final iollol1ioIi I00iOIl;
                public static final iollol1ioIi[] I00iiI;

                static {
/* 6 */             iollol1ioIi iollol1ioii = new iollol1ioIi("INSTANCE", 0);
/* 9 */             I00iOIl = iollol1ioii;
/* 15 */            I00iiI = new iollol1ioIi[]{iollol1ioii};
                }

                public static iollol1ioIi[] values() {
/* 7 */             return (iollol1ioIi[]) I00iiI.clone();
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.run();
                }

                @Override
                public final String toString() {
/* 1 */             return "MoreExecutors.directExecutor()";
                }
            }
