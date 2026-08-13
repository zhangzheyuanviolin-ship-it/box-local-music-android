            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IooOl0ol01 {
                public long I00000oIO;

                public static final IooOl0ol01 I00000oIO(long j) {
/* 3 */             IooOl0ol01 iooOl0ol01 = new IooOl0ol01();
/* 6 */             iooOl0ol01.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iooOl0ol01;
                }

                public static boolean I00000oOI(long j, Object obj) {
                    return (obj instanceof IooOl0ol01) && j == ((IooOl0ol01) obj).I00000oIO;
                }

                public static final boolean I0000Il00O(long j, long j2) {
                    return j == j2;
                }

                public static String I0000O(long j) {
/* 29 */            return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
                }

                public final boolean equals(Object obj) {
/* 3 */             return I00000oOI(this.I00000oIO, obj);
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000O(this.I00000oIO);
                }
            }
