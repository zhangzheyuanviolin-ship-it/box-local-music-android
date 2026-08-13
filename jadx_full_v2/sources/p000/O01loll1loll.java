            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.StringReader;
            import java.util.Arrays;
            
            public class O01loll1loll implements Closeable {
                public final StringReader I00iOIl;
                public long I00ioIO;
                public int I00l0I0l0lO1;
                public String I00l0OO0IO;
                public int[] I00li1OI;
                public String[] I00lli11;
                public int[] I00lll10;
                public int I00o0iI0io1 = 2;
                public final char[] I00iiI = new char[Barcode.FORMAT_UPC_E];
                public int I00iiO = 0;
                public int I00iio = 0;
                public int I00ilI0I1 = 0;
                public int I00ilO0 = 0;
                public int I00io1l = 0;
                public int I00ll1 = 1;

                static {
/* 8 */             looil0O1Io1.I00l0I0l0lO1 = new looil0O1Io1(12);
                }

                public O01loll1loll(StringReader stringReader) {
/* 26 */            int[] iArr = new int[32];
/* 28 */            this.I00li1OI = iArr;
/* 34 */            iArr[0] = 6;
/* 38 */            this.I00lli11 = new String[32];
/* 42 */            this.I00lll10 = new int[32];
/* 44 */            this.I00iOIl = stringReader;
                }

                public final void I00000oIO() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 10 */            if (iI000O01llI0 != 3) {
/* 55 */                throw I0100o111I("BEGIN_ARRAY");
                    }
/* 13 */            I00o0iI0io1(1);
/* 22 */            this.I00lll10[this.I00ll1 - 1] = 0;
/* 24 */            this.I00io1l = 0;
                }

                public final void I0000Il00O() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 10 */            if (iI000O01llI0 != 1) {
/* 55 */                throw I0100o111I("BEGIN_OBJECT");
                    }
