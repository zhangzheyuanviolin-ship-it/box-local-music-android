            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O001OIili {
                public static final O001OIili I00iOIl;
                public static final O001OIili I00iiI;
                public static final O001OIili I00iiO;
                public static final O001OIili I00iio;
                public static final O001OIili[] I00ilI0I1;

                static {
/* 6 */             O001OIili o001OIili = new O001OIili("LookaheadMeasurement", 0);
/* 9 */             I00iOIl = o001OIili;
/* 16 */            O001OIili o001OIili2 = new O001OIili("LookaheadPlacement", 1);
/* 19 */            I00iiI = o001OIili2;
/* 26 */            O001OIili o001OIili3 = new O001OIili("Measurement", 2);
/* 29 */            I00iiO = o001OIili3;
/* 36 */            O001OIili o001OIili4 = new O001OIili("Placement", 3);
/* 39 */            I00iio = o001OIili4;
/* 41 */            O001OIili[] o001OIiliArr = {o001OIili, o001OIili2, o001OIili3, o001OIili4};
/* 45 */            I00ilI0I1 = o001OIiliArr;
/* 47 */            ilIII1o11.I00000oIO(o001OIiliArr);
                }

                public static O001OIili valueOf(String str) {
/* 7 */             return (O001OIili) Enum.valueOf(O001OIili.class, str);
                }

                public static O001OIili[] values() {
/* 7 */             return (O001OIili[]) I00ilI0I1.clone();
                }
            }
