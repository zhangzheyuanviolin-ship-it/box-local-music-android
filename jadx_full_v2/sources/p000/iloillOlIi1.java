            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iloillOlIi1 implements Executor {
                public static final iloillOlIi1 I00iOIl;
                public static final iloillOlIi1[] I00iiI;

                static {
/* 6 */             iloillOlIi1 iloillolii1 = new iloillOlIi1("INSTANCE", 0);
/* 9 */             I00iOIl = iloillolii1;
/* 15 */            I00iiI = new iloillOlIi1[]{iloillolii1};
                }

                public static iloillOlIi1[] values() {
/* 7 */             return (iloillOlIi1[]) I00iiI.clone();
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
