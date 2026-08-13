            package p000;
            
            public final class IIo0l1o {
                public final IIllOlooI I00000oIO;
                public final I1io1I I00000oOI;

                public IIo0l1o(IIllOlooI iIllOlooI, I1io1I i1io1I) {
/* 4 */             this.I00000oIO = iIllOlooI;
/* 6 */             this.I00000oOI = i1io1I;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIo0l1o)) {
/* 7 */                 return false;
                    }
/* 11 */            IIo0l1o iIo0l1o = (IIo0l1o) obj;
                    return this.I00000oIO == iIo0l1o.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, iIo0l1o.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             I1io1I i1io1I = this.I00000oOI;
/* 19 */            return iHashCode + (i1io1I == null ? 0 : i1io1I.hashCode());
                }

                public final String toString() {
/* 28 */            return "CombinedCameraState(state=" + this.I00000oIO + ", error=" + this.I00000oOI + ')';
                }
            }
