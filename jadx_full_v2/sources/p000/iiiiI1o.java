            package p000;

            import java.util.Iterator;
            
            public final class iiiiI1o implements Iterator {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 16 */                    if (this.I00iiI >= 0) {
                            }
                            break;
                        default:
/* 8 */                     if (this.I00iiI >= 0) {
                            }
                            break;
                    }
/* 12 */            return false;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 69 */                    iil1lo iil1loVar = (iil1lo) this.I00ilI0I1;
/* 71 */                    int i = this.I00iiI;
/* 73 */                    lilI1ii lili1ii = iil1loVar.I00000oOI;
/* 75 */                    int iI00000oIO = lili1ii.I00000oIO();
/* 99 */                    Object objCast = ((iIIoI1) this.I00iio).I00000oOI.cast(i >= iI00000oIO ? iil1loVar.I0000Il00O.I0000O(i - iI00000oIO) : lili1ii.I0000O(i));
/* 103 */                   int i2 = this.I00iiO;
/* 105 */                   if (i2 != 0) {
/* 111 */                       int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
                                this.I00iiO >>>= iNumberOfTrailingZeros;
                                this.I00iiI += iNumberOfTrailingZeros;
                            } else {
/* 124 */                       this.I00iiI = -1;
                            }
/* 126 */                   return objCast;
                        default:
/* 9 */                     o1I0O0l1o0l o1i0o0l1o0l = (o1I0O0l1o0l) this.I00ilI0I1;
/* 11 */                    int i3 = this.I00iiI;
/* 13 */                    ll1lIIo ll1liio = o1i0o0l1o0l.I00000oOI;
/* 15 */                    int iI00000oIO2 = ll1liio.I00000oIO();
/* 39 */                    Object objCast2 = ((o0oooliI) this.I00iio).I00000oOI.cast(i3 >= iI00000oIO2 ? o1i0o0l1o0l.I0000Il00O.I0000Il00O(i3 - iI00000oIO2) : ll1liio.I0000Il00O(i3));
/* 43 */                    int i4 = this.I00iiO;
/* 45 */                    if (i4 != 0) {
/* 51 */                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i4) + 1;
                                this.I00iiO >>>= iNumberOfTrailingZeros2;
                                this.I00iiI += iNumberOfTrailingZeros2;
                            } else {
/* 64 */                        this.I00iiI = -1;
                            }
/* 66 */                    return objCast2;
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }
            }
