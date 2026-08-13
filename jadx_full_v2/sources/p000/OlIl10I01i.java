            package p000;

            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class OlIl10I01i {
                public static final HashMap I00000oIO = new HashMap(38);
                public static final HashMap I00000oOI = new HashMap(14);

                static {
/* 21 */            I0000Il00O("Courier-Bold");
/* 26 */            I0000Il00O("Courier-BoldOblique");
/* 31 */            I0000Il00O("Courier");
/* 36 */            I0000Il00O("Courier-Oblique");
/* 41 */            I0000Il00O("Helvetica");
/* 46 */            I0000Il00O("Helvetica-Bold");
/* 51 */            I0000Il00O("Helvetica-BoldOblique");
/* 56 */            I0000Il00O("Helvetica-Oblique");
/* 61 */            I0000Il00O("Symbol");
/* 66 */            I0000Il00O("Times-Bold");
/* 71 */            I0000Il00O("Times-BoldItalic");
/* 76 */            I0000Il00O("Times-Italic");
/* 81 */            I0000Il00O("Times-Roman");
/* 86 */            I0000Il00O("ZapfDingbats");
/* 91 */            I0000O("CourierCourierNew", "Courier");
/* 96 */            I0000O("CourierNew", "Courier");
/* 101 */           I0000O("CourierNew,Italic", "Courier-Oblique");
/* 106 */           I0000O("CourierNew,Bold", "Courier-Bold");
/* 111 */           I0000O("CourierNew,BoldItalic", "Courier-BoldOblique");
/* 116 */           I0000O("Arial", "Helvetica");
/* 121 */           I0000O("Arial,Italic", "Helvetica-Oblique");
/* 126 */           I0000O("Arial,Bold", "Helvetica-Bold");
/* 131 */           I0000O("Arial,BoldItalic", "Helvetica-BoldOblique");
/* 136 */           I0000O("TimesNewRoman", "Times-Roman");
/* 141 */           I0000O("TimesNewRoman,Italic", "Times-Italic");
/* 146 */           I0000O("TimesNewRoman,Bold", "Times-Bold");
/* 151 */           I0000O("TimesNewRoman,BoldItalic", "Times-BoldItalic");
/* 156 */           I0000O("Symbol,Italic", "Symbol");
/* 161 */           I0000O("Symbol,Bold", "Symbol");
/* 166 */           I0000O("Symbol,BoldItalic", "Symbol");
/* 171 */           I0000O("Times", "Times-Roman");
/* 176 */           I0000O("Times,Italic", "Times-Italic");
/* 181 */           I0000O("Times,Bold", "Times-Bold");
/* 186 */           I0000O("Times,BoldItalic", "Times-BoldItalic");
/* 191 */           I0000O("ArialMT", "Helvetica");
/* 196 */           I0000O("Arial-ItalicMT", "Helvetica-Oblique");
/* 201 */           I0000O("Arial-BoldMT", "Helvetica-Bold");
/* 206 */           I0000O("Arial-BoldItalicMT", "Helvetica-BoldOblique");
                }

                public static IliiI1 I00000oIO(String str) {
/* 7 */             String str2 = (String) I00000oIO.get(str);
/* 9 */             if (str2 == null) {
/* 11 */                return null;
                    }
/* 13 */            HashMap map = I00000oOI;
/* 19 */            if (map.get(str2) == null) {
                        synchronized (map) {
/* 26 */                    if (map.get(str2) == null) {
                                try {
/* 28 */                            I00000oOI(str2);
                                } catch (IOException e) {
/* 40 */                            throw new IllegalArgumentException(e);
                                }
                            }
                        }
                    }
/* 49 */            return (IliiI1) map.get(str2);
                }

                public static void I00000oOI(String str) throws IOException {
/* 5 */             String strI000lI = IlIi0I0.I000lI("com/tom_roush/pdfbox/resources/afm/", str, ".afm");
/* 28 */            InputStream inputStreamI00000oIO = l1lioOO00.I00000oOI() ? l1lioOO00.I00000oIO(strI000lI) : OIo0Ii0oOIl.class.getResourceAsStream("/".concat(strI000lI));
/* 32 */            if (inputStreamI00000oIO == null) {
/* 76 */                IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("resource '", strI000lI, "' not found"));
/* 186 */               return;
                    }
/* 36 */            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamI00000oIO);
                    try {
/* 42 */                IIOOoll iIOOoll = new IIOOoll(2);
/* 45 */                iIOOoll.I00iiI = bufferedInputStream;
/* 47 */                VarHandle.storeStoreFence();
/* 56 */                I00000oOI.put(str, iIOOoll.I00OIl());
                    } finally {
/* 64 */                bufferedInputStream.close();
                    }
                }

                public static void I0000Il00O(String str) {
/* 3 */             I00000oIO.put(str, str);
                }

                public static void I0000O(String str, String str2) {
/* 3 */             I00000oIO.put(str, str2);
                }
            }
