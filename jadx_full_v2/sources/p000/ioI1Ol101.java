            package p000;

            import java.util.Objects;
            
            public final class ioI1Ol101 extends io0OIIlOli1 {
                public final transient Object[] I00iiO;
                public final transient int I00iio;
                public final transient int I00ilI0I1;

                public ioI1Ol101(Object[] objArr, int i, int i2) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
/* 8 */             this.I00ilI0I1 = i2;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lio0looOIII0.I00000oIO(i, this.I00ilI0I1);
/* 12 */            Object obj = this.I00iiO[i + i + this.I00iio];
/* 14 */            Objects.requireNonNull(obj);
/* 49 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilI0I1;
                }
            }
