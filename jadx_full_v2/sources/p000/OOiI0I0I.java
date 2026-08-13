            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 79 */    public final class OOiI0I0I extends I01O10iIoo1O implements RandomAccess {
                public static final Object[] I00iio;
                public static final OOiI0I0I I00ilI0I1;
                public Object[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00iio = objArr;
/* 11 */            I00ilI0I1 = new OOiI0I0I(objArr, 0, false);
                }

                public OOiI0I0I(Object[] objArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.I00iiI = objArr;
/* 6 */             this.I00iiO = i;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 18 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
                    }
                }

                @Override
                public final Iool1IOO1o0i I000O01llI0(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new OOiI0I0I(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             I00000oOI();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 77 */                OIiilo1Ool0o.I0000Il00O(this.I00iiO, IlIi0I0.I00100o1O0lo("Index:", i, ", Size:"));
/* 89 */                return;
                    }
/* 10 */            Object[] objArr = this.I00iiI;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 32 */                Object[] objArr2 = new Object[OooioIOo1.I000II(objArr.length, 3, 2, 1, 10)];
/* 37 */                System.arraycopy(this.I00iiI, 0, objArr2, 0, i);
/* 47 */                System.arraycopy(this.I00iiI, i, objArr2, i + 1, this.I00iiO - i);
/* 50 */                this.I00iiI = objArr2;
                    }
/* 54 */            this.I00iiI[i] = obj;
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
/* 33 */                    if (!(obj instanceof OOiI0I0I)) {
/* 59 */                        for (int i2 = 0; i2 < i; i2++) {
/* 73 */                            if (this.I00iiI[i2].equals(list.get(i2))) {
                                    }
                                }
/* 79 */                        return true;
                            }
/* 35 */                    OOiI0I0I oOiI0I0I = (OOiI0I0I) obj;
/* 38 */                    for (int i3 = 0; i3 < i; i3++) {
/* 52 */                        if (this.I00iiI[i3].equals(oOiI0I0I.I00iiI[i3])) {
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
/* 3 */             int iHashCode = 1;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 17 */                iHashCode = (iHashCode * 31) + this.I00iiI[i2].hashCode();
                    }
/* 29 */            return iHashCode;
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
/* 49 */            return obj;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             I00000oOI();
/* 4 */             I0000O(i);
/* 7 */             Object[] objArr = this.I00iiI;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
                    ((AbstractList) this).modCount++;
/* 89 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
/* 80 */        public final boolean add(Object obj) {
/* 81 */            I00000oOI();
/* 82 */            int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
                    if (i == objArrCopyOf.length) {
/* 85 */                objArrCopyOf = Arrays.copyOf(this.I00iiI, OooioIOo1.I000II(objArrCopyOf.length, 3, 2, 1, 10));
/* 86 */                this.I00iiI = objArrCopyOf;
                    }
/* 87 */            int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
                    objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
