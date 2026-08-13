            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlIIlOlOilio {
                public static final OlIIlOlOilio I00iOIl;
                public static final OlIIlOlOilio I00iiI;
                public static final OlIIlOlOilio I00iiO;
                public static final OlIIlOlOilio[] I00iio;

                static {
/* 6 */             OlIIlOlOilio olIIlOlOilio = new OlIIlOlOilio("ONE_COLLECTION_PARAMETER", 0);
/* 9 */             I00iOIl = olIIlOlOilio;
/* 16 */            OlIIlOlOilio olIIlOlOilio2 = new OlIIlOlOilio("OBJECT_PARAMETER_NON_GENERIC", 1);
/* 19 */            I00iiI = olIIlOlOilio2;
/* 26 */            OlIIlOlOilio olIIlOlOilio3 = new OlIIlOlOilio("OBJECT_PARAMETER_GENERIC", 2);
/* 29 */            I00iiO = olIIlOlOilio3;
/* 31 */            OlIIlOlOilio[] olIIlOlOilioArr = {olIIlOlOilio, olIIlOlOilio2, olIIlOlOilio3};
/* 35 */            I00iio = olIIlOlOilioArr;
/* 37 */            ilIII1o11.I00000oIO(olIIlOlOilioArr);
                }

                public static OlIIlOlOilio valueOf(String str) {
/* 7 */             return (OlIIlOlOilio) Enum.valueOf(OlIIlOlOilio.class, str);
                }

                public static OlIIlOlOilio[] values() {
/* 7 */             return (OlIIlOlOilio[]) I00iio.clone();
                }
            }
