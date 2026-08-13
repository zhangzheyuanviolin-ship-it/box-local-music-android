            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IlOooIIilo implements IlOil1ii {
                public IlOil1ii I00iOIl;
                public Oi1oIiOiIi0 I00iiI;
                public boolean I00iiO;
                public Function1 I00iio;

                @Override
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             IlOil1ii ilOil1ii = this.I00iOIl;
/* 5 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00iiI;
/* 7 */             boolean z = this.I00iiO;
/* 9 */             Function1 function1 = this.I00iio;
/* 11 */            IlOooI ilOooI = new IlOooI();
/* 14 */            ilOooI.I00iOIl = ilOil1iooOO0;
/* 16 */            ilOooI.I00iiI = oi1oIiOiIi0;
/* 18 */            ilOooI.I00iiO = z;
/* 20 */            ilOooI.I00iio = function1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            Object objI00000oIO = ilOil1ii.I00000oIO(ilOooI, iOoil1iiIilo);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }
            }
