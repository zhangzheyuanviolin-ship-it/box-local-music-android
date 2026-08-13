            package p000;
            
            public abstract class l000O1l {
                public static final long I00000oIO(long j) {
/* 34 */            return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
                }

                public static final long I00000oOI(long j) {
/* 28 */            return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                }
            }
