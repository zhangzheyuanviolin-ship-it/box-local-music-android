            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 85 */    public final class Iiilo1O111 extends I01O10iIoo1O implements IooilIliolo1, RandomAccess, OOIi1oI1loI {
                public static final double[] I00iio;
                public static final Iiilo1O111 I00ilI0I1;
                public double[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             double[] dArr = new double[0];
/* 4 */             I00iio = dArr;
/* 11 */            I00ilI0I1 = new Iiilo1O111(dArr, 0, false);
                }

                public Iiilo1O111(double[] dArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = dArr;
/* 6 */             this.I00iiO = i;
                }

                public final void I0000O(double d) {
/* 1 */             I00000oOI();
/* 4 */             int i = this.I00iiO;
/* 6 */             double[] dArr = this.I00iiI;
/* 9 */             if (i == dArr.length) {
/* 21 */                dArr = new double[OooioIOo1.I000II(dArr.length, 3, 2, 1, 10)];
/* 28 */                System.arraycopy(this.I00iiI, 0, dArr, 0, this.I00iiO);
/* 31 */                this.I00iiI = dArr;
                    }
/* 33 */            int i2 = this.I00iiO;
/* 37 */            this.I00iiO = i2 + 1;
/* 39 */            dArr[i2] = d;
                }

                public final void I0000oI00(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
                    }
                }

                @Override
                public final Iiilo1O111 I000O01llI0(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new Iiilo1O111(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             I00000oOI();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 83 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
/* 89 */                return;
                    }
/* 16 */            double[] dArr = this.I00iiI;
/* 20 */            if (i2 < dArr.length) {
/* 25 */                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                    } else {
/* 38 */                double[] dArr2 = new double[OooioIOo1.I000II(dArr.length, 3, 2, 1, 10)];
/* 43 */                System.arraycopy(this.I00iiI, 0, dArr2, 0, i);
/* 53 */                System.arraycopy(this.I00iiI, i, dArr2, i + 1, this.I00iiO - i);
/* 56 */                this.I00iiI = dArr2;
                    }
/* 60 */            this.I00iiI[i] = dDoubleValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             I00000oOI();
/* 4 */             byte[] bArr = Iool1iioooil.I00000oIO;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof Iiilo1O111)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            Iiilo1O111 iiilo1O111 = (Iiilo1O111) collection;
/* 20 */            int i = iiilo1O111.I00iiO;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.I00iiO;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 186 */               throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            double[] dArrCopyOf = this.I00iiI;
/* 38 */            if (i3 > dArrCopyOf.length) {
/* 40 */                dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
/* 44 */                this.I00iiI = dArrCopyOf;
                    }
/* 52 */            System.arraycopy(iiilo1O111.I00iiI, 0, dArrCopyOf, this.I00iiO, iiilo1O111.I00iiO);
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
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof Iiilo1O111)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            Iiilo1O111 iiilo1O111 = (Iiilo1O111) obj;
/* 20 */            if (this.I00iiO == iiilo1O111.I00iiO) {
/* 23 */                double[] dArr = iiilo1O111.I00iiI;
/* 28 */                for (int i = 0; i < this.I00iiO; i++) {
/* 46 */                    if (Double.doubleToLongBits(this.I00iiI[i]) == Double.doubleToLongBits(dArr[i])) {
                            }
                        }
/* 52 */                return true;
                    }
/* 19 */            return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0000oI00(i);
/* 8 */             return Double.valueOf(this.I00iiI[i]);
                }

                @Override
                public final int hashCode() {
/* 1 */             int iI00000oIO = 1;
/* 5 */             for (int i = 0; i < this.I00iiO; i++) {
/* 21 */                iI00000oIO = (iI00000oIO * 31) + Iool1iioooil.I00000oIO(Double.doubleToLongBits(this.I00iiI[i]));
                    }
/* 29 */            return iI00000oIO;
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof Double)) {
/* 29 */                return -1;
                    }
/* 8 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 12 */            int i = this.I00iiO;
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 23 */                if (this.I00iiI[i2] == dDoubleValue) {
/* 25 */                    return i2;
                        }
                    }
/* 29 */            return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
/* 4 */             I0000oI00(i);
/* 7 */             double[] dArr = this.I00iiI;
/* 9 */             double d = dArr[i];
/* 15 */            if (i < this.I00iiO - 1) {
/* 22 */                System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
                    }
                    this.I00iiO--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Double.valueOf(d);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             I00000oOI();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 89 */                return;
                    }
/* 6 */             double[] dArr = this.I00iiI;
/* 11 */            System.arraycopy(dArr, i2, dArr, i, this.I00iiO - i2);
                    this.I00iiO -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             I00000oOI();
/* 10 */            I0000oI00(i);
/* 13 */            double[] dArr = this.I00iiI;
/* 15 */            double d = dArr[i];
/* 17 */            dArr[i] = dDoubleValue;
/* 19 */            return Double.valueOf(d);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
/* 86 */        public final boolean add(Object obj) {
/* 88 */            I0000O(((Double) obj).doubleValue());
                    return true;
                }
            }
