            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.NavigableSet;
            import java.util.NoSuchElementException;
            import java.util.Set;
            import java.util.SortedSet;
            
/* 12 */    public final class lOloio0 extends lOO110IoOiI implements NavigableSet, Iterable {
                public static final lOloio0 I00ilO0;
                public transient Comparator I00iiO;
                public transient lOloio0 I00iio;
                public final transient lOI1lll1l10 I00ilI0I1;

                static {
/* 3 */             lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 12 */            I00ilO0 = new lOloio0(lOl10OOloi.I00ilI0I1, lOi11lOlOoi1.I00iiI);
                }

                public lOloio0(lOI1lll1l10 loi1lll1l10, Comparator comparator) {
/* 4 */             this.I00iiO = comparator;
/* 6 */             this.I00ilI0I1 = loi1lll1l10;
                }

                @Override
                public final Object[] I00000oOI() {
/* 3 */             return this.I00ilI0I1.I00000oOI();
                }

                @Override
                public final int I0000O() {
/* 3 */             return this.I00ilI0I1.I0000O();
                }

                @Override
                public final int I0000oI00() {
/* 3 */             return this.I00ilI0I1.I0000oI00();
                }

                @Override
                public final lOI1lll1l10 I0001Ioi1lo() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 3 */             return this.I00ilI0I1.I000OiO(objArr);
                }

                @Override
                public final OoiOOoOlo I000iOII() {
/* 4 */             return this.I00ilI0I1.listIterator(0);
                }

                public final int I00100o1O0lo(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00ilI0I1, obj, this.I00iiO);
                    return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
                }

                public final int I0010I0i(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00ilI0I1, obj, this.I00iiO);
                    return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
                }

                public final lOloio0 I0010o(int i, int i2) {
/* 1 */             Comparator comparator = this.I00iiO;
/* 3 */             lOI1lll1l10 loi1lll1l10 = this.I00ilI0I1;
/* 5 */             if (i == 0) {
/* 11 */                if (i2 == loi1lll1l10.size()) {
/* 15 */                    return this;
                        }
/* 13 */                i = 0;
                    }
/* 16 */            if (i < i2) {
/* 24 */                return new lOloio0(loi1lll1l10.subList(i, i2), comparator);
                    }
/* 30 */            if (lOi11lOlOoi1.I00iiI == comparator) {
/* 42 */                return I00ilO0;
                    }
/* 34 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 38 */            return new lOloio0(lOl10OOloi.I00ilI0I1, comparator);
                }

                public final void addFirst(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                public final void addLast(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object ceiling(Object obj) {
/* 2 */             int iI0010I0i = I0010I0i(obj, true);
/* 6 */             lOI1lll1l10 loi1lll1l10 = this.I00ilI0I1;
/* 12 */            if (iI0010I0i == loi1lll1l10.size()) {
/* 14 */                return null;
                    }
/* 16 */            return loi1lll1l10.get(iI0010I0i);
                }

                @Override
                public final Comparator comparator() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
                        try {
/* 12 */                    if (Collections.binarySearch(this.I00ilI0I1, obj, this.I00iiO) >= 0) {
/* 14 */                        return true;
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
/* 1 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             if (collection instanceof lOi0Iol01Iol) {
/* 7 */                 collection = ((lOi0Iol01Iol) collection).zza();
                    }
/* 11 */            Comparator comparator = this.I00iiO;
/* 20 */            if (!ll0lO1.I00000oIO(comparator, collection) || collection.size() <= 1) {
/* 88 */                return super.containsAll(collection);
                    }
/* 32 */            lO1loOl0O0O lo1lool0o0oListIterator = this.I00ilI0I1.listIterator(0);
/* 36 */            Iterator it = collection.iterator();
/* 44 */            if (lo1lool0o0oListIterator.hasNext()) {
/* 47 */                Object next = it.next();
/* 51 */                Object next2 = lo1lool0o0oListIterator.next();
                        while (true) {
                            try {
/* 55 */                        int iCompare = comparator.compare(next2, next);
/* 59 */                        if (iCompare >= 0) {
/* 73 */                            if (iCompare != 0) {
                                        break;
                                    }
/* 79 */                            if (!it.hasNext()) {
/* 26 */                                return true;
                                    }
/* 82 */                            next = it.next();
                                } else {
/* 65 */                            if (!lo1lool0o0oListIterator.hasNext()) {
                                        break;
                                    }
/* 68 */                            next2 = lo1lool0o0oListIterator.next();
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
                    }
/* 31 */            return false;
                }

                @Override
                public final Iterator descendingIterator() {
/* 8 */             return this.I00ilI0I1.I000iOII().listIterator(0);
                }

                @Override
                public final NavigableSet descendingSet() {
                    lOloio0 loloio0;
/* 1 */             lOloio0 loloio02 = this.I00iio;
/* 3 */             if (loloio02 != null) {
/* 55 */                return loloio02;
                    }
/* 7 */             Comparator comparatorReverseOrder = Collections.reverseOrder(this.I00iiO);
/* 15 */            if (!isEmpty()) {
/* 42 */                loloio0 = new lOloio0(this.I00ilI0I1.I000iOII(), comparatorReverseOrder);
                    } else if (lOi11lOlOoi1.I00iiI != comparatorReverseOrder) {
/* 23 */                lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 27 */                loloio0 = new lOloio0(lOl10OOloi.I00ilI0I1, comparatorReverseOrder);
                    } else {
/* 31 */                loloio0 = I00ilO0;
                    }
/* 45 */            this.I00iio = loloio0;
/* 47 */            loloio0.I00iio = this;
/* 49 */            return loloio0;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             Comparator comparator = this.I00iiO;
/* 3 */             if (obj == this) {
/* 74 */                return true;
                    }
/* 9 */             if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
/* 14 */                lOI1lll1l10 loi1lll1l10 = this.I00ilI0I1;
/* 24 */                if (loi1lll1l10.size() == set.size()) {
/* 31 */                    if (isEmpty()) {
/* 74 */                        return true;
                            }
/* 41 */                    if (!ll0lO1.I00000oIO(comparator, set)) {
/* 77 */                        return containsAll(set);
                            }
/* 43 */                    Iterator it = set.iterator();
                            try {
/* 47 */                        lO1loOl0O0O lo1lool0o0oListIterator = loi1lll1l10.listIterator(0);
/* 55 */                        while (lo1lool0o0oListIterator.hasNext()) {
/* 57 */                            Object next = lo1lool0o0oListIterator.next();
/* 61 */                            Object next2 = it.next();
/* 65 */                            if (next2 == null || comparator.compare(next, next2) != 0) {
                                    }
                                }
/* 74 */                        return true;
                            } catch (ClassCastException | NoSuchElementException unused) {
                            }
                        }
                    }
/* 8 */             return false;
                }

                @Override
                public final Object first() {
/* 5 */             if (!isEmpty()) {
/* 10 */                return this.I00ilI0I1.get(0);
                    }
/* 15 */            IoOOl0iOl1io.I00000oOI();
/* 18 */            return null;
                }

                @Override
                public final Object floor(Object obj) {
                    int iI00100o1O0lo = I00100o1O0lo(obj, true) - 1;
/* 8 */             if (iI00100o1O0lo == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.I00ilI0I1.get(iI00100o1O0lo);
                }

                public final Object getFirst() {
/* 1 */             return first();
                }

                public final Object getLast() {
/* 1 */             return last();
                }

                @Override
                public final SortedSet headSet(Object obj) {
/* 1 */             obj.getClass();
/* 9 */             return I0010o(0, I00100o1O0lo(obj, false));
                }

                @Override
                public final Object higher(Object obj) {
/* 2 */             int iI0010I0i = I0010I0i(obj, false);
/* 6 */             lOI1lll1l10 loi1lll1l10 = this.I00ilI0I1;
/* 12 */            if (iI0010I0i == loi1lll1l10.size()) {
/* 14 */                return null;
                    }
/* 16 */            return loi1lll1l10.get(iI0010I0i);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             return this.I00ilI0I1.listIterator(0);
                }

                @Override
                public final Object last() {
/* 5 */             if (isEmpty()) {
/* 20 */                IoOOl0iOl1io.I00000oOI();
/* 23 */                return null;
                    }
/* 15 */            return this.I00ilI0I1.get(r1.size() - 1);
                }

                @Override
                public final Object lower(Object obj) {
                    int iI00100o1O0lo = I00100o1O0lo(obj, false) - 1;
/* 8 */             if (iI00100o1O0lo == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.I00ilI0I1.get(iI00100o1O0lo);
                }

                @Override
                public final Object pollFirst() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object pollLast() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public final Object removeFirst() {
/* 20 */            throw new UnsupportedOperationException();
                }

                public final Object removeLast() {
/* 20 */            throw new UnsupportedOperationException();
                }

                @Override
                public final int size() {
/* 3 */             return this.I00ilI0I1.size();
                }

                @Override
                public final SortedSet subSet(Object obj, Object obj2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 13 */            if (this.I00iiO.compare(obj, obj2) <= 0) {
/* 26 */                lOloio0 loloio0I0010o = I0010o(I0010I0i(obj, true), this.I00ilI0I1.size());
/* 35 */                return loloio0I0010o.I0010o(0, loloio0I0010o.I00100o1O0lo(obj2, false));
                    }
/* 40 */            OIiilo1Ool0o.I00100o1O0lo();
/* 43 */            return null;
                }

                @Override
                public final SortedSet tailSet(Object obj) {
/* 1 */             obj.getClass();
/* 15 */            return I0010o(I0010I0i(obj, true), this.I00ilI0I1.size());
                }

                @Override
/* 13 */        public final NavigableSet headSet(Object obj, boolean z) {
/* 14 */            obj.getClass();
/* 15 */            return I0010o(0, I00100o1O0lo(obj, z));
                }

                @Override
/* 19 */        public final NavigableSet tailSet(Object obj, boolean z) {
/* 20 */            obj.getClass();
/* 23 */            return I0010o(I0010I0i(obj, z), this.I00ilI0I1.size());
                }

                @Override
/* 44 */        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
/* 45 */            obj.getClass();
/* 46 */            obj2.getClass();
/* 47 */            if (this.I00iiO.compare(obj, obj2) <= 0) {
/* 50 */                lOloio0 loloio0I0010o = I0010o(I0010I0i(obj, z), this.I00ilI0I1.size());
/* 51 */                return loloio0I0010o.I0010o(0, loloio0I0010o.I00100o1O0lo(obj2, z2));
                    }
/* 52 */            OIiilo1Ool0o.I00100o1O0lo();
                    return null;
                }
            }
