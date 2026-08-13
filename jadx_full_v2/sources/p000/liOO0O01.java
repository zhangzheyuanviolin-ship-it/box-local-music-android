            package p000;

            import java.util.logging.Level;
            
            public abstract class liOO0O01 {
                public static String I00000oIO(String str) {
/* 7 */             if (str.length() > 23) {
/* 13 */                int i = -1;
/* 15 */                for (int length = str.length() - 1; length >= 0; length--) {
/* 17 */                    char cCharAt = str.charAt(length);
/* 23 */                    if (cCharAt == '.' || cCharAt == '$') {
/* 33 */                        i = length;
                                break;
                            }
                        }
/* 36 */                str = str.substring(i + 1);
                    }
/* 42 */            String strConcat = "".concat(str);
/* 55 */            return strConcat.substring(0, Math.min(strConcat.length(), 23));
                }

                public static int I00000oOI(Level level) {
/* 1 */             int iIntValue = level.intValue();
/* 11 */            if (iIntValue >= Level.SEVERE.intValue()) {
/* 13 */                return 6;
                    }
/* 21 */            if (iIntValue >= Level.WARNING.intValue()) {
/* 23 */                return 5;
                    }
/* 31 */            if (iIntValue >= Level.INFO.intValue()) {
/* 33 */                return 4;
                    }
                    return iIntValue >= Level.FINE.intValue() ? 3 : 2;
                }
            }