/* 13 */            I00o0iI0io1(3);
/* 17 */            this.I00io1l = 0;
                }

                public final void I000II() throws O1OIO1Ill0 {
/* 4 */             if (this.I00o0iI0io1 == 1) {
/* 6 */                 return;
                    }
/* 9 */             I0100i("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
/* 20 */            throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:145:0x01cd, code lost:
                
                    r24 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
                
                    if (I00IioO0OiOi(r14) != false) goto L125;
                 */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x027e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:214:0x027f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0() throws IOException {
                    int iI00iiI;
                    int i;
                    String str;
                    String str2;
                    int i2;
                    int i3;
                    char c;
                    char c2;
                    long j;
                    int i4;
/* 3 */             int[] iArr = this.I00li1OI;
/* 7 */             boolean z = true;
/* 8 */             int i5 = this.I00ll1 - 1;
/* 9 */             int i6 = iArr[i5];
/* 25 */            char[] cArr = this.I00iiI;
/* 32 */            if (i6 == 1) {
/* 34 */                iArr[i5] = 2;
                    } else if (i6 == 2) {
/* 40 */                int iI00iiI2 = I00iiI(true);
/* 44 */                if (iI00iiI2 != 44) {
/* 46 */                    if (iI00iiI2 != 59) {
/* 48 */                        if (iI00iiI2 == 93) {
/* 50 */                            this.I00io1l = 4;
/* 27 */                            return 4;
                                }
/* 55 */                        I0100i("Unterminated array");
/* 58 */                        throw null;
                            }
/* 59 */                    I000II();
                        }
                    } else {
/* 66 */                if (i6 == 3 || i6 == 5) {
/* 724 */                   iArr[i5] = 4;
/* 726 */                   if (i6 == 5 && (iI00iiI = I00iiI(true)) != 44) {
/* 735 */                       if (iI00iiI != 59) {
/* 737 */                           if (iI00iiI == 125) {
/* 740 */                               this.I00io1l = 2;
/* 739 */                               return 2;
                                    }
/* 745 */                           I0100i("Unterminated object");
/* 748 */                           throw null;
                                }
/* 749 */                       I000II();
                            }
/* 753 */                   int iI00iiI3 = I00iiI(true);
/* 759 */                   if (iI00iiI3 == 34) {
/* 811 */                       this.I00io1l = 13;
/* 809 */                       return 13;
                            }
/* 761 */                   if (iI00iiI3 == 39) {
/* 801 */                       I000II();
/* 806 */                       this.I00io1l = 12;
/* 804 */                       return 12;
                            }
/* 765 */                   if (iI00iiI3 == 125) {
/* 791 */                       if (i6 != 5) {
/* 794 */                           this.I00io1l = 2;
/* 793 */                           return 2;
                                }
/* 797 */                       I0100i("Expected name");
/* 800 */                       throw null;
                            }
/* 767 */                   I000II();
                            this.I00iiO--;
/* 780 */                   if (I00IioO0OiOi((char) iI00iiI3)) {
/* 784 */                       this.I00io1l = 14;
/* 782 */                       return 14;
                            }
/* 787 */                   I0100i("Expected name");
/* 790 */                   throw null;
                        }
/* 74 */                if (i6 == 4) {
/* 76 */                    iArr[i5] = 5;
/* 78 */                    int iI00iiI4 = I00iiI(true);
/* 84 */                    if (iI00iiI4 != 58) {
/* 88 */                        if (iI00iiI4 != 61) {
/* 120 */                           I0100i("Expected ':'");
/* 123 */                           throw null;
                                }
/* 90 */                        I000II();
/* 97 */                        if (this.I00iiO < this.I00iio || I001i1lo1io(1)) {
/* 105 */                           int i7 = this.I00iiO;
/* 111 */                           if (cArr[i7] == '>') {
/* 114 */                               this.I00iiO = i7 + 1;
                                    }
                                }
                            }
                        } else if (i6 == 6) {
/* 128 */                   if (this.I00o0iI0io1 == 1) {
/* 130 */                       I00iiI(true);
/* 133 */                       int i8 = this.I00iiO;
/* 137 */                       this.I00iiO = i8 - 1;
/* 143 */                       if (i8 + 4 <= this.I00iio || I001i1lo1io(5)) {
/* 152 */                           int i9 = this.I00iiO;
/* 158 */                           if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
/* 186 */                               this.I00iiO = i9 + 5;
                                    }
                                }
                            }
/* 193 */                   this.I00li1OI[this.I00ll1 - 1] = 7;
                        } else if (i6 == 7) {
/* 206 */                   if (I00iiI(false) == -1) {
/* 210 */                       this.I00io1l = 17;
/* 208 */                       return 17;
                            }
/* 213 */                   I000II();
                            this.I00iiO--;
                        } else if (i6 == 8) {
/* 718 */                   I000II.I001IO000("JsonReader is closed");
/* 721 */                   return 0;
                        }
                    }
/* 226 */           int iI00iiI5 = I00iiI(true);
/* 232 */           if (iI00iiI5 == 34) {
/* 713 */               this.I00io1l = 9;
/* 711 */               return 9;
                    }
/* 234 */           if (iI00iiI5 == 39) {
/* 703 */               I000II();
/* 708 */               this.I00io1l = 8;
/* 706 */               return 8;
                    }
/* 236 */           if (iI00iiI5 == 44 || iI00iiI5 == 59) {
/* 678 */               i = 1;
                    } else {
/* 242 */               if (iI00iiI5 == 91) {
/* 675 */                   this.I00io1l = 3;
/* 22 */                    return 3;
                        }
/* 244 */               if (iI00iiI5 == 93) {
/* 668 */                   i = 1;
/* 669 */                   if (i6 == 1) {
/* 672 */                       this.I00io1l = 4;
/* 671 */                       return 4;
                            }
                        } else {
/* 248 */                   if (iI00iiI5 == 123) {
/* 665 */                       this.I00io1l = 1;
/* 7 */                         return 1;
                            }
/* 252 */                   int i10 = this.I00iiO - 1;
/* 253 */                   this.I00iiO = i10;
/* 255 */                   char c3 = cArr[i10];
/* 259 */                   if (c3 == 't' || c3 == 'T') {
/* 299 */                       str = "true";
/* 301 */                       str2 = "TRUE";
/* 303 */                       i2 = 5;
                            } else if (c3 == 'f' || c3 == 'F') {
/* 293 */                       str = "false";
/* 295 */                       str2 = "FALSE";
/* 297 */                       i2 = 6;
                            } else {
/* 277 */                       if (c3 == 'n' || c3 == 'N') {
/* 287 */                           str = "null";
/* 289 */                           str2 = "NULL";
/* 291 */                           i2 = 7;
                                }
/* 284 */                       i3 = 0;
/* 387 */                       if (i3 == 0) {
/* 389 */                           return i3;
                                }
/* 390 */                       int i11 = this.I00iiO;
/* 392 */                       int i12 = this.I00iio;
/* 395 */                       boolean z2 = true;
/* 396 */                       int i13 = 0;
/* 397 */                       long j2 = 0;
/* 399 */                       boolean z3 = false;
/* 400 */                       char c4 = 0;
                                while (true) {
/* 405 */                           if (i11 + i13 == i12) {
/* 408 */                               if (i13 == cArr.length) {
                                            break;
                                        }
/* 419 */                               if (!I001i1lo1io(i13 + 1)) {
/* 421 */                                   j = j2;
                                            break;
                                        }
/* 426 */                               i11 = this.I00iiO;
/* 428 */                               i12 = this.I00iio;
/* 432 */                               c2 = cArr[i11 + i13];
/* 436 */                               if (c2 != '+') {
                                        }
                                    } else {
/* 432 */                               c2 = cArr[i11 + i13];
/* 436 */                               if (c2 != '+') {
/* 627 */                                   if (c4 != 5) {
                                                break;
                                            }
/* 617 */                                   c4 = 6;
/* 630 */                                   i13++;
/* 632 */                                   z = true;
                                        } else if (c2 == 'E' || c2 == 'e') {
/* 620 */                                   if (c4 != 2 && c4 != 4) {
                                                break;
                                            }
/* 625 */                                   c4 = 5;
/* 630 */                                   i13++;
/* 632 */                                   z = true;
                                        } else if (c2 != '-') {
/* 452 */                                   if (c2 == '.') {
/* 605 */                                       if (c4 != 2) {
                                                    break;
                                                }
/* 607 */                                       c4 = 3;
/* 630 */                                       i13++;
/* 632 */                                       z = true;
                                            } else {
/* 456 */                                       if (c2 < '0' || c2 > '9') {
                                                    break;
                                                }
/* 465 */                                       if (c4 == z || c4 == 0) {
/* 538 */                                           j2 = -(c2 - '0');
/* 540 */                                           c4 = 2;
                                                } else if (c4 != 2) {
/* 513 */                                           long j3 = j2;
/* 515 */                                           if (c4 == 3) {
/* 517 */                                               j2 = j3;
/* 519 */                                               c4 = 4;
                                                    } else if (c4 == 5 || c4 == 6) {
/* 531 */                                               j2 = j3;
/* 533 */                                               c4 = 7;
                                                    } else {
/* 527 */                                               j2 = j3;
                                                    }
                                                } else {
/* 475 */                                           if (j2 == 0) {
                                                        break;
                                                    }
/* 484 */                                           long j4 = j2;
/* 487 */                                           long j5 = (10 * j2) - (c2 - '0');
/* 508 */                                           z2 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
/* 509 */                                           j2 = j5;
                                                }
/* 630 */                                       i13++;
/* 632 */                                       z = true;
                                            }
                                        } else if (c4 == 0) {
/* 612 */                                   z3 = true;
/* 613 */                                   c4 = 1;
/* 630 */                                   i13++;
/* 632 */                                   z = true;
                                        } else {
/* 615 */                                   if (c4 != 5) {
                                                break;
                                            }
/* 617 */                                   c4 = 6;
/* 630 */                                   i13++;
/* 632 */                                   z = true;
                                        }
                                    }
/* 637 */                           if (i4 == 0) {
/* 639 */                               return i4;
                                    }
/* 648 */                           if (!I00IioO0OiOi(cArr[this.I00iiO])) {
/* 660 */                               I0100i("Expected value");
/* 663 */                               throw null;
                                    }
/* 650 */                           I000II();
/* 655 */                           this.I00io1l = 10;
/* 653 */                           return 10;
                                }
/* 423 */                       char c5 = 2;
/* 550 */                       if (c4 != 2) {
/* 589 */                           if (c4 != c5 || c4 == 4 || c4 == 7) {
/* 597 */                               this.I00l0I0l0lO1 = i13;
/* 599 */                               i4 = 16;
/* 601 */                               this.I00io1l = 16;
                                    } else {
/* 410 */                               i4 = 0;
                                    }
                                } else if (!z2 || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
/* 563 */                           c5 = 2;
/* 589 */                           if (c4 != c5) {
                                    }
/* 597 */                           this.I00l0I0l0lO1 = i13;
/* 599 */                           i4 = 16;
/* 601 */                           this.I00io1l = 16;
                                } else {
/* 571 */                           long j6 = j;
/* 573 */                           if (!z3) {
/* 576 */                               j6 = -j6;
                                    }
/* 577 */                           this.I00ioIO = j6;
                                    this.I00iiO += i13;
/* 584 */                           i4 = 15;
/* 586 */                           this.I00io1l = 15;
                                }
/* 637 */                       if (i4 == 0) {
                                }
                            }
/* 310 */                   boolean z4 = this.I00o0iI0io1 != 3;
/* 311 */                   int length = str.length();
/* 315 */                   int i14 = 0;
                            while (true) {
/* 316 */                       int i15 = this.I00iiO;
/* 318 */                       int i16 = this.I00iio;
/* 320 */                       if (i14 < length) {
/* 323 */                           if ((i15 + i14 >= i16 && !I001i1lo1io(i14 + 1)) || ((c = cArr[this.I00iiO + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                                        break;
                                    }
/* 353 */                           i14++;
                                } else {
/* 357 */                           if ((i15 + length < i16 || I001i1lo1io(length + 1)) && I00IioO0OiOi(cArr[this.I00iiO + length])) {
                                        break;
                                    }
                                    this.I00iiO += length;
/* 384 */                           this.I00io1l = i2;
/* 386 */                           i3 = i2;
                                }
                            }
/* 284 */                   i3 = 0;
/* 387 */                   if (i3 == 0) {
                            }
                        }
                    }
/* 679 */           if (i6 != i && i6 != 2) {
/* 687 */               I0100i("Unexpected value");
/* 690 */               throw null;
                    }
/* 691 */           I000II();
                    this.I00iiO -= i;
/* 700 */           this.I00io1l = 7;
/* 699 */           return 7;
                }

                public final void I000l1() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 10 */            if (iI000O01llI0 != 4) {
/* 55 */                throw I0100o111I("END_ARRAY");
                    }
/* 12 */            int i = this.I00ll1;
/* 16 */            this.I00ll1 = i - 1;
/* 18 */            int[] iArr = this.I00lll10;
                    int i2 = i - 2;
/* 26 */            iArr[i2] = iArr[i2] + 1;
/* 29 */            this.I00io1l = 0;
                }

                public final void I00100l0() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 10 */            if (iI000O01llI0 != 2) {
/* 55 */                throw I0100o111I("END_OBJECT");
                    }
/* 12 */            int i = this.I00ll1;
                    int i2 = i - 1;
/* 16 */            this.I00ll1 = i2;
/* 21 */            this.I00lli11[i2] = null;
/* 23 */            int[] iArr = this.I00lll10;
/* 25 */            int i3 = i - 2;
/* 30 */            iArr[i3] = iArr[i3] + 1;
/* 33 */            this.I00io1l = 0;
                }

                public final boolean I001i1lo1io(int i) throws IOException {
                    int i2;
                    int i3;
/* 1 */             int i4 = this.I00ilO0;
/* 3 */             int i5 = this.I00iiO;
/* 6 */             this.I00ilO0 = i4 - i5;
/* 8 */             int i6 = this.I00iio;
/* 11 */            char[] cArr = this.I00iiI;
/* 13 */            if (i6 != i5) {
/* 15 */                int i7 = i6 - i5;
/* 16 */                this.I00iio = i7;
/* 18 */                System.arraycopy(cArr, i5, cArr, 0, i7);
                    } else {
/* 22 */                this.I00iio = 0;
                    }
/* 24 */            this.I00iiO = 0;
/* 73 */            do {
/* 26 */                int i8 = this.I00iio;
/* 32 */                int i9 = this.I00iOIl.read(cArr, i8, cArr.length - i8);
/* 37 */                if (i9 == -1) {
/* 10 */                    return false;
                        }
/* 41 */                i2 = this.I00iio + i9;
/* 42 */                this.I00iio = i2;
/* 47 */                if (this.I00ilI0I1 == 0 && (i3 = this.I00ilO0) == 0 && i2 > 0 && cArr[0] == 65279) {
                            this.I00iiO++;
/* 69 */                    this.I00ilO0 = i3 + 1;
/* 71 */                    i++;
                        }
/* 73 */            } while (i2 < i);
/* 46 */            return true;
                }

                public final String I001l0I00(boolean z) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 int i2 = this.I00ll1;
/* 11 */                if (i >= i2) {
/* 76 */                    return sb.toString();
                        }
/* 15 */                int i3 = this.I00li1OI[i];
                        switch (i3) {
                            case 1:
                            case 2:
/* 48 */                        int i4 = this.I00lll10[i];
/* 50 */                        if (z && i4 > 0 && i == i2 - 1) {
                                    i4--;
                                }
/* 62 */                        sb.append('[');
/* 65 */                        sb.append(i4);
/* 70 */                        sb.append(']');
                                break;
                            case 3:
                            case 4:
                            case 5:
/* 33 */                        sb.append('.');
/* 38 */                        String str = this.I00lli11[i];
/* 40 */                        if (str == null) {
                                    break;
                                } else {
/* 42 */                            sb.append(str);
                                    break;
                                }
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
/* 26 */                        I000II.I000O01llI0(Oi010OO0.I000oI1ioi(i3, "Unknown scope value: "));
/* 29 */                        return null;
                        }
/* 73 */                i++;
                    }
                }

                public final boolean I00IOO() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
                    return (iI000O01llI0 == 2 || iI000O01llI0 == 4 || iI000O01llI0 == 17) ? false : true;
                }

                public final boolean I00IioO0OiOi(char c) throws O1OIO1Ill0 {
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
/* 58 */            I000II();
/* 61 */            return false;
                }

                public final String I00Io1lO() {
/* 18 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i(" at line ", this.I00ilI0I1 + 1, " column ", (this.I00iiO - this.I00ilO0) + 1, " path ");
/* 27 */            sbI0010I0i.append(I001l0I00(false));
/* 30 */            return sbI0010I0i.toString();
                }

                public final boolean I00IoiI() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 12 */            if (iI000O01llI0 == 5) {
/* 14 */                this.I00io1l = 0;
/* 16 */                int[] iArr = this.I00lll10;
/* 20 */                int i = this.I00ll1 - 1;
/* 24 */                iArr[i] = iArr[i] + 1;
/* 11 */                return true;
                    }
