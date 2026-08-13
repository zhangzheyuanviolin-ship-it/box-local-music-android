            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OllolO0olOOO {
                public static final OllolO0olOOO I00iOIl;
                public static final OllolO0olOOO I00iiI;
                public static final OllolO0olOOO I00iiO;
                public static final OllolO0olOOO[] I00iio;

                static {
/* 6 */             OllolO0olOOO ollolO0olOOO = new OllolO0olOOO("LEFT", 0);
/* 9 */             I00iOIl = ollolO0olOOO;
/* 16 */            OllolO0olOOO ollolO0olOOO2 = new OllolO0olOOO("CENTER", 1);
/* 19 */            I00iiI = ollolO0olOOO2;
/* 26 */            OllolO0olOOO ollolO0olOOO3 = new OllolO0olOOO("RIGHT", 2);
/* 29 */            I00iiO = ollolO0olOOO3;
/* 35 */            I00iio = new OllolO0olOOO[]{ollolO0olOOO, ollolO0olOOO2, ollolO0olOOO3};
                }

                public static OllolO0olOOO valueOf(String str) {
/* 7 */             return (OllolO0olOOO) Enum.valueOf(OllolO0olOOO.class, str);
                }

                public static OllolO0olOOO[] values() {
/* 7 */             return (OllolO0olOOO[]) I00iio.clone();
                }
            }
