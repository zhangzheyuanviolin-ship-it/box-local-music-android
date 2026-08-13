            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OooIOilolOo {
                public long I00000oIO;

                public static final OooIOilolOo I00000oIO(long j) {
/* 3 */             OooIOilolOo oooIOilolOo = new OooIOilolOo();
/* 6 */             oooIOilolOo.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oooIOilolOo;
                }

                public static long I00000oOI(long j, float f, float f2, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 10 */                f = Float.intBitsToFloat((int) (j >> 32));
                    }
/* 21 */            if ((i & 2) != 0) {
/* 25 */                f2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
/* 41 */            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                }

                public static final float I0000Il00O(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public static final float I0000O(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static final long I0000oI00(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
/* 36 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
/* 51 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }

                public static final long I0001Ioi1lo(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
/* 36 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
/* 49 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public static final long I000II(float f, long j) {
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
/* 22 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
/* 36 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public static String I000O01llI0(long j) {
/* 32 */            return "(" + I0000Il00O(j) + ", " + I0000O(j) + ") px/sec";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OooIOilolOo) && this.I00000oIO == ((OooIOilolOo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000O01llI0(this.I00000oIO);
                }
            }
