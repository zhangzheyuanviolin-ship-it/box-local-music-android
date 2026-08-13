            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class lIOiOOl extends i0IIio0oIoio implements List, RandomAccess {
                public static final lIO1l111i I00lll10 = new lIO1l111i(lIil0l010OO.I00o101lO, 0);

                public static lIil0l010OO I001iOo1i0O(int i, Object[] objArr) {
                    return i == 0 ? lIil0l010OO.I00o101lO : new lIil0l010OO(objArr, i);
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
                public lIOiOOl subList(int i, int i2) {
/* 5 */             ll0IliOoo.I00000oOI(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? lIil0l010OO.I00o101lO : new lIOOiol0lO10(this, i, i3);
                }

                @Override
                public final lIO1l111i listIterator(int i) {
/* 1 */             int size = size();
/* 5 */             if (i >= 0 && i <= size) {
                        return isEmpty() ? I00lll10 : new lIO1l111i(this, i);
                    }
/* 30 */            I000II.I0010o(ll0IliOoo.I0000Il00O(i, size, "index"));
/* 33 */            return null;
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
                    Object next;
                    Object next2;
/* 1 */             if (obj == this) {
/* 97 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 10 */                List list = (List) obj;
/* 12 */                int size = size();
/* 20 */                if (size == list.size()) {
/* 25 */                    if (list instanceof RandomAccess) {
/* 28 */                        for (int i = 0; i < size; i++) {
/* 30 */                            Object obj2 = get(i);
/* 34 */                            Object obj3 = list.get(i);
/* 38 */                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                                    }
                                }
/* 97 */                        return true;
                            }
/* 51 */                    lIO1l111i lio1l111iListIterator = listIterator(0);
/* 55 */                    Iterator it = list.iterator();
                            while (true) {
/* 63 */                        if (lio1l111iListIterator.hasNext()) {
/* 69 */                            if (!it.hasNext() || ((next = lio1l111iListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                                        break;
                                    }
                                } else if (!it.hasNext()) {
/* 97 */                            return true;
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
