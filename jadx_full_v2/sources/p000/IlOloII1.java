            package p000;
            
            public final class IlOloII1 implements IlOil1iooOO0 {
                public final int I00iOIl;
                public OOo0ooi I00iiI;

                public IlOloII1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    this.I00iiI.I00iOIl = obj;
/* 45 */                    throw new I00i0ilIl0i(this);
                        case 1:
/* 28 */                    this.I00iiI.I00iOIl = obj;
/* 35 */                    throw new I00i0ilIl0i(this);
                        default:
/* 6 */                     OOo0ooi oOo0ooi = this.I00iiI;
/* 12 */                    if (oOo0ooi.I00iOIl == OIOOIO0o.I00000oIO) {
/* 14 */                        oOo0ooi.I00iOIl = obj;
/* 16 */                        return OoiIlOl1iI.I00000oIO;
                            }
/* 21 */                    I000II.I000iOII("Flow has more than one element");
/* 24 */                    return null;
                    }
                }
            }
