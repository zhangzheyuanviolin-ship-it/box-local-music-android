            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ool1iI0OiI {
                public static final Ool1iI0OiI I00iOIl;
                public static final Ool1iI0OiI I00iiI;
                public static final Ool1iI0OiI I00iiO;
                public static final Ool1iI0OiI[] I00iio;
                public static final Il0li01oOil I00ilI0I1;

                static {
/* 6 */             Ool1iI0OiI ool1iI0OiI = new Ool1iI0OiI("SESSION_CONFIG", 0);
/* 9 */             I00iOIl = ool1iI0OiI;
/* 16 */            Ool1iI0OiI ool1iI0OiI2 = new Ool1iI0OiI("DEFAULT", 1);
/* 19 */            I00iiI = ool1iI0OiI2;
/* 26 */            Ool1iI0OiI ool1iI0OiI3 = new Ool1iI0OiI("CAMERA2_CAMERA_CONTROL", 2);
/* 29 */            I00iiO = ool1iI0OiI3;
/* 31 */            Ool1iI0OiI[] ool1iI0OiIArr = {ool1iI0OiI, ool1iI0OiI2, ool1iI0OiI3};
/* 35 */            I00iio = ool1iI0OiIArr;
/* 41 */            I00ilI0I1 = ilIII1o11.I00000oIO(ool1iI0OiIArr);
                }

                public static Ool1iI0OiI valueOf(String str) {
/* 7 */             return (Ool1iI0OiI) Enum.valueOf(Ool1iI0OiI.class, str);
                }

                public static Ool1iI0OiI[] values() {
/* 7 */             return (Ool1iI0OiI[]) I00iio.clone();
                }
            }
