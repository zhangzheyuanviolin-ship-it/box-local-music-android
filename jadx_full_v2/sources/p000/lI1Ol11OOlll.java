            package p000;
            
            public abstract class lI1Ol11OOlll {
                public static final boolean I00000oIO(OO1il00lI oO1il00lI) {
                    return (oO1il00lI.I0000Il00O() || oO1il00lI.I000O01llI0 || !oO1il00lI.I0000O) ? false : true;
                }

                public static final boolean I00000oOI(OO1il00lI oO1il00lI) {
                    return !oO1il00lI.I000O01llI0 && oO1il00lI.I0000O;
                }

                public static final boolean I0000Il00O(OO1il00lI oO1il00lI) {
                    return (oO1il00lI.I0000Il00O() || !oO1il00lI.I000O01llI0 || oO1il00lI.I0000O) ? false : true;
                }

                public static final boolean I0000O(OO1il00lI oO1il00lI) {
                    return oO1il00lI.I000O01llI0 && !oO1il00lI.I0000O;
                }

                public static final boolean I0000oI00(OO1il00lI oO1il00lI, long j, long j2) {
/* 9 */             int i = oO1il00lI.I000OOo1O == 1 ? 1 : 0;
/* 10 */            long j3 = oO1il00lI.I0000Il00O;
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
/* 28 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                    float f = i;
/* 40 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
/* 45 */            float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
/* 52 */            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
/* 87 */            return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
                }

                public static final long I0001Ioi1lo(OO1il00lI oO1il00lI, boolean z) {
/* 5 */             long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(oO1il00lI.I0000Il00O, oO1il00lI.I000II);
/* 9 */             if (z || !oO1il00lI.I0000Il00O()) {
/* 37 */                return jI0001Ioi1lo;
                    }
/* 17 */            return 0L;
                }
            }
