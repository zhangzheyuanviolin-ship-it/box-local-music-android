            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class ill1100Oii implements Executor {
                public static final ill1100Oii I00iOIl;
                public static final ill1100Oii[] I00iiI;

                static {
/* 6 */             ill1100Oii ill1100oii = new ill1100Oii("INSTANCE", 0);
/* 9 */             I00iOIl = ill1100oii;
/* 15 */            I00iiI = new ill1100Oii[]{ill1100oii};
                }

                public static ill1100Oii[] values() {
/* 7 */             return (ill1100Oii[]) I00iiI.clone();
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
