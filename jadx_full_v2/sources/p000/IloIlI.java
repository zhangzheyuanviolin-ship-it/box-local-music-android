            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IloIlI implements Function1 {
                public final int I00iOIl;
                public IlooOlI I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IlooOlI ilooOlI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 25 */                    IloiIioI0 iloiIioI0 = new IloiIioI0(0);
/* 28 */                    iloiIioI0.I00000oOI = ilooOlI;
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    return iloiIioI0;
                        default:
/* 13 */                    IloiIioI0 iloiIioI02 = new IloiIioI0(1);
/* 16 */                    iloiIioI02.I00000oOI = ilooOlI;
/* 18 */                    VarHandle.storeStoreFence();
/* 21 */                    return iloiIioI02;
                    }
                }
            }
