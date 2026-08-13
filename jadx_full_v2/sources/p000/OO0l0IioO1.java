            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OO0l0IioO1 {
                public static final OO0l0IioO1 I00iOIl;
                public static final OO0l0IioO1 I00iiI;
                public static final OO0l0IioO1 I00iiO;
                public static final OO0l0IioO1[] I00iio;

                static {
/* 6 */             OO0l0IioO1 oO0l0IioO1 = new OO0l0IioO1("DENY", 0);
/* 9 */             I00iOIl = oO0l0IioO1;
/* 16 */            OO0l0IioO1 oO0l0IioO12 = new OO0l0IioO1("ALLOW_ONCE", 1);
/* 19 */            I00iiI = oO0l0IioO12;
/* 26 */            OO0l0IioO1 oO0l0IioO13 = new OO0l0IioO1("ALWAYS_ALLOW", 2);
/* 29 */            I00iiO = oO0l0IioO13;
/* 31 */            OO0l0IioO1[] oO0l0IioO1Arr = {oO0l0IioO1, oO0l0IioO12, oO0l0IioO13};
/* 35 */            I00iio = oO0l0IioO1Arr;
/* 37 */            ilIII1o11.I00000oIO(oO0l0IioO1Arr);
                }

                public static OO0l0IioO1 valueOf(String str) {
/* 7 */             return (OO0l0IioO1) Enum.valueOf(OO0l0IioO1.class, str);
                }

                public static OO0l0IioO1[] values() {
/* 7 */             return (OO0l0IioO1[]) I00iio.clone();
                }
            }
