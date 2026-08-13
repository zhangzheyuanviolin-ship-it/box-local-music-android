            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.SortedSet;
            
            public abstract class ll0lO1 {
                public static boolean I00000oIO(Comparator comparator, Collection collection) {
                    Object objComparator;
/* 1 */             comparator.getClass();
/* 4 */             collection.getClass();
/* 9 */             if (collection instanceof SortedSet) {
/* 13 */                objComparator = ((SortedSet) collection).comparator();
/* 17 */                if (objComparator == null) {
/* 19 */                    objComparator = lOi11lOlOoi1.I00iiI;
                        }
                    } else {
/* 24 */                if (!(collection instanceof lOloio0)) {
/* 35 */                    return false;
                        }
/* 28 */                objComparator = ((lOloio0) collection).I00iiO;
                    }
/* 30 */            return comparator.equals(objComparator);
                }
            }
