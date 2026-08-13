            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iiIIOo01Io0 extends iOio11oiIi0I {
                public final iiIiIlIo0 I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiIIOo01Io0(iiIiIlIo0 iiiiilio0) {
/* 4 */             super(5);
/* 1 */             this.I00o0iI0io1 = iiiiilio0;
                }

                @Override
                public final Object get(int i) {
/* 1 */             iiIiIlIo0 iiiiilio0 = this.I00o0iI0io1;
/* 5 */             ll01O0I1o0i1.I00000oIO(i, iiiiilio0.I00o101lO);
/* 8 */             Object[] objArr = iiiiilio0.I00o0l1o1o0;
/* 10 */            int i2 = i + i;
/* 11 */            Object obj = objArr[i2];
/* 13 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00o0iI0io1.I00o101lO;
                }
            }
