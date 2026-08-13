            package p000;
            
            public final class Iil1iI01I0O0 {
                public long I00000oIO;

                public static final float I00000oIO(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static final float I00000oOI(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iil1iI01I0O0) && this.I00000oIO == ((Iil1iI01I0O0) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             long j = this.I00000oIO;
                    return j != 9205357640488583168L ? IlIi0I0.I000lI(Iil1010O.I0000O(I00000oOI(j)), " x ", Iil1010O.I0000O(I00000oIO(j))) : "DpSize.Unspecified";
                }
            }
