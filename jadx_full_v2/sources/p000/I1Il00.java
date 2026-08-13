            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 24 */    public final class I1Il00 implements Collection, O0IlIoi {
                public Object[] I00iOIl;
                public boolean I00iiI;

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
/* 3 */             return I1IoiO1l.I0001Ioi1lo(this.I00iOIl, obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Collection collection2 = collection;
/* 11 */            if (collection2.isEmpty()) {
/* 10 */                return true;
                    }
/* 14 */            Iterator it = collection2.iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                if (!I1IoiO1l.I0001Ioi1lo(this.I00iOIl, it.next())) {
/* 36 */                    return false;
                        }
                    }
/* 10 */            return true;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iOIl.length == 0;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return iOO1OO.I00000oIO(this.I00iOIl);
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
/* 3 */             return this.I00iOIl.length;
                }

                @Override
                public final Object[] toArray() {
/* 1 */             Object[] objArr = this.I00iOIl;
                    return (this.I00iiI && objArr.getClass().equals(Object[].class)) ? objArr : Arrays.copyOf(objArr, objArr.length, Object[].class);
                }

                @Override
/* 25 */        public final Object[] toArray(Object[] objArr) {
/* 26 */            return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
