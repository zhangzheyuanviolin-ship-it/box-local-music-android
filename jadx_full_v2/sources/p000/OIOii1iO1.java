            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIOii1iO1 {
                public static final OIOii1iO1 I00iOIl;
                public static final OIOii1iO1 I00iiI;
                public static final OIOii1iO1 I00iiO;
                public static final OIOii1iO1[] I00iio;

                static {
/* 6 */             OIOii1iO1 oIOii1iO1 = new OIOii1iO1("NO_OP", 0);
/* 9 */             I00iOIl = oIOii1iO1;
/* 16 */            OIOii1iO1 oIOii1iO12 = new OIOii1iO1("ADD", 1);
/* 19 */            I00iiI = oIOii1iO12;
/* 26 */            OIOii1iO1 oIOii1iO13 = new OIOii1iO1("REMOVE", 2);
/* 29 */            I00iiO = oIOii1iO13;
/* 31 */            OIOii1iO1[] oIOii1iO1Arr = {oIOii1iO1, oIOii1iO12, oIOii1iO13};
/* 35 */            I00iio = oIOii1iO1Arr;
/* 37 */            ilIII1o11.I00000oIO(oIOii1iO1Arr);
                }

                public static OIOii1iO1 valueOf(String str) {
/* 7 */             return (OIOii1iO1) Enum.valueOf(OIOii1iO1.class, str);
                }

                public static OIOii1iO1[] values() {
/* 7 */             return (OIOii1iO1[]) I00iio.clone();
                }
            }
