            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class I01OoOi extends I00ooIo0 implements Set {
                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Set)) {
/* 7 */                 return false;
                    }
/* 11 */            Set set = (Set) obj;
/* 21 */            if (size() != set.size()) {
/* 7 */                 return false;
                    }
/* 26 */            return containsAll(set);
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator<E> it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 29 */            return iHashCode;
                }
            }
