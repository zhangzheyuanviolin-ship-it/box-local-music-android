            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OI110lo {
                public static final OI110lo I00iOIl;
                public static final OI110lo I00iiI;
                public static final OI110lo I00iiO;
                public static final OI110lo[] I00iio;

                static {
/* 6 */             OI110lo oI110lo = new OI110lo("Default", 0);
/* 9 */             I00iOIl = oI110lo;
/* 16 */            OI110lo oI110lo2 = new OI110lo("UserInput", 1);
/* 19 */            I00iiI = oI110lo2;
/* 26 */            OI110lo oI110lo3 = new OI110lo("PreventUserInput", 2);
/* 29 */            I00iiO = oI110lo3;
/* 31 */            OI110lo[] oI110loArr = {oI110lo, oI110lo2, oI110lo3};
/* 35 */            I00iio = oI110loArr;
/* 37 */            ilIII1o11.I00000oIO(oI110loArr);
                }

                public static OI110lo valueOf(String str) {
/* 7 */             return (OI110lo) Enum.valueOf(OI110lo.class, str);
                }

                public static OI110lo[] values() {
/* 7 */             return (OI110lo[]) I00iio.clone();
                }
            }
