            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class OIii010o01l0 implements IIiOOIoi0 {
                public Executor I00iOIl;
                public O1oO0lOoI1 I00iiI;
                public String I00iiO;
                public IllOOo00lI I00iio;
                public OI0lOii0I I00ilI0I1;

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             Executor executor = this.I00iOIl;
/* 3 */             O1oO0lOoI1 o1oO0lOoI1 = this.I00iiI;
/* 5 */             String str = this.I00iiO;
/* 7 */             IllOOo00lI illOOo00lI = this.I00iio;
/* 9 */             OI0lOii0I oI0lOii0I = this.I00ilI0I1;
/* 14 */            IioOIoool1 iioOIoool1 = new IioOIoool1(2);
/* 17 */            iioOIoool1.I00iiI = o1oO0lOoI1;
/* 19 */            iioOIoool1.I00iiO = str;
/* 21 */            iioOIoool1.I00iio = illOOo00lI;
/* 23 */            iioOIoool1.I00ilI0I1 = oI0lOii0I;
/* 25 */            iioOIoool1.I00ilO0 = iIiOOI;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            executor.execute(iioOIoool1);
/* 33 */            return OoiIlOl1iI.I00000oIO;
                }
            }
