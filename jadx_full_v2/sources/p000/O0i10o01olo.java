            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0i10o01olo {
                public static final O0i10o01olo I00iOIl;
                public static final O0i10o01olo I00iiI;
                public static final O0i10o01olo I00iiO;
                public static final O0i10o01olo[] I00iio;

                static {
/* 6 */             O0i10o01olo o0i10o01olo = new O0i10o01olo("WARNING", 0);
/* 9 */             I00iOIl = o0i10o01olo;
/* 16 */            O0i10o01olo o0i10o01olo2 = new O0i10o01olo("ERROR", 1);
/* 19 */            I00iiI = o0i10o01olo2;
/* 26 */            O0i10o01olo o0i10o01olo3 = new O0i10o01olo("HIDDEN", 2);
/* 29 */            I00iiO = o0i10o01olo3;
/* 31 */            O0i10o01olo[] o0i10o01oloArr = {o0i10o01olo, o0i10o01olo2, o0i10o01olo3};
/* 35 */            I00iio = o0i10o01oloArr;
/* 37 */            ilIII1o11.I00000oIO(o0i10o01oloArr);
                }

                public static O0i10o01olo valueOf(String str) {
/* 7 */             return (O0i10o01olo) Enum.valueOf(O0i10o01olo.class, str);
                }

                public static O0i10o01olo[] values() {
/* 7 */             return (O0i10o01olo[]) I00iio.clone();
                }
            }
