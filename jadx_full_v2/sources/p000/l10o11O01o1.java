            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class l10o11O01o1 {
                public static final IIiOiI0il I00000oIO(Executor executor, String str, IllOOo00lI illOOo00lI) {
/* 4 */             IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(1);
/* 7 */             iiI0oIlol0.I00iiI = executor;
/* 9 */             iiI0oIlol0.I00iiO = str;
/* 11 */            iiI0oIlol0.I00iio = illOOo00lI;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            return iOiiloIII0O.I00000oIO(iiI0oIlol0);
                }

                public static IIiOiI0il I00000oOI(Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O) {
/* 1 */             Ii01I10 ii01I10 = Ii01I10.I00iOIl;
/* 6 */             IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(2);
/* 9 */             iiI0oIlol0.I00iiI = ii00l101O;
/* 11 */            iiI0oIlol0.I00iiO = ii01I10;
/* 13 */            iiI0oIlol0.I00iio = illiIl1l11O;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            return iOiiloIII0O.I00000oIO(iiI0oIlol0);
                }
            }
