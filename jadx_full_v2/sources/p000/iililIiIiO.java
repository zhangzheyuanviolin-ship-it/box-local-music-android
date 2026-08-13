            package p000;
            
            public abstract class iililIiIiO {
                public static final Object I00000oIO(OO0lO0l0 oO0lO0l0, OOiIOoiOO oOiIOoiOO) {
/* 1 */             Object objI00000oOI = oO0lO0l0.get(oOiIOoiOO);
/* 5 */             if (objI00000oOI == null) {
/* 7 */                 objI00000oOI = oOiIOoiOO.I00000oOI();
                    }
/* 13 */            return ((OoloiloOIo) objI00000oOI).I00000oIO(oO0lO0l0);
                }

                public static final OO0lO0l0 I00000oOI(OOiIo1lll[] oOiIo1lllArr, OO0lO0l0 oO0lO0l0, OO0lO0l0 oO0lO0l02) {
/* 1 */             OO0lO0l0 oO0lO0l03 = OO0lO0l0.I00iio;
/* 5 */             OO0lIolol110 oO0lIolol110 = new OO0lIolol110(oO0lO0l03);
/* 8 */             oO0lIolol110.I00io1l = oO0lO0l03;
/* 12 */            for (OOiIo1lll oOiIo1lll : oOiIo1lllArr) {
/* 16 */                OOiIOoiOO oOiIOoiOO = oOiIo1lll.I00000oIO;
/* 20 */                if (oOiIo1lll.I000II || !oO0lO0l0.containsKey(oOiIOoiOO)) {
/* 38 */                    oO0lIolol110.put(oOiIOoiOO, oOiIOoiOO.I0000O(oOiIo1lll, (OoloiloOIo) oO0lO0l02.get(oOiIOoiOO)));
                        }
                    }
/* 44 */            return oO0lIolol110.I00000oIO();
                }
            }
