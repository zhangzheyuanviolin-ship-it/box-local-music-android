            package p000;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.nio.charset.StandardCharsets;
            import java.util.HashMap;
            
            public abstract class IoIIOIl0I1 {
                public static final HashMap I00000oIO;

                static {
/* 3 */             HashMap map = new HashMap();
                    try {
/* 23 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(IoIIOIl0I1.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
                        while (true) {
                            try {
/* 26 */                        String line = bufferedReader.readLine();
/* 30 */                        if (line == null) {
/* 62 */                            bufferedReader.close();
/* 69 */                            map.put("NewLine", "\n");
/* 72 */                            I00000oIO = map;
/* 74 */                            return;
                                } else if (line.length() != 0) {
/* 41 */                            int iIndexOf = line.indexOf("=");
/* 56 */                            map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                                }
                            } finally {
                            }
                        }
                    } catch (IOException e) {
/* 89 */                IoOOl0iOl1io.I000l1("Failed reading data for HTML named character references", e);
                    }
                }

                public static String I00000oIO(String str) throws NumberFormatException {
                    int i;
/* 7 */             if (str.startsWith("&") && str.endsWith(";")) {
/* 24 */                String strSubstring = str.substring(1, str.length() - 1);
/* 34 */                if (strSubstring.startsWith("#")) {
/* 36 */                    String strSubstring2 = strSubstring.substring(1);
/* 46 */                    if (strSubstring2.startsWith("x") || strSubstring2.startsWith("X")) {
/* 60 */                        strSubstring2 = strSubstring2.substring(1);
/* 64 */                        i = 16;
                            } else {
/* 57 */                        i = 10;
                            }
                            try {
/* 66 */                        int i2 = Integer.parseInt(strSubstring2, i);
                                return i2 == 0 ? "�" : new String(Character.toChars(i2));
                            } catch (IllegalArgumentException unused) {
/* 83 */                        return "�";
                            }
                        }
/* 92 */                String str2 = (String) I00000oIO.get(strSubstring);
/* 94 */                if (str2 != null) {
/* 96 */                    return str2;
                        }
                    }
/* 186 */           return str;
                }
            }
