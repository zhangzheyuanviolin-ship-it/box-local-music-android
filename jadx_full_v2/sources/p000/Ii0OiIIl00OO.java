            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii0OiIIl00OO {
                public static final Ii0OiIIl00OO I00iOIl;
                public static final Ii0OiIIl00OO I00iiI;
                public static final Ii0OiIIl00OO I00iiO;
                public static final Ii0OiIIl00OO[] I00iio;

                static {
/* 6 */             Ii0OiIIl00OO ii0OiIIl00OO = new Ii0OiIIl00OO("CROSSED", 0);
/* 9 */             I00iOIl = ii0OiIIl00OO;
/* 16 */            Ii0OiIIl00OO ii0OiIIl00OO2 = new Ii0OiIIl00OO("NOT_CROSSED", 1);
/* 19 */            I00iiI = ii0OiIIl00OO2;
/* 26 */            Ii0OiIIl00OO ii0OiIIl00OO3 = new Ii0OiIIl00OO("COLLAPSED", 2);
/* 29 */            I00iiO = ii0OiIIl00OO3;
/* 31 */            Ii0OiIIl00OO[] ii0OiIIl00OOArr = {ii0OiIIl00OO, ii0OiIIl00OO2, ii0OiIIl00OO3};
/* 35 */            I00iio = ii0OiIIl00OOArr;
/* 37 */            ilIII1o11.I00000oIO(ii0OiIIl00OOArr);
                }

                public static Ii0OiIIl00OO valueOf(String str) {
/* 7 */             return (Ii0OiIIl00OO) Enum.valueOf(Ii0OiIIl00OO.class, str);
                }

                public static Ii0OiIIl00OO[] values() {
/* 7 */             return (Ii0OiIIl00OO[]) I00iio.clone();
                }
            }
