            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.RandomAccess;
            
/* 27 */    public abstract class IoillO0OOoo extends IoilO0iiOo1 implements List, RandomAccess {
                public static final IoilOOi I00iiI = new IoilOOi(OOol0l1I1.I00ilI0I1, 0);

                public static OOol0l1I1 I000lI(int i, Object[] objArr) {
                    return i == 0 ? OOol0l1I1.I00ilI0I1 : new OOol0l1I1(objArr, i);
                }

                public static IoillO0OOoo I000o00OoI0I(Iterable iterable) {
/* 3 */             if (iterable instanceof Collection) {
/* 7 */                 return I000oI1ioi((Collection) iterable);
                    }
/* 12 */            Iterator it = iterable.iterator();
/* 20 */            if (!it.hasNext()) {
/* 22 */                return OOol0l1I1.I00ilI0I1;
                    }
/* 25 */            Object next = it.next();
/* 33 */            if (!it.hasNext()) {
/* 35 */                Object[] objArr = {next};
/* 40 */                l1ioi1lI.I00000oIO(1, objArr);
/* 43 */                return I000lI(1, objArr);
                    }
/* 51 */            IoilOI ioilOI = new IoilOI(4);
/* 54 */            ioilOI.I00000oOI(next);
/* 61 */            while (it.hasNext()) {
/* 67 */                ioilOI.I00000oOI(it.next());
                    }
/* 71 */            return ioilOI.I000l1();
                }

                public static IoillO0OOoo I000oI1ioi(Collection collection) {
/* 3 */             if (!(collection instanceof IoilO0iiOo1)) {
/* 29 */                Object[] array = collection.toArray();
/* 34 */                l1ioi1lI.I00000oIO(array.length, array);
/* 38 */                return I000lI(array.length, array);
                    }
/* 7 */             IoillO0OOoo ioillO0OOooI00000oOI = ((IoilO0iiOo1) collection).I00000oOI();
/* 15 */            if (!ioillO0OOooI00000oOI.I000OiO()) {
/* 28 */                return ioillO0OOooI00000oOI;
                    }
/* 19 */            Object[] array2 = ioillO0OOooI00000oOI.toArray(IoilO0iiOo1.I00iOIl);
/* 24 */            return I000lI(array2.length, array2);
                }

                @Override
                public int I0000O(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 49 */            return size;
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final IoilOOi listIterator(int i) {
/* 5 */             lII0I0I01I1l.I000II(i, size());
                    return isEmpty() ? I00iiI : new IoilOOi(this, i);
                }

                public IoillO0OOoo I0010I0i() {
                    return size() <= 1 ? this : new Ioili1lioiIi(this);
                }

                @Override
                public IoillO0OOoo subList(int i, int i2) {
/* 5 */             lII0I0I01I1l.I000O01llI0(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? OOol0l1I1.I00ilI0I1 : new IoiliO10I01(this, i, i3);
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
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof List) {
/* 11 */                    List list = (List) obj;
/* 13 */                    int size = size();
/* 21 */                    if (size == list.size()) {
/* 26 */                        if (!(list instanceof RandomAccess)) {
/* 50 */                            Iterator it = iterator();
/* 54 */                            Iterator it2 = list.iterator();
/* 62 */                            while (it.hasNext()) {
/* 68 */                                if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                                        }
                                    }
/* 90 */                            return !it2.hasNext();
                                }
/* 29 */                        for (int i = 0; i < size; i++) {
/* 43 */                            if (Objects.equals(get(i), list.get(i))) {
                                    }
                                }
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override
                public final int hashCode() {
/* 1 */             int size = size();
/* 5 */             int i = 1;
/* 7 */             for (int i2 = 0; i2 < size; i2++) {
/* 21 */                i = ~(~(get(i2).hashCode() + (i * 31)));
                    }
/* 29 */            return i;
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
                public Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                public int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 11 */            for (int size = size() - 1; size >= 0; size--) {
/* 21 */                if (obj.equals(get(size))) {
/* 23 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                public ListIterator listIterator() {
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

                @Override
/* 28 */        public final IoillO0OOoo I00000oOI() {
/* 29 */            return this;
                }
            }
