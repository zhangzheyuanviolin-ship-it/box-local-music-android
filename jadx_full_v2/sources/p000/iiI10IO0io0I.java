            package p000;

            import java.util.Objects;
            
            public final class iiI10IO0io0I extends iOio11oiIi0I {
                public static final iiI10IO0io0I I00o101lO = new iiI10IO0io0I(new Object[0], 0);
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public iiI10IO0io0I(Object[] objArr, int i) {
/* 2 */             super(5);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00o0l1o1o0;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 49 */            return i;
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I001IIilI0O() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll01O0I1o0i1.I00000oIO(i, this.I00o0l1o1o0);
/* 8 */             Object obj = this.I00o0iI0io1[i];
/* 10 */            Objects.requireNonNull(obj);
/* 49 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
