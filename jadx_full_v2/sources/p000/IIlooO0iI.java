            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIlooO0iI {
                public static final IIlooO0iI I00iOIl;
                public static final IIlooO0iI I00iiI;
                public static final IIlooO0iI I00iiO;
                public static final IIlooO0iI[] I00iio;

                static {
/* 6 */             IIlooO0iI iIlooO0iI = new IIlooO0iI("CAMERA", 0);
/* 9 */             I00iOIl = iIlooO0iI;
/* 16 */            IIlooO0iI iIlooO0iI2 = new IIlooO0iI("SCOPE", 1);
/* 19 */            I00iiI = iIlooO0iI2;
/* 26 */            IIlooO0iI iIlooO0iI3 = new IIlooO0iI("THREAD", 2);
/* 29 */            I00iiO = iIlooO0iI3;
/* 31 */            IIlooO0iI[] iIlooO0iIArr = {iIlooO0iI, iIlooO0iI2, iIlooO0iI3};
/* 35 */            I00iio = iIlooO0iIArr;
/* 37 */            ilIII1o11.I00000oIO(iIlooO0iIArr);
                }

                public static IIlooO0iI valueOf(String str) {
/* 7 */             return (IIlooO0iI) Enum.valueOf(IIlooO0iI.class, str);
                }

                public static IIlooO0iI[] values() {
/* 7 */             return (IIlooO0iI[]) I00iio.clone();
                }
            }
