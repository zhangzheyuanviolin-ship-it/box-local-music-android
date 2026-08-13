            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            
            public abstract class l1i0oIO0 {
                public static OilOi0I1 I00000oIO(Executor executor) {
/* 3 */             OilOi0I1 oilOi0I1 = new OilOi0I1();
/* 11 */            oilOi0I1.I00iiI = new ArrayDeque();
/* 14 */            oilOi0I1.I00iiO = 1;
/* 18 */            oilOi0I1.I00iio = 0L;
/* 23 */            iooiio1i0 iooiio1i0Var = new iooiio1i0(2);
/* 26 */            iooiio1i0Var.I00iiO = oilOi0I1;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            oilOi0I1.I00ilI0I1 = iooiio1i0Var;
/* 33 */            executor.getClass();
/* 36 */            oilOi0I1.I00iOIl = executor;
/* 38 */            VarHandle.storeStoreFence();
/* 49 */            return oilOi0I1;
                }

                public static Executor I00000oOI(Executor executor, IlOooOIi1o ilOooOIi1o) {
/* 1 */             executor.getClass();
/* 6 */             if (executor == Iii11Ooi.I00iOIl) {
/* 8 */                 return executor;
                    }
/* 11 */            OI010lo oI010lo = new OI010lo();
/* 14 */            oI010lo.I00iOIl = executor;
/* 16 */            oI010lo.I00iiI = ilOooOIi1o;
/* 18 */            VarHandle.storeStoreFence();
/* 89 */            return oI010lo;
                }
            }
