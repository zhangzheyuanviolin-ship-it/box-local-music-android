            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iol1Ooli {
                public static final Iol1Ooli I00iOIl;
                public static final Iol1Ooli I00iiI;
                public static final Iol1Ooli I00iiO;
                public static final Iol1Ooli[] I00iio;

                static {
/* 6 */             Iol1Ooli iol1Ooli = new Iol1Ooli("Yes", 0);
/* 9 */             I00iOIl = iol1Ooli;
/* 16 */            Iol1Ooli iol1Ooli2 = new Iol1Ooli("No", 1);
/* 19 */            I00iiI = iol1Ooli2;
/* 26 */            Iol1Ooli iol1Ooli3 = new Iol1Ooli("NotInitialized", 2);
/* 29 */            I00iiO = iol1Ooli3;
/* 31 */            Iol1Ooli[] iol1OoliArr = {iol1Ooli, iol1Ooli2, iol1Ooli3};
/* 35 */            I00iio = iol1OoliArr;
/* 37 */            ilIII1o11.I00000oIO(iol1OoliArr);
                }

                public static Iol1Ooli valueOf(String str) {
/* 7 */             return (Iol1Ooli) Enum.valueOf(Iol1Ooli.class, str);
                }

                public static Iol1Ooli[] values() {
/* 7 */             return (Iol1Ooli[]) I00iio.clone();
                }
            }
