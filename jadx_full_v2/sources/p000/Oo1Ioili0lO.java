            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oo1Ioili0lO {
                public static final Oo1Ioili0lO I00iOIl;
                public static final Oo1Ioili0lO I00iiI;
                public static final Oo1Ioili0lO I00iiO;
                public static final Oo1Ioili0lO[] I00iio;

                static {
/* 6 */             Oo1Ioili0lO oo1Ioili0lO = new Oo1Ioili0lO("FAILED", 0);
/* 9 */             I00iOIl = oo1Ioili0lO;
/* 16 */            Oo1Ioili0lO oo1Ioili0lO2 = new Oo1Ioili0lO("SUCCEEDED", 1);
/* 19 */            I00iiI = oo1Ioili0lO2;
/* 26 */            Oo1Ioili0lO oo1Ioili0lO3 = new Oo1Ioili0lO("USER_CANCELLED", 2);
/* 29 */            I00iiO = oo1Ioili0lO3;
/* 31 */            Oo1Ioili0lO[] oo1Ioili0lOArr = {oo1Ioili0lO, oo1Ioili0lO2, oo1Ioili0lO3};
/* 35 */            I00iio = oo1Ioili0lOArr;
/* 37 */            ilIII1o11.I00000oIO(oo1Ioili0lOArr);
                }

                public static Oo1Ioili0lO valueOf(String str) {
/* 7 */             return (Oo1Ioili0lO) Enum.valueOf(Oo1Ioili0lO.class, str);
                }

                public static Oo1Ioili0lO[] values() {
/* 7 */             return (Oo1Ioili0lO[]) I00iio.clone();
                }
            }
