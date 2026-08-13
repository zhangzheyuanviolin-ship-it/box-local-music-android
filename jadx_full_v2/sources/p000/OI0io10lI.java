            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OI0io10lI {
                public static final OI0io10lI I00iOIl;
                public static final OI0io10lI I00iiI;
                public static final OI0io10lI[] I00iiO;

                static {
/* 6 */             OI0io10lI oI0io10lI = new OI0io10lI("READ_ONLY", 0);
/* 9 */             I00iOIl = oI0io10lI;
/* 16 */            OI0io10lI oI0io10lI2 = new OI0io10lI("MUTABLE", 1);
/* 19 */            I00iiI = oI0io10lI2;
/* 21 */            OI0io10lI[] oI0io10lIArr = {oI0io10lI, oI0io10lI2};
/* 25 */            I00iiO = oI0io10lIArr;
/* 27 */            ilIII1o11.I00000oIO(oI0io10lIArr);
                }

                public static OI0io10lI valueOf(String str) {
/* 7 */             return (OI0io10lI) Enum.valueOf(OI0io10lI.class, str);
                }

                public static OI0io10lI[] values() {
/* 7 */             return (OI0io10lI[]) I00iiO.clone();
                }
            }
