            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class ioIl00 extends i0IIio0oIoio implements List, RandomAccess {
                public static final ioI11OIOiiI I00lll10 = new ioI11OIOiiI(iooO1OIlo.I00o101lO, 0);

                public static iooO1OIlo I001lIiIIo1O(int i, Object[] objArr) {
                    return i == 0 ? iooO1OIlo.I00o101lO : new iooO1OIlo(objArr, i);
                }

                @Override
                public int I000o00OoI0I(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                public ioIl00 I001i1O0Ol() {
/* 6 */             if (size() <= 1) {
/* 8 */                 return this;
                    }
/* 13 */            ioIIoo0i ioiioo0i = new ioIIoo0i(10);
/* 16 */            ioiioo0i.I00o0iI0io1 = this;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return ioiioo0i;
                }

                @Override
                public ioIl00 subList(int i, int i2) {
/* 5 */             lio00O0OO.I0000Il00O(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? iooO1OIlo.I00o101lO : new ioIOiooll(this, i, i3);
                }

                @Override
                public final ioI11OIOiiI listIterator(int i) {
/* 5 */             lio00O0OO.I00000oOI(i, size());
                    return isEmpty() ? I00lll10 : new ioI11OIOiiI(this, i);
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
/* 42 */                            if (lilooOlIoOIo.I00000oIO(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    ioI11OIOiiI ioi11oioiiiListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (ioi11oioiiiListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !lilooOlIoOIo.I00000oIO(ioi11oioiiiListIterator.next(), it.next())) {
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
