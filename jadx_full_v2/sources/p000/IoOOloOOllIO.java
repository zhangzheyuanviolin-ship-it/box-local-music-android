            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IoOOloOOllIO {
                public String I00000oIO;
                public String I0000O;
                public final ArrayList I0001Ioi1lo;
                public ArrayList I000II;
                public String I000O01llI0;
                public String I00000oOI = "";
                public String I0000Il00O = "";
                public int I0000oI00 = -1;

                public IoOOloOOllIO() {
/* 15 */            ArrayList arrayList = new ArrayList();
/* 18 */            this.I0001Ioi1lo = arrayList;
/* 20 */            arrayList.add("");
                }

                public final IoOi01OlIl1o I00000oIO() {
                    ArrayList arrayList;
/* 1 */             String str = this.I00000oIO;
/* 4 */             if (str == null) {
/* 161 */               I000II.I001IO000("scheme == null");
/* 3 */                 return null;
                    }
/* 10 */            String strI000lI = iOl0lOIi11.I000lI(0, 0, 7, this.I00000oOI);
/* 16 */            String strI000lI2 = iOl0lOIi11.I000lI(0, 0, 7, this.I0000Il00O);
/* 20 */            String str2 = this.I0000O;
/* 22 */            if (str2 == null) {
/* 155 */               I000II.I001IO000("host == null");
/* 3 */                 return null;
                    }
/* 24 */            int iI00000oOI = I00000oOI();
/* 30 */            ArrayList arrayList2 = this.I0001Ioi1lo;
/* 38 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 41 */            Iterator it = arrayList2.iterator();
/* 49 */            while (it.hasNext()) {
/* 61 */                arrayList3.add(iOl0lOIi11.I000lI(0, 0, 7, (String) it.next()));
                    }
/* 65 */            ArrayList<String> arrayList4 = this.I000II;
/* 67 */            if (arrayList4 != null) {
/* 75 */                arrayList = new ArrayList(IOOi1I.I0000O(arrayList4, 10));
/* 86 */                for (String str3 : arrayList4) {
/* 103 */                   arrayList.add(str3 != null ? iOl0lOIi11.I000lI(0, 0, 3, str3) : null);
                        }
                    } else {
/* 107 */               arrayList = null;
                    }
/* 108 */           String str4 = this.I000O01llI0;
/* 112 */           String strI000lI3 = str4 != null ? iOl0lOIi11.I000lI(0, 0, 7, str4) : null;
/* 116 */           String string = toString();
/* 122 */           IoOi01OlIl1o ioOi01OlIl1o = new IoOi01OlIl1o();
/* 125 */           ioOi01OlIl1o.I00000oIO = str;
/* 127 */           ioOi01OlIl1o.I00000oOI = strI000lI;
/* 129 */           ioOi01OlIl1o.I0000Il00O = strI000lI2;
/* 131 */           ioOi01OlIl1o.I0000O = str2;
/* 133 */           ioOi01OlIl1o.I0000oI00 = iI00000oOI;
/* 135 */           ioOi01OlIl1o.I0001Ioi1lo = arrayList;
/* 137 */           ioOi01OlIl1o.I000II = strI000lI3;
/* 139 */           ioOi01OlIl1o.I000O01llI0 = string;
/* 147 */           ioOi01OlIl1o.I000OOo1O = str.equals("https");
/* 149 */           VarHandle.storeStoreFence();
/* 152 */           return ioOi01OlIl1o;
                }

                public final int I00000oOI() {
/* 1 */             int i = this.I0000oI00;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 7 */             String str = this.I00000oIO;
/* 15 */            if (str.equals("http")) {
/* 17 */                return 80;
                    }
                    return str.equals("https") ? 443 : -1;
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(IoOi01OlIl1o ioOi01OlIl1o, String str) {
                    int i;
                    String str2;
                    int i2;
                    int iI0001Ioi1lo;
                    int i3;
                    char cCharAt;
/* 5 */             String str3 = str;
/* 7 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 14 */            int iI000lI = OollIoI001lo.I000lI(0, str3.length(), str3);
/* 22 */            int iI000o00OoI0I = OollIoI001lo.I000o00OoI0I(iI000lI, str3.length(), str3);
/* 32 */            char c = 65535;
/* 34 */            if (iI000o00OoI0I - iI000lI < 2) {
/* 36 */                i = -1;
                    } else {
/* 38 */                char cCharAt2 = str3.charAt(iI000lI);
/* 50 */                if ((O0000Ioio00.I0000oI00(cCharAt2, 97) >= 0 && O0000Ioio00.I0000oI00(cCharAt2, 122) <= 0) || (O0000Ioio00.I0000oI00(cCharAt2, 65) >= 0 && O0000Ioio00.I0000oI00(cCharAt2, 90) <= 0)) {
/* 75 */                    int i4 = iI000lI + 1;
                            while (true) {
/* 77 */                        if (i4 >= iI000o00OoI0I) {
                                    break;
                                }
/* 79 */                        char cCharAt3 = str3.charAt(i4);
/* 83 */                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
/* 116 */                           i4++;
                                } else if (cCharAt3 == ':') {
/* 121 */                           i = i4;
                                }
                            }
/* 36 */                    i = -1;
                        }
                    }
/* 127 */           int i5 = 1;
/* 128 */           if (i != -1) {
/* 124 */               str2 = "https";
/* 142 */               if (str3.regionMatches(true, iI000lI, "https:", 0, 6)) {
/* 144 */                   this.I00000oIO = str2;
/* 146 */                   iI000lI += 6;
/* 148 */                   str3 = str;
                        } else {
/* 155 */                   str3 = str;
/* 161 */                   if (!str3.regionMatches(true, iI000lI, "http:", 0, 5)) {
/* 196 */                       throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str3.substring(0, i) + '\'');
                            }
/* 163 */                   this.I00000oIO = "http";
/* 165 */                   iI000lI += 5;
                        }
                    } else {
/* 124 */               str2 = "https";
/* 198 */               if (ioOi01OlIl1o == null) {
/* 840 */                   I000II.I000iOII("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str3.length() > 6 ? OlOoOIi0o.I00OIl(6, str3).concat("...") : str3));
/* 2988 */                  return;
                        }
/* 202 */               this.I00000oIO = ioOi01OlIl1o.I00000oIO;
                    }
/* 204 */           int i6 = iI000lI;
/* 205 */           int i7 = 0;
                    while (true) {
/* 210 */               i2 = i5;
/* 212 */               if (i6 >= iI000o00OoI0I || !((cCharAt = str3.charAt(i6)) == '\\' || cCharAt == '/')) {
                            break;
                        }
/* 222 */               i7++;
/* 224 */               i6++;
/* 226 */               i5 = i2;
                    }
/* 233 */           ArrayList arrayList = this.I0001Ioi1lo;
/* 235 */           char c2 = '#';
/* 237 */           if (i7 >= 2 || ioOi01OlIl1o == null || !O0000Ioio00.I0000O(ioOi01OlIl1o.I00000oIO, this.I00000oIO)) {
/* 312 */               int i8 = iI000lI + i7;
/* 314 */               int i9 = 0;
/* 315 */               int i10 = 0;
                        while (true) {
/* 318 */                   iI0001Ioi1lo = OollIoI001lo.I0001Ioi1lo(i8, iI000o00OoI0I, str3, "@/\\?#");
/* 329 */                   char cCharAt4 = iI0001Ioi1lo != iI000o00OoI0I ? str3.charAt(iI0001Ioi1lo) : c;
/* 330 */                   if (cCharAt4 == c || cCharAt4 == c2 || cCharAt4 == '/' || cCharAt4 == '\\' || cCharAt4 == '?') {
                                break;
                            }
/* 348 */                   if (cCharAt4 == '@') {
/* 356 */                       if (i9 == 0) {
/* 360 */                           int iI000II = OollIoI001lo.I000II(str3, ':', i8, iI0001Ioi1lo);
/* 366 */                           String strI000O01llI0 = iOl0lOIi11.I000O01llI0(str3, i8, iI000II, " \"':;<=>@[]^`{}|/\\?#", 240);
/* 370 */                           if (i10 != 0) {
/* 379 */                               strI000O01llI0 = IIl001iO0Io.I00100l0(new StringBuilder(this.I00000oOI), "%40", strI000O01llI0);
                                    }
/* 383 */                           this.I00000oOI = strI000O01llI0;
/* 385 */                           if (iI000II != iI0001Ioi1lo) {
/* 395 */                               this.I0000Il00O = iOl0lOIi11.I000O01llI0(str3, iI000II + 1, iI0001Ioi1lo, " \"':;<=>@[]^`{}|/\\?#", 240);
/* 397 */                               i9 = i2;
                                    }
/* 402 */                           i10 = i2;
                                } else {
                                    this.I0000Il00O += "%40" + iOl0lOIi11.I000O01llI0(str3, i8, iI0001Ioi1lo, " \"':;<=>@[]^`{}|/\\?#", 240);
                                }
/* 432 */                       i8 = iI0001Ioi1lo + 1;
/* 435 */                       c = 65535;
/* 436 */                       c2 = '#';
                            }
                        }
/* 439 */               int i11 = i8;
                        while (true) {
/* 440 */                   if (i11 >= iI0001Ioi1lo) {
/* 473 */                       i11 = iI0001Ioi1lo;
                                break;
                            }
/* 442 */                   char cCharAt5 = str3.charAt(i11);
/* 448 */                   if (cCharAt5 == '[') {
/* 460 */                       do {
/* 450 */                           i11++;
/* 452 */                           if (i11 >= iI0001Ioi1lo) {
                                        break;
                                    }
/* 460 */                       } while (str3.charAt(i11) != ']');
                            } else if (cCharAt5 == ':') {
                                break;
                            }
/* 470 */                   i11++;
                        }
/* 474 */               int i12 = i11 + 1;
/* 479 */               if (i12 < iI0001Ioi1lo) {
/* 489 */                   this.I0000O = iloo10Oil.I00000oOI(iOl0lOIi11.I000lI(i8, i11, 4, str3));
                            try {
/* 497 */                       i3 = Integer.parseInt(iOl0lOIi11.I000O01llI0(str3, i12, iI0001Ioi1lo, "", 248));
                            } catch (NumberFormatException unused) {
                            }
/* 503 */                   if (i2 > i3 || i3 >= 65536) {
/* 510 */                       i3 = -1;
                            }
/* 511 */                   this.I0000oI00 = i3;
/* 514 */                   if (i3 == -1) {
/* 523 */                       IoOOl0iOl1io.I000O01llI0("Invalid URL port: \"", 34, str3.substring(i12, iI0001Ioi1lo));
/* 526 */                       return;
                            }
                        } else {
/* 536 */                   this.I0000O = iloo10Oil.I00000oOI(iOl0lOIi11.I000lI(i8, i11, 4, str3));
/* 538 */                   String str4 = this.I00000oIO;
/* 559 */                   this.I0000oI00 = str4.equals("http") ? 80 : str4.equals(str2) ? 443 : -1;
                        }
/* 563 */               if (this.I0000O == null) {
/* 811 */                   IoOOl0iOl1io.I000O01llI0("Invalid URL host: \"", 34, str3.substring(i8, i11));
/* 814 */                   return;
                        }
/* 565 */               iI000lI = iI0001Ioi1lo;
                    } else {
/* 256 */               this.I00000oOI = ioOi01OlIl1o.I0000oI00();
/* 262 */               this.I0000Il00O = ioOi01OlIl1o.I00000oIO();
/* 266 */               this.I0000O = ioOi01OlIl1o.I0000O;
/* 270 */               this.I0000oI00 = ioOi01OlIl1o.I0000oI00;
/* 272 */               arrayList.clear();
/* 279 */               arrayList.addAll(ioOi01OlIl1o.I0000Il00O());
/* 282 */               if (iI000lI == iI000o00OoI0I || str3.charAt(iI000lI) == '#') {
/* 290 */                   String strI0000O = ioOi01OlIl1o.I0000O();
/* 308 */                   this.I000II = strI0000O != null ? iOl0lOIi11.I00100l0(iOl0lOIi11.I000O01llI0(strI0000O, 0, 0, " \"'<>#", 211)) : null;
                        }
                    }
/* 568 */           int iI0001Ioi1lo2 = OollIoI001lo.I0001Ioi1lo(iI000lI, iI000o00OoI0I, str3, "?#");
/* 572 */           if (iI000lI != iI0001Ioi1lo2) {
/* 576 */               char cCharAt6 = str3.charAt(iI000lI);
/* 582 */               if (cCharAt6 == '/' || cCharAt6 == '\\') {
/* 601 */                   arrayList.clear();
/* 604 */                   arrayList.add("");
/* 607 */                   iI000lI++;
                        } else {
/* 597 */                   arrayList.set(arrayList.size() - 1, "");
                        }
/* 609 */               while (iI000lI < iI0001Ioi1lo2) {
/* 613 */                   int iI0001Ioi1lo3 = OollIoI001lo.I0001Ioi1lo(iI000lI, iI0001Ioi1lo2, str3, "/\\");
/* 621 */                   boolean z = iI0001Ioi1lo3 < iI0001Ioi1lo2;
/* 626 */                   String strI000O01llI02 = iOl0lOIi11.I000O01llI0(str3, iI000lI, iI0001Ioi1lo3, " \"<>^`{}|/\\?#", 240);
/* 636 */                   if (!strI000O01llI02.equals(".") && !strI000O01llI02.equalsIgnoreCase("%2e")) {
/* 653 */                       if (!strI000O01llI02.equals("..") && !strI000O01llI02.equalsIgnoreCase("%2e.") && !strI000O01llI02.equalsIgnoreCase(".%2e") && !strI000O01llI02.equalsIgnoreCase("%2e%2e")) {
/* 692 */                           if (((CharSequence) IIl001iO0Io.I000OiO(1, arrayList)).length() == 0) {
/* 699 */                               arrayList.set(arrayList.size() - 1, strI000O01llI02);
                                    } else {
/* 703 */                               arrayList.add(strI000O01llI02);
                                    }
/* 706 */                           if (z) {
/* 708 */                               arrayList.add("");
                                    }
                                } else if (((String) IIlIOloOOO.I000o00OoI0I(1, arrayList)).length() != 0 || arrayList.isEmpty()) {
/* 739 */                           arrayList.add("");
                                } else {
/* 735 */                           arrayList.set(arrayList.size() - 1, "");
                                }
                            }
/* 748 */                   iI000lI = z ? iI0001Ioi1lo3 + 1 : iI0001Ioi1lo3;
                        }
                    }
/* 751 */           if (iI0001Ioi1lo2 < iI000o00OoI0I && str3.charAt(iI0001Ioi1lo2) == '?') {
/* 763 */               int iI000II2 = OollIoI001lo.I000II(str3, '#', iI0001Ioi1lo2, iI000o00OoI0I);
/* 779 */               this.I000II = iOl0lOIi11.I00100l0(iOl0lOIi11.I000O01llI0(str3, iI0001Ioi1lo2 + 1, iI000II2, " \"'<>#", 208));
/* 781 */               iI0001Ioi1lo2 = iI000II2;
                    }
/* 782 */           if (iI0001Ioi1lo2 >= iI000o00OoI0I || str3.charAt(iI0001Ioi1lo2) != '#') {
/* 804 */               return;
                    }
/* 802 */           this.I000O01llI0 = iOl0lOIi11.I000O01llI0(str3, iI0001Ioi1lo2 + 1, iI000o00OoI0I, "", 176);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             String str = this.I00000oIO;
/* 8 */             if (str != null) {
/* 10 */                sb.append(str);
/* 15 */                sb.append("://");
                    } else {
/* 21 */                sb.append("//");
                    }
/* 32 */            if (this.I00000oOI.length() > 0 || this.I0000Il00O.length() > 0) {
/* 45 */                sb.append(this.I00000oOI);
/* 54 */                if (this.I0000Il00O.length() > 0) {
/* 56 */                    sb.append(':');
/* 61 */                    sb.append(this.I0000Il00O);
                        }
/* 66 */                sb.append('@');
                    }
/* 69 */            String str2 = this.I0000O;
/* 71 */            if (str2 != null) {
/* 77 */                if (OlOoOIi0o.I00100l0(str2, ':')) {
/* 81 */                    sb.append('[');
/* 86 */                    sb.append(this.I0000O);
/* 91 */                    sb.append(']');
                        } else {
/* 97 */                    sb.append(this.I0000O);
                        }
                    }
/* 102 */           int i = -1;
/* 103 */           if (this.I0000oI00 != -1 || this.I00000oIO != null) {
/* 109 */               int iI00000oOI = I00000oOI();
/* 113 */               String str3 = this.I00000oIO;
/* 115 */               if (str3 == null) {
/* 140 */                   sb.append(':');
/* 143 */                   sb.append(iI00000oOI);
                        } else {
/* 123 */                   if (str3.equals("http")) {
/* 125 */                       i = 80;
                            } else if (str3.equals("https")) {
/* 136 */                       i = 443;
                            }
/* 138 */                   if (iI00000oOI != i) {
                            }
                        }
                    }
/* 146 */           ArrayList arrayList = this.I0001Ioi1lo;
/* 148 */           int size = arrayList.size();
/* 153 */           for (int i2 = 0; i2 < size; i2++) {
/* 157 */               sb.append('/');
/* 166 */               sb.append((String) arrayList.get(i2));
                    }
/* 174 */           if (this.I000II != null) {
/* 178 */               sb.append('?');
/* 183 */               iOl0lOIi11.I0010I0i(sb, this.I000II);
                    }
/* 188 */           if (this.I000O01llI0 != null) {
/* 192 */               sb.append('#');
/* 197 */               sb.append(this.I000O01llI0);
                    }
/* 200 */           return sb.toString();
                }
            }
