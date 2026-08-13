            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0i11O1 {
                public static final O0i11O1 I00iOIl;
                public static final O0i11O1 I00iiI;
                public static final O0i11O1 I00iiO;
                public static final O0i11O1 I00iio;
                public static final O0i11O1[] I00ilI0I1;

                static {
/* 6 */             O0i11O1 o0i11O1 = new O0i11O1("LANGUAGE_VERSION", 0);
/* 9 */             I00iOIl = o0i11O1;
/* 16 */            O0i11O1 o0i11O12 = new O0i11O1("COMPILER_VERSION", 1);
/* 19 */            I00iiI = o0i11O12;
/* 26 */            O0i11O1 o0i11O13 = new O0i11O1("API_VERSION", 2);
/* 29 */            I00iiO = o0i11O13;
/* 36 */            O0i11O1 o0i11O14 = new O0i11O1("UNKNOWN", 3);
/* 39 */            I00iio = o0i11O14;
/* 41 */            O0i11O1[] o0i11O1Arr = {o0i11O1, o0i11O12, o0i11O13, o0i11O14};
/* 45 */            I00ilI0I1 = o0i11O1Arr;
/* 47 */            ilIII1o11.I00000oIO(o0i11O1Arr);
                }

                public static O0i11O1 valueOf(String str) {
/* 7 */             return (O0i11O1) Enum.valueOf(O0i11O1.class, str);
                }

                public static O0i11O1[] values() {
/* 7 */             return (O0i11O1[]) I00ilI0I1.clone();
                }
            }
