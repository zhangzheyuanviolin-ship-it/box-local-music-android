            package p000;

            import java.util.concurrent.Executor;
            
            public final class Iii11l implements Executor {
                public static volatile Iii11l I00iiI;
                public static final Iii11l I00iiO = new Iii11l(1);
                public static final Iii11l I00iio = new Iii11l(3);
                public static final Iii11l I00ilI0I1 = new Iii11l(4);
                public static final Iii11l I00ilO0 = new Iii11l(5);
                public final int I00iOIl;

                public Iii11l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static Iii11l I00000oIO() {
/* 3 */             if (I00iiI != null) {
/* 5 */                 return I00iiI;
                    }
                    synchronized (Iii11l.class) {
                        try {
/* 13 */                    if (I00iiI == null) {
/* 21 */                        I00iiI = new Iii11l(0);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 27 */            return I00iiI;
                }

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    runnable.run();
                            break;
                        case 1:
/* 31 */                    runnable.run();
                            break;
                        case 2:
/* 27 */                    new Thread(runnable).start();
                            break;
                        case 3:
/* 18 */                    runnable.run();
                            break;
                        case 4:
/* 14 */                    runnable.run();
                            break;
                        case 5:
/* 10 */                    runnable.run();
                            break;
                        default:
/* 6 */                     runnable.run();
                            break;
                    }
                }
            }
