            package p000;
            
            public final class IooIOllloIo extends OOIOil00IIo {
                public static final IooIOllloIo I0000Il00O = new IooIOllloIo(IooOIlOIIO.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((int[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             IooIO0iilII iooIO0iilII = (IooIO0iilII) obj;
/* 5 */             int iI0010I0i = iOl1ii1loO.I0010I0i(this.I00000oOI, i);
/* 7 */             iooIO0iilII.I00000oOI(iooIO0iilII.I0000O() + 1);
/* 12 */            int[] iArr = iooIO0iilII.I00000oIO;
/* 14 */            int i2 = iooIO0iilII.I00000oOI;
/* 18 */            iooIO0iilII.I00000oOI = i2 + 1;
/* 20 */            iArr[i2] = iI0010I0i;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             int[] iArr = (int[]) obj;
/* 5 */             IooIO0iilII iooIO0iilII = new IooIO0iilII();
/* 8 */             iooIO0iilII.I00000oIO = iArr;
/* 11 */            iooIO0iilII.I00000oOI = iArr.length;
/* 15 */            iooIO0iilII.I00000oOI(10);
/* 49 */            return iooIO0iilII;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new int[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             int[] iArr = (int[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I00111O(i2, iArr[i2], this.I00000oOI);
                    }
                }
            }
