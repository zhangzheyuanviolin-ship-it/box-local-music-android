            package p000;
            
            public abstract class ioolillioIIO {
                public static final long I00000oIO(long j, long j2) {
/* 14 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
/* 30 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
/* 45 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }

                public static final long I00000oOI(long j) {
/* 34 */            return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
                }
            }
