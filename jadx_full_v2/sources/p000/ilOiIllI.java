            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.StringReader;
            import java.util.Arrays;
            
            public final class ilOiIllI implements Closeable {
                public final StringReader I00iOIl;
                public long I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int[] I00li1OI;
                public String[] I00lli11;
                public int[] I00lll10;
                public int I00iiI = 2;
                public final char[] I00iiO = new char[Barcode.FORMAT_UPC_E];
                public int I00iio = 0;
                public int I00ilI0I1 = 0;
                public int I00ilO0 = 0;
                public int I00io1l = 0;
                public int I00ioIO = 0;
                public int I00ll1 = 1;

                public ilOiIllI(StringReader stringReader) {
/* 26 */            int[] iArr = new int[32];
/* 28 */            this.I00li1OI = iArr;
/* 34 */            iArr[0] = 6;
/* 38 */            this.I00lli11 = new String[32];
/* 42 */            this.I00lll10 = new int[32];
/* 44 */            this.I00iOIl = stringReader;
                }

                /* JADX WARN: Code restructure failed: missing block: B:138:0x01cf, code lost:
                
                    r26 = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:164:0x0225, code lost:
                
                    if (I00OOll1(r3) == false) goto L122;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:176:0x023f, code lost:
                
                    if (r5 == false) goto L180;
                 */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x027c  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0289 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:208:0x028a  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x02a2 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:244:0x02fe  */
                /* JADX WARN: Removed duplicated region for block: B:258:0x032d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oIO() {
                    int i;
                    int iI000l1;
                    int iI000l12;
                    String str;
                    String str2;
                    int i2;
                    int i3;
                    char c;
                    char c2;
                    boolean z;
                    boolean z2;
                    int i4;
/* 3 */             int[] iArr = this.I00li1OI;
                    int i5 = this.I00ll1 - 1;
/* 9 */             int i6 = iArr[i5];
/* 22 */            int i7 = 3;
/* 23 */            char[] cArr = this.I00iiO;
/* 27 */            int i8 = 4;
/* 34 */            boolean z3 = true;
/* 35 */            if (i6 != 1) {
/* 41 */                if (i6 == 2) {
/* 43 */                    int iI000l13 = I000l1(true);
/* 47 */                    if (iI000l13 != 44) {
/* 49 */                        if (iI000l13 != 59) {
/* 51 */                            if (iI000l13 != 93) {
/* 58 */                                I00100l0("Unterminated array");
/* 61 */                                throw null;
                                    }
/* 53 */                            i7 = i8;
                                } else {
/* 62 */                            I00IioO0OiOi();
                                }
                            }
                        } else {
/* 69 */                    if (i6 == 3) {
/* 730 */                       i = 4;
                            } else if (i6 == 5) {
/* 73 */                        i = 4;
                            } else if (i6 == 4) {
/* 80 */                        iArr[i5] = 5;
/* 82 */                        int iI000l14 = I000l1(true);
/* 88 */                        if (iI000l14 != 58) {
/* 92 */                            if (iI000l14 != 61) {
/* 124 */                               I00100l0("Expected ':'");
/* 127 */                               throw null;
                                    }
/* 94 */                            I00IioO0OiOi();
/* 101 */                           if (this.I00iio < this.I00ilI0I1 || I00OIl(1)) {
/* 109 */                               int i9 = this.I00iio;
/* 115 */                               if (cArr[i9] == '>') {
/* 118 */                                   this.I00iio = i9 + 1;
                                        }
                                    }
                                }
                            } else if (i6 == 6) {
/* 132 */                       if (this.I00iiI == 1) {
/* 134 */                           I000l1(true);
/* 137 */                           int i10 = this.I00iio;
/* 141 */                           this.I00iio = i10 - 1;
/* 146 */                           if (i10 + 4 <= this.I00ilI0I1 || I00OIl(5)) {
/* 155 */                               int i11 = this.I00iio;
/* 161 */                               if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
/* 188 */                                   this.I00iio = i11 + 5;
                                        }
                                    }
                                }
/* 196 */                       this.I00li1OI[this.I00ll1 - 1] = 7;
                            } else if (i6 == 7) {
/* 210 */                       if (I000l1(false) == -1) {
/* 212 */                           i7 = 17;
                                } else {
/* 216 */                           I00IioO0OiOi();
                                    this.I00iio--;
                                }
                            } else if (i6 == 8) {
/* 724 */                       I000II.I001IO000("JsonReader is closed");
/* 727 */                       return 0;
                            }
/* 75 */                    i8 = 2;
/* 734 */                   iArr[i5] = i;
/* 736 */                   if (i6 != 5 || (iI000l12 = I000l1(true)) == 44) {
/* 759 */                       iI000l1 = I000l1(true);
/* 765 */                       if (iI000l1 != 34) {
/* 814 */                           i7 = 13;
                                } else {
/* 767 */                           if (iI000l1 == 39) {
/* 806 */                               I00IioO0OiOi();
/* 811 */                               this.I00ioIO = 12;
/* 809 */                               return 12;
                                    }
/* 771 */                           if (iI000l1 != 125) {
/* 773 */                               I00IioO0OiOi();
                                        this.I00iio--;
/* 789 */                               if (!I00OOll1((char) iI000l1)) {
/* 794 */                                   I00100l0("Expected name");
/* 797 */                                   throw null;
                                        }
/* 791 */                               i7 = 14;
                                    } else {
/* 798 */                               if (i6 == 5) {
/* 802 */                                   I00100l0("Expected name");
/* 805 */                                   throw null;
                                        }
/* 53 */                                i7 = i8;
                                    }
                                }
                            } else if (iI000l12 != 59) {
/* 746 */                       if (iI000l12 != 125) {
/* 752 */                           I00100l0("Unterminated object");
/* 755 */                           throw null;
                                }
/* 53 */                        i7 = i8;
                            } else {
/* 756 */                       I00IioO0OiOi();
/* 759 */                       iI000l1 = I000l1(true);
/* 765 */                       if (iI000l1 != 34) {
                                }
                            }
                        }
/* 816 */               this.I00ioIO = i7;
/* 2498 */              return i7;
                    }
