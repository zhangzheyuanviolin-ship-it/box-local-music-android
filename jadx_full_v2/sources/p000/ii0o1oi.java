            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class ii0o1oi extends iO10llOoIiI0 {
                public final ii101lO I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii0o1oi(ii101lO ii101lo) {
/* 4 */             super(4);
/* 1 */             this.I00o0iI0io1 = ii101lo;
                }

                @Override
                public final Object get(int i) {
/* 2 */             lilOoII.I00000oIO(i, 1);
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
