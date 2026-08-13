            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 4 */     public final class Ooi0IOoioOOl implements Collection, O0IlIoi {
                public int[] I00iOIl;

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
/* 3 */             if (!(obj instanceof Ooi01Oi0II)) {
/* 5 */                 return false;
                    }
/* 13 */            return I1IoiO1l.I0000oI00(this.I00iOIl, ((Ooi01Oi0II) obj).I00iOIl);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             int[] iArr = this.I00iOIl;
/* 3 */             Collection collection2 = collection;
/* 12 */            if (collection2.isEmpty()) {
/* 46 */                return true;
                    }
/* 23 */            for (Object obj : collection2) {
/* 31 */                if (!(obj instanceof Ooi01Oi0II) || !I1IoiO1l.I0000oI00(iArr, ((Ooi01Oi0II) obj).I00iOIl)) {
/* 44 */                    return false;
                        }
                    }
/* 46 */            return true;
                }

                @Override
                public final boolean equals(Object obj) {
                    return (obj instanceof Ooi0IOoioOOl) && this.I00iOIl.equals(((Ooi0IOoioOOl) obj).I00iOIl);
                }

                @Override
                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00iOIl);
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iOIl.length == 0;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int[] iArr = this.I00iOIl;
/* 6 */             I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(5);
/* 9 */             i01I0Iioooo0.I00iiO = iArr;
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return i01I0Iioooo0;
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
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 22 */            return "UIntArray(storage=" + Arrays.toString(this.I00iOIl) + ')';
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
