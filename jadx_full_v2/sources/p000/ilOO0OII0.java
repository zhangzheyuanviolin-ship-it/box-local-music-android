            package p000;

            import java.util.Set;
            
            public final class ilOO0OII0 {
                public Set I00000oIO;

                public final i1Io0lIii I00000oIO(String str) {
/* 3 */             ilOiIo1Ol iloiio1ol = new ilOiIo1Ol(str);
/* 12 */            if (str.length() > 23) {
/* 18 */                int i = -1;
/* 20 */                for (int length = str.length() - 1; length >= 0; length--) {
/* 22 */                    char cCharAt = str.charAt(length);
/* 28 */                    if (cCharAt == '.' || cCharAt == '$') {
/* 38 */                        i = length;
                                break;
                            }
                        }
/* 41 */                str = str.substring(i + 1);
                    }
/* 47 */            String strConcat = "".concat(str);
/* 60 */            strConcat.substring(0, Math.min(strConcat.length(), 23));
/* 77 */            return iloiio1ol;
                }
            }
