            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1oOl0 {
                public static final O1oOl0 I00iOIl;
                public static final O1oOl0 I00iiI;
                public static final O1oOl0 I00iiO;
                public static final O1oOl0 I00iio;
                public static final O1oOl0[] I00ilI0I1;

                static {
/* 6 */             O1oOl0 o1oOl0 = new O1oOl0("NOT_INITIALIZED", 0);
/* 9 */             I00iOIl = o1oOl0;
/* 16 */            O1oOl0 o1oOl02 = new O1oOl0("INITIALIZING", 1);
/* 19 */            I00iiI = o1oOl02;
/* 26 */            O1oOl0 o1oOl03 = new O1oOl0("INITIALIZED", 2);
/* 29 */            I00iiO = o1oOl03;
/* 36 */            O1oOl0 o1oOl04 = new O1oOl0("ERROR", 3);
/* 39 */            I00iio = o1oOl04;
/* 41 */            O1oOl0[] o1oOl0Arr = {o1oOl0, o1oOl02, o1oOl03, o1oOl04};
/* 45 */            I00ilI0I1 = o1oOl0Arr;
/* 47 */            ilIII1o11.I00000oIO(o1oOl0Arr);
                }

                public static O1oOl0 valueOf(String str) {
/* 7 */             return (O1oOl0) Enum.valueOf(O1oOl0.class, str);
                }

                public static O1oOl0[] values() {
/* 7 */             return (O1oOl0[]) I00ilI0I1.clone();
                }
            }
