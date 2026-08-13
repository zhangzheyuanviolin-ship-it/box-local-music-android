            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1IooIOio0 {
                public static final O1IooIOio0[] I00iOIl;

                static {
/* 25 */            O1IooIOio0[] o1IooIOio0Arr = {new O1IooIOio0("LatinModernMath", 0), new O1IooIOio0("XitsMath", 1), new O1IooIOio0("TexGyreTermsMath", 2)};
/* 29 */            I00iOIl = o1IooIOio0Arr;
/* 31 */            ilIII1o11.I00000oIO(o1IooIOio0Arr);
                }

                public static O1IooIOio0 valueOf(String str) {
/* 7 */             return (O1IooIOio0) Enum.valueOf(O1IooIOio0.class, str);
                }

                public static O1IooIOio0[] values() {
/* 7 */             return (O1IooIOio0[]) I00iOIl.clone();
                }
            }
