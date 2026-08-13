            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iOo0oo extends iOiIi01lo000 {
                public final iOoi10 I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOo0oo(iOoi10 iooi10) {
/* 4 */             super(6);
/* 1 */             this.I00o0iI0io1 = iooi10;
                }

                @Override
                public final Object get(int i) {
/* 2 */             liiOiIII.I00000oIO(i, 1);
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
