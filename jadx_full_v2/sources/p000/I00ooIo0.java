            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 4 */     public abstract class I00ooIo0 implements Collection, O0IlIoi {
                public abstract int I00000oOI();

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
                public boolean contains(Object obj) {
/* 6 */             if (isEmpty()) {
/* 5 */                 return false;
                    }
/* 9 */             Iterator<E> it = iterator();
/* 17 */            while (it.hasNext()) {
/* 27 */                if (O0000Ioio00.I0000O(it.next(), obj)) {
/* 29 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public boolean containsAll(Collection collection) {
/* 1 */             Collection collection2 = collection;
/* 10 */            if (collection2.isEmpty()) {
/* 35 */                return true;
                    }
/* 13 */            Iterator it = collection2.iterator();
/* 21 */            while (it.hasNext()) {
/* 31 */                if (!contains(it.next())) {
/* 33 */                    return false;
                        }
                    }
/* 35 */            return true;
                }

                @Override
                public boolean isEmpty() {
                    return I00000oOI() == 0;
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
/* 1 */             return I00000oOI();
                }

                @Override
                public Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 4 */             IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(1);
/* 7 */             iIOIlOoI111.I00iiI = this;
/* 9 */             VarHandle.storeStoreFence();
/* 21 */            return IOOi0Ool1i.I00IlilI0i0i(this, ", ", "[", "]", iIOIlOoI111, 24);
                }

                @Override
/* 5 */         public Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
