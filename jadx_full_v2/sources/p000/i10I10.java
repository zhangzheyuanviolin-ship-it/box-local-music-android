            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class i10I10 extends i0IIio0oIoio implements List, RandomAccess {
                public static final i10I011 I00lll10 = new i10I011(i10IIII01ol.I00o101lO, 0);

                @Override
                public int I000OOo1O(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                @Override
                public i10I10 subList(int i, int i2) {
/* 5 */             liOI0000I1OI.I00000oOI(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? i10IIII01ol.I00o101lO : new i10I0Ol(this, i, i3);
                }

                @Override
                public final i10I011 listIterator(int i) {
/* 1 */             int size = size();
/* 5 */             if (i >= 0 && i <= size) {
                        return isEmpty() ? I00lll10 : new i10I011(this, i);
                    }
/* 30 */            I000II.I0010o(liOI0000I1OI.I0000Il00O(i, size, "index"));
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
/* 51 */                    i10I011 i10i011ListIterator = listIterator(0);
/* 55 */                    Iterator it = list.iterator();
                            while (true) {
/* 63 */                        if (i10i011ListIterator.hasNext()) {
/* 69 */                            if (!it.hasNext() || ((next = i10i011ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
