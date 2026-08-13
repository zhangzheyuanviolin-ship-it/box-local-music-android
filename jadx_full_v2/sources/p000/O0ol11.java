            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0ol11 {
                public static final O0ol11[] I00iOIl;

                static {
/* 17 */            O0ol11[] o0ol11Arr = {new O0ol11("SOURCE", 0), new O0ol11("BINARY", 1)};
/* 21 */            I00iOIl = o0ol11Arr;
/* 23 */            ilIII1o11.I00000oIO(o0ol11Arr);
                }

                public static O0ol11 valueOf(String str) {
/* 7 */             return (O0ol11) Enum.valueOf(O0ol11.class, str);
                }

                public static O0ol11[] values() {
/* 7 */             return (O0ol11[]) I00iOIl.clone();
                }
            }
