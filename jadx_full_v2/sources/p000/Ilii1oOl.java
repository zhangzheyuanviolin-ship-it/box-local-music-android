            package p000;

            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Locale;
            
            public abstract class Ilii1oOl {
                public static final Ilii0Oi0I1O I00000oIO;

                static {
/* 3 */             Ilii0Oi0I1O ilii0Oi0I1O = new Ilii0Oi0I1O();
/* 11 */            ilii0Oi0I1O.I0000O = new HashMap();
/* 38 */            ilii0Oi0I1O.I00000oIO("Courier", new ArrayList(Arrays.asList("CourierNew", "CourierNewPSMT", "LiberationMono", "NimbusMonL-Regu", "DroidSansMono")));
/* 64 */            ilii0Oi0I1O.I00000oIO("Courier-Bold", new ArrayList(Arrays.asList("CourierNewPS-BoldMT", "CourierNew-Bold", "LiberationMono-Bold", "NimbusMonL-Bold", "DroidSansMono")));
/* 90 */            ilii0Oi0I1O.I00000oIO("Courier-Oblique", new ArrayList(Arrays.asList("CourierNewPS-ItalicMT", "CourierNew-Italic", "LiberationMono-Italic", "NimbusMonL-ReguObli", "DroidSansMono")));
/* 116 */           ilii0Oi0I1O.I00000oIO("Courier-BoldOblique", new ArrayList(Arrays.asList("CourierNewPS-BoldItalicMT", "CourierNew-BoldItalic", "LiberationMono-BoldItalic", "NimbusMonL-BoldObli", "DroidSansMono")));
/* 144 */           ilii0Oi0I1O.I00000oIO("Helvetica", new ArrayList(Arrays.asList("ArialMT", "Arial", "LiberationSans", "NimbusSanL-Regu", "Roboto-Regular")));
/* 172 */           ilii0Oi0I1O.I00000oIO("Helvetica-Bold", new ArrayList(Arrays.asList("Arial-BoldMT", "Arial-Bold", "LiberationSans-Bold", "NimbusSanL-Bold", "Roboto-Bold")));
/* 202 */           ilii0Oi0I1O.I00000oIO("Helvetica-Oblique", new ArrayList(Arrays.asList("Arial-ItalicMT", "Arial-Italic", "Helvetica-Italic", "LiberationSans-Italic", "NimbusSanL-ReguItal", "Roboto-Italic")));
/* 230 */           ilii0Oi0I1O.I00000oIO("Helvetica-BoldOblique", new ArrayList(Arrays.asList("Arial-BoldItalicMT", "Helvetica-BoldItalic", "LiberationSans-BoldItalic", "NimbusSanL-BoldItal", "Roboto-BoldItalic")));
/* 260 */           ilii0Oi0I1O.I00000oIO("Times-Roman", new ArrayList(Arrays.asList("TimesNewRomanPSMT", "TimesNewRoman", "TimesNewRomanPS", "LiberationSerif", "NimbusRomNo9L-Regu", "Roboto-Regular")));
/* 292 */           ilii0Oi0I1O.I00000oIO("Times-Bold", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldMT", "TimesNewRomanPS-Bold", "TimesNewRoman-Bold", "LiberationSerif-Bold", "NimbusRomNo9L-Medi", "DroidSerif-Bold", "Roboto-Bold")));
/* 324 */           ilii0Oi0I1O.I00000oIO("Times-Italic", new ArrayList(Arrays.asList("TimesNewRomanPS-ItalicMT", "TimesNewRomanPS-Italic", "TimesNewRoman-Italic", "LiberationSerif-Italic", "NimbusRomNo9L-ReguItal", "DroidSerif-Italic", "Roboto-Italic")));
/* 356 */           ilii0Oi0I1O.I00000oIO("Times-BoldItalic", new ArrayList(Arrays.asList("TimesNewRomanPS-BoldItalicMT", "TimesNewRomanPS-BoldItalic", "TimesNewRoman-BoldItalic", "LiberationSerif-BoldItalic", "NimbusRomNo9L-MediItal", "DroidSerif-BoldItalic", "Roboto-BoldItalic")));
/* 378 */           ilii0Oi0I1O.I00000oIO("Symbol", new ArrayList(Arrays.asList("Symbol", "SymbolMT", "StandardSymL")));
/* 404 */           ilii0Oi0I1O.I00000oIO("ZapfDingbats", new ArrayList(Arrays.asList("ZapfDingbatsITCbyBT-Regular", "ZapfDingbatsITC", "Dingbats", "MS-Gothic")));
/* 425 */           for (String str : Collections.unmodifiableSet(OlIl10I01i.I00000oIO.keySet())) {
/* 433 */               HashMap map = ilii0Oi0I1O.I0000O;
/* 439 */               String strReplace = str.replace(" ", "");
/* 443 */               Locale locale = Locale.ENGLISH;
/* 453 */               List list = (List) map.get(strReplace.toLowerCase(locale));
/* 455 */               if (list == null) {
/* 458 */                   list = Collections.EMPTY_LIST;
                        }
/* 464 */               if (list.isEmpty()) {
/* 491 */                   ilii0Oi0I1O.I00000oIO(str, new ArrayList((Collection) ilii0Oi0I1O.I0000O.get(((String) OlIl10I01i.I00000oIO.get(str)).toLowerCase(locale))));
                        }
                    }
                    try {
/* 527 */               InputStream inputStreamI00000oIO = l1lioOO00.I00000oOI() ? l1lioOO00.I00000oIO("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf") : Ilii0Oi0I1O.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
/* 531 */               if (inputStreamI00000oIO == null) {
/* 583 */                   throw new IOException("resource 'com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf' not found");
                        }
/* 540 */               boolean z = false;
/* 548 */               ilii0Oi0I1O.I0000Il00O = new IlOoIo(z, z).I0000oI00(new BufferedInputStream(inputStreamI00000oIO));
/* 550 */               VarHandle.storeStoreFence();
/* 553 */               I00000oIO = ilii0Oi0I1O;
                    } catch (IOException e) {
/* 585 */               IioIoO10iOiI.I000lI(e);
                    }
                }
            }
