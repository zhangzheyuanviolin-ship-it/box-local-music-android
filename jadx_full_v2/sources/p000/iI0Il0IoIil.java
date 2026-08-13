            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 84 */    public final class iI0Il0IoIil extends i1io1OO01oI implements RandomAccess, iI001o1, iI1001iili {
                public static final long[] I00iio;
                public static final iI0Il0IoIil I00ilI0I1;
                public long[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             long[] jArr = new long[0];
/* 4 */             I00iio = jArr;
/* 11 */            I00ilI0I1 = new iI0Il0IoIil(jArr, 0, false);
                }

                public iI0Il0IoIil(long[] jArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = jArr;
/* 6 */             this.I00iiO = i;
                }

                public final long I0000O(int i) {
/* 1 */             I000OOo1O(i);
/* 6 */             return this.I00iiI[i];
                }

                @Override
                public final iI0Il0IoIil I00iOIl(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new iI0Il0IoIil(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final void I0001Ioi1lo(long j) {
/* 1 */             I00000oOI();
/* 4 */             int i = this.I00iiO;
/* 6 */             long[] jArr = this.I00iiI;
/* 8 */             int length = jArr.length;
/* 9 */             if (i == length) {
/* 20 */                jArr = new long[OooioIOo1.I000II(length, 3, 2, 1, 10)];
/* 27 */                System.arraycopy(this.I00iiI, 0, jArr, 0, this.I00iiO);
/* 30 */                this.I00iiI = jArr;
                    }
/* 32 */            int i2 = this.I00iiO;
/* 36 */            this.I00iiO = i2 + 1;
/* 38 */            jArr[i2] = j;
                }

                public final void I000OOo1O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 20 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             I00000oOI();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 82 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            long[] jArr = this.I00iiI;
/* 20 */            int length = jArr.length;
/* 22 */            if (i2 < length) {
/* 25 */                System.arraycopy(jArr, i, jArr, i3, i2 - i);
                    } else {
/* 37 */                long[] jArr2 = new long[OooioIOo1.I000II(length, 3, 2, 1, 10)];
/* 42 */                System.arraycopy(this.I00iiI, 0, jArr2, 0, i);
/* 50 */                System.arraycopy(this.I00iiI, i, jArr2, i3, this.I00iiO - i);
/* 53 */                this.I00iiI = jArr2;
                    }
/* 57 */            this.I00iiI[i] = jLongValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             collection.getClass();
/* 9 */             if (!(collection instanceof iI0Il0IoIil)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) collection;
/* 18 */            int i = ii0il0ioiil.I00iiO;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.I00iiO;
/* 30 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            long[] jArrCopyOf = this.I00iiI;
/* 36 */            if (i3 > jArrCopyOf.length) {
/* 38 */                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
/* 42 */                this.I00iiI = jArrCopyOf;
                    }
/* 50 */            System.arraycopy(ii0il0ioiil.I00iiI, 0, jArrCopyOf, this.I00iiO, ii0il0ioiil.I00iiO);
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
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof iI0Il0IoIil)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            iI0Il0IoIil ii0il0ioiil = (iI0Il0IoIil) obj;
/* 20 */            if (this.I00iiO == ii0il0ioiil.I00iiO) {
/* 23 */                long[] jArr = ii0il0ioiil.I00iiI;
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
/* 1 */             I000OOo1O(i);
/* 8 */             return Long.valueOf(this.I00iiI[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.I00iiO; i2++) {
/* 11 */                long j = this.I00iiI[i2];
/* 13 */                byte[] bArr = iI000IO.I00000oIO;
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
/* 4 */             I000OOo1O(i);
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
/* 10 */            I000OOo1O(i);
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
/* 85 */        public final boolean add(Object obj) {
/* 87 */            I0001Ioi1lo(((Long) obj).longValue());
                    return true;
                }
            }
