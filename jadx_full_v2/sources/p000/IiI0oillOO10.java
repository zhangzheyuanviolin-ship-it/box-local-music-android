            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiI0oillOO10 extends Il11oo {
                public static final IiI0oillOO10 I00iiO;
                public Ii010io1l I00iiI;

                static {
/* 3 */             int i = OloO11o0.I0000Il00O;
/* 5 */             int i2 = OloO11o0.I0000O;
/* 7 */             long j = OloO11o0.I0000oI00;
/* 9 */             String str = OloO11o0.I00000oIO;
/* 11 */            IiI0oillOO10 iiI0oillOO10 = new IiI0oillOO10();
/* 19 */            iiI0oillOO10.I00iiI = new Ii010io1l(i, i2, j, str);
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            I00iiO = iiI0oillOO10;
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
/* 4 */             Ii010io1l.I000II(this.I00iiI, runnable, 6);
                }

                @Override
                public final void I00oliIiO01i(Ii00l101O ii00l101O, Runnable runnable) {
/* 4 */             Ii010io1l.I000II(this.I00iiI, runnable, 2);
                }

                @Override
                public final void close() {
/* 29 */            throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
                }

                @Override
                public final String toString() {
/* 1 */             return "Dispatchers.Default";
                }
            }
