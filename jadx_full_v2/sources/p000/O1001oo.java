            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1001oo {
                public static final O1001oo I00iOIl;
                public static final O1001oo I00iiI;
                public static final O1001oo I00iiO;
                public static final O1001oo[] I00iio;

                static {
/* 6 */             O1001oo o1001oo = new O1001oo("URL", 0);
/* 9 */             I00iOIl = o1001oo;
/* 16 */            O1001oo o1001oo2 = new O1001oo("EMAIL", 1);
/* 19 */            I00iiI = o1001oo2;
/* 26 */            O1001oo o1001oo3 = new O1001oo("WWW", 2);
/* 29 */            I00iiO = o1001oo3;
/* 35 */            I00iio = new O1001oo[]{o1001oo, o1001oo2, o1001oo3};
                }

                public static O1001oo valueOf(String str) {
/* 7 */             return (O1001oo) Enum.valueOf(O1001oo.class, str);
                }

                public static O1001oo[] values() {
/* 7 */             return (O1001oo[]) I00iio.clone();
                }
            }
