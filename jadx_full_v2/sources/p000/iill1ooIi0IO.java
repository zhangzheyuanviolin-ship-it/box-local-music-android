            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iill1ooIi0IO extends ii1i1oI1o1O0 {
                public final iilo1IOIoli1 I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iill1ooIi0IO(iilo1IOIoli1 iilo1ioioli1) {
/* 5 */             super(8);
/* 1 */             this.I00o0iI0io1 = iilo1ioioli1;
                }

                @Override
                public final Object get(int i) {
/* 2 */             ll1OoIO1I.I00000oIO(i, 1);
/* 9 */             Object[] objArr = (Object[]) this.I00o0iI0io1.I00o101lO;
/* 11 */            int i2 = i + i;
/* 12 */            Object obj = objArr[i2];
/* 14 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
