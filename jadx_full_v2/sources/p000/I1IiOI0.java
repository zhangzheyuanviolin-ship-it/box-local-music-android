            package p000;
            
            public final class I1IiOI0 implements I1IiiOO0i0io {
                public final int I00iOIl;

                @Override
                public final void I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int[] iArr, O0iOOoiioO o0iOOoiioO, int[] iArr2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 36 */                    I1IiooiI1IlO.I00000oOI(iArr, iArr2, false);
                            break;
                        case 1:
/* 32 */                    I1IiooiI1IlO.I0000Il00O(i, iArr, iArr2, false);
                            break;
                        case 2:
/* 22 */                    if (o0iOOoiioO != O0iOOoiioO.I00iOIl) {
/* 28 */                        I1IiooiI1IlO.I00000oOI(iArr, iArr2, true);
                                break;
                            } else {
/* 24 */                        I1IiooiI1IlO.I0000Il00O(i, iArr, iArr2, false);
                                break;
                            }
                        default:
/* 10 */                    if (o0iOOoiioO != O0iOOoiioO.I00iOIl) {
/* 16 */                        I1IiooiI1IlO.I0000Il00O(i, iArr, iArr2, true);
                                break;
                            } else {
/* 12 */                        I1IiooiI1IlO.I00000oOI(iArr, iArr2, false);
                                break;
                            }
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    return "AbsoluteArrangement#Left";
                        case 1:
/* 12 */                    return "AbsoluteArrangement#Right";
                        case 2:
/* 9 */                     return "Arrangement#End";
                        default:
/* 6 */                     return "Arrangement#Start";
                    }
                }
            }
