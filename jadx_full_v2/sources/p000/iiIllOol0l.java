            package p000;
            
            public final class iiIllOol0l extends iiIooIlooool {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final iiIooIlooool I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiIllOol0l(iiIooIlooool iiiooilooool, int i, int i2) {
/* 5 */             super(9);
/* 1 */             this.I00o101lO = iiiooilooool;
/* 8 */             this.I00o0iI0io1 = i;
/* 10 */            this.I00o0l1o1o0 = i2;
                }

                @Override
                public final Object[] I00100o1O0lo() {
/* 3 */             return this.I00o101lO.I00100o1O0lo();
                }

                @Override
                public final int I0010I0i() {
/* 9 */             return this.I00o101lO.I0010I0i() + this.I00o0iI0io1;
                }

                @Override
                public final int I0010o() {
/* 12 */            return this.I00o101lO.I0010I0i() + this.I00o0iI0io1 + this.I00o0l1o1o0;
                }

                @Override
                public final iiIooIlooool subList(int i, int i2) {
/* 3 */             lilI1o.I0000Il00O(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             lilI1o.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
