            package p000;
            
            public abstract class lOIi0i0 {
                public static final long I00000oIO(long j) {
/* 12 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
/* 24 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
/* 38 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }
            }
