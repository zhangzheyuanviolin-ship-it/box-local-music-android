            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.SortedSet;
            
            public abstract class lOO00lOoI {
                public static boolean I00000oIO(Comparator comparator, Collection collection) {
                    Object objComparator;
/* 1 */             comparator.getClass();
/* 4 */             collection.getClass();
/* 9 */             if (collection instanceof SortedSet) {
/* 13 */                objComparator = ((SortedSet) collection).comparator();
/* 17 */                if (objComparator == null) {
/* 19 */                    objComparator = OI1OOoOiOOl.I00iOIl;
                        }
                    } else {
/* 24 */                if (!(collection instanceof Ioio1ol111i)) {
/* 35 */                    return false;
                        }
/* 28 */                objComparator = ((Ioio1ol111i) collection).I00iio;
                    }
/* 30 */            return comparator.equals(objComparator);
                }
            }
