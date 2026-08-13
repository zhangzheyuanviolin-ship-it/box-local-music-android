            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0iiOi {
                public static final O0iiOi I00iOIl;
                public static final O0iiOi I00iiI;
                public static final O0iiOi I00iiO;
                public static final O0iiOi[] I00iio;

                static {
/* 6 */             O0iiOi o0iiOi = new O0iiOi("InMeasureBlock", 0);
/* 9 */             I00iOIl = o0iiOi;
/* 16 */            O0iiOi o0iiOi2 = new O0iiOi("InLayoutBlock", 1);
/* 19 */            I00iiI = o0iiOi2;
/* 26 */            O0iiOi o0iiOi3 = new O0iiOi("NotUsed", 2);
/* 29 */            I00iiO = o0iiOi3;
/* 31 */            O0iiOi[] o0iiOiArr = {o0iiOi, o0iiOi2, o0iiOi3};
/* 35 */            I00iio = o0iiOiArr;
/* 37 */            ilIII1o11.I00000oIO(o0iiOiArr);
                }

                public static O0iiOi valueOf(String str) {
/* 7 */             return (O0iiOi) Enum.valueOf(O0iiOi.class, str);
                }

                public static O0iiOi[] values() {
/* 7 */             return (O0iiOi[]) I00iio.clone();
                }
            }
