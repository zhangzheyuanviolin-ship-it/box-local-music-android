            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 78 */    public final class ii0i0iiOoIlo extends ii010ilOI1O1 implements RandomAccess, ii0i1l, ii0oII1lo {
                public static final ii0i0iiOoIlo I00iio = new ii0i0iiOoIlo(new int[0], 0, false);
                public int[] I00iiI;
                public int I00iiO;

                public ii0i0iiOoIlo(int[] iArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = iArr;
/* 6 */             this.I00iiO = i;
                }

                public final int I00000oOI(int i) {
/* 1 */             I0000oI00(i);
/* 6 */             return this.I00iiI[i];
                }

                public final void I0000O(int i) {
/* 1 */             zza();
/* 4 */             int i2 = this.I00iiO;
/* 6 */             int[] iArr = this.I00iiI;
/* 9 */             if (i2 == iArr.length) {
/* 18 */                int[] iArr2 = new int[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 21 */                System.arraycopy(iArr, 0, iArr2, 0, i2);
/* 24 */                this.I00iiI = iArr2;
/* 26 */                iArr = iArr2;
                    }
/* 27 */            int i3 = this.I00iiO;
/* 31 */            this.I00iiO = i3 + 1;
/* 33 */            iArr[i3] = i;
                }

                public final void I0000oI00(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 76 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            int[] iArr = this.I00iiI;
/* 22 */            if (i2 < iArr.length) {
/* 25 */                System.arraycopy(iArr, i, iArr, i3, i2 - i);
                    } else {
/* 35 */                int[] iArr2 = new int[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(iArr, 0, iArr2, 0, i);
/* 46 */                System.arraycopy(this.I00iiI, i, iArr2, i3, this.I00iiO - i);
/* 49 */                this.I00iiI = iArr2;
                    }
/* 53 */            this.I00iiI[i] = iIntValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             Charset charset = ii0i1ll10I0.I00000oIO;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof ii0i0iiOoIlo)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) collection;
/* 20 */            int i = ii0i0iiooilo.I00iiO;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.I00iiO;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            int[] iArrCopyOf = this.I00iiI;
/* 38 */            if (i3 > iArrCopyOf.length) {
/* 40 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
/* 44 */                this.I00iiI = iArrCopyOf;
                    }
/* 52 */            System.arraycopy(ii0i0iiooilo.I00iiI, 0, iArrCopyOf, this.I00iiO, ii0i0iiooilo.I00iiO);
/* 55 */            this.I00iiO = i3;
                    ((AbstractList) this).modCount++;
/* 59 */            return true;
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
/* 6 */             if (!(obj instanceof ii0i0iiOoIlo)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            ii0i0iiOoIlo ii0i0iiooilo = (ii0i0iiOoIlo) obj;
/* 20 */            if (this.I00iiO == ii0i0iiooilo.I00iiO) {
/* 23 */                int[] iArr = ii0i0iiooilo.I00iiI;
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
/* 1 */             I0000oI00(i);
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
/* 1 */             zza();
/* 4 */             I0000oI00(i);
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
/* 1 */             zza();
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
/* 7 */             zza();
/* 10 */            I0000oI00(i);
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
                public final ii0i1l11 zzd(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 16 */                return new ii0i0iiOoIlo(Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 20 */            OIiilo1Ool0o.I00100o1O0lo();
/* 23 */            return null;
                }

                @Override
/* 79 */        public final boolean add(Object obj) {
/* 81 */            I0000O(((Integer) obj).intValue());
                    return true;
                }
            }
