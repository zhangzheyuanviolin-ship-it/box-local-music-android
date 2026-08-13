            package p000;

            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lIoO00iOo {
                public static String I00000oIO(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 11 */            if (!O0OiOoOO0.I00000oIO.contains(strI00000oOI)) {
/* 14 */                int i = 0;
                        while (true) {
/* 19 */                    if (i < strI00000oOI.length()) {
/* 21 */                        char cCharAt = strI00000oOI.charAt(i);
/* 29 */                        if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                                    break;
                                }
/* 36 */                        i++;
                            } else if (strI00000oOI.length() != 0 && Character.isJavaIdentifierStart(strI00000oOI.codePointAt(0))) {
/* 57 */                        return strI00000oOI;
                            }
                        }
                    }
/* 64 */            return "`".concat(strI00000oOI).concat("`");
                }

                public static final String I00000oOI(String str, String str2, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, Function1 function1) {
/* 5 */             String str3 = (String) illOOo00lI.invoke();
/* 19 */            String strI0000O = I0000O(str, Oi010OO0.I00111O(str3, "Mutable"), str2, str3, Oi010OO0.I00111O(str3, "(Mutable)"));
/* 23 */            if (strI0000O != null) {
/* 25 */                return strI0000O;
                    }
/* 44 */            String strI0000O2 = I0000O(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
/* 48 */            if (strI0000O2 != null) {
/* 50 */                return strI0000O2;
                    }
/* 55 */            String str4 = (String) illOOo00lI2.invoke();
/* 126 */           String strI0000O3 = I0000O(str, str4 + ((String) function1.invoke("Array<")), str2, str4 + ((String) function1.invoke("Array<out ")), str4 + ((String) function1.invoke("Array<(out) ")));
/* 130 */           if (strI0000O3 != null) {
/* 132 */               return strI0000O3;
                    }
/* 133 */           return null;
                }

                public static final String I0000Il00O(List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) it.next();
/* 26 */                if (sb.length() > 0) {
/* 30 */                    sb.append(".");
                        }
/* 37 */                sb.append(I00000oIO(oI1Iio0ii1));
                    }
/* 41 */            return sb.toString();
                }

                public static final String I0000O(String str, String str2, String str3, String str4, String str5) {
/* 6 */             if (!OlOolloIIOl0.I000l1(str, str2, false) || !OlOolloIIOl0.I000l1(str3, str4, false)) {
/* 54 */                return null;
                    }
/* 18 */            String strSubstring = str.substring(str2.length());
/* 26 */            String strSubstring2 = str3.substring(str4.length());
/* 30 */            String strConcat = str5.concat(strSubstring);
/* 38 */            if (strSubstring.equals(strSubstring2)) {
/* 40 */                return strConcat;
                    }
/* 45 */            if (I0000oI00(strSubstring, strSubstring2)) {
/* 49 */                return strConcat.concat("!");
                    }
/* 54 */            return null;
                }

                public static final boolean I0000oI00(String str, String str2) {
/* 13 */            if (str.equals(OlOolloIIOl0.I000iOII(str2, "?", ""))) {
/* 59 */                return true;
                    }
/* 20 */            if (OlOolloIIOl0.I000II(str2, "?", false) && str.concat("?").equals(str2)) {
/* 59 */                return true;
                    }
/* 36 */            StringBuilder sb = new StringBuilder("(");
/* 39 */            sb.append(str);
/* 44 */            sb.append(")?");
                    return sb.toString().equals(str2);
                }
            }
