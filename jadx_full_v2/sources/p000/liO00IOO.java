            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.SortedSet;
            
            public abstract class liO00IOO {
                public static boolean I00000oIO(Comparator comparator, Collection collection) {
                    Object objComparator;
/* 1 */             comparator.getClass();
/* 4 */             collection.getClass();
/* 9 */             if (collection instanceof SortedSet) {
/* 13 */                objComparator = ((SortedSet) collection).comparator();
/* 17 */                if (objComparator == null) {
/* 19 */                    objComparator = i0Iill0.I00iiI;
                        }
                    } else {
/* 24 */                if (!(collection instanceof i0IlOIiO)) {
/* 35 */                    return false;
                        }
/* 28 */                objComparator = ((i0IlOIiO) collection).I00o0iI0io1;
                    }
/* 30 */            return comparator.equals(objComparator);
                }
            }
