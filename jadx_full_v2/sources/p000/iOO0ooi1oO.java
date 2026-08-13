            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class iOO0ooi1oO {
                public static boolean I00000oIO(String str) {
/* 13 */            List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(str, new String[]{"."}, 6);
/* 27 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00IoIO0lI, 10));
/* 30 */            Iterator it = listI00IoIO0lI.iterator();
/* 38 */            while (it.hasNext()) {
/* 46 */                Integer numI000lI = OlOolloIIOl0.I000lI(10, (String) it.next());
/* 62 */                arrayList.add(Integer.valueOf(numI000lI != null ? numI000lI.intValue() : 0));
                    }
/* 72 */            List listI00IoIO0lI2 = OlOoOIi0o.I00IoIO0lI("3.3.3", new String[]{"."}, 6);
/* 84 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00IoIO0lI2, 10));
/* 87 */            Iterator it2 = listI00IoIO0lI2.iterator();
/* 95 */            while (it2.hasNext()) {
/* 103 */               Integer numI000lI2 = OlOolloIIOl0.I000lI(10, (String) it2.next());
/* 119 */               arrayList2.add(Integer.valueOf(numI000lI2 != null ? numI000lI2.intValue() : 0));
                    }
/* 131 */           int iMax = Math.max(arrayList.size(), arrayList2.size());
/* 135 */           int i = 0;
/* 136 */           while (i < iMax) {
/* 154 */               int iIntValue = ((Number) ((i < 0 || i >= arrayList.size()) ? 0 : arrayList.get(i))).intValue();
/* 174 */               int iIntValue2 = ((Number) ((i < 0 || i >= arrayList2.size()) ? 0 : arrayList2.get(i))).intValue();
/* 178 */               if (iIntValue > iIntValue2) {
/* 180 */                   return true;
                        }
/* 182 */               if (iIntValue < iIntValue2) {
                            break;
                        }
/* 185 */               i++;
                    }
/* 1 */             return false;
                }
            }
