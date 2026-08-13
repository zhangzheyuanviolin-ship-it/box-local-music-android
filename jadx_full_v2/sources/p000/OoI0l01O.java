            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoI0l01O {
                public static final long I00000oOI = lOo0o0.I00000oIO(0.5f, 0.5f);
                public static final int I0000Il00O = 0;
                public long I00000oIO;

                public static final OoI0l01O I00000oIO(long j) {
/* 3 */             OoI0l01O ooI0l01O = new OoI0l01O();
/* 6 */             ooI0l01O.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ooI0l01O;
                }

                public static final boolean I00000oOI(long j, long j2) {
                    return j == j2;
                }

                public static final float I0000Il00O(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public static final float I0000O(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static String I0000oI00(long j) {
/* 5 */             return IlIi0I0.I000l1(j, "TransformOrigin(packedValue=", ")");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OoI0l01O) && this.I00000oIO == ((OoI0l01O) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000oI00(this.I00000oIO);
                }
            }
