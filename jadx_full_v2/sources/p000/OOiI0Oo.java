            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            
/* 74 */    public final class OOiI0Oo extends I01O1I1 implements RandomAccess {
                public static final OOiI0Oo I00iio = new OOiI0Oo(new Object[0], 0, false);
                public Object[] I00iiI;
                public int I00iiO;

                public OOiI0Oo(Object[] objArr, int i, boolean z) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = objArr;
/* 8 */             this.I00iiO = i;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
                    }
                }

                public final OOiI0Oo I0000oI00(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 16 */                return new OOiI0Oo(Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 20 */            OIiilo1Ool0o.I00100o1O0lo();
/* 23 */            return null;
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             I00000oOI();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 72 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
/* 106 */               return;
                    }
/* 10 */            Object[] objArr = this.I00iiI;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 42 */                System.arraycopy(this.I00iiI, i, objArr2, i + 1, this.I00iiO - i);
/* 45 */                this.I00iiI = objArr2;
                    }
/* 49 */            this.I00iiI[i] = obj;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0000O(i);
/* 6 */             return this.I00iiI[i];
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
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
                public final Object set(int i, Object obj) {
/* 1 */             I00000oOI();
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

                @Override
/* 75 */        public final boolean add(Object obj) {
/* 76 */            I00000oOI();
/* 77 */            int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
                    if (i == objArrCopyOf.length) {
/* 79 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
/* 80 */                this.I00iiI = objArrCopyOf;
                    }
/* 81 */            int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
                    objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
