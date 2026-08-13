            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIOlIiiioi {
                public long I00000oIO;

                public static final OIOlIiiioi I00000oIO(long j) {
/* 3 */             OIOlIiiioi oIOlIiiioi = new OIOlIiiioi();
/* 6 */             oIOlIiiioi.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oIOlIiiioi;
                }

                public static long I00000oOI(long j, float f, int i) {
/* 15 */            float fIntBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
/* 23 */            if ((i & 2) != 0) {
/* 27 */                f = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
/* 43 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                }

                public static final long I0000Il00O(float f, long j) {
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
/* 22 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
/* 36 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public static final boolean I0000O(long j, long j2) {
                    return j == j2;
                }

                public static final float I0000oI00(long j) {
/* 6 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 17 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 29 */            return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
                }

                public static final long I0001Ioi1lo(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
/* 36 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
/* 51 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }

                public static final long I000II(long j, long j2) {
/* 17 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
/* 36 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
/* 49 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public static final long I000O01llI0(float f, long j) {
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
/* 22 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
/* 36 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public static String I000OOo1O(long j) {
                    return (9223372034707292159L & j) != 9205357640488583168L ? Oi010OO0.I001IO000("Offset(", ill1O0010.I00000oIO(Float.intBitsToFloat((int) (j >> 32))), ", ", ill1O0010.I00000oIO(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Offset.Unspecified";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIOlIiiioi) && this.I00000oIO == ((OIOlIiiioi) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000OOo1O(this.I00000oIO);
                }
            }
