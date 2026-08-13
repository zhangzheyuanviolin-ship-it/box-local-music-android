            package p000;

            import java.util.Objects;
            
            public final class i10IIII01ol extends i10I10 {
                public static final i10IIII01ol I00o101lO = new i10IIII01ol(new Object[0], 0);
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;

                public i10IIII01ol(Object[] objArr, int i) {
/* 2 */             super(1);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
                }

                @Override
                public final int I000OOo1O(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00o0l1o1o0;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final int I000OiO() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final int I000iOII() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I000lI() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final Object get(int i) {
/* 3 */             liOI0000I1OI.I00000oIO(i, this.I00o0l1o1o0);
/* 8 */             Object obj = this.I00o0iI0io1[i];
/* 10 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
