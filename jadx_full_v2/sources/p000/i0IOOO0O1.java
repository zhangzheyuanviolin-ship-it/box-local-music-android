            package p000;
            
            public final class i0IOOO0O1 extends i0IOo0 {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final i0IOo0 I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IOOO0O1(i0IOo0 i0ioo0, int i, int i2) {
/* 4 */             super(0);
/* 1 */             this.I00o101lO = i0ioo0;
/* 7 */             this.I00o0iI0io1 = i;
/* 9 */             this.I00o0l1o1o0 = i2;
                }

                @Override
                public final int I0000O() {
/* 12 */            return this.I00o101lO.I0000oI00() + this.I00o0iI0io1 + this.I00o0l1o1o0;
                }

                @Override
                public final int I0000oI00() {
/* 9 */             return this.I00o101lO.I0000oI00() + this.I00o0iI0io1;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 3 */             return this.I00o101lO.I0001Ioi1lo();
                }

                @Override
                public final i0IOo0 subList(int i, int i2) {
/* 3 */             liO0oIOlo0.I0000Il00O(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             liO0oIOlo0.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
