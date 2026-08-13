            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iii11Ooi implements Executor {
                public static final Iii11Ooi I00iOIl;
                public static final Iii11Ooi[] I00iiI;

                static {
/* 6 */             Iii11Ooi iii11Ooi = new Iii11Ooi("INSTANCE", 0);
/* 9 */             I00iOIl = iii11Ooi;
/* 15 */            I00iiI = new Iii11Ooi[]{iii11Ooi};
                }

                public static Iii11Ooi valueOf(String str) {
/* 7 */             return (Iii11Ooi) Enum.valueOf(Iii11Ooi.class, str);
                }

                public static Iii11Ooi[] values() {
/* 7 */             return (Iii11Ooi[]) I00iiI.clone();
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
