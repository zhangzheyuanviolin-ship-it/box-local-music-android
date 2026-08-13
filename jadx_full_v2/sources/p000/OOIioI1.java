            package p000;

            import android.util.SparseArray;
            import java.util.HashMap;
            
            public abstract class OOIioI1 {
                public static final SparseArray I00000oIO = new SparseArray();
                public static final HashMap I00000oOI;

                static {
/* 10 */            HashMap map = new HashMap();
/* 13 */            I00000oOI = map;
/* 22 */            map.put(OOIio1010OoO.I00iOIl, 0);
/* 32 */            map.put(OOIio1010OoO.I00iiI, 1);
/* 42 */            map.put(OOIio1010OoO.I00iiO, 2);
/* 57 */            for (OOIio1010OoO oOIio1010OoO : map.keySet()) {
/* 79 */                I00000oIO.append(((Integer) I00000oOI.get(oOIio1010OoO)).intValue(), oOIio1010OoO);
                    }
                }

                public static int I00000oIO(OOIio1010OoO oOIio1010OoO) {
/* 7 */             Integer num = (Integer) I00000oOI.get(oOIio1010OoO);
/* 9 */             if (num != null) {
/* 11 */                return num.intValue();
                    }
/* 18 */            IoOOl0iOl1io.I000OOo1O("PriorityMapping is missing known Priority value ", oOIio1010OoO);
/* 21 */            return 0;
                }

                public static OOIio1010OoO I00000oOI(int i) {
/* 7 */             OOIio1010OoO oOIio1010OoO = (OOIio1010OoO) I00000oIO.get(i);
/* 9 */             if (oOIio1010OoO != null) {
/* 11 */                return oOIio1010OoO;
                    }
/* 18 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Unknown Priority for value "));
/* 21 */            return null;
                }
            }
