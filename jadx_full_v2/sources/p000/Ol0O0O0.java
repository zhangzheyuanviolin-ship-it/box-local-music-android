            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public final class Ol0O0O0 implements IlliIl1l11O {
                public List I00iOIl;
                public int I00iiI;

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 12 */            if ((((Number) obj2).intValue() & 3) == 2 && iloI0lOlll1.I00IO1()) {
/* 21 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 25 */                List<List> list = this.I00iOIl;
/* 29 */                int i = this.I00iiI;
/* 39 */                for (List list2 : list) {
/* 51 */                    if (list2.size() != i) {
/* 92 */                        I000II.I001IO000("Check failed.");
/* 95 */                        return null;
                            }
/* 56 */                    iloI0lOlll1.I00i01iIIliI(571476473);
/* 61 */                    Iterator it = list2.iterator();
/* 70 */                    while (it.hasNext()) {
/* 82 */                        ((IlliIl1l11O) it.next()).invoke(iloI0lOlll1, 0);
                            }
/* 86 */                    iloI0lOlll1.I0010I0i(false);
                        }
                    }
/* 97 */            return OoiIlOl1iI.I00000oIO;
                }
            }
