            package p000;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.function.UnaryOperator;
            
/* 4 */     public final class Io1l0iI11iII implements List, O0IlIoi {
                public final OI0oiiIO0 I00iOIl = new OI0oiiIO0(16);
                public final OI0llOl1ooO0 I00iiI = new OI0llOl1ooO0(16);
                public int I00iiO = -1;

                public final long I00000oOI() {
/* 4 */             long jI00000oIO = iloI1O.I00000oIO(Float.POSITIVE_INFINITY, false, false);
/* 10 */            int i = this.I00iiO + 1;
/* 12 */            int iI000II = IOOi1I.I000II(this);
/* 16 */            if (i > iI000II) {
/* 110 */               return jI00000oIO;
                    }
/* 18 */            while (i >= 0) {
/* 20 */                OI0llOl1ooO0 oI0llOl1ooO0 = this.I00iiI;
/* 24 */                if (i >= oI0llOl1ooO0.I00000oOI) {
                            break;
                        }
/* 28 */                long j = oI0llOl1ooO0.I00000oIO[i];
/* 34 */                if (il1iiOO1ioI1.I00000oIO(j, jI00000oIO) < 0) {
/* 36 */                    jI00000oIO = j;
                        }
/* 44 */                if ((il1iiOO1ioI1.I00000oOI(jI00000oIO) < 0.0f && il1iiOO1ioI1.I0000O(jI00000oIO)) || i == iI000II) {
/* 58 */                    return jI00000oIO;
                        }
/* 55 */                i++;
                    }
/* 61 */            lO00l0o.I00000oOI("Index must be between 0 and size");
/* 65 */            throw null;
                }

                public final void I0000O(int i, int i2) {
                    OI0llOl1ooO0 oI0llOl1ooO0;
                    int i3;
/* 1 */             if (i >= i2) {
/* 39 */                return;
                    }
/* 6 */             this.I00iOIl.I000lI(i, i2);
/* 10 */            if (i < 0 || i > (i3 = (oI0llOl1ooO0 = this.I00iiI).I00000oOI) || i2 < 0 || i2 > i3) {
/* 48 */                lO00l0o.I00000oOI("Index must be between 0 and size");
/* 106 */               throw null;
                    }
/* 22 */            if (i2 < i) {
/* 42 */                lO00l0o.I00000oIO("The end index must be < start index");
/* 45 */                throw null;
                    }
/* 24 */            if (i2 != i) {
/* 26 */                if (i2 < i3) {
/* 28 */                    long[] jArr = oI0llOl1ooO0.I00000oIO;
/* 30 */                    I1IoiO1l.I000OiO(jArr, jArr, i, i2, i3);
                        }
                        oI0llOl1ooO0.I00000oOI -= i2 - i;
                    }
                }

                @Override
                public final void add(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final void addFirst(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final void addLast(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void clear() {
/* 2 */             this.I00iiO = -1;
/* 6 */             this.I00iOIl.I0000oI00();
/* 12 */            this.I00iiI.I00000oOI = 0;
                }

                @Override
                public final boolean contains(Object obj) {
                    return (obj instanceof O1ooOo) && indexOf((O1ooOo) obj) != -1;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                if (!contains((O1ooOo) it.next())) {
/* 25 */                    return false;
                        }
                    }
/* 27 */            return true;
                }

                @Override
                public final Object get(int i) {
/* 7 */             return (O1ooOo) this.I00iOIl.I000II(i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof O1ooOo)) {
/* 33 */                return -1;
                    }
/* 6 */             O1ooOo o1ooOo = (O1ooOo) obj;
/* 8 */             int iI000II = IOOi1I.I000II(this);
/* 12 */            if (iI000II < 0) {
/* 33 */                return -1;
                    }
/* 14 */            int i = 0;
/* 25 */            while (!O0000Ioio00.I0000O(this.I00iOIl.I000II(i), o1ooOo)) {
/* 28 */                if (i == iI000II) {
/* 33 */                    return -1;
                        }
/* 30 */                i++;
                    }
/* 27 */            return i;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.I000OOo1O();
                }

                @Override
                public final Iterator iterator() {
/* 5 */             return new Io1ioiIIO1lI(this, 0, 7);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 4 */             if (obj instanceof O1ooOo) {
/* 7 */                 O1ooOo o1ooOo = (O1ooOo) obj;
/* 13 */                for (int iI000II = IOOi1I.I000II(this); -1 < iI000II; iI000II--) {
/* 25 */                    if (O0000Ioio00.I0000O(this.I00iOIl.I000II(iI000II), o1ooOo)) {
/* 27 */                        return iI000II;
                            }
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final ListIterator listIterator() {
/* 5 */             return new Io1ioiIIO1lI(this, 0, 7);
                }

                @Override
                public final Object remove(int i) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final Object removeFirst() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final Object removeLast() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void replaceAll(UnaryOperator unaryOperator) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object set(int i, Object obj) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I00000oOI;
                }

                @Override
                public final void sort(Comparator comparator) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             return new Io1ioliOi(this, i, i2);
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }

                @Override
/* 8 */         public final boolean add(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final boolean addAll(Collection collection) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final ListIterator listIterator(int i) {
/* 9 */             return new Io1ioiIIO1lI(this, i, 6);
                }

                @Override
/* 8 */         public final boolean remove(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
