            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 7 */     public final class i1o11i0 extends AbstractList implements RandomAccess, i1iliooI1o0 {
                public static final Object[] I00iio;
                public static final i1o11i0 I00ilI0I1;
                public boolean I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00iio = objArr;
/* 11 */            I00ilI0I1 = new i1o11i0(objArr, 0, false);
                }

                public i1o11i0(Object[] objArr, int i, boolean z) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = objArr;
/* 8 */             this.I00iiO = i;
                }

                public final i1o11i0 I00000oOI(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new i1o11i0(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             zza();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 74 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 10 */            int i3 = i + 1;
/* 12 */            Object[] objArr = this.I00iiI;
/* 14 */            int length = objArr.length;
/* 16 */            if (i2 < length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i3, i2 - i);
                    } else {
/* 31 */                Object[] objArr2 = new Object[OooioIOo1.I000II(length, 3, 2, 1, 10)];
/* 36 */                System.arraycopy(this.I00iiI, 0, objArr2, 0, i);
/* 44 */                System.arraycopy(this.I00iiI, i, objArr2, i3, this.I00iiO - i);
/* 47 */                this.I00iiI = objArr2;
                    }
/* 51 */            this.I00iiI[i] = obj;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             zza();
/* 4 */             return super.addAll(i, collection);
                }

                @Override
                public final void clear() {
/* 1 */             zza();
/* 4 */             super.clear();
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 33 */            for (int i = 0; i < size; i++) {
/* 47 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0000O(i);
/* 6 */             return this.I00iiI[i];
                }

                @Override
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             I0000O(i);
/* 7 */             Object[] objArr = this.I00iiI;
/* 9 */             Object obj = objArr[i];
/* 15 */            if (i < this.I00iiO - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
                    }
                    this.I00iiO--;
                    ((AbstractList) this).modCount++;
/* 77 */            return obj;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             zza();
/* 4 */             return super.retainAll(collection);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             zza();
/* 4 */             I0000O(i);
/* 7 */             Object[] objArr = this.I00iiI;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
                    ((AbstractList) this).modCount++;
/* 37 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                public final void zza() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
/* 8 */         public final boolean addAll(Collection collection) {
/* 9 */             zza();
/* 10 */            return super.addAll(collection);
                }

                @Override
/* 37 */        public final boolean remove(Object obj) {
/* 38 */            zza();
/* 39 */            int iIndexOf = indexOf(obj);
                    if (iIndexOf == -1) {
                        return false;
                    }
/* 40 */            remove(iIndexOf);
                    return true;
                }

                @Override
/* 77 */        public final boolean add(Object obj) {
/* 78 */            zza();
                    int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
/* 79 */            int length = objArrCopyOf.length;
                    if (i == length) {
/* 82 */                objArrCopyOf = Arrays.copyOf(this.I00iiI, OooioIOo1.I000II(length, 3, 2, 1, 10));
                        this.I00iiI = objArrCopyOf;
                    }
                    int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
/* 83 */            objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
