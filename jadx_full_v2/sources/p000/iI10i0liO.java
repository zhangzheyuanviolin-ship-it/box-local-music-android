            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 78 */    public final class iI10i0liO extends i1io1OO01oI implements RandomAccess {
                public static final Object[] I00iio;
                public static final iI10i0liO I00ilI0I1;
                public Object[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00iio = objArr;
/* 11 */            I00ilI0I1 = new iI10i0liO(objArr, 0, false);
                }

                public iI10i0liO(Object[] objArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = objArr;
/* 6 */             this.I00iiO = i;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 20 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
                    }
                }

                @Override
                public final iI00IlI1oII I00iOIl(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new iI10i0liO(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             I00000oOI();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 76 */                I000II.I0010o(i1O1ll0i0.I0000Il00O(this.I00iiO, i, (byte) 13, "Index:", ", Size:"));
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
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 79 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 12 */                if (!(obj instanceof RandomAccess)) {
/* 14 */                    return super.equals(obj);
                        }
/* 20 */                List list = (List) obj;
/* 22 */                int i = this.I00iiO;
/* 28 */                if (i == list.size()) {
/* 33 */                    if (!(obj instanceof iI10i0liO)) {
/* 59 */                        for (int i2 = 0; i2 < i; i2++) {
/* 73 */                            if (this.I00iiI[i2].equals(list.get(i2))) {
                                    }
                                }
/* 79 */                        return true;
                            }
/* 35 */                    iI10i0liO ii10i0lio = (iI10i0liO) obj;
/* 38 */                    for (int i3 = 0; i3 < i; i3++) {
/* 52 */                        if (this.I00iiI[i3].equals(ii10i0lio.I00iiI[i3])) {
                                }
                            }
/* 79 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0000O(i);
/* 6 */             return this.I00iiI[i];
                }

                @Override
                public final int hashCode() {
/* 1 */             int i = this.I00iiO;
/* 4 */             int iHashCode = 1;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 17 */                iHashCode = (iHashCode * 31) + this.I00iiI[i2].hashCode();
                    }
/* 55 */            return iHashCode;
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
/* 79 */        public final boolean add(Object obj) {
/* 80 */            I00000oOI();
                    int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
/* 81 */            int length = objArrCopyOf.length;
                    if (i == length) {
/* 84 */                objArrCopyOf = Arrays.copyOf(this.I00iiI, OooioIOo1.I000II(length, 3, 2, 1, 10));
                        this.I00iiI = objArrCopyOf;
                    }
                    int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
/* 85 */            objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
