            package p000;

            import java.util.Objects;
            
            public final class lIlIloOo extends lIOiOOl {
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public lIlIloOo(Object[] objArr, int i) {
/* 3 */             super(11);
/* 6 */             this.I00o0iI0io1 = objArr;
/* 8 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final Object get(int i) {
/* 2 */             ll0IliOoo.I00000oIO(i, 1);
/* 11 */            Object obj = this.I00o0iI0io1[i + i + this.I00o0l1o1o0];
/* 13 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
