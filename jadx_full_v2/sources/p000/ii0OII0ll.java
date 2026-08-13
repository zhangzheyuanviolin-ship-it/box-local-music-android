            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            
/* 78 */    public final class ii0OII0ll extends ii010ilOI1O1 implements RandomAccess, ii0i1O0i1l1, ii0oII1lo {
                public static final ii0OII0ll I00iio = new ii0OII0ll(new float[0], 0, false);
                public float[] I00iiI;
                public int I00iiO;

                public ii0OII0ll(float[] fArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = fArr;
/* 6 */             this.I00iiO = i;
                }

                public final void I00000oOI(float f) {
/* 1 */             zza();
/* 4 */             int i = this.I00iiO;
/* 6 */             float[] fArr = this.I00iiI;
/* 9 */             if (i == fArr.length) {
/* 18 */                float[] fArr2 = new float[IlIi0I0.I001IIilI0O(i, 3, 2, 1)];
/* 21 */                System.arraycopy(fArr, 0, fArr2, 0, i);
/* 24 */                this.I00iiI = fArr2;
/* 26 */                fArr = fArr2;
                    }
/* 27 */            int i2 = this.I00iiO;
/* 31 */            this.I00iiO = i2 + 1;
/* 33 */            fArr[i2] = f;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.I00iiO)) {
/* 76 */                I000II.I0010o(IIl001iO0Io.I000l1(i, this.I00iiO, "Index:", ", Size:"));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            float[] fArr = this.I00iiI;
/* 22 */            if (i2 < fArr.length) {
/* 25 */                System.arraycopy(fArr, i, fArr, i3, i2 - i);
                    } else {
/* 35 */                float[] fArr2 = new float[IlIi0I0.I001IIilI0O(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(fArr, 0, fArr2, 0, i);
/* 46 */                System.arraycopy(this.I00iiI, i, fArr2, i3, this.I00iiO - i);
/* 49 */                this.I00iiI = fArr2;
                    }
/* 53 */            this.I00iiI[i] = fFloatValue;
                    this.I00iiO++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             Charset charset = ii0i1ll10I0.I00000oIO;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof ii0OII0ll)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            ii0OII0ll ii0oii0ll = (ii0OII0ll) collection;
/* 20 */            int i = ii0oii0ll.I00iiO;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.I00iiO;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            float[] fArrCopyOf = this.I00iiI;
/* 38 */            if (i3 > fArrCopyOf.length) {
/* 40 */                fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
/* 44 */                this.I00iiI = fArrCopyOf;
                    }
/* 52 */            System.arraycopy(ii0oii0ll.I00iiI, 0, fArrCopyOf, this.I00iiO, ii0oii0ll.I00iiO);
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
/* 50 */                return true;
                    }
/* 6 */             if (!(obj instanceof ii0OII0ll)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            ii0OII0ll ii0oii0ll = (ii0OII0ll) obj;
/* 20 */            if (this.I00iiO == ii0oii0ll.I00iiO) {
/* 23 */                float[] fArr = ii0oii0ll.I00iiI;
/* 28 */                for (int i = 0; i < this.I00iiO; i++) {
/* 44 */                    if (Float.floatToIntBits(this.I00iiI[i]) == Float.floatToIntBits(fArr[i])) {
                            }
                        }
/* 50 */                return true;
                    }
/* 19 */            return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0000O(i);
/* 8 */             return Float.valueOf(this.I00iiI[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int iFloatToIntBits = 1;
/* 5 */             for (int i = 0; i < this.I00iiO; i++) {
/* 17 */                iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.I00iiI[i]);
                    }
/* 55 */            return iFloatToIntBits;
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof Float)) {
/* 29 */                return -1;
                    }
/* 8 */             float fFloatValue = ((Float) obj).floatValue();
/* 12 */            int i = this.I00iiO;
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 23 */                if (this.I00iiI[i2] == fFloatValue) {
/* 25 */                    return i2;
                        }
                    }
/* 29 */            return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             I0000O(i);
/* 7 */             float[] fArr = this.I00iiI;
/* 9 */             float f = fArr[i];
/* 15 */            if (i < this.I00iiO - 1) {
/* 22 */                System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
                    }
                    this.I00iiO--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Float.valueOf(f);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             float[] fArr = this.I00iiI;
/* 11 */            System.arraycopy(fArr, i2, fArr, i, this.I00iiO - i2);
                    this.I00iiO -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            I0000O(i);
/* 13 */            float[] fArr = this.I00iiI;
/* 15 */            float f = fArr[i];
/* 17 */            fArr[i] = fFloatValue;
/* 19 */            return Float.valueOf(f);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final ii0i1l11 zzd(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 16 */                return new ii0OII0ll(Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 20 */            OIiilo1Ool0o.I00100o1O0lo();
/* 23 */            return null;
                }

                @Override
/* 79 */        public final boolean add(Object obj) {
/* 81 */            I00000oOI(((Float) obj).floatValue());
                    return true;
                }
            }