/* 28 */            if (iI000O01llI0 != 6) {
/* 55 */                throw I0100o111I("a boolean");
                    }
/* 30 */            this.I00io1l = 0;
/* 32 */            int[] iArr2 = this.I00lll10;
/* 36 */            int i2 = this.I00ll1 - 1;
/* 40 */            iArr2[i2] = iArr2[i2] + 1;
/* 10 */            return false;
                }

                public final double I00OIl() throws IOException, NumberFormatException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 13 */            if (iI000O01llI0 == 15) {
/* 15 */                this.I00io1l = 0;
/* 17 */                int[] iArr = this.I00lll10;
/* 21 */                int i = this.I00ll1 - 1;
/* 25 */                iArr[i] = iArr[i] + 1;
/* 29 */                return this.I00ioIO;
                    }
/* 35 */            if (iI000O01llI0 == 16) {
/* 48 */                this.I00l0OO0IO = new String(this.I00iiI, this.I00iiO, this.I00l0I0l0lO1);
                        this.I00iiO += this.I00l0I0l0lO1;
                    } else if (iI000O01llI0 == 8 || iI000O01llI0 == 9) {
/* 99 */                this.I00l0OO0IO = I00l0I0l0lO1(iI000O01llI0 == 8 ? '\'' : '\"');
                    } else if (iI000O01llI0 == 10) {
/* 75 */                this.I00l0OO0IO = I00lll10();
                    } else if (iI000O01llI0 != 11) {
/* 87 */                throw I0100o111I("a double");
                    }
