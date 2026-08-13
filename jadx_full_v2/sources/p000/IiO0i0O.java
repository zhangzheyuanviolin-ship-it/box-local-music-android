            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IiO0i0O {
                public static final IiO0i0O I00iiI;
                public static final IiO0i0O I00iiO;
                public static final IiO0i0O I00iio;
                public static final IiO0i0O I00ilI0I1;
                public static final IiO0i0O[] I00ilO0;
                public final String I00iOIl;

                static {
/* 8 */             IiO0i0O iiO0i0O = new IiO0i0O("VERY_CLOSE", 0, "very close");
/* 11 */            I00iiI = iiO0i0O;
/* 20 */            IiO0i0O iiO0i0O2 = new IiO0i0O("CLOSE", 1, "close");
/* 23 */            I00iiO = iiO0i0O2;
/* 32 */            IiO0i0O iiO0i0O3 = new IiO0i0O("FAR", 2, "far");
/* 35 */            I00iio = iiO0i0O3;
/* 44 */            IiO0i0O iiO0i0O4 = new IiO0i0O("UNKNOWN", 3, "");
/* 47 */            I00ilI0I1 = iiO0i0O4;
/* 49 */            IiO0i0O[] iiO0i0OArr = {iiO0i0O, iiO0i0O2, iiO0i0O3, iiO0i0O4};
/* 53 */            I00ilO0 = iiO0i0OArr;
/* 55 */            ilIII1o11.I00000oIO(iiO0i0OArr);
                }

                public IiO0i0O(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static IiO0i0O valueOf(String str) {
/* 7 */             return (IiO0i0O) Enum.valueOf(IiO0i0O.class, str);
                }

                public static IiO0i0O[] values() {
/* 7 */             return (IiO0i0O[]) I00ilO0.clone();
                }
            }
