            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIOOOO {
                public static final OIOOOO I00iOIl;
                public static final OIOOOO I00iiI;
                public static final OIOOOO I00iiO;
                public static final OIOOOO[] I00iio;

                static {
/* 6 */             OIOOOO oioooo = new OIOOOO("FORCE_FLEXIBILITY", 0);
/* 9 */             I00iOIl = oioooo;
/* 16 */            OIOOOO oioooo2 = new OIOOOO("NULLABLE", 1);
/* 19 */            I00iiI = oioooo2;
/* 26 */            OIOOOO oioooo3 = new OIOOOO("NOT_NULL", 2);
/* 29 */            I00iiO = oioooo3;
/* 31 */            OIOOOO[] oiooooArr = {oioooo, oioooo2, oioooo3};
/* 35 */            I00iio = oiooooArr;
/* 37 */            ilIII1o11.I00000oIO(oiooooArr);
                }

                public static OIOOOO valueOf(String str) {
/* 7 */             return (OIOOOO) Enum.valueOf(OIOOOO.class, str);
                }

                public static OIOOOO[] values() {
/* 7 */             return (OIOOOO[]) I00iio.clone();
                }
            }
