            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0oO1Ii0 {
                public static final O0oO1Ii0 I00iiI;
                public static final O0oO1Ii0 I00iiO;
                public static final O0oO1Ii0 I00iio;
                public static final O0oO1Ii0 I00ilI0I1;
                public static final O0oO1Ii0[] I00ilO0;
                public final String I00iOIl;

                static {
/* 6 */             O0oO1Ii0 o0oO1Ii0 = new O0oO1Ii0("TRACE", 0, "TRACE");
/* 9 */             I00iiI = o0oO1Ii0;
/* 16 */            O0oO1Ii0 o0oO1Ii02 = new O0oO1Ii0("DEBUG", 1, "DEBUG");
/* 19 */            I00iiO = o0oO1Ii02;
/* 26 */            O0oO1Ii0 o0oO1Ii03 = new O0oO1Ii0("INFO", 2, "INFO");
/* 29 */            I00iio = o0oO1Ii03;
/* 36 */            O0oO1Ii0 o0oO1Ii04 = new O0oO1Ii0("WARN", 3, "WARN");
/* 44 */            O0oO1Ii0 o0oO1Ii05 = new O0oO1Ii0("ERROR", 4, "ERROR");
/* 47 */            I00ilI0I1 = o0oO1Ii05;
/* 57 */            O0oO1Ii0[] o0oO1Ii0Arr = {o0oO1Ii0, o0oO1Ii02, o0oO1Ii03, o0oO1Ii04, o0oO1Ii05, new O0oO1Ii0("OFF", 5, "OFF")};
/* 61 */            I00ilO0 = o0oO1Ii0Arr;
/* 63 */            ilIII1o11.I00000oIO(o0oO1Ii0Arr);
                }

                public O0oO1Ii0(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static O0oO1Ii0 valueOf(String str) {
/* 7 */             return (O0oO1Ii0) Enum.valueOf(O0oO1Ii0.class, str);
                }

                public static O0oO1Ii0[] values() {
/* 7 */             return (O0oO1Ii0[]) I00ilO0.clone();
                }

                @Override
                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
