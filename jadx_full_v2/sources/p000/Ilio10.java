            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class Ilio10 implements Function3 {
                public O10l1oIi0o I00iOIl;
                public int I00iiI;
                public IOii1l I00iiO;
                public List I00iio;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 4 */             int iIntValue = ((Number) obj).intValue();
/* 10 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 16 */            int iIntValue2 = ((Number) obj3).intValue();
/* 22 */            if ((iIntValue2 & 6) == 0) {
/* 33 */                iIntValue2 |= iloI0lOlll1.I0000oI00(iIntValue) ? 4 : 2;
                    }
/* 38 */            if ((iIntValue2 & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 47 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 51 */                Oi1Oo0Il0 oi1Oo0Il0I00000oOI = Oi1i0Oi.I00000oOI(iloI0lOlll1);
/* 76 */                Oi1Oo0Il0 oi1Oo0Il0 = new Oi1Oo0Il0(this.I00iOIl.I0000Il00O, oi1Oo0Il0I00000oOI.I00000oOI, oi1Oo0Il0I00000oOI.I0000Il00O, oi1Oo0Il0I00000oOI.I0000O, oi1Oo0Il0I00000oOI.I0000oI00, oi1Oo0Il0I00000oOI.I0001Ioi1lo, oi1Oo0Il0I00000oOI.I000II, oi1Oo0Il0I00000oOI.I000O01llI0);
/* 81 */                int i = this.I00iiI;
/* 83 */                IOii1l iOii1l = this.I00iiO;
/* 85 */                List list = this.I00iio;
/* 87 */                Ilio0O1iIiO1 ilio0O1iIiO1 = new Ilio0O1iIiO1();
/* 90 */                ilio0O1iIiO1.I00iOIl = i;
/* 92 */                ilio0O1iIiO1.I00iiI = iOii1l;
/* 94 */                ilio0O1iIiO1.I00iiO = list;
/* 96 */                ilio0O1iIiO1.I00iio = iIntValue;
/* 98 */                VarHandle.storeStoreFence();
/* 112 */               iOOo1000.I00000oIO(null, oi1Oo0Il0, iiioOl1O.I00000oOI(1766993238, ilio0O1iIiO1, iloI0lOlll1), iloI0lOlll1, 384, 1);
                    }
/* 115 */           return OoiIlOl1iI.I00000oIO;
                }
            }
