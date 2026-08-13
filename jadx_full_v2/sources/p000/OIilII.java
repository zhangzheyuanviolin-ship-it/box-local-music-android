            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIilII {
                public static final OIilII I00iOIl;
                public static final OIilII I00iiI;
                public static final OIilII[] I00iiO;

                static {
/* 6 */             OIilII oIilII = new OIilII("Vertical", 0);
/* 9 */             I00iOIl = oIilII;
/* 16 */            OIilII oIilII2 = new OIilII("Horizontal", 1);
/* 19 */            I00iiI = oIilII2;
/* 21 */            OIilII[] oIilIIArr = {oIilII, oIilII2};
/* 25 */            I00iiO = oIilIIArr;
/* 27 */            ilIII1o11.I00000oIO(oIilIIArr);
                }

                public static OIilII valueOf(String str) {
/* 7 */             return (OIilII) Enum.valueOf(OIilII.class, str);
                }

                public static OIilII[] values() {
/* 7 */             return (OIilII[]) I00iiO.clone();
                }
            }
