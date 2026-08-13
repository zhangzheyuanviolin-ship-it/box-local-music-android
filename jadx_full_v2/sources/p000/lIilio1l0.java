            package p000;

            import java.util.List;
            
            public abstract class lIilio1l0 {
                public static void I00000oIO(Ol11il011o0 ol11il011o0, List list, OOlol11 oOlol11) {
/* 2 */             List list2 = list;
/* 8 */             if (list2.isEmpty()) {
/* 98 */                return;
                    }
/* 10 */            int size = list2.size();
/* 15 */            for (int i = 0; i < size; i++) {
/* 23 */                int iI0000Il00O = ol11il011o0.I0000Il00O((Ilo1iIi1OI01) list.get(i));
/* 33 */                int iI00IoiI = ol11il011o0.I00IoiI(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(iI0000Il00O));
/* 60 */                Object obj = iI00IoiI < ol11il011o0.I0001Ioi1lo(ol11il011o0.I00000oOI, ol11il011o0.I00100o1O0lo(iI0000Il00O + 1)) ? ol11il011o0.I0000Il00O[ol11il011o0.I000II(iI00IoiI)] : IOl11li.I00000oIO;
/* 69 */                OOloioIl oOloioIl = obj instanceof OOloioIl ? (OOloioIl) obj : null;
/* 70 */                if (oOloioIl != null) {
/* 72 */                    oOloioIl.I00000oIO = oOlol11;
                        }
                    }
                }
            }
