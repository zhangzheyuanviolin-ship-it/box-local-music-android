            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.function.UnaryOperator;
            
/* 4 */     public final class Io1ioliOi implements List, O0IlIoi {
                public final int I00iOIl;
                public final int I00iiI;
                public final Io1l0iI11iII I00iiO;

                public Io1ioliOi(Io1l0iI11iII io1l0iI11iII, int i, int i2) {
/* 4 */             this.I00iiO = io1l0iI11iII;
/* 6 */             this.I00iOIl = i;
/* 8 */             this.I00iiI = i2;
                }

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
                    return (obj instanceof O1ooOo) && indexOf((O1ooOo) obj) != -1;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                if (!contains((O1ooOo) it.next())) {
/* 25 */                    return false;
                        }
                    }
/* 27 */            return true;
                }

                @Override
                public final Object get(int i) {
/* 12 */            return (O1ooOo) this.I00iiO.I00iOIl.I000II(i + this.I00iOIl);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof O1ooOo)) {
/* 36 */                return -1;
                    }
/* 6 */             O1ooOo o1ooOo = (O1ooOo) obj;
/* 8 */             int i = this.I00iOIl;
/* 10 */            int i2 = this.I00iiI;
/* 12 */            if (i > i2) {
/* 36 */                return -1;
                    }
/* 14 */            int i3 = i;
/* 27 */            while (!O0000Ioio00.I0000O(this.I00iiO.I00iOIl.I000II(i3), o1ooOo)) {
/* 31 */                if (i3 == i2) {
/* 36 */                    return -1;
                        }
/* 33 */                i3++;
                    }
/* 29 */            return i3 - i;
                }

                @Override
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             int i = this.I00iOIl;
/* 9 */             return new Io1ioiIIO1lI(this.I00iiO, i, i, this.I00iiI);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             if (!(obj instanceof O1ooOo)) {
/* 35 */                return -1;
                    }
/* 6 */             O1ooOo o1ooOo = (O1ooOo) obj;
/* 8 */             int i = this.I00iiI;
/* 10 */            int i2 = this.I00iOIl;
/* 12 */            if (i2 > i) {
/* 35 */                return -1;
                    }
/* 26 */            while (!O0000Ioio00.I0000O(this.I00iiO.I00iOIl.I000II(i), o1ooOo)) {
/* 30 */                if (i == i2) {
/* 35 */                    return -1;
                        }
                        i--;
                    }
/* 28 */            return i - i2;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 3 */             int i2 = this.I00iOIl;
/* 6 */             int i3 = this.I00iiI;
/* 10 */            return new Io1ioiIIO1lI(this.I00iiO, i + i2, i2, i3);
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
/* 5 */             return this.I00iiI - this.I00iOIl;
                }

                @Override
                public final void sort(Comparator comparator) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             int i3 = this.I00iOIl;
/* 9 */             return new Io1ioliOi(this.I00iiO, i + i3, i3 + i2);
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
/* 8 */         public final boolean remove(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 13 */        public final ListIterator listIterator() {
                    int i = this.I00iOIl;
/* 14 */            return new Io1ioiIIO1lI(this.I00iiO, i, i, this.I00iiI);
                }
            }
