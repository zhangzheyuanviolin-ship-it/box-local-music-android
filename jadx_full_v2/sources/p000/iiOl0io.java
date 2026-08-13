            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class iiOl0io extends ii01IlIiIo {
                public final iiOoi0oll01I I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiOl0io(iiOoi0oll01I iiooi0oll01i) {
/* 4 */             super(7);
/* 1 */             this.I00o0iI0io1 = iiooi0oll01i;
                }

                @Override
                public final Object get(int i) {
/* 1 */             iiOoi0oll01I iiooi0oll01i = this.I00o0iI0io1;
/* 5 */             ll0o0Io00O10.I00000oIO(i, iiooi0oll01i.I00o101lO);
/* 8 */             Object[] objArr = iiooi0oll01i.I00o0l1o1o0;
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
