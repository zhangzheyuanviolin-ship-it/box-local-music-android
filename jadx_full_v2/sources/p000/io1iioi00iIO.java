            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class io1iioi00iIO extends io0OO101I {
                public final io1o0i1 I00iiO;

                public io1iioi00iIO(io1o0i1 io1o0i1Var) {
/* 1 */             this.I00iiO = io1o0i1Var;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             io1o0i1 io1o0i1Var = this.I00iiO;
/* 5 */             lio1I001.I00000oIO(i, io1o0i1Var.I00ilI0I1);
/* 8 */             Object[] objArr = io1o0i1Var.I00iio;
/* 10 */            int i2 = i + i;
/* 11 */            Object obj = objArr[i2];
/* 13 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.I00ilI0I1;
                }
            }
