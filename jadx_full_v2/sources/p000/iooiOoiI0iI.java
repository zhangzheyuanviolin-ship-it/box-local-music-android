            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iooiOoiI0iI extends ioIl00 {
                public final ioolil0I I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iooiOoiI0iI(ioolil0I ioolil0i) {
/* 5 */             super(10);
/* 1 */             this.I00o0iI0io1 = ioolil0i;
                }

                @Override
                public final Object get(int i) {
/* 1 */             ioolil0I ioolil0i = this.I00o0iI0io1;
/* 5 */             lio00O0OO.I00000oIO(i, ioolil0i.I00o101lO);
/* 8 */             Object[] objArr = ioolil0i.I00o0l1o1o0;
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
