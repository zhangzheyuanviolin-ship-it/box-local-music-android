            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OO1o11 {
                public static final OO1o11 I00iOIl;
                public static final OO1o11 I00iiI;
                public static final OO1o11 I00iiO;
                public static final OO1o11[] I00iio;

                static {
/* 6 */             OO1o11 oO1o11 = new OO1o11("EXACT", 0);
/* 9 */             I00iOIl = oO1o11;
/* 16 */            OO1o11 oO1o112 = new OO1o11("INEXACT", 1);
/* 19 */            I00iiI = oO1o112;
/* 26 */            OO1o11 oO1o113 = new OO1o11("AUTOMATIC", 2);
/* 29 */            I00iiO = oO1o113;
/* 31 */            OO1o11[] oO1o11Arr = {oO1o11, oO1o112, oO1o113};
/* 35 */            I00iio = oO1o11Arr;
/* 37 */            ilIII1o11.I00000oIO(oO1o11Arr);
                }

                public static OO1o11 valueOf(String str) {
/* 7 */             return (OO1o11) Enum.valueOf(OO1o11.class, str);
                }

                public static OO1o11[] values() {
/* 7 */             return (OO1o11[]) I00iio.clone();
                }
            }
