            package p000;

            import android.text.Editable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import org.xml.sax.Attributes;
            import org.xml.sax.ContentHandler;
            import org.xml.sax.Locator;
            import org.xml.sax.SAXException;
            
            public final class I111o1Oil1i implements ContentHandler {
                public ContentHandler I00000oIO;
                public Editable I00000oOI;
                public int I0000Il00O;
                public IIIi0IlOOO I0000O;

                public final void I00000oIO() {
/* 1 */             Editable editable = this.I00000oOI;
/* 3 */             IIIi0IlOOO iIIi0IlOOO = this.I0000O;
/* 5 */             if (iIIi0IlOOO != null) {
/* 15 */                editable.setSpan(iIIi0IlOOO, iIIi0IlOOO.I0000Il00O, editable.length(), 33);
                    }
/* 19 */            this.I0000O = null;
                }

                @Override
                public final void characters(char[] cArr, int i, int i2) throws SAXException {
/* 3 */             this.I00000oIO.characters(cArr, i, i2);
                }

                @Override
                public final void endDocument() throws SAXException {
/* 3 */             this.I00000oIO.endDocument();
                }

                @Override
                public final void endElement(String str, String str2, String str3) throws SAXException {
/* 1 */             if (str2 != null) {
/* 3 */                 int iHashCode = str2.hashCode();
/* 10 */                if (iHashCode != -1555043537) {
/* 14 */                    if (iHashCode != 3453) {
/* 18 */                        if (iHashCode == 3735 && str2.equals("ul")) {
/* 31 */                            I00000oIO();
                                    this.I0000Il00O--;
/* 40 */                            return;
                                }
                            } else if (str2.equals("li")) {
/* 50 */                        I00000oIO();
/* 53 */                        return;
                            }
                        } else if (str2.equals("annotation")) {
/* 63 */                    Editable editable = this.I00000oOI;
/* 72 */                    Object[] spans = editable.getSpans(0, editable.length(), I11I1il.class);
/* 78 */                    ArrayList arrayList = new ArrayList();
/* 83 */                    for (Object obj : spans) {
/* 96 */                        if (editable.getSpanFlags((I11I1il) obj) == 17) {
/* 98 */                            arrayList.add(obj);
                                }
                            }
/* 104 */                   int size = arrayList.size();
/* 108 */                   for (int i = 0; i < size; i++) {
/* 114 */                       I11I1il i11I1il = (I11I1il) arrayList.get(i);
/* 116 */                       int spanStart = editable.getSpanStart(i11I1il);
/* 120 */                       int length = editable.length();
/* 124 */                       editable.removeSpan(i11I1il);
/* 127 */                       if (spanStart != length) {
/* 131 */                           editable.setSpan(i11I1il, spanStart, length, 33);
                                }
                            }
/* 137 */                   return;
                        }
                    }
/* 140 */           this.I00000oIO.endElement(str, str2, str3);
                }

                @Override
                public final void endPrefixMapping(String str) throws SAXException {
/* 3 */             this.I00000oIO.endPrefixMapping(str);
                }

                @Override
                public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
/* 3 */             this.I00000oIO.ignorableWhitespace(cArr, i, i2);
                }

                @Override
                public final void processingInstruction(String str, String str2) throws SAXException {
/* 3 */             this.I00000oIO.processingInstruction(str, str2);
                }

                @Override
                public final void setDocumentLocator(Locator locator) {
/* 3 */             this.I00000oIO.setDocumentLocator(locator);
                }

                @Override
                public final void skippedEntity(String str) throws SAXException {
/* 3 */             this.I00000oIO.skippedEntity(str);
                }

                @Override
                public final void startDocument() throws SAXException {
/* 3 */             this.I00000oIO.startDocument();
                }

                @Override
                public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
/* 1 */             Editable editable = this.I00000oOI;
/* 3 */             if (str2 != null) {
/* 5 */                 int iHashCode = str2.hashCode();
/* 12 */                if (iHashCode != -1555043537) {
/* 16 */                    if (iHashCode != 3453) {
/* 20 */                        if (iHashCode == 3735 && str2.equals("ul")) {
/* 34 */                            I00000oIO();
                                    this.I0000Il00O++;
/* 43 */                            return;
                                }
                            } else if (str2.equals("li")) {
/* 53 */                        I00000oIO();
/* 58 */                        IIIi00o iIIi00o = IIIi00o.I0001Ioi1lo;
/* 60 */                        int i = this.I0000Il00O;
/* 62 */                        int length = editable.length();
/* 66 */                        IIIi0IlOOO iIIi0IlOOO = new IIIi0IlOOO();
/* 69 */                        iIIi0IlOOO.I00000oIO = iIIi00o;
/* 71 */                        iIIi0IlOOO.I00000oOI = i;
/* 73 */                        iIIi0IlOOO.I0000Il00O = length;
/* 75 */                        VarHandle.storeStoreFence();
/* 78 */                        this.I0000O = iIIi0IlOOO;
/* 80 */                        return;
                            }
                        } else if (str2.equals("annotation")) {
/* 90 */                    if (attributes != null) {
/* 92 */                        int length2 = attributes.getLength();
/* 97 */                        for (int i2 = 0; i2 < length2; i2++) {
/* 99 */                            String localName = attributes.getLocalName(i2);
/* 105 */                           if (localName == null) {
/* 103 */                               localName = "";
                                    }
/* 108 */                           String value = attributes.getValue(i2);
/* 103 */                           String str4 = value != null ? value : "";
/* 120 */                           if (localName.length() > 0 && str4.length() > 0) {
/* 128 */                               int length3 = editable.length();
/* 134 */                               I11I1il i11I1il = new I11I1il();
/* 137 */                               i11I1il.I00000oIO = localName;
/* 139 */                               i11I1il.I00000oOI = str4;
/* 141 */                               VarHandle.storeStoreFence();
/* 146 */                               editable.setSpan(i11I1il, length3, length3, 17);
                                    }
                                }
/* 152 */                       return;
                            }
/* 152 */                   return;
                        }
                    }
/* 155 */           this.I00000oIO.startElement(str, str2, str3, attributes);
                }

                @Override
                public final void startPrefixMapping(String str, String str2) throws SAXException {
/* 3 */             this.I00000oIO.startPrefixMapping(str, str2);
                }
            }
