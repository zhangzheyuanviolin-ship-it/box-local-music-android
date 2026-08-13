            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IO1loo {
                public static final IO1loo I00iOIl;
                public static final IO1loo I00iiI;
                public static final IO1loo I00iiO;
                public static final IO1loo[] I00iio;

                static {
/* 6 */             IO1loo iO1loo = new IO1loo("USER", 0);
/* 9 */             I00iOIl = iO1loo;
/* 16 */            IO1loo iO1loo2 = new IO1loo("AGENT", 1);
/* 19 */            I00iiI = iO1loo2;
/* 26 */            IO1loo iO1loo3 = new IO1loo("SYSTEM", 2);
/* 29 */            I00iiO = iO1loo3;
/* 31 */            IO1loo[] iO1looArr = {iO1loo, iO1loo2, iO1loo3};
/* 35 */            I00iio = iO1looArr;
/* 37 */            ilIII1o11.I00000oIO(iO1looArr);
                }

                public static IO1loo valueOf(String str) {
/* 7 */             return (IO1loo) Enum.valueOf(IO1loo.class, str);
                }

                public static IO1loo[] values() {
/* 7 */             return (IO1loo[]) I00iio.clone();
                }
            }
