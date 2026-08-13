            package p000;

            import java.util.Objects;
            
            public final class iiiOOlloolII extends ii01IlIiIo {
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final transient int I00o101lO;

                public iiiOOlloolII(Object[] objArr, int i, int i2) {
/* 2 */             super(7);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
/* 9 */             this.I00o101lO = i2;
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll0o0Io00O10.I00000oIO(i, this.I00o101lO);
/* 12 */            Object obj = this.I00o0iI0io1[i + i + this.I00o0l1o1o0];
/* 14 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
