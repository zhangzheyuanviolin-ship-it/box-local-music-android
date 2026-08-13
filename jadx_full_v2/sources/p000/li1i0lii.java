            package p000;

            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public abstract class li1i0lii {
                public static OooO0l0000 I00000oIO(String str) throws NumberFormatException {
                    String strGroup;
/* 1 */             if (str == null || OlOoOIi0o.I001l0I00(str)) {
/* 80 */                return null;
                    }
/* 16 */            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
/* 24 */            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
/* 80 */                return null;
                    }
/* 34 */            int i = Integer.parseInt(strGroup);
/* 39 */            String strGroup2 = matcher.group(2);
/* 43 */            if (strGroup2 == null) {
/* 80 */                return null;
                    }
/* 45 */            int i2 = Integer.parseInt(strGroup2);
/* 50 */            String strGroup3 = matcher.group(3);
/* 54 */            if (strGroup3 != null) {
/* 76 */                return new OooO0l0000(i, i2, Integer.parseInt(strGroup3), matcher.group(4) != null ? matcher.group(4) : "");
                    }
/* 80 */            return null;
                }
            }
