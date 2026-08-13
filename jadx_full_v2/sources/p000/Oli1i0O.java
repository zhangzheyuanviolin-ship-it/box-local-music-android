            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 4 */     public final class Oli1i0O implements List, O0IloI1o {
                public final Ol1o0O0O0 I00iOIl;
                public final int I00iiI;
                public int I00iiO;
                public int I00iio;

                public Oli1i0O(Ol1o0O0O0 ol1o0O0O0, int i, int i2) {
/* 4 */             this.I00iOIl = ol1o0O0O0;
/* 6 */             this.I00iiI = i;
/* 18 */            this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 21 */            this.I00iio = i2 - i;
                }

                public final void I00000oOI() {
/* 15 */            if (((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl.I00iOIl)).I0000oI00 == this.I00iiO) {
/* 17 */                return;
                    }
/* 18 */            I000II.I001IIilI0O();
                }

                @Override
                public final boolean add(Object obj) {
/* 1 */             I00000oOI();
/* 8 */             int i = this.I00iiI + this.I00iio;
/* 9 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 11 */            ol1o0O0O0.add(i, obj);
                    this.I00iio++;
/* 30 */            this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 16 */            return true;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             I00000oOI();
/* 6 */             int i2 = i + this.I00iiI;
/* 7 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 9 */             boolean zAddAll = ol1o0O0O0.addAll(i2, collection);
/* 13 */            if (zAddAll) {
/* 22 */                this.I00iio = collection.size() + this.I00iio;
/* 34 */                this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
                    }
/* 37 */            return zAddAll;
                }

                @Override
                public final void clear() {
/* 3 */             if (this.I00iio > 0) {
/* 5 */                 I00000oOI();
/* 8 */                 int i = this.I00iio;
/* 10 */                int i2 = this.I00iiI;
/* 13 */                Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 15 */                ol1o0O0O0.I000OiO(i2, i + i2);
/* 19 */                this.I00iio = 0;
/* 31 */                this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Collection collection2 = collection;
/* 6 */             if ((collection2 instanceof Collection) && collection2.isEmpty()) {
/* 5 */                 return true;
                    }
/* 18 */            Iterator it = collection2.iterator();
/* 26 */            while (it.hasNext()) {
/* 36 */                if (!contains(it.next())) {
/* 38 */                    return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I00000oOI();
/* 6 */             iO0oloi1IO0.I0000Il00O(i, this.I00iio);
/* 14 */            return this.I00iOIl.get(this.I00iiI + i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             int i = this.I00iio;
/* 6 */             int i2 = this.I00iiI;
/* 13 */            Iterator it = lIiioliIlo.I000O01llI0(i2, i + i2).iterator();
/* 22 */            while (((IooO10lI) it).I00iiO) {
/* 27 */                int iNextInt = ((IooIlO1) it).nextInt();
/* 41 */                if (O0000Ioio00.I0000O(obj, this.I00iOIl.get(iNextInt))) {
/* 43 */                    return iNextInt - i2;
                        }
                    }
/* 45 */            return -1;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iio == 0;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             int i = this.I00iio;
/* 6 */             int i2 = this.I00iiI;
/* 11 */            for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
/* 23 */                if (O0000Ioio00.I0000O(obj, this.I00iOIl.get(i3))) {
/* 25 */                    return i3 - i2;
                        }
                    }
/* 30 */            return -1;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             I00000oOI();
/* 6 */             OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 11 */            oOo0ll111.I00iOIl = i - 1;
/* 16 */            Oi11lo1liI0l oi11lo1liI0l = new Oi11lo1liI0l(2);
/* 19 */            oi11lo1liI0l.I00iiI = oOo0ll111;
/* 21 */            oi11lo1liI0l.I00iiO = this;
/* 23 */            VarHandle.storeStoreFence();
/* 29 */            return oi11lo1liI0l;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
/* 6 */             int i2 = this.I00iiI + i;
/* 7 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 9 */             Object objRemove = ol1o0O0O0.remove(i2);
                    this.I00iio--;
/* 29 */            this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 77 */            return objRemove;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
                    while (true) {
/* 6 */                 boolean z = false;
/* 11 */                while (it.hasNext()) {
/* 21 */                    if (remove(it.next()) || z) {
/* 25 */                        z = true;
                            }
                        }
/* 29 */                return z;
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 1 */             I00000oOI();
/* 4 */             Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 6 */             int i2 = this.I00iiI;
/* 10 */            int i3 = this.I00iio + i2;
/* 11 */            int size = ol1o0O0O0.size();
/* 76 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 24 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl);
/* 26 */                    i = olO0o0.I0000O;
/* 28 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 31 */                OO100II1 oo100ii1I000iOII = i01Io11IiiiO.I000iOII();
/* 39 */                oo100ii1I000iOII.subList(i2, i3).retainAll(collection);
/* 42 */                I01Io11IiiiO i01Io11IiiiOI000OOo1O = oo100ii1I000iOII.I000OOo1O();
/* 51 */                if (O0000Ioio00.I0000O(i01Io11IiiiOI000OOo1O, i01Io11IiiiO)) {
                            break;
                        }
/* 53 */                OlO0o0 olO0o02 = ol1o0O0O0.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 58 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 68 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, ol1o0O0O0, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000OOo1O, true);
                        }
/* 73 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, ol1o0O0O0);
/* 76 */            } while (!zI00000oIO);
/* 86 */            int size2 = size - ol1o0O0O0.size();
/* 87 */            if (size2 > 0) {
/* 101 */               this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl.I00iOIl)).I0000oI00;
                        this.I00iio -= size2;
                    }
                    return size2 > 0;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             iO0oloi1IO0.I0000Il00O(i, this.I00iio);
/* 6 */             I00000oOI();
/* 11 */            int i2 = i + this.I00iiI;
/* 12 */            Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
/* 14 */            Object obj2 = ol1o0O0O0.set(i2, obj);
/* 28 */            this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
/* 37 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final List subList(int i, int i2) {
/* 1 */             if (i < 0 || i > i2 || i2 > this.I00iio) {
/* 12 */                OO1oio00IO.I00000oIO("fromIndex or toIndex are out of bounds");
                    }
/* 15 */            I00000oOI();
/* 20 */            int i3 = this.I00iiI;
/* 26 */            return new Oli1i0O(this.I00iOIl, i + i3, i2 + i3);
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
/* 26 */        public final ListIterator listIterator() {
/* 27 */            return listIterator(0);
                }

                @Override
/* 31 */        public final boolean remove(Object obj) {
/* 32 */            int iIndexOf = indexOf(obj);
                    if (iIndexOf < 0) {
                        return false;
                    }
/* 33 */            remove(iIndexOf);
                    return true;
                }

                @Override
/* 32 */        public final void add(int i, Object obj) {
/* 33 */            I00000oOI();
/* 34 */            int i2 = this.I00iiI + i;
                    Ol1o0O0O0 ol1o0O0O0 = this.I00iOIl;
                    ol1o0O0O0.add(i2, obj);
                    this.I00iio++;
/* 40 */            this.I00iiO = ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl)).I0000oI00;
                }

                @Override
/* 36 */        public final boolean addAll(Collection collection) {
/* 38 */            return addAll(this.I00iio, collection);
                }
            }
