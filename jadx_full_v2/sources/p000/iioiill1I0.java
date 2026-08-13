            package p000;
            
            public abstract class iioiill1I0 {
                public static final boolean I00000oIO(long j, long j2) {
                    return j == j2;
                }

                public static String I00000oOI(long j) {
/* 5 */             int i = (int) (j >> 32);
/* 16 */            int i2 = (int) (j & 4294967295L);
                    return Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? IlIi0I0.I000lI("CornerRadius.circular(", ill1O0010.I00000oIO(Float.intBitsToFloat(i)), ")") : Oi010OO0.I001IO000("CornerRadius.elliptical(", ill1O0010.I00000oIO(Float.intBitsToFloat(i)), ", ", ill1O0010.I00000oIO(Float.intBitsToFloat(i2)), ")");
                }
            }
