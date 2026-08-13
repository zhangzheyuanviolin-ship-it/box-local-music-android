            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 4 */     public final class Il01100l implements List, Serializable, RandomAccess, O0IlIoi {
                public static final Il01100l I00iOIl = new Il01100l();

                @Override
                public final void add(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
                    return (obj instanceof List) && ((List) obj).isEmpty();
                }

                @Override
                public final Object get(int i) {
/* 49 */            throw new IndexOutOfBoundsException(Oi010OO0.I0010I0i("Empty list doesn't contain element at index ", i, '.'));
                }

                @Override
                public final int hashCode() {
/* 1 */             return 1;
                }

                @Override
                public final int indexOf(Object obj) {
/* 1 */             return -1;
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
                public final int lastIndexOf(Object obj) {
/* 1 */             return -1;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return Il010loii1OO.I00iOIl;
                    }
/* 12 */            I000II.I0010o(Oi010OO0.I000oI1ioi(i, "Index: "));
/* 15 */            return null;
                }

                @Override
                public final Object remove(int i) {
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
                public final Object set(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 1 */             return 0;
                }

                @Override
                public final List subList(int i, int i2) {
/* 1 */             if (i == 0 && i2 == 0) {
/* 5 */                 return this;
                    }
/* 14 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "fromIndex: ", ", toIndex: "));
/* 17 */            return null;
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

                @Override
/* 8 */         public final boolean add(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final boolean addAll(Collection collection) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final boolean remove(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 16 */        public final ListIterator listIterator() {
/* 17 */            return Il010loii1OO.I00iOIl;
                }
            }
