            package p000;
            
            public final class IIio0l1 implements IlOil1iooOO0 {
                public final int I00iOIl;
                public IIioIlI0 I00iiI;

                public IIio0l1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 18 */                    IIo1i101Il1 iIo1i101Il1 = (IIo1i101Il1) obj;
/* 20 */                    IIioIlI0 iIioIlI0 = this.I00iiI;
/* 22 */                    IIliIi1O0OiO iIliIi1O0OiO = iIioIlI0.I0000Il00O;
/* 29 */                    if (iIo1i101Il1 instanceof IIo1Ill1I) {
/* 42 */                        if (((IIo1Ill1I) iIo1i101Il1).I00000oIO.equals(iIliIi1O0OiO.I00000oIO)) {
/* 44 */                            iIioIlI0.I0000O(iIo1i101Il1);
                                    break;
                                } else {
/* 48 */                            I000II.I001IO000("Check failed.");
                                }
                            } else if (iIo1i101Il1 instanceof IIo1O0l) {
/* 68 */                        if (O0000Ioio00.I0000O(((IIo1O0l) iIo1i101Il1).I00000oIO, iIliIi1O0OiO.I00000oIO)) {
/* 70 */                            iIioIlI0.I0000O(iIo1i101Il1);
                                    break;
                                } else {
/* 74 */                            I000II.I001IO000("Check failed.");
                                }
                            }
                            break;
                        default:
/* 14 */                    this.I00iiI.I0000O(IIo1O0.I00000oIO);
                            break;
                    }
/* 17 */            return ooiIlOl1iI;
                }
            }
