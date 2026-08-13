            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class II0iI101IiO1 {
                public static final II0iI101IiO1 I00iOIl;
                public static final II0iI101IiO1 I00iiI;
                public static final II0iI101IiO1 I00iiO;
                public static final II0iI101IiO1 I00iio;
                public static final II0iI101IiO1[] I00ilI0I1;

                static {
/* 6 */             II0iI101IiO1 iI0iI101IiO1 = new II0iI101IiO1("AVAILABLE", 0);
/* 9 */             I00iOIl = iI0iI101IiO1;
/* 16 */            II0iI101IiO1 iI0iI101IiO12 = new II0iI101IiO1("NO_HARDWARE", 1);
/* 19 */            I00iiI = iI0iI101IiO12;
/* 26 */            II0iI101IiO1 iI0iI101IiO13 = new II0iI101IiO1("UNAVAILABLE", 2);
/* 29 */            I00iiO = iI0iI101IiO13;
/* 36 */            II0iI101IiO1 iI0iI101IiO14 = new II0iI101IiO1("NOT_ENROLLED", 3);
/* 39 */            I00iio = iI0iI101IiO14;
/* 41 */            II0iI101IiO1[] iI0iI101IiO1Arr = {iI0iI101IiO1, iI0iI101IiO12, iI0iI101IiO13, iI0iI101IiO14};
/* 45 */            I00ilI0I1 = iI0iI101IiO1Arr;
/* 47 */            ilIII1o11.I00000oIO(iI0iI101IiO1Arr);
                }

                public static II0iI101IiO1 valueOf(String str) {
/* 7 */             return (II0iI101IiO1) Enum.valueOf(II0iI101IiO1.class, str);
                }

                public static II0iI101IiO1[] values() {
/* 7 */             return (II0iI101IiO1[]) I00ilI0I1.clone();
                }
            }
