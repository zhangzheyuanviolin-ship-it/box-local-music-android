            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OiOII0OOOi {
                public static final OiOII0OOOi I00iOIl;
                public static final OiOII0OOOi I00iiI;
                public static final OiOII0OOOi I00iiO;
                public static final OiOII0OOOi[] I00iio;

                static {
/* 6 */             OiOII0OOOi oiOII0OOOi = new OiOII0OOOi("NETWORK_UNMETERED", 0);
/* 9 */             I00iOIl = oiOII0OOOi;
/* 16 */            OiOII0OOOi oiOII0OOOi2 = new OiOII0OOOi("DEVICE_IDLE", 1);
/* 19 */            I00iiI = oiOII0OOOi2;
/* 26 */            OiOII0OOOi oiOII0OOOi3 = new OiOII0OOOi("DEVICE_CHARGING", 2);
/* 29 */            I00iiO = oiOII0OOOi3;
/* 35 */            I00iio = new OiOII0OOOi[]{oiOII0OOOi, oiOII0OOOi2, oiOII0OOOi3};
                }

                public static OiOII0OOOi valueOf(String str) {
/* 7 */             return (OiOII0OOOi) Enum.valueOf(OiOII0OOOi.class, str);
                }

                public static OiOII0OOOi[] values() {
/* 7 */             return (OiOII0OOOi[]) I00iio.clone();
                }
            }
