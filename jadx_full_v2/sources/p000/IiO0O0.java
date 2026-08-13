            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IiO0O0 {
                public static final IiO0O0 I00iOIl;
                public static final IiO0O0 I00iiI;
                public static final IiO0O0 I00iiO;
                public static final IiO0O0[] I00iio;

                static {
/* 6 */             IiO0O0 iiO0O0 = new IiO0O0("WARNING", 0);
/* 9 */             I00iOIl = iiO0O0;
/* 16 */            IiO0O0 iiO0O02 = new IiO0O0("ERROR", 1);
/* 19 */            I00iiI = iiO0O02;
/* 26 */            IiO0O0 iiO0O03 = new IiO0O0("HIDDEN", 2);
/* 29 */            I00iiO = iiO0O03;
/* 31 */            IiO0O0[] iiO0O0Arr = {iiO0O0, iiO0O02, iiO0O03};
/* 35 */            I00iio = iiO0O0Arr;
/* 37 */            ilIII1o11.I00000oIO(iiO0O0Arr);
                }

                public static IiO0O0 valueOf(String str) {
/* 7 */             return (IiO0O0) Enum.valueOf(IiO0O0.class, str);
                }

                public static IiO0O0[] values() {
/* 7 */             return (IiO0O0[]) I00iio.clone();
                }
            }
