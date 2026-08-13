            package p000;

            import java.util.Objects;
            
            public final class OOolII0o extends IoillO0OOoo {
                public final transient Object[] I00iiO;
                public final transient int I00iio;
                public final transient int I00ilI0I1;

                public OOolII0o(Object[] objArr, int i, int i2) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
/* 8 */             this.I00ilI0I1 = i2;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lII0I0I01I1l.I0000O(i, this.I00ilI0I1);
/* 13 */            Object obj = this.I00iiO[(i * 2) + this.I00iio];
/* 15 */            Objects.requireNonNull(obj);
/* 49 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ilI0I1;
                }
            }
