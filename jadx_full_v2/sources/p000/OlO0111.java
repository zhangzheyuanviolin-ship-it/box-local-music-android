            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlO0111 {
                public static final OlO0111 I00iOIl;
                public static final OlO0111 I00iiI;
                public static final OlO0111 I00iiO;
                public static final OlO0111[] I00iio;

                static {
/* 6 */             OlO0111 olO0111 = new OlO0111("BEGINNING", 0);
/* 9 */             I00iOIl = olO0111;
/* 16 */            OlO0111 olO01112 = new OlO0111("MIDDLE", 1);
/* 19 */            I00iiI = olO01112;
/* 26 */            OlO0111 olO01113 = new OlO0111("AFTER_DOT", 2);
/* 29 */            I00iiO = olO01113;
/* 31 */            OlO0111[] olO0111Arr = {olO0111, olO01112, olO01113};
/* 35 */            I00iio = olO0111Arr;
/* 37 */            ilIII1o11.I00000oIO(olO0111Arr);
                }

                public static OlO0111 valueOf(String str) {
/* 7 */             return (OlO0111) Enum.valueOf(OlO0111.class, str);
                }

                public static OlO0111[] values() {
/* 7 */             return (OlO0111[]) I00iio.clone();
                }
            }
