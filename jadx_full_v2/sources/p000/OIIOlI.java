            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIIOlI {
                public static final OIIOlI I00iOIl;
                public static final OIIOlI I00iiI;
                public static final OIIOlI I00iiO;
                public static final OIIOlI I00iio;
                public static final OIIOlI I00ilI0I1;
                public static final OIIOlI I00ilO0;
                public static final OIIOlI[] I00io1l;

                static {
/* 6 */             OIIOlI oIIOlI = new OIIOlI("NOT_REQUIRED", 0);
/* 9 */             I00iOIl = oIIOlI;
/* 16 */            OIIOlI oIIOlI2 = new OIIOlI("CONNECTED", 1);
/* 19 */            I00iiI = oIIOlI2;
/* 26 */            OIIOlI oIIOlI3 = new OIIOlI("UNMETERED", 2);
/* 29 */            I00iiO = oIIOlI3;
/* 36 */            OIIOlI oIIOlI4 = new OIIOlI("NOT_ROAMING", 3);
/* 39 */            I00iio = oIIOlI4;
/* 46 */            OIIOlI oIIOlI5 = new OIIOlI("METERED", 4);
/* 49 */            I00ilI0I1 = oIIOlI5;
/* 56 */            OIIOlI oIIOlI6 = new OIIOlI("TEMPORARILY_UNMETERED", 5);
/* 59 */            I00ilO0 = oIIOlI6;
/* 61 */            OIIOlI[] oIIOlIArr = {oIIOlI, oIIOlI2, oIIOlI3, oIIOlI4, oIIOlI5, oIIOlI6};
/* 65 */            I00io1l = oIIOlIArr;
/* 67 */            ilIII1o11.I00000oIO(oIIOlIArr);
                }

                public static OIIOlI valueOf(String str) {
/* 7 */             return (OIIOlI) Enum.valueOf(OIIOlI.class, str);
                }

                public static OIIOlI[] values() {
/* 7 */             return (OIIOlI[]) I00io1l.clone();
                }
            }
