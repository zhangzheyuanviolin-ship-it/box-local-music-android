            package p000;

            import android.util.Log;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class Io0O0o0l1o {
                public static final Io0O0o0l1o I0000O = I00000oIO(4281, "glyphlist.txt");
                public static final Io0O0o0l1o I0000oI00 = I00000oIO(201, "zapfdingbats.txt");
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public ConcurrentHashMap I0000Il00O = new ConcurrentHashMap();

                static {
                    try {
/* 27 */                if (System.getProperty("glyphlist_ext") == null) {
                        } else {
/* 37 */                    throw new UnsupportedOperationException("glyphlist_ext is no longer supported, use GlyphList.DEFAULT.addGlyphs(Properties) instead");
                        }
                    } catch (SecurityException unused) {
                    }
                }

                public Io0O0o0l1o(InputStream inputStream, int i) throws IOException {
/* 16 */            this.I00000oIO = new HashMap(i);
/* 23 */            this.I00000oOI = new HashMap(i);
/* 25 */            I00000oOI(inputStream);
                }

                public static Io0O0o0l1o I00000oIO(int i, String str) throws IOException {
/* 7 */             String strConcat = "com/tom_roush/pdfbox/resources/glyphlist/".concat(str);
                    try {
                        try {
/* 34 */                    InputStream inputStreamI00000oIO = l1lioOO00.I00000oOI() ? l1lioOO00.I00000oIO(strConcat) : Io0O0o0l1o.class.getResourceAsStream("/".concat(strConcat));
/* 39 */                    if (inputStreamI00000oIO != null) {
/* 43 */                        Io0O0o0l1o io0O0o0l1o = new Io0O0o0l1o(inputStreamI00000oIO, i);
/* 46 */                        io0iolo.I00000oOI(inputStreamI00000oIO);
/* 49 */                        return io0O0o0l1o;
                            }
/* 72 */                    throw new IOException("GlyphList '" + strConcat + "' not found");
                        } catch (IOException e) {
/* 78 */                    throw new RuntimeException(e);
                        }
                    } catch (Throwable th) {
/* 79 */                io0iolo.I00000oOI(null);
/* 89 */                throw th;
                    }
                }

                public final void I00000oOI(InputStream inputStream) throws IOException {
/* 1 */             HashMap map = this.I00000oOI;
/* 5 */             HashMap map2 = this.I00000oIO;
/* 16 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
/* 23 */            while (bufferedReader.ready()) {
                        try {
/* 25 */                    String line = bufferedReader.readLine();
/* 29 */                    if (line != null && !line.startsWith("#")) {
/* 41 */                        String[] strArrSplit = line.split(";");
/* 47 */                        if (strArrSplit.length < 2) {
/* 231 */                           throw new IOException("Invalid glyph list entry: " + line);
                                }
/* 50 */                        String str = strArrSplit[0];
/* 55 */                        String[] strArrSplit2 = strArrSplit[1].split(" ");
/* 63 */                        if (map2.containsKey(str)) {
/* 106 */                           Log.w("PdfBox-Android", "duplicate value for " + str + " -> " + strArrSplit[1] + " " + ((String) map2.get(str)));
                                }
/* 113 */                       int length = strArrSplit2.length;
/* 114 */                       int[] iArr = new int[length];
/* 116 */                       int length2 = strArrSplit2.length;
/* 117 */                       int i = 0;
/* 118 */                       int i2 = 0;
/* 119 */                       while (i < length2) {
/* 131 */                           iArr[i2] = Integer.parseInt(strArrSplit2[i], 16);
/* 133 */                           i++;
/* 123 */                           i2++;
                                }
/* 139 */                       String str2 = new String(iArr, 0, length);
/* 142 */                       map2.put(str, str2);
/* 153 */                       boolean z = i00I0Iil.I00iio.I00iiI.containsKey(str) || O1O1l10.I00iio.I00iiI.containsKey(str) || O1O1O0.I00iio.I00iiI.containsKey(str) || OllIIi1i11.I00iio.I00iiI.containsKey(str) || i0I0Il.I00iio.I00iiI.containsKey(str);
/* 200 */                       if (!map.containsKey(str2) || z) {
/* 204 */                           map.put(str2, str);
                                }
                            }
                        } catch (Throwable th) {
/* 236 */                   bufferedReader.close();
/* 966 */                   throw th;
                        }
                    }
/* 232 */           bufferedReader.close();
                }

                public final String I0000Il00O(String str) throws NumberFormatException {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I0000Il00O;
/* 9 */             String str2 = (String) this.I00000oIO.get(str);
/* 11 */            if (str2 != null) {
/* 13 */                return str2;
                    }
/* 18 */            String strValueOf = (String) concurrentHashMap.get(str);
/* 20 */            if (strValueOf == null) {
/* 28 */                if (str.indexOf(46) > 0) {
/* 39 */                    strValueOf = I0000Il00O(str.substring(0, str.indexOf(46)));
                        } else if (str.startsWith("uni") && str.length() == 7) {
/* 74 */                    int length = str.length();
/* 80 */                    StringBuilder sb = new StringBuilder();
/* 83 */                    int i = 3;
                            while (true) {
/* 84 */                        int i2 = i + 4;
/* 86 */                        if (i2 > length) {
                                    break;
                                }
                                try {
/* 92 */                            int i3 = Integer.parseInt(str.substring(i, i2), 16);
/* 96 */                            if (i3 <= 55295 || i3 >= 57344) {
/* 120 */                               sb.append((char) i3);
                                    } else {
/* 115 */                               Log.w("PdfBox-Android", "Unicode character name with disallowed code area: " + str);
                                    }
/* 123 */                           i = i2;
                                } catch (NumberFormatException unused) {
/* 134 */                           Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                                }
/* 134 */                       Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                            }
/* 125 */                   strValueOf = sb.toString();
                        } else if (str.startsWith("u") && str.length() == 5) {
                            try {
/* 158 */                       int i4 = Integer.parseInt(str.substring(1), 16);
/* 162 */                       if (i4 <= 55295 || i4 >= 57344) {
/* 175 */                           strValueOf = String.valueOf((char) i4);
                                } else {
/* 170 */                           Log.w("PdfBox-Android", "Unicode character name with disallowed code area: ".concat(str));
                                }
                            } catch (NumberFormatException unused2) {
/* 184 */                       Log.w("PdfBox-Android", "Not a number in Unicode character name: ".concat(str));
                            }
                        }
/* 187 */               if (strValueOf != null) {
/* 189 */                   concurrentHashMap.put(str, strValueOf);
                        }
                    }
/* 966 */           return strValueOf;
                }
            }