/* 37 */            iArr[i5] = 2;
/* 229 */           int iI000l15 = I000l1(true);
/* 235 */           if (iI000l15 != 34) {
/* 237 */               if (iI000l15 == 39) {
/* 711 */                   I00IioO0OiOi();
/* 716 */                   this.I00ioIO = 8;
/* 714 */                   return 8;
                        }
/* 239 */               if (iI000l15 != 44 && iI000l15 != 59) {
/* 245 */                   if (iI000l15 != 91) {
/* 247 */                       if (iI000l15 != 93) {
/* 251 */                           if (iI000l15 != 123) {
                                        int i12 = this.I00iio - 1;
/* 259 */                               this.I00iio = i12;
/* 261 */                               char c3 = cArr[i12];
/* 265 */                               if (c3 == 't' || c3 == 'T') {
/* 304 */                                   str = "TRUE";
/* 306 */                                   str2 = "true";
/* 308 */                                   i2 = 5;
                                        } else if (c3 == 'f' || c3 == 'F') {
/* 298 */                                   str = "FALSE";
/* 300 */                                   str2 = "false";
/* 302 */                                   i2 = 6;
                                        } else {
/* 283 */                                   if (c3 == 'n' || c3 == 'N') {
/* 292 */                                       str = "NULL";
/* 294 */                                       str2 = "null";
/* 296 */                                       i2 = 7;
                                            }
/* 290 */                                   i3 = 0;
/* 387 */                                   if (i3 == 0) {
/* 675 */                                       return i3;
                                            }
/* 389 */                                   int i13 = this.I00iio;
/* 391 */                                   int i14 = this.I00ilI0I1;
/* 394 */                                   boolean z4 = true;
/* 396 */                                   int i15 = 0;
/* 397 */                                   char c4 = 0;
/* 398 */                                   boolean z5 = false;
/* 399 */                                   long j = 0;
                                            while (true) {
/* 405 */                                       if (i13 + i15 == i14) {
/* 409 */                                           if (i15 == 1024) {
                                                        break;
                                                    }
/* 420 */                                           if (!I00OIl(i15 + 1)) {
/* 422 */                                               z2 = z5;
                                                        break;
                                                    }
/* 427 */                                           i13 = this.I00iio;
/* 429 */                                           i14 = this.I00ilI0I1;
/* 434 */                                           c2 = cArr[i13 + i15];
/* 438 */                                           if (c2 != '+') {
                                                    }
/* 642 */                                           i15++;
                                                } else {
/* 434 */                                           c2 = cArr[i13 + i15];
/* 438 */                                           if (c2 != '+') {
/* 637 */                                               z = z5;
/* 639 */                                               if (c4 != 5) {
                                                            break;
                                                        }
/* 625 */                                               c4 = 6;
/* 515 */                                               z5 = z;
                                                    } else if (c2 == 'E' || c2 == 'e') {
/* 627 */                                               z = z5;
/* 630 */                                               if (c4 != 2 && c4 != 4) {
                                                            break;
                                                        }
/* 635 */                                               c4 = 5;
/* 515 */                                               z5 = z;
                                                    } else if (c2 == '-') {
/* 615 */                                               z = z5;
/* 618 */                                               if (c4 == 0) {
/* 620 */                                                   c4 = 1;
/* 621 */                                                   z5 = true;
                                                        } else {
/* 623 */                                                   if (c4 != 5) {
                                                                break;
                                                            }
/* 625 */                                                   c4 = 6;
/* 515 */                                                   z5 = z;
                                                        }
                                                    } else if (c2 == '.') {
/* 608 */                                               z = z5;
/* 611 */                                               if (c4 != 2) {
                                                            break;
                                                        }
/* 613 */                                               c4 = 3;
/* 515 */                                               z5 = z;
                                                    } else {
/* 458 */                                               if (c2 < '0' || c2 > '9') {
                                                            break;
                                                        }
/* 467 */                                               if (c4 == 1 || c4 == 0) {
/* 539 */                                                   j = -(c2 - '0');
/* 541 */                                                   z5 = z5;
/* 543 */                                                   c4 = 2;
                                                        } else {
/* 475 */                                                   if (c4 != 2) {
/* 519 */                                                       z = z5;
/* 521 */                                                       if (c4 == 3) {
/* 523 */                                                           z5 = z;
/* 525 */                                                           c4 = 4;
                                                                } else if (c4 == 5 || c4 == 6) {
/* 532 */                                                           z5 = z;
/* 534 */                                                           c4 = 7;
                                                                }
                                                            } else {
/* 479 */                                                       if (j == 0) {
                                                                    break;
                                                                }
/* 495 */                                                       z = z5;
/* 498 */                                                       long j2 = (10 * j) - (c2 - '0');
/* 511 */                                                       z4 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
/* 513 */                                                       j = j2;
                                                            }
/* 515 */                                                   z5 = z;
                                                        }
                                                    }
/* 642 */                                           i15++;
                                                }
/* 648 */                                       if (i4 == 0) {
/* 650 */                                           return i4;
                                                }
/* 659 */                                       if (!I00OOll1(cArr[this.I00iio])) {
/* 671 */                                           I00100l0("Expected value");
/* 674 */                                           throw null;
                                                }
/* 661 */                                       I00IioO0OiOi();
/* 666 */                                       this.I00ioIO = 10;
/* 664 */                                       return 10;
                                            }
/* 424 */                                   char c5 = 2;
/* 554 */                                   if (c4 != 2) {
/* 595 */                                       if (c4 != c5 || c4 == 4 || c4 == 7) {
/* 603 */                                           this.I00l0OO0IO = i15;
/* 605 */                                           i4 = 16;
/* 592 */                                           this.I00ioIO = i4;
                                                }
/* 411 */                                       i4 = 0;
                                            } else {
/* 556 */                                       if (z4) {
/* 562 */                                           if (j != Long.MIN_VALUE) {
/* 570 */                                               z3 = z2;
                                                    } else if (z2) {
                                                    }
/* 574 */                                           if (j != 0) {
/* 579 */                                               if (!z3) {
                                                        }
/* 583 */                                               this.I00l0I0l0lO1 = j;
                                                        this.I00iio += i15;
/* 590 */                                               i4 = 15;
/* 592 */                                               this.I00ioIO = i4;
                                                    }
/* 582 */                                           j = -j;
/* 583 */                                           this.I00l0I0l0lO1 = j;
                                                    this.I00iio += i15;
/* 590 */                                           i4 = 15;
/* 592 */                                           this.I00ioIO = i4;
                                                }
/* 567 */                                       c5 = 2;
/* 568 */                                       c4 = 2;
/* 595 */                                       if (c4 != c5) {
                                                }
/* 603 */                                       this.I00l0OO0IO = i15;
/* 605 */                                       i4 = 16;
/* 592 */                                       this.I00ioIO = i4;
                                            }
/* 648 */                                   if (i4 == 0) {
                                            }
                                        }
/* 309 */                               int i16 = this.I00iiI;
/* 311 */                               int i17 = 0;
                                        while (true) {
/* 312 */                                   int length = str2.length();
/* 316 */                                   int i18 = this.I00iio;
/* 318 */                                   int i19 = this.I00ilI0I1;
/* 320 */                                   if (i17 < length) {
/* 323 */                                       if ((i18 + i17 >= i19 && !I00OIl(i17 + 1)) || ((c = cArr[this.I00iio + i17]) != str2.charAt(i17) && (i16 == 3 || c != str.charAt(i17)))) {
                                                    break;
                                                }
/* 353 */                                       i17++;
                                            } else {
/* 357 */                                       if ((i18 + length < i19 || I00OIl(length + 1)) && I00OOll1(cArr[this.I00iio + length])) {
                                                    break;
                                                }
                                                this.I00iio += length;
/* 384 */                                       this.I00ioIO = i2;
/* 386 */                                       i3 = i2;
                                            }
                                        }
/* 387 */                               if (i3 == 0) {
                                        }
                                    } else {
/* 676 */                               i7 = 1;
                                    }
                                } else if (i6 == 1) {
/* 681 */                           i7 = 4;
                                }
                            }
                        }
/* 684 */               if (i6 != 1 && i6 != 2) {
/* 692 */                   I00100l0("Unexpected value");
/* 695 */                   throw null;
                        }
/* 696 */               I00IioO0OiOi();
                        this.I00iio--;
/* 708 */               this.I00ioIO = 7;
/* 707 */               return 7;
                    }
