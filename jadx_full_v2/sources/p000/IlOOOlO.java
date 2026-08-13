            package p000;
            
            public final class IlOOOlO extends OOIOil00IIo {
                public static final IlOOOlO I0000Il00O = new IlOOOlO(IlOOio0oO.I00000oIO);

                @Override
                public final int I000O01llI0(Object obj) {
/* 3 */             return ((float[]) obj).length;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             IlOOI1 ilOOI1 = (IlOOI1) obj;
/* 5 */             float fI000OOo1O = iOl1ii1loO.I000OOo1O(this.I00000oOI, i);
/* 7 */             ilOOI1.I00000oOI(ilOOI1.I0000O() + 1);
/* 12 */            float[] fArr = ilOOI1.I00000oIO;
/* 14 */            int i2 = ilOOI1.I00000oOI;
/* 18 */            ilOOI1.I00000oOI = i2 + 1;
/* 20 */            fArr[i2] = fI000OOo1O;
                }

                @Override
                public final Object I000iOII(Object obj) {
/* 1 */             float[] fArr = (float[]) obj;
/* 5 */             IlOOI1 ilOOI1 = new IlOOI1();
/* 8 */             ilOOI1.I00000oIO = fArr;
/* 11 */            ilOOI1.I00000oOI = fArr.length;
/* 15 */            ilOOI1.I00000oOI(10);
/* 49 */            return ilOOI1;
                }

                @Override
                public final Object I000o00OoI0I() {
/* 2 */             return new float[0];
                }

                @Override
                public final void I000oI1ioi(IOl1l0o0i1I0 iOl1l0o0i1I0, Object obj, int i) {
/* 1 */             float[] fArr = (float[]) obj;
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iOl1l0o0i1I0.I00100o1O0lo(this.I00000oOI, i2, fArr[i2]);
                    }
                }
            }
