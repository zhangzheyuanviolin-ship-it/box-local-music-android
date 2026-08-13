            package p000;
            
            public final class Iil1I1il0I1 {
                public long I00000oIO;

                public static final float I00000oIO(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public static final float I00000oOI(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static String I0000Il00O(long j) {
                    return j != 9205357640488583168L ? Oi010OO0.I001IO000("(", Iil1010O.I0000O(I00000oIO(j)), ", ", Iil1010O.I0000O(I00000oOI(j)), ")") : "DpOffset.Unspecified";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iil1I1il0I1) && this.I00000oIO == ((Iil1I1il0I1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000Il00O(this.I00000oIO);
                }
            }
