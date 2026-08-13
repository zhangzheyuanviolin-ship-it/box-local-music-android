            package p000;

            import java.util.Locale;
            
            public abstract class li00oIo {
                public static String I00000oIO(int i) {
/* 9 */             String upperCase = Integer.toString(i, 16).toUpperCase(Locale.US);
/* 13 */            int length = upperCase.length();
                    return length != 1 ? length != 2 ? length != 3 ? "uni".concat(upperCase) : "uni0".concat(upperCase) : "uni00".concat(upperCase) : "uni000".concat(upperCase);
                }
            }
