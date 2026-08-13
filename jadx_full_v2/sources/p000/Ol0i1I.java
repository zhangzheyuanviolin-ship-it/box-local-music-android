            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol0i1I {
                public long I00000oIO;

                public static final Ol0i1I I00000oIO(long j) {
/* 3 */             Ol0i1I ol0i1I = new Ol0i1I();
/* 6 */             ol0i1I.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ol0i1I;
                }

                public static final boolean I00000oOI(long j, long j2) {
                    return j == j2;
                }

                public static final float I0000Il00O(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static final float I0000O(long j) {
/* 20 */            return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
                }

                public static final float I0000oI00(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public static final boolean I0001Ioi1lo(long j) {
/* 49 */            return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
                }

                public static String I000II(long j) {
                    return j != 9205357640488583168L ? Oi010OO0.I001IO000("Size(", ill1O0010.I00000oIO(Float.intBitsToFloat((int) (j >> 32))), ", ", ill1O0010.I00000oIO(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Size.Unspecified";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ol0i1I) && this.I00000oIO == ((Ol0i1I) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000II(this.I00000oIO);
                }
            }
