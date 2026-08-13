            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 4 */     public final class Il01llIol0 implements Set, Serializable, O0IlIoi {
                public static final Il01llIol0 I00iOIl = new Il01llIol0();

                @Override
                public final boolean add(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void clear() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             return false;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             return collection.isEmpty();
                }

                @Override
                public final boolean equals(Object obj) {
                    return (obj instanceof Set) && ((Set) obj).isEmpty();
                }

                @Override
                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             return Il010loii1OO.I00iOIl;
                }

                @Override
                public final boolean remove(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 1 */             return "[]";
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
