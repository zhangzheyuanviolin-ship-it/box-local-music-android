            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I10l0iiI10I extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final I10l0oo1oO I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10l0iiI10I(I10l0oo1oO i10l0oo1oO, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i10l0oo1oO;
                }

                @Override
                public final Object invoke(Object obj) {
                    OO1I0001000i[] oO1I0001000iArr;
                    int i;
                    OoiIlOl1iI ooiIlOl1iI;
                    int i2;
/* 3 */             int i3 = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 7 */             int i4 = 0;
/* 8 */             I10l0oo1oO i10l0oo1oO = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 103 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 105 */                   OO1I0001000i[] oO1I0001000iArr2 = i10l0oo1oO.I0000Il00O;
/* 107 */                   int i5 = i10l0oo1oO.I0000oI00;
/* 109 */                   int i6 = i10l0oo1oO.I000II;
/* 111 */                   int length = oO1I0001000iArr2.length;
/* 112 */                   while (i4 < length) {
/* 114 */                       OO1I0001000i oO1I0001000i = oO1I0001000iArr2[i4];
/* 116 */                       if (oO1I0001000i != null) {
/* 137 */                           oO1I0001000iArr = oO1I0001000iArr2;
/* 138 */                           i = i4;
/* 146 */                           long jI00000oIO = i10l0oo1oO.I00000oIO.I00000oOI.I00000oIO((oO1I0001000i.I00iOIl << 32) | (oO1I0001000i.I00iiI & 4294967295L), (i5 << 32) | (i6 & 4294967295L), O0iOOoiioO.I00iOIl);
/* 2 */                             oO11o0IO.I000O01llI0(oO1I0001000i, (int) (jI00000oIO >> 32), (int) (jI00000oIO & 4294967295L), 0.0f);
                                } else {
/* 160 */                           oO1I0001000iArr = oO1I0001000iArr2;
/* 161 */                           i = i4;
                                }
/* 163 */                       i4 = i + 1;
/* 165 */                       oO1I0001000iArr2 = oO1I0001000iArr;
                            }
                            break;
                        default:
/* 15 */                    OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 17 */                    OO1I0001000i[] oO1I0001000iArr3 = i10l0oo1oO.I00000oOI;
/* 19 */                    int i7 = i10l0oo1oO.I0000O;
/* 21 */                    int i8 = i10l0oo1oO.I0001Ioi1lo;
/* 23 */                    int length2 = oO1I0001000iArr3.length;
/* 24 */                    while (i4 < length2) {
/* 26 */                        OO1I0001000i oO1I0001000i2 = oO1I0001000iArr3[i4];
/* 28 */                        if (oO1I0001000i2 != null) {
/* 32 */                            I0iolI1I11l1 i0iolI1I11l1 = i10l0oo1oO.I00000oIO.I00000oOI;
/* 51 */                            long j = (oO1I0001000i2.I00iiI & 4294967295L) | (oO1I0001000i2.I00iOIl << 32);
/* 55 */                            ooiIlOl1iI = ooiIlOl1iI2;
/* 56 */                            i2 = i4;
/* 64 */                            long jI00000oIO2 = i0iolI1I11l1.I00000oIO(j, (i7 << 32) | (i8 & 4294967295L), O0iOOoiioO.I00iOIl);
/* 2 */                             oO11o0IO2.I000O01llI0(oO1I0001000i2, (int) (jI00000oIO2 >> 32), (int) (jI00000oIO2 & 4294967295L), 0.0f);
                                } else {
/* 78 */                            ooiIlOl1iI = ooiIlOl1iI2;
/* 79 */                            i2 = i4;
                                }
/* 87 */                        i4 = i2 + 1;
/* 89 */                        ooiIlOl1iI2 = ooiIlOl1iI;
                            }
                            break;
                    }
/* 91 */            return ooiIlOl1iI2;
                }
            }
