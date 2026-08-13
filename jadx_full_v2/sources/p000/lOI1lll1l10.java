            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.RandomAccess;
            
/* 18 */    public abstract class lOI1lll1l10 extends lO1OoOllIo0 implements List, RandomAccess {
                public static final lO1loOl0O0O I00iiI = new lO1loOl0O0O(lOl10OOloi.I00ilI0I1, 0);

                public static lOI1lll1l10 I000o00OoI0I(Collection collection) {
/* 3 */             if (!(collection instanceof lO1OoOllIo0)) {
/* 29 */                Object[] array = collection.toArray();
/* 33 */                int length = array.length;
/* 34 */                ll0lIii.I00000oIO(length, array);
/* 37 */                return I000oI1ioi(length, array);
                    }
/* 7 */             lOI1lll1l10 loi1lll1l10I0001Ioi1lo = ((lO1OoOllIo0) collection).I0001Ioi1lo();
/* 15 */            if (!loi1lll1l10I0001Ioi1lo.I000OOo1O()) {
/* 28 */                return loi1lll1l10I0001Ioi1lo;
                    }
/* 19 */            Object[] array2 = loi1lll1l10I0001Ioi1lo.toArray(lO1OoOllIo0.I00iOIl);
/* 24 */            return I000oI1ioi(array2.length, array2);
                }

                public static lOl10OOloi I000oI1ioi(int i, Object[] objArr) {
                    return i == 0 ? lOl10OOloi.I00ilI0I1 : new lOl10OOloi(objArr, i);
                }

                @Override
                public int I000OiO(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 29 */            return size;
                }

                public lOI1lll1l10 I000iOII() {
                    return size() <= 1 ? this : new lO1oil1IoI(this);
                }

                @Override
                public lOI1lll1l10 subList(int i, int i2) {
/* 5 */             ll0OlOllOl.I0000oI00(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? lOl10OOloi.I00ilI0I1 : new lOI0Oo0liO(this, i, i3);
                }

                @Override
                public final lO1loOl0O0O listIterator(int i) {
/* 5 */             ll0OlOllOl.I0000O(i, size());
                    return isEmpty() ? I00iiI : new lO1loOl0O0O(this, i);
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
/* 48 */                    lO1loOl0O0O lo1lool0o0oListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (lo1lool0o0oListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !Objects.equals(lo1lool0o0oListIterator.next(), it.next())) {
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

                @Override
/* 19 */        public final lOI1lll1l10 I0001Ioi1lo() {
/* 20 */            return this;
                }
            }
