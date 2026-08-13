            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class il011100IO0o {
                public static void I00000oIO(ArrayList arrayList) {
/* 7 */             HashMap map = new HashMap(arrayList.size());
/* 10 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 18 */                int i = 0;
/* 20 */                if (!it.hasNext()) {
/* 129 */                   Iterator it2 = map.values().iterator();
/* 137 */                   while (it2.hasNext()) {
/* 153 */                       for (Ii0liio0OOO ii0liio0OOO : (Set) it2.next()) {
/* 173 */                           for (IiIooooiilo iiIooooiilo : ii0liio0OOO.I00000oIO.I0000Il00O) {
/* 183 */                               if (iiIooooiilo.I0000Il00O == 0) {
/* 204 */                                   Set<Ii0liio0OOO> set = (Set) map.get(new Ii0lloOl(iiIooooiilo.I00000oIO, iiIooooiilo.I00000oOI == 2));
/* 206 */                                   if (set != null) {
/* 217 */                                       for (Ii0liio0OOO ii0liio0OOO2 : set) {
/* 227 */                                           ii0liio0OOO.I00000oOI.add(ii0liio0OOO2);
/* 232 */                                           ii0liio0OOO2.I0000Il00O.add(ii0liio0OOO);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 238 */                   HashSet hashSet = new HashSet();
/* 245 */                   Iterator it3 = map.values().iterator();
/* 253 */                   while (it3.hasNext()) {
/* 261 */                       hashSet.addAll((Set) it3.next());
                            }
/* 267 */                   HashSet hashSet2 = new HashSet();
/* 270 */                   Iterator it4 = hashSet.iterator();
/* 278 */                   while (it4.hasNext()) {
/* 284 */                       Ii0liio0OOO ii0liio0OOO3 = (Ii0liio0OOO) it4.next();
/* 292 */                       if (ii0liio0OOO3.I0000Il00O.isEmpty()) {
/* 294 */                           hashSet2.add(ii0liio0OOO3);
                                }
                            }
/* 302 */                   while (!hashSet2.isEmpty()) {
/* 312 */                       Ii0liio0OOO ii0liio0OOO4 = (Ii0liio0OOO) hashSet2.iterator().next();
/* 314 */                       hashSet2.remove(ii0liio0OOO4);
/* 317 */                       i++;
/* 321 */                       Iterator it5 = ii0liio0OOO4.I00000oOI.iterator();
/* 329 */                       while (it5.hasNext()) {
/* 335 */                           Ii0liio0OOO ii0liio0OOO5 = (Ii0liio0OOO) it5.next();
/* 339 */                           ii0liio0OOO5.I0000Il00O.remove(ii0liio0OOO4);
/* 348 */                           if (ii0liio0OOO5.I0000Il00O.isEmpty()) {
/* 350 */                               hashSet2.add(ii0liio0OOO5);
                                    }
                                }
                            }
/* 358 */                   if (i == arrayList.size()) {
/* 360 */                       return;
                            }
/* 363 */                   ArrayList arrayList2 = new ArrayList();
/* 366 */                   Iterator it6 = hashSet.iterator();
/* 374 */                   while (it6.hasNext()) {
/* 380 */                       Ii0liio0OOO ii0liio0OOO6 = (Ii0liio0OOO) it6.next();
/* 388 */                       if (!ii0liio0OOO6.I0000Il00O.isEmpty() && !ii0liio0OOO6.I00000oOI.isEmpty()) {
/* 400 */                           arrayList2.add(ii0liio0OOO6.I00000oIO);
                                }
                            }
/* 428 */                   IiO00oI1oiIo iiO00oI1oiIo = new IiO00oI1oiIo("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 1);
/* 431 */                   VarHandle.storeStoreFence();
/* 966 */                   throw iiO00oI1oiIo;
                        }
/* 26 */                IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) it.next();
/* 30 */                Ii0liio0OOO ii0liio0OOO7 = new Ii0liio0OOO();
/* 38 */                ii0liio0OOO7.I00000oOI = new HashSet();
/* 45 */                ii0liio0OOO7.I0000Il00O = new HashSet();
/* 47 */                ii0liio0OOO7.I00000oIO = iOiIi0Oi;
/* 49 */                VarHandle.storeStoreFence();
/* 62 */                for (OOiilOlOOI oOiilOlOOI : iOiIi0Oi.I00000oOI) {
/* 78 */                    boolean z = iOiIi0Oi.I0000oI00 == 0;
/* 81 */                    Ii0lloOl ii0lloOl = new Ii0lloOl(oOiilOlOOI, !z);
/* 88 */                    if (!map.containsKey(ii0lloOl)) {
/* 95 */                        map.put(ii0lloOl, new HashSet());
                            }
/* 102 */                   Set set2 = (Set) map.get(ii0lloOl);
/* 108 */                   if (!set2.isEmpty() && z) {
/* 117 */                       OoOil11Ol1o.I000OOo1O(oOiilOlOOI, "Multiple components provide ", ".");
/* 120 */                       return;
                            }
/* 121 */                   set2.add(ii0liio0OOO7);
                        }
                    }
                }
            }
