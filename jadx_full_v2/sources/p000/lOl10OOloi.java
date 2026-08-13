            package p000;

            import java.util.Objects;
            
            public final class lOl10OOloi extends lOI1lll1l10 {
                public static final lOl10OOloi I00ilI0I1 = new lOl10OOloi(new Object[0], 0);
                public final transient Object[] I00iiO;
                public final transient int I00iio;

                public lOl10OOloi(Object[] objArr, int i) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
                }

                @Override
                public final Object[] I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final int I0000O() {
/* 1 */             return 0;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return false;
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00iiO;
/* 4 */             int i = this.I00iio;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll0OlOllOl.I0000Il00O(i, this.I00iio);
/* 8 */             Object obj = this.I00iiO[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }
