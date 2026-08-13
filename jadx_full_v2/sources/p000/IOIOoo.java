            package p000;

            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class IOIOoo {
                public static final String I00000oIO;
                public static final LinkedHashMap I00000oOI;

                static {
                    String str;
/* 55 */            String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
/* 59 */            I00000oIO = strI00IlilI0i0i;
/* 63 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 102 */           List listI000O01llI0 = IOOi1I.I000O01llI0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", OIlOl1.I00iiI, "Int", "I", "Float", "F", "Long", "J", OIllioIilO.I0111i, OIlOl1.I00iiO);
/* 117 */           int iI00000oIO = lIO01iiiOOo.I00000oIO(0, listI000O01llI0.size() - 1, 2);
/* 121 */           if (iI00000oIO >= 0) {
/* 123 */               int i = 0;
                        while (true) {
/* 126 */                   StringBuilder sb = new StringBuilder();
/* 129 */                   str = I00000oIO;
/* 131 */                   sb.append(str);
/* 136 */                   sb.append('/');
/* 145 */                   sb.append((String) listI000O01llI0.get(i));
/* 152 */                   int i2 = i + 1;
/* 158 */                   linkedHashMap.put(sb.toString(), listI000O01llI0.get(i2));
/* 163 */                   StringBuilder sb2 = new StringBuilder();
/* 166 */                   sb2.append(str);
/* 169 */                   sb2.append('/');
/* 204 */                   linkedHashMap.put(IIl001iO0Io.I00100l0(sb2, (String) listI000O01llI0.get(i), "Array"), "[" + ((String) listI000O01llI0.get(i2)));
/* 207 */                   if (i == iI00000oIO) {
                                break;
                            } else {
/* 209 */                       i += 2;
                            }
                        }
/* 212 */               strI00IlilI0i0i = str;
                    }
/* 232 */           linkedHashMap.put(strI00IlilI0i0i + "/Unit", "V");
/* 239 */           I00000oIO(linkedHashMap, "Any", "java/lang/Object");
/* 246 */           I00000oIO(linkedHashMap, "Nothing", "java/lang/Void");
/* 253 */           I00000oIO(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
/* 286 */           for (String str2 : IOOi1I.I000O01llI0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
/* 308 */               I00000oIO(linkedHashMap, str2, "java/lang/" + str2);
                    }
/* 340 */           for (String str3 : IOOi1I.I000O01llI0("Iterator", "Collection", OIlllOo01.I00iio, "Set", "Map", "ListIterator")) {
/* 368 */               I00000oIO(linkedHashMap, IIl001iO0Io.I000o00OoI0I("collections/", str3), "java/util/" + str3);
/* 397 */               I00000oIO(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
                    }
/* 405 */           I00000oIO(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
/* 410 */           I00000oIO(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
/* 417 */           I00000oIO(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
/* 422 */           I00000oIO(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
/* 427 */           for (int i3 = 0; i3 < 23; i3++) {
/* 431 */               String strI000oI1ioi = Oi010OO0.I000oI1ioi(i3, "Function");
/* 437 */               StringBuilder sb3 = new StringBuilder();
/* 440 */               String str4 = I00000oIO;
/* 442 */               sb3.append(str4);
/* 447 */               sb3.append("/jvm/functions/Function");
/* 450 */               sb3.append(i3);
/* 457 */               I00000oIO(linkedHashMap, strI000oI1ioi, sb3.toString());
/* 491 */               I00000oIO(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
                    }
/* 531 */           for (String str5 : IOOi1I.I000O01llI0("Char", "Byte", "Short", "Int", "Float", "Long", OIllioIilO.I0111i, "String", "Enum")) {
/* 560 */               I00000oIO(linkedHashMap, Oi010OO0.I00111O(str5, ".Companion"), IIl001iO0Io.I00100o1O0lo(new StringBuilder(), I00000oIO, "/jvm/internal/", str5, "CompanionObject"));
                    }
/* 564 */           I00000oOI = linkedHashMap;
                }

                public static final void I00000oIO(LinkedHashMap linkedHashMap, String str, String str2) {
/* 42 */            linkedHashMap.put(I00000oIO + '/' + str, OlIo0Ooi1loI.I001IIilI0O + str2 + ';');
                }

                public static final String I00000oOI(String str) {
/* 7 */             String str2 = (String) I00000oOI.get(str);
/* 9 */             if (str2 != null) {
/* 49 */                return str2;
                    }
/* 34 */            return OlIo0Ooi1loI.I001IIilI0O + str.replace('.', '$') + ';';
                }
            }
