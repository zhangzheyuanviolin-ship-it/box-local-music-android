            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0Ooo0lIlIl {
                public static final O0Ooo0lIlIl[] I00iOIl;

                static {
/* 25 */            O0Ooo0lIlIl[] o0Ooo0lIlIlArr = {new O0Ooo0lIlIl("AT_MOST_ONCE", 0), new O0Ooo0lIlIl("EXACTLY_ONCE", 1), new O0Ooo0lIlIl("AT_LEAST_ONCE", 2)};
/* 29 */            I00iOIl = o0Ooo0lIlIlArr;
/* 31 */            ilIII1o11.I00000oIO(o0Ooo0lIlIlArr);
                }

                public static O0Ooo0lIlIl valueOf(String str) {
/* 7 */             return (O0Ooo0lIlIl) Enum.valueOf(O0Ooo0lIlIl.class, str);
                }

                public static O0Ooo0lIlIl[] values() {
/* 7 */             return (O0Ooo0lIlIl[]) I00iOIl.clone();
                }
            }
