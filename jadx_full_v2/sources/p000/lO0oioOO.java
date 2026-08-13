            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            
            public abstract class lO0oioOO {
                public static final Collection I00000oIO(Collection collection, Collection collection2) {
/* 5 */             if (collection2.isEmpty()) {
/* 7 */                 return collection;
                    }
/* 8 */             if (collection == null) {
/* 10 */                return collection2;
                    }
/* 13 */            if (collection instanceof LinkedHashSet) {
/* 18 */                ((LinkedHashSet) collection).addAll(collection2);
/* 21 */                return collection;
                    }
/* 24 */            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
/* 27 */            linkedHashSet.addAll(collection2);
/* 89 */            return linkedHashSet;
                }

                public static final Ol1O1o01 I00000oOI(ArrayList arrayList) {
/* 3 */             Ol1O1o01 ol1O1o01 = new Ol1O1o01();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 16 */                Object next = it.next();
/* 21 */                O1iil1I01o o1iil1I01o = (O1iil1I01o) next;
/* 23 */                if (o1iil1I01o != null && o1iil1I01o != O1iii1olO.I00000oOI) {
/* 29 */                    ol1O1o01.add(next);
                        }
                    }
/* 49 */            return ol1O1o01;
                }
            }
