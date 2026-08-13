            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public final class iilIloo0I111 extends iilOlo01ooO {
                public Map I00000oOI;

                public static void I0000O(LinkedHashMap linkedHashMap, lilI1ii lili1ii) {
/* 6 */             for (int i = 0; i < lili1ii.I00000oIO(); i++) {
/* 8 */                 iIIoI1 iiioi1I00000oOI = lili1ii.I00000oOI(i);
/* 12 */                Object obj = linkedHashMap.get(iiioi1I00000oOI);
/* 16 */                boolean z = iiioi1I00000oOI.I0000Il00O;
/* 18 */                Class cls = iiioi1I00000oOI.I00000oOI;
/* 20 */                if (z) {
/* 22 */                    List arrayList = (List) obj;
/* 24 */                    if (arrayList == null) {
/* 28 */                        arrayList = new ArrayList();
/* 31 */                        linkedHashMap.put(iiioi1I00000oOI, arrayList);
                            }
/* 42 */                    arrayList.add(cls.cast(lili1ii.I0000O(i)));
                        } else {
/* 54 */                    linkedHashMap.put(iiioi1I00000oOI, cls.cast(lili1ii.I0000O(i)));
                        }
                    }
                }

                @Override
                public final int I00000oIO() {
/* 3 */             return this.I00000oOI.size();
                }

                @Override
                public final Set I00000oOI() {
/* 3 */             return this.I00000oOI.keySet();
                }

                @Override
                public final void I0000Il00O(ii1llo1liOl0 ii1llo1liol0, iOoO1O iooo1o) {
/* 15 */            for (Map.Entry entry : this.I00000oOI.entrySet()) {
/* 27 */                iIIoI1 iiioi1 = (iIIoI1) entry.getKey();
/* 29 */                Object value = entry.getValue();
/* 35 */                if (iiioi1.I0000Il00O) {
/* 43 */                    ii1llo1liol0.I00000oOI(iiioi1, ((List) value).iterator(), iooo1o);
                        } else {
/* 47 */                    ii1llo1liol0.I00000oIO(iiioi1, value, iooo1o);
                        }
                    }
                }
            }
