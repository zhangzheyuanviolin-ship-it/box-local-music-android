            package p000;
            
            public final class Iiilooi extends OOIOil00IIo {
                public static final Iiilooi I0000Il00O = new Iiilooi(IiioO01.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((double[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             IiililIl1Ol iiililIl1Ol = (IiililIl1Ol) obj;
/* 5 */             double dI001lIiIIo1O = iOl1ii1loO.I001lIiIIo1O(this.I00000oOI, i);
/* 7 */             iiililIl1Ol.I00000oOI(iiililIl1Ol.I0000O() + 1);
/* 12 */            double[] dArr = iiililIl1Ol.I00000oIO;
/* 14 */            int i2 = iiililIl1Ol.I00000oOI;
/* 18 */            iiililIl1Ol.I00000oOI = i2 + 1;
/* 20 */            dArr[i2] = dI001lIiIIo1O;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             double[] dArr = (double[]) obj;
/* 5 */             IiililIl1Ol iiililIl1Ol = new IiililIl1Ol();
/* 8 */             iiililIl1Ol.I00000oIO = dArr;
/* 11 */            iiililIl1Ol.I00000oOI = dArr.length;
/* 15 */            iiililIl1Ol.I00000oOI(10);
/* 49 */            return iiililIl1Ol;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new double[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             double[] dArr = (double[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I000o00OoI0I(this.I00000oOI, i2, dArr[i2]);
                    }
                }
            }
