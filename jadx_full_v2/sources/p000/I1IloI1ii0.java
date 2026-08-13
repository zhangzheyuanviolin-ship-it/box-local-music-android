            package p000;

            import java.lang.reflect.Array;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 39 */    public final class I1IloI1ii0 implements Collection {
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
                    return this.I00iOIl.I00000oIO(obj) >= 0;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 19 */                if (!contains(it.next())) {
/* 21 */                    return false;
                        }
                    }
/* 23 */            return true;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return new I1IlliII1i(this.I00iOIl, 1);
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int iI00000oIO = i1Io0i0II.I00000oIO(obj);
/* 7 */             if (iI00000oIO < 0) {
/* 14 */                return false;
                    }
/* 9 */             i1Io0i0II.I000O01llI0(iI00000oIO);
/* 12 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int i = i1Io0i0II.I00iiO;
/* 5 */             int i2 = 0;
/* 6 */             boolean z = false;
/* 7 */             while (i2 < i) {
/* 18 */                if (collection.contains(i1Io0i0II.I000OiO(i2))) {
/* 20 */                    i1Io0i0II.I000O01llI0(i2);
                            i2--;
                            i--;
/* 27 */                    z = true;
                        }
/* 28 */                i2++;
                    }
/* 77 */            return z;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iOIl;
/* 3 */             int i = i1Io0i0II.I00iiO;
/* 5 */             int i2 = 0;
/* 6 */             boolean z = false;
/* 7 */             while (i2 < i) {
/* 18 */                if (!collection.contains(i1Io0i0II.I000OiO(i2))) {
/* 20 */                    i1Io0i0II.I000O01llI0(i2);
                            i2--;
                            i--;
/* 27 */                    z = true;
                        }
/* 28 */                i2++;
                    }
/* 77 */            return z;
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
/* 29 */                objArr[i2] = i1Io0i0II.I000OiO(i2);
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
/* 44 */                objArr[i2] = i1Io0i0II.I000OiO(i2);
                    }
                    return objArr;
                }
            }
