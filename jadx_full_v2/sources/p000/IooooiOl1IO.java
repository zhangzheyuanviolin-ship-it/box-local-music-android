            package p000;
            
            public final class IooooiOl1IO extends Ioool0O {
                public Ioooi1OOlliO I00o0l1o1o0;
                public boolean I00o101lO;

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I000l1(i) : o1iIo0ll.I001iOo1i0O(i);
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I000l1(i) : o1iIo0ll.I001iOo1i0O(i);
                }

                @Override
                public final long I010l1O(O1iIo0ll o1iIo0ll, long j) {
/* 20 */            int iI000l1 = this.I00o0l1o1o0 == Ioooi1OOlliO.I00iOIl ? o1iIo0ll.I000l1(IOo0oO11ll1O.I000OOo1O(j)) : o1iIo0ll.I001iOo1i0O(IOo0oO11ll1O.I000OOo1O(j));
/* 25 */            if (iI000l1 < 0) {
/* 27 */                iI000l1 = 0;
                    }
/* 28 */            if (iI000l1 < 0) {
/* 33 */                Ioliol1Ii.I00000oIO("width must be >= 0");
                    }
/* 39 */            return IOo0olo.I000O01llI0(iI000l1, iI000l1, 0, Integer.MAX_VALUE);
                }

                @Override
                public final boolean I010l1ol111() {
/* 1 */             return this.I00o101lO;
                }
            }
