            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class Ilio0O1iIiO1 implements Function3 {
                public int I00iOIl;
                public IOii1l I00iiI;
                public List I00iiO;
                public int I00iio;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             Oi1O00I1 oi1O00I1 = (Oi1O00I1) obj;
/* 3 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 7 */             int iIntValue = ((Number) obj3).intValue();
/* 13 */            if ((iIntValue & 6) == 0) {
/* 24 */                iIntValue |= iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2;
                    }
/* 29 */            if ((iIntValue & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 38 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 52 */                OOiIo1lll oOiIo1lllI00000oIO = IlioO0oO.I0001Ioi1lo.I00000oIO(Integer.valueOf(this.I00iOIl + 1));
/* 58 */                IOii1l iOii1l = this.I00iiI;
/* 60 */                List list = this.I00iiO;
/* 62 */                int i = this.I00iio;
/* 64 */                Ililoi0O0l ililoi0O0l = new Ililoi0O0l();
/* 67 */                ililoi0O0l.I00iOIl = iOii1l;
/* 69 */                ililoi0O0l.I00iiI = oi1O00I1;
/* 71 */                ililoi0O0l.I00iiO = list;
/* 73 */                ililoi0O0l.I00iio = i;
/* 75 */                VarHandle.storeStoreFence();
/* 87 */                iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(-243396074, ililoi0O0l, iloI0lOlll1), iloI0lOlll1, 56);
                    }
/* 90 */            return OoiIlOl1iI.I00000oIO;
                }
            }
