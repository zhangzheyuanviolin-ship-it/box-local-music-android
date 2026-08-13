            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iii1I01II {
                public static final Iii1I01II I00iOIl;
                public static final Iii1I01II I00iiI;
                public static final Iii1I01II I00iiO;
                public static final Iii1I01II[] I00iio;

                static {
/* 6 */             Iii1I01II iii1I01II = new Iii1I01II("BEFORE", 0);
/* 9 */             I00iOIl = iii1I01II;
/* 16 */            Iii1I01II iii1I01II2 = new Iii1I01II("ON", 1);
/* 19 */            I00iiI = iii1I01II2;
/* 26 */            Iii1I01II iii1I01II3 = new Iii1I01II("AFTER", 2);
/* 29 */            I00iiO = iii1I01II3;
/* 31 */            Iii1I01II[] iii1I01IIArr = {iii1I01II, iii1I01II2, iii1I01II3};
/* 35 */            I00iio = iii1I01IIArr;
/* 37 */            ilIII1o11.I00000oIO(iii1I01IIArr);
                }

                public static Iii1I01II valueOf(String str) {
/* 7 */             return (Iii1I01II) Enum.valueOf(Iii1I01II.class, str);
                }

                public static Iii1I01II[] values() {
/* 7 */             return (Iii1I01II[]) I00iio.clone();
                }
            }
