            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public abstract class l1l1IO0Ii {
                public static final IIloOI I00000oIO(O1oO0lOoI1 o1oO0lOoI1, String str, Executor executor, IllOOo00lI illOOo00lI) {
/* 5 */             OI0lOii0I oI0lOii0I = new OI0lOii0I(IIloOI.I00iio);
/* 10 */            OIii010o01l0 oIii010o01l0 = new OIii010o01l0();
/* 13 */            oIii010o01l0.I00iOIl = executor;
/* 15 */            oIii010o01l0.I00iiI = o1oO0lOoI1;
/* 17 */            oIii010o01l0.I00iiO = str;
/* 19 */            oIii010o01l0.I00iio = illOOo00lI;
/* 21 */            oIii010o01l0.I00ilI0I1 = oI0lOii0I;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(oIii010o01l0);
/* 33 */            IIloOI iIloOI = new IIloOI(1);
/* 36 */            iIloOI.I00iiI = iIiOiI0ilI00000oIO;
/* 38 */            VarHandle.storeStoreFence();
/* 204 */           return iIloOI;
                }
            }
