            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0iO1IIlolII {
                public static final O0iO1IIlolII[] I00iiI;
                public static final Il0li01oOil I00iiO;
                public final String I00iOIl;

                static {
/* 71 */            O0iO1IIlolII[] o0iO1IIlolIIArr = {new O0iO1IIlolII("CPP", 0, "C++"), new O0iO1IIlolII("JAVA", 1, "Java"), new O0iO1IIlolII("JAVASCRIPT", 2, "JavaScript"), new O0iO1IIlolII("KOTLIN", 3, "Kotlin"), new O0iO1IIlolII("PYTHON", 4, "Python"), new O0iO1IIlolII("SWIFT", 5, "Swift"), new O0iO1IIlolII("TYPESCRIPT", 6, "TypeScript")};
/* 75 */            I00iiI = o0iO1IIlolIIArr;
/* 81 */            I00iiO = ilIII1o11.I00000oIO(o0iO1IIlolIIArr);
                }

                public O0iO1IIlolII(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static O0iO1IIlolII valueOf(String str) {
/* 7 */             return (O0iO1IIlolII) Enum.valueOf(O0iO1IIlolII.class, str);
                }

                public static O0iO1IIlolII[] values() {
/* 7 */             return (O0iO1IIlolII[]) I00iiI.clone();
                }
            }
