            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iii10o1oiO1 implements Executor {
                public static final Iii10o1oiO1 I00iOIl;
                public static final Iii10o1oiO1[] I00iiI;

                static {
/* 6 */             Iii10o1oiO1 iii10o1oiO1 = new Iii10o1oiO1("INSTANCE", 0);
/* 9 */             I00iOIl = iii10o1oiO1;
/* 15 */            I00iiI = new Iii10o1oiO1[]{iii10o1oiO1};
                }

                public static Iii10o1oiO1 valueOf(String str) {
/* 7 */             return (Iii10o1oiO1) Enum.valueOf(Iii10o1oiO1.class, str);
                }

                public static Iii10o1oiO1[] values() {
/* 7 */             return (Iii10o1oiO1[]) I00iiI.clone();
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             runnable.run();
                }

                @Override
                public final String toString() {
/* 1 */             return "DirectExecutor";
                }
            }
