            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executors;
            import java.util.concurrent.TimeUnit;
            
            public final class ll1ooI1iI implements llIOoOoIi {
                public static boolean I0000Il00O;
                public OliiillO I00000oIO;
                public int I00000oOI;

                @Override
                public final void zza() {
                    synchronized (ll1ooI1iI.class) {
                        try {
/* 6 */                     if (!I0000Il00O) {
/* 11 */                        lOii1o loii1o = new lOii1o(5);
/* 14 */                        loii1o.I00iiI = this;
/* 16 */                        VarHandle.storeStoreFence();
/* 19 */                        long j = this.I00000oOI;
/* 22 */                        TimeUnit timeUnit = TimeUnit.MINUTES;
/* 30 */                        OI011o1 oI011o1 = (OI011o1) this.I00000oIO.get();
/* 35 */                        ll1lI01ilI1 ll1li01ili1 = new ll1lI01ilI1(0);
/* 38 */                        ll1li01ili1.I00iiO = loii1o;
/* 40 */                        ll1li01ili1.I00iio = oI011o1;
/* 42 */                        ll1li01ili1.I00iiI = j;
/* 44 */                        ll1li01ili1.I00ilI0I1 = timeUnit;
/* 46 */                        VarHandle.storeStoreFence();
/* 49 */                        oI011o1.getClass();
/* 59 */                        OoIlol ooIlol = new OoIlol(Executors.callable(ll1li01ili1, null));
/* 70 */                        OI011Ol0looI oI011Ol0looI = new OI011Ol0looI(ooIlol, oI011o1.I00iiI.schedule(ooIlol, j, timeUnit));
/* 76 */                        IlloO1 illoO1 = new IlloO1(1);
/* 79 */                        illoO1.I00iiI = oI011Ol0looI;
/* 81 */                        VarHandle.storeStoreFence();
/* 86 */                        oI011Ol0looI.addListener(illoO1, Iii11Ooi.I00iOIl);
/* 89 */                        I0000Il00O = true;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }
            }
