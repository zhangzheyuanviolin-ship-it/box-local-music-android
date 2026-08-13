            package p000;

            import java.util.Objects;
            
            public final class i0Iioo0o1liI extends i0IOo0 {
                public static final i0Iioo0o1liI I00o101lO = new i0Iioo0o1liI(new Object[0], 0);
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public i0Iioo0o1liI(Object[] objArr, int i) {
/* 2 */             super(0);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00o0l1o1o0;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 49 */            return i;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final Object get(int i) {
/* 3 */             liO0oIOlo0.I00000oIO(i, this.I00o0l1o1o0);
/* 8 */             Object obj = this.I00o0iI0io1[i];
/* 10 */            Objects.requireNonNull(obj);
/* 49 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
