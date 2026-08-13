            package p000;
            
            public final class IlOoi1ilio00 {
                public IlOoi0i0 I00000oIO;
                public O1iIo0ll I00000oOI;
                public OO1I0001000i I0000Il00O;
                public O1iIo0ll I0000O;
                public OO1I0001000i I0000oI00;
                public IooIiOoIIoO I0001Ioi1lo;
                public IooIiOoIIoO I000II;

                public final IooIiOoIIoO I00000oIO(int i, int i2, boolean z) {
/* 3 */             int iOrdinal = this.I00000oIO.ordinal();
/* 7 */             if (iOrdinal == 0 || iOrdinal == 1) {
/* 41 */                return null;
                    }
/* 13 */            if (iOrdinal == 2) {
/* 36 */                if (z) {
/* 38 */                    return this.I0001Ioi1lo;
                        }
/* 41 */                return null;
                    }
/* 16 */            if (iOrdinal != 3) {
/* 31 */                I000II.I00000oIO();
/* 34 */                return null;
                    }
/* 18 */            if (z) {
/* 20 */                return this.I0001Ioi1lo;
                    }
/* 24 */            if (i + 1 < 0 || i2 < 0) {
/* 41 */                return null;
                    }
/* 28 */            return this.I000II;
                }

                public final void I00000oOI(O1iIo0ll o1iIo0ll, O1iIo0ll o1iIo0ll2, long j) {
/* 3 */             long jI00000oIO = l1lOIl1iIO0.I00000oIO(j, O0io1IOlIOo.I00iOIl);
/* 8 */             if (o1iIo0ll != null) {
/* 14 */                int iI000l1 = o1iIo0ll.I000l1(IOo0oO11ll1O.I000OOo1O(jI00000oIO));
/* 30 */                this.I0001Ioi1lo = IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(iI000l1, o1iIo0ll.I00OI1(iI000l1)));
/* 32 */                this.I00000oOI = o1iIo0ll;
/* 34 */                this.I0000Il00O = null;
                    }
/* 36 */            if (o1iIo0ll2 != null) {
/* 42 */                int iI000l12 = o1iIo0ll2.I000l1(IOo0oO11ll1O.I000OOo1O(jI00000oIO));
/* 58 */                this.I000II = IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(iI000l12, o1iIo0ll2.I00OI1(iI000l12)));
/* 60 */                this.I0000O = o1iIo0ll2;
/* 62 */                this.I0000oI00 = null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IlOoi1ilio00) && this.I00000oIO == ((IlOoi1ilio00) obj).I00000oIO;
                }

                public final int hashCode() {
/* 19 */            return Integer.hashCode(0) + IIl001iO0Io.I0000O(0, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 18 */            return "FlowLayoutOverflowState(type=" + this.I00000oIO + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
                }
            }
