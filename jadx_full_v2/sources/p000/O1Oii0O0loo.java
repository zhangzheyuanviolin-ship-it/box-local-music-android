            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.NoSuchElementException;
            
            public abstract class O1Oii0O0loo extends O1Oii0o0Oi {
                public static Object I00000oOI(Object obj, Map map) {
/* 1 */             Object obj2 = map.get(obj);
/* 5 */             if (obj2 != null || map.containsKey(obj)) {
/* 106 */               return obj2;
                    }
/* 38 */            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
                }

                public static HashMap I0000Il00O(OIoi0IIoi... oIoi0IIoiArr) {
/* 8 */             HashMap map = new HashMap(O1Oii0o0Oi.I00000oIO(oIoi0IIoiArr.length));
/* 11 */            I000II(map, oIoi0IIoiArr);
/* 29 */            return map;
                }

                public static Map I0000O(OIoi0IIoi... oIoi0IIoiArr) {
/* 2 */             if (oIoi0IIoiArr.length <= 0) {
/* 18 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 11 */            LinkedHashMap linkedHashMap = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(oIoi0IIoiArr.length));
/* 14 */            I000II(linkedHashMap, oIoi0IIoiArr);
/* 17 */            return linkedHashMap;
                }

                public static LinkedHashMap I0000oI00(OIoi0IIoi... oIoi0IIoiArr) {
/* 8 */             LinkedHashMap linkedHashMap = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(oIoi0IIoiArr.length));
/* 11 */            I000II(linkedHashMap, oIoi0IIoiArr);
/* 29 */            return linkedHashMap;
                }

                public static LinkedHashMap I0001Ioi1lo(Map map, Map map2) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap(map);
/* 6 */             linkedHashMap.putAll(map2);
/* 37 */            return linkedHashMap;
                }

                public static final void I000II(HashMap map, OIoi0IIoi[] oIoi0IIoiArr) {
/* 3 */             for (OIoi0IIoi oIoi0IIoi : oIoi0IIoiArr) {
/* 11 */                map.put(oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
                    }
                }

                public static List I000O01llI0(Map map) {
/* 1 */             int size = map.size();
/* 5 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 7 */             if (size == 0) {
/* 9 */                 return il01100l;
                    }
/* 14 */            Iterator it = map.entrySet().iterator();
/* 22 */            if (!it.hasNext()) {
/* 24 */                return il01100l;
                    }
/* 29 */            Map.Entry entry = (Map.Entry) it.next();
/* 35 */            if (!it.hasNext()) {
/* 50 */                return Collections.singletonList(new OIoi0IIoi(entry.getKey(), entry.getValue()));
                    }
/* 61 */            ArrayList arrayList = new ArrayList(map.size());
/* 77 */            arrayList.add(new OIoi0IIoi(entry.getKey(), entry.getValue()));
/* 106 */           do {
/* 84 */                Map.Entry entry2 = (Map.Entry) it.next();
/* 99 */                arrayList.add(new OIoi0IIoi(entry2.getKey(), entry2.getValue()));
/* 106 */           } while (it.hasNext());
/* 168 */           return arrayList;
                }

                public static Map I000OOo1O(IlIo0o ilIo0o) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             Iterator it = ilIo0o.iterator();
                    while (true) {
/* 11 */                IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 17 */                if (!ilIloII10O.hasNext()) {
                            break;
                        }
/* 23 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) ilIloII10O.next();
/* 29 */                linkedHashMap.put(oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
                    }
/* 33 */            int size = linkedHashMap.size();
/* 37 */            if (size == 0) {
/* 70 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 40 */            if (size != 1) {
/* 42 */                return linkedHashMap;
                    }
/* 55 */            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
/* 65 */            return Collections.singletonMap(entry.getKey(), entry.getValue());
                }

                public static Map I000OiO(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 5 */             if (size == 0) {
/* 64 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 8 */             if (size == 1) {
/* 53 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) arrayList.get(0);
/* 59 */                return Collections.singletonMap(oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
                    }
/* 20 */            LinkedHashMap linkedHashMap = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(arrayList.size()));
/* 23 */            Iterator it = arrayList.iterator();
/* 31 */            while (it.hasNext()) {
/* 37 */                OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) it.next();
/* 43 */                linkedHashMap.put(oIoi0IIoi2.I00iOIl, oIoi0IIoi2.I00iiI);
                    }
/* 47 */            return linkedHashMap;
                }

                public static Map I000iOII(Map map) {
/* 1 */             int size = map.size();
/* 5 */             if (size == 0) {
/* 43 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 8 */             if (size != 1) {
/* 12 */                return new LinkedHashMap(map);
                    }
/* 28 */            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
/* 38 */            return Collections.singletonMap(entry.getKey(), entry.getValue());
                }
            }
