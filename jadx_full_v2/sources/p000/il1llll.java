            package p000;
            
            public abstract class il1llll {
                public static final boolean I00000oIO(IilI0O iilI0O, long j) {
/* 5 */             if (!iilI0O.I00iOIl.I00lll10) {
/* 94 */                return false;
                    }
/* 16 */            Iollol0oI iollol0oI = (Iollol0oI) il0lI1i1olii.I000O01llI0(iilI0O).I010101Oo1lO.I00iio;
/* 22 */            if (!iollol0oI.I011iIOio.I00lll10) {
/* 94 */                return false;
                    }
/* 27 */            long jI00Iooi00oi = iollol0oI.I00Iooi00oi(0L);
/* 36 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI00Iooi00oi >> 32));
/* 47 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI00Iooi00oi & 4294967295L));
/* 51 */            long j2 = iilI0O.I00oI0i;
/* 57 */            float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
/* 61 */            float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
/* 65 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
/* 71 */            if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
/* 94 */                return false;
                    }
/* 80 */            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                    return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
                }
            }
