            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOIio1010OoO {
                public static final OOIio1010OoO I00iOIl;
                public static final OOIio1010OoO I00iiI;
                public static final OOIio1010OoO I00iiO;
                public static final OOIio1010OoO[] I00iio;

                static {
/* 6 */             OOIio1010OoO oOIio1010OoO = new OOIio1010OoO("DEFAULT", 0);
/* 9 */             I00iOIl = oOIio1010OoO;
/* 16 */            OOIio1010OoO oOIio1010OoO2 = new OOIio1010OoO("VERY_LOW", 1);
/* 19 */            I00iiI = oOIio1010OoO2;
/* 26 */            OOIio1010OoO oOIio1010OoO3 = new OOIio1010OoO("HIGHEST", 2);
/* 29 */            I00iiO = oOIio1010OoO3;
/* 35 */            I00iio = new OOIio1010OoO[]{oOIio1010OoO, oOIio1010OoO2, oOIio1010OoO3};
                }

                public static OOIio1010OoO valueOf(String str) {
/* 7 */             return (OOIio1010OoO) Enum.valueOf(OOIio1010OoO.class, str);
                }

                public static OOIio1010OoO[] values() {
/* 7 */             return (OOIio1010OoO[]) I00iio.clone();
                }
            }
