            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 6 */     public final class IIOoOOOol implements List {
                public IIOoIilO I00iOIl;
                public ArrayList I00iiI;
                public boolean I00iiO;
                public IIi0io1lIo I00iio;
                public IIi0I0I0o I00ilI0I1;

                public static ArrayList I00000oOI(Collection collection) {
/* 7 */             ArrayList arrayList = new ArrayList(collection.size());
/* 18 */            for (Object obj : collection) {
/* 26 */                if (obj instanceof String) {
/* 35 */                    arrayList.add(new IIi0l1((String) obj));
                        } else {
/* 45 */                    arrayList.add(((IIi0O1OOO1i0) obj).I00Io1lO());
                        }
                    }
/* 49 */            return arrayList;
                }

                @Override
                public final void add(int i, Object obj) {
/* 1 */             IIOoIilO iIOoIilO = this.I00iOIl;
/* 5 */             if (this.I00iiO) {
/* 55 */                OoOil11Ol1o.I000OiO("Adding an element in a filtered List is not permitted");
/* 89 */                return;
                    }
/* 7 */             IIi0io1lIo iIi0io1lIo = this.I00iio;
/* 9 */             if (iIi0io1lIo != null) {
/* 13 */                iIi0io1lIo.I010iIIOlo(this.I00ilI0I1, iIOoIilO);
/* 17 */                this.I00iio = null;
                    }
/* 21 */            this.I00iiI.add(i, obj);
/* 26 */            if (obj instanceof String) {
/* 37 */                iIOoIilO.I00iOIl.add(i, new IIi0l1((String) obj));
                    } else {
/* 49 */                iIOoIilO.I00iOIl.add(i, ((IIi0O1OOO1i0) obj).I00Io1lO());
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             IIOoIilO iIOoIilO = this.I00iOIl;
/* 5 */             if (this.I00iiO) {
/* 45 */                OoOil11Ol1o.I000OiO("Adding to a filtered List is not permitted");
/* 48 */                return false;
                    }
/* 9 */             if (this.I00iio != null && collection.size() > 0) {
/* 21 */                this.I00iio.I010iIIOlo(this.I00ilI0I1, iIOoIilO);
/* 25 */                this.I00iio = null;
                    }
/* 33 */            iIOoIilO.I00iOIl.addAll(I00000oOI(collection));
/* 38 */            return this.I00iiI.addAll(collection);
                }

                @Override
                public final void clear() {
/* 1 */             IIi0io1lIo iIi0io1lIo = this.I00iio;
/* 3 */             if (iIi0io1lIo != null) {
/* 7 */                 iIi0io1lIo.I010II(this.I00ilI0I1);
                    }
/* 12 */            this.I00iiI.clear();
/* 19 */            this.I00iOIl.I00iOIl.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiI.contains(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             return this.I00iiI.containsAll(collection);
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             return this.I00iiI.equals(obj);
                }

                @Override
                public final Object get(int i) {
/* 3 */             return this.I00iiI.get(i);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iiI.hashCode();
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             return this.I00iiI.indexOf(obj);
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iiI.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iiI.iterator();
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             return this.I00iiI.lastIndexOf(obj);
                }

                @Override
                public final ListIterator listIterator() {
/* 3 */             return this.I00iiI.listIterator();
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 6 */             if (this.I00iiO) {
/* 27 */                OoOil11Ol1o.I000OiO("removing entries from a filtered List is not permitted");
/* 5 */                 return false;
                    }
/* 8 */             int iIndexOf = arrayList.indexOf(obj);
/* 12 */            if (iIndexOf < 0) {
/* 5 */                 return false;
                    }
/* 14 */            arrayList.remove(iIndexOf);
/* 19 */            this.I00iOIl.I00o0iI0io1(iIndexOf);
/* 22 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             IIOoIilO iIOoIilO = this.I00iOIl;
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                IIOoOiOI iIOoOiOII00Io1lO = ((IIi0O1OOO1i0) it.next()).I00Io1lO();
/* 31 */                for (int size = iIOoIilO.I00iOIl.size() - 1; size >= 0; size--) {
/* 41 */                    if (iIOoOiOII00Io1lO.equals(iIOoIilO.I00lll10(size))) {
/* 43 */                        iIOoIilO.I00o0iI0io1(size);
                            }
                        }
                    }
/* 51 */            return this.I00iiI.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             IIOoIilO iIOoIilO = this.I00iOIl;
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                IIOoOiOI iIOoOiOII00Io1lO = ((IIi0O1OOO1i0) it.next()).I00Io1lO();
/* 31 */                for (int size = iIOoIilO.I00iOIl.size() - 1; size >= 0; size--) {
/* 41 */                    if (!iIOoOiOII00Io1lO.equals(iIOoIilO.I00lll10(size))) {
/* 43 */                        iIOoIilO.I00o0iI0io1(size);
                            }
                        }
                    }
/* 51 */            return this.I00iiI.retainAll(collection);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             IIOoIilO iIOoIilO = this.I00iOIl;
/* 3 */             IIi0I0I0o iIi0I0I0o = this.I00ilI0I1;
/* 7 */             if (this.I00iiO) {
/* 69 */                OoOil11Ol1o.I000OiO("Replacing an element in a filtered List is not permitted");
/* 72 */                return null;
                    }
/* 11 */            if (obj instanceof String) {
/* 18 */                IIi0l1 iIi0l1 = new IIi0l1((String) obj);
/* 21 */                IIi0io1lIo iIi0io1lIo = this.I00iio;
/* 23 */                if (iIi0io1lIo != null && i == 0) {
/* 27 */                    iIi0io1lIo.I010iIIOlo(iIi0I0I0o, iIi0l1);
                        }
/* 30 */                iIOoIilO.I00oliIiO01i(i, iIi0l1);
                    } else {
/* 34 */                IIi0io1lIo iIi0io1lIo2 = this.I00iio;
/* 36 */                if (iIi0io1lIo2 != null && i == 0) {
/* 47 */                    iIi0io1lIo2.I010iIIOlo(iIi0I0I0o, ((IIi0O1OOO1i0) obj).I00Io1lO());
                        }
/* 57 */                iIOoIilO.I00oliIiO01i(i, ((IIi0O1OOO1i0) obj).I00Io1lO());
                    }
/* 62 */            return this.I00iiI.set(i, obj);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiI.size();
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             return this.I00iiI.subList(i, i2);
                }

                @Override
                public final Object[] toArray() {
/* 3 */             return this.I00iiI.toArray();
                }

                public final String toString() {
/* 22 */            return "COSArrayList{" + this.I00iOIl.toString() + "}";
                }

                @Override
/* 7 */         public final ListIterator listIterator(int i) {
/* 8 */             return this.I00iiI.listIterator(i);
                }

                @Override
/* 7 */         public final Object[] toArray(Object[] objArr) {
/* 8 */             return this.I00iiI.toArray(objArr);
                }

                @Override
/* 30 */        public final Object remove(int i) {
/* 31 */            if (!this.I00iiO) {
/* 32 */                this.I00iOIl.I00o0iI0io1(i);
/* 33 */                return this.I00iiI.remove(i);
                    }
/* 34 */            OoOil11Ol1o.I000OiO("removing entries from a filtered List is not permitted");
                    return null;
                }

                @Override
/* 49 */        public final boolean addAll(int i, Collection collection) {
/* 50 */            IIOoIilO iIOoIilO = this.I00iOIl;
                    if (!this.I00iiO) {
/* 51 */                if (this.I00iio != null && collection.size() > 0) {
/* 52 */                    this.I00iio.I010iIIOlo(this.I00ilI0I1, iIOoIilO);
/* 53 */                    this.I00iio = null;
                        }
/* 56 */                iIOoIilO.I00iOIl.addAll(i, I00000oOI(collection));
/* 57 */                return this.I00iiI.addAll(i, collection);
                    }
/* 58 */            OoOil11Ol1o.I000OiO("Inserting to a filtered List is not permitted");
                    return false;
                }

                @Override
/* 58 */        public final boolean add(Object obj) {
/* 59 */            IIOoIilO iIOoIilO = this.I00iOIl;
                    IIi0io1lIo iIi0io1lIo = this.I00iio;
                    if (iIi0io1lIo != null) {
/* 60 */                iIi0io1lIo.I010iIIOlo(this.I00ilI0I1, iIOoIilO);
/* 61 */                this.I00iio = null;
                    }
/* 62 */            if (obj instanceof String) {
/* 63 */                iIOoIilO.I00ioIO(new IIi0l1((String) obj));
                    } else if (iIOoIilO != null) {
/* 64 */                iIOoIilO.I00ioIO(((IIi0O1OOO1i0) obj).I00Io1lO());
                    }
/* 65 */            return this.I00iiI.add(obj);
                }
            }
