            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iioIIll1 {
                public static IOoOloI0iI I00000oIO(String str) throws I1o1lOlooI1 {
                    List list;
                    OIoi0IIoi oIoi0IIoi;
/* 7 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 9 */                 return IOoOloI0iI.I0000oI00;
                    }
/* 21 */            O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iiI, new Iloi111(8));
/* 25 */            int i = 0;
                    while (true) {
/* 26 */                int iI00111O = OlOoOIi0o.I00111O(str);
/* 30 */                list = Il01100l.I00iOIl;
/* 34 */                if (i > iI00111O) {
                            break;
                        }
/* 44 */                O0ioIllo0i1 o0ioIllo0i1I00000oIO2 = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iiI, new Iloi111(7));
/* 48 */                Integer numValueOf = null;
/* 49 */                int i2 = i;
                        while (true) {
/* 54 */                    if (i2 <= OlOoOIi0o.I00111O(str)) {
/* 56 */                        char cCharAt = str.charAt(i2);
/* 62 */                        if (cCharAt == ',') {
/* 346 */                           ArrayList arrayList = (ArrayList) o0ioIllo0i1I00000oIO.getValue();
/* 366 */                           String string = OlOoOIi0o.I00OIo(str.substring(i, numValueOf != null ? numValueOf.intValue() : i2)).toString();
/* 374 */                           if (o0ioIllo0i1I00000oIO2.I00000oOI()) {
/* 381 */                               list = (List) o0ioIllo0i1I00000oIO2.getValue();
                                    }
/* 386 */                           arrayList.add(new Io1Iil10(string, list));
/* 389 */                           i2++;
                                } else if (cCharAt != ';') {
/* 68 */                            i2++;
                                } else {
/* 71 */                            if (numValueOf == null) {
/* 73 */                                numValueOf = Integer.valueOf(i2);
                                    }
/* 77 */                            int i3 = i2 + 1;
/* 79 */                            int i4 = i3;
/* 86 */                            while (i4 <= OlOoOIi0o.I00111O(str)) {
/* 88 */                                char cCharAt2 = str.charAt(i4);
/* 92 */                                if (cCharAt2 == ',' || cCharAt2 == ';') {
/* 332 */                                   io011Ii.I00000oIO(o0ioIllo0i1I00000oIO2, str, i3, i4, "");
                                            break;
                                        }
/* 98 */                                if (cCharAt2 != '=') {
/* 100 */                                   i4++;
                                        } else {
/* 103 */                                   int i5 = i4 + 1;
/* 109 */                                   if (str.length() == i5) {
/* 117 */                                       oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i5), "");
                                            } else {
/* 126 */                                       char c = '\"';
/* 128 */                                       if (str.charAt(i5) == '\"') {
/* 130 */                                           int i6 = i4 + 2;
/* 134 */                                           StringBuilder sb = new StringBuilder();
/* 141 */                                           while (i6 <= OlOoOIi0o.I00111O(str)) {
/* 143 */                                               char cCharAt3 = str.charAt(i6);
/* 147 */                                               if (cCharAt3 == c) {
/* 149 */                                                   int i7 = i6 + 1;
/* 151 */                                                   int i8 = i7;
/* 157 */                                                   while (i8 < str.length() && str.charAt(i8) == ' ') {
/* 165 */                                                       i8++;
                                                            }
/* 172 */                                                   if (i8 == str.length() || str.charAt(i8) == ';' || str.charAt(i8) == ',') {
/* 196 */                                                       oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i7), sb.toString());
                                                                break;
                                                            }
                                                        }
/* 203 */                                               if (cCharAt3 != '\\' || i6 >= OlOoOIi0o.I00111O(str) - 2) {
/* 227 */                                                   sb.append(cCharAt3);
/* 230 */                                                   i6++;
                                                        } else {
/* 219 */                                                   sb.append(str.charAt(i6 + 1));
/* 222 */                                                   i6 += 2;
                                                        }
/* 224 */                                               c = '\"';
                                                    }
/* 249 */                                           oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i6), "\"".concat(sb.toString()));
                                                } else {
/* 253 */                                           int i9 = i5;
/* 258 */                                           while (i9 <= OlOoOIi0o.I00111O(str)) {
/* 260 */                                               char cCharAt4 = str.charAt(i9);
/* 264 */                                               if (cCharAt4 == ',' || cCharAt4 == ';') {
/* 289 */                                                   oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i9), OlOoOIi0o.I00OIo(str.substring(i5, i9)).toString());
                                                            break;
                                                        }
/* 268 */                                               i9++;
                                                    }
/* 311 */                                           oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i9), OlOoOIi0o.I00OIo(str.substring(i5, i9)).toString());
                                                }
                                            }
/* 318 */                                   int iIntValue = ((Number) oIoi0IIoi.I00iOIl).intValue();
/* 326 */                                   io011Ii.I00000oIO(o0ioIllo0i1I00000oIO2, str, i3, i4, (String) oIoi0IIoi.I00iiI);
/* 329 */                                   i2 = iIntValue;
                                        }
                                    }
/* 338 */                           io011Ii.I00000oIO(o0ioIllo0i1I00000oIO2, str, i3, i4, "");
/* 335 */                           i2 = i4;
                                }
                            } else {
/* 398 */                       ArrayList arrayList2 = (ArrayList) o0ioIllo0i1I00000oIO.getValue();
/* 418 */                       String string2 = OlOoOIi0o.I00OIo(str.substring(i, numValueOf != null ? numValueOf.intValue() : i2)).toString();
/* 426 */                       if (o0ioIllo0i1I00000oIO2.I00000oOI()) {
/* 433 */                           list = (List) o0ioIllo0i1I00000oIO2.getValue();
                                }
/* 438 */                       arrayList2.add(new Io1Iil10(string2, list));
                            }
                        }
/* 391 */               i = i2;
                    }
/* 446 */           if (o0ioIllo0i1I00000oIO.I00000oOI()) {
/* 453 */               list = (List) o0ioIllo0i1I00000oIO.getValue();
                    }
/* 459 */           Io1Iil10 io1Iil10 = (Io1Iil10) IOOi0Ool1i.I00Io1o110i(list);
/* 461 */           String str2 = io1Iil10.I00000oIO;
/* 463 */           List list2 = io1Iil10.I00000oOI;
/* 469 */           int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str2, '/', 0, 6);
/* 474 */           if (iI001i1O0Ol == -1) {
/* 490 */               if (O0000Ioio00.I0000O(OlOoOIi0o.I00OIo(str2).toString(), "*")) {
/* 492 */                   return IOoOloI0iI.I0000oI00;
                        }
/* 500 */               throw new I1o1lOlooI1(str);
                    }
/* 509 */           String string3 = OlOoOIi0o.I00OIo(OlOoOIi0o.I00OIl(iI001i1O0Ol, str2)).toString();
/* 517 */           if (string3.length() == 0) {
/* 966 */               throw new I1o1lOlooI1(str);
                    }
/* 529 */           String string4 = OlOoOIi0o.I00OIo(str2.substring(iI001i1O0Ol + 1)).toString();
/* 537 */           if (OlOoOIi0o.I00100l0(string3, ' ') || OlOoOIi0o.I00100l0(string4, ' ')) {
/* 574 */               throw new I1o1lOlooI1(str);
                    }
/* 549 */           if (string4.length() == 0 || OlOoOIi0o.I00100l0(string4, '/')) {
/* 568 */               throw new I1o1lOlooI1(str);
                    }
/* 559 */           return new IOoOloI0iI(string3, string4, list2);
                }
            }
