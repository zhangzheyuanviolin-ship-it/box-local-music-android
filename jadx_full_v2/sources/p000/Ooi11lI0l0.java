            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            public abstract class Ooi11lI0l0 {
                public static final List I00000oIO = Collections.singletonList("");

                public static final int I00000oIO(int i, int i2, String str) {
/* 2 */             boolean z = false;
/* 3 */             while (i < i2) {
/* 5 */                 char cCharAt = str.charAt(i);
/* 11 */                if (cCharAt != ':') {
/* 15 */                    if (cCharAt == '[') {
/* 24 */                        z = true;
                            } else if (cCharAt == ']') {
/* 22 */                        z = false;
                            }
                        } else if (!z) {
/* 28 */                    return i;
                        }
/* 29 */                i++;
                    }
/* 32 */            return -1;
                }

                public static final void I00000oOI(Ooi11l0lI ooi11l0lI, String str) {
/* 5 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 7 */                 return;
                    }
                    try {
/* 8 */                 I0000Il00O(ooi11l0lI, str);
                    } catch (Throwable th) {
/* 89 */                throw new IOIoIlIlO("Fail to parse url: ".concat(str), th, 8);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(Ooi11l0lI ooi11l0lI, String str) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    OlOo0II oIol1oo0il;
                    List listI00Io1o110i;
                    int iIntValue;
/* 5 */             int length = str.length();
/* 9 */             int i9 = 0;
                    while (true) {
/* 10 */                i = -1;
/* 11 */                if (i9 >= length) {
/* 27 */                    i9 = -1;
                            break;
                        } else if (!iOlI1lIi0.I0000Il00O(str.charAt(i9))) {
                            break;
                        } else {
/* 24 */                    i9++;
                        }
                    }
                    int length2 = str.length() - 1;
/* 33 */            if (length2 >= 0) {
                        while (true) {
                            int i10 = length2 - 1;
/* 45 */                    if (!iOlI1lIi0.I0000Il00O(str.charAt(length2))) {
                                break;
                            } else if (i10 < 0) {
                                break;
                            } else {
/* 51 */                        length2 = i10;
                            }
                        }
/* 53 */                length2 = -1;
                    } else {
/* 53 */                length2 = -1;
                    }
/* 54 */            int i11 = length2 + 1;
/* 56 */            char cCharAt = str.charAt(i9);
/* 60 */            char c = 'A';
/* 68 */            if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
/* 80 */                i2 = i9;
/* 81 */                i3 = i2;
                    } else {
/* 77 */                i2 = i9;
/* 78 */                i3 = -1;
                    }
/* 88 */            while (i2 < i11) {
/* 90 */                char cCharAt2 = str.charAt(i2);
/* 96 */                if (cCharAt2 == ':') {
/* 98 */                    if (i3 != -1) {
/* 108 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i3, "Illegal character in scheme at position "));
/* 111 */                       return;
                            }
/* 100 */                   i4 = i2 - i9;
/* 158 */                   int i12 = 1;
/* 159 */                   if (i4 > 0) {
/* 163 */                       String strSubstring = str.substring(i9, i9 + i4);
/* 167 */                       Ooi11o11o ooi11o11o = Ooi11o11o.I00iiO;
/* 169 */                       int length3 = strSubstring.length();
/* 173 */                       int i13 = 0;
                                while (true) {
/* 176 */                           if (i13 >= length3) {
/* 212 */                               i13 = -1;
                                        break;
                                    }
/* 178 */                           char cCharAt3 = strSubstring.charAt(i13);
/* 202 */                           if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ' ')) != cCharAt3) {
                                        break;
                                    } else {
/* 205 */                               i13++;
                                    }
                                }
/* 213 */                       if (i13 != -1) {
/* 222 */                           StringBuilder sb = new StringBuilder(strSubstring.length());
/* 226 */                           sb.append((CharSequence) strSubstring, 0, i13);
/* 229 */                           int iI00111O = OlOoOIi0o.I00111O(strSubstring);
/* 233 */                           if (i13 <= iI00111O) {
                                        while (true) {
/* 235 */                                   char cCharAt4 = strSubstring.charAt(i13);
/* 239 */                                   if (c <= cCharAt4 && cCharAt4 < '[') {
/* 247 */                                       cCharAt4 = (char) (cCharAt4 + ' ');
                                            } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
/* 256 */                                       cCharAt4 = Character.toLowerCase(cCharAt4);
                                            }
/* 260 */                                   sb.append(cCharAt4);
/* 263 */                                   if (i13 == iI00111O) {
                                                break;
                                            }
/* 265 */                                   i13++;
/* 267 */                                   c = 'A';
                                        }
                                    }
/* 270 */                           strSubstring = sb.toString();
                                }
