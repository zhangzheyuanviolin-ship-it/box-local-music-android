            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iiiIli1 extends iiIooIlooool {
                public final iiiiO10iIiI I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiiIli1(iiiiO10iIiI iiiio10iiii) {
/* 5 */             super(9);
/* 1 */             this.I00o0iI0io1 = iiiio10iiii;
                }

                @Override
                public final Object get(int i) {
/* 1 */             iiiiO10iIiI iiiio10iiii = this.I00o0iI0io1;
/* 5 */             lilI1o.I00000oIO(i, iiiio10iiii.I00o101lO);
/* 8 */             Object[] objArr = iiiio10iiii.I00o0l1o1o0;
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
