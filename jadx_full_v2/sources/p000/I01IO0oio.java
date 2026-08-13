            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 6 */     public abstract class I01IO0oio extends I00ooIo0 implements List {
                @Override
                public final void add(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 11 */            Collection collection = (Collection) obj;
/* 21 */            if (size() == collection.size()) {
/* 24 */                Iterator it = collection.iterator();
/* 28 */                Iterator<E> it2 = iterator();
/* 36 */                while (it2.hasNext()) {
/* 50 */                    if (!O0000Ioio00.I0000O(it2.next(), it.next())) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 7 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator<E> it = iterator();
/* 5 */             int iHashCode = 1;
/* 10 */            while (it.hasNext()) {
/* 12 */                Object next = it.next();
/* 26 */                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
                    }
/* 29 */            return iHashCode;
                }

                @Override
                public int indexOf(Object obj) {
/* 1 */             Iterator it = iterator();
/* 5 */             int i = 0;
/* 10 */            while (it.hasNext()) {
/* 20 */                if (O0000Ioio00.I0000O(it.next(), obj)) {
/* 22 */                    return i;
                        }
/* 23 */                i++;
                    }
/* 26 */            return -1;
                }

                @Override
                public Iterator iterator() {
/* 3 */             return new I01I0Iioooo0(this);
                }

                @Override
                public int lastIndexOf(Object obj) {
/* 5 */             ListIterator listIterator = listIterator(size());
/* 13 */            while (listIterator.hasPrevious()) {
/* 23 */                if (O0000Ioio00.I0000O(listIterator.previous(), obj)) {
/* 25 */                    return listIterator.nextIndex();
                        }
                    }
/* 30 */            return -1;
                }

                @Override
                public ListIterator listIterator() {
/* 4 */             return new I01I1Oo0oll(this, 0);
                }

                @Override
                public final Object remove(int i) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object set(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public List subList(int i, int i2) {
/* 3 */             return new I01II10(this, i, i2);
                }

                @Override
/* 7 */         public ListIterator listIterator(int i) {
/* 8 */             return new I01I1Oo0oll(this, i);
                }
            }
