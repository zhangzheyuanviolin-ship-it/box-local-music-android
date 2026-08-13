            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0Ooo1I {
                public static final O0Ooo1I[] I00iOIl;

                static {
/* 25 */            O0Ooo1I[] o0Ooo1IArr = {new O0Ooo1I("RETURNS_CONSTANT", 0), new O0Ooo1I("CALLS", 1), new O0Ooo1I("RETURNS_NOT_NULL", 2)};
/* 29 */            I00iOIl = o0Ooo1IArr;
/* 31 */            ilIII1o11.I00000oIO(o0Ooo1IArr);
                }

                public static O0Ooo1I valueOf(String str) {
/* 7 */             return (O0Ooo1I) Enum.valueOf(O0Ooo1I.class, str);
                }

                public static O0Ooo1I[] values() {
/* 7 */             return (O0Ooo1I[]) I00iOIl.clone();
                }
            }
