            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iil1010O implements Comparable {
                public float I00iOIl;

                public static final Iil1010O I00000oIO(float f) {
/* 3 */             Iil1010O iil1010O = new Iil1010O();
/* 6 */             iil1010O.I00iOIl = f;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iil1010O;
                }

                public static int I00000oOI(float f, float f2) {
/* 5 */             if (Float.isNaN(f) || Float.isNaN(f2)) {
/* 19 */                return 0;
                    }
/* 14 */            return Float.compare(f, f2);
                }

                public static final boolean I0000Il00O(float f, float f2) {
                    return Float.compare(f, f2) == 0;
                }

                public static String I0000O(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 return "Dp.Unspecified";
                    }
/* 23 */            return f + ".dp";
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return I00000oOI(this.I00iOIl, ((Iil1010O) obj).I00iOIl);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iil1010O) && Float.compare(this.I00iOIl, ((Iil1010O) obj).I00iOIl) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 3 */             return I0000O(this.I00iOIl);
                }
            }
