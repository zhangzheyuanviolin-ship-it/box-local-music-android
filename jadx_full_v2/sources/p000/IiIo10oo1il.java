            package p000;
            
            public final class IiIo10oo1il implements Iioi1O {
                public final int I00000oIO;
                public final int I00000oOI;

                public IiIo10oo1il(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 15 */            if (i >= 0 && i2 >= 0) {
/* 106 */               return;
                    }
/* 44 */            Ioliol.I00000oIO("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 1 */             int i = oo0olliOi1.I0000Il00O;
/* 5 */             I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo;
/* 7 */             int i2 = this.I00000oOI;
/* 9 */             int iI000lI = i + i2;
/* 14 */            if (((i ^ iI000lI) & (i2 ^ iI000lI)) < 0) {
/* 16 */                iI000lI = i1I1OO00o1o.I000lI();
                    }
/* 30 */            oo0olliOi1.I00000oIO(oo0olliOi1.I0000Il00O, Math.min(iI000lI, i1I1OO00o1o.I000lI()));
/* 33 */            int i3 = oo0olliOi1.I00000oOI;
/* 35 */            int i4 = this.I00000oIO;
/* 37 */            int i5 = i3 - i4;
/* 43 */            if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
/* 45 */                i5 = 0;
                    }
/* 52 */            oo0olliOi1.I00000oIO(Math.max(0, i5), oo0olliOi1.I00000oOI);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IiIo10oo1il)) {
/* 7 */                 return false;
                    }
/* 11 */            IiIo10oo1il iiIo10oo1il = (IiIo10oo1il) obj;
                    return this.I00000oIO == iiIo10oo1il.I00000oIO && this.I00000oOI == iiIo10oo1il.I00000oOI;
                }

                public final int hashCode() {
/* 7 */             return (this.I00000oIO * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("DeleteSurroundingTextCommand(lengthBeforeCursor=", this.I00000oIO, ", lengthAfterCursor=", this.I00000oOI, ")");
                }
            }
