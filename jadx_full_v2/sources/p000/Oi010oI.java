            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oi010oI {
                public static final Oi010oI I00iOIl;
                public static final Oi010oI I00iiI;
                public static final Oi010oI[] I00iiO;

                static {
/* 6 */             Oi010oI oi010oI = new Oi010oI("Restart", 0);
/* 9 */             I00iOIl = oi010oI;
/* 16 */            Oi010oI oi010oI2 = new Oi010oI("Reverse", 1);
/* 19 */            I00iiI = oi010oI2;
/* 21 */            Oi010oI[] oi010oIArr = {oi010oI, oi010oI2};
/* 25 */            I00iiO = oi010oIArr;
/* 27 */            ilIII1o11.I00000oIO(oi010oIArr);
                }

                public static Oi010oI valueOf(String str) {
/* 7 */             return (Oi010oI) Enum.valueOf(Oi010oI.class, str);
                }

                public static Oi010oI[] values() {
/* 7 */             return (Oi010oI[]) I00iiO.clone();
                }
            }