/* 101 */           this.I00io1l = 11;
/* 105 */           double d = Double.parseDouble(this.I00l0OO0IO);
/* 112 */           if (this.I00o0iI0io1 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 141 */               I0100i("JSON forbids NaN and infinities: " + d);
/* 144 */               throw null;
                    }
/* 145 */           this.I00l0OO0IO = null;
/* 147 */           this.I00io1l = 0;
/* 149 */           int[] iArr2 = this.I00lll10;
/* 153 */           int i2 = this.I00ll1 - 1;
/* 157 */           iArr2[i2] = iArr2[i2] + 1;
/* 245 */           return d;
                }

                public final int I00OOll1() throws IOException, NumberFormatException {
                    String strI00l0I0l0lO1;
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 14 */            if (iI000O01llI0 == 15) {
/* 16 */                long j = this.I00ioIO;
/* 18 */                int i = (int) j;
/* 22 */                if (j == i) {
/* 24 */                    this.I00io1l = 0;
/* 26 */                    int[] iArr = this.I00lll10;
                            int i2 = this.I00ll1 - 1;
/* 36 */                    iArr[i2] = iArr[i2] + 1;
/* 38 */                    return i;
                        }
/* 65 */                throw new NumberFormatException("Expected an int but was " + this.I00ioIO + I00Io1lO());
                    }
/* 68 */            if (iI000O01llI0 == 16) {
/* 81 */                this.I00l0OO0IO = new String(this.I00iiI, this.I00iiO, this.I00l0I0l0lO1);
                        this.I00iiO += this.I00l0I0l0lO1;
                    } else {
/* 95 */                if (iI000O01llI0 != 8 && iI000O01llI0 != 9 && iI000O01llI0 != 10) {
/* 110 */                   throw I0100o111I("an int");
                        }
/* 111 */               if (iI000O01llI0 == 10) {
/* 113 */                   strI00l0I0l0lO1 = I00lll10();
/* 117 */                   this.I00l0OO0IO = strI00l0I0l0lO1;
                        } else {
/* 127 */                   strI00l0I0l0lO1 = I00l0I0l0lO1(iI000O01llI0 == 8 ? '\'' : '\"');
/* 131 */                   this.I00l0OO0IO = strI00l0I0l0lO1;
                        }
/* 133 */               I010101Oo1lO(strI00l0I0l0lO1);
                        try {
/* 138 */                   int i3 = Integer.parseInt(this.I00l0OO0IO);
/* 142 */                   this.I00io1l = 0;
/* 144 */                   int[] iArr2 = this.I00lll10;
                            int i4 = this.I00ll1 - 1;
/* 154 */                   iArr2[i4] = iArr2[i4] + 1;
/* 156 */                   return i3;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 159 */           this.I00io1l = 11;
/* 163 */           double d = Double.parseDouble(this.I00l0OO0IO);
/* 167 */           int i5 = (int) d;
/* 171 */           if (i5 == d) {
/* 174 */               this.I00l0OO0IO = null;
/* 176 */               this.I00io1l = 0;
/* 178 */               int[] iArr3 = this.I00lll10;
                        int i6 = this.I00ll1 - 1;
/* 188 */               iArr3[i6] = iArr3[i6] + 1;
/* 190 */               return i5;
                    }
/* 245 */           throw new NumberFormatException("Expected an int but was " + this.I00l0OO0IO + I00Io1lO());
                }

                public final long I00Ol00() throws IOException, NumberFormatException {
                    String strI00l0I0l0lO1;
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 12 */            if (iI000O01llI0 == 15) {
/* 14 */                this.I00io1l = 0;
/* 16 */                int[] iArr = this.I00lll10;
                        int i = this.I00ll1 - 1;
/* 26 */                iArr[i] = iArr[i] + 1;
/* 28 */                return this.I00ioIO;
                    }
/* 33 */            if (iI000O01llI0 == 16) {
/* 46 */                this.I00l0OO0IO = new String(this.I00iiI, this.I00iiO, this.I00l0I0l0lO1);
                        this.I00iiO += this.I00l0I0l0lO1;
                    } else {
/* 60 */                if (iI000O01llI0 != 8 && iI000O01llI0 != 9 && iI000O01llI0 != 10) {
/* 75 */                    throw I0100o111I("a long");
                        }
/* 76 */                if (iI000O01llI0 == 10) {
/* 78 */                    strI00l0I0l0lO1 = I00lll10();
/* 82 */                    this.I00l0OO0IO = strI00l0I0l0lO1;
                        } else {
/* 92 */                    strI00l0I0l0lO1 = I00l0I0l0lO1(iI000O01llI0 == 8 ? '\'' : '\"');
/* 96 */                    this.I00l0OO0IO = strI00l0I0l0lO1;
                        }
/* 98 */                I010101Oo1lO(strI00l0I0l0lO1);
                        try {
/* 103 */                   long j = Long.parseLong(this.I00l0OO0IO);
/* 107 */                   this.I00io1l = 0;
/* 109 */                   int[] iArr2 = this.I00lll10;
                            int i2 = this.I00ll1 - 1;
/* 119 */                   iArr2[i2] = iArr2[i2] + 1;
/* 121 */                   return j;
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 124 */           this.I00io1l = 11;
/* 128 */           double d = Double.parseDouble(this.I00l0OO0IO);
/* 132 */           long j2 = (long) d;
/* 136 */           if (j2 == d) {
/* 139 */               this.I00l0OO0IO = null;
/* 141 */               this.I00io1l = 0;
/* 143 */               int[] iArr3 = this.I00lll10;
                        int i3 = this.I00ll1 - 1;
/* 153 */               iArr3[i3] = iArr3[i3] + 1;
/* 155 */               return j2;
                    }
/* 245 */           throw new NumberFormatException("Expected a long but was " + this.I00l0OO0IO + I00Io1lO());
                }

                public final String I00iOIl() throws IOException {
                    String strI00l0I0l0lO1;
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 11 */            if (iI000O01llI0 == 14) {
/* 13 */                strI00l0I0l0lO1 = I00lll10();
                    } else if (iI000O01llI0 == 12) {
/* 24 */                strI00l0I0l0lO1 = I00l0I0l0lO1('\'');
                    } else {
/* 31 */                if (iI000O01llI0 != 13) {
/* 110 */                   throw I0100o111I("a name");
                        }
/* 35 */                strI00l0I0l0lO1 = I00l0I0l0lO1('\"');
                    }
/* 40 */            this.I00io1l = 0;
/* 48 */            this.I00lli11[this.I00ll1 - 1] = strI00l0I0l0lO1;
/* 50 */            return strI00l0I0l0lO1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
                
                    return r5;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00iiI(boolean z) throws IOException {
/* 1 */             int i = this.I00iiO;
/* 3 */             int i2 = this.I00iio;
                    while (true) {
/* 6 */                 if (i == i2) {
/* 8 */                     this.I00iiO = i;
/* 14 */                    if (!I001i1lo1io(1)) {
/* 16 */                        if (z) {
/* 35 */                            throw new EOFException("End of input".concat(I00Io1lO()));
                                }
/* 18 */                        return -1;
                            }
/* 36 */                    i = this.I00iiO;
/* 38 */                    i2 = this.I00iio;
                        }
/* 40 */                int i3 = i + 1;
/* 42 */                char[] cArr = this.I00iiI;
/* 44 */                char c = cArr[i];
/* 48 */                if (c == '\n') {
                            this.I00ilI0I1++;
/* 55 */                    this.I00ilO0 = i3;
                        } else if (c != ' ' && c != '\r' && c != '\t') {
/* 75 */                    if (c == '/') {
/* 77 */                        this.I00iiO = i3;
/* 80 */                        if (i3 == i2) {
/* 82 */                            this.I00iiO = i;
/* 84 */                            boolean zI001i1lo1io = I001i1lo1io(2);
                                    this.I00iiO++;
/* 93 */                            if (!zI001i1lo1io) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
/* 96 */                        I000II();
/* 99 */                        int i4 = this.I00iiO;
/* 101 */                       char c2 = cArr[i4];
/* 105 */                       if (c2 == '*') {
/* 124 */                           this.I00iiO = i4 + 1;
                                    while (true) {
/* 131 */                               if (this.I00iiO + 2 > this.I00iio && !I001i1lo1io(2)) {
/* 142 */                                   I0100i("Unterminated comment");
/* 146 */                                   throw null;
                                        }
/* 147 */                               int i5 = this.I00iiO;
/* 151 */                               if (cArr[i5] != '\n') {
/* 163 */                                   int i6 = 0;
                                            while (true) {
/* 164 */                                       int i7 = this.I00iiO;
/* 166 */                                       if (i6 >= 2) {
/* 188 */                                           i = i7 + 2;
/* 190 */                                           i2 = this.I00iio;
                                                    break;
                                                }
/* 177 */                                       if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                                    break;
                                                }
/* 185 */                                       i6++;
                                            }
                                        } else {
                                            this.I00ilI0I1++;
/* 160 */                                   this.I00ilO0 = i5 + 1;
                                        }
                                        this.I00iiO++;
                                    }
                                } else {
/* 107 */                           if (c2 != '/') {
                                        break;
                                    }
/* 112 */                           this.I00iiO = i4 + 1;
/* 114 */                           I00ooIo0();
/* 117 */                           i = this.I00iiO;
/* 119 */                           i2 = this.I00iio;
                                }
                            } else {
/* 196 */                       if (c != '#') {
/* 212 */                           this.I00iiO = i3;
/* 214 */                           return c;
                                }
/* 198 */                       this.I00iiO = i3;
/* 200 */                       I000II();
/* 203 */                       I00ooIo0();
/* 206 */                       i = this.I00iiO;
/* 208 */                       i2 = this.I00iio;
                            }
                        }
/* 215 */               i = i3;
                    }
                }

                public final void I00ioIO() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 10 */            if (iI000O01llI0 != 7) {
/* 55 */                throw I0100o111I("null");
                    }
/* 13 */            this.I00io1l = 0;
/* 15 */            int[] iArr = this.I00lll10;
                    int i = this.I00ll1 - 1;
/* 25 */            iArr[i] = iArr[i] + 1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
                
                    r11.I00iiO = r8;
                    r8 = r8 - r3;
                    r2 = r8 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
                
                    if (r1 != null) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
                
                    r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
                
                    if (r1 != null) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
                
                    r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
                
                    r1.append(r7, r3, r2 - r3);
                    r11.I00iiO = r2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00l0I0l0lO1(char c) throws O1OIO1Ill0 {
                    char[] cArr;
                    int i;
/* 2 */             StringBuilder sb = null;
/* 135 */           do {
/* 3 */                 int i2 = this.I00iiO;
/* 5 */                 int i3 = this.I00iio;
                        while (true) {
/* 7 */                     int i4 = i3;
/* 8 */                     int i5 = i2;
                            while (true) {
/* 12 */                        cArr = this.I00iiI;
/* 14 */                        if (i2 >= i4) {
                                    break;
                                }
/* 16 */                        int i6 = i2 + 1;
/* 18 */                        char c2 = cArr[i2];
/* 23 */                        if (this.I00o0iI0io1 == 3 && c2 < ' ') {
/* 32 */                            I0100i("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
/* 35 */                            throw null;
                                }
/* 36 */                        if (c2 == c) {
/* 38 */                            this.I00iiO = i6;
/* 41 */                            int i7 = (i6 - i5) - 1;
/* 42 */                            if (sb == null) {
/* 46 */                                return new String(cArr, i5, i7);
                                    }
/* 50 */                            sb.append(cArr, i5, i7);
/* 53 */                            return sb.toString();
                                }
/* 60 */                        if (c2 == '\\') {
                                    break;
                                }
/* 97 */                        if (c2 == '\n') {
                                    this.I00ilI0I1++;
/* 104 */                           this.I00ilO0 = i6;
                                }
/* 106 */                       i2 = i6;
                            }
/* 80 */                    sb.append(cArr, i5, i);
/* 87 */                    sb.append(I00oII());
/* 90 */                    i2 = this.I00iiO;
/* 92 */                    i3 = this.I00iio;
                        }
/* 135 */           } while (I001i1lo1io(1));
/* 141 */           I0100i("Unterminated string");
/* 168 */           throw null;
                }

                public final String I00lli11() {
                    String str;
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
/* 11 */            if (iI000O01llI0 == 10) {
/* 13 */                str = I00lll10();
                    } else if (iI000O01llI0 == 8) {
/* 24 */                str = I00l0I0l0lO1('\'');
                    } else if (iI000O01llI0 == 9) {
/* 35 */                str = I00l0I0l0lO1('\"');
                    } else if (iI000O01llI0 == 11) {
/* 44 */                str = this.I00l0OO0IO;
/* 47 */                this.I00l0OO0IO = null;
                    } else if (iI000O01llI0 == 15) {
/* 56 */                str = Long.toString(this.I00ioIO);
                    } else {
/* 63 */                if (iI000O01llI0 != 16) {
/* 110 */                   throw I0100o111I("a string");
                        }
/* 73 */                str = new String(this.I00iiI, this.I00iiO, this.I00l0I0l0lO1);
                        this.I00iiO += this.I00l0I0l0lO1;
                    }
/* 84 */            this.I00io1l = 0;
/* 86 */            int[] iArr = this.I00lll10;
                    int i = this.I00ll1 - 1;
/* 96 */            iArr[i] = iArr[i] + 1;
/* 98 */            return str;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
                
                    I000II();
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00lll10() throws O1OIO1Ill0 {
                    char[] cArr;
                    String string;
/* 1 */             StringBuilder sb = null;
/* 2 */             int i = 0;
/* 119 */           do {
/* 3 */                 int i2 = 0;
                        while (true) {
/* 6 */                     int i3 = this.I00iiO + i2;
/* 7 */                     int i4 = this.I00iio;
/* 9 */                     cArr = this.I00iiI;
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
                            } else if (i2 >= cArr.length) {
/* 91 */                        if (sb == null) {
/* 101 */                           sb = new StringBuilder(Math.max(i2, 16));
                                }
/* 106 */                       sb.append(cArr, this.I00iiO, i2);
                                this.I00iiO += i2;
                            } else if (I001i1lo1io(i2 + 1)) {
                            }
                        }
/* 89 */                i = i2;
/* 121 */               int i5 = this.I00iiO;
/* 123 */               if (sb != null) {
/* 127 */                   string = new String(cArr, i5, i);
                        } else {
/* 131 */                   sb.append(cArr, i5, i);
/* 134 */                   string = sb.toString();
                        }
                        this.I00iiO += i;
/* 143 */               return string;
/* 119 */           } while (I001i1lo1io(1));
/* 121 */           int i52 = this.I00iiO;
/* 123 */           if (sb != null) {
                    }
                    this.I00iiO += i;
/* 143 */           return string;
                }

                public final void I00o0iI0io1(int i) throws O1OIO1Ill0 {
/* 1 */             int i2 = this.I00ll1;
/* 7 */             if (i2 - 1 >= 255) {
/* 77 */                throw new O1OIO1Ill0("Nesting limit 255 reached".concat(I00Io1lO()));
                    }
/* 9 */             int[] iArr = this.I00li1OI;
/* 12 */            if (i2 == iArr.length) {
/* 14 */                int i3 = i2 * 2;
/* 20 */                this.I00li1OI = Arrays.copyOf(iArr, i3);
/* 28 */                this.I00lll10 = Arrays.copyOf(this.I00lll10, i3);
/* 38 */                this.I00lli11 = (String[]) Arrays.copyOf(this.I00lli11, i3);
                    }
/* 40 */            int[] iArr2 = this.I00li1OI;
/* 42 */            int i4 = this.I00ll1;
/* 46 */            this.I00ll1 = i4 + 1;
/* 48 */            iArr2[i4] = i;
                }

                public final char I00oII() throws O1OIO1Ill0 {
                    int i;
/* 9 */             if (this.I00iiO == this.I00iio && !I001i1lo1io(1)) {
/* 18 */                I0100i("Unterminated escape sequence");
/* 21 */                throw null;
                    }
/* 22 */            int i2 = this.I00iiO;
/* 24 */            int i3 = i2 + 1;
/* 26 */            this.I00iiO = i3;
/* 28 */            char[] cArr = this.I00iiI;
/* 30 */            char c = cArr[i2];
/* 35 */            if (c != '\n') {
/* 39 */                if (c != '\"') {
/* 43 */                    if (c != '\'') {
/* 47 */                        if (c != '/' && c != '\\') {
/* 55 */                            if (c == 'b') {
/* 182 */                               return '\b';
                                    }
/* 59 */                            if (c == 'f') {
/* 179 */                               return '\f';
                                    }
/* 63 */                            if (c == 'n') {
/* 33 */                                return '\n';
                                    }
/* 67 */                            if (c == 'r') {
/* 175 */                               return '\r';
                                    }
/* 71 */                            if (c == 't') {
/* 172 */                               return '\t';
                                    }
/* 75 */                            if (c != 'u') {
/* 168 */                               I0100i("Invalid escape sequence");
/* 171 */                               throw null;
                                    }
/* 82 */                            if (i2 + 5 > this.I00iio && !I001i1lo1io(4)) {
/* 91 */                                I0100i("Unterminated escape sequence");
/* 94 */                                throw null;
                                    }
/* 95 */                            int i4 = this.I00iiO;
/* 97 */                            int i5 = i4 + 4;
/* 99 */                            int i6 = 0;
/* 100 */                           while (i4 < i5) {
/* 102 */                               char c2 = cArr[i4];
/* 104 */                               int i7 = i6 << 4;
/* 108 */                               if (c2 >= '0' && c2 <= '9') {
                                            i = c2 - '0';
                                        } else if (c2 >= 'a' && c2 <= 'f') {
                                            i = c2 - 'W';
                                        } else {
/* 130 */                                   if (c2 < 'A' || c2 > 'F') {
/* 155 */                                       I0100i("Malformed Unicode escape \\u".concat(new String(cArr, this.I00iiO, 4)));
/* 158 */                                       throw null;
                                            }
                                            i = c2 - '7';
                                        }
/* 116 */                               i6 = i + i7;
/* 139 */                               i4++;
                                    }
                                    this.I00iiO += 4;
/* 164 */                           return (char) i6;
                                }
                            }
                        }
/* 200 */               return c;
                    }
/* 187 */           if (this.I00o0iI0io1 == 3) {
/* 209 */               I0100i("Cannot escape a newline character in strict mode");
/* 245 */               throw null;
                    }
                    this.I00ilI0I1++;
/* 194 */           this.I00ilO0 = i3;
/* 198 */           if (this.I00o0iI0io1 == 3) {
/* 203 */               I0100i("Invalid escaped character \"'\" in strict mode");
/* 206 */               throw null;
                    }
/* 200 */           return c;
                }

                public final void I00oliIiO01i(int i) {
/* 1 */             if (i == 0) {
/* 29 */                throw null;
                    }
/* 3 */             this.I00o0iI0io1 = i;
                }

                public final void I00oo1iO0ll(char c) throws O1OIO1Ill0 {
/* 52 */            do {
/* 1 */                 int i = this.I00iiO;
/* 3 */                 int i2 = this.I00iio;
/* 6 */                 while (i < i2) {
/* 8 */                     int i3 = i + 1;
/* 12 */                    char c2 = this.I00iiI[i];
/* 14 */                    if (c2 == c) {
/* 16 */                        this.I00iiO = i3;
/* 18 */                        return;
                            }
/* 21 */                    if (c2 == '\\') {
/* 23 */                        this.I00iiO = i3;
/* 25 */                        I00oII();
/* 28 */                        i = this.I00iiO;
/* 30 */                        i2 = this.I00iio;
                            } else {
/* 35 */                        if (c2 == '\n') {
                                    this.I00ilI0I1++;
/* 42 */                            this.I00ilO0 = i3;
                                }
/* 44 */                        i = i3;
                            }
                        }
/* 46 */                this.I00iiO = i;
/* 52 */            } while (I001i1lo1io(1));
/* 57 */            I0100i("Unterminated string");
/* 77 */            throw null;
                }

                public final void I00ooIo0() {
                    char c;
/* 38 */            do {
/* 6 */                 if (this.I00iiO >= this.I00iio && !I001i1lo1io(1)) {
/* 55 */                    return;
                        }
/* 14 */                int i = this.I00iiO;
/* 16 */                int i2 = i + 1;
/* 18 */                this.I00iiO = i2;
/* 22 */                c = this.I00iiI[i];
/* 26 */                if (c == '\n') {
                            this.I00ilI0I1++;
/* 33 */                    this.I00ilO0 = i2;
/* 35 */                    return;
                        }
/* 38 */            } while (c != '\r');
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
                
                    I000II();
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00ooiO1I() throws O1OIO1Ill0 {
/* 87 */            do {
/* 1 */                 int i = 0;
                        while (true) {
/* 4 */                     int i2 = this.I00iiO + i;
/* 7 */                     if (i2 < this.I00iio) {
/* 11 */                        char c = this.I00iiI[i2];
/* 15 */                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
/* 35 */                            if (c != '#') {
/* 39 */                                if (c != ',') {
/* 43 */                                    if (c != '/' && c != '=') {
/* 51 */                                        if (c != '{' && c != '}' && c != ':') {
/* 63 */                                            if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
/* 68 */                                                        i++;
                                                        }
/* 79 */                                                return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
/* 80 */                        this.I00iiO = i2;
                            }
                        }
                        this.I00iiO += i;
/* 79 */                return;
/* 87 */            } while (I001i1lo1io(1));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public final void I00oooO() throws IOException {
/* 2 */             int i = 0;
/* 119 */           do {
/* 3 */                 int iI000O01llI0 = this.I00io1l;
/* 5 */                 if (iI000O01llI0 == 0) {
/* 7 */                     iI000O01llI0 = I000O01llI0();
                        }
                        switch (iI000O01llI0) {
                            case 1:
/* 113 */                       I00o0iI0io1(3);
/* 93 */                        i++;
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 2:
/* 96 */                        if (i == 0) {
/* 104 */                           this.I00lli11[this.I00ll1 - 1] = null;
                                }
                                this.I00ll1--;
                                i--;
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 3:
/* 90 */                        I00o0iI0io1(1);
/* 93 */                        i++;
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 4:
                                this.I00ll1--;
                                i--;
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 11:
                            case 15:
                            default:
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 8:
/* 78 */                        I00oo1iO0ll('\'');
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 9:
/* 74 */                        I00oo1iO0ll('\"');
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 10:
/* 70 */                        I00ooiO1I();
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 12:
/* 57 */                        I00oo1iO0ll('\'');
/* 60 */                        if (i == 0) {
/* 67 */                            this.I00lli11[this.I00ll1 - 1] = "<skipped>";
                                }
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 13:
/* 44 */                        I00oo1iO0ll('\"');
/* 47 */                        if (i == 0) {
/* 54 */                            this.I00lli11[this.I00ll1 - 1] = "<skipped>";
                                }
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 14:
/* 31 */                        I00ooiO1I();
/* 34 */                        if (i == 0) {
/* 41 */                            this.I00lli11[this.I00ll1 - 1] = "<skipped>";
                                }
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 16:
                                this.I00iiO += this.I00l0I0l0lO1;
/* 117 */                       this.I00io1l = 0;
                                break;
                            case 17:
                                break;
                        }
/* 22 */                return;
/* 119 */           } while (i > 0);
/* 121 */           int[] iArr = this.I00lll10;
/* 125 */           int i2 = this.I00ll1 - 1;
/* 129 */           iArr[i2] = iArr[i2] + 1;
                }

                public final void I0100i(String str) throws O1OIO1Ill0 {
/* 77 */            throw new O1OIO1Ill0(str + I00Io1lO() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
                }

                public final IllegalStateException I0100o111I(String str) {
/* 12 */            String str2 = peek() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
/* 20 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Expected ", str, " but was ");
/* 32 */            sbI001IIilI0O.append(IlIi0I0.I001IO000(peek()));
/* 39 */            sbI001IIilI0O.append(I00Io1lO());
/* 44 */            sbI001IIilI0O.append("\nSee ");
/* 53 */            sbI001IIilI0O.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
/* 60 */            return new IllegalStateException(sbI001IIilI0O.toString());
                }

                public final void I010101Oo1lO(String str) throws O1OIO1Ill0 {
/* 6 */             for (int i = 0; i < str.length(); i++) {
/* 14 */                if (str.charAt(i) > 127) {
/* 25 */                    I0100i("String contains non-ASCII characters: ".concat(str));
/* 29 */                    throw null;
                        }
                    }
                }

                @Override
                public final void close() throws IOException {
/* 2 */             this.I00io1l = 0;
/* 8 */             this.I00li1OI[0] = 8;
/* 11 */            this.I00ll1 = 1;
/* 15 */            this.I00iOIl.close();
                }

                public final int peek() throws IOException {
/* 1 */             int iI000O01llI0 = this.I00io1l;
/* 3 */             if (iI000O01llI0 == 0) {
/* 5 */                 iI000O01llI0 = I000O01llI0();
                    }
                    switch (iI000O01llI0) {
                        case 1:
/* 38 */                    return 3;
                        case 2:
/* 36 */                    return 4;
                        case 3:
/* 34 */                    return 1;
                        case 4:
/* 32 */                    return 2;
                        case 5:
                        case 6:
/* 29 */                    return 8;
                        case 7:
/* 26 */                    return 9;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 24 */                    return 6;
                        case 12:
                        case 13:
                        case 14:
/* 22 */                    return 5;
                        case 15:
                        case 16:
/* 20 */                    return 7;
                        case 17:
/* 17 */                    return 10;
                        default:
/* 12 */                    OoOil11Ol1o.I0000Il00O();
/* 15 */                    return 0;
                    }
                }

                public final String toString() {
/* 11 */            return O01loll1loll.class.getSimpleName().concat(I00Io1lO());
                }
            }
