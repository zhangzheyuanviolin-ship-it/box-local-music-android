            package p000;

            import java.util.concurrent.Executor;
            
            public final class Ii1oo1ooill0 extends Il11oo implements Executor {
                public static final Ii1oo1ooill0 I00iiI = new Ii1oo1ooill0();
                public static final Ii00lIOoi I00iiO;

                static {
/* 8 */             OoiOIo0Oi1l0 ooiOIo0Oi1l0 = OoiOIo0Oi1l0.I00iiI;
/* 10 */            int i = Olli0OOiloi.I00000oIO;
/* 14 */            if (64 >= i) {
/* 17 */                i = 64;
                    }
/* 30 */            I00iiO = ooiOIo0Oi1l0.I00ooIo0(lOiOi1.I00000oOI(i, 12, "kotlinx.coroutines.io.parallelism"));
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
/* 3 */             I00iiO.I00iOIl(ii00l101O, runnable);
                }

                @Override
                public final void I00oliIiO01i(Ii00l101O ii00l101O, Runnable runnable) throws IiiI1OOll0l1 {
/* 3 */             I00iiO.I00oliIiO01i(ii00l101O, runnable);
                }

                @Override
                public final Ii00lIOoi I00ooIo0(int i) {
/* 4 */             return OoiOIo0Oi1l0.I00iiI.I00ooIo0(1);
                }

                @Override
                public final void close() {
/* 29 */            throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             I00iOIl(Il00o11.I00iOIl, runnable);
                }

                @Override
                public final String toString() {
/* 1 */             return "Dispatchers.IO";
                }
            }
