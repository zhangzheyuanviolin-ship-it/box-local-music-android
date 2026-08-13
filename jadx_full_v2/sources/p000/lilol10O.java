            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class lilol10O {
                public static int I00000oIO(Set set) {
/* 1 */             Iterator it = set.iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 29 */            return iHashCode;
                }

                public static boolean I00000oOI(ii1llo ii1lloVar, Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             if (collection instanceof ilI1o1) {
/* 10 */                collection = ((ilI1o1) collection).zza();
                    }
/* 16 */            boolean zRemove = false;
/* 17 */            if (!(collection instanceof Set) || collection.size() <= ii1lloVar.size()) {
/* 55 */                Iterator it = collection.iterator();
/* 63 */                while (it.hasNext()) {
/* 73 */                    zRemove |= ii1lloVar.remove(it.next());
                        }
/* 106 */               return zRemove;
                    }
/* 29 */            Iterator<E> it2 = ii1lloVar.iterator();
/* 37 */            while (it2.hasNext()) {
/* 47 */                if (collection.contains(it2.next())) {
/* 49 */                    it2.remove();
/* 52 */                    zRemove = true;
                        }
                    }
/* 54 */            return zRemove;
                }
            }
