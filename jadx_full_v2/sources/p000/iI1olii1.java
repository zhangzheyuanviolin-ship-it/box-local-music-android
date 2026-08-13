            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.RandomAccess;
            
            public abstract class iI1olii1 extends i0IIio0oIoio implements List, RandomAccess {
                public static final i1oll0i01 I00lll10 = new i1oll0i01(iIi000111ioI.I00o101lO, 0);

                @Override
                public int I001IO000(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                public iI1olii1 I001i1O0Ol() {
/* 6 */             if (size() <= 1) {
/* 8 */                 return this;
                    }
/* 12 */            iI0io0O ii0io0o = new iI0io0O(3);
/* 15 */            ii0io0o.I00o0iI0io1 = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return ii0io0o;
                }

                @Override
                public iI1olii1 subList(int i, int i2) {
/* 5 */             ll0oolI10I.I00000oOI(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? iIi000111ioI.I00o101lO : new iI1I1oIO(this, i, i3);
                }

                @Override
                public final i1oll0i01 listIterator(int i) {
/* 1 */             int size = size();
/* 5 */             if (i >= 0 && i <= size) {
                        return isEmpty() ? I00lll10 : new i1oll0i01(this, i);
                    }
/* 30 */            I000II.I0010o(ll0oolI10I.I0000Il00O(i, size, "index"));
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
                public boolean contains(Object obj) {
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
/* 42 */                            if (Objects.equals(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    i1oll0i01 i1oll0i01VarListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (i1oll0i01VarListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !Objects.equals(i1oll0i01VarListIterator.next(), it.next())) {
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
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object set(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException();
                }
            }
