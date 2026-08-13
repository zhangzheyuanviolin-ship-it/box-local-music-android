            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iIlol1lIIIIl extends iI0l1iOio0 {
                public final iIolIOo0I I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iIlol1lIIIIl(iIolIOo0I iiolioo0i) {
/* 4 */             super(2);
/* 1 */             this.I00o0iI0io1 = iiolioo0i;
                }

                @Override
                public final Object get(int i) {
/* 1 */             iIolIOo0I iiolioo0i = this.I00o0iI0io1;
/* 5 */             ll111i0.I00000oIO(i, iiolioo0i.I00o101lO);
/* 8 */             Object[] objArr = iiolioo0i.I00o0l1o1o0;
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
