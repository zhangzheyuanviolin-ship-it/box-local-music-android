            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoOIOl {
                public static final OoOIOl I00iOIl;
                public static final OoOIOl I00iiI;
                public static final OoOIOl I00iiO;
                public static final OoOIOl[] I00iio;

                static {
/* 6 */             OoOIOl ooOIOl = new OoOIOl("FLEXIBLE_LOWER", 0);
/* 9 */             I00iOIl = ooOIOl;
/* 16 */            OoOIOl ooOIOl2 = new OoOIOl("FLEXIBLE_UPPER", 1);
/* 19 */            I00iiI = ooOIOl2;
/* 26 */            OoOIOl ooOIOl3 = new OoOIOl("INFLEXIBLE", 2);
/* 29 */            I00iiO = ooOIOl3;
/* 31 */            OoOIOl[] ooOIOlArr = {ooOIOl, ooOIOl2, ooOIOl3};
/* 35 */            I00iio = ooOIOlArr;
/* 37 */            ilIII1o11.I00000oIO(ooOIOlArr);
                }

                public static OoOIOl valueOf(String str) {
/* 7 */             return (OoOIOl) Enum.valueOf(OoOIOl.class, str);
                }

                public static OoOIOl[] values() {
/* 7 */             return (OoOIOl[]) I00iio.clone();
                }
            }
