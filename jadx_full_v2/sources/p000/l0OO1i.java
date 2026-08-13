            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class l0OO1i implements Executor {
                public static final l0OO1i I00iOIl;
                public static final l0OO1i[] I00iiI;

                static {
/* 6 */             l0OO1i l0oo1i = new l0OO1i("INSTANCE", 0);
/* 9 */             I00iOIl = l0oo1i;
/* 15 */            I00iiI = new l0OO1i[]{l0oo1i};
                }

                public static l0OO1i[] values() {
/* 7 */             return (l0OO1i[]) I00iiI.clone();
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
