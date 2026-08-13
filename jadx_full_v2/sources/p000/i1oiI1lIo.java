            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 84 */    public final class i1oiI1lIo extends i1io1OO01oI implements RandomAccess, i1oo10I0OO, iI1001iili {
                public static final int[] I00iio;
                public static final i1oiI1lIo I00ilI0I1;
                public int[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             int[] iArr = new int[0];
/* 4 */             I00iio = iArr;
/* 11 */            I00ilI0I1 = new i1oiI1lIo(iArr, 0, false);
                }

                public i1oiI1lIo(int[] iArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = iArr;
/* 6 */             this.I00iiO = i;
                }

                @Override
                public final i1oiI1lIo I00iOIl(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new i1oiI1lIo(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final int I0000oI00(int i) {
/* 1 */             I000OOo1O(i);
/* 6 */             return this.I00iiI[i];
                }

                public final void I0001Ioi1lo(int i) {
/* 1 */             I00000oOI();
/* 4 */             int i2 = this.I00iiO;
/* 6 */             int[] iArr = this.I00iiI;
/* 8 */             int length = iArr.length;
/* 9 */             if (i2 == length) {
/* 20 */                iArr = new int[OooioIOo1.I000II(length, 3, 2, 1, 10)];
/* 27 */                System.arraycopy(this.I00iiI, 0, iArr, 0, this.I00iiO);
/* 30 */                this.I00iiI = iArr;
                    }
/* 32 */            int i3 = this.I00iiO;
/* 36 */            this.I00iiO = i3 + 1;
/* 38 */            iArr[i3] = i;
                }

                public final void I000OOo1O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 20 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             I00000oOI();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 82 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            int[] iArr = this.I00iiI;
/* 20 */            int length = iArr.length;
/* 22 */            if (i2 < length) {
/* 25 */                System.arraycopy(iArr, i, iArr, i3, i2 - i);
                    } else {
/* 37 */                int[] iArr2 = new int[OooioIOo1.I000II(length, 3, 2, 1, 10)];
/* 42 */                System.arraycopy(this.I00iiI, 0, iArr2, 0, i);
/* 50 */                System.arraycopy(this.I00iiI, i, iArr2, i3, this.I00iiO - i);
/* 53 */                this.I00iiI = iArr2;
                    }
/* 57 */            this.I00iiI[i] = iIntValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             collection.getClass();
/* 9 */             if (!(collection instanceof i1oiI1lIo)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) collection;
/* 18 */            int i = i1oii1lio.I00iiO;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.I00iiO;
/* 30 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            int[] iArrCopyOf = this.I00iiI;
/* 36 */            if (i3 > iArrCopyOf.length) {
/* 38 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
/* 42 */                this.I00iiI = iArrCopyOf;
                    }
/* 50 */            System.arraycopy(i1oii1lio.I00iiI, 0, iArrCopyOf, this.I00iiO, i1oii1lio.I00iiO);
/* 53 */            this.I00iiO = i3;
                    ((AbstractList) this).modCount++;
/* 57 */            return true;
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 42 */                return true;
                    }
/* 6 */             if (!(obj instanceof i1oiI1lIo)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            i1oiI1lIo i1oii1lio = (i1oiI1lIo) obj;
/* 20 */            if (this.I00iiO == i1oii1lio.I00iiO) {
/* 23 */                int[] iArr = i1oii1lio.I00iiI;
/* 28 */                for (int i = 0; i < this.I00iiO; i++) {
/* 36 */                    if (this.I00iiI[i] == iArr[i]) {
                            }
                        }
/* 42 */                return true;
                    }
/* 19 */            return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I000OOo1O(i);
/* 8 */             return Integer.valueOf(this.I00iiI[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.I00iiO; i2++) {
/* 13 */                i = (i * 31) + this.I00iiI[i2];
                    }
/* 20 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof Integer)) {
/* 27 */                return -1;
                    }
/* 8 */             int iIntValue = ((Integer) obj).intValue();
/* 12 */            int i = this.I00iiO;
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 21 */                if (this.I00iiI[i2] == iIntValue) {
/* 23 */                    return i2;
                        }
                    }
/* 27 */            return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
/* 4 */             I000OOo1O(i);
/* 7 */             int[] iArr = this.I00iiI;
/* 9 */             int i2 = iArr[i];
/* 15 */            if (i < this.I00iiO - 1) {
/* 22 */                System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
                    }
                    this.I00iiO--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Integer.valueOf(i2);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             I00000oOI();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             int[] iArr = this.I00iiI;
/* 11 */            System.arraycopy(iArr, i2, iArr, i, this.I00iiO - i2);
                    this.I00iiO -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             I00000oOI();
/* 10 */            I000OOo1O(i);
/* 13 */            int[] iArr = this.I00iiI;
/* 15 */            int i2 = iArr[i];
/* 17 */            iArr[i] = iIntValue;
/* 19 */            return Integer.valueOf(i2);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
/* 85 */        public final boolean add(Object obj) {
/* 87 */            I0001Ioi1lo(((Integer) obj).intValue());
                    return true;
                }
            }
