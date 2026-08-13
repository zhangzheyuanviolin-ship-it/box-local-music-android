            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 28 */    public final class O101lO1 extends I01Io000 implements RandomAccess, Serializable {
                public static final O101lO1 I00iio;
                public Object[] I00iOIl;
                public int I00iiI;
                public boolean I00iiO;

                static {
/* 4 */             O101lO1 o101lO1 = new O101lO1(0);
/* 8 */             o101lO1.I00iiO = true;
/* 10 */            I00iio = o101lO1;
                }

                public O101lO1(int i) {
/* 4 */             if (i >= 0) {
/* 8 */                 this.I00iOIl = new Object[i];
                    } else {
/* 13 */                I000II.I000iOII("capacity must be non-negative.");
/* 49 */                throw null;
                    }
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object I0000O(int i) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiI;
/* 6 */             if (i >= 0 && i < i2) {
/* 10 */                return I000oI1ioi(i);
                    }
/* 23 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 26 */            return null;
                }

                public final void I000OiO(int i, Collection collection, int i2) {
                    ((AbstractList) this).modCount++;
/* 7 */             I000o00OoI0I(i, i2);
/* 10 */            Iterator it = collection.iterator();
/* 15 */            for (int i3 = 0; i3 < i2; i3++) {
/* 25 */                this.I00iOIl[i + i3] = it.next();
                    }
                }

                public final void I000iOII(int i, Object obj) {
                    ((AbstractList) this).modCount++;
/* 7 */             I000o00OoI0I(i, 1);
/* 12 */            this.I00iOIl[i] = obj;
                }

                public final void I000lI() {
/* 3 */             if (this.I00iiO) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final void I000o00OoI0I(int i, int i2) {
/* 3 */             int i3 = this.I00iiI + i2;
/* 4 */             if (i3 < 0) {
/* 89 */                throw new OutOfMemoryError();
                    }
/* 6 */             Object[] objArrCopyOf = this.I00iOIl;
/* 9 */             if (i3 > objArrCopyOf.length) {
/* 11 */                int length = objArrCopyOf.length;
/* 14 */                int i4 = length + (length >> 1);
/* 17 */                if (i4 - i3 < 0) {
/* 19 */                    i4 = i3;
                        }
/* 25 */                if (i4 - 2147483639 > 0) {
/* 33 */                    i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                        }
/* 34 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
/* 38 */                this.I00iOIl = objArrCopyOf;
                    }
/* 44 */            I1IoiO1l.I000iOII(objArrCopyOf, i + i2, objArrCopyOf, i, this.I00iiI);
                    this.I00iiI += i2;
                }

                public final Object I000oI1ioi(int i) {
                    ((AbstractList) this).modCount++;
/* 7 */             Object[] objArr = this.I00iOIl;
/* 9 */             Object obj = objArr[i];
/* 15 */            I1IoiO1l.I000iOII(objArr, i, objArr, i + 1, this.I00iiI);
/* 18 */            Object[] objArr2 = this.I00iOIl;
/* 20 */            int i2 = this.I00iiI;
/* 25 */            objArr2[i2 - 1] = null;
/* 29 */            this.I00iiI = i2 - 1;
/* 49 */            return obj;
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 1 */             if (i2 > 0) {
                        ((AbstractList) this).modCount++;
                    }
/* 9 */             Object[] objArr = this.I00iOIl;
/* 15 */            I1IoiO1l.I000iOII(objArr, i, objArr, i + i2, this.I00iiI);
/* 18 */            Object[] objArr2 = this.I00iOIl;
/* 20 */            int i3 = this.I00iiI;
/* 24 */            l10iI1.I00000oIO(objArr2, i3 - i2, i3);
                    this.I00iiI -= i2;
                }

                public final int I0010I0i(int i, int i2, Collection collection, boolean z) {
                    Object[] objArr;
/* 1 */             int i3 = 0;
/* 2 */             int i4 = 0;
                    while (true) {
/* 3 */                 objArr = this.I00iOIl;
/* 5 */                 if (i3 >= i2) {
                            break;
                        }
/* 7 */                 int i5 = i + i3;
/* 15 */                if (collection.contains(objArr[i5]) == z) {
/* 17 */                    Object[] objArr2 = this.I00iOIl;
/* 22 */                    i3++;
/* 26 */                    objArr2[i4 + i] = objArr2[i5];
/* 19 */                    i4++;
                        } else {
/* 30 */                    i3++;
                        }
                    }
/* 33 */            int i6 = i2 - i4;
/* 39 */            I1IoiO1l.I000iOII(objArr, i + i4, objArr, i2 + i, this.I00iiI);
/* 42 */            Object[] objArr3 = this.I00iOIl;
/* 44 */            int i7 = this.I00iiI;
/* 48 */            l10iI1.I00000oIO(objArr3, i7 - i6, i7);
/* 51 */            if (i6 > 0) {
                        ((AbstractList) this).modCount++;
                    }
                    this.I00iiI -= i6;
/* 483 */           return i6;
                }

                @Override
                public final void add(int i, Object obj) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiI;
/* 6 */             if (i < 0 || i > i2) {
/* 32 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 89 */                return;
                    }
                    ((AbstractList) this).modCount++;
/* 16 */            I000o00OoI0I(i, 1);
/* 21 */            this.I00iOIl[i] = obj;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiI;
/* 7 */             if (i < 0 || i > i2) {
/* 31 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 6 */                 return false;
                    }
/* 11 */            int size = collection.size();
/* 15 */            I000OiO(i, collection, size);
                    return size > 0;
                }

                @Override
                public final void clear() {
/* 1 */             I000lI();
/* 7 */             I00100o1O0lo(0, this.I00iiI);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 41 */                return true;
                    }
/* 6 */             if (obj instanceof List) {
/* 8 */                 List list = (List) obj;
/* 10 */                Object[] objArr = this.I00iOIl;
/* 12 */                int i = this.I00iiI;
/* 18 */                if (i == list.size()) {
/* 22 */                    for (int i2 = 0; i2 < i; i2++) {
/* 34 */                        if (O0000Ioio00.I0000O(objArr[i2], list.get(i2))) {
                                }
                            }
/* 41 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iiI;
/* 3 */             if (i >= 0 && i < i2) {
/* 9 */                 return this.I00iOIl[i];
                    }
/* 20 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 23 */            return null;
                }

                @Override
                public final int hashCode() {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             int iHashCode = 1;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                Object obj = objArr[i2];
/* 22 */                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
                    }
/* 29 */            return iHashCode;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             for (int i = 0; i < this.I00iiI; i++) {
/* 14 */                if (O0000Ioio00.I0000O(this.I00iOIl[i], obj)) {
/* 16 */                    return i;
                        }
                    }
/* 20 */            return -1;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iiI == 0;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 5 */             for (int i = this.I00iiI - 1; i >= 0; i--) {
/* 15 */                if (O0000Ioio00.I0000O(this.I00iOIl[i], obj)) {
/* 17 */                    return i;
                        }
                    }
/* 21 */            return -1;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             int i2 = this.I00iiI;
/* 3 */             if (i < 0 || i > i2) {
/* 36 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 39 */                return null;
                    }
/* 10 */            Io1ioiIIO1lI io1ioiIIO1lI = new Io1ioiIIO1lI(2);
/* 13 */            io1ioiIIO1lI.I00ilI0I1 = this;
/* 15 */            io1ioiIIO1lI.I00iiI = i;
/* 18 */            io1ioiIIO1lI.I00iiO = -1;
/* 22 */            io1ioiIIO1lI.I00iio = ((AbstractList) this).modCount;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return io1ioiIIO1lI;
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             I000lI();
/* 4 */             int iIndexOf = indexOf(obj);
/* 8 */             if (iIndexOf >= 0) {
/* 10 */                I0000O(iIndexOf);
                    }
                    return iIndexOf >= 0;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             I000lI();
                    return I0010I0i(0, this.I00iiI, collection, false) > 0;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I000lI();
                    return I0010I0i(0, this.I00iiI, collection, true) > 0;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiI;
/* 6 */             if (i < 0 || i >= i2) {
/* 25 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 28 */                return null;
                    }
/* 10 */            Object[] objArr = this.I00iOIl;
/* 12 */            Object obj2 = objArr[i];
/* 14 */            objArr[i] = obj;
/* 16 */            return obj2;
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             iOI0OiiiOl1.I00000oOI(i, i2, this.I00iiI);
/* 15 */            return new O101iIOO(this.I00iOIl, i, i2 - i, null, this);
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             int length = objArr.length;
/* 2 */             int i = this.I00iiI;
/* 4 */             Object[] objArr2 = this.I00iOIl;
/* 7 */             if (length < i) {
/* 13 */                return Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
                    }
/* 18 */            I1IoiO1l.I000iOII(objArr2, 0, objArr, 0, i);
/* 21 */            int i2 = this.I00iiI;
/* 24 */            if (i2 < objArr.length) {
/* 27 */                objArr[i2] = null;
                    }
/* 49 */            return objArr;
                }

                @Override
                public final String toString() {
/* 6 */             return l10iI1.I00000oOI(this.I00iOIl, 0, this.I00iiI, this);
                }

                @Override
/* 29 */        public final Object[] toArray() {
/* 30 */            return I1IoiO1l.I00100o1O0lo(this.I00iOIl, 0, this.I00iiI);
                }

                @Override
/* 34 */        public final boolean addAll(Collection collection) {
/* 35 */            I000lI();
/* 36 */            int size = collection.size();
/* 37 */            I000OiO(this.I00iiI, collection, size);
                    return size > 0;
                }

                @Override
/* 35 */        public final boolean add(Object obj) {
/* 36 */            I000lI();
/* 37 */            int i = this.I00iiI;
                    ((AbstractList) this).modCount++;
/* 39 */            I000o00OoI0I(i, 1);
/* 40 */            this.I00iOIl[i] = obj;
                    return true;
                }

                @Override
/* 40 */        public final ListIterator listIterator() {
/* 41 */            return listIterator(0);
                }
            }
