            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            public abstract class iOio11oiIi0I extends i0IIio0oIoio implements List, RandomAccess {
                public static final iOOii1Ol0Oli I00lll10 = new iOOii1Ol0Oli(iiI10IO0io0I.I00o101lO, 0);

                public static iiI10IO0io0I I001iOo1i0O(int i, Object[] objArr) {
                    return i == 0 ? iiI10IO0io0I.I00o101lO : new iiI10IO0io0I(objArr, i);
                }

                public static iiI10IO0io0I I001lIiIIo1O(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Object... objArr) {
/* 3 */             int length = objArr.length;
/* 4 */             int i = length + 12;
/* 6 */             Object[] objArr2 = new Object[i];
/* 9 */             objArr2[0] = num;
/* 12 */            objArr2[1] = num2;
/* 15 */            objArr2[2] = num3;
/* 18 */            objArr2[3] = num4;
/* 21 */            objArr2[4] = num5;
/* 24 */            objArr2[5] = num6;
/* 27 */            objArr2[6] = num7;
/* 30 */            objArr2[7] = num8;
/* 34 */            objArr2[8] = num9;
/* 38 */            objArr2[9] = num10;
/* 42 */            objArr2[10] = num11;
/* 46 */            objArr2[11] = num12;
/* 50 */            System.arraycopy(objArr, 0, objArr2, 12, length);
/* 53 */            lilIoil.I00000oIO(i, objArr2);
/* 56 */            return I001iOo1i0O(i, objArr2);
                }

                @Override
                public int I000o00OoI0I(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 49 */            return size;
                }

                @Override
                public iOio11oiIi0I subList(int i, int i2) {
/* 5 */             ll01O0I1o0i1.I0000Il00O(i, i2, size());
/* 8 */             int i3 = i2 - i;
                    return i3 == size() ? this : i3 == 0 ? iiI10IO0io0I.I00o101lO : new iOiI1O1lI(this, i, i3);
                }

                @Override
                public final iOOii1Ol0Oli listIterator(int i) {
/* 5 */             ll01O0I1o0i1.I00000oOI(i, size());
                    return isEmpty() ? I00lll10 : new iOOii1Ol0Oli(this, i);
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
/* 42 */                            if (lioooIIO.I00000oIO(get(i), list.get(i))) {
                                    }
                                }
/* 90 */                        return true;
                            }
/* 48 */                    iOOii1Ol0Oli iooii1ol0oliListIterator = listIterator(0);
/* 52 */                    Iterator it = list.iterator();
                            while (true) {
/* 60 */                        if (iooii1ol0oliListIterator.hasNext()) {
/* 66 */                            if (!it.hasNext() || !lioooIIO.I00000oIO(iooii1ol0oliListIterator.next(), it.next())) {
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
/* 29 */            return iHashCode;
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
/* 49 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object set(int i, Object obj) {
/* 89 */            throw new UnsupportedOperationException();
                }
            }
