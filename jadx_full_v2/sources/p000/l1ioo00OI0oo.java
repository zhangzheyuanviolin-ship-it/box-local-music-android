            package p000;
            
            public abstract class l1ioo00OI0oo {
                public static final long I00000oIO(float f, float f2) {
/* 20 */            return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                }

                public static final long I00000oOI(float f, long j, long j2) {
/* 17 */            float fI00000oOI = l1I1Il.I00000oOI(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
/* 39 */            float fI00000oOI2 = l1I1Il.I00000oOI(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
/* 57 */            return (Float.floatToRawIntBits(fI00000oOI) << 32) | (Float.floatToRawIntBits(fI00000oOI2) & 4294967295L);
                }
            }