/* 280 */                       Ooi11o11o ooi11o11o2 = (Ooi11o11o) Ooi11o11o.I00iio.get(strSubstring);
/* 282 */                       if (ooi11o11o2 == null) {
/* 287 */                           ooi11o11o2 = new Ooi11o11o(strSubstring, 0);
                                }
/* 290 */                       ooi11l0lI.I0000O = ooi11o11o2;
/* 293 */                       i9 += i4 + 1;
                            }
/* 306 */                   if (!ooi11l0lI.I0000O().I00iOIl.equals("data")) {
/* 312 */                       ooi11l0lI.I00000oIO = str.substring(i9, i11);
/* 314 */                       return;
                            }
/* 315 */                   int i14 = 0;
                            while (true) {
/* 316 */                       i5 = i9 + i14;
/* 318 */                       if (i5 >= i11 || str.charAt(i5) != '/') {
                                    break;
                                } else {
/* 326 */                           i14++;
                                }
                            }
/* 345 */                   if (ooi11l0lI.I0000O().I00iOIl.equals("file")) {
/* 349 */                       if (i14 == 1) {
/* 410 */                           ooi11l0lI.I00000oIO = "";
/* 416 */                           lOoo111010.I0000O(ooi11l0lI, str.substring(i5, i11));
/* 419 */                           return;
                                }
/* 351 */                       if (i14 != 2) {
/* 354 */                           if (i14 != 3) {
/* 376 */                               I000II.I000iOII("Invalid file url: ".concat(str));
/* 379 */                               return;
                                    } else {
/* 356 */                               ooi11l0lI.I00000oIO = "";
/* 366 */                               lOoo111010.I0000O(ooi11l0lI, "/".concat(str.substring(i5, i11)));
/* 369 */                               return;
                                    }
                                }
/* 380 */                       int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '/', i5, 4);
/* 384 */                       if (iI001i1O0Ol == -1 || iI001i1O0Ol == i11) {
/* 407 */                           ooi11l0lI.I00000oIO = str.substring(i5, i11);
/* 409 */                           return;
                                } else {
/* 393 */                           ooi11l0lI.I00000oIO = str.substring(i5, iI001i1O0Ol);
/* 399 */                           lOoo111010.I0000O(ooi11l0lI, str.substring(iI001i1O0Ol, i11));
/* 402 */                           return;
                                }
                            }
/* 434 */                   if (ooi11l0lI.I0000O().I00iOIl.equals("mailto")) {
/* 436 */                       if (i14 != 0) {
/* 491 */                           I000II.I000iOII("Failed requirement.");
/* 494 */                           return;
                                }
/* 441 */                       int iI001i1lo1io = OlOoOIi0o.I001i1lo1io(str, "@", i5, false, 4);
/* 445 */                       if (iI001i1lo1io == -1) {
/* 487 */                           I000II.I000iOII(IlIi0I0.I000lI("Invalid mailto url: ", str, ", it should contain '@'."));
/* 490 */                           return;
                                }
/* 447 */                       String strSubstring2 = str.substring(i5, iI001i1lo1io);
/* 451 */                       int length4 = strSubstring2.length();
/* 455 */                       Charset charset = IO1IOI.I00000oIO;
/* 457 */                       String strI00000oOI = IOOIli0I.I00000oOI(strSubstring2, 0, length4, false);
/* 469 */                       ooi11l0lI.I0000oI00 = strI00000oOI != null ? IOOIli0I.I0000oI00(strI00000oOI, false) : null;
/* 476 */                       ooi11l0lI.I00000oIO = str.substring(iI001i1lo1io + 1, i11);
/* 478 */                       return;
                            }
/* 507 */                   if (ooi11l0lI.I0000O().I00iOIl.equals("about")) {
/* 509 */                       if (i14 == 0) {
/* 515 */                           ooi11l0lI.I00000oIO = str.substring(i5, i11);
/* 517 */                           return;
                                } else {
/* 518 */                           I000II.I000iOII("Failed requirement.");
/* 521 */                           return;
                                }
                            }
/* 534 */                   if (ooi11l0lI.I0000O().I00iOIl.equals("tel")) {
/* 536 */                       if (i14 == 0) {
/* 542 */                           ooi11l0lI.I00000oIO = str.substring(i5, i11);
/* 544 */                           return;
                                } else {
/* 545 */                           I000II.I000iOII("Failed requirement.");
/* 548 */                           return;
                                }
                            }
