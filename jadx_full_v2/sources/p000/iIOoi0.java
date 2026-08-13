            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class iIOoi0 extends i0IIio0oIoio implements Set {
                public transient iI0l1iOio0 I00lll10;

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this || obj == this) {
/* 1 */                 return true;
                    }
/* 10 */            if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
                        try {
/* 22 */                    if (size() == set.size()) {
                                return containsAll(set);
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 55 */            return iHashCode;
                }
            }
