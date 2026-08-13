            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlO01oiI {
                public static final OlO01oiI I00iOIl;
                public static final OlO01oiI I00iiI;
                public static final OlO01oiI I00iiO;
                public static final OlO01oiI[] I00iio;

                static {
/* 6 */             OlO01oiI olO01oiI = new OlO01oiI("NoRequest", 0);
/* 9 */             I00iOIl = olO01oiI;
/* 16 */            OlO01oiI olO01oiI2 = new OlO01oiI("MatchFound", 1);
/* 19 */            I00iiI = olO01oiI2;
/* 26 */            OlO01oiI olO01oiI3 = new OlO01oiI("VisibleContentAbsentDuringTransition", 2);
/* 29 */            I00iiO = olO01oiI3;
/* 39 */            OlO01oiI[] olO01oiIArr = {olO01oiI, olO01oiI2, olO01oiI3, new OlO01oiI("NoMatchFound", 3)};
/* 43 */            I00iio = olO01oiIArr;
/* 45 */            ilIII1o11.I00000oIO(olO01oiIArr);
                }

                public static OlO01oiI valueOf(String str) {
/* 7 */             return (OlO01oiI) Enum.valueOf(OlO01oiI.class, str);
                }

                public static OlO01oiI[] values() {
/* 7 */             return (OlO01oiI[]) I00iio.clone();
                }
            }
