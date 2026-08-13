            package p000;

            import java.util.Objects;
            
            public final class io1OIiI1olo extends io0OO101I {
                public static final io1OIiI1olo I00ilI0I1 = new io1OIiI1olo(new Object[0], 0);
                public final transient Object[] I00iiO;
                public final transient int I00iio;

                public io1OIiI1olo(Object[] objArr, int i) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00iiO;
/* 4 */             int i = this.I00iio;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
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
                public final boolean I000OOo1O() {
/* 1 */             return false;
                }

                @Override
                public final Object[] I000OiO() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lio1I001.I00000oIO(i, this.I00iio);
/* 8 */             Object obj = this.I00iiO[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }
