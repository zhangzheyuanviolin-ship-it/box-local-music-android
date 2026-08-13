            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.BuildConfig;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class OIlilOioI extends I1oO1oiO00O {
                public final byte[] I0000oI00;

                public OIlilOioI(OIlOoO oIlOoO) {
/* 10 */            super(new Ioo011Oi(oIlOoO.I0000Il00O()));
/* 17 */            new ArrayList(100);
/* 24 */            this.I0000oI00 = new byte[10];
                }

                /* JADX WARN: Code restructure failed: missing block: B:211:0x02da, code lost:
                
                    r16 = false;
                 */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x01e9 A[PHI: r7
                  0x01e9: PHI (r7v4 int) = (r7v3 int), (r7v3 int), (r7v5 int), (r7v3 int) binds: [B:82:0x0129, B:83:0x012b, B:150:0x01e7, B:87:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I001i1O0Ol() {
                    boolean z;
                    Object objI001i1O0Ol;
                    boolean z2;
                    int i;
                    char c;
/* 3 */             I001IIilI0O();
/* 6 */             OilOll oilOll = this.I00000oOI;
/* 12 */            if (oilOll.I00l0OO0IO()) {
/* 168 */               return null;
                    }
/* 20 */            char cPeek = (char) oilOll.peek();
/* 23 */            if (cPeek == '(') {
/* 773 */               return I000iOII();
                    }
/* 27 */            int i2 = 0;
/* 28 */            if (cPeek != '+') {
/* 32 */                if (cPeek == '<') {
/* 677 */                   int i3 = oilOll.read();
/* 685 */                   char cPeek2 = (char) oilOll.peek();
/* 686 */                   oilOll.I00ilO0(i3);
                            return cPeek2 == '<' ? I000OOo1O() : I000iOII();
                        }
/* 38 */                if (cPeek == 'B') {
/* 547 */                   String strI0010o = I0010o();
/* 551 */                   OIii101l1I0O oIii101l1I0OI00000oIO = OIii101l1I0O.I00000oIO(strI0010o);
/* 561 */                   if (strI0010o.equals("BI")) {
/* 565 */                       Map ol1I1i1 = new Ol1I1i1();
/* 568 */                       oIii101l1I0OI00000oIO.getClass();
                                while (true) {
/* 571 */                           objI001i1O0Ol = I001i1O0Ol();
/* 577 */                           if (!(objI001i1O0Ol instanceof IIi0I0I0o)) {
                                        break;
                                    }
/* 579 */                           Object objI001i1O0Ol2 = I001i1O0Ol();
/* 585 */                           if (!(objI001i1O0Ol2 instanceof IIOoOiOI)) {
/* 605 */                               Log.w("PdfBox-Android", "Unexpected token in inline image dictionary at offset " + oilOll.getPosition());
                                        break;
                                    }
/* 609 */                           IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) objI001i1O0Ol;
/* 611 */                           IIOoOiOI iIOoOiOI = (IIOoOiOI) objI001i1O0Ol2;
/* 615 */                           if ((ol1I1i1 instanceof Ol1I1i1) && ((Ol1I1i1) ol1I1i1).size() >= 1000) {
/* 630 */                               ol1I1i1 = new LinkedHashMap(ol1I1i1);
                                    }
/* 634 */                           ol1I1i1.put(iIi0I0I0o, iIOoOiOI);
                                }
/* 640 */                       if (objI001i1O0Ol instanceof OIii101l1I0O) {
/* 642 */                           OIii101l1I0O oIii101l1I0O = (OIii101l1I0O) objI001i1O0Ol;
/* 644 */                           byte[] bArr = oIii101l1I0O.I00000oOI;
/* 646 */                           if (bArr == null || bArr.length == 0) {
/* 669 */                               Log.w("PdfBox-Android", "empty inline image at stream offset " + oilOll.getPosition());
                                    }
/* 674 */                           oIii101l1I0OI00000oIO.I00000oOI = oIii101l1I0O.I00000oOI;
                                }
                            }
/* 676 */                   return oIii101l1I0OI00000oIO;
                        }
/* 40 */                int i4 = -1;
/* 41 */                int i5 = 73;
/* 43 */                if (cPeek != 'I') {
/* 47 */                    if (cPeek == '[') {
/* 228 */                       return I000O01llI0();
                            }
/* 49 */                    IIi0II0l0o iIi0II0l0o = IIi0II0l0o.I00iOIl;
/* 53 */                    if (cPeek == ']') {
/* 224 */                       oilOll.read();
/* 227 */                       return iIi0II0l0o;
                            }
/* 57 */                    if (cPeek != 'f') {
/* 61 */                        if (cPeek == 'n') {
/* 175 */                           String strI0010o2 = I0010o();
                                    return strI0010o2.equals("null") ? iIi0II0l0o : OIii101l1I0O.I00000oIO(strI0010o2);
                                }
/* 65 */                        if (cPeek != 't') {
                                    switch (cPeek) {
                                        case BuildConfig.VERSION_CODE:
                                        case '.':
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        case '/':
/* 170 */                                   return I000OiO();
                                        default:
/* 70 */                                    I001IIilI0O();
/* 76 */                                    StringBuilder sb = new StringBuilder(4);
/* 79 */                                    int iPeek = oilOll.peek();
/* 83 */                                    while (iPeek != -1 && !I1oO1oiO00O.I000II(iPeek) && iPeek != 93 && iPeek != 91 && iPeek != 60 && iPeek != 40 && iPeek != 47 && (iPeek < 48 || iPeek > 57)) {
/* 116 */                                       char c2 = (char) oilOll.read();
/* 117 */                                       int iPeek2 = oilOll.peek();
/* 121 */                                       sb.append(c2);
/* 126 */                                       if (c2 == 'd' && (iPeek2 == 48 || iPeek2 == 49)) {
/* 139 */                                           sb.append((char) oilOll.read());
/* 142 */                                           iPeek = oilOll.peek();
                                                } else {
/* 147 */                                           iPeek = iPeek2;
                                                }
                                            }
/* 153 */                                   String strTrim = sb.toString().trim();
/* 161 */                                   if (strTrim.length() > 0) {
/* 163 */                                       return OIii101l1I0O.I00000oIO(strTrim);
                                            }
/* 168 */                                   return null;
                                    }
                                }
                            }
/* 193 */                   String strI0010o3 = I0010o();
                            return strI0010o3.equals("true") ? IIOoOl1o1.I00iiI : strI0010o3.equals("false") ? IIOoOl1o1.I00iiO : OIii101l1I0O.I00000oIO(strI0010o3);
                        }
/* 258 */               String str = Character.toString((char) oilOll.read()) + ((char) oilOll.read());
/* 268 */               if (!str.equals("ID")) {
/* 528 */                   StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Error: Expected operator 'ID' actual='", str, "' at stream offset ");
/* 536 */                   sbI001IIilI0O.append(oilOll.getPosition());
/* 546 */                   throw new IOException(sbI001IIilI0O.toString());
                        }
/* 272 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 283 */               if (I1oO1oiO00O.I000II(oilOll.peek())) {
/* 285 */                   oilOll.read();
                        }
/* 288 */               int i6 = oilOll.read();
/* 292 */               int i7 = oilOll.read();
                        while (true) {
/* 298 */                   if (i6 != 69 || i7 != i5) {
/* 494 */                       if (oilOll.I00l0OO0IO()) {
                                    break;
                                }
/* 496 */                       byteArrayOutputStream.write(i6);
/* 503 */                       int i8 = i7;
/* 499 */                       i7 = oilOll.read();
/* 505 */                       i6 = i8;
/* 506 */                       i2 = 0;
/* 507 */                       i5 = 73;
                            } else {
/* 302 */                       int iPeek3 = oilOll.peek();
/* 310 */                       byte b = 10;
/* 312 */                       if (iPeek3 == 10 || iPeek3 == 13 || iPeek3 == 32) {
/* 318 */                           byte[] bArr2 = this.I0000oI00;
/* 320 */                           int i9 = oilOll.read(bArr2, i2, 10);
/* 324 */                           if (i9 > 0) {
/* 326 */                               int i10 = i2;
/* 327 */                               int i11 = i4;
/* 328 */                               int i12 = i11;
/* 329 */                               while (i10 < i9) {
/* 331 */                                   byte b2 = bArr2[i10];
/* 335 */                                   if ((b2 != 0 && b2 < 9) || (b2 > b && b2 < 32 && b2 != 13)) {
/* 347 */                                       z2 = false;
/* 348 */                                       i = -1;
                                                break;
                                            }
/* 350 */                                   int i13 = -1;
/* 351 */                                   if (i11 == -1) {
/* 353 */                                       if (b2 != 0 && b2 != 9 && b2 != 32 && b2 != 10) {
/* 363 */                                           c = '\r';
/* 365 */                                           if (b2 != 13) {
/* 367 */                                               i11 = i10;
                                                    }
                                                }
/* 369 */                                       i13 = -1;
/* 370 */                                       if (i11 == i13) {
/* 393 */                                           c = '\r';
                                                }
                                            } else if (i11 == i13 && i12 == i13) {
/* 374 */                                       if (b2 == 0 || b2 == 9 || b2 == 32 || b2 == 10) {
/* 389 */                                           c = '\r';
                                                } else {
/* 384 */                                           c = '\r';
/* 386 */                                           if (b2 == 13) {
                                                    }
                                                }
/* 391 */                                       i12 = i10;
                                            } else {
/* 393 */                                       c = '\r';
                                            }
/* 395 */                                   i10++;
/* 398 */                                   i4 = -1;
/* 399 */                                   b = 10;
                                        }
/* 402 */                               i = i4;
/* 403 */                               z2 = true;
/* 404 */                               if (i12 != i && i11 != i) {
/* 412 */                                   String str2 = new String(bArr2, i11, i12 - i11);
/* 421 */                                   if (!"Q".equals(str2) && !"EMC".equals(str2) && !OIlOl1.I00iiI.equals(str2)) {
/* 439 */                                       z2 = false;
                                            }
                                        }
/* 442 */                               i4 = -1;
/* 443 */                               if (i9 == 10) {
/* 445 */                                   int i14 = (i11 == -1 || i12 != -1) ? i12 : 10;
/* 451 */                                   if (i14 != -1 && i11 != -1 && i14 - i11 > 3) {
/* 459 */                                       z2 = false;
                                            }
                                        }
/* 460 */                               oilOll.I001lIiIIo1O(i9, bArr2);
                                    } else {
/* 464 */                               z2 = true;
                                    }
/* 465 */                           if (!z2) {
/* 485 */                               Log.w("PdfBox-Android", "ignoring 'EI' assumed to be in the middle of inline image at stream offset " + oilOll.getPosition());
                                    }
/* 488 */                           if (z2) {
                                        break;
                                    }
                                }
                            }
                        }
/* 511 */               OIii101l1I0O oIii101l1I0OI00000oIO2 = OIii101l1I0O.I00000oIO("ID");
/* 519 */               oIii101l1I0OI00000oIO2.I00000oOI = byteArrayOutputStream.toByteArray();
/* 521 */               return oIii101l1I0OI00000oIO2;
                    }
/* 703 */           StringBuilder sb2 = new StringBuilder();
/* 706 */           sb2.append(cPeek);
/* 709 */           oilOll.read();
/* 714 */           if (cPeek == '-' && oilOll.peek() == cPeek) {
/* 722 */               oilOll.read();
                    }
/* 727 */           if (cPeek != '.') {
/* 729 */               z = true;
                        while (true) {
/* 735 */                   char cPeek3 = (char) oilOll.peek();
/* 740 */                   if (!Character.isDigit(cPeek3) && ((!z || cPeek3 != '.') && cPeek3 != '-')) {
/* 753 */                       return IIi0IoOo.I00l0I0l0lO1(sb2.toString());
                            }
/* 758 */                   if (cPeek3 != '-') {
/* 760 */                       sb2.append(cPeek3);
                            }
/* 763 */                   oilOll.read();
/* 766 */                   if (!z || cPeek3 != '.') {
                            }
                        }
                    }
/* 770 */           z = false;
                }
            }
