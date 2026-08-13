            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public final class o1I0iIli0ll extends i1Ii10O {
                public Map I00000oOI;

                public static void I0000O(LinkedHashMap linkedHashMap, ll1lIIo ll1liio) {
/* 6 */             for (int i = 0; i < ll1liio.I00000oIO(); i++) {
/* 8 */                 o0oooliI o0oooliiI00000oOI = ll1liio.I00000oOI(i);
/* 12 */                Object obj = linkedHashMap.get(o0oooliiI00000oOI);
/* 16 */                boolean z = o0oooliiI00000oOI.I0000Il00O;
/* 18 */                Class cls = o0oooliiI00000oOI.I00000oOI;
/* 20 */                if (z) {
/* 22 */                    List arrayList = (List) obj;
/* 24 */                    if (arrayList == null) {
/* 28 */                        arrayList = new ArrayList();
/* 31 */                        linkedHashMap.put(o0oooliiI00000oOI, arrayList);
                            }
/* 42 */                    arrayList.add(cls.cast(ll1liio.I0000Il00O(i)));
                        } else {
/* 54 */                    linkedHashMap.put(o0oooliiI00000oOI, cls.cast(ll1liio.I0000Il00O(i)));
                        }
                    }
                }

                @Override
                public final void I00000oIO(OillOo0 oillOo0, o1101OI1l o1101oi1l) {
/* 15 */            for (Map.Entry entry : this.I00000oOI.entrySet()) {
/* 27 */                o0oooliI o0ooolii = (o0oooliI) entry.getKey();
/* 29 */                Object value = entry.getValue();
/* 35 */                if (o0ooolii.I0000Il00O) {
/* 43 */                    oillOo0.I001l0I00(o0ooolii, ((List) value).iterator(), o1101oi1l);
                        } else {
/* 47 */                    oillOo0.I001IIilI0O(o0ooolii, value, o1101oi1l);
                        }
                    }
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00000oOI.size();
                }

                @Override
                public final Set I0000Il00O() {
/* 3 */             return this.I00000oOI.keySet();
                }
            }
