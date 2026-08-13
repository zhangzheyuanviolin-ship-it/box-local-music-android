            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOOIlolo00O {
                public static o0llIi I00000oIO(List list, Function1 function1, IlliIl1l11O illiIl1l11O) {
                    Object next;
/* 2 */             List list2 = list;
/* 4 */             Iterator it = list2.iterator();
/* 13 */            if (it.hasNext()) {
/* 17 */                next = it.next();
/* 25 */                if (it.hasNext()) {
/* 32 */                    Comparable comparable = (Comparable) function1.invoke(next);
/* 56 */                    do {
/* 34 */                        Object next2 = it.next();
/* 42 */                        Comparable comparable2 = (Comparable) function1.invoke(next2);
/* 48 */                        if (comparable.compareTo(comparable2) < 0) {
/* 50 */                            next = next2;
/* 51 */                            comparable = comparable2;
                                }
/* 56 */                    } while (it.hasNext());
                        }
                    } else {
/* 15 */                next = null;
                    }
/* 58 */            if (next == null) {
/* 145 */               OIiilo1Ool0o.I000II("Unable to build char tree from an empty list");
/* 12 */                return null;
                    }
/* 66 */            ((Number) function1.invoke(next)).intValue();
/* 71 */            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 83 */                Iterator it2 = list2.iterator();
/* 91 */                while (it2.hasNext()) {
/* 107 */                   if (((Number) function1.invoke(it2.next())).intValue() == 0) {
/* 112 */                       I000II.I000iOII("There should be no empty entries");
/* 12 */                        return null;
                            }
                        }
                    }
/* 118 */           ArrayList arrayList = new ArrayList();
/* 122 */           I00000oOI(arrayList, list, 0, function1, illiIl1l11O);
/* 125 */           arrayList.trimToSize();
/* 134 */           new I1O011OIOO0((char) 0, Il01100l.I00iOIl, arrayList);
/* 139 */           return new o0llIi(8);
                }

                public static void I00000oOI(ArrayList arrayList, List list, int i, Function1 function1, IlliIl1l11O illiIl1l11O) {
/* 5 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 16 */            for (Object obj : list) {
/* 30 */                Character ch = (Character) illiIl1l11O.invoke(obj, Integer.valueOf(i));
/* 32 */                ch.getClass();
/* 35 */                Object arrayList2 = linkedHashMap.get(ch);
/* 39 */                if (arrayList2 == null) {
/* 43 */                    arrayList2 = new ArrayList();
/* 46 */                    linkedHashMap.put(ch, arrayList2);
                        }
/* 51 */                ((List) arrayList2).add(obj);
                    }
/* 67 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 81 */                char cCharValue = ((Character) entry.getKey()).charValue();
/* 89 */                List list2 = (List) entry.getValue();
/* 91 */                int i2 = i + 1;
/* 95 */                ArrayList arrayList3 = new ArrayList();
/* 98 */                List list3 = list2;
/* 102 */               ArrayList arrayList4 = new ArrayList();
/* 113 */               for (Object obj2 : list3) {
/* 129 */                   if (((Number) function1.invoke(obj2)).intValue() > i2) {
/* 131 */                       arrayList4.add(obj2);
                            }
                        }
/* 135 */               I00000oOI(arrayList3, arrayList4, i2, function1, illiIl1l11O);
/* 138 */               arrayList3.trimToSize();
/* 143 */               ArrayList arrayList5 = new ArrayList();
/* 154 */               for (Object obj3 : list3) {
/* 170 */                   if (((Number) function1.invoke(obj3)).intValue() == i2) {
/* 172 */                       arrayList5.add(obj3);
                            }
                        }
/* 181 */               arrayList.add(new I1O011OIOO0(cCharValue, arrayList5, arrayList3));
                    }
                }
            }
