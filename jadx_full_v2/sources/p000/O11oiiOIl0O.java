            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.function.Predicate;
            
/* 4 */     public final class O11oiiOIl0O implements Collection, O0IlIoi {
                public static final O11oiiOIl0O I00iiO = new O11oiiOIl0O(Il01100l.I00iOIl);
                public final List I00iOIl;
                public final int I00iiI;

                public O11oiiOIl0O(List list) {
/* 4 */             this.I00iOIl = list;
/* 10 */            this.I00iiI = list.size();
                }

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
/* 3 */             if (!(obj instanceof O11oOOio1iO)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.I00iOIl.contains((O11oOOio1iO) obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             return this.I00iOIl.containsAll(collection);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
/* 6 */             if (obj instanceof O11oiiOIl0O) {
                        return this.I00iOIl.equals(((O11oiiOIl0O) obj).I00iOIl);
                    }
/* 21 */            return false;
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
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
                public final boolean remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeIf(Predicate predicate) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 18 */            return "LocaleList(localeList=" + this.I00iOIl + ")";
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
