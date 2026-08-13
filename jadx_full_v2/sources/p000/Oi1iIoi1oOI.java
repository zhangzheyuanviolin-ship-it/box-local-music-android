            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.RandomAccess;
            
/* 49 */    public final class Oi1iIoi1oOI extends I01IO0oio implements RandomAccess {
                public final Object[] I00iOIl;
                public final int I00iiI;
                public int I00iiO;
                public int I00iio;

                public Oi1iIoi1oOI(Object[] objArr, int i) {
/* 4 */             this.I00iOIl = objArr;
/* 6 */             if (i < 0) {
/* 49 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "ring buffer filled size should not be negative but it is "));
/* 89 */                throw null;
                    }
/* 9 */             if (i <= objArr.length) {
/* 12 */                this.I00iiI = objArr.length;
/* 14 */                this.I00iio = i;
                    } else {
/* 21 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
/* 26 */                sbI00100o1O0lo.append(objArr.length);
/* 42 */                throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                    }
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iio;
                }

                public final void I0000O(int i) {
/* 1 */             if (i < 0) {
/* 73 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "n shouldn't be negative but it is "));
/* 186 */               return;
                    }
/* 5 */             if (i > this.I00iio) {
/* 44 */                StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
/* 50 */                sbI00100o1O0lo.append(this.I00iio);
/* 66 */                throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                    }
/* 7 */             if (i > 0) {
/* 9 */                 int i2 = this.I00iiO;
/* 13 */                int i3 = this.I00iiI;
/* 15 */                int i4 = (i2 + i) % i3;
/* 16 */                Object[] objArr = this.I00iOIl;
/* 19 */                if (i2 > i4) {
/* 21 */                    Arrays.fill(objArr, i2, i3, (Object) null);
/* 25 */                    Arrays.fill(objArr, 0, i4, (Object) null);
                        } else {
/* 29 */                    Arrays.fill(objArr, i2, i4, (Object) null);
                        }
/* 32 */                this.I00iiO = i4;
                        this.I00iio -= i;
                    }
                }

                @Override
                public final Object get(int i) {
/* 1 */             int i2 = this.I00iio;
/* 3 */             if (i < 0 || i >= i2) {
/* 26 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "index: ", ", size: "));
/* 29 */                return null;
                    }
/* 15 */            return this.I00iOIl[(this.I00iiO + i) % this.I00iiI];
                }

                @Override
                public final Iterator iterator() {
/* 3 */             Oi1iIliiiii oi1iIliiiii = new Oi1iIliiiii();
/* 6 */             oi1iIliiiii.I00ilI0I1 = this;
/* 12 */            oi1iIliiiii.I00iiO = I00000oOI();
/* 16 */            oi1iIliiiii.I00iio = this.I00iiO;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return oi1iIliiiii;
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
                    Object[] objArr2;
/* 1 */             int length = objArr.length;
/* 2 */             int i = this.I00iio;
/* 4 */             if (length < i) {
/* 6 */                 objArr = Arrays.copyOf(objArr, i);
                    }
/* 10 */            int i2 = this.I00iio;
/* 12 */            int i3 = this.I00iiO;
/* 14 */            int i4 = 0;
/* 15 */            int i5 = 0;
                    while (true) {
/* 16 */                objArr2 = this.I00iOIl;
/* 18 */                if (i5 >= i2 || i3 >= this.I00iiI) {
                            break;
                        }
/* 26 */                objArr[i5] = objArr2[i3];
/* 28 */                i5++;
/* 30 */                i3++;
                    }
/* 33 */            while (i5 < i2) {
/* 37 */                objArr[i5] = objArr2[i4];
/* 39 */                i5++;
/* 41 */                i4++;
                    }
/* 45 */            if (i2 < objArr.length) {
/* 48 */                objArr[i2] = null;
                    }
/* 186 */           return objArr;
                }

                @Override
/* 50 */        public final Object[] toArray() {
/* 52 */            return toArray(new Object[I00000oOI()]);
                }
            }
