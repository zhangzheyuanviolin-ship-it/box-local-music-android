            package p000;

            import java.util.Objects;
            
            public final class ilIol1o extends il0II0OO1 {
                public final transient Object[] I00iiO;
                public final transient int I00iio;

                public ilIol1o(Object[] objArr, int i) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
                }

                @Override
                public final Object get(int i) {
/* 2 */             lil0iIo1Oiil.I00000oIO(i, 1);
/* 11 */            Object obj = this.I00iiO[i + i + this.I00iio];
/* 13 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
