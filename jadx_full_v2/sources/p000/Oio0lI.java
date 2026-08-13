            package p000;

            import java.util.Collection;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            public abstract class Oio0lI {
                public static Oilolol11I I00000oIO(Oilolol11I oilolol11I) {
/* 1 */             O1OOII o1ooii = oilolol11I.I00iOIl;
/* 3 */             o1ooii.I00000oOI();
                    return o1ooii.I00l0I0l0lO1 > 0 ? oilolol11I : Oilolol11I.I00iiI;
                }

                public static LinkedHashSet I00000oOI(Set set, Object obj) {
/* 11 */            LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(set.size()));
/* 21 */            boolean z = false;
/* 26 */            for (Object obj2 : set) {
/* 32 */                boolean z2 = true;
/* 33 */                if (!z && O0000Ioio00.I0000O(obj2, obj)) {
/* 41 */                    z = true;
/* 42 */                    z2 = false;
                        }
/* 43 */                if (z2) {
/* 45 */                    linkedHashSet.add(obj2);
                        }
                    }
/* 106 */           return linkedHashSet;
                }

                public static Set I0000Il00O(Set set, Iterable iterable) {
/* 3 */             if (!(iterable instanceof Collection)) {
/* 8 */                 iterable = IOOi0Ool1i.I00iIi0i1o(iterable);
                    }
/* 5 */             Collection<?> collection = (Collection) iterable;
/* 17 */            if (collection.isEmpty()) {
/* 21 */                return IOOi0Ool1i.I00iio(set);
                    }
/* 28 */            if (!(collection instanceof Set)) {
/* 69 */                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
/* 72 */                linkedHashSet.removeAll(collection);
/* 106 */               return linkedHashSet;
                    }
/* 34 */            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 45 */            for (Object obj : set) {
/* 58 */                if (!((Set) collection).contains(obj)) {
/* 60 */                    linkedHashSet2.add(obj);
                        }
                    }
/* 64 */            return linkedHashSet2;
                }

                public static Set I0000O(Object... objArr) {
/* 8 */             LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(objArr.length));
/* 13 */            for (Object obj : objArr) {
/* 17 */                linkedHashSet.add(obj);
                    }
/* 29 */            return linkedHashSet;
                }

                public static LinkedHashSet I0000oI00(Set set, Iterable iterable) {
/* 17 */            Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
/* 42 */            LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
/* 47 */            linkedHashSet.addAll(set);
/* 50 */            IOOii0O10Io0.I00100l0(linkedHashSet, iterable);
/* 106 */           return linkedHashSet;
                }

                public static LinkedHashSet I0001Ioi1lo(Set set, Object obj) {
/* 13 */            LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(set.size() + 1));
/* 18 */            linkedHashSet.addAll(set);
/* 21 */            linkedHashSet.add(obj);
/* 37 */            return linkedHashSet;
                }
            }
