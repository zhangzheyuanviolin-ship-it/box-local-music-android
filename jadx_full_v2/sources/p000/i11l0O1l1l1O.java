            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 78 */    public final class i11l0O1l1l1O extends i111I0010O implements RandomAccess, i11Oi100O0O {
                public static final i11l0O1l1l1O I00iio = new i11l0O1l1l1O(new long[0], 0, false);
                public long[] I00iiI;
                public int I00iiO;

                public i11l0O1l1l1O(long[] jArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = jArr;
/* 6 */             this.I00iiO = i;
                }

                public final long I0000O(int i) {
/* 1 */             I0001Ioi1lo(i);
/* 6 */             return this.I00iiI[i];
                }

                public final void I0000oI00(long j) {
/* 1 */             I00000oOI();
/* 4 */             int i = this.I00iiO;
/* 6 */             long[] jArr = this.I00iiI;
/* 9 */             if (i == jArr.length) {
/* 18 */                long[] jArr2 = new long[IlIi0I0.I001IIilI0O(i, 3, 2, 1)];
/* 21 */                System.arraycopy(jArr, 0, jArr2, 0, i);
/* 24 */                this.I00iiI = jArr2;
/* 26 */                jArr = jArr2;
                    }
/* 27 */            int i2 = this.I00iiO;
/* 31 */            this.I00iiO = i2 + 1;
/* 33 */            jArr[i2] = j;
                }

                public final void I0001Ioi1lo(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
                    }
                }

                @Override
                public final i11Oi1oO I00OIl(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 16 */                return new i11l0O1l1l1O(Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 20 */            OIiilo1Ool0o.I00100o1O0lo();
/* 23 */            return null;
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             I00000oOI();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 76 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            long[] jArr = this.I00iiI;
/* 22 */            if (i2 < jArr.length) {
/* 25 */                System.arraycopy(jArr, i, jArr, i3, i2 - i);
                    } else {
/* 35 */                long[] jArr2 = new long[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(jArr, 0, jArr2, 0, i);
/* 46 */                System.arraycopy(this.I00iiI, i, jArr2, i3, this.I00iiO - i);
/* 49 */                this.I00iiI = jArr2;
                    }
/* 53 */            this.I00iiI[i] = jLongValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             Charset charset = i11Oo1I1i.I00000oIO;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof i11l0O1l1l1O)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) collection;
/* 20 */            int i = i11l0o1l1l1o.I00iiO;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.I00iiO;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            long[] jArrCopyOf = this.I00iiI;
/* 38 */            if (i3 > jArrCopyOf.length) {
/* 40 */                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
/* 44 */                this.I00iiI = jArrCopyOf;
                    }
/* 52 */            System.arraycopy(i11l0o1l1l1o.I00iiI, 0, jArrCopyOf, this.I00iiO, i11l0o1l1l1o.I00iiO);
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
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof i11l0O1l1l1O)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            i11l0O1l1l1O i11l0o1l1l1o = (i11l0O1l1l1O) obj;
/* 20 */            if (this.I00iiO == i11l0o1l1l1o.I00iiO) {
/* 23 */                long[] jArr = i11l0o1l1l1o.I00iiI;
/* 28 */                for (int i = 0; i < this.I00iiO; i++) {
/* 38 */                    if (this.I00iiI[i] == jArr[i]) {
                            }
                        }
/* 44 */                return true;
                    }
/* 19 */            return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0001Ioi1lo(i);
/* 8 */             return Long.valueOf(this.I00iiI[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.I00iiO; i2++) {
/* 11 */                long j = this.I00iiI[i2];
/* 13 */                Charset charset = i11Oo1I1i.I00000oIO;
/* 21 */                i = (i * 31) + ((int) (j ^ (j >>> 32)));
                    }
/* 55 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof Long)) {
/* 29 */                return -1;
                    }
/* 8 */             long jLongValue = ((Long) obj).longValue();
/* 12 */            int i = this.I00iiO;
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 23 */                if (this.I00iiI[i2] == jLongValue) {
/* 25 */                    return i2;
                        }
                    }
/* 29 */            return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
/* 4 */             I0001Ioi1lo(i);
/* 7 */             long[] jArr = this.I00iiI;
/* 9 */             long j = jArr[i];
/* 15 */            if (i < this.I00iiO - 1) {
/* 22 */                System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
                    }
                    this.I00iiO--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Long.valueOf(j);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             I00000oOI();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             long[] jArr = this.I00iiI;
/* 11 */            System.arraycopy(jArr, i2, jArr, i, this.I00iiO - i2);
                    this.I00iiO -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             I00000oOI();
/* 10 */            I0001Ioi1lo(i);
/* 13 */            long[] jArr = this.I00iiI;
/* 15 */            long j = jArr[i];
/* 17 */            jArr[i] = jLongValue;
/* 19 */            return Long.valueOf(j);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
/* 79 */        public final boolean add(Object obj) {
/* 81 */            I0000oI00(((Long) obj).longValue());
                    return true;
                }
            }
