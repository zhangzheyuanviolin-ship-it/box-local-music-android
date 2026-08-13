            package p000;

            import android.util.Log;
            
            public abstract class OIlOIi0l implements IIi0O1OOO1i0 {
                public final IIOoi0ooOoO I00iOIl;

                public OIlOIi0l(IIOoi0ooOoO iIOoi0ooOoO) {
/* 4 */             this.I00iOIl = iIOoi0ooOoO;
/* 6 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0IilI00l;
/* 8 */             IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 12 */            if (iIOoOiOII00oII == null) {
/* 16 */                iIOoi0ooOoO.I010iIIOlo(iIi0I0I0o, IIi0I0I0o.I00li1OI);
                    } else {
/* 26 */                if (IIi0I0I0o.I00li1OI.equals(iIOoOiOII00oII)) {
/* 186 */                   return;
                        }
/* 49 */                Log.w("PdfBox-Android", "Annotation has type " + iIOoOiOII00oII + ", further mayhem may follow");
                    }
                }

                public static OIlOIi0l I00000oIO(IIOoi0ooOoO iIOoi0ooOoO) {
/* 1 */             IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0Ii0oI1;
/* 3 */             String strI010101Oo1lO = iIOoi0ooOoO.I010101Oo1lO(iIi0I0I0o);
/* 13 */            if ("FileAttachment".equals(strI010101Oo1lO)) {
/* 17 */                return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 27 */            if ("Line".equals(strI010101Oo1lO)) {
/* 31 */                return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 41 */            if (OlIo0Ooi1loI.I00Io1o110i.equals(strI010101Oo1lO)) {
/* 45 */                return new OIlOO1o(iIOoi0ooOoO);
                    }
/* 55 */            if ("Popup".equals(strI010101Oo1lO)) {
/* 59 */                return new OIlOO1o(iIOoi0ooOoO);
                    }
/* 69 */            if ("Stamp".equals(strI010101Oo1lO)) {
/* 73 */                return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 83 */            if (OIlllOo01.I00ll1.equals(strI010101Oo1lO) || OIlllOo01.I00ilO0.equals(strI010101Oo1lO)) {
/* 228 */               return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 101 */           if ("Text".equals(strI010101Oo1lO)) {
/* 105 */               return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 115 */           if ("Highlight".equals(strI010101Oo1lO) || OIllioIilO.I01Iio10lo.equals(strI010101Oo1lO) || "Squiggly".equals(strI010101Oo1lO) || "StrikeOut".equals(strI010101Oo1lO)) {
/* 222 */               return new OIlOO01iiIIl(iIOoi0ooOoO);
                    }
/* 148 */           if (!"Widget".equals(strI010101Oo1lO)) {
                        return ("FreeText".equals(strI010101Oo1lO) || "Polygon".equals(strI010101Oo1lO) || "PolyLine".equals(strI010101Oo1lO) || "Caret".equals(strI010101Oo1lO) || "Ink".equals(strI010101Oo1lO) || "Sound".equals(strI010101Oo1lO)) ? new OIlOO1o(iIOoi0ooOoO) : new OIlOOOIOol(iIOoi0ooOoO);
                    }
/* 152 */           OIlOO1o oIlOO1o = new OIlOO1o(iIOoi0ooOoO);
/* 155 */           iIOoi0ooOoO.I010l10O(iIi0I0I0o, "Widget");
/* 158 */           return oIlOO1o;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OIlOIi0l) {
/* 17 */                return ((OIlOIi0l) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
