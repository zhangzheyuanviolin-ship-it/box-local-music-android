            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.SortedSet;
            
            public abstract class liooI111l1i {
                public static boolean I00000oIO(Comparator comparator, Collection collection) {
                    Object objComparator;
/* 1 */             comparator.getClass();
/* 4 */             collection.getClass();
/* 9 */             if (collection instanceof SortedSet) {
/* 13 */                objComparator = ((SortedSet) collection).comparator();
/* 17 */                if (objComparator == null) {
/* 19 */                    objComparator = iol0Oi.I00iiI;
                        }
                    } else {
/* 24 */                if (!(collection instanceof l00OOOllolOO)) {
/* 35 */                    return false;
                        }
/* 28 */                objComparator = ((l00OOOllolOO) collection).I00o0iI0io1;
                    }
/* 30 */            return comparator.equals(objComparator);
                }
            }
