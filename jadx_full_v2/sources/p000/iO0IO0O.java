            package p000;

            import java.util.HashSet;
            import java.util.List;
            import java.util.Set;
            
            public abstract class iO0IO0O {
                public static final OilOloI[] I00000oIO = new OilOloI[0];

                public static final Set I00000oIO(OilOloI oilOloI) {
/* 3 */             if (oilOloI instanceof IIi1ol1OO) {
/* 7 */                 return ((IIi1ol1OO) oilOloI).I00000oOI();
                    }
/* 18 */            HashSet hashSet = new HashSet(oilOloI.I0000oI00());
/* 21 */            int iI0000oI00 = oilOloI.I0000oI00();
/* 26 */            for (int i = 0; i < iI0000oI00; i++) {
/* 32 */                hashSet.add(oilOloI.I0001Ioi1lo(i));
                    }
/* 49 */            return hashSet;
                }

                public static final OilOloI[] I00000oOI(List list) {
                    OilOloI[] oilOloIArr;
/* 2 */             List list2 = list;
/* 4 */             if (list2 == null || list2.isEmpty()) {
/* 12 */                list = null;
                    }
                    return (list == null || (oilOloIArr = (OilOloI[]) list.toArray(new OilOloI[0])) == null) ? I00000oIO : oilOloIArr;
                }
            }