/* 549 */                   if (i14 >= 2) {
                                while (true) {
/* 552 */                           char[] cArr = new char[5];
/* 554 */                           int i15 = 0;
/* 555 */                           for (int i16 = 5; i15 < i16; i16 = 5) {
/* 563 */                               cArr[i15] = "@/\\?#".charAt(i15);
/* 565 */                               i15++;
                                    }
/* 570 */                           int iI001iOo1i0O = OlOoOIi0o.I001iOo1i0O(str, cArr, i5, false);
/* 574 */                           Integer numValueOf = Integer.valueOf(iI001iOo1i0O);
/* 578 */                           if (iI001iOo1i0O <= 0) {
/* 581 */                               numValueOf = null;
                                    }
/* 589 */                           iIntValue = numValueOf != null ? numValueOf.intValue() : i11;
/* 590 */                           if (iIntValue >= i11 || str.charAt(iIntValue) != '@') {
                                        break;
                                    }
/* 600 */                           int iI00000oIO = I00000oIO(i5, iIntValue, str);
/* 604 */                           if (iI00000oIO != -1) {
/* 610 */                               ooi11l0lI.I0000oI00 = str.substring(i5, iI00000oIO);
/* 618 */                               ooi11l0lI.I0001Ioi1lo = str.substring(iI00000oIO + 1, iIntValue);
                                    } else {
/* 625 */                               ooi11l0lI.I0000oI00 = str.substring(i5, iIntValue);
                                    }
/* 627 */                           i5 = iIntValue + 1;
                                }
/* 630 */                       int iI00000oIO2 = I00000oIO(i5, iIntValue, str);
/* 634 */                       Integer numValueOf2 = Integer.valueOf(iI00000oIO2);
/* 638 */                       if (iI00000oIO2 <= 0) {
/* 641 */                           numValueOf2 = null;
                                }
/* 649 */                       int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
/* 650 */                       String strSubstring3 = str.substring(i5, iIntValue2);
/* 659 */                       for (int i17 = 0; i17 < strSubstring3.length(); i17++) {
/* 669 */                           if (iOlI1lIi0.I0000Il00O(strSubstring3.charAt(i17))) {
/* 682 */                               I000II.I0010I0i(IIl001iO0Io.I000iOII('\"', "Host cannot contain whitespace characters: \"", strSubstring3));
/* 685 */                               return;
                                    }
                                }
/* 686 */                       ooi11l0lI.I00000oIO = strSubstring3;
/* 688 */                       int i18 = iIntValue2 + 1;
/* 701 */                       ooi11l0lI.I0000oI00(i18 < iIntValue ? Integer.parseInt(str.substring(i18, iIntValue)) : 0);
/* 704 */                       i5 = iIntValue;
                            }
/* 705 */                   List list = I00000oIO;
/* 707 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 709 */                   if (i5 >= i11) {
/* 715 */                       if (str.charAt(length2) != '/') {
/* 718 */                           list = il01100l;
                                }
/* 719 */                       ooi11l0lI.I000O01llI0 = list;
/* 721 */                       return;
                            }
/* 732 */                   ooi11l0lI.I000O01llI0 = i14 == 0 ? IOOi0Ool1i.I001l0I00(ooi11l0lI.I000O01llI0) : il01100l;
/* 734 */                   char[] cArr2 = new char[2];
/* 737 */                   for (int i19 = 0; i19 < 2; i19++) {
/* 745 */                       cArr2[i19] = "?#".charAt(i19);
                            }
/* 751 */                   int iI001iOo1i0O2 = OlOoOIi0o.I001iOo1i0O(str, cArr2, i5, false);
/* 755 */                   Integer numValueOf3 = Integer.valueOf(iI001iOo1i0O2);
/* 759 */                   if (iI001iOo1i0O2 <= 0) {
/* 762 */                       numValueOf3 = null;
                            }
