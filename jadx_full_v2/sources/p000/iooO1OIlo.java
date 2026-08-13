            package p000;

            import java.util.Objects;
            
            public final class iooO1OIlo extends ioIl00 {
                public static final iooO1OIlo I00o101lO = new iooO1OIlo(new Object[0], 0);
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public iooO1OIlo(Object[] objArr, int i) {
/* 3 */             super(10);
/* 6 */             this.I00o0iI0io1 = objArr;
/* 8 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00o0l1o1o0;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
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
/* 3 */             lio00O0OO.I00000oIO(i, this.I00o0l1o1o0);
/* 8 */             Object obj = this.I00o0iI0io1[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
