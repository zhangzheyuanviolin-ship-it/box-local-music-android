            package p000;

            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            public final class Io1iO1Ooo0l implements Executor {
                public static volatile Io1iO1Ooo0l I00iiO;
                public final int I00iOIl;
                public Object I00iiI;

                public Io1iO1Ooo0l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static Executor I00000oIO() {
/* 3 */             if (I00iiO != null) {
/* 5 */                 return I00iiO;
                    }
                    synchronized (Io1iO1Ooo0l.class) {
                        try {
/* 13 */                    if (I00iiO == null) {
/* 18 */                        Io1iO1Ooo0l io1iO1Ooo0l = new Io1iO1Ooo0l(0);
/* 30 */                        io1iO1Ooo0l.I00iiI = Executors.newSingleThreadExecutor(new Io1iO1I(0));
/* 32 */                        VarHandle.storeStoreFence();
/* 35 */                        I00iiO = io1iO1Ooo0l;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 41 */            return I00iiO;
                }

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    ((ExecutorService) this.I00iiI).execute(runnable);
                            break;
                        case 1:
/* 39 */                    ((O1oo1il01OoO) this.I00iiI).post(runnable);
                            break;
                        case 2:
/* 31 */                    ((Handler) ((OillOo0) this.I00iiI).I00iio).post(runnable);
                            break;
                        default:
/* 14 */                    l0o10OoO0 l0o10ooo0 = ((l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl).I00io1l;
/* 16 */                    l0olllO1i.I000II(l0o10ooo0);
/* 19 */                    l0o10ooo0.I010o0o0oO(runnable);
                            break;
                    }
                }
            }
