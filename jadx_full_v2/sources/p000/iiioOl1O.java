            package p000;

            import java.util.ArrayList;
            
            public abstract class iiioOl1O {
                public static final int I00000oIO(int i, int i2) {
/* 7 */             return i << (((i2 % 10) * 3) + 1);
                }

                public static final IOii1l I00000oOI(int i, IlliIlI illiIlI, IloI0lOlll1 iloI0lOlll1) {
/* 1 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 7 */             if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 12 */                objI00O0i0ii = new IOii1l(i, illiIlI, true);
/* 15 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 18 */            IOii1l iOii1l = (IOii1l) objI00O0i0ii;
/* 26 */            if (!iOii1l.I00iiO.equals(illiIlI)) {
/* 28 */                iOii1l.I00iiO = illiIlI;
/* 32 */                if (iOii1l.I00iiI) {
/* 34 */                    OOloioIl oOloioIl = iOii1l.I00iio;
/* 37 */                    if (oOloioIl != null) {
/* 39 */                        OOlol11 oOlol11 = oOloioIl.I00000oIO;
/* 41 */                        if (oOlol11 != null) {
/* 43 */                            oOlol11.I0000Il00O(oOloioIl, null);
                                }
/* 46 */                        iOii1l.I00iio = null;
                            }
/* 48 */                    ArrayList arrayList = iOii1l.I00ilI0I1;
/* 50 */                    if (arrayList != null) {
/* 52 */                        int size = arrayList.size();
/* 57 */                        for (int i2 = 0; i2 < size; i2++) {
/* 63 */                            OOloioIl oOloioIl2 = (OOloioIl) arrayList.get(i2);
/* 65 */                            OOlol11 oOlol112 = oOloioIl2.I00000oIO;
/* 67 */                            if (oOlol112 != null) {
/* 69 */                                oOlol112.I0000Il00O(oOloioIl2, null);
                                    }
                                }
/* 75 */                        arrayList.clear();
                            }
                        }
                    }
/* 98 */            return iOii1l;
                }
            }
