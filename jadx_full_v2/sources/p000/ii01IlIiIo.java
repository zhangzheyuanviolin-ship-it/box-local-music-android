            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class ii01IlIiIo extends i0IIio0oIoio implements List, RandomAccess {
                public static final iOol1o1l01i I00lll10 = new iOol1o1l01i(iiOOi1OolOlO.I00o101lO, 0);

                public static iiOOi1OolOlO I001iOo1i0O(int i, Object[] objArr) {
                    return i == 0 ? iiOOi1OolOlO.I00o101lO : new iiOOi1OolOlO(objArr, i);
                }

                public static iiOOi1OolOlO I001lIiIIo1O(Object obj) {
/* 1 */             Object[] objArr = {obj};
/* 5 */             if (obj != null) {
/* 8 */                 return I001iOo1i0O(1, objArr);
                    }
/* 15 */            IOOlIIilOl0.I000II("at index 0");
/* 18 */            return null;
                }

                @Override
                public int I000o00OoI0I(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                @Override
                public ii01IlIiIo subList(int i, int i2) {
/* 5 */             ll0o0Io00O10.I0000Il00O(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? iiOOi1OolOlO.I00o101lO : new iOoolIoIOO01(this, i, i3);
                }

                @Override
                public final iOol1o1l01i listIterator(int i) {
/* 5 */             ll0o0Io00O10.I00000oOI(i, size());
                    return isEmpty() ? I00lll10 : new iOol1o1l01i(this, i);
                }

                @Override
                public final void add(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 37 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 90 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 10 */                List list = (List) obj;
/* 12 */                int size = size();
/* 20 */                if (size == list.size()) {
/* 25 */                    if (list instanceof RandomAccess) {
/* 28 */                        for (int i = 0; i < size; i++) {
/* 42 */                            if (ll0o0IOO.I00000oIO(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    iOol1o1l01i iool1o1l01iListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (iool1o1l01iListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !ll0o0IOO.I00000oIO(iool1o1l01iListIterator.next(), it.next())) {
                                        break;
                                    }
                                } else if (!it.hasNext()) {
/* 90 */                            return true;
                                }
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final int indexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 5 */             int size = size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 20 */                if (obj.equals(get(i))) {
/* 22 */                    return i;
                        }
                    }
/* 1 */             return -1;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 10 */            for (int size = size() - 1; size >= 0; size--) {
/* 20 */                if (obj.equals(get(size))) {
/* 22 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                @Override
                public final ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final Object remove(int i) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object set(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException();
                }
            }
