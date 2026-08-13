            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.NavigableSet;
            import java.util.NoSuchElementException;
            import java.util.Set;
            import java.util.SortedSet;
            
/* 12 */    public final class l00OOOllolOO extends ioOoI0l00I implements NavigableSet, Iterable {
                public static final l00OOOllolOO I00oI0i;
                public transient Comparator I00o0iI0io1;
                public transient l00OOOllolOO I00o0l1o1o0;
                public final transient ioIl00 I00o101lO;

                static {
/* 3 */             ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 12 */            I00oI0i = new l00OOOllolOO(iooO1OIlo.I00o101lO, iol0Oi.I00iiI);
                }

                public l00OOOllolOO(ioIl00 ioil00, Comparator comparator) {
/* 3 */             super(10);
/* 6 */             this.I00o0iI0io1 = comparator;
/* 8 */             this.I00o101lO = ioil00;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 3 */             return this.I00o101lO.I000o00OoI0I(objArr);
                }

                @Override
                public final int I000oI1ioi() {
/* 3 */             return this.I00o101lO.I000oI1ioi();
                }

                @Override
                public final int I0010I0i() {
/* 3 */             return this.I00o101lO.I0010I0i();
                }

                @Override
                public final Object[] I001IIilI0O() {
/* 3 */             return this.I00o101lO.I001IIilI0O();
                }

                public final int I001lIiIIo1O(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00o101lO, obj, this.I00o0iI0io1);
                    return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
                }

                public final int I001lllioOl(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00o101lO, obj, this.I00o0iI0io1);
                    return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
                }

                public final l00OOOllolOO I001lloI(int i, int i2) {
/* 1 */             Comparator comparator = this.I00o0iI0io1;
/* 3 */             ioIl00 ioil00 = this.I00o101lO;
/* 5 */             if (i == 0) {
/* 11 */                if (i2 == ioil00.size()) {
/* 15 */                    return this;
                        }
/* 13 */                i = 0;
                    }
/* 16 */            if (i < i2) {
/* 24 */                return new l00OOOllolOO(ioil00.subList(i, i2), comparator);
                    }
/* 30 */            if (iol0Oi.I00iiI == comparator) {
/* 42 */                return I00oI0i;
                    }
/* 34 */            ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 38 */            return new l00OOOllolOO(iooO1OIlo.I00o101lO, comparator);
                }

                public final void addFirst(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                public final void addLast(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object ceiling(Object obj) {
/* 2 */             int iI001lllioOl = I001lllioOl(obj, true);
/* 6 */             ioIl00 ioil00 = this.I00o101lO;
/* 12 */            if (iI001lllioOl == ioil00.size()) {
/* 14 */                return null;
                    }
/* 16 */            return ioil00.get(iI001lllioOl);
                }

                @Override
                public final Comparator comparator() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
                        try {
/* 12 */                    if (Collections.binarySearch(this.I00o101lO, obj, this.I00o0iI0io1) >= 0) {
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
/* 3 */             if (collection instanceof ioilOIio1o) {
/* 7 */                 collection = ((ioilOIio1o) collection).zza();
                    }
/* 11 */            Comparator comparator = this.I00o0iI0io1;
/* 20 */            if (!liooI111l1i.I00000oIO(comparator, collection) || collection.size() <= 1) {
/* 89 */                return super.containsAll(collection);
                    }
/* 33 */            ioI11OIOiiI ioi11oioiiiListIterator = this.I00o101lO.listIterator(0);
/* 37 */            Iterator it = collection.iterator();
/* 45 */            if (ioi11oioiiiListIterator.hasNext()) {
/* 48 */                Object next = it.next();
/* 52 */                Object next2 = ioi11oioiiiListIterator.next();
                        while (true) {
                            try {
/* 56 */                        int iCompare = comparator.compare(next2, next);
/* 60 */                        if (iCompare >= 0) {
/* 74 */                            if (iCompare != 0) {
                                        break;
                                    }
/* 80 */                            if (!it.hasNext()) {
/* 26 */                                return true;
                                    }
/* 83 */                            next = it.next();
                                } else {
/* 66 */                            if (!ioi11oioiiiListIterator.hasNext()) {
                                        break;
                                    }
/* 69 */                            next2 = ioi11oioiiiListIterator.next();
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
                    }
/* 32 */            return false;
                }

                @Override
                public final Iterator descendingIterator() {
/* 8 */             return this.I00o101lO.I001i1O0Ol().listIterator(0);
                }

                @Override
                public final NavigableSet descendingSet() {
                    l00OOOllolOO l00ooolloloo;
/* 1 */             l00OOOllolOO l00ooolloloo2 = this.I00o0l1o1o0;
/* 3 */             if (l00ooolloloo2 != null) {
/* 55 */                return l00ooolloloo2;
                    }
/* 7 */             Comparator comparatorReverseOrder = Collections.reverseOrder(this.I00o0iI0io1);
/* 15 */            if (!isEmpty()) {
/* 42 */                l00ooolloloo = new l00OOOllolOO(this.I00o101lO.I001i1O0Ol(), comparatorReverseOrder);
                    } else if (iol0Oi.I00iiI != comparatorReverseOrder) {
/* 23 */                ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 27 */                l00ooolloloo = new l00OOOllolOO(iooO1OIlo.I00o101lO, comparatorReverseOrder);
                    } else {
/* 31 */                l00ooolloloo = I00oI0i;
                    }
/* 45 */            this.I00o0l1o1o0 = l00ooolloloo;
/* 47 */            l00ooolloloo.I00o0l1o1o0 = this;
/* 49 */            return l00ooolloloo;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             Comparator comparator = this.I00o0iI0io1;
/* 3 */             if (obj == this) {
/* 74 */                return true;
                    }
/* 9 */             if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
/* 14 */                ioIl00 ioil00 = this.I00o101lO;
/* 24 */                if (ioil00.size() == set.size()) {
/* 31 */                    if (isEmpty()) {
/* 74 */                        return true;
                            }
/* 41 */                    if (!liooI111l1i.I00000oIO(comparator, set)) {
/* 77 */                        return containsAll(set);
                            }
/* 43 */                    Iterator it = set.iterator();
                            try {
/* 47 */                        ioI11OIOiiI ioi11oioiiiListIterator = ioil00.listIterator(0);
/* 55 */                        while (ioi11oioiiiListIterator.hasNext()) {
/* 57 */                            Object next = ioi11oioiiiListIterator.next();
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
/* 10 */                return this.I00o101lO.get(0);
                    }
/* 15 */            IoOOl0iOl1io.I00000oOI();
/* 18 */            return null;
                }

                @Override
                public final Object floor(Object obj) {
                    int iI001lIiIIo1O = I001lIiIIo1O(obj, true) - 1;
/* 8 */             if (iI001lIiIIo1O == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.I00o101lO.get(iI001lIiIIo1O);
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
/* 9 */             return I001lloI(0, I001lIiIIo1O(obj, false));
                }

                @Override
                public final Object higher(Object obj) {
/* 2 */             int iI001lllioOl = I001lllioOl(obj, false);
/* 6 */             ioIl00 ioil00 = this.I00o101lO;
/* 12 */            if (iI001lllioOl == ioil00.size()) {
/* 14 */                return null;
                    }
/* 16 */            return ioil00.get(iI001lllioOl);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             return this.I00o101lO.listIterator(0);
                }

                @Override
                public final Object last() {
/* 5 */             if (isEmpty()) {
/* 20 */                IoOOl0iOl1io.I00000oOI();
/* 23 */                return null;
                    }
/* 15 */            return this.I00o101lO.get(r1.size() - 1);
                }

                @Override
                public final Object lower(Object obj) {
                    int iI001lIiIIo1O = I001lIiIIo1O(obj, false) - 1;
/* 8 */             if (iI001lIiIIo1O == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.I00o101lO.get(iI001lIiIIo1O);
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
/* 3 */             return this.I00o101lO.size();
                }

                @Override
                public final SortedSet subSet(Object obj, Object obj2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 13 */            if (this.I00o0iI0io1.compare(obj, obj2) <= 0) {
/* 26 */                l00OOOllolOO l00ooollolooI001lloI = I001lloI(I001lllioOl(obj, true), this.I00o101lO.size());
/* 35 */                return l00ooollolooI001lloI.I001lloI(0, l00ooollolooI001lloI.I001lIiIIo1O(obj2, false));
                    }
/* 40 */            OIiilo1Ool0o.I00100o1O0lo();
/* 43 */            return null;
                }

                @Override
                public final SortedSet tailSet(Object obj) {
/* 1 */             obj.getClass();
/* 15 */            return I001lloI(I001lllioOl(obj, true), this.I00o101lO.size());
                }

                @Override
/* 13 */        public final NavigableSet headSet(Object obj, boolean z) {
/* 14 */            obj.getClass();
/* 15 */            return I001lloI(0, I001lIiIIo1O(obj, z));
                }

                @Override
/* 19 */        public final NavigableSet tailSet(Object obj, boolean z) {
/* 20 */            obj.getClass();
/* 23 */            return I001lloI(I001lllioOl(obj, z), this.I00o101lO.size());
                }

                @Override
/* 44 */        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
/* 45 */            obj.getClass();
/* 46 */            obj2.getClass();
/* 47 */            if (this.I00o0iI0io1.compare(obj, obj2) <= 0) {
/* 50 */                l00OOOllolOO l00ooollolooI001lloI = I001lloI(I001lllioOl(obj, z), this.I00o101lO.size());
/* 51 */                return l00ooollolooI001lloI.I001lloI(0, l00ooollolooI001lloI.I001lIiIIo1O(obj2, z2));
                    }
/* 52 */            OIiilo1Ool0o.I00100o1O0lo();
                    return null;
                }
            }
