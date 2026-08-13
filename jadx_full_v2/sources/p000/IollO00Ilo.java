            package p000;
            
            public abstract class IollO00Ilo {
                public static final long I00000oIO = I00000oIO(Float.NaN, Float.NaN);
                public static final int I00000oOI = 0;

                public static long I00000oIO(float f, float f2) {
/* 20 */            return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                }

                public static String I00000oOI(long j) {
/* 44 */            return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ")";
                }
            }
