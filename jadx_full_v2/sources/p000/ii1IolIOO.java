            package p000;
            
            public final class ii1IolIOO extends ii1i1oI1o1O0 {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final ii1i1oI1o1O0 I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii1IolIOO(ii1i1oI1o1O0 ii1i1oi1o1o0, int i, int i2) {
/* 5 */             super(8);
/* 1 */             this.I00o101lO = ii1i1oi1o1o0;
/* 8 */             this.I00o0iI0io1 = i;
/* 10 */            this.I00o0l1o1o0 = i2;
                }

                @Override
                public final int I000oI1ioi() {
/* 12 */            return this.I00o101lO.I0010I0i() + this.I00o0iI0io1 + this.I00o0l1o1o0;
                }

                @Override
                public final int I0010I0i() {
/* 9 */             return this.I00o101lO.I0010I0i() + this.I00o0iI0io1;
                }

                @Override
                public final Object[] I001IIilI0O() {
/* 3 */             return this.I00o101lO.I001IIilI0O();
                }

                @Override
                public final ii1i1oI1o1O0 subList(int i, int i2) {
/* 3 */             ll1OoIO1I.I00000oOI(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll1OoIO1I.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
