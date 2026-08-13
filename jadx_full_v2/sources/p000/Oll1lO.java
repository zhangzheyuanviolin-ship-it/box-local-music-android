            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oll1lO {
                public static final Oll1lO I00iOIl;
                public static final Oll1lO I00iiI;
                public static final Oll1lO I00iiO;
                public static final Oll1lO[] I00iio;

                static {
/* 6 */             Oll1lO oll1lO = new Oll1lO("StartToEnd", 0);
/* 9 */             I00iOIl = oll1lO;
/* 16 */            Oll1lO oll1lO2 = new Oll1lO("EndToStart", 1);
/* 19 */            I00iiI = oll1lO2;
/* 26 */            Oll1lO oll1lO3 = new Oll1lO("Settled", 2);
/* 29 */            I00iiO = oll1lO3;
/* 31 */            Oll1lO[] oll1lOArr = {oll1lO, oll1lO2, oll1lO3};
/* 35 */            I00iio = oll1lOArr;
/* 37 */            ilIII1o11.I00000oIO(oll1lOArr);
                }

                public static Oll1lO valueOf(String str) {
/* 7 */             return (Oll1lO) Enum.valueOf(Oll1lO.class, str);
                }

                public static Oll1lO[] values() {
/* 7 */             return (Oll1lO[]) I00iio.clone();
                }
            }
