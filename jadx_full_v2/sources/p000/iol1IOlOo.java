            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iol1IOlOo implements Executor {
                public static final iol1IOlOo I00iOIl;
                public static final iol1IOlOo[] I00iiI;

                static {
/* 6 */             iol1IOlOo iol1ioloo = new iol1IOlOo("INSTANCE", 0);
/* 9 */             I00iOIl = iol1ioloo;
/* 15 */            I00iiI = new iol1IOlOo[]{iol1ioloo};
                }

                public static iol1IOlOo[] values() {
/* 7 */             return (iol1IOlOo[]) I00iiI.clone();
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
