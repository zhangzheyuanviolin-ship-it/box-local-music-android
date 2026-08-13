            package p000;

            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 18 */    public abstract class io0o00I1ol1o extends io0I1oIiiili implements List, RandomAccess {
                public static final io0iIOO0 I00iiI = new io0iIOO0(ioI01O0.I00ilI0I1, 0);

                public static ioI01O0 I000lI(int i, Object[] objArr) {
                    return i == 0 ? ioI01O0.I00ilI0I1 : new ioI01O0(objArr, i);
                }

                public static io0o00I1ol1o I000o00OoI0I(AbstractCollection abstractCollection) {
/* 3 */             if (!(abstractCollection instanceof io0I1oIiiili)) {
/* 29 */                Object[] array = abstractCollection.toArray();
/* 33 */                int length = array.length;
/* 34 */                lioi0olooo.I00000oIO(length, array);
/* 37 */                return I000lI(length, array);
                    }
/* 7 */             io0o00I1ol1o io0o00i1ol1oI0001Ioi1lo = ((io0I1oIiiili) abstractCollection).I0001Ioi1lo();
/* 15 */            if (!io0o00i1ol1oI0001Ioi1lo.I000OOo1O()) {
/* 28 */                return io0o00i1ol1oI0001Ioi1lo;
                    }
/* 19 */            Object[] array2 = io0o00i1ol1oI0001Ioi1lo.toArray(io0I1oIiiili.I00iOIl);
/* 24 */            return I000lI(array2.length, array2);
                }

                @Override
                public int I00000oOI(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                @Override
                public io0o00I1ol1o subList(int i, int i2) {
/* 5 */             lio1l10i0I.I0000Il00O(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? ioI01O0.I00ilI0I1 : new io0lIlloOiI(this, i, i3);
                }

                @Override
                public final io0iIOO0 listIterator(int i) {
/* 5 */             lio1l10i0I.I00000oOI(i, size());
                    return isEmpty() ? I00iiI : new io0iIOO0(this, i);
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
/* 42 */                            if (lio1il0Iil1O.I00000oIO(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    io0iIOO0 io0iioo0ListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (io0iioo0ListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !lio1il0Iil1O.I00000oIO(io0iioo0ListIterator.next(), it.next())) {
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

                @Override
/* 19 */        public final io0o00I1ol1o I0001Ioi1lo() {
/* 20 */            return this;
                }
            }
