            package p000;
            
            public abstract class iOi0i1l1i0IO {
                public static final long I00000oIO(float f, long j) {
/* 12 */            float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
/* 28 */            float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
/* 46 */            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
                }
            }
