            package p000;
            
            public final class IoooOl0I00 extends Ioool0O {
                public Ioooi1OOlliO I00o0l1o1o0;
                public boolean I00o101lO;

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I00OI1(i) : o1iIo0ll.I0000Il00O(i);
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I00OI1(i) : o1iIo0ll.I0000Il00O(i);
                }

                @Override
                public final long I010l1O(O1iIo0ll o1iIo0ll, long j) {
/* 20 */            int iI00OI1 = this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I00OI1(IOo0oO11ll1O.I000OiO(j)) : o1iIo0ll.I0000Il00O(IOo0oO11ll1O.I000OiO(j));
/* 25 */            if (iI00OI1 < 0) {
/* 27 */                iI00OI1 = 0;
                    }
/* 28 */            if (iI00OI1 < 0) {
/* 33 */                Ioliol1Ii.I00000oIO("height must be >= 0");
                    }
/* 39 */            return IOo0olo.I000O01llI0(0, Integer.MAX_VALUE, iI00OI1, iI00OI1);
                }

                @Override
                public final boolean I010l1ol111() {
/* 1 */             return this.I00o101lO;
                }
            }
