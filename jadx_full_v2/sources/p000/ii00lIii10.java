            package p000;

            import java.util.Objects;
            
            public final class ii00lIii10 extends iOiIi01lo000 {
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public ii00lIii10(Object[] objArr, int i) {
/* 2 */             super(6);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final Object get(int i) {
/* 2 */             liiOiIII.I00000oIO(i, 1);
/* 11 */            Object obj = this.I00o0iI0io1[i + i + this.I00o0l1o1o0];
/* 13 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }
            }
