            package p000;

            import java.util.Objects;
            
            public final class OOol0l1I1 extends IoillO0OOoo {
                public static final OOol0l1I1 I00ilI0I1 = new OOol0l1I1(new Object[0], 0);
                public final transient Object[] I00iiO;
                public final transient int I00iio;

                public OOol0l1I1(Object[] objArr, int i) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
                }

                @Override
                public final int I0000O(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00iiO;
/* 4 */             int i = this.I00iio;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 49 */            return i;
                }

                @Override
                public final Object[] I0000oI00() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 0;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return false;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lII0I0I01I1l.I0000O(i, this.I00iio);
/* 8 */             Object obj = this.I00iiO[i];
/* 10 */            Objects.requireNonNull(obj);
/* 49 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }
