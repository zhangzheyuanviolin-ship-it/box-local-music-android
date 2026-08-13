            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.function.UnaryOperator;
            
            @Oili0O(with = O01I1i.class)
/* 4 */     public final class O011oi0l1O extends O01O0o1iI implements List<O01O0o1iI>, O0IlIoi {
                public static final O011oOi0 Companion = new O011oOi0();
                public final List I00iOIl;

                public O011oi0l1O(List list) {
/* 4 */             this.I00iOIl = list;
                }

                @Override
                public final void add(int i, O01O0o1iI o01O0o1iI) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(int i, Collection<? extends O01O0o1iI> collection) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void clear() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof O01O0o1iI)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.I00iOIl.contains((O01O0o1iI) obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             return this.I00iOIl.containsAll(collection);
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             return O0000Ioio00.I0000O(this.I00iOIl, obj);
                }

                @Override
                public final O01O0o1iI get(int i) {
/* 7 */             return (O01O0o1iI) this.I00iOIl.get(i);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof O01O0o1iI)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.I00iOIl.indexOf((O01O0o1iI) obj);
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.iterator();
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             if (!(obj instanceof O01O0o1iI)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.I00iOIl.lastIndexOf((O01O0o1iI) obj);
                }

                @Override
                public final ListIterator<O01O0o1iI> listIterator() {
/* 3 */             return this.I00iOIl.listIterator();
                }

                @Override
                public final O01O0o1iI remove(int i) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void replaceAll(UnaryOperator<O01O0o1iI> unaryOperator) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI set(int i, O01O0o1iI o01O0o1iI) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
                public final void sort(Comparator<? super O01O0o1iI> comparator) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final List<O01O0o1iI> subList(int i, int i2) {
/* 3 */             return this.I00iOIl.subList(i, i2);
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 15 */            return IOOi0Ool1i.I00IlilI0i0i(this.I00iOIl, ",", "[", "]", null, 56);
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }

                @Override
/* 7 */         public final ListIterator<O01O0o1iI> listIterator(int i) {
/* 8 */             return this.I00iOIl.listIterator(i);
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
            }
