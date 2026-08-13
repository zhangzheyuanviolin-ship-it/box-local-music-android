            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1i0O00 {
                public static final O1i0O00 I00iOIl;
                public static final O1i0O00 I00iiI;
                public static final O1i0O00 I00iiO;
                public static final O1i0O00 I00iio;
                public static final O1i0O00[] I00ilI0I1;

                static {
/* 6 */             O1i0O00 o1i0O00 = new O1i0O00("NONE", 0);
/* 9 */             I00iOIl = o1i0O00;
/* 16 */            O1i0O00 o1i0O002 = new O1i0O00("REQUEST_HEADER", 1);
/* 19 */            I00iiI = o1i0O002;
/* 26 */            O1i0O00 o1i0O003 = new O1i0O00("OAUTH", 2);
/* 29 */            I00iiO = o1i0O003;
/* 36 */            O1i0O00 o1i0O004 = new O1i0O00("AUTHMETHOD_NOT_SET", 3);
/* 39 */            I00iio = o1i0O004;
/* 45 */            I00ilI0I1 = new O1i0O00[]{o1i0O00, o1i0O002, o1i0O003, o1i0O004};
                }

                public static O1i0O00 valueOf(String str) {
/* 7 */             return (O1i0O00) Enum.valueOf(O1i0O00.class, str);
                }

                public static O1i0O00[] values() {
/* 7 */             return (O1i0O00[]) I00ilI0I1.clone();
                }
            }
