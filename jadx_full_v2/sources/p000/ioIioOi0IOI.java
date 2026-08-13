            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            
/* 72 */    public final class ioIioOi0IOI extends iilOi0ioo1 implements RandomAccess {
                public static final ioIioOi0IOI I00iio = new ioIioOi0IOI(new Object[0], 0, false);
                public Object[] I00iiI;
                public int I00iiO;

                public ioIioOi0IOI(Object[] objArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = objArr;
/* 6 */             this.I00iiO = i;
                }

                public final void I00000oOI(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             zza();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 70 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 10 */            int i3 = i + 1;
/* 12 */            Object[] objArr = this.I00iiI;
/* 16 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i3, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 40 */                System.arraycopy(this.I00iiI, i, objArr2, i3, this.I00iiO - i);
/* 43 */                this.I00iiI = objArr2;
                    }
/* 47 */            this.I00iiI[i] = obj;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I00000oOI(i);
/* 6 */             return this.I00iiI[i];
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             I00000oOI(i);
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
/* 1 */             zza();
/* 4 */             I00000oOI(i);
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
                public final iliiiioo zzd(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 16 */                return new ioIioOi0IOI(Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 20 */            OIiilo1Ool0o.I00100o1O0lo();
/* 23 */            return null;
                }

                @Override
/* 73 */        public final boolean add(Object obj) {
/* 74 */            zza();
                    int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
/* 75 */            if (i == objArrCopyOf.length) {
/* 76 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
                        this.I00iiI = objArrCopyOf;
                    }
                    int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
/* 77 */            objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
