            package p000;
            
            public final class iI1I1oIO extends iI1olii1 {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final iI1olii1 I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iI1I1oIO(iI1olii1 ii1olii1, int i, int i2) {
/* 4 */             super(3);
/* 1 */             this.I00o101lO = ii1olii1;
/* 7 */             this.I00o0iI0io1 = i;
/* 9 */             this.I00o0l1o1o0 = i2;
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
                public final iI1olii1 subList(int i, int i2) {
/* 3 */             ll0oolI10I.I00000oOI(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll0oolI10I.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
