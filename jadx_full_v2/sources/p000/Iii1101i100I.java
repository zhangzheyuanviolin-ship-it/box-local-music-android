            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iii1101i100I implements Executor {
                public static final Iii1101i100I I00iOIl;
                public static final Iii1101i100I[] I00iiI;

                static {
/* 6 */             Iii1101i100I iii1101i100I = new Iii1101i100I("INSTANCE", 0);
/* 9 */             I00iOIl = iii1101i100I;
/* 11 */            Iii1101i100I[] iii1101i100IArr = {iii1101i100I};
/* 15 */            I00iiI = iii1101i100IArr;
/* 17 */            ilIII1o11.I00000oIO(iii1101i100IArr);
                }

                public static Iii1101i100I valueOf(String str) {
/* 7 */             return (Iii1101i100I) Enum.valueOf(Iii1101i100I.class, str);
                }

                public static Iii1101i100I[] values() {
/* 7 */             return (Iii1101i100I[]) I00iiI.clone();
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
