            package p000;
            
            public final class IiIoi00ooIo implements Iioi1O {
                public final int I00000oIO;
                public final int I00000oOI;

                public IiIoi00ooIo(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 15 */            if (i >= 0 && i2 >= 0) {
/* 106 */               return;
                    }
/* 44 */            Ioliol.I00000oIO("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
                }

                @Override
                public final void I00000oIO(Oo0olliOi1 oo0olliOi1) {
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
/* 3 */             int i3 = 0;
                    while (true) {
/* 6 */                 if (i2 < this.I00000oIO) {
/* 8 */                     int i4 = i3 + 1;
/* 10 */                    int i5 = oo0olliOi1.I00000oOI;
/* 12 */                    if (i5 <= i4) {
/* 47 */                        i3 = i5;
                                break;
                            } else {
/* 43 */                        i3 = (Character.isHighSurrogate(oo0olliOi1.I00000oOI((i5 - i4) + (-1))) && Character.isLowSurrogate(oo0olliOi1.I00000oOI(oo0olliOi1.I00000oOI - i4))) ? i3 + 2 : i4;
/* 44 */                        i2++;
                            }
                        } else {
                            break;
                        }
                    }
/* 48 */            int iI000lI = 0;
                    while (true) {
/* 51 */                if (i >= this.I00000oOI) {
                            break;
                        }
/* 53 */                int i6 = iI000lI + 1;
/* 55 */                int i7 = oo0olliOi1.I0000Il00O;
/* 59 */                I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) oo0olliOi1.I0001Ioi1lo;
/* 66 */                if (i7 + i6 >= i1I1OO00o1o.I000lI()) {
/* 109 */                   iI000lI = i1I1OO00o1o.I000lI() - oo0olliOi1.I0000Il00O;
                            break;
                        } else {
/* 99 */                    iI000lI = (Character.isHighSurrogate(oo0olliOi1.I00000oOI((oo0olliOi1.I0000Il00O + i6) + (-1))) && Character.isLowSurrogate(oo0olliOi1.I00000oOI(oo0olliOi1.I0000Il00O + i6))) ? iI000lI + 2 : i6;
/* 100 */                   i++;
                        }
                    }
/* 111 */           int i8 = oo0olliOi1.I0000Il00O;
/* 114 */           oo0olliOi1.I00000oIO(i8, iI000lI + i8);
/* 117 */           int i9 = oo0olliOi1.I00000oOI;
/* 121 */           oo0olliOi1.I00000oIO(i9 - i3, i9);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IiIoi00ooIo)) {
/* 7 */                 return false;
                    }
/* 11 */            IiIoi00ooIo iiIoi00ooIo = (IiIoi00ooIo) obj;
                    return this.I00000oIO == iiIoi00ooIo.I00000oIO && this.I00000oOI == iiIoi00ooIo.I00000oOI;
                }

                public final int hashCode() {
/* 7 */             return (this.I00000oIO * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", this.I00000oIO, ", lengthAfterCursor=", this.I00000oOI, ")");
                }
            }
