            package p000;
            
            public final class i10I0Ol extends i10I10 {
                public final transient int I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final i10I10 I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i10I0Ol(i10I10 i10i10, int i, int i2) {
/* 4 */             super(1);
/* 1 */             this.I00o101lO = i10i10;
/* 7 */             this.I00o0iI0io1 = i;
/* 9 */             this.I00o0l1o1o0 = i2;
                }

                @Override
                public final int I000OiO() {
/* 12 */            return this.I00o101lO.I000iOII() + this.I00o0iI0io1 + this.I00o0l1o1o0;
                }

                @Override
                public final int I000iOII() {
/* 9 */             return this.I00o101lO.I000iOII() + this.I00o0iI0io1;
                }

                @Override
                public final Object[] I000lI() {
/* 3 */             return this.I00o101lO.I000lI();
                }

                @Override
                public final i10I10 subList(int i, int i2) {
/* 3 */             liOI0000I1OI.I00000oOI(i, i2, this.I00o0l1o1o0);
/* 6 */             int i3 = this.I00o0iI0io1;
/* 12 */            return this.I00o101lO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             liOI0000I1OI.I00000oIO(i, this.I00o0l1o1o0);
/* 11 */            return this.I00o101lO.get(i + this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o0l1o1o0;
                }
            }
