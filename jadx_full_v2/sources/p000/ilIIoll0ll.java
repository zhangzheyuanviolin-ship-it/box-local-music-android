            package p000;

            import java.util.Objects;
            
            public final class ilIIoll0ll extends il0II0OO1 {
                public static final ilIIoll0ll I00ilI0I1 = new ilIIoll0ll(new Object[0], 0);
                public final transient Object[] I00iiO;
                public final transient int I00iio;

                public ilIIoll0ll(Object[] objArr, int i) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr, int i) {
/* 1 */             Object[] objArr2 = this.I00iiO;
/* 4 */             int i2 = this.I00iio;
/* 6 */             System.arraycopy(objArr2, 0, objArr, i, i2);
/* 9 */             return i + i2;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lil0iIo1Oiil.I00000oIO(i, this.I00iio);
/* 8 */             Object obj = this.I00iiO[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }
