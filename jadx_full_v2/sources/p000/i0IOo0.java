            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class i0IOo0 extends i0IIio0oIoio implements List, RandomAccess {
                public static final i0IO00li1 I00lll10 = new i0IO00li1(i0Iioo0o1liI.I00o101lO, 0);

                public static i0Iioo0o1liI I001lIiIIo1O(int i, Object[] objArr) {
                    return i == 0 ? i0Iioo0o1liI.I00o101lO : new i0Iioo0o1liI(objArr, i);
                }

                @Override
                public int I00000oOI(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 49 */            return size;
                }

                public i0IOo0 I001i1O0Ol() {
/* 6 */             if (size() <= 1) {
/* 8 */                 return this;
                    }
/* 12 */            i0IOIoIOoIi i0ioioiooii = new i0IOIoIOoIi(0);
/* 15 */            i0ioioiooii.I00o0iI0io1 = this;
/* 17 */            VarHandle.storeStoreFence();
/* 29 */            return i0ioioiooii;
                }

                @Override
                public i0IOo0 subList(int i, int i2) {
/* 5 */             liO0oIOlo0.I0000Il00O(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? i0Iioo0o1liI.I00o101lO : new i0IOOO0O1(this, i, i3);
                }

                @Override
                public final i0IO00li1 listIterator(int i) {
/* 5 */             liO0oIOlo0.I00000oOI(i, size());
                    return isEmpty() ? I00lll10 : new i0IO00li1(this, i);
                }

                @Override
                public final void add(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 89 */            throw new UnsupportedOperationException();
                }

                @Override
                public boolean contains(Object obj) {
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
/* 51 */                    i0IO00li1 i0io00li1ListIterator = listIterator(0);
/* 55 */                    Iterator it = list.iterator();
                            while (true) {
/* 63 */                        if (i0io00li1ListIterator.hasNext()) {
/* 69 */                            if (!it.hasNext() || ((next = i0io00li1ListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
/* 29 */            return iHashCode;
                }

                public int indexOf(Object obj) {
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

                public int lastIndexOf(Object obj) {
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
/* 49 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object set(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException();
                }
            }
