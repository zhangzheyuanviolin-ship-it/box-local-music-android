            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iol1Iil implements Executor {
                public static final iol1Iil I00iOIl;
                public static final iol1Iil[] I00iiI;

                static {
/* 6 */             iol1Iil iol1iil = new iol1Iil("INSTANCE", 0);
/* 9 */             I00iOIl = iol1iil;
/* 15 */            I00iiI = new iol1Iil[]{iol1iil};
                }

                public static iol1Iil[] values() {
/* 7 */             return (iol1Iil[]) I00iiI.clone();
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
