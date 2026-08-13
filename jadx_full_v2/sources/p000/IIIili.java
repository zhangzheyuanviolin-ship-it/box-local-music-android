            package p000;
            
            public final class IIIili extends OOIOil00IIo {
                public static final IIIili I0000Il00O = new IIIili(IIO0o1IOoo.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((byte[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             IIIiOO1ol iIIiOO1ol = (IIIiOO1ol) obj;
/* 5 */             byte bI000iOII = iOl1ii1loO.I000iOII(this.I00000oOI, i);
/* 7 */             iIIiOO1ol.I00000oOI(iIIiOO1ol.I0000O() + 1);
/* 12 */            byte[] bArr = iIIiOO1ol.I00000oIO;
/* 14 */            int i2 = iIIiOO1ol.I00000oOI;
/* 18 */            iIIiOO1ol.I00000oOI = i2 + 1;
/* 20 */            bArr[i2] = bI000iOII;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             byte[] bArr = (byte[]) obj;
/* 5 */             IIIiOO1ol iIIiOO1ol = new IIIiOO1ol();
/* 8 */             iIIiOO1ol.I00000oIO = bArr;
/* 11 */            iIIiOO1ol.I00000oOI = bArr.length;
/* 15 */            iIIiOO1ol.I00000oOI(10);
/* 49 */            return iIIiOO1ol;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new byte[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             byte[] bArr = (byte[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I000oI1ioi(this.I00000oOI, i2, bArr[i2]);
                    }
                }
            }