/* 770 */                   int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i11;
/* 771 */                   if (iIntValue3 > i5) {
/* 773 */                       String strSubstring4 = str.substring(i5, iIntValue3);
/* 801 */                       List list2 = (ooi11l0lI.I000O01llI0.size() == 1 && ((CharSequence) IOOi0Ool1i.I001lllioOl(ooi11l0lI.I000O01llI0)).length() == 0) ? il01100l : ooi11l0lI.I000O01llI0;
/* 807 */                       if (strSubstring4.equals("/")) {
/* 809 */                           listI00Io1o110i = list;
/* 810 */                           i6 = 0;
                                } else {
/* 815 */                           i6 = 0;
/* 819 */                           listI00Io1o110i = OlOoOIi0o.I00Io1o110i(strSubstring4, new char[]{'/'});
                                }
/* 823 */                       if (i14 != 1) {
/* 826 */                           list = il01100l;
                                }
/* 841 */                       ooi11l0lI.I000O01llI0 = IOOi0Ool1i.I00O10llo(list2, IOOi0Ool1i.I00O10llo(list, listI00Io1o110i));
/* 843 */                       i5 = iIntValue3;
                            } else {
/* 845 */                       i6 = 0;
                            }
/* 847 */                   if (i5 < i11 && str.charAt(i5) == '?') {
/* 857 */                       int i20 = i5 + 1;
/* 859 */                       if (i20 == i11) {
/* 861 */                           ooi11l0lI.I00000oOI = true;
/* 863 */                           i5 = i11;
                                } else {
/* 868 */                           int iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(str, '#', i20, 4);
/* 880 */                           Integer numValueOf4 = iI001i1O0Ol2 > 0 ? Integer.valueOf(iI001i1O0Ol2) : null;
/* 888 */                           int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i11;
/* 889 */                           String strSubstring5 = str.substring(i20, iIntValue4);
/* 897 */                           if (OlOoOIi0o.I00111O(strSubstring5) < 0) {
/* 901 */                               OIol1IIoIOoO.I00000oOI.getClass();
/* 904 */                               oIol1oo0il = OIol11.I00000oOI;
                                    } else {
/* 907 */                               OIol11 oIol11 = OIol1IIoIOoO.I00000oOI;
/* 911 */                               Io1O0I1i io1O0I1i = new Io1O0I1i(i12);
/* 914 */                               int iI00111O2 = OlOoOIi0o.I00111O(strSubstring5);
/* 920 */                               if (iI00111O2 >= 0) {
/* 922 */                                   int i21 = -1;
/* 923 */                                   i7 = i6;
/* 925 */                                   int i22 = i7;
/* 926 */                                   i8 = i22;
/* 927 */                                   while (i7 != 1000) {
/* 930 */                                       char cCharAt5 = strSubstring5.charAt(i22);
/* 936 */                                       if (cCharAt5 == '&') {
/* 947 */                                           lIiO1lOl.I00000oIO(io1O0I1i, strSubstring5, i8, i21, i22);
/* 950 */                                           i8 = i22 + 1;
/* 952 */                                           i7++;
/* 954 */                                           i21 = -1;
                                                } else if (cCharAt5 == '=' && i21 == -1) {
/* 945 */                                           i21 = i22;
                                                }
/* 955 */                                       if (i22 != iI00111O2) {
/* 957 */                                           i22++;
                                                } else {
/* 960 */                                           i = i21;
                                                }
                                            }
/* 981 */                                   oIol1oo0il = new OIol1oo0il((Map) io1O0I1i.I00iOIl, true);
                                        } else {
/* 962 */                                   i7 = i6;
/* 964 */                                   i8 = i7;
                                        }
/* 965 */                               if (i7 != 1000) {
/* 972 */                                   lIiO1lOl.I00000oIO(io1O0I1i, strSubstring5, i8, i, strSubstring5.length());
                                        }
/* 981 */                               oIol1oo0il = new OIol1oo0il((Map) io1O0I1i.I00iOIl, true);
                                    }
/* 988 */                           Ol0Oo0 ol0Oo0 = new Ol0Oo0(8);
/* 991 */                           ol0Oo0.I00iiI = ooi11l0lI;
/* 993 */                           VarHandle.storeStoreFence();
/* 996 */                           oIol1oo0il.I000OOo1O(ol0Oo0);
/* 999 */                           i5 = iIntValue4;
                                }
                            }
/* 1000 */                  if (i5 >= i11 || str.charAt(i5) != '#') {
/* 2988 */                      return;
                            }
/* 1015 */                  ooi11l0lI.I000II = str.substring(i5 + 1, i11);
/* 2988 */                  return;
                        }
/* 112 */               if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                            break;
                        }
/* 118 */               if (i3 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
/* 151 */                   i3 = i2;
                        }
/* 152 */               i2++;
                    }
/* 157 */           i4 = -1;
/* 158 */           int i122 = 1;
/* 159 */           if (i4 > 0) {
                    }
/* 306 */           if (!ooi11l0lI.I0000O().I00iOIl.equals("data")) {
                    }
                }
            }
