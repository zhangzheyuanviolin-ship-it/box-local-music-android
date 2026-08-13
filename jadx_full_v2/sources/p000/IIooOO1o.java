            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIooOO1o {
                public static final IIooOO1o I00iOIl;
                public static final IIooOO1o I00iiI;
                public static final IIooOO1o I00iiO;
                public static final IIooOO1o[] I00iio;

                static {
/* 6 */             IIooOO1o iIooOO1o = new IIooOO1o("PRE_CAPTURE", 0);
/* 9 */             I00iOIl = iIooOO1o;
/* 16 */            IIooOO1o iIooOO1o2 = new IIooOO1o("MAIN_CAPTURE", 1);
/* 19 */            I00iiI = iIooOO1o2;
/* 26 */            IIooOO1o iIooOO1o3 = new IIooOO1o("POST_CAPTURE", 2);
/* 29 */            I00iiO = iIooOO1o3;
/* 31 */            IIooOO1o[] iIooOO1oArr = {iIooOO1o, iIooOO1o2, iIooOO1o3};
/* 35 */            I00iio = iIooOO1oArr;
/* 37 */            ilIII1o11.I00000oIO(iIooOO1oArr);
                }

                public static IIooOO1o valueOf(String str) {
/* 7 */             return (IIooOO1o) Enum.valueOf(IIooOO1o.class, str);
                }

                public static IIooOO1o[] values() {
/* 7 */             return (IIooOO1o[]) I00iio.clone();
                }
            }
