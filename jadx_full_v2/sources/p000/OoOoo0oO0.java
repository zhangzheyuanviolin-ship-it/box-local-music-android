            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 4 */     public final class OoOoo0oO0 implements Collection, O0IlIoi {
                public byte[] I00iOIl;

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
/* 4 */             if (!(obj instanceof OoOoil0I)) {
/* 3 */                 return false;
                    }
/* 9 */             byte b = ((OoOoil0I) obj).I00iOIl;
/* 11 */            byte[] bArr = this.I00iOIl;
/* 13 */            int length = bArr.length;
/* 14 */            int i = 0;
                    while (true) {
/* 15 */                if (i >= length) {
/* 25 */                    i = -1;
                            break;
                        }
/* 19 */                if (b == bArr[i]) {
                            break;
                        }
/* 22 */                i++;
                    }
                    return i >= 0;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 3 */             Collection collection2 = collection;
/* 12 */            if (collection2.isEmpty()) {
/* 55 */                return true;
                    }
/* 23 */            for (Object obj : collection2) {
/* 32 */                if (obj instanceof OoOoil0I) {
/* 36 */                    byte b = ((OoOoil0I) obj).I00iOIl;
/* 38 */                    int length = bArr.length;
/* 39 */                    int i = 0;
                            while (true) {
/* 40 */                        if (i >= length) {
/* 50 */                            i = -1;
                                    break;
                                }
/* 44 */                        if (b == bArr[i]) {
                                    break;
                                }
/* 47 */                        i++;
                            }
/* 51 */                    if (i >= 0) {
                            }
                        }
/* 31 */                return false;
                    }
/* 55 */            return true;
                }

                @Override
                public final boolean equals(Object obj) {
                    return (obj instanceof OoOoo0oO0) && this.I00iOIl.equals(((OoOoo0oO0) obj).I00iOIl);
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
/* 1 */             byte[] bArr = this.I00iOIl;
/* 6 */             I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(4);
/* 9 */             i01I0Iioooo0.I00iiO = bArr;
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
/* 22 */            return "UByteArray(storage=" + Arrays.toString(this.I00iOIl) + ')';
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
