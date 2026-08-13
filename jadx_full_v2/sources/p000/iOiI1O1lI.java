            package p000;
            
            public final class iOiI1O1lI extends iOio11oiIi0I {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final iOio11oiIi0I I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOiI1O1lI(iOio11oiIi0I ioio11oiii0i, int i, int i2) {
/* 4 */             super(5);
/* 1 */             this.I00o101lO = ioio11oiii0i;
/* 7 */             this.I00o0iI0io1 = i;
/* 9 */             this.I00o0l1o1o0 = i2;
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
                public final iOio11oiIi0I subList(int i, int i2) {
/* 3 */             ll01O0I1o0i1.I0000Il00O(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll01O0I1o0i1.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
