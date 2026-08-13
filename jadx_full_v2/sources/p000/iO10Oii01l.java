            package p000;
            
            public abstract class iO10Oii01l {
                public static final Object I00000oIO = new Object();

                public static final Object I00000oIO(OlIIioolI olIIioolI, int i) {
                    Object obj;
/* 5 */             int iI00000oIO = iIIl1I0OIlO0.I00000oIO(olIIioolI.I00iio, i, olIIioolI.I00iiI);
/* 9 */             if (iI00000oIO < 0 || (obj = olIIioolI.I00iiO[iI00000oIO]) == I00000oIO) {
/* 21 */                return null;
                    }
/* 20 */            return obj;
                }

                public static final void I00000oOI(OlIIioolI olIIioolI) {
/* 1 */             int i = olIIioolI.I00iio;
/* 3 */             int[] iArr = olIIioolI.I00iiI;
/* 5 */             Object[] objArr = olIIioolI.I00iiO;
/* 9 */             int i2 = 0;
/* 10 */            for (int i3 = 0; i3 < i; i3++) {
/* 12 */                Object obj = objArr[i3];
/* 16 */                if (obj != I00000oIO) {
/* 18 */                    if (i3 != i2) {
/* 22 */                        iArr[i2] = iArr[i3];
/* 24 */                        objArr[i2] = obj;
/* 27 */                        objArr[i3] = null;
                            }
/* 29 */                    i2++;
                        }
                    }
/* 34 */            olIIioolI.I00iOIl = false;
/* 36 */            olIIioolI.I00iio = i2;
                }
            }
