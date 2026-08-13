            package p000;

            import android.util.Log;
            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public class OlIo0Ooi1loI {
                public static final String I00000oIO = "Document";
                public static final String I00000oOI = "Part";
                public static final String I0000Il00O = "Art";
                public static final String I0000O = "Sect";
                public static final String I0000oI00 = "Div";
                public static final String I0001Ioi1lo = "BlockQuote";
                public static final String I000II = "Caption";
                public static final String I000O01llI0 = "TOC";
                public static final String I000OOo1O = "TOCI";
                public static final String I000OiO = "Index";
                public static final String I000iOII = "NonStruct";
                public static final String I000l1 = "Private";
                public static final String I000lI = "P";
                public static final String I000o00OoI0I = "H";
                public static final String I000oI1ioi = "H1";
                public static final String I00100l0 = "H2";
                public static final String I00100o1O0lo = "H3";
                public static final String I0010I0i = "H4";
                public static final String I0010o = "H5";
                public static final String I00111O = "H6";
                public static final String I001IIilI0O = "L";
                public static final String I001IO000 = "LI";
                public static final String I001i1O0Ol = "Lbl";
                public static final String I001i1lo1io = "LBody";
                public static final String I001iOo1i0O = "Table";
                public static final String I001l0I00 = "TR";
                public static final String I001lIiIIo1O = "TH";
                public static final String I001lllioOl = "TD";
                public static final String I001lloI = "THead";
                public static final String I00II0Ol1O0l = "TBody";
                public static final String I00II0oii1o = "TFoot";
                public static final String I00IO1 = "Span";
                public static final String I00IO1oi11O = "Quote";
                public static final String I00IOO = "Note";
                public static final String I00IioO0OiOi = "Reference";
                public static final String I00IlilI0i0i = "BibEntry";
                public static final String I00Io1lO = "Code";
                public static final String I00Io1o110i = "Link";
                public static final String I00IoIO0lI = "Annot";
                public static final String I00IoO0 = "Ruby";
                public static final String I00IoiI = "RB";
                public static final String I00Iooi00oi = "RT";
                public static final String I00O0i0ii = "RP";
                public static final String I00O0o1oo = "Warichu";
                public static final String I00O10llo = "WT";
                public static final String I00OI1 = "WP";
                public static final String I00OIO1 = "Figure";
                public static final String I00OIl = "Formula";
                public static final String I00OIo = "Form";
                public static List<String> I00OOll1 = new ArrayList();

                static {
/* 18 */            for (Field field : OlIo0Ooi1loI.class.getFields()) {
/* 30 */                if (Modifier.isFinal(field.getModifiers())) {
                            try {
/* 43 */                        I00OOll1.add(field.get(null).toString());
                            } catch (IllegalAccessException e) {
/* 55 */                        Log.e("PdfBox-Android", e.getMessage(), e);
                            } catch (IllegalArgumentException e2) {
/* 63 */                        Log.e("PdfBox-Android", e2.getMessage(), e2);
                            }
                        }
                    }
/* 71 */            Collections.sort(I00OOll1);
                }

                private OlIo0Ooi1loI() {
                }
            }
