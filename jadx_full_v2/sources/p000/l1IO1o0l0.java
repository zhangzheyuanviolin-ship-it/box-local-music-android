            package p000;
            
            public abstract class l1IO1o0l0 {
                public static final String I00000oIO(String str, String str2) {
/* 7 */             if (str.length() <= 6000) {
/* 9 */                 return str;
                    }
/* 14 */            int length = str.length() - 6000;
/* 15 */            String strI00OIl = OlOoOIi0o.I00OIl(6000, str);
/* 19 */            int length2 = str.length();
/* 25 */            StringBuilder sb = new StringBuilder(strI00OIl);
/* 30 */            sb.append("\n\n[Box: ");
/* 33 */            sb.append(str2);
/* 38 */            sb.append(" truncated to fit the model's context window — kept the first 6000 of ");
/* 41 */            sb.append(length2);
/* 48 */            return IIlIOloOOO.I00100o1O0lo(sb, " characters (", length, " dropped). Ask the user to narrow the query if you need the omitted content.]");
                }
            }
