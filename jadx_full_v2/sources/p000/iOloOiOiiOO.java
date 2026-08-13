            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 7 */     public final class iOloOiOiiOO extends AbstractList implements RandomAccess, iOlil0i {
                public static final Object[] I00iio;
                public static final iOloOiOiiOO I00ilI0I1;
                public boolean I00iOIl;
                public Object[] I00iiI;
                public int I00iiO;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00iio = objArr;
/* 11 */            I00ilI0I1 = new iOloOiOiiOO(objArr, 0, false);
                }

                public iOloOiOiiOO(Object[] objArr, int i, boolean z) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = objArr;
/* 8 */             this.I00iiO = i;
                }

                public final boolean I00000oOI(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 33 */            for (int i = 0; i < size; i++) {
/* 47 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                public final void I0000O() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                public final iOloOiOiiOO I0000oI00(int i) {
/* 3 */             if (i >= this.I00iiO) {
/* 21 */                return new iOloOiOiiOO(i == 0 ? I00iio : Arrays.copyOf(this.I00iiI, i), this.I00iiO, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final void I0001Ioi1lo(int i) {
/* 1 */             if (i < 0 || i >= this.I00iiO) {
/* 12 */                I000II.I0010o(I000OOo1O(i));
                    }
                }

                public final String I000OOo1O(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 24 */            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i2).length());
/* 29 */            sb.append("Index:");
/* 32 */            sb.append(i);
/* 37 */            sb.append(", Size:");
/* 40 */            sb.append(i2);
/* 43 */            return sb.toString();
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             I0000O();
/* 4 */             if (i < 0 || i > (i2 = this.I00iiO)) {
/* 68 */                I000II.I0010o(I000OOo1O(i));
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
                public final boolean addAll(int i, Collection collection) {
/* 1 */             I0000O();
/* 4 */             return super.addAll(i, collection);
                }

                @Override
                public final void clear() {
/* 1 */             I0000O();
/* 4 */             super.clear();
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 79 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 12 */                if (!(obj instanceof RandomAccess)) {
/* 14 */                    return I00000oOI(obj);
                        }
/* 20 */                List list = (List) obj;
/* 22 */                int i = this.I00iiO;
/* 28 */                if (i == list.size()) {
/* 33 */                    if (!(obj instanceof iOloOiOiiOO)) {
/* 59 */                        for (int i2 = 0; i2 < i; i2++) {
/* 73 */                            if (this.I00iiI[i2].equals(list.get(i2))) {
                                    }
                                }
/* 79 */                        return true;
                            }
/* 35 */                    iOloOiOiiOO iolooioiioo = (iOloOiOiiOO) obj;
/* 38 */                    for (int i3 = 0; i3 < i; i3++) {
/* 52 */                        if (this.I00iiI[i3].equals(iolooioiioo.I00iiI[i3])) {
                                }
                            }
/* 79 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 1 */             I0001Ioi1lo(i);
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
/* 1 */             I0000O();
/* 4 */             I0001Ioi1lo(i);
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
                public final boolean removeAll(Collection collection) {
/* 1 */             I0000O();
/* 4 */             return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             I0000O();
/* 4 */             return super.retainAll(collection);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             I0000O();
/* 4 */             I0001Ioi1lo(i);
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
/* 8 */         public final boolean addAll(Collection collection) {
/* 9 */             I0000O();
/* 10 */            return super.addAll(collection);
                }

                @Override
/* 37 */        public final boolean remove(Object obj) {
/* 38 */            I0000O();
/* 39 */            int iIndexOf = indexOf(obj);
                    if (iIndexOf == -1) {
                        return false;
                    }
/* 40 */            remove(iIndexOf);
                    return true;
                }

                @Override
/* 71 */        public final boolean add(Object obj) {
/* 72 */            I0000O();
                    int i = this.I00iiO;
                    Object[] objArrCopyOf = this.I00iiI;
/* 73 */            int length = objArrCopyOf.length;
                    if (i == length) {
/* 76 */                objArrCopyOf = Arrays.copyOf(this.I00iiI, OooioIOo1.I000II(length, 3, 2, 1, 10));
                        this.I00iiI = objArrCopyOf;
                    }
                    int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
/* 77 */            objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
