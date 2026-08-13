            package p000;

            import java.util.Locale;
            import java.util.Map;
            
            public abstract class O1Il1olO0o {
                public static final OllO00oiil I00000oIO = new OllO00oiil(new O0o0Ol0(21));

                public static long I00000oIO(String str) throws NumberFormatException {
                    long j;
                    int i;
                    int i2;
                    int i3;
/* 1 */             if (str == null) {
/* 3 */                 return IOOiio0i.I000lI;
                    }
/* 10 */            String string = OlOoOIi0o.I00OIo(str).toString();
/* 25 */            if (OlOolloIIOl0.I000l1(string, "#", false)) {
/* 28 */                String strSubstring = string.substring(1);
/* 32 */                int length = strSubstring.length();
/* 44 */                if (length == 3) {
/* 174 */                   String strI000OiO = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(0)));
/* 186 */                   String strI000OiO2 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(1)));
/* 198 */                   String strI000OiO3 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(2)));
/* 202 */                   iOlI1lIi0.I00000oIO(16);
/* 210 */                   int i4 = (Integer.parseInt(strI000OiO, 16) << 16) | (-16777216);
/* 211 */                   iOlI1lIi0.I00000oIO(16);
/* 219 */                   i2 = i4 | (Integer.parseInt(strI000OiO2, 16) << 8);
/* 220 */                   iOlI1lIi0.I00000oIO(16);
/* 223 */                   i3 = Integer.parseInt(strI000OiO3, 16);
                        } else if (length == 4) {
/* 90 */                    String strI000OiO4 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(0)));
/* 102 */                   String strI000OiO5 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(1)));
/* 114 */                   String strI000OiO6 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(2)));
/* 126 */                   String strI000OiO7 = OlOolloIIOl0.I000OiO(2, String.valueOf(strSubstring.charAt(3)));
/* 130 */                   iOlI1lIi0.I00000oIO(16);
/* 137 */                   int i5 = Integer.parseInt(strI000OiO4, 16) << 24;
/* 139 */                   iOlI1lIi0.I00000oIO(16);
/* 147 */                   int i6 = i5 | (Integer.parseInt(strI000OiO5, 16) << 16);
/* 148 */                   iOlI1lIi0.I00000oIO(16);
/* 156 */                   i2 = i6 | (Integer.parseInt(strI000OiO6, 16) << 8);
/* 157 */                   iOlI1lIi0.I00000oIO(16);
/* 160 */                   i3 = Integer.parseInt(strI000OiO7, 16);
                        } else {
/* 50 */                    if (length == 6) {
/* 72 */                        iOlI1lIi0.I00000oIO(16);
/* 79 */                        i = Integer.parseInt(strSubstring, 16) | (-16777216);
/* 268 */                       return iiO01ll11o1l.I00000oOI(i);
                            }
/* 52 */                    if (length != 8) {
/* 68 */                        I000II.I000iOII("Unknown color format: ".concat(str));
/* 21 */                        return 0L;
                            }
/* 54 */                    iOlI1lIi0.I00000oIO(16);
/* 57 */                    j = Long.parseLong(strSubstring, 16);
                        }
/* 164 */               i = i2 | i3;
/* 268 */               return iiO01ll11o1l.I00000oOI(i);
                    }
/* 228 */           OllO00oiil ollO00oiil = I00000oIO;
/* 234 */           Map map = (Map) ollO00oiil.getValue();
/* 236 */           Locale locale = Locale.ROOT;
/* 246 */           if (!map.containsKey(string.toLowerCase(locale))) {
/* 277 */               I000II.I000iOII("Unknown color format: ".concat(str));
/* 21 */                return 0L;
                    }
/* 264 */           j = ((Ooi0i1) ((Map) ollO00oiil.getValue()).get(string.toLowerCase(locale))).I00iOIl;
/* 61 */            i = (int) j;
/* 268 */           return iiO01ll11o1l.I00000oOI(i);
                }
            }
