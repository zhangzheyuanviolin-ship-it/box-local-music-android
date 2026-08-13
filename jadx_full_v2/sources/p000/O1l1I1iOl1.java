            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1l1I1iOl1 implements Function1 {
                public IO1i1i1IlO I00iOIl;
                public long I00iiI;
                public Function1 I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             IO1i1i1IlO iO1i1i1IlO = this.I00iOIl;
/* 3 */             long j = this.I00iiI;
/* 5 */             Function1 function1 = this.I00iiO;
/* 9 */             List list = iO1i1i1IlO.I000II;
/* 11 */            int size = list.size();
/* 19 */            I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(20);
/* 22 */            i0O11IOOo0OI.I00iiI = list;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            O1l1O01I o1l1O01I = new O1l1O01I();
/* 32 */            o1l1O01I.I00iOIl = list;
/* 34 */            o1l1O01I.I00iiI = j;
/* 36 */            o1l1O01I.I00iiO = function1;
/* 38 */            VarHandle.storeStoreFence();
/* 51 */            ((O0lolo) obj).I0000oI00(size, null, i0O11IOOo0OI, new IOii1l(802480018, o1l1O01I, true));
/* 54 */            return OoiIlOl1iI.I00000oIO;
                }
            }
