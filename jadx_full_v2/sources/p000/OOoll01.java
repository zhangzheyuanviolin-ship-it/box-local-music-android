            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Set;
            
            public final class OOoll01 extends Ioio1ol111i {
                public static final OOoll01 I00ioIO;
                public final transient IoillO0OOoo I00io1l;

                static {
/* 3 */             IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 12 */            I00ioIO = new OOoll01(OOol0l1I1.I00ilI0I1, OI1OOoOiOOl.I00iOIl);
                }

                public OOoll01(IoillO0OOoo ioillO0OOoo, Comparator comparator) {
/* 4 */             this.I00iio = comparator;
/* 6 */             this.I00io1l = ioillO0OOoo;
                }

                @Override
                public final IoillO0OOoo I00000oOI() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final int I0000O(Object[] objArr) {
/* 3 */             return this.I00io1l.I0000O(objArr);
                }

                @Override
                public final Object[] I0000oI00() {
/* 3 */             return this.I00io1l.I0000oI00();
                }

                @Override
                public final int I0001Ioi1lo() {
/* 3 */             return this.I00io1l.I0001Ioi1lo();
                }

                @Override
                public final int I000OOo1O() {
/* 3 */             return this.I00io1l.I000OOo1O();
                }

                @Override
                public final boolean I000OiO() {
/* 3 */             return this.I00io1l.I000OiO();
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 4 */             return this.I00io1l.listIterator(0);
                }

                public final OOoll01 I00111O(int i, int i2) {
/* 1 */             Comparator comparator = this.I00iio;
/* 3 */             IoillO0OOoo ioillO0OOoo = this.I00io1l;
                    return (i == 0 && i2 == ioillO0OOoo.size()) ? this : i < i2 ? new OOoll01(ioillO0OOoo.subList(i, i2), comparator) : Ioio1ol111i.I0010I0i(comparator);
                }

                public final int I001IIilI0O(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00io1l, obj, this.I00iio);
                    return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
                }

                public final int I001IO000(Object obj, boolean z) {
/* 1 */             obj.getClass();
/* 8 */             int iBinarySearch = Collections.binarySearch(this.I00io1l, obj, this.I00iio);
                    return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
                }

                @Override
                public final Object ceiling(Object obj) {
/* 2 */             int iI001IO000 = I001IO000(obj, true);
/* 6 */             IoillO0OOoo ioillO0OOoo = this.I00io1l;
/* 12 */            if (iI001IO000 == ioillO0OOoo.size()) {
/* 14 */                return null;
                    }
/* 16 */            return ioillO0OOoo.get(iI001IO000);
                }

                @Override
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
                        try {
/* 12 */                    if (Collections.binarySearch(this.I00io1l, obj, this.I00iio) >= 0) {
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
/* 1 */             Comparator comparator = this.I00iio;
/* 5 */             if (collection instanceof OI0ilIoOO10) {
/* 9 */                 collection = ((OI0ilIoOO10) collection).I001i1lo1io();
                    }
/* 20 */            if (!lOO00lOoI.I00000oIO(comparator, collection) || collection.size() <= 1) {
/* 91 */                return super.containsAll(collection);
                    }
/* 30 */            OoiOOoOlo ooiOOoOloI000iOII = iterator();
/* 34 */            Iterator it = collection.iterator();
/* 38 */            IoilOOi ioilOOi = (IoilOOi) ooiOOoOloI000iOII;
/* 44 */            if (!ioilOOi.hasNext()) {
/* 89 */                return false;
                    }
/* 47 */            Object next = it.next();
/* 51 */            Object next2 = ioilOOi.next();
                    while (true) {
                        try {
/* 55 */                    int iCompare = comparator.compare(next2, next);
/* 59 */                    if (iCompare < 0) {
/* 65 */                        if (!ioilOOi.hasNext()) {
/* 89 */                            return false;
                                }
/* 68 */                        next2 = ioilOOi.next();
                            } else if (iCompare == 0) {
/* 79 */                        if (!it.hasNext()) {
/* 26 */                            return true;
                                }
/* 82 */                        next = it.next();
                            } else if (iCompare > 0) {
/* 89 */                        return false;
                            }
                        } catch (ClassCastException | NullPointerException unused) {
/* 89 */                    return false;
                        }
                    }
                }

                @Override
                public final Iterator descendingIterator() {
/* 8 */             return this.I00io1l.I0010I0i().listIterator(0);
                }

                @Override
                public final boolean equals(Object obj) {
                    Object next;
                    Object next2;
/* 1 */             Comparator comparator = this.I00iio;
/* 3 */             if (obj == this) {
/* 76 */                return true;
                    }
/* 8 */             if (!(obj instanceof Set)) {
/* 78 */                return false;
                    }
/* 11 */            Set set = (Set) obj;
/* 23 */            if (this.I00io1l.size() != set.size()) {
/* 78 */                return false;
                    }
/* 30 */            if (isEmpty()) {
/* 76 */                return true;
                    }
/* 40 */            if (!lOO00lOoI.I00000oIO(comparator, set)) {
/* 80 */                return containsAll(set);
                    }
/* 42 */            Iterator it = set.iterator();
                    try {
/* 46 */                OoiOOoOlo ooiOOoOloI000iOII = iterator();
/* 73 */                do {
/* 51 */                    IoilOOi ioilOOi = (IoilOOi) ooiOOoOloI000iOII;
/* 57 */                    if (!ioilOOi.hasNext()) {
/* 76 */                        return true;
                            }
/* 59 */                    next = ioilOOi.next();
/* 63 */                    next2 = it.next();
/* 67 */                    if (next2 == null) {
/* 78 */                        return false;
                            }
/* 73 */                } while (comparator.compare(next, next2) == 0);
/* 78 */                return false;
                    } catch (ClassCastException | NoSuchElementException unused) {
/* 78 */                return false;
                    }
                }

                @Override
                public final Object first() {
/* 5 */             if (!isEmpty()) {
/* 10 */                return this.I00io1l.get(0);
                    }
/* 15 */            IoOOl0iOl1io.I00000oOI();
/* 18 */            return null;
                }

                @Override
                public final Object floor(Object obj) {
/* 6 */             int iI001IIilI0O = I001IIilI0O(obj, true) - 1;
/* 8 */             if (iI001IIilI0O == -1) {
/* 10 */                return null;
                    }
/* 14 */            return this.I00io1l.get(iI001IIilI0O);
                }

                @Override
                public final Object higher(Object obj) {
/* 2 */             int iI001IO000 = I001IO000(obj, false);
/* 6 */             IoillO0OOoo ioillO0OOoo = this.I00io1l;
/* 12 */            if (iI001IO000 == ioillO0OOoo.size()) {
/* 14 */                return null;
                    }
/* 16 */            return ioillO0OOoo.get(iI001IO000);
                }

                @Override
                public final Object last() {
/* 5 */             if (isEmpty()) {
/* 20 */                IoOOl0iOl1io.I00000oOI();
/* 23 */                return null;
                    }
/* 15 */            return this.I00io1l.get(r1.size() - 1);
                }

                @Override
                public final Object lower(Object obj) {
                    int iI001IIilI0O = I001IIilI0O(obj, false) - 1;
/* 9 */             if (iI001IIilI0O == -1) {
/* 11 */                return null;
                    }
/* 15 */            return this.I00io1l.get(iI001IIilI0O);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00io1l.size();
                }
            }
