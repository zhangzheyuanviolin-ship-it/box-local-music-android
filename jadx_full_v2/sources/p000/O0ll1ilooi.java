            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.function.UnaryOperator;
            
/* 4 */     public final class O0ll1ilooi implements List, O0IlIoi {
                public final Ol1o0O0O0 I00iOIl = new Ol1o0O0O0();

                @Override
                public final void add(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final void addFirst(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final void addLast(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof O0ll1IIi)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.I00iOIl.contains((O0ll1IIi) obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             return this.I00iOIl.containsAll(collection);
                }

                @Override
                public final Object get(int i) {
/* 7 */             return (O0ll1IIi) this.I00iOIl.get(i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof O0ll1IIi)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.I00iOIl.indexOf((O0ll1IIi) obj);
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.listIterator();
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             if (!(obj instanceof O0ll1IIi)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.I00iOIl.lastIndexOf((O0ll1IIi) obj);
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 5 */             return new Io1ioiIIO1lI(this.I00iOIl, i);
                }

                @Override
                public final Object remove(int i) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final Object removeFirst() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final Object removeLast() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void replaceAll(UnaryOperator unaryOperator) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object set(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
                public final void sort(Comparator comparator) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             return this.I00iOIl.subList(i, i2);
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
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
/* 8 */         public final ListIterator listIterator() {
/* 9 */             return this.I00iOIl.listIterator();
                }

                @Override
/* 8 */         public final boolean remove(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
