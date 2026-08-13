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
            
/* 30 */    public final class O101iIOO extends I01Io000 implements RandomAccess, Serializable {
                public Object[] I00iOIl;
                public final int I00iiI;
                public int I00iiO;
                public final O101iIOO I00iio;
                public final O101lO1 I00ilI0I1;

                public O101iIOO(Object[] objArr, int i, int i2, O101iIOO o101iIOO, O101lO1 o101lO1) {
/* 4 */             this.I00iOIl = objArr;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = i2;
/* 10 */            this.I00iio = o101iIOO;
/* 12 */            this.I00ilI0I1 = o101lO1;
/* 18 */            ((AbstractList) this).modCount = ((AbstractList) o101lO1).modCount;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             I000lI();
/* 4 */             return this.I00iiO;
                }

                @Override
                public final Object I0000O(int i) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 7 */             int i2 = this.I00iiO;
/* 9 */             if (i >= 0 && i < i2) {
/* 16 */                return I000oI1ioi(this.I00iiI + i);
                    }
/* 29 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 32 */            return null;
                }

                public final void I000OiO(int i, Collection collection, int i2) {
                    ((AbstractList) this).modCount++;
/* 7 */             O101lO1 o101lO1 = this.I00ilI0I1;
/* 9 */             O101iIOO o101iIOO = this.I00iio;
/* 11 */            if (o101iIOO != null) {
/* 13 */                o101iIOO.I000OiO(i, collection, i2);
                    } else {
/* 17 */                O101lO1 o101lO12 = O101lO1.I00iio;
/* 19 */                o101lO1.I000OiO(i, collection, i2);
                    }
/* 24 */            this.I00iOIl = o101lO1.I00iOIl;
                    this.I00iiO += i2;
                }

                public final void I000iOII(int i, Object obj) {
                    ((AbstractList) this).modCount++;
/* 7 */             O101lO1 o101lO1 = this.I00ilI0I1;
/* 9 */             O101iIOO o101iIOO = this.I00iio;
/* 11 */            if (o101iIOO != null) {
/* 13 */                o101iIOO.I000iOII(i, obj);
                    } else {
/* 17 */                O101lO1 o101lO12 = O101lO1.I00iio;
/* 19 */                o101lO1.I000iOII(i, obj);
                    }
/* 24 */            this.I00iOIl = o101lO1.I00iOIl;
                    this.I00iiO++;
                }

                public final void I000lI() {
/* 9 */             if (((AbstractList) this.I00ilI0I1).modCount == ((AbstractList) this).modCount) {
/* 11 */                return;
                    }
/* 12 */            I000II.I001IIilI0O();
                }

                public final void I000o00OoI0I() {
/* 5 */             if (this.I00ilI0I1.I00iiO) {
/* 8 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final Object I000oI1ioi(int i) {
                    Object objI000oI1ioi;
                    ((AbstractList) this).modCount++;
/* 7 */             O101iIOO o101iIOO = this.I00iio;
/* 9 */             if (o101iIOO != null) {
/* 11 */                objI000oI1ioi = o101iIOO.I000oI1ioi(i);
                    } else {
/* 16 */                O101lO1 o101lO1 = O101lO1.I00iio;
/* 20 */                objI000oI1ioi = this.I00ilI0I1.I000oI1ioi(i);
                    }
                    this.I00iiO--;
/* 49 */            return objI000oI1ioi;
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 1 */             if (i2 > 0) {
                        ((AbstractList) this).modCount++;
                    }
/* 9 */             O101iIOO o101iIOO = this.I00iio;
/* 11 */            if (o101iIOO != null) {
/* 13 */                o101iIOO.I00100o1O0lo(i, i2);
                    } else {
/* 17 */                O101lO1 o101lO1 = O101lO1.I00iio;
/* 21 */                this.I00ilI0I1.I00100o1O0lo(i, i2);
                    }
                    this.I00iiO -= i2;
                }

                public final int I0010I0i(int i, int i2, Collection collection, boolean z) {
                    int iI0010I0i;
/* 1 */             O101iIOO o101iIOO = this.I00iio;
/* 3 */             if (o101iIOO != null) {
/* 5 */                 iI0010I0i = o101iIOO.I0010I0i(i, i2, collection, z);
                    } else {
/* 10 */                O101lO1 o101lO1 = O101lO1.I00iio;
/* 14 */                iI0010I0i = this.I00ilI0I1.I0010I0i(i, i2, collection, z);
                    }
/* 18 */            if (iI0010I0i > 0) {
                        ((AbstractList) this).modCount++;
                    }
                    this.I00iiO -= iI0010I0i;
/* 483 */           return iI0010I0i;
                }

                @Override
                public final void add(int i, Object obj) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 7 */             int i2 = this.I00iiO;
/* 9 */             if (i < 0 || i > i2) {
/* 28 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
                    } else {
/* 16 */                I000iOII(this.I00iiI + i, obj);
                    }
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 7 */             int i2 = this.I00iiO;
/* 10 */            if (i < 0 || i > i2) {
/* 37 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 9 */                 return false;
                    }
/* 14 */            int size = collection.size();
/* 21 */            I000OiO(this.I00iiI + i, collection, size);
                    return size > 0;
                }

                @Override
                public final void clear() {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 11 */            I00100o1O0lo(this.I00iiI, this.I00iiO);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             I000lI();
/* 4 */             if (obj == this) {
/* 47 */                return true;
                    }
/* 9 */             if (obj instanceof List) {
/* 11 */                List list = (List) obj;
/* 13 */                Object[] objArr = this.I00iOIl;
/* 15 */                int i = this.I00iiO;
/* 21 */                if (i == list.size()) {
/* 25 */                    for (int i2 = 0; i2 < i; i2++) {
/* 40 */                        if (O0000Ioio00.I0000O(objArr[this.I00iiI + i2], list.get(i2))) {
                                }
                            }
/* 47 */                    return true;
                        }
                    }
/* 8 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiO;
/* 6 */             if (i >= 0 && i < i2) {
/* 15 */                return this.I00iOIl[this.I00iiI + i];
                    }
/* 26 */            I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 29 */            return null;
                }

                @Override
                public final int hashCode() {
/* 1 */             I000lI();
/* 4 */             Object[] objArr = this.I00iOIl;
/* 6 */             int i = this.I00iiO;
/* 8 */             int iHashCode = 1;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                Object obj = objArr[this.I00iiI + i2];
/* 28 */                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
                    }
