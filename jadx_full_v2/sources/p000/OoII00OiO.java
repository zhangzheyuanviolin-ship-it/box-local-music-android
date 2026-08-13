            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoII00OiO {
                public static final OoII00OiO I00iOIl;
                public static final OoII00OiO I00iiI;
                public static final OoII00OiO I00iiO;
                public static final OoII00OiO[] I00iio;

                static {
/* 6 */             OoII00OiO ooII00OiO = new OoII00OiO("IDLE", 0);
/* 9 */             I00iOIl = ooII00OiO;
/* 16 */            OoII00OiO ooII00OiO2 = new OoII00OiO("LISTENING", 1);
/* 19 */            I00iiI = ooII00OiO2;
/* 26 */            OoII00OiO ooII00OiO3 = new OoII00OiO("TRANSLATING", 2);
/* 29 */            I00iiO = ooII00OiO3;
/* 31 */            OoII00OiO[] ooII00OiOArr = {ooII00OiO, ooII00OiO2, ooII00OiO3};
/* 35 */            I00iio = ooII00OiOArr;
/* 37 */            ilIII1o11.I00000oIO(ooII00OiOArr);
                }

                public static OoII00OiO valueOf(String str) {
/* 7 */             return (OoII00OiO) Enum.valueOf(OoII00OiO.class, str);
                }

                public static OoII00OiO[] values() {
/* 7 */             return (OoII00OiO[]) I00iio.clone();
                }
            }
