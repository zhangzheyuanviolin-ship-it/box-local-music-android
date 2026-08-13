            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 4 */     public final class OiO1IO0000l implements Set, O0IlIoi {
                public OI10IIO I00iOIl;

                @Override
                public final boolean add(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iOIl.I0000Il00O(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Collection collection2 = collection;
/* 6 */             if ((collection2 instanceof Collection) && collection2.isEmpty()) {
/* 5 */                 return true;
                    }
/* 18 */            Iterator it = collection2.iterator();
/* 26 */            while (it.hasNext()) {
/* 38 */                if (!this.I00iOIl.I0000Il00O(it.next())) {
/* 40 */                    return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.I000II();
                }

                @Override
                public final Iterator iterator() {
/* 8 */             return OilOIIlI.I00000oIO(new Il0l11i(this, null, 2));
                }

                @Override
                public final boolean remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I0000O;
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
