            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class liI1iIi1IllO implements Executor {
                public static final liI1iIi1IllO I00iOIl;
                public static final liI1iIi1IllO[] I00iiI;

                static {
/* 6 */             liI1iIi1IllO lii1iii1illo = new liI1iIi1IllO("INSTANCE", 0);
/* 9 */             I00iOIl = lii1iii1illo;
/* 15 */            I00iiI = new liI1iIi1IllO[]{lii1iii1illo};
                }

                public static liI1iIi1IllO[] values() {
/* 7 */             return (liI1iIi1IllO[]) I00iiI.clone();
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
