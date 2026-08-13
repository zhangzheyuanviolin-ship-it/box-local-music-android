            package p000;

            import java.net.URI;
            import java.net.URISyntaxException;
            import java.util.ArrayList;
            import java.util.regex.Pattern;
            
            public final class IoOi01OlIl1o {
                public static final char[] I000OiO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public int I0000oI00;
                public ArrayList I0001Ioi1lo;
                public String I000II;
                public String I000O01llI0;
                public boolean I000OOo1O;

                public final String I00000oIO() {
/* 1 */             String str = this.I000O01llI0;
                    return this.I0000Il00O.length() == 0 ? "" : str.substring(OlOoOIi0o.I001i1O0Ol(str, ':', this.I00000oIO.length() + 3, 4) + 1, OlOoOIi0o.I001i1O0Ol(str, '@', 0, 6));
                }

                public final String I00000oOI() {
/* 1 */             String str = this.I000O01llI0;
/* 14 */            int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '/', this.I00000oIO.length() + 3, 4);
/* 28 */            return str.substring(iI001i1O0Ol, OollIoI001lo.I0001Ioi1lo(iI001i1O0Ol, str.length(), str, "?#"));
                }

                public final ArrayList I0000Il00O() {
/* 1 */             String str = this.I000O01llI0;
/* 14 */            int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '/', this.I00000oIO.length() + 3, 4);
/* 24 */            int iI0001Ioi1lo = OollIoI001lo.I0001Ioi1lo(iI001i1O0Ol, str.length(), str, "?#");
/* 30 */            ArrayList arrayList = new ArrayList();
/* 33 */            while (iI001i1O0Ol < iI0001Ioi1lo) {
/* 35 */                int i = iI001i1O0Ol + 1;
/* 37 */                int iI000II = OollIoI001lo.I000II(str, '/', i, iI0001Ioi1lo);
/* 45 */                arrayList.add(str.substring(i, iI000II));
/* 48 */                iI001i1O0Ol = iI000II;
                    }
/* 113 */           return arrayList;
                }

                public final String I0000O() {
/* 1 */             String str = this.I000O01llI0;
/* 5 */             if (this.I0001Ioi1lo == null) {
/* 7 */                 return null;
                    }
/* 17 */            int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '?', 0, 6) + 1;
/* 29 */            return str.substring(iI001i1O0Ol, OollIoI001lo.I000II(str, '#', iI001i1O0Ol, str.length()));
                }

                public final String I0000oI00() {
/* 1 */             String str = this.I000O01llI0;
/* 9 */             if (this.I00000oOI.length() == 0) {
/* 11 */                return "";
                    }
/* 20 */            int length = this.I00000oIO.length() + 3;
/* 32 */            return str.substring(length, OollIoI001lo.I0001Ioi1lo(length, str.length(), str, ":@"));
                }

                public final String I0001Ioi1lo() {
                    IoOOloOOllIO ioOOloOOllIO;
                    try {
/* 5 */                 ioOOloOOllIO = new IoOOloOOllIO();
/* 8 */                 ioOOloOOllIO.I0000Il00O(this, "/...");
                    } catch (IllegalArgumentException unused) {
/* 12 */                ioOOloOOllIO = null;
                    }
/* 24 */            ioOOloOOllIO.I00000oOI = iOl0lOIi11.I000O01llI0("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
/* 30 */            ioOOloOOllIO.I0000Il00O = iOl0lOIi11.I000O01llI0("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
/* 36 */            return ioOOloOOllIO.I00000oIO().I000O01llI0;
                }

                public final URI I000II() {
/* 1 */             String str = this.I000O01llI0;
/* 5 */             IoOOloOOllIO ioOOloOOllIO = new IoOOloOOllIO();
/* 8 */             String str2 = this.I00000oIO;
/* 10 */            ioOOloOOllIO.I00000oIO = str2;
/* 16 */            ioOOloOOllIO.I00000oOI = I0000oI00();
/* 22 */            ioOOloOOllIO.I0000Il00O = I00000oIO();
/* 26 */            ioOOloOOllIO.I0000O = this.I0000O;
/* 28 */            int i = this.I0000oI00;
/* 54 */            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
/* 57 */                i = -1;
                    }
/* 58 */            ioOOloOOllIO.I0000oI00 = i;
/* 60 */            ArrayList arrayList = ioOOloOOllIO.I0001Ioi1lo;
/* 62 */            arrayList.clear();
/* 69 */            arrayList.addAll(I0000Il00O());
/* 72 */            String strI0000O = I0000O();
/* 94 */            ioOOloOOllIO.I000II = strI0000O != null ? iOl0lOIi11.I00100l0(iOl0lOIi11.I000O01llI0(strI0000O, 0, 0, " \"'<>#", 211)) : null;
/* 115 */           ioOOloOOllIO.I000O01llI0 = this.I000II == null ? null : str.substring(OlOoOIi0o.I001i1O0Ol(str, '#', 0, 6) + 1);
/* 117 */           String str3 = ioOOloOOllIO.I0000O;
/* 139 */           ioOOloOOllIO.I0000O = str3 != null ? Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("") : null;
/* 141 */           int size = arrayList.size();
/* 146 */           for (int i2 = 0; i2 < size; i2++) {
/* 162 */               arrayList.set(i2, iOl0lOIi11.I000O01llI0((String) arrayList.get(i2), 0, 0, "[]", 227));
                    }
/* 168 */           ArrayList arrayList2 = ioOOloOOllIO.I000II;
/* 170 */           if (arrayList2 != null) {
/* 172 */               int size2 = arrayList2.size();
/* 177 */               for (int i3 = 0; i3 < size2; i3++) {
/* 183 */                   String str4 = (String) arrayList2.get(i3);
/* 197 */                   arrayList2.set(i3, str4 != null ? iOl0lOIi11.I000O01llI0(str4, 0, 0, "\\^`{|}", 195) : null);
                        }
                    }
/* 203 */           String str5 = ioOOloOOllIO.I000O01llI0;
/* 217 */           ioOOloOOllIO.I000O01llI0 = str5 != null ? iOl0lOIi11.I000O01llI0(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
/* 219 */           String string = ioOOloOOllIO.toString();
                    try {
/* 225 */               return new URI(string);
                    } catch (URISyntaxException e) {
                        try {
/* 244 */                   return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
                        } catch (Exception unused) {
/* 249 */                   IioIoO10iOiI.I000lI(e);
/* 77 */                    return null;
                        }
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IoOi01OlIl1o) && ((IoOi01OlIl1o) obj).I000O01llI0.equals(this.I000O01llI0);
                }

                public final int hashCode() {
/* 3 */             return this.I000O01llI0.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I000O01llI0;
                }
            }
