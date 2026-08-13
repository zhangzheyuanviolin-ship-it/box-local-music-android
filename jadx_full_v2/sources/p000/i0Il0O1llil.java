            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class i0Il0O1llil extends i0IOo0 {
                public final i0Il11IIol01 I00o0iI0io1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0Il0O1llil(i0Il11IIol01 i0il11iiol01) {
/* 4 */             super(0);
/* 1 */             this.I00o0iI0io1 = i0il11iiol01;
                }

                @Override
                public final Object get(int i) {
/* 1 */             i0Il11IIol01 i0il11iiol01 = this.I00o0iI0io1;
/* 5 */             liO0oIOlo0.I00000oIO(i, i0il11iiol01.I00o101lO);
/* 8 */             Object[] objArr = i0il11iiol01.I00o0l1o1o0;
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