/* 719 */           i7 = 9;
/* 816 */           this.I00ioIO = i7;
/* 2498 */          return i7;
                }

                public final String I0000Il00O() {
/* 3 */             int i = this.I00ilO0 + 1;
/* 9 */             int i2 = this.I00iio - this.I00io1l;
/* 14 */            StringBuilder sb = new StringBuilder("$");
/* 20 */            for (int i3 = 0; i3 < this.I00ll1; i3++) {
/* 24 */                int i4 = this.I00li1OI[i3];
                        switch (i4) {
                            case 1:
                            case 2:
/* 57 */                        int i5 = this.I00lll10[i3];
/* 61 */                        sb.append('[');
/* 64 */                        sb.append(i5);
/* 69 */                        sb.append(']');
                                break;
                            case 3:
                            case 4:
                            case 5:
/* 42 */                        sb.append('.');
/* 47 */                        String str = this.I00lli11[i3];
/* 49 */                        if (str != null) {
/* 51 */                            sb.append(str);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
/* 35 */                        I000II.I000O01llI0(Oi010OO0.I000oI1ioi(i4, "Unknown scope value: "));
/* 38 */                        return null;
                        }
                    }
/* 75 */            String string = sb.toString();
/* 83 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo(" at line ", i, " column ");
/* 89 */            sbI00100o1O0lo.append(i2 + 1);
/* 94 */            sbI00100o1O0lo.append(" path ");
/* 97 */            sbI00100o1O0lo.append(string);
/* 100 */           return sbI00100o1O0lo.toString();
                }

                public final String I000II() {
                    String str;
/* 1 */             int iI00000oIO = this.I00ioIO;
/* 3 */             if (iI00000oIO == 0) {
/* 5 */                 iI00000oIO = I00000oIO();
                    }
/* 11 */            if (iI00000oIO == 10) {
/* 13 */                str = I00IOO();
                    } else if (iI00000oIO == 8) {
/* 24 */                str = I001l0I00('\'');
                    } else if (iI00000oIO == 9) {
/* 35 */                str = I001l0I00('\"');
                    } else if (iI00000oIO == 11) {
/* 44 */                str = null;
                    } else if (iI00000oIO == 15) {
/* 52 */                str = Long.toString(this.I00l0I0l0lO1);
                    } else {
/* 59 */                if (iI00000oIO != 16) {
/* 110 */                   throw I001i1lo1io("a string");
                        }
/* 69 */                str = new String(this.I00iiO, this.I00iio, this.I00l0OO0IO);
                        this.I00iio += this.I00l0OO0IO;
                    }
/* 80 */            this.I00ioIO = 0;
/* 82 */            int[] iArr = this.I00lll10;
                    int i = this.I00ll1 - 1;
/* 92 */            iArr[i] = iArr[i] + 1;
/* 94 */            return str;
                }

                public final int I000O01llI0() {
/* 1 */             int iI00000oIO = this.I00ioIO;
/* 3 */             if (iI00000oIO == 0) {
/* 5 */                 iI00000oIO = I00000oIO();
                    }
                    switch (iI00000oIO) {
                        case 1:
/* 33 */                    return 3;
                        case 2:
/* 31 */                    return 4;
                        case 3:
/* 29 */                    return 1;
                        case 4:
/* 27 */                    return 2;
                        case 5:
                        case 6:
/* 24 */                    return 8;
                        case 7:
/* 21 */                    return 9;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 19 */                    return 6;
                        case 12:
                        case 13:
                        case 14:
/* 17 */                    return 5;
                        case 15:
                        case 16:
/* 15 */                    return 7;
                        default:
/* 12 */                    return 10;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
                
                    return 47;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000l1(boolean z) throws IOException {
                    int i;
/* 1 */             int i2 = this.I00iio;
/* 3 */             int i3 = this.I00ilI0I1;
                    while (true) {
/* 6 */                 if (i2 == i3) {
/* 8 */                     this.I00iio = i2;
/* 14 */                    if (!I00OIl(1)) {
/* 16 */                        if (z) {
/* 35 */                            throw new EOFException("End of input".concat(I0000Il00O()));
                                }
/* 18 */                        return -1;
                            }
/* 36 */                    i2 = this.I00iio;
/* 38 */                    i3 = this.I00ilI0I1;
                        }
/* 40 */                int i4 = i2 + 1;
/* 42 */                char[] cArr = this.I00iiO;
/* 44 */                char c = cArr[i2];
/* 48 */                if (c == '\n') {
                            this.I00ilO0++;
/* 55 */                    this.I00io1l = i4;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 75 */                    if (c == '/') {
/* 77 */                        this.I00iio = i4;
/* 80 */                        if (i4 == i3) {
/* 82 */                            this.I00iio = i2;
/* 84 */                            boolean zI00OIl = I00OIl(2);
                                    this.I00iio++;
/* 93 */                            if (!zI00OIl) {
                                        break;
                                    }
                                }
/* 95 */                        I00IioO0OiOi();
/* 98 */                        int i5 = this.I00iio;
/* 100 */                       char c2 = cArr[i5];
/* 104 */                       if (c2 == '*') {
/* 123 */                           this.I00iio = i5 + 1;
                                    while (true) {
/* 130 */                               if (this.I00iio + 2 > this.I00ilI0I1 && !I00OIl(2)) {
/* 141 */                                   I00100l0("Unterminated comment");
/* 145 */                                   throw null;
                                        }
/* 146 */                               int i6 = this.I00iio;
/* 150 */                               if (cArr[i6] != '\n') {
                                            while (true) {
/* 163 */                                       int i7 = this.I00iio;
/* 165 */                                       if (i >= 2) {
/* 187 */                                           i2 = i7 + 2;
/* 189 */                                           i3 = this.I00ilI0I1;
                                                    break;
                                                }
/* 178 */                                       i = cArr[i7 + i] == "*/".charAt(i) ? i + 1 : 0;
                                            }
                                        } else {
                                            this.I00ilO0++;
/* 159 */                                   this.I00io1l = i6 + 1;
                                        }
                                        this.I00iio++;
                                    }
                                } else {
/* 106 */                           if (c2 != '/') {
                                        break;
                                    }
/* 111 */                           this.I00iio = i5 + 1;
/* 113 */                           I00IoiI();
/* 116 */                           i2 = this.I00iio;
/* 118 */                           i3 = this.I00ilI0I1;
                                }
                            } else {
/* 195 */                       if (c != '#') {
/* 211 */                           this.I00iio = i4;
/* 213 */                           return c;
                                }
/* 197 */                       this.I00iio = i4;
/* 199 */                       I00IioO0OiOi();
/* 202 */                       I00IoiI();
/* 205 */                       i2 = this.I00iio;
/* 207 */                       i3 = this.I00ilI0I1;
                            }
                        }
/* 214 */               i2 = i4;
                    }
                }

                public final void I00100l0(String str) throws ilOoOOOlll1 {
/* 29 */            throw new ilOoOOOlll1(IlIi0I0.I000lI(str, I0000Il00O(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
                }

                public final IllegalStateException I001i1lo1io(String str) {
/* 1 */             int iI000O01llI0 = I000O01llI0();
/* 23 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Expected ", str, " but was ", lilol1OolOo.I00000oIO(I000O01llI0()), I0000Il00O());
/* 29 */            sbI00111O.append("\nSee ");
/* 47 */            sbI00111O.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iI000O01llI0 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
/* 54 */            return new IllegalStateException(sbI00111O.toString());
                }

                /* JADX WARN: Code restructure failed: missing block: B:101:0x0136, code lost:
                
                    r4 = r2 - r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0138, code lost:
                
                    if (r1 != null) goto L104;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x013a, code lost:
                
                    r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0146, code lost:
                
                    r1.append(r6, r3, r4);
                    r12.I00iio = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x00da, code lost:
                
                    I00100l0("Malformed Unicode escape \\u".concat(new java.lang.String(r6, r12.I00iio, 4)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x00ea, code lost:
                
                    throw null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I001l0I00(char c) {
                    int i;
/* 2 */             StringBuilder sb = null;
/* 336 */           loop0: do {
/* 3 */                 int i2 = this.I00iio;
/* 5 */                 int i3 = this.I00ilI0I1;
/* 8 */                 int i4 = i2;
                        while (true) {
/* 11 */                    char[] cArr = this.I00iiO;
/* 14 */                    if (i2 >= i3) {
                                break;
                            }
/* 16 */                    int i5 = i2 + 1;
/* 18 */                    char c2 = cArr[i2];
/* 23 */                    if (this.I00iiI == 3 && c2 < ' ') {
/* 32 */                        I00100l0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
/* 35 */                        throw null;
                            }
/* 36 */                    if (c2 == c) {
                                int i6 = (i5 - i4) - 1;
/* 42 */                        this.I00iio = i5;
/* 44 */                        if (sb == null) {
/* 48 */                            return new String(cArr, i4, i6);
                                }
/* 52 */                        sb.append(cArr, i4, i6);
/* 55 */                        return sb.toString();
                            }
/* 62 */                    char c3 = '\n';
/* 64 */                    if (c2 == '\\') {
/* 66 */                        int i7 = i5 - i4;
                                int i8 = i7 - 1;
/* 70 */                        this.I00iio = i5;
/* 72 */                        if (sb == null) {
/* 81 */                            sb = new StringBuilder(Math.max(i7 + i7, 16));
                                }
/* 84 */                        sb.append(cArr, i4, i8);
/* 93 */                        if (this.I00iio == this.I00ilI0I1 && !I00OIl(1)) {
/* 102 */                           I00100l0("Unterminated escape sequence");
/* 105 */                           throw null;
                                }
/* 106 */                       int i9 = this.I00iio;
/* 108 */                       int i10 = i9 + 1;
/* 110 */                       this.I00iio = i10;
/* 112 */                       char c4 = cArr[i9];
/* 114 */                       if (c4 != '\n') {
/* 118 */                           if (c4 == '\"') {
/* 276 */                               c3 = c4;
/* 277 */                               sb.append(c3);
/* 280 */                               i4 = this.I00iio;
/* 282 */                               i3 = this.I00ilI0I1;
/* 284 */                               i2 = i4;
                                    } else {
/* 122 */                               if (c4 != '\'') {
/* 126 */                                   if (c4 != '/' && c4 != '\\') {
/* 132 */                                       if (c4 == 'b') {
/* 258 */                                           c3 = '\b';
                                                } else if (c4 == 'f') {
/* 255 */                                           c3 = '\f';
                                                } else if (c4 != 'n') {
/* 144 */                                           if (c4 == 'r') {
/* 252 */                                               c3 = '\r';
                                                    } else if (c4 == 't') {
/* 249 */                                               c3 = '\t';
                                                    } else {
/* 152 */                                               if (c4 != 'u') {
/* 245 */                                                   I00100l0("Invalid escape sequence");
/* 248 */                                                   throw null;
                                                        }
/* 159 */                                               if (i9 + 5 > this.I00ilI0I1 && !I00OIl(4)) {
/* 168 */                                                   I00100l0("Unterminated escape sequence");
/* 171 */                                                   throw null;
                                                        }
/* 172 */                                               int i11 = this.I00iio;
/* 174 */                                               int i12 = i11 + 4;
/* 176 */                                               int i13 = 0;
/* 177 */                                               while (i11 < i12) {
/* 179 */                                                   int i14 = i13 << 4;
/* 181 */                                                   char c5 = cArr[i11];
/* 185 */                                                   if (c5 >= '0' && c5 <= '9') {
                                                                i = c5 - '0';
                                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                                i = c5 - 'W';
                                                            } else {
/* 207 */                                                       if (c5 < 'A' || c5 > 'F') {
                                                                    break loop0;
                                                                }
                                                                i = c5 - '7';
                                                            }
/* 193 */                                                   i13 = i + i14;
/* 216 */                                                   i11++;
                                                        }
                                                        this.I00iio += 4;
/* 241 */                                               c3 = (char) i13;
                                                    }
                                                }
                                            }
/* 277 */                                   sb.append(c3);
/* 280 */                                   i4 = this.I00iio;
/* 282 */                                   i3 = this.I00ilI0I1;
/* 284 */                                   i2 = i4;
                                        }
/* 276 */                               c3 = c4;
/* 277 */                               sb.append(c3);
/* 280 */                               i4 = this.I00iio;
/* 282 */                               i3 = this.I00ilI0I1;
/* 284 */                               i2 = i4;
                                    }
                                } else {
/* 263 */                           if (this.I00iiI == 3) {
/* 295 */                               I00100l0("Cannot escape a newline character in strict mode");
/* 298 */                               throw null;
                                    }
                                    this.I00ilO0++;
/* 270 */                           this.I00io1l = i10;
                                }
/* 274 */                       if (this.I00iiI == 3) {
/* 289 */                           I00100l0("Invalid escaped character \"'\" in strict mode");
/* 292 */                           throw null;
                                }
/* 276 */                       c3 = c4;
/* 277 */                       sb.append(c3);
/* 280 */                       i4 = this.I00iio;
/* 282 */                       i3 = this.I00ilI0I1;
/* 284 */                       i2 = i4;
                            } else {
/* 299 */                       if (c2 == '\n') {
                                    this.I00ilO0++;
/* 306 */                           this.I00io1l = i5;
                                }
/* 308 */                       i2 = i5;
                            }
                        }
/* 336 */           } while (I00OIl(1));
/* 342 */           I00100l0("Unterminated string");
/* 437 */           throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
                
                    I00IioO0OiOi();
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00IOO() {
                    char[] cArr;
                    String string;
/* 1 */             int i = 0;
/* 2 */             StringBuilder sb = null;
/* 120 */           do {
/* 3 */                 int i2 = 0;
                        while (true) {
/* 6 */                     int i3 = this.I00iio + i2;
/* 7 */                     int i4 = this.I00ilI0I1;
/* 9 */                     cArr = this.I00iiO;
/* 11 */                    if (i3 < i4) {
/* 13 */                        char c = cArr[i3];
/* 17 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 37 */                            if (c != '#') {
/* 41 */                                if (c != ',') {
/* 45 */                                    if (c != '/' && c != '=') {
/* 53 */                                        if (c != '{' && c != '}' && c != ':') {
/* 65 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 70 */                                                        i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i2 >= 1024) {
/* 92 */                        if (sb == null) {
/* 102 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 107 */                       sb.append(cArr, this.I00iio, i2);
                                this.I00iio += i2;
                            } else if (I00OIl(i2 + 1)) {
                            }
                        }
/* 90 */                i = i2;
/* 122 */               int i5 = this.I00iio;
/* 124 */               if (sb != null) {
/* 128 */                   string = new String(cArr, i5, i);
                        } else {
/* 132 */                   sb.append(cArr, i5, i);
/* 135 */                   string = sb.toString();
                        }
                        this.I00iio += i;
/* 144 */               return string;
/* 120 */           } while (I00OIl(1));
/* 122 */           int i52 = this.I00iio;
/* 124 */           if (sb != null) {
                    }
                    this.I00iio += i;
/* 144 */           return string;
                }

                public final void I00IioO0OiOi() throws ilOoOOOlll1 {
/* 4 */             if (this.I00iiI == 1) {
/* 6 */                 return;
                    }
/* 9 */             I00100l0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
/* 20 */            throw null;
                }

                public final void I00Io1lO(int i) {
/* 1 */             int i2 = this.I00ll1;
/* 7 */             if (i2 - 1 >= 1280) {
/* 77 */                throw new ilOoOOOlll1("Nesting limit 1280 reached".concat(I0000Il00O()));
                    }
/* 9 */             int[] iArr = this.I00li1OI;
/* 12 */            if (i2 == iArr.length) {
/* 14 */                int i3 = i2 + i2;
/* 19 */                this.I00li1OI = Arrays.copyOf(iArr, i3);
/* 27 */                this.I00lll10 = Arrays.copyOf(this.I00lll10, i3);
/* 37 */                this.I00lli11 = (String[]) Arrays.copyOf(this.I00lli11, i3);
                    }
/* 39 */            int[] iArr2 = this.I00li1OI;
/* 41 */            int i4 = this.I00ll1;
/* 45 */            this.I00ll1 = i4 + 1;
/* 47 */            iArr2[i4] = i;
                }

                public final void I00IoiI() {
                    char c;
/* 38 */            do {
/* 6 */                 if (this.I00iio >= this.I00ilI0I1 && !I00OIl(1)) {
/* 55 */                    return;
                        }
/* 14 */                int i = this.I00iio;
/* 16 */                int i2 = i + 1;
/* 18 */                this.I00iio = i2;
/* 22 */                c = this.I00iiO[i];
/* 26 */                if (c == '\n') {
                            this.I00ilO0++;
/* 33 */                    this.I00io1l = i2;
/* 35 */                    return;
                        }
/* 38 */            } while (c != '\r');
                }

                public final boolean I00OIl(int i) throws IOException {
                    int i2;
/* 1 */             int i3 = this.I00io1l;
/* 3 */             int i4 = this.I00iio;
/* 6 */             this.I00io1l = i3 - i4;
/* 8 */             int i5 = this.I00ilI0I1;
/* 11 */            char[] cArr = this.I00iiO;
/* 13 */            if (i5 != i4) {
/* 15 */                int i6 = i5 - i4;
/* 16 */                this.I00ilI0I1 = i6;
/* 18 */                System.arraycopy(cArr, i4, cArr, 0, i6);
                    } else {
/* 22 */                this.I00ilI0I1 = 0;
                    }
/* 24 */            this.I00iio = 0;
/* 71 */            do {
/* 26 */                int i7 = this.I00ilI0I1;
/* 32 */                int i8 = this.I00iOIl.read(cArr, i7, 1024 - i7);
/* 37 */                if (i8 == -1) {
/* 10 */                    return false;
                        }
/* 41 */                i2 = this.I00ilI0I1 + i8;
/* 42 */                this.I00ilI0I1 = i2;
/* 47 */                if (this.I00ilO0 == 0 && this.I00io1l == 0 && i2 > 0 && cArr[0] == 65279) {
                            this.I00iio++;
/* 67 */                    this.I00io1l = 1;
/* 69 */                    i++;
                        }
/* 71 */            } while (i2 < i);
/* 46 */            return true;
                }

                public final boolean I00OOll1(char c) throws ilOoOOOlll1 {
/* 3 */             if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
/* 61 */                return false;
                    }
/* 23 */            if (c != '#') {
/* 27 */                if (c == ',') {
/* 61 */                    return false;
                        }
/* 31 */                if (c != '/' && c != '=') {
/* 39 */                    if (c == '{' || c == '}' || c == ':') {
/* 61 */                        return false;
                            }
/* 51 */                    if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
/* 61 */                                return false;
                                    case '\\':
                                        break;
                                    default:
/* 56 */                                return true;
                                }
                            }
                        }
                    }
/* 58 */            I00IioO0OiOi();
/* 61 */            return false;
                }

                @Override
                public final void close() throws IOException {
/* 2 */             this.I00ioIO = 0;
/* 8 */             this.I00li1OI[0] = 8;
/* 11 */            this.I00ll1 = 1;
/* 15 */            this.I00iOIl.close();
                }

                public final String toString() {
/* 11 */            return ilOiIllI.class.getSimpleName().concat(I0000Il00O());
                }
            }