/* 113 */           return iHashCode;
                }

                @Override
                public final int indexOf(Object obj) {
/* 1 */             I000lI();
/* 7 */             for (int i = 0; i < this.I00iiO; i++) {
/* 20 */                if (O0000Ioio00.I0000O(this.I00iOIl[this.I00iiI + i], obj)) {
/* 22 */                    return i;
                        }
                    }
/* 26 */            return -1;
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             I000lI();
                    return this.I00iiO == 0;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 1 */             I000lI();
/* 8 */             for (int i = this.I00iiO - 1; i >= 0; i--) {
/* 21 */                if (O0000Ioio00.I0000O(this.I00iOIl[this.I00iiI + i], obj)) {
/* 23 */                    return i;
                        }
                    }
/* 27 */            return -1;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             I000lI();
/* 4 */             int i2 = this.I00iiO;
/* 6 */             if (i < 0 || i > i2) {
/* 39 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 42 */                return null;
                    }
/* 13 */            Io1ioiIIO1lI io1ioiIIO1lI = new Io1ioiIIO1lI(1);
/* 16 */            io1ioiIIO1lI.I00ilI0I1 = this;
/* 18 */            io1ioiIIO1lI.I00iiI = i;
/* 21 */            io1ioiIIO1lI.I00iiO = -1;
/* 25 */            io1ioiIIO1lI.I00iio = ((AbstractList) this).modCount;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            return io1ioiIIO1lI;
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 7 */             int iIndexOf = indexOf(obj);
/* 11 */            if (iIndexOf >= 0) {
/* 13 */                I0000O(iIndexOf);
                    }
                    return iIndexOf >= 0;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
                    return I0010I0i(this.I00iiI, this.I00iiO, collection, false) > 0;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
                    return I0010I0i(this.I00iiI, this.I00iiO, collection, true) > 0;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             I000o00OoI0I();
/* 4 */             I000lI();
/* 7 */             int i2 = this.I00iiO;
/* 9 */             if (i < 0 || i >= i2) {
/* 33 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 36 */                return null;
                    }
/* 13 */            Object[] objArr = this.I00iOIl;
/* 15 */            int i3 = this.I00iiI;
/* 19 */            Object obj2 = objArr[i3 + i];
/* 22 */            objArr[i3 + i] = obj;
/* 24 */            return obj2;
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             iOI0OiiiOl1.I00000oOI(i, i2, this.I00iiO);
/* 19 */            return new O101iIOO(this.I00iOIl, this.I00iiI + i, i2 - i, this, this.I00ilI0I1);
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             I000lI();
/* 4 */             int length = objArr.length;
/* 5 */             int i = this.I00iiO;
/* 7 */             Object[] objArr2 = this.I00iOIl;
/* 9 */             int i2 = this.I00iiI;
/* 11 */            if (length < i) {
/* 18 */                return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
                    }
/* 25 */            I1IoiO1l.I000iOII(objArr2, 0, objArr, i2, i + i2);
/* 28 */            int i3 = this.I00iiO;
/* 31 */            if (i3 < objArr.length) {
/* 34 */                objArr[i3] = null;
                    }
/* 49 */            return objArr;
                }

                @Override
                public final String toString() {
/* 1 */             I000lI();
/* 10 */            return l10iI1.I00000oOI(this.I00iOIl, this.I00iiI, this.I00iiO, this);
                }

                @Override
/* 31 */        public final boolean add(Object obj) {
/* 32 */            I000o00OoI0I();
/* 33 */            I000lI();
/* 34 */            I000iOII(this.I00iiI + this.I00iiO, obj);
                    return true;
                }

                @Override
/* 36 */        public final Object[] toArray() {
/* 37 */            I000lI();
/* 38 */            Object[] objArr = this.I00iOIl;
                    int i = this.I00iiO;
                    int i2 = this.I00iiI;
                    return I1IoiO1l.I00100o1O0lo(objArr, i2, i + i2);
                }

                @Override
/* 40 */        public final boolean addAll(Collection collection) {
/* 41 */            I000o00OoI0I();
/* 42 */            I000lI();
/* 43 */            int size = collection.size();
/* 44 */            I000OiO(this.I00iiI + this.I00iiO, collection, size);
                    return size > 0;
                }

                @Override
/* 43 */        public final ListIterator listIterator() {
/* 44 */            return listIterator(0);
                }
            }
