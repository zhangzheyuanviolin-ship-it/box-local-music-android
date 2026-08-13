            package p000;

            import java.util.Objects;
            
            public final class iii11O110 extends iiIooIlooool {
                public static final iii11O110 I00o101lO = new iii11O110(new Object[0], 0);
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public iii11O110(Object[] objArr, int i) {
/* 3 */             super(9);
/* 6 */             this.I00o0iI0io1 = objArr;
/* 8 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final Object[] I00100o1O0lo() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return 0;
                }

                @Override
                public final int I0010o() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final int I00111O(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00o0l1o1o0;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final Object get(int i) {
/* 3 */             lilI1o.I00000oIO(i, this.I00o0l1o1o0);
/* 8 */             Object obj = this.I00o0iI0io1[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
