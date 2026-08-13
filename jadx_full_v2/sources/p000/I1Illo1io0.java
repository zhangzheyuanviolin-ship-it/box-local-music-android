            package p000;

            import java.lang.reflect.Array;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 39 */    public final class I1Illo1io0 implements Set {
                public I1Io0i0II I00iOIl;

                @Override
                public final boolean add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iOIl.containsKey(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             return this.I00iOIl.I000iOII(collection);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 8 */             if (!(obj instanceof Set)) {
/* 28 */                return false;
                    }
/* 10 */            Set set = (Set) obj;
                    try {
/* 18 */                if (i1Io0i0II.I00iiO == set.size()) {
                            return i1Io0i0II.I000iOII(set);
                        }
/* 28 */                return false;
                    } catch (ClassCastException | NullPointerException unused) {
/* 28 */                return false;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 8 */             int iHashCode = 0;
/* 9 */             for (int i = i1Io0i0II.I00iiO - 1; i >= 0; i--) {
/* 11 */                Object objI000II = i1Io0i0II.I000II(i);
/* 23 */                iHashCode += objI000II == null ? 0 : objI000II.hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return new I1IlliII1i(this.I00iOIl, 0);
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int iI0000Il00O = i1Io0i0II.I0000Il00O(obj);
/* 7 */             if (iI0000Il00O < 0) {
/* 14 */                return false;
                    }
/* 9 */             i1Io0i0II.I000O01llI0(iI0000Il00O);
/* 12 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 3 */             return this.I00iOIl.I000l1(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int i = i1Io0i0II.I00iiO;
/* 7 */             for (int i2 = i - 1; i2 >= 0; i2--) {
/* 17 */                if (!collection.contains(i1Io0i0II.I000II(i2))) {
/* 19 */                    i1Io0i0II.I000O01llI0(i2);
                        }
                    }
                    return i != i1Io0i0II.I00iiO;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I00iiO;
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int i = i1Io0i0II.I00iiO;
/* 6 */             if (objArr.length < i) {
/* 20 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                    }
/* 23 */            for (int i2 = 0; i2 < i; i2++) {
/* 29 */                objArr[i2] = i1Io0i0II.I000II(i2);
                    }
/* 35 */            if (objArr.length > i) {
/* 38 */                objArr[i] = null;
                    }
/* 77 */            return objArr;
                }

                @Override
/* 40 */        public final Object[] toArray() {
/* 41 */            I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 42 */            int i = i1Io0i0II.I00iiO;
/* 43 */            Object[] objArr = new Object[i];
                    for (int i2 = 0; i2 < i; i2++) {
/* 44 */                objArr[i2] = i1Io0i0II.I000II(i2);
                    }
                    return objArr;
                }
            }
