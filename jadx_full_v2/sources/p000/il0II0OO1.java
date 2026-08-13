            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class il0II0OO1 extends iioil1o11o implements List, RandomAccess {
                public static final il00ii I00iiI = new il00ii(ilIIoll0ll.I00ilI0I1, 0);

                @Override
                public int I00000oOI(Object[] objArr, int i) {
/* 1 */             int size = size();
/* 6 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                objArr[i + i2] = get(i2);
                    }
/* 19 */            return i + size;
                }

                @Override
                public il0II0OO1 subList(int i, int i2) {
/* 5 */             lil0iIo1Oiil.I00000oOI(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? ilIIoll0ll.I00ilI0I1 : new il011loIO1(this, i, i3);
                }

                @Override
                public final il00ii listIterator(int i) {
/* 1 */             int size = size();
/* 5 */             if (i >= 0 && i <= size) {
                        return isEmpty() ? I00iiI : new il00ii(this, i);
                    }
/* 30 */            I000II.I0010o(lil0iIo1Oiil.I0000O(i, size, "index"));
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
/* 1 */             if (obj == this) {
/* 90 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 10 */                List list = (List) obj;
/* 12 */                int size = size();
/* 20 */                if (size == list.size()) {
/* 25 */                    if (list instanceof RandomAccess) {
/* 28 */                        for (int i = 0; i < size; i++) {
/* 42 */                            if (liioo01Ol.I00000oIO(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    il00ii il00iiVarListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (il00iiVarListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !liioo01Ol.I00000oIO(il00iiVarListIterator.next(), it.next())) {
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
