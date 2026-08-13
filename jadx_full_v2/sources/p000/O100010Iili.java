            package p000;

            import android.util.Log;
            import java.util.LinkedHashMap;
            import java.util.TreeMap;
            
            public final class O100010Iili {
                public LinkedHashMap I00000oIO = new LinkedHashMap();

                public void I00000oIO(O1loO1O1OO o1loO1O1OO) {
/* 1 */             int i = o1loO1O1OO.I00000oIO;
/* 3 */             int i2 = o1loO1O1OO.I00000oOI;
/* 5 */             LinkedHashMap linkedHashMap = this.I00000oIO;
/* 7 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            Object treeMap = linkedHashMap.get(numValueOf);
/* 15 */            if (treeMap == null) {
/* 19 */                treeMap = new TreeMap();
/* 22 */                linkedHashMap.put(numValueOf, treeMap);
                    }
/* 25 */            TreeMap treeMap2 = (TreeMap) treeMap;
/* 35 */            if (treeMap2.containsKey(Integer.valueOf(i2))) {
/* 69 */                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + o1loO1O1OO);
                    }
/* 76 */            treeMap2.put(Integer.valueOf(i2), o1loO1O1OO);
                }
            }
