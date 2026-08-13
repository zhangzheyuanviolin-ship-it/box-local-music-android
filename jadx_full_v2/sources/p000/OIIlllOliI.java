            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIIlllOliI {
                public static final OIIlllOliI I00iOIl;
                public static final OIIlllOliI I00iiI;
                public static final OIIlllOliI[] I00iiO;

                static {
/* 6 */             OIIlllOliI oIIlllOliI = new OIIlllOliI("Width", 0);
/* 9 */             I00iOIl = oIIlllOliI;
/* 16 */            OIIlllOliI oIIlllOliI2 = new OIIlllOliI("Height", 1);
/* 19 */            I00iiI = oIIlllOliI2;
/* 21 */            OIIlllOliI[] oIIlllOliIArr = {oIIlllOliI, oIIlllOliI2};
/* 25 */            I00iiO = oIIlllOliIArr;
/* 27 */            ilIII1o11.I00000oIO(oIIlllOliIArr);
                }

                public static OIIlllOliI valueOf(String str) {
/* 7 */             return (OIIlllOliI) Enum.valueOf(OIIlllOliI.class, str);
                }

                public static OIIlllOliI[] values() {
/* 7 */             return (OIIlllOliI[]) I00iiO.clone();
                }
            }
